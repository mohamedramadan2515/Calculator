package eg.edu.alexu.csd.oop.calculator;

import java.util.LinkedList;
import java.util.Stack;

public class History implements Datastructure{
	private static History instance=null;
	private Stack<String> prev=new Stack<String>();
	private Stack<String> next=new Stack<String>();
	private LinkedList<String> L;
	private History(){}
	public static void destoryInstance(){
		instance=null;
	}
	public static History getInstance(){
		if(instance==null){
			instance = new History();
		}
		return instance;
	}
	@Override
	public String getcur() {
		// TODO Auto-generated method stub
		return prev.peek();
	}

	@Override
	public String getprev() {
		// TODO Auto-generated method stub
		next.push(prev.pop());
		return prev.peek();
	}

	@Override
	public String getnext() {
		// TODO Auto-generated method stub
		prev.push(next.pop());
		return prev.peek();
	}

	@Override
	public void setcur(String s) {
		// TODO Auto-generated method stub
		next.clear();
		prev.push(s);
		if(prev.size()==6)prev.remove(0);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return prev.size();
	}

	@Override
	public boolean check(String s) {
		// TODO Auto-generated method stub
		if(s.charAt(0)=='+'||s.charAt(0)=='-'||s.charAt(0)=='*'||s.charAt(0)=='/')return true;
		boolean flag=true;
		int idx=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='*'||s.charAt(i)=='/'){
				flag =false;
				idx=i;
				break;
			}
			if(!((s.charAt(i)>='0'&&s.charAt(i)<='9')||s.charAt(i)=='.'))return true;
		}
		if(flag)return true;
		flag=true;
		for(int i=idx+1;i<s.length();i++){
			if(s.charAt(i)>='0'&&s.charAt(i)<='9')
				flag=false;
			if(s.charAt(i)=='*'||s.charAt(i)=='/')
				return true;
		}
		if(flag)return true;
		return false;
	}

	@Override
	public int nextsize() {
		// TODO Auto-generated method stub
		return next.size();
	}

	@Override
	public LinkedList<String> getelementstosave() {
		// TODO Auto-generated method stub
		L =new LinkedList<String>();
		int a=0;
		while(a<5&&prev.size()>0){
			L.add(prev.peek());
			next.push(prev.pop());
			a++;
		}
		for(int i=0;i<a;i++)prev.push(next.pop());
		return L;
	}

	@Override
	public void load(Stack<String> s) {
		// TODO Auto-generated method stub
		prev.clear();
		next.clear();
		prev=s;
	}

}
