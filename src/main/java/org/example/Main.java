package org.example;

import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static Scanner scr = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Introduce la ruta del archivo");
        try {
            ReadTextFile readthis = new ReadTextFile(Path.of(scr.nextLine()));
            readthis.run();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
        }
    }
}