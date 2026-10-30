package org.example;

import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Scanner scr = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Introduce la ruta del archivo");
        ReadTextFile readthis = new ReadTextFile(Path.of(scr.nextLine()));
        readthis.run();
    }
}