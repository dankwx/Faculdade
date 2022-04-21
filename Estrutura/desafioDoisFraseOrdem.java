import java.io.*;
import java.util.Arrays;

public class desafioDoisFraseOrdem {
    public static void main(String[] args) throws Exception {
        String string = "Universidade do Contestado";
        char[] charArray = string.replace(" ", "").toLowerCase().toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] > charArray[j]) {
                    var temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }
        System.out.println(charArray);
    }
}