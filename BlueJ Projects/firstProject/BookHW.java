
public class BookHW
{
   public static void main(String[] args){
       int a, b, c;
       a = 2;
       b = 2;
       c = 2;
       double squareRoot = Math.sqrt(b^2-(4*a*c));
       double x1 = (-b + squareRoot) / (2*a);
       double x2 = (-b - squareRoot) / (2*a);
       System.out.print(x1);
       System.out.print(x2);
    }
   
}
