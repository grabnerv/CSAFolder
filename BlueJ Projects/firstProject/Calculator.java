import java.util.Scanner;
public class Calculator
{
  private String operator;
  private int num1;
  private int num2;
  
  public static void main(String[] args){
      Scanner kboard = new Scanner(System.in);
      
      System.out.print("Enter a number: ");
      int num1 = Integer.parseInt(kboard.nextLine());
      
      System.out.print("Enter a operation: ");
      char op = kboard.nextLine().charAt(0);
      
      System.out.print("Enter another number: ");
      int num2 = Integer.parseInt(kboard.nextLine());

      int ans = 0;
  
      if (op == '+'){
          ans = num1 + num2;
      
    }else if (op == '-'){
        ans = num1 + num2;
        
    }else if (op == '/'){
        ans = num1 / num2;
        
    }else if (op == '*'){
        ans = num1 * num2;
        
    }else if (op == '%'){
        ans = num1 & num2;
        
    }
    
    System.out.println("" + num1 + op + num2 + "=" + ans);
}

  
    
}
