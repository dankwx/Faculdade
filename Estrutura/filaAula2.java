public class filaAula2 {
    public static void main(String[] args) {
        String[] Fila = new String[10];

        int aux = 10;
        int conta = 0;


        for (int i = 0; i < aux; i++) {
            Fila[i] = new String(String.valueOf(i));
        }

        for (int i = 0; i < aux; i++) {
            System.out.println(Fila[i]);
        }

        // inserir
        Fila[1] = new String("10");

        System.out.println(Fila[2]);

        //isEmpty

        for (int i = 0; i < aux; i++) {
            if (
                    Fila[i].equalsIgnoreCase("0")
            ) {
                System.out.println("Fila possui posições com valor zero");
                conta++;
            }
        }
        if (conta == 10) {
            System.out.println("Fila está vazia");
        } else System.out.println("Fila não está vazias");
    }
}
