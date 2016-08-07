package eg.edu.alexu.csd.oop.calculator;

import java.util.Stack;

public class Calengine implements Calculator{
	private FileWriting write;
	private FileRead read;
	private static Calengine instance=null;
	private Calengine(){
		History.destoryInstance();
	}
	public static void destoryInstance(){
		instance=null;
	}
	public static Calengine getInstance(){
		if(instance==null){
			instance=new Calengine();
		}
		return instance;
	}
	@Override
	public void input(String s) {
		// TODO Auto-generated method stub
		s=s.replaceAll("\\s","");
		if(History.getInstance().check(s))throw new NullPointerException();
		History.getInstance().setcur(s);
	}

	@Override
	public String getResult() {
		// TODO Auto-generated method stub
		if(History.getInstance().size()==0)throw new RuntimeException();
		String s=History.getInstance().getcur();
		String pars = "";
		int idx=0,w=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='*'||s.charAt(i)=='/'){
				idx=i;
				if(s.charAt(i)=='+')w=1;
				if(s.charAt(i)=='-')w=2;
				if(s.charAt(i)=='*')w=3;
				if(s.charAt(i)=='/')w=4;
				break;
			}
			Character c = s.charAt(i);
			pars=pars.concat(c.toString());
		}
		double a,b;
		a=Double.parseDouble(pars);
		pars=s.substring(idx+1, s.length());
		b=Double.parseDouble(pars);
		
		if(w==1)return String.valueOf(a+b);
		if(w==2)return String.valueOf(a-b);
		if(w==3)return String.valueOf(a*b);
		if(w==4){
			if(b==0)throw new IllegalArgumentException("Argument division by zero"); 
			return String.valueOf(a/b);
		}
		return null;
	}

	@Override
	public String current() {
		// TODO Auto-generated method stub
		if(History.getInstance().size()==0)return null;
		return History.getInstance().getcur();
	}

	@Override
	public String prev() {
		// TODO Auto-generated method stub
		if(History.getInstance().size()==0)return null;
		if(History.getInstance().size()==1)return null;
		return History.getInstance().getprev();
	}

	@Override
	public String next() {
		// TODO Auto-generated method stub
		if(History.getInstance().nextsize()==0)return null;
		return History.getInstance().getnext();
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		//if(History.getInstance().size()==0)throw new NullPointerException();
		write=new FileWriting();
		write.write(History.getInstance().getelementstosave());
	}

	@Override
	public void load() {
		// TODO Auto-generated method stub
		read= new FileRead();
		Stack<String> s=read.read();
		//if(s.size()==0)throw new NullPointerException();
		History.getInstance().load(s);
	}

}
