import java.util.Scanner;

public class cs123 {

	public static void main(String[] args) {
		
		  //Variable declaration
          int sum = 0, num=0;
          int N ;
          int average, range ;
       
          int small = Integer.MAX_VALUE;
          int large = Integer.MIN_VALUE;
        
          //Reads keyboard
          Scanner pam = new Scanner (System.in);
          
          //Prompts users to enter how many times they want to enter a number
          System.out.print("Enter the Value of N: " );
          N = pam.nextInt();
          
          
          //Prompts user to enter the values
      	  System.out.print("Enter the Values: " );
      	   
      	  //for loop
      	    for (int i = 0; i< N; i++)
      	    {
      	    	//finds the sum
      	    	num = pam.nextInt();
      	    	sum=sum+num;
      	    	
      	    	//if statement to find the largest and smallest number
      	    	if (large < num)
      	    	{
                    large = num;
      	    	}
                if (small > num)
                {
                    small = num;
                }
      	    }
      	    
      	  
      	    //calculates the range
      	    range = large - small ;
      	    //calculates average
      	    average=sum/N;
       //Output
          System.out.print("Sum: " +sum);
          System.out.print("\nAverage: " +average);
          System.out.print("\nRange: " +range);
          
          
          
          
		
		

		

		
		
		
		
		
		
		
		
		
		

	}

}
