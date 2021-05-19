import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class seller extends JFrame
{
	seller()
	{
		//panel 1
		JPanel panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0,0,0,100));
		panel.setBounds(10,100,1340,410);
		
		//panel 2
		JPanel panel2=new JPanel();
		panel2.setLayout(null);
		panel2.setBackground(new Color(0,0,0,100));
		panel2.setBounds(10,560,1340,100);
		
		//panel3
		//panel3
		JPanel panel3=new JPanel();
		panel3.setBounds(10,10,1340,80);
		panel3.setBackground(new Color(0,0,0,100));
		
		JLabel l=new JLabel("***Add New Seller***");
		l.setBounds(300,10,800,100);
		l.setFont(new Font("arial",Font.BOLD,50));
		l.setForeground(Color.WHITE);
		panel3.add(l);
		
		
		
		//signin
		JButton signin=new JButton("ADD");
		signin.setBounds(300,20,150,50);
		signin.setForeground(Color.BLUE);
		signin.setFont(new Font("arial",Font.BOLD,20));
		panel2.add(signin);

		
		//update
		JButton update=new JButton("UPDATE");
		update.setBounds(500,20,150,50);
		update.setForeground(Color.BLUE);
		update.setFont(new Font("arial",Font.BOLD,20));
		panel2.add(update);
		
		//delete
		JButton delete=new JButton("DELETE");
		delete.setBounds(700,20,150,50);
		delete.setForeground(Color.BLUE);
		delete.setFont(new Font("arial",Font.BOLD,20));
		panel2.add(delete);
		
		
		//home
		JButton home=new JButton("HOME");
		home.setBounds(900,20,100,50);
		home.setForeground(Color.BLUE);
		home.setFont(new Font("arial",Font.BOLD,20));
		panel2.add(home);
		
	    home.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				new home();
			}
		}
		);
		
		
		//Frame
		setTitle("SELLER INFO");
		setSize(1400,750);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Background
		ImageIcon img=new ImageIcon("agrosoft.jpg");
		Image im = img.getImage();
		Image temp_img=im.getScaledInstance(1400,750,Image.SCALE_SMOOTH);
		img=new ImageIcon(temp_img);
		JLabel background = new JLabel("",img,JLabel.CENTER);
        background.setBounds(0,0,1400,750);
		add(background);
		background.add(panel);
		background.add(panel2);
		background.add(panel3);
		setVisible(true);
		
	}
}
class sellerdemo
{
	public static void main(String[] args)
	{
		new seller();
	}
}