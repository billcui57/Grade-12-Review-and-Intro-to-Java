/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author 348848128
 */
public class Level_1 {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        
        
        
        
        
        String result=""; //to store raw results
        
       int loop=1;
        
        do{
        int player1=0;
        int player2=0;
        int ties=0;
        
           String[] round=input.nextLine().split(" "); //reads in a line of the round and breakes it up into individual matches
      
           for(int i=0;i<round.length;i++){ //win lose tie determination
               if((round[i].equals("PR"))||(round[i].equals("RS"))||(round[i].equals("SP"))){
                   player1++;
               }else if((round[i].equals("RP"))||(round[i].equals("SR"))||(round[i].equals("PS"))){
                   player2++;
               }else if(((round[i].equals("PP"))||(round[i].equals("RR"))||(round[i].equals("SS")))){
                   ties++;
               }else if(round[i].equals("Q")){
                   loop=0;
               }
           }
           
           //writes raw winning data into result string (better alternative to using an array imo)
           if(player1>player2){
               
               result+="Player 1 ";
               result+=Integer.toString(ties)+"/";
           }else if(player2>player1){
               
               result+="Player 2 ";
                  result+=Integer.toString(ties)+"/";            

           }else if ((player2==player1)&&(player1!=0)){
              
               result+="Overall draw ";
               result+=Integer.toString(ties)+"/";
           }else if((player2==player1)&&(player1==0)&&(ties!=0)){
               result+="Overall draw ";
               result+=Integer.toString(ties)+"/";
           }
           
        }while(loop ==1);
        
        //converts raw result data into readable strings
        String printOut[] = result.split("/");
        for(int i=0;i<printOut.length;i++){
            System.out.println(printOut[i]);
            
        }
                
        
        
        
        
    }
    
    
}
