import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="conversion" width=500 height=500>
</applet>
*/
public class conversion extends JApplet
{
	public void init()
	{
		try
		{
			SwingUtilities.invokeLater(new Runnable()
			{
				public void run()
				{
					makeGUI();
				}
			});
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void makeGUI()
	{
		setLayout(new FlowLayout());
		JTextField a=new JTextField(10);
		add(a);
		JButton b = new JButton("Convert");
		add(b);
		JTextField j=new JTextField(10);
		add(j);
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				int binary=Integer.parseInt(a.getText());
				int decimal=0;
				int n=0;
				while(true)
				{  
					if(binary == 0)
					{  
						break;  
					} 
					else 
					{  
						int temp = binary%10;  
						decimal += temp*Math.pow(2, n);  
						binary = binary/10;  
						n++;  
					}  
				}  
				j.setText(String.valueOf(decimal));
			}
		});
	}
}