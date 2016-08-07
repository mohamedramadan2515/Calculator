package eg.edu.alexu.csd.oop.calculator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class FileRead {
	public Stack<String> read(){
		Stack<String> a=new Stack<String>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("save.txt"));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new NullPointerException();
		}
		try {
		    String line = br.readLine();
		    if(line==null)return a;
		    while (line != null) {
		        a.push(line);
		    	line = br.readLine();
		    }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new NullPointerException();
		} finally {
		    try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return a;
	}
}
