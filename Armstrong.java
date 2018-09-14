
import java.lang.Math;

class Armstrong{  

    public static void main(String args[]){  
    	
    	
        if(args.length <= 0){

            System.out.println("Usage error: Armstrong NUMBER");
            System.exit(1);
        }


        Integer input = -1;

        try{
            input = Integer.parseInt(args[0]);
        }catch(Exception e){
            System.out.println("Expected integer input");
            System.exit(1);
        }


        int length = input.toString().length();

        int sum = 0;

        for(int i=0; i< length; i++){

            String digitString = input.toString().charAt(i) + "";

            int digit = Integer.parseInt(digitString);

            sum += Math.pow(digit, length);

        }



        if(sum == input){
            System.out.println("Input is an armstrong number: " + input);
        }else{
            System.out.println("Input is not an armstrong number: " + input + " " + sum);
        }


    	
    }  

}  
