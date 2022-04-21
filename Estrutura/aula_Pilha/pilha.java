package aula_Pilha;

import java.util.Random;
import java.util.Stack;

public class pilha {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        Random random = new Random();

        for (int i = 0; i < 10000000; i++) {
            // insere na pilha números aleatórios de 0 a 100

            System.out.println("Inserindo na pilha: " + stack.push(random.nextInt(100)));

        }

        for (int i = 0; i < 10000000; i++) {
            System.out.println("Retirando da pilha: " + stack.pop());
        }

        // verifica se está vazia
        if (stack.isEmpty()) System.out.println("Pilha Esta Vazia");


    }
}
