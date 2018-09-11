
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
public class Level_3 {
    public static void main(String[] args){
        String name[] = new String[4];
        int shotsTaken[] = new int[4];
        int shotsMade[] = new int[4];
        Scanner input = new Scanner(System.in);
        
        int max=0;
        int maxPerson=0;
        for(int i=0;i<4;i++){
            System.out.println("Enter Name");
            name[i]=input.next();
            System.out.println("Enter shots taken");
            shotsTaken[i]=input.nextInt();
            System.out.println("Enter shots made");
            shotsMade[i]=input.nextInt();
            if(((shotsMade[i]/shotsTaken[i])*100)>max){
                max=(shotsMade[i]/shotsTaken[i])*100;
                maxPerson=i;
            }
        }
        
        for(int i=0;i<4;i++){
            System.out.println(name[i] + "-" + (shotsMade[i]/shotsTaken[i]));
        }
        
        System.out.println(name[maxPerson] +" is the best player.");
        
        
    }
}
