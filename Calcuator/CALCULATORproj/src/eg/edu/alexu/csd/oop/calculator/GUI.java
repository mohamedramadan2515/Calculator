package eg.edu.alexu.csd.oop.calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(102, 12, 213, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnPrev = new JButton("prev");
		btnPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=Calengine.getInstance().prev();
				if(a==null){
					JOptionPane.showMessageDialog(null, "There is no Previous Operation");
				}
				else
					textField.setText(a);
			}
		});
		btnPrev.setBounds(10, 46, 89, 23);
		frame.getContentPane().add(btnPrev);
		
		JButton button = new JButton("0");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String a=textField.getText();
				if(a==null)a="";
				a=a.concat("0");
				textField.setText(a);
			}
		});
		button.setBounds(113, 46, 89, 23);
		frame.getContentPane().add(button);
		
		JButton btnNext = new JButton("next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=Calengine.getInstance().next();
				if(a==null){
					JOptionPane.showMessageDialog(null, "There is no Next Operation");
				}
				else 
					textField.setText(a);
			}
		});
		btnNext.setBounds(226, 46, 89, 23);
		frame.getContentPane().add(btnNext);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String a=textField.getText();
				if(a==null)a="";
				a=a.concat("1");
				textField.setText(a);
			}
		});
		button_1.setBounds(10, 80, 89, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textField.getText();
				if(a==null)a="";
				a=a.concat("2");
				textField.setText(a);
			}
		});
		button_2.setBounds(113, 80, 89, 23);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textField.getText();
				if(a==null)a="";
				a=a.concat("3");
				textField.setText(a);
			}
		});
		button_3.setBounds(226, 80, 89, 23);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textField.getText();
				if(a==null)a="";
				a=a.concat("4");
				textField.setText(a);
			}
		});
		button_4.setBounds(10, 114, 89, 23);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textField.getText();
				if(a==null)a="";
				a=a.concat("5");
				textField.setText(a);
			}
		});
		button_5.setBounds(113, 114, 89, 23);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textField.getText();
				if(a==null)a="";
				a=a.concat("6");
				textField.setText(a);
			}
		});
		button_6.setBounds(226, 114, 89, 23);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textField.getText();
				if(a==null)a="";
				a=a.concat("7");
				textField.setText(a);
			}
		});
		button_7.setBounds(10, 148, 89, 23);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textField.getText();
				if(a==null)a="";
				a=a.concat("8");
				textField.setText(a);
			}
		});
		button_8.setBounds(113, 148, 89, 23);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textField.getText();
				if(a==null)a="";
				a=a.concat("9");
				textField.setText(a);
			}
		});
		button_9.setBounds(226, 148, 89, 23);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("+");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textField.getText();
				if(a==null)a="";
				a=a.concat("+");
				textField.setText(a);
			}
		});
		button_10.setBounds(335, 46, 89, 23);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("-");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textField.getText();
				if(a==null)a="";
				a=a.concat("-");
				textField.setText(a);
			}
		});
		button_11.setBounds(335, 80, 89, 23);
		frame.getContentPane().add(button_11);
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textField.getText();
				if(a==null)a="";
				a=a.concat("*");
				textField.setText(a);
			}
		});
		btnX.setBounds(335, 114, 89, 23);
		frame.getContentPane().add(btnX);
		
		JButton button_12 = new JButton("/");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textField.getText();
				if(a==null)a="";
				a=a.concat("/");
				textField.setText(a);
			}
		});
		button_12.setBounds(335, 148, 89, 23);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("=");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textField.getText();
				try{
					Calengine.getInstance().input(a);
					a=Calengine.getInstance().getResult();
				}
				catch(NullPointerException f){
					JOptionPane.showMessageDialog(null, "Invalid Input");
				}
				catch(IllegalArgumentException g){
					JOptionPane.showMessageDialog(null, "Illegal argument division by zero");

				}
				catch(RuntimeException v){
					JOptionPane.showMessageDialog(null, "There is no Current Operation");
				}
				textField.setText(a);
			}
		});
		button_13.setBounds(335, 182, 89, 23);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton(".");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textField.getText();
				if(a==null)a="";
				a=a.concat(".");
				textField.setText(a);
			}
		});
		button_14.setBounds(113, 182, 89, 23);
		frame.getContentPane().add(button_14);
		
		JButton btnSave = new JButton("save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					CalSave sav=new CalSave((Calculator)Calengine.getInstance());
					DeviceButton onPressed=new DeviceButton((Command)sav);
					onPressed.press();
				}
				catch(NullPointerException f){
					JOptionPane.showMessageDialog(null, "There is no history to save it");
				}
			}
		});
		btnSave.setBounds(10, 182, 89, 23);
		frame.getContentPane().add(btnSave);
		
		JButton btnLoad = new JButton("load");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					CalLoad load=new CalLoad((Calculator)Calengine.getInstance());
					DeviceButton onPressed=new DeviceButton((Command)load);
					onPressed.press();
				}
				catch(NullPointerException f){
					JOptionPane.showMessageDialog(null, "There is no file to load");
				}
			}
		});
		btnLoad.setBounds(226, 182, 89, 23);
		frame.getContentPane().add(btnLoad);
		
		JButton btnCurrent = new JButton("Current");
		btnCurrent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=Calengine.getInstance().current();
				if(a==null){
					JOptionPane.showMessageDialog(null, "There is no current operation");
				}
				else
					textField.setText(a);
			}
		});
		btnCurrent.setBounds(113, 227, 89, 23);
		frame.getContentPane().add(btnCurrent);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnClear.setBounds(226, 227, 89, 23);
		frame.getContentPane().add(btnClear);
	}
}
