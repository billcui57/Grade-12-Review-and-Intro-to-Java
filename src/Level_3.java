
import java.text.DecimalFormat;
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
        DecimalFormat f = new DecimalFormat("#0.00");
    
        String name[] = new String[4];
        
        double shotsTaken[] = new double[4];
        double shotsMade[] = new double[4];
        Scanner input = new Scanner(System.in);
        
        double max=0;
        int maxPerson=0;
        for(int i=0;i<4;i++){
            System.out.println("Enter Name");
            name[i]=input.next();
            System.out.println("Enter shots taken");
            shotsTaken[i]=input.nextDouble();
            System.out.println("Enter shots made");
            shotsMade[i]=input.nextDouble();
            if(((shotsMade[i]/shotsTaken[i])*100)>max){
                max=(shotsMade[i]/shotsTaken[i])*100;
                maxPerson=i;
            }
        }
        
        for(int i=0;i<4;i++){
            System.out.println(name[i] + "-" + f.format((shotsMade[i]/shotsTaken[i])*100));
        }
        
        System.out.println(name[maxPerson] +" is the best player.");
        
        
    }
}
