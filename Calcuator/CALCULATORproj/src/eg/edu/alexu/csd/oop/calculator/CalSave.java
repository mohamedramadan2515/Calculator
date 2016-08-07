package eg.edu.alexu.csd.oop.calculator;

public class CalSave implements Command{
	private Calculator cal;
	public CalSave(Calculator newcal){
		cal=newcal;
	}
	
	@Override
	public void excute() {
		// TODO Auto-generated method stub
		cal.save();
	}
	
}
