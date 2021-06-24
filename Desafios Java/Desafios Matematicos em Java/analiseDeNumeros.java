// Quantidade de Números Positivos

/* Crie um programa que leia 6 valores. Você poderá receber valores negativos
e/ou positivos como entrada, devendo desconsiderar os valores nulos. Em
seguida, apresente a quantidade de valores positivos digitados.

- Entrada

Você receberá seis valores, negativos e/ou positivos.

- Saída

Exiba uma mensagem dizendo quantos valores positivos foram lidos assim como é
exibido abaixo no exemplo de saída. Não esqueça da mensagem "valores positivos"
ao final. */

import java.io.IOException;
import java.util.Scanner;

public class minhaClasse {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int positivo = 0;
        int negativo = 0;
        int pares = 0;
        int impares= 0;
        int num;

        for (int i = 0; i < 5; i++) {
            num = leitor.nextInt();
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            if (num > 0) positivo++;
            if (num < 0) negativo++;

        }

        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
    }

}