public class SumArray{
	public static void main(String args[]){
		int i , sum = 0 ;
		int array[] = new int[]{10 , 20 , 30 , 40 , 50};
		for(i = 0; i<5; i++){
		  sum = sum + array[i];
		  }
		System.out.println("The sum of the array is : "+sum);
}
}