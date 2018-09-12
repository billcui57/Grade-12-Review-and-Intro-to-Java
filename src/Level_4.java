
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
public class Level_4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        
        double climbedDistance=0;
        int i=0;
        
        System.out.println("Enter hill distance");
        int hillDistance = input.nextInt();
        System.out.println("Initial climb attempt distance");
        double initialClimbDistance = input.nextDouble();
        System.out.println("Slide down distance");
        double slideDistance = input.nextDouble();
        System.out.println("Fatigue factor %");
        double fatigueFactor = input.nextDouble();
        
        
        while(true){
            double climbed= (initialClimbDistance-(initialClimbDistance*i*(fatigueFactor/100)));
            if(climbed>0){
                climbedDistance+=climbed;
            }
            
            System.out.println(climbedDistance);
            
            if(climbedDistance<=0){
                System.out.println("Failure on attempt " +(i+1));
                break;
            }else if(climbedDistance>=hillDistance){
                System.out.println("Success on attempt " +(i+1));
                break;
            }
            climbedDistance-=slideDistance;
            i++;
        }
        
    }
}
