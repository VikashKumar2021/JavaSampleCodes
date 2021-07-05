//How do you find the missing number in a given integer array of 1 to 100? 
package arraysDemoCodes;

public class AddRemoveSearchSort {

	public static void main(String[] args) {

		int[] array= new int[25];
		
		//Initializing the array
		 for(int i=0; i<array.length; i++) {
			 array[i]= (int) ( Math.random()* 100);		
			 System.out.print(array[i] +"  ");
		 }
		 System.out.println();
		 //Update a number of a random index
		 System.out.println("Before : "+ array[(int) ( Math.random()* 25)]);
		array[(int) ( Math.random()* 25)]=0;
		System.out.println("After : "+ array[(int) ( Math.random()* 25)]);
		
		//Searching a number
		int x= (int) ( Math.random()* 100);
		for(int i=0;i<array.length; i++) {
			if(x==array[i]) {
				System.out.println(x +" is present in the array!");
				break;
			}
		}
		

	}

}
