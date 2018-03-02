import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadNum {
	public static void main(String[] args) throws IOException {
		File file = new File("Numbers.txt");
		Scanner read1 = new Scanner(file);
		Scanner read2 = new Scanner(file);
		int counter = 0;
		int sum = 0;
		int average = 0;
		while(read1.hasNextInt()) {
			counter++;
			read1.nextInt();
		}
		int [] values = new int[counter];
		System.out.println("counter is " + counter);
		while(read2.hasNextInt()) {
		for(int i = 0; i < values.length; i++) {
			values[i] = read2.nextInt();
			sum += values[i];
		}
		}
		average = sum / values.length;
		System.out.println("Sum is " + sum + " and average is " + average);
		
			
		
		
		
		
		
		
		
		
		
		
		/*
		if(file.exists()) {
			System.out.println("File already exists");
			System.exit(1);
		}
		PrintWriter output = new PrintWriter(file);

		output.print("312");
		output.println(69);
		output.close();
		*/
	}
}
