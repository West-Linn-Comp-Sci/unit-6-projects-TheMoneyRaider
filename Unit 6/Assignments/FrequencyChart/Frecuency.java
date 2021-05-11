
/**
 * Write a description of class Frecuency here.
 *
 * @Griffin Stober
 * @V1.0
 */
import java.util.Scanner;

public class Frecuency
{
    public static void main(String[] args){
    Scanner input =new Scanner(System.in);
    int[] array = {0,0,0,0,0,0,0,0,0,0};
    System.out.println("Type a number from 1-100");
    int nextInt = input.nextInt();
    int nextInt2 = 0;
    while(nextInt<101 && nextInt>0){
        if(nextInt==100)
        nextInt=99;
        nextInt2= nextInt/10;
        array[nextInt2]++;
        
        System.out.println("Type a number from 1-100");
        nextInt = input.nextInt();
    
    
    
    }
    int amount;
    int step;
    System.out.print("  1 - 10 | ");
    for(int i = 0; i<10;i++){
        amount = array[i];
        for(int l=amount;l>0;l--){
        System.out.print("*");
        }
        if(i<9){
            System.out.println();
            step = i+1;
            step*=10;
            step++;
            System.out.print(" "+step);
            step+=9;
            System.out.print(" - "+step);
            if(i<8){
               System.out.print(" | ");
            }else
               System.out.print("| ");
        }
    }
    
    
    
    
    
    }
}
