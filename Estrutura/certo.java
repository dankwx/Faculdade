import java.util.Scanner;

public class certo {


    public static void main(String[] args) {
        String[] Fila = new String[10];
        Scanner scanner = new Scanner(System.in);
        int valor = 0;
        int pergunta = 0;
        String auxT;
        int conta2 = 0;

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
        System.out.println("Deseja alterar algum valor?\n1 = Sim\n2 = Não");
        pergunta = scanner.nextInt();
        int conta = 0;
        while (pergunta == 1) {
            System.out.println("Qual posição deseja alterar? [0-9]");
            int aux = 0;
            conta = 0;
            aux = scanner.nextInt();

            System.out.println("Insira o valor:");
            valor = scanner.nextInt();
            /*System.out.println("Insira o valor que deseja inserir:");
            valor = scanner.nextInt();*/
            Fila[aux] = new String(String.valueOf(valor));
            System.out.println("Deseja altera mais?\n1 = Sim\n2 = Não");
            pergunta = scanner.nextInt();
        }
        System.out.println(Fila[0]);
        System.out.println(Fila[1]);

        // exluir valores
        System.out.println("Deseja excluir algum valor?\n1 = Sim\n2 = Não");
        pergunta = scanner.nextInt();
        while (pergunta == 1) {
            System.out.println("Qual posição deseja excluir? [0-9]");
            int aux = 0;
            aux = scanner.nextInt();
            Fila[aux] = new String("0");
            System.out.println("Posição excluida.");

            /*Fila[aux] = new String(String.valueOf(valor));*/
            System.out.println("Deseja excluir mais?\n1 = Sim\n2 = Não");
            pergunta = scanner.nextInt();
        }
        System.out.println("Valores da fila:");
        for (int i = 0; i < Fila.length; i++) {
            System.out.println("Valor da posição " + i + ": " + Fila[i]);
        }
        // se está vazia
        for (int i = 0; i < Fila.length; i++) {
            if (
                    Fila[i].equalsIgnoreCase("0")
            ) {
                System.out.println("Fila possui posições com valor zero");
                conta++;
            }
        }
        //está cheia
        for (int i = 0; i < Fila.length; i++) {
            boolean status;
            if (conta2 == Fila.length) status = true;
            {
                conta2++;
            }
        }
        if (conta == 10) {
            System.out.println("Fila está vazia");
        } else System.out.println("Fila não está vazia");
        if (conta2 == 10) {
            System.out.println("Fila está cheia");
        }
    }
}