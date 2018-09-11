
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 348848128
 */
public class Level_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of adjectives");
        int numAdjectives = input.nextInt();
        System.out.println("Enter number of nouns");
        int numNouns = input.nextInt();
        
        String adjectives[] = new String[numAdjectives];
        String nouns[] = new String[numNouns];
        
        for(int i =0;i<adjectives.length;i++){
            System.out.println("Enter in adjectives");
            adjectives[i]=input.next();
        }
        
        for(int i =0;i<nouns.length;i++){
            System.out.println("Enter in nouns");
            nouns[i]=input.next();
        }
        
        for(int i=0;i<adjectives.length;i++){
            for(int j=0;j<nouns.length;j++){
                System.out.println(adjectives[i]+ " as " + nouns[j]);
            }
        }
        
    }
}
