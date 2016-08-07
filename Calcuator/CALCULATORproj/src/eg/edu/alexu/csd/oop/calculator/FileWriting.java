package eg.edu.alexu.csd.oop.calculator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class FileWriting {
	public void write(LinkedList<String> L){
		BufferedWriter out = null;
		File a =new File("save.txt");
		a.delete();
		try {
			a.createNewFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try  
		{
		    FileWriter fstream = new FileWriter("save.txt", true); //true tells to append data.
		    out = new BufferedWriter(fstream);
		    for(int i=L.size()-1;i>=0;i--){
		    	out.write(L.get(i)+"\n");
		    }
		}
		catch (IOException e)
		{
		    System.err.println("Error: " + e.getMessage());
		}
		finally
		{
		    if(out != null) {
		        try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		}
	}
}
