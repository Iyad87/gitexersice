package com.mobiquityinc.packer;

import org.junit.jupiter.api.Test;

public class PackerTest {

    @Test
    public void testRunPacker() {
        ClassLoader classLoader = getClass ().getClassLoader ();
        String filePath = classLoader.getResource ( "Test.txt" ).getPath ();
        Packer.pack ( filePath );
    }
}
