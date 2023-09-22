
package com.campusdual.Ejercicio21;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class FileWR {

    private Random r = new Random();

    public static void main(String[] args) {
        FileWR wr = new FileWR();
        try {
            wr.writeFile();
            wr.readFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void writeFile() throws FileNotFoundException {
        try (PrintWriter pw = new PrintWriter(new File("salida.txt"))) {
            for (int i = 0; i < 10; i++) {
                pw.println(r.nextInt(10) + 1);
            }
        } catch (FileNotFoundException e) {
            throw e;
        }
    }

    private void readFile() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(new File("salida.txt")))){
            String line;
            while( ( line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw e;
        }
    }
}

