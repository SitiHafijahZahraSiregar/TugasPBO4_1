package prak4_tugaspbo_ara;
import java.util.Scanner;

public class Prak4_TugasPbo_Ara {

   
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int [] myNum;
        myNum = new int[n];
        
        for(int i = 0; i < myNum.length; i++){
            myNum[i] = input.nextInt();
        }
        
        int find = input.nextInt();
        boolean found = true;
        
        for(int i = 0; i < myNum.length; i++)
            if(find==myNum[i]){
                found = true;
                break;
            }else
                found = false;
        
        if(found == true){
            System.out.println("Nilai ditemukan");
        }else{
            System.out.println("Nilai tidak ditemukan");
         }
       }
    }
