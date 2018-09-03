package com.company.wk3;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
public class ReadSortSave {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C://desktop/data.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("C://desktop/sorted.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        ArrayList<String> rows = new ArrayList<String>();

        String[] names = new String[7];
        String sortedNames, temp;
        int i, n, result;

        //load data into array

        for (i = 0; i < names.length; i++) {
            sortedNames = br.readLine();
        }

        br.close();
        for (n = 1; n < names.length; n++) {
            for (i = 0; i < (names.length - n); i++) {
                result = names[i].compareToIgnoreCase(names[i + 1]);
                if (result > 0) {
                    temp = names[i];
                    names[i] = names[i + 1];
                    names[i + 1] = temp;
                }
            }
        }
        for (i = 0; i < names.length; i++) {
            pw.println(names[i]);
            System.out.println(names[i]);
        }
        pw.close();

     /*   try {
            reader  = new BufferedReader(new FileReader("c://desktop/Input.txt"));
            outputStream = new PrintWriter(new FileWriter("c://desktop/Output.txt"));

            String file;
            while ((file = reader .readLine()) != null) {
                rows.add(file);
            }
            Collections.sort(rows);
            String[] strArr= rows.toArray(new String[0]);
            for (String cur : strArr)
                outputStream.println(cur);
        } finally {
            if (reader  != null) {
               reader.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }  */
    }
}

