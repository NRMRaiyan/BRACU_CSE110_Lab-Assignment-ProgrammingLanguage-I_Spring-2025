import java. util.Scanner;

public class task06_B{
  
  // Task 06_A
  public static double calcTax(int age, int salary){
    double tax = 0.0;
    if(age < 18 || salary < 10000){
      tax = 0.0;
    }
    

else if(salary >= 10000 && salary <= 20000){
      tax = salary * (7.0 / 100);
    }
			else{
      tax = salary * (14.0 / 100);
    }
    return tax;
  }
  
  // Task 06_B
  public static void calcYearlyTax(){
    
    double [] taxArray = new double [12];
    
    Scanner sc = new Scanner(System.in);
    
    double totalYearlyTax = 0;
    
   	System.out.println("Enter your age: ");
    int age = sc.nextInt();
    
    double tax = 0;
    
   	for(int i = 0; i < 12; i++){
      
    System.out.println("Enter " + (i + 1) + "th month salary: ");



      int salary = sc.nextInt();
      
      totalYearlyTax += calcTax(age, salary);


      tax = calcTax(age, salary);
      
     	taxArray[i] = tax;
      
      System.out.println();
    }
    
    for(int i = 0; i < 12; i++){
      
   	   System.out.printf("Month %d tax: %.1f\n",  (i + 1), taxArray[i]);
    }
    
    System.out.println("Total yearly tax: " + totalYearlyTax);
    
  }
  
  public static void main(String[] args)
{
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter your age : ");


   	int age = sc.nextInt();
    
    System.out.println("Enter your salary: ");

    int salary = sc.nextInt();
    
  	double tax = calcTax(age, salary);
    
    System.out.printf("%.1f", tax);
    
   	System.out.println();
    
    calcYearlyTax();
  }
}
