package printdistinctnumber;
import java.util.Scanner;
public class PrintDistinctNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number and finish by 0: ");
        int j = 0;
        int [] numbers = new int[100];
        boolean bool = true;
        while(bool){
            boolean ishave = true;
            int a = input.nextInt();
            if (a != 0){
                for (int i = 0; i < numbers.length; i++){
                    if ( a == numbers[i]){
                        ishave = false;
                        break;
                    }
                }
                 if (ishave)
                     numbers[j++] = a;
            }
            else
                bool = false;
        }//end of while
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] != 0)
                System.out.printf("%5d" + "\n", numbers[i]);
        }
    }//end of main
    
}
