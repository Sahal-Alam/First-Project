import java.util.Scanner;
public class SumOfSeries{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int i, number , sum = 0;
		System.out.print("Enter the value of number : ");
		number = input.nextInt();
		for(i = 0; i<= number; i++){
		  sum = sum + i * i;
			}
		System.out.println("Sum of the series is : "+sum);		
}
}