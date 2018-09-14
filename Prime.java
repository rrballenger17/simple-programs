
import java.lang.Math;

class Prime{  

    public static void main(String args[]){  
    	
    	if(args.length <= 0){

    		System.out.println("Usage error: Prime INPUT_NUMBER");
    		System.exit(1);
    	}

    	int input = -1;

    	 try{
    	 	input = Integer.parseInt(args[0]);
    	 }catch(Exception e){
    	 	System.out.println("Input Error: Expecting integer greater than 0");
    	 	System.exit(1);
    	 }

    	int divisor = 2;

    	while (divisor <  Math.sqrt(input) + 1 ){

    		if(divisor < input && input % divisor  == 0){

    			System.out.println("Not prime: Divisable by " + divisor);
    			System.exit(1);
    		}

    		divisor++;

    	}

    	System.out.println("The input is prime: " + input);
    }  

}  
