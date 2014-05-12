import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class reader {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException 
	{
		// TODO Auto-generated method stub
		System.out.println(17%10);
		System.out.println("Dile");
		Scanner in = new Scanner(System.in);
		String file = in.next();
		
		int words = 0;
		Scanner fileee = new Scanner(new File(file));
		
		while(fileee.hasNextLine())
		{

			String line = fileee.nextLine();

			System.out.println(line);
		}

		fileee = new Scanner(new File(file));
		fileee.useDelimiter("");
		while(fileee.hasNext())
		{
			char c = fileee.next().charAt(0);
			words++;
			System.out.print(c);
		}
	}

}
