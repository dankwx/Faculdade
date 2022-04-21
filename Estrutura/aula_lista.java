import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class aula_lista {
    public static void main(String[] args) {
        List listaSimples = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int escolha;
        System.out.println("Início da lista");
        listaSimples.add("Daniel");
        listaSimples.add("Felipe");
        listaSimples.add("Carlos");
        listaSimples.add("Marcos");
        listaSimples.add("Junior");
        for (int i = 0; i < listaSimples.size(); i++) {
            System.out.println("Valor: " + listaSimples.get(i));
        }
        System.out.println("Fim da lista");

        System.out.println("Insira o valor que deseja remover: \n");
        escolha = scanner.nextInt();
        listaSimples.remove(escolha);
        for (int i = 0; i < listaSimples.size(); i++) {
            System.out.println("Valor: " + listaSimples.get(i));
        }


        /*System.out.println("Lista vazia:");
        // limpar toda lista
        listaSimples.clear();
        for (int i = 0; i < listaSimples.size(); i++) {
            System.out.println("Valor: " + listaSimples.get(i));
        }*/

    }
}
