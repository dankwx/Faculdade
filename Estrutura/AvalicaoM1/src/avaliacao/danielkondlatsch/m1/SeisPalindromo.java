package avaliacao.danielkondlatsch.m1;

import java.util.Scanner;

public class SeisPalindromo {
    public static void main(String[] args) {
        String palavra;
        String palavraVirada;
        Scanner scanner = new Scanner(System.in);

        /*

        String palavra = "daniel";
        String resev = "";

        char[] resultarray = palavra.toCharArray();

        for (int i = resultarray.length - 1; i >= 0; i--) {

            System.out.print(resultarray[i]);

        }

        System.out.println("\ndass" + resev);


    }*/


        System.out.println("Insira uma palavra para verificar se é palíndroma: ");
        palavra = scanner.nextLine();


        StringBuilder stringBuildervarible = new StringBuilder();
        stringBuildervarible.append(palavra);
        stringBuildervarible.reverse();
        //System.out.println("Reversed String  : " + stringBuildervarible);

        palavraVirada = String.valueOf(stringBuildervarible);

        System.out.println("Palavra inserida: " + palavra);
        System.out.println("Palvra virada: " + palavraVirada);


        if (palavra.equals(palavraVirada)) {
            System.out.println("A palavra é palíndroma");
        } else {
            System.out.println("A palavra não é palíndroma");
        }

    }
}