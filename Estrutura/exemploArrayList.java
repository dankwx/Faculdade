import java.util.ArrayList;
import java.util.Scanner;

public class exemploArrayList {
    public static void main(String[] args) {
        int escolha;
        Scanner scanner = new Scanner(System.in);
        ArrayList arrayLista = new ArrayList();
        System.out.println("**Valores da ArrayList:**");
        arrayLista.add("Casa");
        arrayLista.add("Trabalho");
        arrayLista.add("Escola");
        arrayLista.add("Festa");


        for (Object object : arrayLista) {
            System.out.println("Valor: " + object.toString());
        }

        // Procurar um valor
        System.out.println("**Deseja procurar qual valor?**\n0\n1\n2\n3\n");
        escolha = scanner.nextInt();
        System.out.println("Valor encontrado: " + arrayLista.get(escolha));

        //Remover um valor
        System.out.println("**Qual valor deseja remover?**\n");
        escolha = scanner.nextInt();
        arrayLista.remove(escolha);

        //Print da arraylist com valor removido
        System.out.println("**Arraylist com valor retirado:**");
        System.out.println(arrayLista);

    }
}
