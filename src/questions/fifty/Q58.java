package questions.fifty;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Q58 {

	public static void main(String[] args) {


		try{
			method();
		} catch(FileNotFoundException fne){
			System.out.print("File Not Found Exception");
		}catch(IOException ioe){
			System.out.println("IO Exception");
		}

	}
	
	public static void method() throws IOException{
		throw new FileNotFoundException();
	}

}
