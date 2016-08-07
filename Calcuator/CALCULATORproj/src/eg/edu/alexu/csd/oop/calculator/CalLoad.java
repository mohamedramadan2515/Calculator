package eg.edu.alexu.csd.oop.calculator;

public class CalLoad implements Command{
	private Calculator cal;
	public CalLoad(Calculator newcal){
		cal = newcal;
	}
	@Override
	public void excute() {
		// TODO Auto-generated method stub
		cal.load();
	}
	
}
