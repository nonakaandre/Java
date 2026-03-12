/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tipoprimitivos;

import java.util.Scanner;
import static java.util.Locale.US;


/**
 *
 * @author nonak
 */
public class TipoPrimitivos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(US);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.format("A nota do(a) aluno(a) %s é %.1f " ,nome, nota);
        
    }
}
