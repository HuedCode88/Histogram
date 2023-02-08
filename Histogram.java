import java.util.Scanner;
public class Histogram {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("How many values are in dataset?");
		int[] dataSet = new int[input.nextInt()];
		
		System.out.println("Enter "+dataSet.length+ " values.");
			for(int i=0;i<dataSet.length;i++) {
					dataSet[i]=input.nextInt(); 
			}
		String h = "*";
		String empty= "";

			for(int i=0;i<dataSet.length;i++) {
				for(int j=0;j<dataSet[i];j++) {
					empty += h;
					}
			System.out.println(empty);
			empty="";
			}
	}

}
