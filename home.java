import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;
public class home extends JFrame
{
	home()
	{
		 //loginpanel
		JPanel panel=new JPanel();
		panel.setLayout(null);
		panel.setBorder(BorderFactory.createLineBorder(Color.BLUE,3));
        panel.setSize(1400,750);
        panel.setBackground(new Color(0,0,0,80));
		panel.setBounds(100,50,1125,550);
		
		//buttons
		
		//add customer
		ImageIcon customer = new ImageIcon("customer.jpg");
        JButton button1=new JButton("customer",customer);
		button1.setBounds(50,50,200,175);
		button1.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
		panel.add(button1);
		JLabel l1=new JLabel("Add Customer");
		l1.setBounds(80,215,200,50);
		l1.setFont(new Font("arial",Font.BOLD,20));
		l1.setForeground(Color.WHITE);
		panel.add(l1);
		
		 button1.addActionListener(new ActionListener()
		 {
            public void actionPerformed(ActionEvent e)
	          {
                   new customer();
				   dispose();
              }
         });
		 
		 //add product
		ImageIcon product = new ImageIcon("product.jpg");
        JButton button2=new JButton("product",product);
		button2.setBounds(300,50,200,175);
		button2.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
		panel.add(button2);
		JLabel l2=new JLabel("Product and Stock");
		l2.setBounds(310,215,200,50);
		l2.setFont(new Font("arial",Font.BOLD,20));
		l2.setForeground(Color.WHITE);
		panel.add(l2);
		
		 button2.addActionListener(new ActionListener()
		 {
            public void actionPerformed(ActionEvent e)
	          {
                   new product();
				   dispose();
              }
         });
		 
		 //bill
		ImageIcon bill = new ImageIcon("bill.jpg");
        JButton button3=new JButton("bill",bill);
		button3.setBounds(550,50,205,175);
		button3.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
		panel.add(button3);
		JLabel l3=new JLabel("Bill");
		l3.setBounds(630,215,200,50);
		l3.setFont(new Font("arial",Font.BOLD,20));
		l3.setForeground(Color.WHITE);
		panel.add(l3);
		
		 button3.addActionListener(new ActionListener()
		 {
            public void actionPerformed(ActionEvent e)
	          {
                   new bill();
				   dispose();
              }
         });
		
		//ADD party
		 ImageIcon party = new ImageIcon("seller.png");
        JButton button4=new JButton("party",party);
		button4.setBounds(810,50,210,175);
		button4.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
		panel.add(button4);
		JLabel l4=new JLabel("Manage Party");
		l4.setBounds(850,215,200,50);
		l4.setFont(new Font("arial",Font.BOLD,20));
		l4.setForeground(Color.WHITE);
		panel.add(l4);
		
		 button4.addActionListener(new ActionListener()
		 {
            public void actionPerformed(ActionEvent e)
	          {
                   new party();
				   dispose();
              }
         });
		
		
		//received check info
		ImageIcon received = new ImageIcon("received.jpg");
        JButton button5=new JButton("received",received);
		button5.setBounds(50,300,205,175);
		button5.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
		panel.add(button5);
		JLabel l5=new JLabel("Received Cheque Info");
		l5.setBounds(50,470,210,50);
		l5.setFont(new Font("arial",Font.BOLD,20));
		l5.setForeground(Color.WHITE);
		panel.add(l5);
		
		 button5.addActionListener(new ActionListener()
		 {
            public void actionPerformed(ActionEvent e)
	          {
                  new receivedcheck();
				  dispose();
              }
         });
		
		//given check info
		ImageIcon bank = new ImageIcon("given.jpg");
        JButton button6=new JButton("bank",bank);
		button6.setBounds(300,300,200,175);
		button6.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
		panel.add(button6);
		JLabel l6=new JLabel("Given Cheque Info");
		l6.setBounds(315,470,200,50);
		l6.setFont(new Font("arial",Font.BOLD,20));
		l6.setForeground(Color.WHITE);
		panel.add(l6);
		
		 button6.addActionListener(new ActionListener()
		 {
            public void actionPerformed(ActionEvent e)
	          {
                   new givencheck();
				   dispose();
              }
         });
		
		//logout
		ImageIcon logout = new ImageIcon("logout.png");
        JButton button7=new JButton("logout",logout);
		button7.setBounds(550,300,200,175);
		button7.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
		panel.add(button7);
		JLabel l7=new JLabel("Logout");
		l7.setBounds(615,470,200,50);
		l7.setFont(new Font("arial",Font.BOLD,20));
		l7.setForeground(Color.WHITE);
		panel.add(l7);
		
		 button7.addActionListener(new ActionListener()
		 {
            public void actionPerformed(ActionEvent e)
	          {
                   new login();
				   dispose();
              }
         });
		
		 
		
		 
		//Frame
		setTitle("HOME PAGE");
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
		setVisible(true);
		
	}
}

class homedemo
{
	public static void main(String[] args)
	{
		home h=new home();
	}
}








