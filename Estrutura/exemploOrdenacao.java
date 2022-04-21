public class exemploOrdenacao {

    public static void main(String[] args) {


        int vetor[] = {5, 1, 2, 3, 4};
        int vetorAux[] = vetor;
        int n = vetor.length;
        int temp = 0;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - 1; j++) {
                //trocar
                if (vetor[j] > vetor[j + 1]) {
                    temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
        System.out.println();


        System.out.println("Lista depois do sort");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

    }
}