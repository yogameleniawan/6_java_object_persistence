/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6_objectpresistence;

import java.io.*;
import java.util.*;
import static java.util.Collections.list;

/**
 *
 * @author Pamungkas
 */
public class SerializationDemo {

//    public static void main(String args[]) throws IOException {
//        try {
//            Vector list;
//
//            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//            System.out.println("Checking for previous serialized list");
//            
//            try {
//                FileInputStream fin = new FileInputStream("list.out");
//                ObjectInputStream oin = new ObjectInputStream(fin);
//                try {
//                    Object obj = oin.readObject();
//                    list = (Vector) obj;
//                } catch (ClassCastException cce) {
//                    list = new Vector();
//                } catch (ClassNotFoundException cnfe) {
//                    list = new Vector();
//                }
//                fin.close();
//            } catch (FileNotFoundException fnfe) {
//                list = new Vector();
//            }
//            
//            for (;;) {
//                System.out.println("Menu :-");
//                System.out.println("1. Add item");
//                System.out.println("2. Delete item");
//                System.out.println("3. List items");
//                System.out.println("4. Save and quit");
//                System.out.print("Choice: ");
//
//                String response = reader.readLine();
//
//                int choice = Integer.parseInt(response);
//                switch (choice) {
//                    case 1:
//
//                        System.out.print("Enter item : ");
//                        String item = reader.readLine();
//                        list.addElement(item);
//                        break;
//                    case 2:
//
//                        System.out.print("Enter item : ");
//                        String deadItem = reader.readLine();
//                        list.removeElement(deadItem);
//                        break;
//                    case 3:
//
//                        for (Enumeration e = list.elements(); e.hasMoreElements();) {
//                            System.out.println(e.nextElement());
//                        }
//                        break;
//                    case 4:
//
//                        System.out.println("Saving list");
//                        FileOutputStream fout = new FileOutputStream("list.out");
//
//                        ObjectOutputStream oout = new ObjectOutputStream(fout);
//
//                        oout.writeObject(list);
//                        fout.close();
//                        System.exit(0);
//                }
//            }
//
//        } catch (IOException ioe) {
//            System.err.println("I/O error");
//        }
//    }
    
    public static void main(String args[]) throws IOException {
        
        try {
            Vector list;

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Checking for previous serialized list");
            
            try {
                FileInputStream fin = new FileInputStream("list3.out");
                ObjectInputStream oin = new ObjectInputStream(fin);
                try {
                    Object obj = oin.readObject();
                    list = (Vector) obj;
                } catch (ClassCastException cce) {
                    list = new Vector();
                } catch (ClassNotFoundException cnfe) {
                    list = new Vector();
                }
                fin.close();
            } catch (FileNotFoundException fnfe) {
                list = new Vector();
            }
            
            for (;;) {
                System.out.println("Menu :-");
                System.out.println("1. Add item List");
                System.out.println("2. Delete item");
                System.out.println("3. List items");
                System.out.println("4. Save and quit");
                System.out.print("Choice: ");

                String response = reader.readLine();

                int choice = Integer.parseInt(response);
                switch (choice) {
                    case 1:

                        System.out.print("Enter item (---,---): ");
                        String item = reader.readLine();
                        String[] tokens = item.split(",");
                        Barang b1 = new Barang(tokens[0], tokens[1]);
                        list.addElement(b1);
                        break;
                    case 2:

                        System.out.print("Enter item : ");
                        String deadItem = reader.readLine();
                        list.removeElement(deadItem);
                        break;
                    case 3:

                        for (Enumeration e = list.elements(); e.hasMoreElements();) {
                            System.out.println(e.nextElement());
                        }
                        break;
                    case 4:

                        System.out.println("Saving list");
                        FileOutputStream fout = new FileOutputStream("list3.out");

                        ObjectOutputStream oout = new ObjectOutputStream(fout);

                        oout.writeObject(list);
                        fout.close();
                        System.exit(0);
                }
            }

        } catch (IOException ioe) {
            System.err.println("I/O error");
        }
    }
    
}
