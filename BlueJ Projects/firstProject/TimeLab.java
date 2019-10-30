import java.util.Scanner;
public class TimeLab
{

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number of milliseconds: ");
        int milliseconds = Integer.parseInt(kb.nextLine());
        System.out.println(milliseconds / 3600000 + " hours");
        milliseconds = milliseconds % 3600000;
        System.out.println(milliseconds / 60000 + " minutes");
        milliseconds = milliseconds % 60000;
        System.out.println(milliseconds / 1000 + " seconds");
        milliseconds = milliseconds % 1000;
        System.out.println(milliseconds + " milliseconds");
        
        
        
        
        
        
    }

}
