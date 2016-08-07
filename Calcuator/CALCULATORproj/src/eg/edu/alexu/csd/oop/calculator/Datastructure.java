package eg.edu.alexu.csd.oop.calculator;

import java.util.LinkedList;
import java.util.Stack;

public interface Datastructure {
	public String getcur();
	public String getprev();
	public String getnext();
	public void setcur(String s);
	public int size();
	public int nextsize();
	public boolean check(String s);
	public LinkedList<String> getelementstosave();
	public void load(Stack<String> s);
}
