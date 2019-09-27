package com.mobiquityinc.packer;

import com.mobiquityinc.exception.APIException;
import com.mobiquityinc.model.Item;
import com.mobiquityinc.model.Packet;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PacketDataReader {

    public List<Packet> readFile(String filePath) {
        List<Packet> packets = new ArrayList<> ( );
        try (Scanner scanner = new Scanner ( new File ( filePath ) )) {
            while (scanner.hasNext ( )) {
                String data = scanner.nextLine ( );
                String capacity = data.substring ( 0, data.indexOf ( ':' ) ).trim();
                String itemData = data.substring ( data.indexOf ( ':' ) + 1 ).trim ()
                        .replaceAll ( "\\(", "" )
                        .replaceAll ( "\\)", "" )
                        .replaceAll ("€", ""  );

                String[] items = itemData.split ( " " );
                Packet packet = new Packet (  );
                packet.setCapacity ( Integer.parseInt ( capacity ) );

                for(String itemValue : items) {
                    String[] itemAttributes = itemValue.split ( "," );
                        packet.getItems ().add ( new Item (
                                Integer.parseInt ( itemAttributes[0] ),
                                Double.parseDouble ( itemAttributes[1] ),
                                Integer.parseInt ( itemAttributes[2] )
                                ) );
                }
            }
        } catch (IOException e) {
            throw new APIException ( "Error occurred while reading file", e );
        }
        return packets;
    }
}
