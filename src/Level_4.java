
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
        
        //user input
        System.out.println("Enter hill distance");
        int hillDistance = input.nextInt();
        System.out.println("Initial climb attempt distance");
        double initialClimbDistance = input.nextDouble();
        System.out.println("Slide down distance");
        double slideDistance = input.nextDouble();
        System.out.println("Fatigue factor %");
        double fatigueFactor = input.nextDouble();
        
        
        while(true){
            
            //calculates what person is about to climb
            double climbed= (initialClimbDistance-(initialClimbDistance*i*(fatigueFactor/100)));
            
            //only climb up distance if person is actually going to climb up
            if(climbed>0){
                climbedDistance+=climbed;
            }
            
           
            //tests if person has made it or lost before he/she slides
            if(climbedDistance<0){
                System.out.println("Failure on attempt " +(i+1));
                break;
            }else if(climbedDistance>=hillDistance){
                System.out.println("Success on attempt " +(i+1));
                break;
            }
            
            //person slides
            climbedDistance-=slideDistance;
            
            //tests if person has made it or lost after he/she slides (really only checking for failure is necessary)
             if(climbedDistance<0){
                System.out.println("Failure on attempt " +(i+1));
                break;
            }else if(climbedDistance>=hillDistance){
                System.out.println("Success on attempt " +(i+1));
                break;
            }
            
            i++;
        }
        
    }
}
