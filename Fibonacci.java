

//1 1 2 3 5 8 13

class Fibonacci{  


	// 1 1 2 3 5 8 13

	public static void printFibonacci(int limit){

		int prev = 1;

		int next = 1;


		while(true){

			System.out.print(prev);

			if(prev >= limit){
				System.out.println("");
				break;
			}

			int sum = prev + next;

			prev = next;

			next = sum;

			System.out.print(", ");

		}


	}



    public static void main(String args[]){  
    	
    	printFibonacci(100);



    }  
}  










