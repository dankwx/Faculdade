package avaliacao.danielkondlatsch.m1;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class DoisFila {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> filaPrimos = new ArrayList<Integer>();
        int qtde = 0;

        // ======== Gerar a fila ======== //
        for (int i = 0; i < 1000; i++) {
            if ((i % 2 != 0) && (i % 3 != 0)) {
                filaPrimos.add(i);
            }
        }

        // ======== Mostrar valores da fila ======== //
        System.out.println("Valores adicionados: ");
        for (int i = 0; i < filaPrimos.size(); i++) {
            System.out.println(filaPrimos.get(i));
        }


        // ======== Remover valores não primos ======== //

        System.out.println("Removendo valores...");
        // ========== delay de 2 segundos para exibir fila ========== //
        TimeUnit.SECONDS.sleep(2);
        for (int i = 0; i < filaPrimos.size(); i++) {
            System.out.println("Removendo valor: " + filaPrimos.get(i));
            filaPrimos.remove(i);
        }
        qtde = filaPrimos.size();
        System.out.println("Quantidade de valores de números primos na lista: " + qtde);

        // ======== Esvaziar lista ======== //
        System.out.println("Esvanziando lista...");
        // ========== delay de 2 segundos para exibir fila ========== //
        TimeUnit.SECONDS.sleep(2);
        for (int i = 0; i < filaPrimos.size(); i++) {
            filaPrimos.remove(i);

        }
        System.out.println("Fila foi esvaziada por completo");

    }


}
