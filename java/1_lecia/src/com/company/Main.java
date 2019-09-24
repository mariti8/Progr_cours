package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String name="C:\\labs_TP\\java\\1_lecia\\file.txt";
        String new_name="C:\\labs_TP\\java\\1_lecia\\new_file.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(name));
            BufferedWriter writer = new BufferedWriter(new FileWriter(new_name));
            String line= reader.readLine();
            while(line !=null) {
                // System.out.println(reader.readLine());
                line= line.replace(" 0,0 ","NULL ");
                line= line.replace(" 0 ","NULL");
                writer.write(line+"\r\n");
                line= reader.readLine();
               // writer.write(reader.readLine());
            }
            writer.close();
            reader.close();
        }
        catch (IOException e) {
            e.getStackTrace();
        }
    }
}
