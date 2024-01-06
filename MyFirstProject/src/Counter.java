import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Counter extends Frame {
	TextField display;
	Button Increament,Reset,Decreament;
	
	Counter(){
		display=new TextField ("0");
		display.setBounds(50, 50, 300, 50);
		
		Reset=new Button("Reset");
		Reset.setBounds(100, 150, 50, 20);
		Reset.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			display.setText("0");
		}
		});

		
		Increament=new Button("Increament");
		Increament.setBounds(100, 200, 100, 20);
		Increament.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				int num=Integer.parseInt(display.getText());
				display.setText(String.valueOf(++num));
			}
		});
		
		Decreament=new Button("Decreament");
		Decreament.setBounds(100, 250, 100, 20);
		Decreament.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				int num=Integer.parseInt(display.getText());
				display.setText(String.valueOf(--num));
			}
		});
		
		add(display);
		add(Reset);
		add(Increament);
		add(Decreament);
		
		setTitle("Counter");
		setSize(500,500);
		setLayout(null);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Counter();
	
	}

}

