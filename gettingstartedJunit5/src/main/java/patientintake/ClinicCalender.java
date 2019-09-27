package patientintake;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.*;

import static java.time.format.DateTimeFormatter.*;

public class ClinicCalender {

    private List<PatientAppointment> appointments;

    public ClinicCalender() {

        this.appointments = new ArrayList<> ( );

    }

    public void addAppointment(String patientFirstName, String patientLastName, String doctorKey, String dateTime) {
        Doctor doc = Doctor.valueOf ( doctorKey.toLowerCase ( ) );
        LocalDateTime localDateTime;

        try{
        localDateTime = LocalDateTime.parse( dateTime.toUpperCase(),DateTimeFormatter.ofPattern (   "M/D/YYYY h:mm a", Locale.US ));

          } catch (Throwable t){
        throw new RuntimeException ( "Unable to create date time from : [" + dateTime.toUpperCase ( ) + "], Please enter with format [M/D/yyyy h:mm a]" );
          }
        PatientAppointment appointment = new PatientAppointment ( patientFirstName, patientLastName, localDateTime, doc );
        appointments.add ( appointment );

        }
        public List<PatientAppointment> getAppointments () {
            return this.appointments;
        }
    }

