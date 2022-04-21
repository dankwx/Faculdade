import java.util.Arrays;

public class desafioFraseOrdem {
    public static void main(String args[]) {

        String str = "Universidade do Contestado";
        char charArray[] = str.replace(" ", "").toLowerCase().toCharArray();
        Arrays.sort(charArray);
        System.out.println(new String(charArray));
    }
}