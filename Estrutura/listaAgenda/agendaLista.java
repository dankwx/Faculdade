/*package listaAgenda;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class agendaLista {

    ArrayList<String> agendaLista = new ArrayList<String>();

    public static void excluir() {

    }

    public static void procurar() {

    }

    public static void inserir() {

        Scanner sc = new Scanner(System.in);

        ArrayList<Pessoa> peopleAr = new ArrayList<Pessoa>();
        Pessoa pessoa = new Pessoa();

        pessoa.nome = sc.nextLine();
        pessoa.endereco = sc.nextLine();
        pessoa.email = sc.nextLine();
        pessoa.cidade = sc.nextLine();
        pessoa.celular = sc.nextLine();


    }

    public static void exibir() {

        String message = new String();
        for (agendaLista pessoa : listaAgenda.agendaLista.exibir() ;){
            message += "Nome:" + pessoa.nome() + " - Celular: " + pessoa.celular + "\n";
        }


    }

    public static void main(String[] args) {

        while (true) {
            String opcao = JOptionPane.showInputDialog(null, "Opções: 1-Inserir / 2-Exibir 3 -Exlcuir");
            switch (opcao) {
                // inserir
                case "1":
                    inserir();
                    break;
                // inserir
                case "2":
                    exibir();
                    // inserir
                case "3":
                    procurar();
                    // inserir
                case "4":
                    excluir();
            }
        }

    }


}
*/