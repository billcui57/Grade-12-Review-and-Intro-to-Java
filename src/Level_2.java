
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author billc
 */
public class Level_2 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        char[] letters;
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int[] frequency = new int[26];

        do {
            letters = input.nextLine().toLowerCase().toCharArray();
            if((letters[0]=='s')&&(letters[1]=='t')&&(letters[2]=='o')&&(letters[3]=='p')){
                break;
            }
            
            for (int i = 0; i < frequency.length; i++) {
                frequency[i] = 0;
            }

            for (int i = 0; i < letters.length; i++) {
                for (int j = 0; j < alphabet.length; j++) {
                    if (letters[i] == alphabet[j]) {
                        frequency[j]++;
                    }
                }
            }

            for (int i = 0; i < frequency.length; i++) {
                if (frequency[i] > 0) {
                    System.out.print(alphabet[i] + "-" + frequency[i] + ":");
                }
            }
            System.out.println();
        } while (true);
    }
}
