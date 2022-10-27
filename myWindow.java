package Clock;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;



public class myWindow extends JFrame {
	
	private JLabel heading;
	private JLabel clockLable;
	private Font font=new Font("",Font.BOLD,30);
	
	
	myWindow(){
		super.setTitle("Clock");
		super.setSize(500, 400);
		super.setLocation(300, 50);
		
		this.myGUI();
		this.startClock();
		super.setVisible(true);
		
	}


	public void myGUI() {
		// TODO Auto-generated method stub
		heading=new JLabel("MY clock");
		
		clockLable=new JLabel("My Lable");
		
		heading.setFont(font);
		
		clockLable.setFont(font);
		
		this.setLayout(new GridLayout(2,1));
		
		this.add(heading);
		
		this.add(clockLable);
		
	}
	public void startClock() {
		Timer timer=new Timer(1000, new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String dateTime=new Date().toLocaleString();
				
				clockLable.setText(dateTime);
			}
		});
		timer.start();
	}
	

}
