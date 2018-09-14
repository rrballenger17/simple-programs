
import java.lang.Math;

class Palindrome{  

    public static void main(String args[]){  
    	
    	if(args.length <= 0){

    		System.out.println("Usage error: Palindrome WORD");
    		System.exit(1);
    	}

        //String input = args[0];

        String input = new String(args[0]).toLowerCase();

        //String input = inputArg.toLowerCase();


        int index = 0;

        int opposite = input.length() - 1;


        while(index < opposite){


            if(input.charAt(index) != input.charAt(opposite)){


                System.out.println("Not a palindrome: " + args[0]);
                System.exit(1);
            }



            index++;

            opposite--;
        }


        System.out.println("The input is a palindrome: " + args[0]);






    	
    }  

}  
