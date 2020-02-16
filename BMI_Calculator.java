import java.util.Scanner;


public class BMI_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Department of Health and Human Services/National Institutes of Health");

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your Weight in lbs");
		int wt = sc.nextInt();
		
		System.out.println("Please enter your height in inches");
		int height = sc.nextInt();
		
		int bmi = (wt * 703)/(height*height);
		
		System.out.println("BMI Value :"+ bmi);
		
		
		System.out.println("\n \n \n \nNote : \n BMI VALUES\n Underweight: less than 18.5\n "
				+ "Normal: between 18.5 and 24.9\n Overweight: between 25 and 29.9\n"
				+ " Obese: 30 or greater");
		
		   sc.close();
	}

}
