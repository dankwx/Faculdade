/*import java.util.Scanner;

public class FilaDinamica {

    static void alterarValor() {
        System.out.println("Deseja alterar algum valor?\n1 = Sim\n2 = Não");
        Scanner scanner = new Scanner(System.in);
        int pergunta = scanner.nextInt();
        int aux = 0;

        System.out.println("Qual posição deseja alterar o valor?");
        aux = Integer.valueOf(scanner.nextLine());
        System.out.println("Insira o valor que deseja inserir:");
        Integer valor = Integer.valueOf(scanner.nextLine());
        String[] Fila = new String[10];
        Fila[aux] = new String(String.valueOf(valor));

    }

    public static void main(String[] args) {
        String[] Fila = new String[10];
        Scanner scanner = new Scanner(System.in);
        int valor = 0;
        int pergunta = 0;


        //inserir valores
        for (int i = 0; i < Fila.length; i++) {
            System.out.println("Insira o valor da posição " + i + " da fila");
            Fila[i] = scanner.nextLine();
        }
        // printar valores
        System.out.println("Valores printados sem alteração:");
        for (int i = 0; i < Fila.length; i++) {
            System.out.println(Fila[i]);
        }

        // alterar valores
        alterarValor();


        System.out.println("Valor alterado:");
        System.out.println(Fila[aux]);

    }
}*/