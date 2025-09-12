public class main{
  public static void main(String[] args){
    
     int number1 = 96;
     int number2 = 53;
     int temp = number1;
     
     number1 = number2;
     number2 = temp;
     
     System.out.println("After swapping number1 = " + number1 + " and number2 = " + number2);
  }
}
