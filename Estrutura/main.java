public class main {
    public static void main(String[] args) {
        // shift + alt + f
        String fila[] = new String[9];
        String aux;

        // preencher a fila com valor vazio
        for (int x = 0; x < 9; x++) {
            fila[x] = new String("f");
        }

        // preencher a fila com valor sequencial
        for (int x = 0; x < 9; x++) {
            aux = String.valueOf(x + 1);
            fila[x] = new String(aux);
        }

        // Dequeue desempilhar

        // isEmpty - verifica se está vazia
        if (fila[0] == null) {
            System.out.println("Fila vazia");
        }

        // isFull - verifica se está cheia
        if (fila[8] != null) {
            System.out.println("Fila está cheia");
        }

        //clear - limpar fila

        // exibir fila
        /*
         * for (int i = 0; i < fila.length; i++) {
         * System.out.println(fila[i]);
         * }
         */

        System.out.println("Hello World!");
    }

}
