import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class bank extends JFrame
{
	bank()
	{
		
		//panel1
		JPanel panel1=new JPanel();
		panel1.setBounds(10,10,1340,80);
		panel1.setBackground(new Color(0,0,0,100));
		
		JLabel l=new JLabel("***Add New Bank***");
		l.setBounds(300,10,800,100);
		l.setFont(new Font("arial",Font.BOLD,50));
		l.setForeground(Color.WHITE);
		panel1.add(l);
		
		//panel 2
		JPanel panel2=new JPanel();
		panel2.setLayout(null);
		panel2.setBackground(new Color(0,0,0,100));
		panel2.setBounds(350,100,650,360);
		
		//Frame
		setTitle("BANK");
		setSize(1400,750);
		setLayout(null);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Background
		ImageIcon img=new ImageIcon("images/agrosoft.jpg");
		Image im = img.getImage();
		Image temp_img=im.getScaledInstance(1400,750,Image.SCALE_SMOOTH);
		img=new ImageIcon(temp_img);
		JLabel background = new JLabel("",img,JLabel.CENTER);
        background.setBounds(0,0,1400,750);
		add(background);
		background.add(panel1);
		background.add(panel2);
		setVisible(true);
		
	}
}
class bankdemo
{
	public static void main(String[] args)
	{
		new bank();
	}
}