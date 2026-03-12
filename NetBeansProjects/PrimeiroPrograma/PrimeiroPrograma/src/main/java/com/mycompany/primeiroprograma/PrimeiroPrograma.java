package com.mycompany.primeiroprograma;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class PrimeiroPrograma {
    public static void main(String[] args)  {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.out.println("Olá mundo");
    }
}
