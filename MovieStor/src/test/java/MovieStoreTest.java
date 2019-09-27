
import model.Movie;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class MovieStoreTest {
    @Test

    public void returnNothingWhenNoPartialMatches()  throws Exception {

        MovieStore movieStore = new MovieStore();
        List<Movie> results = movieStore.findByPartialTitle("abc");
        assertThat(results.size(), is (0));

     }
    @Test

    public void findMovieWhenNoPartialMatches()  throws Exception {

        MovieStore movieStore = new MovieStore();
        Movie TheTitanic = new Movie("The Titanic");
        movieStore.add(TheTitanic);


        movieStore.add(new Movie("Harry Potter"));
        movieStore.add(new Movie("Star War"));

        List<Movie> results = movieStore.findByPartialTitle("Titan");
        assertThat(results.size(), is(1));
        assertThat(results, contains(TheTitanic));

    }

}
