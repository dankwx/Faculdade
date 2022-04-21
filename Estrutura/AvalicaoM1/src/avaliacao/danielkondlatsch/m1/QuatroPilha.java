package avaliacao.danielkondlatsch.m1;

import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.TimeUnit;

public class QuatroPilha {

    public static void main(String[] args) throws InterruptedException {

        int extensaoPilha = 500;
        int escolha = 0;
        Scanner scanner = new Scanner(System.in);

        // ========== Criação da pilha ========== //
        Stack<Integer> pilha = new Stack<Integer>();
        for (int i = 0; i < extensaoPilha; i++) {
            if ((i % 2) != 0) {
                pilha.push(i);
            }
        }
        // ========== Exibir pilha ========== //
        System.out.println("Exibição da pilha:");

        // ========== delay de 1 segundos para exibir fila ========== //
        TimeUnit.SECONDS.sleep(2);
        System.out.println(pilha);

        // ============= Limpar pilha ============= //
        pilha.clear();

        // ========== Exibir ou não lista limpa =========//
        // ========== delay de 1 segundos para exibir fila ========== //
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Deseja verificar se a lista foi limpa com sucesso?\n1. Sim\n2. Não");
        escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                for (int i = 0; i < 10; i++) {
                    pilha.push(i);
                    if (pilha.isEmpty()) System.out.println("Não foi limpa");
                    else {
                        System.out.println("Pilha foi limpa com sucesso");
                    }
                    break;

                }
            case 2:
                System.out.println("Programa finalizado");

        }

    }
}
