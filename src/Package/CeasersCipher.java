package Package;

import java.lang.reflect.Array;
import java.util.Locale;
import java.util.Scanner;

public class CeasersCipher {
    public static void CeasersEncryption(String massage, int numberOfSpaces) {
        char[] lowerCaseAlphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] upperCaseAlphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        massage.toLowerCase();
        char[] massageCharArray = massage.toCharArray();
//        System.out.println(massageCharArray[4]);
        for (int i = 0; i < massageCharArray.length; i++) {
            for (int j = 0; j < lowerCaseAlphabet.length; j++) {
                if (massageCharArray[i] == lowerCaseAlphabet[j]) {
                    massageCharArray[i] = lowerCaseAlphabet[(j + numberOfSpaces-1) % 26];
                    break;
                }
                if (massageCharArray[i] == upperCaseAlphabet[j]) {
                    massageCharArray[i] = upperCaseAlphabet[(j + numberOfSpaces-1) % 26];
                    break;
                }
            }
        }
        System.out.println(massageCharArray);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CeasersEncryption("Hello", 2);
    }

}
