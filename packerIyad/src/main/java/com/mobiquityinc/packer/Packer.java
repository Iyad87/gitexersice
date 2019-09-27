package com.mobiquityinc.packer;


import com.mobiquityinc.exception.APIException;

import java.io.*;
import java.util.Scanner;

public class Packer {

    public static  String pack(String filePath) throws APIException {
        PacketDataReader p = new PacketDataReader();
        p.readFile ( filePath );

        String s = p.toString ( );
        return s;
    }
}
