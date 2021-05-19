//login page
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;
import java.time.*;
import java.util.Date; 
import javax.swing.border.*;
import java.sql.*;
import java.util.*;
class AGRO extends JFrame
{
	AGRO()
	{
		Font f=new Font("arial",Font.BOLD,80);
		
		JPanel header=new JPanel();
		header.setBackground(new Color(0,0,0,100));    
		header.setBounds(0,0,1400,100);
		
		JLabel name=new JLabel("WELCOME");
		name.setFont(f);                             
		name.setForeground(Color.WHITE);            
		header.add(name);
		
		JPanel login=new JPanel();
		login.setLayout(null);
		login.setBorder(BorderFactory.createLineBorder(Color.YELLOW,5));
        login.setSize(400,350);
        login.setBackground(new Color(0,0,0,100));
		login.setBounds(500,175,400,350);
		
		JLabel l1=new JLabel("username");
		l1.setBounds(100,5,350,50);
		l1.setFont(new Font("arial",Font.BOLD,25));
		l1.setForeground(Color.WHITE);
		login.add(l1);
		
		JTextField user=new JTextField(20);
		user.setBounds(50,50,300,50);
		user.setForeground(Color.RED);
		user.setFont(new Font("arial",Font.BOLD,20));
		login.add(user);
		
	    JLabel l2=new JLabel("password");
		l2.setBounds(100,105,350,50);
		l2.setFont(new Font("arial",Font.BOLD,25));
		l2.setForeground(Color.WHITE);
		login.add(l2);	
		
		JPasswordField password=new JPasswordField(20);
        password.setBounds(50,155,300,50);
		user.setForeground(Color.RED);
		login.add(password);
		
		JButton b1=new JButton("login");
		b1.setBounds(50,230,100,50);
		b1.setFont(new Font("arial",Font.BOLD,25));
		b1.setBackground(Color.BLUE);
		b1.setForeground(Color.WHITE);
		login.add(b1);
		
		setTitle("login frame");
		setSize(1400,750);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		ImageIcon img=new ImageIcon("images/agrosoft.jpg");
		Image im = img.getImage();
		Image temp_img=im.getScaledInstance(1400,750,Image.SCALE_SMOOTH);
		img=new ImageIcon(temp_img);
		JLabel background = new JLabel("",img,JLabel.CENTER);
        background.setBounds(0,0,1400,750);
		add(background);
		background.add(header);
        background.add(login);
		setVisible(true); 
		
	    b1.addActionListener(new ActionListener()
		{
      public void actionPerformed(ActionEvent e)
	  {
        String username=user.getText();
		char[] pass=password.getPassword();
		String pwd="";
		for(char x:pass)
			pwd+=x;
          if((username.equals("amolhase")) && (pwd.equals("amol2260"))) 
		  {
            new home();
			dispose();
          } 
          else 
		  {
			  JOptionPane.showMessageDialog(null,"Wrong Username / Password");
			  user.setText(null);
              password.setText(null);
          }

      }
    });	
		JButton exit=new JButton("EXIT");
		exit.setBounds(250,230,100,50);
		exit.setForeground(Color.WHITE);
		exit.setFont(new Font("arial",Font.BOLD,20));
		exit.setBackground(Color.BLUE);
		login.add(exit);
		
	    exit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				System.exit(0);
			}
		}
		);	
}
public static void main(String[] args)
	{
		 new AGRO();
	}

}
//home page
 class home extends JFrame
{
	home()
	{
		JPanel panel=new JPanel();
		panel.setLayout(null);
		panel.setBorder(BorderFactory.createLineBorder(Color.BLUE,3));
        panel.setSize(1400,750);
        panel.setBackground(new Color(0,0,0,80));
		panel.setBounds(100,50,1125,550);
		
		ImageIcon customer = new ImageIcon("images/customer.jpg");
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
		ImageIcon product = new ImageIcon("images/product.jpg");
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
		ImageIcon bill = new ImageIcon("images/bill.jpg");
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
		 ImageIcon party = new ImageIcon("images/seller.png");
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
		ImageIcon received = new ImageIcon("images/received.jpg");
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
		ImageIcon bank = new ImageIcon("images/given.jpg");
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
		ImageIcon logout = new ImageIcon("images/logout.png");
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
                  // new login();
				   dispose();
              }
         }); 
		 
		setTitle("HOME PAGE");
		setSize(1400,750);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		ImageIcon img=new ImageIcon("images/agrosoft.jpg");
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
//customer page
class customer extends JFrame
{
	JTextField t1;
	customer()
	{
		JPanel panel2=new JPanel();
		panel2.setLayout(null);
		panel2.setBackground(new Color(0,0,0,100));
		panel2.setBorder(BorderFactory.createLineBorder(Color.BLUE,3));
		panel2.setBounds(200,90,950,530);
		try
		{
	            	String driverClassName="com.mysql.jdbc.Driver";
		            String url="jdbc:mysql://localhost:3306/agrosoft_amol";
		            String user="root";
		            String password = "amol2260";
		            Class.forName("com.mysql.jdbc.Driver");
	                 
					 Connection con = null;
		             con = DriverManager.getConnection(url,user,password);
		             System.out.println("con-->"+con);
					Statement stmt=con.createStatement();
					ResultSet rs = stmt.executeQuery("SELECT max(customer_id) from customer");
					rs.next();
					int id=rs.getInt("max(customer_id)");
					id+=1; 
					
		JLabel l1=new JLabel("Customer Id");
		l1.setBounds(140,10,200,50);
		l1.setFont(new Font("arial",Font.BOLD,17));
		l1.setForeground(Color.WHITE);
		panel2.add(l1);
		
		t1=new JTextField("");
		t1.setBounds(250,20,190,30);
		t1.setText(""+id);
		t1.setForeground(Color.RED);
		t1.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t1);
	}
		catch(Exception e)
		{
			
		}
		
		JLabel l2=new JLabel("Customer Name");
		l2.setBounds(550,10,200,50);
		l2.setFont(new Font("arial",Font.BOLD,17));
		l2.setForeground(Color.WHITE);
		panel2.add(l2);
		
		JTextField t2=new JTextField("");
		t2.setBounds(690,20,190,30);
		t2.setForeground(Color.RED);
		t2.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t2);
		
		JLabel l3=new JLabel("Customer Aadhar");
		l3.setBounds(100,80,200,50);
		l3.setFont(new Font("arial",Font.BOLD,17));
		l3.setForeground(Color.WHITE);
		panel2.add(l3);	
		
		JTextField t3=new JTextField("");
		t3.setBounds(250,90,190,30);
		t3.setForeground(Color.RED);
		t3.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t3);
		
		
		JLabel l4=new JLabel("Gender");
		l4.setBounds(620,80,200,50);
		l4.setFont(new Font("arial",Font.BOLD,17));
		l4.setForeground(Color.WHITE);
		panel2.add(l4);
		
		String gender[]={"Male","Female"};        
        JComboBox g=new JComboBox(gender); 
        g.setFont(new Font("arial",Font.BOLD,17));
		g.setBounds(690,90,190,30);
        panel2.add(g); 
		
		JLabel l5=new JLabel("Customer Address");
		l5.setBounds(90,160,200,50);
		l5.setFont(new Font("arial",Font.BOLD,17));
		l5.setForeground(Color.WHITE);
		panel2.add(l5);
		
		JTextField t5=new JTextField("");
		t5.setBounds(250,170,190,30);
		t5.setForeground(Color.RED);
		t5.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t5);
		
		JLabel l6=new JLabel("mobile");
		l6.setBounds(625,160,200,50);
		l6.setFont(new Font("arial",Font.BOLD,17));
		l6.setForeground(Color.WHITE);
		panel2.add(l6);
		
		JTextField t6=new JTextField("");
		t6.setBounds(690,170,190,30);
		t6.setForeground(Color.RED);
		t6.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t6);
		
		
		JLabel l7=new JLabel("Pending_amount");
		l7.setBounds(110,225,200,50);
		l7.setFont(new Font("arial",Font.BOLD,17));
		l7.setForeground(Color.WHITE);
		panel2.add(l7);
		
		double pa=0.0;
		JTextField t7=new JTextField("");
		t7.setBounds(250,240,190,30);
		t7.setForeground(Color.RED);
		t7.setText(""+pa);
		t7.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t7);
		
		JButton add=new JButton("Submit");
		add.setBounds(240,310,100,50);
		add.setForeground(Color.WHITE);
		add.setBackground(Color.BLUE);
		add.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(add);
	
		
		add.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(t1.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"insert customer id");
				}
				else if(t2.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"insert customer name");
				}
				else if(t3.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"insert customer aadhar number");
				}
				else if(t3.getText().length() != 12)
				{
					JOptionPane.showMessageDialog(null,"invalid Aadhar number");
				}
				else if(t5.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"insert customer address");
				}
				else if(t6.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"insert mobile number");
				}
				else if(t6.getText().length() != 10)
				{
					JOptionPane.showMessageDialog(null,"invalid mobile number");
				}
				else if(t7.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"set pending amount to 0");
				}	
			else 
			{
				int value1;
				double value3,value6,value7;	
				String id,value2,adh,value4,value5,mbl,amt;
				 id = t1.getText();
				 value1 = Integer.parseInt(id);
				 value2 = t2.getText();
				 adh = t3.getText();
				 value3 = Double.parseDouble(adh);
				String selected = (String)g.getSelectedItem();
                 if(selected.equals("Male"))
                   value4 = "male";
			     else
					 value4 = "female";
				 value5 = t5.getText();
				 mbl = t6.getText();
				 value6 = Double.parseDouble(mbl);
				 amt = t7.getText();
				 value7 = Double.parseDouble(amt);
				try
				   {
                
					String driverClassName="com.mysql.jdbc.Driver";
		            String url="jdbc:mysql://localhost:3306/agrosoft_amol";
		            String user="root";
		            String password = "amol2260";
		            Class.forName("com.mysql.jdbc.Driver");
	                 Connection con = null;
		             con = DriverManager.getConnection(url,user,password);
		             System.out.println("con-->"+con);
					PreparedStatement st = null;
		            st = con.prepareStatement("insert into customer values(?,?,?,?,?,?,?)"); 
					 st.setInt(1,value1);
					 st.setString(2,value2);
					 st.setString(3,value5);
					 st.setString(4,value4);
					 st.setDouble(5,value3);
					 st.setDouble(6,value6);
					 st.setDouble(7,value7);
					 st.executeUpdate();
					 
					 value1+=1;
					 t1.setText(""+value1);
					 
				     t2.setText(null);
				     t3.setText(null);
				     t5.setText(null);
				     t6.setText(null);
				     t7.setText(null);
					 
						 JOptionPane.showMessageDialog(null,"Customer record inserted successfully");
	                	st.close();
	                	con.close();
		}
				 catch(Exception e)
				 {
					 System.out.println(e);
				 }
			}
			}
		});
		
		JButton view=new JButton("View");
		view.setBounds(370,310,100,50);
		view.setForeground(Color.WHITE);
		view.setBackground(Color.BLUE);
		view.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(view);
		view.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				 custdata c = new custdata();
                 c.setBounds(200,200,600,500);
                 c.pack();
                 c.setVisible(true);
			}
		}
		);
		JButton delete=new JButton("Delete");
		delete.setBounds(120,370,100,50);
		delete.setForeground(Color.WHITE);
		delete.setBackground(Color.BLUE);
		delete.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(delete);
		
		JLabel del = new JLabel("Delete by aadhar");
		del.setBounds(250,370,300,40);
		del.setForeground(Color.YELLOW);
		del.setFont(new Font("arial",Font.BOLD,20));
		panel2.add(del);
		
		JTextField tdel = new JTextField("");
		tdel.setBounds(430,375,150,30);
		tdel.setForeground(Color.BLUE);
		tdel.setFont(new Font("arial",Font.BOLD,20));
		panel2.add(tdel);
		
		delete.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(tdel.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"insert aadhar number");
				}
				else
				{
				String adh;
				double value1;
				adh=tdel.getText();
				value1 = Double.parseDouble(adh);
				try
				   {
                
					String driverClassName="com.mysql.jdbc.Driver";
		            String url="jdbc:mysql://localhost:3306/agrosoft_amol";
		            String user="root";
		            String password = "amol2260";
		            Class.forName("com.mysql.jdbc.Driver");
	                 
					 Connection con = null;
		             con = DriverManager.getConnection(url,user,password);
		             System.out.println("con-->"+con);
					PreparedStatement st = null;
		            st = con.prepareStatement("delete from customer where aadhar_no = ?");
					 st.setDouble(1,value1);
					 st.executeUpdate();
					tdel.setText(null);	
					
						 JOptionPane.showMessageDialog(null,"Customer record deleted successfully");
						 
	                	st.close();
	                	con.close();
	            	}  
				 catch(Exception e)
				 {
					 System.out.println(e);
				 }
				}
			}
		
		});
		JButton update=new JButton("Update");
		update.setBounds(120,440,120,50);
		update.setForeground(Color.WHITE);
		update.setBackground(Color.BLUE);
		update.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(update);
		
		JLabel up = new JLabel("aadhar");
		up.setBounds(250,440,100,40);
		up.setForeground(Color.YELLOW);
		up.setFont(new Font("arial",Font.BOLD,20));
		panel2.add(up);
		
		JTextField tup = new JTextField("");
		tup.setBounds(340,440,150,30);
		tup.setForeground(Color.BLUE);
		tup.setFont(new Font("arial",Font.BOLD,20));
		panel2.add(tup);
		
		JLabel up1 = new JLabel("amount");
		up1.setBounds(530,440,100,40);
		up1.setForeground(Color.YELLOW);
		up1.setFont(new Font("arial",Font.BOLD,20));
		panel2.add(up1);
		
		JTextField tup1 = new JTextField("");
		tup1.setBounds(620,440,150,30);
		tup1.setForeground(Color.BLUE);
		tup1.setFont(new Font("arial",Font.BOLD,20));
		panel2.add(tup1);
		
		update.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(tup.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"insert aadhar number");
				}
				else if(tup1.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"insert amount");
				}
				else
				{
				String adh,amt;
				double value1,value2;
				amt = tup1.getText();
				value1 = Double.parseDouble(amt);
				adh=tup.getText();
				value2 = Double.parseDouble(adh);
				try
				   {
                
					String driverClassName="com.mysql.jdbc.Driver";
		            String url="jdbc:mysql://localhost:3306/agrosoft_amol";
		            String user="root";
		            String password = "amol2260";
		            Class.forName("com.mysql.jdbc.Driver");
	                
					Connection con = null;
		             con = DriverManager.getConnection(url,user,password);
		             System.out.println("con-->"+con);
					PreparedStatement st = null;
		            st = con.prepareStatement("update customer set pending_amt = pending_amt-? where aadhar_no=?");
					 st.setDouble(1,value1);
					 st.setDouble(2,value2);
					 st.executeUpdate();
					
					tup.setText(null);
					tup1.setText(null);
					
						 JOptionPane.showMessageDialog(null,"Customer record updated successfully");
	                	
						st.close();
	                	con.close();
	            	}
				 catch(Exception e)
				 {
					 System.out.println(e);
				 }
				}
			}
		});
		JButton back=new JButton("Back");
		back.setBounds(510,310,100,50);
		back.setForeground(Color.WHITE);
		back.setBackground(Color.BLUE);
		back.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(back);
		
	    back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				new home();
				dispose();
			}
		}
		);
		setTitle("CUSTOMER INFO");
		setSize(1400,750);
		setLayout(null);
		ImageIcon img=new ImageIcon("agrosoft.jpg");
		Image im = img.getImage();
		Image temp_img=im.getScaledInstance(1400,750,Image.SCALE_SMOOTH);
		img=new ImageIcon(temp_img);
		JLabel background = new JLabel("",img,JLabel.CENTER);
        background.setBounds(0,0,1400,750);
		add(background);
		background.add(panel2);
		setVisible(true);
	}
}

//customerdata page
class custdata extends JFrame
{
    public custdata()
	{
		
        ArrayList columnNames = new ArrayList();
        ArrayList data = new ArrayList();
                    String url="jdbc:mysql://localhost:3306/agrosoft_amol";
		            String user="root";
		            String password = "amol2260";
		            String sql = "SELECT * FROM customer";

        try (Connection connection = DriverManager.getConnection( url, user, password );
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery( sql ))
        {
            ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();

            for (int i = 1; i <= columns; i++)
            {
                columnNames.add( md.getColumnName(i) );
            }

            while (rs.next())
            {
                ArrayList row = new ArrayList(columns);

                for (int i = 1; i <= columns; i++)
                {
                    row.add( rs.getObject(i) );
                }

                data.add( row );
            }
        }
        catch (SQLException e)
        {
            System.out.println( e.getMessage() );
        }

        Vector columnNamesVector = new Vector();
        Vector dataVector = new Vector();

        for (int i = 0; i < data.size(); i++)
        {
            ArrayList subArray = (ArrayList)data.get(i);
            Vector subVector = new Vector();
            for (int j = 0; j < subArray.size(); j++)
            {
                subVector.add(subArray.get(j));
            }
            dataVector.add(subVector);
        }

        for (int i = 0; i < columnNames.size(); i++ )
            columnNamesVector.add(columnNames.get(i));
  
        JTable table = new JTable(dataVector, columnNamesVector)
        {
            public Class getColumnClass(int column)
            {
                for (int row = 0; row < getRowCount(); row++)
                {
                    Object o = getValueAt(row, column);

                    if (o != null)
                    {
                        return o.getClass();
                    }
                }

                return Object.class;
            }
        };
		
		 JScrollPane pane = new JScrollPane( table );
		pane.setBounds(20,20,300,100);
        getContentPane().add( pane );
		
    }
}

//product page
class product extends JFrame
{
	product()
	{
		JPanel panel2=new JPanel();
		panel2.setLayout(null);
		panel2.setBackground(new Color(0,0,0,100));
		panel2.setBorder(BorderFactory.createLineBorder(Color.BLUE,3));
		panel2.setBounds(190,60,950,560);
		
		JLabel l1=new JLabel("Batch No.");
		l1.setBounds(100,10,200,80);
		l1.setForeground(Color.WHITE);
		l1.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(l1);
		
		JTextField t1=new JTextField("");
		t1.setBounds(200,35,200,30);
		t1.setForeground(Color.BLUE);
		t1.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t1);
		
		JLabel l2=new JLabel("Product Name");
		l2.setBounds(530,10,200,80);
		l2.setForeground(Color.WHITE);
		l2.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(l2);
		
		JTextField t2=new JTextField("");
		t2.setBounds(660,35,200,30);
		t2.setForeground(Color.BLUE);
		t2.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t2);
		
		JLabel l3=new JLabel("Company Name");
		l3.setBounds(60,75,200,80);
		l3.setFont(new Font("arial",Font.BOLD,17));
		l3.setForeground(Color.WHITE);
		panel2.add(l3);
		
		JTextField t3=new JTextField("");
		t3.setBounds(200,105,200,30);
		t3.setForeground(Color.BLUE);
		t3.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t3); 
			
		
		JLabel l4=new JLabel("Size");
		l4.setBounds(600,85,200,80);
		l4.setForeground(Color.WHITE);
		l4.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(l4);
		
		String size[]={"100","250","500","1000"};        
        JComboBox s=new JComboBox(size); 
        s.setFont(new Font("arial",Font.BOLD,20));		
        s.setBounds(660,105,200,30);    
        panel2.add(s); 
		
		JLabel l5=new JLabel("Mfg Date");
		l5.setBounds(110,150,200,80);
		l5.setForeground(Color.WHITE);
		l5.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(l5);
		
		JTextField t5=new JTextField("");
		t5.setBounds(200,175,200,30);
		t5.setForeground(Color.BLUE);
		t5.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t5);
		
		JLabel l6=new JLabel("Exp Date");
		l6.setBounds(570,150,200,80);
		l6.setForeground(Color.WHITE);
		l6.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(l6);
		
		JTextField t6=new JTextField("");
		t6.setBounds(660,175,200,30);
		t6.setForeground(Color.BLUE);
		t6.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t6);
		
		JLabel l7=new JLabel("Rate");
		l7.setBounds(160,230,200,80);
		l7.setForeground(Color.WHITE);
		l7.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(l7);
		
		JTextField t7=new JTextField("");
		t7.setBounds(200,250,200,30);
		t7.setForeground(Color.BLUE);
		t7.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t7);
		
		JLabel l8=new JLabel("GST");
		l8.setBounds(610,230,200,80);
		l8.setForeground(Color.WHITE);
		l8.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(l8);
		
		JTextField t8=new JTextField("");
		t8.setBounds(660,250,200,30);
		t8.setForeground(Color.BLUE);
		t8.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t8);
		
		JLabel l9=new JLabel("Quantity");
		l9.setBounds(120,300,200,80);
		l9.setForeground(Color.WHITE);
		l9.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(l9);
		
		JTextField t9=new JTextField("");
		t9.setBounds(200,320,200,30);
		t9.setForeground(Color.BLUE);
		t9.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t9);
		
		JButton add=new JButton("Submit");
		add.setBounds(140,400,100,50);
		add.setForeground(Color.WHITE);
		add.setBackground(Color.BLUE);
		add.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(add);
		
		add.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
					if(t1.getText().trim().isEmpty())
					{
						JOptionPane.showMessageDialog(null,"batch no is empty");
					}
					else if(t2.getText().trim().isEmpty())
					{
						JOptionPane.showMessageDialog(null,"product name is empty");
					}
					else if(t3.getText().trim().isEmpty())
					{
						JOptionPane.showMessageDialog(null,"company name is empty");
					}
					else if(t5.getText().trim().isEmpty())
					{
						JOptionPane.showMessageDialog(null,"manufacturing date is empty");
					}
					else if(t6.getText().trim().isEmpty())
					{
						JOptionPane.showMessageDialog(null,"expiry date is empty");
					}
					else if(t7.getText().trim().isEmpty())
					{
						JOptionPane.showMessageDialog(null,"rate field is empty");
					}
					else if(t8.getText().trim().isEmpty())
					{
						JOptionPane.showMessageDialog(null,"gst field is empty");
					}
					else if(t9.getText().trim().isEmpty())
					{
						JOptionPane.showMessageDialog(null,"quantity field is empty");
					}
					else
					{
				String value1,value2,value3,sz,value5,value6,rt,gst,quantity;
				int value4,value9;
				double value7,value8;
				 value1=t1.getText();
				 value2 = t2.getText();
				 value3 = t3.getText();
				String selected = (String)s.getSelectedItem();
                 if(selected.equals("100"))
				 {
					 sz="100";
					 value4 = Integer.parseInt(sz);
				 }
			     else
					 if(selected.equals("250"))
					 {
						 sz = "250";
						 value4 = Integer.parseInt(sz);
					 }
				 else if(selected.equals("500"))
				 {
					 sz="500";
					 value4 = Integer.parseInt(sz);
				 }
				 else
				 {
					 sz = "1000";
					 value4 = Integer.parseInt(sz);
				 }
				 value5 = t5.getText();
				 value6 = t6.getText();
				rt = t7.getText();
				value7 = Double.parseDouble(rt);
				 gst = t8.getText();
				 value8 = Double.parseDouble(gst);
				 quantity = t9.getText();
				 value9 = Integer.parseInt(quantity);
				
				try
				   {
                
					String driverClassName="com.mysql.jdbc.Driver";
		            String url="jdbc:mysql://localhost:3306/agrosoft_amol";
		            String user="root";
		            String password = "amol2260";
		
		            Class.forName("com.mysql.jdbc.Driver");
	
	                 Connection con = null;
		             con = DriverManager.getConnection(url,user,password);
		             System.out.println("con-->"+con);
					
					PreparedStatement st = null;
		            st = con.prepareStatement("insert into product values(?,?,?,?,?,?,?,?,?)");
					 
					 st.setString(1,value1);
					 st.setString(2,value2);
					 st.setString(3,value3);
					 st.setInt(4,value4);
					 st.setString(5,value5);
					 st.setString(6,value6);
					 st.setDouble(7,value7);
					 st.setDouble(8,value8);
					 st.setInt(9,value9);
					 
					 st.executeUpdate();
					 
					 t1.setText(null);
				     t2.setText(null);
				     t3.setText(null);
				     t5.setText(null);
					 t6.setText(null);
					 t7.setText(null);
					 t8.setText(null);
					 t9.setText(null);
					 
						 JOptionPane.showMessageDialog(null,"Product record inserted successfully");
	                	st.close();
	                	con.close();            
		}
				 catch(Exception e)
				 {
					 System.out.println(e);
				 }
					}
			}
		});
		
		JButton view=new JButton("View");
		view.setBounds(280,400,100,50);
		view.setForeground(Color.WHITE);
		view.setBackground(Color.BLUE);
		view.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(view);
		
		view.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				 prodata p = new prodata();
                 p.pack();
				 p.setBounds(400,200,700,400);
                 p.setVisible(true);
			}
		});
		
		JButton update=new JButton("Update");
		update.setBounds(420,400,120,50);
		update.setForeground(Color.WHITE);
		update.setBackground(Color.BLUE);
		update.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(update);
		
		update.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				new proupdate();
				dispose();
			}
		});
		
		JButton delete=new JButton("Delete");
		delete.setBounds(140,480,100,50);
		delete.setForeground(Color.WHITE);
		delete.setBackground(Color.BLUE);
		delete.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(delete);
		
		JLabel del = new JLabel("Delete by Batch No.");
		del.setBounds(270,480,300,40);
		del.setForeground(Color.YELLOW);
		del.setFont(new Font("arial",Font.BOLD,20));
		panel2.add(del);
		
		JTextField tdel = new JTextField("");
		tdel.setBounds(460,480,150,30);
		tdel.setForeground(Color.BLUE);
		tdel.setFont(new Font("arial",Font.BOLD,20));
		panel2.add(tdel);
		
		delete.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(tdel.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"insert Batch Number");
				}
				else
				{
				String batch;
				batch=tdel.getText();
				try
				   {
                
					String driverClassName="com.mysql.jdbc.Driver";
		            String url="jdbc:mysql://localhost:3306/agrosoft_amol";
		            String user="root";
		            String password = "amol2260";
		
		            Class.forName("com.mysql.jdbc.Driver");
	
	                 Connection con = null;
		             con = DriverManager.getConnection(url,user,password);
		             System.out.println("con-->"+con);
					
					PreparedStatement st = null;
		            st = con.prepareStatement("delete from product where batch_no = ?");
					 
					 st.setString(1,batch);
					 
					 st.executeUpdate();
					 
					tdel.setText(null);
					
						 JOptionPane.showMessageDialog(null,"Product deleted successfully");
	                	st.close();
	                	con.close();
	            	}  
				 catch(Exception e)
				 {
					 System.out.println(e);
				 }
				}
			}
		});
		
		JButton back=new JButton("Back");
		back.setBounds(570,400,100,50);
		back.setForeground(Color.WHITE);
		back.setBackground(Color.BLUE);
		back.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(back);
		
	    back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				new home();
				dispose();
			}
		}
		);

		setTitle("PRODUCT INFO");
		setSize(1400,750);
		setLayout(null);
	
		ImageIcon img=new ImageIcon("agrosoft.jpg");
		Image im = img.getImage();
		Image temp_img=im.getScaledInstance(1400,750,Image.SCALE_SMOOTH);
		img=new ImageIcon(temp_img);
		JLabel background = new JLabel("",img,JLabel.CENTER);
        background.setBounds(0,0,1400,750);
		add(background);
		background.add(panel2);
		setVisible(true);
		
	}
}

//product update page
class proupdate extends JFrame
{
	proupdate()
	{
		JPanel panel2=new JPanel();
		panel2.setLayout(null);
		panel2.setBorder(BorderFactory.createLineBorder(Color.GREEN,5));
		panel2.setBackground(new Color(0,0,0,100));
		panel2.setBounds(220,100,880,400);
		
		JLabel l1=new JLabel("Batch No.");
		l1.setBounds(80,10,200,80);
		l1.setForeground(Color.WHITE);
		l1.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(l1);
		
		JTextField t1=new JTextField("");
		t1.setBounds(170,35,200,30);
		t1.setForeground(Color.BLUE);
		t1.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t1);
		
		JLabel l2=new JLabel("Product Name");
		l2.setBounds(490,10,200,80);
		l2.setForeground(Color.WHITE);
		l2.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(l2);
		
		JTextField t2=new JTextField("");
		t2.setBounds(610,35,200,30);
		t2.setForeground(Color.BLUE);
		t2.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t2);
		
		JLabel l3=new JLabel("Company Name");
		l3.setBounds(40,75,200,80);
		l3.setFont(new Font("arial",Font.BOLD,17));
		l3.setForeground(Color.WHITE);
		panel2.add(l3);
		
		JTextField t3=new JTextField("");
		t3.setBounds(170,105,200,30);
		t3.setForeground(Color.BLUE);
		t3.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t3); 
		
		JLabel l4=new JLabel("Size");
		l4.setBounds(560,80,200,80);
		l4.setForeground(Color.WHITE);
		l4.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(l4);
		
		String size[]={"100","250","500","1000"};        
        JComboBox s=new JComboBox(size); 
        s.setFont(new Font("arial",Font.BOLD,20));		
        s.setBounds(610,105,200,30);    
        panel2.add(s); 
	
		JLabel l5=new JLabel("Mfg Date");
		l5.setBounds(90,150,200,80);
		l5.setForeground(Color.WHITE);
		l5.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(l5);
		
		JTextField t5=new JTextField("");
		t5.setBounds(170,175,200,30);
		t5.setForeground(Color.BLUE);
		t5.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t5);
		
		JLabel l6=new JLabel("Expiry Date");
		l6.setBounds(510,150,200,80);
		l6.setForeground(Color.WHITE);
		l6.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(l6);
		
		JTextField t6=new JTextField("");
		t6.setBounds(610,175,200,30);
		t6.setForeground(Color.BLUE);
		t6.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t6);
		
		JLabel l7=new JLabel("Quantity");
		l7.setBounds(90,220,200,80);
		l7.setForeground(Color.WHITE);
		l7.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(l7);
		
		JTextField t7=new JTextField("");
		t7.setBounds(170,245,200,30);
		t7.setForeground(Color.BLUE);
		t7.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t7);
		
		JButton update=new JButton("Update");
		update.setBounds(300,300,100,50);
		update.setForeground(Color.WHITE);
		update.setBackground(Color.BLUE);
		update.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(update);
		
		update.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				new proupdate();
				if(t1.getText().trim().isEmpty())
					{
						JOptionPane.showMessageDialog(null,"batch no is empty");
					}
					else if(t2.getText().trim().isEmpty())
					{
						JOptionPane.showMessageDialog(null,"product name is empty");
					}
					else if(t3.getText().trim().isEmpty())
					{
						JOptionPane.showMessageDialog(null,"company name is empty");
					}
					else if(t5.getText().trim().isEmpty())
					{
						JOptionPane.showMessageDialog(null,"manufacturing date is empty");
					}
					else if(t6.getText().trim().isEmpty())
					{
						JOptionPane.showMessageDialog(null,"expiry date is empty");
					}
					else if(t7.getText().trim().isEmpty())
					{
						JOptionPane.showMessageDialog(null,"quantity field is empty");
					}
					else
					{
				String value1,value2,value3,sz,value5,value6,quantity;
				int value4,value7;
				 value1=t1.getText();
				 value2 = t2.getText();
				 value3 = t3.getText();
				String selected = (String)s.getSelectedItem();
                 if(selected.equals("100"))
				 {
					 sz="100";
					 value4 = Integer.parseInt(sz);
				 }
			     else
					 if(selected.equals("250"))
					 {
						 sz = "250";
						 value4 = Integer.parseInt(sz);
					 }
				 else if(selected.equals("500"))
				 {
					 sz="500";
					 value4 = Integer.parseInt(sz);
				 }
				 else
				 {
					 sz = "1000";
					 value4 = Integer.parseInt(sz);
				 }
				 value5 = t5.getText();
				 value6 = t6.getText();
				 quantity = t7.getText();
				 value7 = Integer.parseInt(quantity);
				
				try
				   {
                
					String driverClassName="com.mysql.jdbc.Driver";
		            String url="jdbc:mysql://localhost:3306/agrosoft_amol";
		            String user="root";
		            String password = "amol2260";
		
		            Class.forName("com.mysql.jdbc.Driver");
	
	                 Connection con = null;
		             con = DriverManager.getConnection(url,user,password);
					
					String s="update product set batch_no=?,mfg_date=?,expiry_date=?,quantity=? where pname=? and company=? and size=?";
					 PreparedStatement st =con.prepareStatement(s);
					 st.setString(1,value1);
					 st.setString(2,value5);
					 st.setString(3,value6);
					 st.setInt(4,value7);
					 st.setString(5,value2);
					 st.setString(6,value3);
					 st.setInt(7,value4);
					 
					 st.executeUpdate();
					 
					 t1.setText(null);
				     t2.setText(null);
				     t3.setText(null);
				     t5.setText(null);
					 t6.setText(null);
					 t7.setText(null);
					
						 JOptionPane.showMessageDialog(null,"Product update successfully");
	                	st.close();
	                	con.close();               
		
		}
				 catch(Exception e)
				 {
					 System.out.println(e);
				 }
					}
			}
		});
		
		JButton back=new JButton("Back");
		back.setBounds(450,300,100,50);
		back.setForeground(Color.WHITE);
		back.setBackground(Color.BLUE);
		back.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(back);
		
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				new product();
				dispose();
			}
		});	 
		
		setTitle("Update Stock");
		setSize(1400,750);
		setLayout(null);
		
		ImageIcon img=new ImageIcon("agrosoft.jpg");
		Image im = img.getImage();
		Image temp_img=im.getScaledInstance(1400,750,Image.SCALE_SMOOTH);
		img=new ImageIcon(temp_img);
		JLabel background = new JLabel("",img,JLabel.CENTER);
        background.setBounds(0,0,1400,750);
		add(background);
		background.add(panel2);
		setVisible(true);
		
	}
}

//product data page
class prodata extends JFrame
{
    public prodata()
	{
		
        ArrayList columnNames = new ArrayList();
        ArrayList data = new ArrayList();

                    String url="jdbc:mysql://localhost:3306/agrosoft_amol";
		            String user="root";
		            String password = "amol2260";
		            String sql = "SELECT * FROM product";

        try (Connection connection = DriverManager.getConnection( url, user, password );
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery( sql ))
        {
            ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();

            for (int i = 1; i <= columns; i++)
            {
                columnNames.add( md.getColumnName(i) );
            }

            while (rs.next())
            {
                ArrayList row = new ArrayList(columns);

                for (int i = 1; i <= columns; i++)
                {
                    row.add( rs.getObject(i) );
                }

                data.add( row );
            }
        }
        catch (SQLException e)
        {
            System.out.println( e.getMessage() );
        }

        Vector columnNamesVector = new Vector();
        Vector dataVector = new Vector();

        for (int i = 0; i < data.size(); i++)
        {
            ArrayList subArray = (ArrayList)data.get(i);
            Vector subVector = new Vector();
            for (int j = 0; j < subArray.size(); j++)
            {
                subVector.add(subArray.get(j));
            }
            dataVector.add(subVector);
        }

        for (int i = 0; i < columnNames.size(); i++ )
            columnNamesVector.add(columnNames.get(i));

        JTable table = new JTable(dataVector, columnNamesVector)
        {
            public Class getColumnClass(int column)
            {
                for (int row = 0; row < getRowCount(); row++)
                {
                    Object o = getValueAt(row, column);

                    if (o != null)
                    {
                        return o.getClass();
                    }
                }

                return Object.class;
            }
        };
		
		 JScrollPane pane = new JScrollPane( table );
		pane.setBounds(20,20,300,100);
        getContentPane().add( pane );
		
    }
}

//bill page
class bill extends JFrame
{
	int j=0,k=0,i=1;
	JTextField tpamount;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25;
	JTextField t26,t27,t28,t29,t30,t31,t32,t33,t34,t35,t36,t37,t38,t39,t40,t41,t42,t43,t44,t45,t46,t47,t48,t49,t50;
	double total_amount;
	bill()
	{
		JPanel panel2 = new JPanel();
		panel2.setBorder(BorderFactory.createLineBorder(Color.BLUE,3));
		panel2.setLayout(null);
		panel2.setBounds(60,90,1200,480);
		panel2.setBackground(new Color(0,0,0,100));
		
		try
		{
	            	String driverClassName="com.mysql.jdbc.Driver";
		            String url="jdbc:mysql://localhost:3306/agrosoft_amol";
		            String user="root";
		            String password = "amol2260";
		
		            Class.forName("com.mysql.jdbc.Driver");
	
	                 Connection con = null;
		             con = DriverManager.getConnection(url,user,password);
					
					Statement stmt=con.createStatement();
					ResultSet rs = stmt.executeQuery("SELECT max(bill_no) from bill");
					rs.next();
					int id=rs.getInt("max(bill_no)");
					id+=1;
		
		           JLabel l1=new JLabel("Bill No.");
		           l1.setBounds(80,15,100,20);
		           l1.setFont(new Font("arial",Font.BOLD,17));
		           l1.setForeground(Color.WHITE);
		           panel2.add(l1);
				   
	
		           t1=new JTextField("");
		           t1.setBounds(170,15,150,20);
		           t1.setText(""+id);
		           t1.setForeground(Color.BLUE);
		           t1.setFont(new Font("arial",Font.BOLD,17));
		            panel2.add(t1);
	
		}
		catch(Exception e)
		{
			
		}

		JLabel l2=new JLabel("Date");
		l2.setBounds(450,15,120,20);
		l2.setFont(new Font("arial",Font.BOLD,17));
		l2.setForeground(Color.WHITE);
		panel2.add(l2);
		
          SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		  Date date = new Date();
          String dt=sdf.format(date);
		
		t2=new JTextField("");
		t2.setText(dt);
		t2.setBounds(530,15,150,20);
		t2.setForeground(Color.BLUE);
		t2.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t2);
		
		JLabel l3=new JLabel("customer Name");
		l3.setBounds(20,55,140,20);
		l3.setFont(new Font("arial",Font.BOLD,17));
		l3.setForeground(Color.WHITE);
		panel2.add(l3);
		
		t3=new JTextField("");
		t3.setBounds(170,55,150,20);
		t3.setForeground(Color.BLUE);
		t3.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t3);
		
		t3.addFocusListener(new FocusAdapter()
			{
				public void focusLost(FocusEvent fe)
				{
					if(fe.getSource()== t3)
						 i=1;
					try
					{
						Connection con;
						Statement stmt;
						String aadhar,pendinga;
				
						con=DriverManager.getConnection("jdbc:mysql://localhost:3306/agrosoft_amol","root","amol2260"); 
						Class.forName("com.mysql.jdbc.Driver");
						stmt=con.createStatement();
						String name=t3.getText();
								
						String q1="select * from customer where customer_name='"+name+"'";	
						ResultSet rs1=stmt.executeQuery(q1);
						rs1.next();
						aadhar=rs1.getString("aadhar_no");
						pendinga=rs1.getString("pending_amt");
						
						t4.setText(aadhar);
						tpamount.setText(pendinga);
					}
					catch(Exception e)
					{ 
					}
				}
			});
		
		JLabel l4=new JLabel("Aadhar Number");
		l4.setBounds(390,55,140,20);
		l4.setFont(new Font("arial",Font.BOLD,17));
		l4.setForeground(Color.WHITE);
		panel2.add(l4);
		
		t4=new JTextField("");
		t4.setBounds(530,55,150,20);
		t4.setForeground(Color.BLUE);
		t4.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t4);
	
	    JLabel pamount = new JLabel("pending amount");
	    pamount.setBounds(720,55,140,20);
		pamount.setFont(new Font("arial",Font.BOLD,17));
		pamount.setForeground(Color.WHITE);
		panel2.add(pamount);
		
		tpamount=new JTextField("");
		tpamount.setBounds(860,55,150,20);
		tpamount.setForeground(Color.BLUE);
		tpamount.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(tpamount);
	
		JLabel l5=new JLabel("Batch no");
		l5.setBounds(60,100,140,20);
		l5.setFont(new Font("arial",Font.BOLD,17));
		l5.setForeground(Color.WHITE);
		panel2.add(l5);
	
		JLabel l6=new JLabel("Product name");
		l6.setBounds(200,100,140,20);
		l6.setFont(new Font("arial",Font.BOLD,17));
		l6.setForeground(Color.WHITE);
		panel2.add(l6);
	
		JLabel l7=new JLabel("Expiry date");
		l7.setBounds(360,100,140,20);
		l7.setFont(new Font("arial",Font.BOLD,17));
		l7.setForeground(Color.WHITE);
		panel2.add(l7);
	
		JLabel l8=new JLabel("size");
		l8.setBounds(520,100,140,20);
		l8.setFont(new Font("arial",Font.BOLD,17));
		l8.setForeground(Color.WHITE);
		panel2.add(l8);

		JLabel l9=new JLabel("Rate");
		l9.setBounds(600,100,140,20);
		l9.setFont(new Font("arial",Font.BOLD,17));
		l9.setForeground(Color.WHITE);
		panel2.add(l9);
	
		JLabel l10=new JLabel("GST");
		l10.setBounds(700,100,140,20);
		l10.setFont(new Font("arial",Font.BOLD,17));
		l10.setForeground(Color.WHITE);
		panel2.add(l10);
	
		JLabel l11=new JLabel("Tax");
		l11.setBounds(820,100,140,20);
		l11.setFont(new Font("arial",Font.BOLD,17));
		l11.setForeground(Color.WHITE);
		panel2.add(l11);
	
		JLabel l12=new JLabel("Quantity");
		l12.setBounds(950,100,140,20);
		l12.setFont(new Font("arial",Font.BOLD,17));
		l12.setForeground(Color.WHITE);
		panel2.add(l12);
		
		JLabel l13=new JLabel("Total");
		l13.setBounds(1080,100,140,20);
		l13.setFont(new Font("arial",Font.BOLD,17));
		l13.setForeground(Color.WHITE);
		panel2.add(l13);

	    t5=new JTextField("");
		t5.setBounds(40,135,120,25);
		t5.setForeground(Color.BLUE);
		t5.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t5);
		
		t5.addFocusListener(new FocusAdapter()
			{
				public void focusLost(FocusEvent fe)
				{
					if(fe.getSource()==t6)
						j=0;
					try
					{
						Connection con;
						Statement stmt;
						String pname,expiry,size,rate,gst;
				
						con=DriverManager.getConnection("jdbc:mysql://localhost:3306/agrosoft_amol","root","amol2260"); 
						Class.forName("com.mysql.jdbc.Driver");
						stmt=con.createStatement();
						String getBatch=t5.getText();
								
						String q1="select * from product where Batch_no='"+getBatch+"'";	
						ResultSet rs1=stmt.executeQuery(q1);
						rs1.next();
						pname=rs1.getString("pname");
						expiry=rs1.getString("expiry_date");
						size=rs1.getString("size");
						rate=rs1.getString("rate");
						gst=rs1.getString("gst");
	
						t6.setText(pname);
						t7.setText(expiry);
						t8.setText(size);
						t9.setText(rate);
						t10.setText(gst);
						
						String amount,gstrate;
						amount = t9.getText();
						double value1 = Double.parseDouble(amount);
						gstrate = t10.getText();
						double value2 = Double.parseDouble(gstrate);
						Double tax;
						tax=((value1)*(value2))/100;
					    String val1=String.valueOf(tax);;
						t11.setText(val1);
						
					}
					catch(Exception e)
					{ 
					}
				}
			});
		
		t6=new JTextField("");
		t6.setBounds(190,135,130,25);
		t6.setForeground(Color.BLUE);
		t6.setEditable(false);
		t6.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t6);
		
		t7=new JTextField("");
		t7.setBounds(350,135,120,25);
		t7.setForeground(Color.BLUE);
		t7.setEditable(false);
		t7.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t7);
		
	    t8=new JTextField("");
		t8.setBounds(500,135,70,25);
		t8.setForeground(Color.BLUE);
		t8.setEditable(false);
		t8.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t8);
		
		t9=new JTextField("");
		t9.setBounds(590,135,70,25);
		t9.setForeground(Color.BLUE);
		t9.setEditable(false);
		t9.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t9);
		
		t10=new JTextField("");
		t10.setBounds(680,135,100,25);
		t10.setForeground(Color.BLUE);
		t10.setEditable(false);
		t10.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t10);
		
		t11=new JTextField("");
		t11.setBounds(800,135,100,25);
		t11.setForeground(Color.BLUE);
		t11.setEditable(false);
		t11.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t11);
		
		t12=new JTextField("");
		t12.setBounds(930,135,100,25);
		t12.setForeground(Color.BLUE);
		t12.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t12);
		
		t12.addFocusListener(new FocusAdapter()
			{
				public void focusLost(FocusEvent fe)
				{
					if(fe.getSource()==t12)
						k=0;
					try
					{
						String quantity=t12.getText();
						int value1 = Integer.parseInt(quantity);
						String rate = t9.getText();
						double value2 = Double.parseDouble(rate);
						double total=value1*value2;
						String value3=String.valueOf(total);
						t13.setText(value3);
						
						String amt=t13.getText();
						t50.setText(amt);
					}
					catch(Exception e)
					{ 
					}
				}
			});
		
		t13=new JTextField("");
		t13.setBounds(1050,135,100,25);
		t13.setForeground(Color.BLUE);
		t13.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t13);
		
		t14=new JTextField("");
		t14.setBounds(40,175,120,25);
		t14.setForeground(Color.BLUE);
		t14.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t14);
		
		t14.addFocusListener(new FocusAdapter()
			{
				public void focusLost(FocusEvent fe)
				{
					if(fe.getSource()==t14)
						j=1;
					try
					{
						Connection con;
						Statement stmt;
						String pname,expiry,size,rate,gst;
				
						con=DriverManager.getConnection("jdbc:mysql://localhost:3306/agrosoft_amol","root","amol2260"); 
						Class.forName("com.mysql.jdbc.Driver");
						stmt=con.createStatement();
						String getBatch=t14.getText();
								
						String q1="select * from product where Batch_no='"+getBatch+"'";	
						ResultSet rs2=stmt.executeQuery(q1);
						rs2.next();
						pname=rs2.getString("pname");
						expiry=rs2.getString("expiry_date");
						size=rs2.getString("size");
						rate=rs2.getString("rate");
						gst=rs2.getString("gst");
	
						t15.setText(pname);
						t16.setText(expiry);
						t17.setText(size);
						t18.setText(rate);
						t19.setText(gst);
						
						String amount,gstrate;
						amount = t18.getText();
						double value1 = Double.parseDouble(amount);
						gstrate = t19.getText();
						double value2 = Double.parseDouble(gstrate);
						Double tax;
						tax=((value1)*(value2))/100;
					    String val1=String.valueOf(tax);;
						t20.setText(val1);
					}
					catch(Exception e)
					{ 
					}
				}
			});
		
	    t15=new JTextField("");
		t15.setBounds(190,175,130,25);
		t15.setForeground(Color.BLUE);
		t15.setEditable(false);
		t15.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t15);
		
	    t16=new JTextField("");
		t16.setBounds(350,175,120,25);
		t16.setForeground(Color.BLUE);
		t16.setEditable(false);
		t16.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t16);
		
	    t17=new JTextField("");
		t17.setBounds(500,175,70,25);
		t17.setForeground(Color.BLUE);
		t17.setEditable(false);
		t17.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t17);
		
	    t18=new JTextField("");
		t18.setBounds(590,175,70,25);
		t18.setForeground(Color.BLUE);
		t18.setEditable(false);
		t18.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t18);
		
		t19=new JTextField("");
		t19.setBounds(680,175,100,25);
		t19.setForeground(Color.BLUE);
		t19.setEditable(false);
		t19.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t19);
		
		t20=new JTextField("");
		t20.setBounds(800,175,100,25);
		t20.setForeground(Color.BLUE);
		t20.setEditable(false);
		t20.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t20);
		
		t21=new JTextField("");
		t21.setBounds(930,175,100,25);
		t21.setForeground(Color.BLUE);
		t21.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t21);
		
		t21.addFocusListener(new FocusAdapter()
			{
				public void focusLost(FocusEvent fe)
				{
					if(fe.getSource()==t21)
						k=1;
					try
					{
						String quantity=t21.getText();
						int value1 = Integer.parseInt(quantity);
						String rate = t18.getText();
						double value2 = Double.parseDouble(rate);
						double total=value1*value2;
						String value3=String.valueOf(total);
						t22.setText(value3);
						
						String amt1 = t13.getText();
						String amt2 = t22.getText();
						double value4 = Double.parseDouble(amt1);
						double value5 = Double.parseDouble(amt2);
						double ans = value4+value5;
						String tamt = String.valueOf(ans);
						t50.setText(tamt);
					}
					catch(Exception e)
					{ 
					}
				}
			});
		
		t22=new JTextField("");
		t22.setBounds(1050,175,100,25);
		t22.setForeground(Color.BLUE);
		t22.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t22);
		
		t23=new JTextField("");
		t23.setBounds(40,215,120,25);
		t23.setForeground(Color.BLUE);
		t23.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t23);
		
		t23.addFocusListener(new FocusAdapter()
			{
				public void focusLost(FocusEvent fe)
				{
					if(fe.getSource()==t23)
						j=2;
					try
					{
						Connection con;
						Statement stmt;
						String pname,expiry,size,rate,gst;
				
						con=DriverManager.getConnection("jdbc:mysql://localhost:3306/agrosoft_amol","root","amol2260"); 
						Class.forName("com.mysql.jdbc.Driver");
						stmt=con.createStatement();
						String getBatch=t23.getText();
								
						String q1="select * from product where Batch_no='"+getBatch+"'";	
						ResultSet rs1=stmt.executeQuery(q1);
						rs1.next();
						pname=rs1.getString("pname");
						expiry=rs1.getString("expiry_date");
						size=rs1.getString("size");
						rate=rs1.getString("rate");
						gst=rs1.getString("gst");
	
						t24.setText(pname);
						t25.setText(expiry);
						t26.setText(size);
						t27.setText(rate);
						t28.setText(gst);
						
						String amount,gstrate;
						amount = t27.getText();
						double value1 = Double.parseDouble(amount);
						gstrate = t28.getText();
						double value2 = Double.parseDouble(gstrate);
						Double tax;
						tax=((value1)*(value2))/100;
					    String val1=String.valueOf(tax);;
						t29.setText(val1);
					}
					catch(Exception e)
					{ 
					}
				}
			});
			
		t24=new JTextField("");
		t24.setBounds(190,215,130,25);
		t24.setForeground(Color.BLUE);
		t24.setEditable(false);
		t24.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t24);
		
		t25=new JTextField("");
		t25.setBounds(350,215,120,25);
		t25.setForeground(Color.BLUE);
		t25.setEditable(false);
		t25.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t25);
		
		t26=new JTextField("");
		t26.setBounds(500,215,70,25);
		t26.setForeground(Color.BLUE);
		t26.setEditable(false);
		t26.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t26);
		
		t27=new JTextField("");
		t27.setBounds(590,215,70,25);
		t27.setForeground(Color.BLUE);
		t27.setEditable(false);
		t27.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t27);
		
		t28=new JTextField("");
		t28.setBounds(680,215,100,25);
		t28.setForeground(Color.BLUE);
		t28.setEditable(false);
		t28.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t28);
		
		t29=new JTextField("");
		t29.setBounds(800,215,100,25);
		t29.setForeground(Color.BLUE);
		t29.setEditable(false);
		t29.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t29);
		
		t30=new JTextField("");
		t30.setBounds(930,215,100,25);
		t30.setForeground(Color.BLUE);
		t30.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t30);

        t30.addFocusListener(new FocusAdapter()
			{
				public void focusLost(FocusEvent fe)
				{
					if(fe.getSource()==t30)
						k=2;
					try
					{
						String quantity=t30.getText();
						int value1 = Integer.parseInt(quantity);
						String rate = t27.getText();
						double value2 = Double.parseDouble(rate);
						double total=value1*value2;
						String value3=String.valueOf(total);
						t31.setText(value3);
						
						String amt1 = t13.getText();
						String amt2 = t22.getText();
						String amt3 = t31.getText();
						double value4 = Double.parseDouble(amt1);
						double value5 = Double.parseDouble(amt2);
						double value6 = Double.parseDouble(amt3);
						double ans = value4+value5+value6;
						String tamt = String.valueOf(ans);
						t50.setText(tamt);
					}
					catch(Exception e)
					{ 
					}
				}
			});
		
		t31=new JTextField("");
		t31.setBounds(1050,215,100,25);
		t31.setForeground(Color.BLUE);
		t31.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t31);
		
		t32=new JTextField("");
		t32.setBounds(40,255,120,25);
		t32.setForeground(Color.BLUE);
		t32.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t32);
		
		t32.addFocusListener(new FocusAdapter()
			{
				public void focusLost(FocusEvent fe)
				{
					if(fe.getSource()==t32)
						j=3;
					try
					{
						Connection con;
						Statement stmt;
						String pname,expiry,size,rate,gst;
				
						con=DriverManager.getConnection("jdbc:mysql://localhost:3306/agrosoft_amol","root","amol2260"); 
						Class.forName("com.mysql.jdbc.Driver");
						stmt=con.createStatement();
						String getBatch=t32.getText();
								
						String q1="select * from product where Batch_no='"+getBatch+"'";	
						ResultSet rs1=stmt.executeQuery(q1);
						rs1.next();
						pname=rs1.getString("pname");
						expiry=rs1.getString("expiry_date");
						size=rs1.getString("size");
						rate=rs1.getString("rate");
						gst=rs1.getString("gst");
	
						t33.setText(pname);
						t34.setText(expiry);
						t35.setText(size);
						t36.setText(rate);
						t37.setText(gst);
						
						String amount,gstrate;
						amount = t36.getText();
						double value1 = Double.parseDouble(amount);
						gstrate = t37.getText();
						double value2 = Double.parseDouble(gstrate);
						Double tax;
						tax=((value1)*(value2))/100;
					    String val1=String.valueOf(tax);;
						t38.setText(val1);
					}
					catch(Exception e)
					{ 
					}
				}
			});
		
        t33=new JTextField("");
		t33.setBounds(190,255,130,25);
		t33.setForeground(Color.BLUE);
		t33.setEditable(false);
		t33.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t33);
		
		t34=new JTextField("");
		t34.setBounds(350,255,120,25);
		t34.setForeground(Color.BLUE);
		t34.setEditable(false);
		t34.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t34);
		
		t35=new JTextField("");
		t35.setBounds(500,255,70,25);
		t35.setForeground(Color.BLUE);
		t35.setEditable(false);
		t35.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t35);
		
		t36=new JTextField("");
		t36.setBounds(590,255,70,25);
		t36.setForeground(Color.BLUE);
		t36.setEditable(false);
		t36.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t36);
		
		t37=new JTextField("");
		t37.setBounds(680,255,100,25);
		t37.setForeground(Color.BLUE);
		t37.setEditable(false);
		t37.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t37);
		
		t38=new JTextField("");
		t38.setBounds(800,255,100,25);
		t38.setForeground(Color.BLUE);
		t38.setEditable(false);
		t38.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t38);
		
		t39=new JTextField("");
		t39.setBounds(930,255,100,25);
		t39.setForeground(Color.BLUE);
		t39.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t39);
		
		t39.addFocusListener(new FocusAdapter()
			{
				public void focusLost(FocusEvent fe)
				{
					if(fe.getSource()==t39)
						k=3;
					try
					{
						String quantity=t39.getText();
						int value1 = Integer.parseInt(quantity);
						String rate = t36.getText();
						double value2 = Double.parseDouble(rate);
						double total=value1*value2;
						String value3=String.valueOf(total);
						t40.setText(value3);
						
						String amt1 = t13.getText();
						String amt2 = t22.getText();
						String amt3 = t31.getText();
						String amt4 = t40.getText();
						double value4 = Double.parseDouble(amt1);
						double value5 = Double.parseDouble(amt2);
						double value6 = Double.parseDouble(amt3);
						double value7 = Double.parseDouble(amt4);
						double ans = value4+value5+value6+value7;
						String tamt = String.valueOf(ans);
						t50.setText(tamt);
					}
					catch(Exception e)
					{ 
					}
				}
			});
		
		t40=new JTextField("");
		t40.setBounds(1050,255,100,25);
		t40.setForeground(Color.BLUE);
		t40.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t40);
		
		t41=new JTextField("");
		t41.setBounds(40,295,120,25);
		t41.setForeground(Color.BLUE);
		t41.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t41);
		
		t41.addFocusListener(new FocusAdapter()
			{
				public void focusLost(FocusEvent fe)
				{
					if(fe.getSource()==t41)
						j=4;
					try
					{
						Connection con;
						Statement stmt;
						String pname,expiry,size,rate,gst;
				
						con=DriverManager.getConnection("jdbc:mysql://localhost:3306/agrosoft_amol","root","amol2260"); 
						Class.forName("com.mysql.jdbc.Driver");
						stmt=con.createStatement();
						String getBatch=t41.getText();
								
						String q1="select * from product where Batch_no='"+getBatch+"'";	
						ResultSet rs1=stmt.executeQuery(q1);
						rs1.next();
						pname=rs1.getString("pname");
						expiry=rs1.getString("expiry_date");
						size=rs1.getString("size");
						rate=rs1.getString("rate");
						gst=rs1.getString("gst");
	
						t42.setText(pname);
						t43.setText(expiry);
						t44.setText(size);
						t45.setText(rate);
						t46.setText(gst);
						
						String amount,gstrate;
						amount = t45.getText();
						double value1 = Double.parseDouble(amount);
						gstrate = t46.getText();
						double value2 = Double.parseDouble(gstrate);
						Double tax;
						tax=((value1)*(value2))/100;
					    String val1=String.valueOf(tax);;
						t47.setText(val1);
					}
					catch(Exception e)
					{ 
					}
				}
			});
		
		t42=new JTextField("");
		t42.setBounds(190,295,130,25);
		t42.setForeground(Color.BLUE);
		t42.setEditable(false);
		t42.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t42);
		
		t43=new JTextField("");
		t43.setBounds(350,295,120,25);
		t43.setForeground(Color.BLUE);
		t43.setEditable(false);
		t43.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t43);
		
		t44=new JTextField("");
		t44.setBounds(500,295,70,25);
		t44.setForeground(Color.BLUE);
		t44.setEditable(false);
		t44.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t44);
		
		t45=new JTextField("");
		t45.setBounds(590,295,70,25);
		t45.setForeground(Color.BLUE);
		t45.setEditable(false);
		t45.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t45);
		
		t46=new JTextField("");
		t46.setBounds(680,295,100,25);
		t46.setForeground(Color.BLUE);
		t46.setEditable(false);
		t46.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t46);
		
		t47=new JTextField("");
		t47.setBounds(800,295,100,25);
		t47.setForeground(Color.BLUE);
		t47.setEditable(false);
		t47.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t47);
		
		t48=new JTextField("");
		t48.setBounds(930,295,100,25);
		t48.setForeground(Color.BLUE);
		t48.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t48);
		
		t48.addFocusListener(new FocusAdapter()
			{
				public void focusLost(FocusEvent fe)
				{
					if(fe.getSource()==t48)
						k=4;
					try
					{
						String quantity=t48.getText();
						int value1 = Integer.parseInt(quantity);
						String rate = t45.getText();
						double value2 = Double.parseDouble(rate);
						double total=value1*value2;
						String value3=String.valueOf(total);
						t49.setText(value3);
						
						String amt1 = t13.getText();
						String amt2 = t22.getText();
						String amt3 = t31.getText();
						String amt4 = t40.getText();
						String amt5 = t49.getText();
						double value4 = Double.parseDouble(amt1);
						double value5 = Double.parseDouble(amt2);
						double value6 = Double.parseDouble(amt3);
						double value7 = Double.parseDouble(amt4);
						double value8 = Double.parseDouble(amt5);
						double ans = value4+value5+value6+value7+value8;
						String tamt = String.valueOf(ans);
						t50.setText(tamt);
					}
					catch(Exception e)
					{ 
					}
				}
			});
		
		t49=new JTextField("");
		t49.setBounds(1050,295,100,25);
		t49.setForeground(Color.BLUE);
		t49.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t49);
			
		JLabel l14=new JLabel("Total Amount");
		l14.setBounds(790,335,150,20);
		l14.setFont(new Font("arial",Font.BOLD,22));
		l14.setForeground(Color.WHITE);
		panel2.add(l14);
		
		double s=0.0;
		t50=new JTextField("");
		t50.setBounds(940,335,210,25);
		t50.setForeground(Color.BLUE);
		t50.setText(""+s);
		t50.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t50);
	
		JButton submit = new JButton("Submit");
		submit.setForeground(Color.WHITE);
		submit.setBackground(Color.BLUE);
		submit.setBounds(110,395,100,50);
		submit.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(submit);
		
		submit.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent ae)
		{
			if(t1.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"insert bill number");
				}
				else if(t2.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"insert date");
				}
				else if(t3.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"insert customer Name");
				}
				else if(t4.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"insert customer aadhar number");
				}
				else if(t5.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"insert batch No.");
				}
				else if(t12.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"insert quantity");
				}
				else
				{
		         String bno = t1.getText();
				 int value1 = Integer.parseInt(bno);
				 String value2 = t2.getText();
				 String value3 = t3.getText();
				 String aadhar = t4.getText();
				 Double value4 = Double.parseDouble(aadhar);
				 String total = t50.getText();
				 double value30 = Double.parseDouble(total);
				 
				 
				 String val2 = t5.getText();
				 String val4=t14.getText();
				 String val6=t23.getText();
				 String val8 = t32.getText();
				 String val10 = t41.getText();
				 
				 double amount1=0,amount2=0,amount3=0,amount4=0,amount5=0;
				 
				try
				   {
					String driverClassName="com.mysql.jdbc.Driver";
		            String url="jdbc:mysql://localhost:3306/agrosoft_amol";
		            String user="root";
		            String password = "amol2260";
		
		            Class.forName("com.mysql.jdbc.Driver");
	
	                 Connection con = null;
		             con = DriverManager.getConnection(url,user,password);
					 
					 PreparedStatement st1 = null,st2=null,st3=null,st4=null,st5=null,st6=null,ins1=null,ins2=null,ins3=null,ins4=null,ins5=null;
					try
					{
					String bt1=t5.getText();
					String p1=t6.getText();
					String exp1=t7.getText();
					String sz1=t8.getText();
					int size1 = Integer.parseInt(sz1);
					String rt1=t9.getText();
					double rate1=Double.parseDouble(rt1);
					String gt1=t10.getText();
					double gst1=Double.parseDouble(gt1);
					String tx1=t11.getText();
					double tax1=Double.parseDouble(tx1);
					String qt1=t12.getText();
					int quantity1=Integer.parseInt(qt1);
					
					
					Statement stmt;
					stmt=con.createStatement();	
						String q1="select * from product where Batch_no='"+bt1+"'";	
						ResultSet rs1=stmt.executeQuery(q1);
						rs1.next();
					String	quantity=rs1.getString("quantity");
					int qt=Integer.parseInt(quantity);
					if(quantity1<=qt)
					{
						String amt1=t13.getText();
					 amount1=Double.parseDouble(amt1);
					 total_amount=total_amount+amount1;
					 ins1=con.prepareStatement("insert into transaction_details values(?,?,?,?,?,?,?,?,?,?)");
					 ins1.setInt(1,value1);
					 ins1.setString(2,bt1);
					 ins1.setString(3,p1);
					 ins1.setString(4,exp1);
					 ins1.setInt(5,size1);
					 ins1.setDouble(6,rate1);
					 ins1.setDouble(7,gst1);
					 ins1.setDouble(8,tax1);
					 ins1.setInt(9,quantity1);
					 ins1.setDouble(10,amount1);
					 ins1.executeUpdate();
					 
		            st2 = con.prepareStatement("update product set quantity=quantity-? where batch_no=?");
					st2.setInt(1,quantity1);
					st2.setString(2,bt1);
					st2.executeUpdate();
					}
					else
					{
						JOptionPane.showMessageDialog(null,"stock have less quantity of product "+p1);
					
							t5.setText(null);
							t6.setText(null);
							t7.setText(null);
							t8.setText(null);
							t9.setText(null);
							t10.setText(null);
							t11.setText(null);
							t12.setText(null);
							t13.setText(null);
						
						total_amount=total_amount-amount1;
					}
					}
					catch(Exception e)
					{
						
					}
				
					try
					{
					if(val4.replace(" ","").length()!=0)
					  {
						  String bt2=t14.getText();
					String p2=t15.getText();
					String exp2=t16.getText();
					String sz2=t17.getText();
					int size2 = Integer.parseInt(sz2);
					String rt2=t18.getText();
					double rate2=Double.parseDouble(rt2);
					String gt2=t19.getText();
					double gst2=Double.parseDouble(gt2);
					String tx2=t20.getText();
					double tax2=Double.parseDouble(tx2);
					String qt2=t21.getText();
					int quantity2=Integer.parseInt(qt2);
					
					
					Statement stmt;
					stmt=con.createStatement();	
						String q1="select * from product where Batch_no='"+bt2+"'";	
						ResultSet rs1=stmt.executeQuery(q1);
						rs1.next();
					String	quantity=rs1.getString("quantity");
					int qt=Integer.parseInt(quantity);
					if(quantity2<=qt)
					{
						String amt2=t22.getText();
					 amount2=Double.parseDouble(amt2);
					 total_amount=total_amount+amount2;
					 ins2=con.prepareStatement("insert into transaction_details values(?,?,?,?,?,?,?,?,?,?)");
					 ins2.setInt(1,value1);
					 ins2.setString(2,bt2);
					 ins2.setString(3,p2);
					 ins2.setString(4,exp2);
					 ins2.setInt(5,size2);
					 ins2.setDouble(6,rate2);
					 ins2.setDouble(7,gst2);
					 ins2.setDouble(8,tax2);
					 ins2.setInt(9,quantity2);
					 ins2.setDouble(10,amount2);
					 ins2.executeUpdate();
						  
		            st3 = con.prepareStatement("update product set quantity=quantity-? where batch_no=?");
					st3.setInt(1,quantity2);
					st3.setString(2,bt2);
					st3.executeUpdate();
					}
					else
					{
						JOptionPane.showMessageDialog(null,"stock have less quantity of product "+p2);
						t14.setText(null);
						t15.setText(null);
						t16.setText(null);
						t17.setText(null);
						t18.setText(null);
						t19.setText(null);
						t20.setText(null);
						t21.setText(null);
						t22.setText(null);
						total_amount=total_amount-amount2;
						t50.setText(""+total_amount);
					}
					  }
					}
					  catch(Exception e)
					  {
						  
					  }	
					
					try
					{
					if(val6.replace(" ","").length()!=0)
						{
							 String bt3=t23.getText();
					String p3=t24.getText();
					String exp3=t25.getText();
					String sz3=t26.getText();
					int size3 = Integer.parseInt(sz3);
					String rt3=t27.getText();
					double rate3=Double.parseDouble(rt3);
					String gt3=t28.getText();
					double gst3=Double.parseDouble(gt3);
					String tx3=t29.getText();
					double tax3=Double.parseDouble(tx3);
					String qt3=t30.getText();
					int quantity3=Integer.parseInt(qt3);
					
					
					Statement stmt;
					stmt=con.createStatement();	
						String q1="select * from product where Batch_no='"+bt3+"'";	
						ResultSet rs1=stmt.executeQuery(q1);
						rs1.next();
					String	quantity=rs1.getString("quantity");
					int qt=Integer.parseInt(quantity);
					if(quantity3<=qt)
					{
						String amt3=t31.getText();
					 amount3=Double.parseDouble(amt3);
					 total_amount=total_amount+amount3;
					 ins3=con.prepareStatement("insert into transaction_details values(?,?,?,?,?,?,?,?,?,?)");
					 ins3.setInt(1,value1);
					 ins3.setString(2,bt3);
					 ins3.setString(3,p3);
					 ins3.setString(4,exp3);
					 ins3.setInt(5,size3);
					 ins3.setDouble(6,rate3);
					 ins3.setDouble(7,gst3);
					 ins3.setDouble(8,tax3);
					 ins3.setInt(9,quantity3);
					 ins3.setDouble(10,amount3);
					 ins3.executeUpdate();
							
		            st4 = con.prepareStatement("update product set quantity=quantity-? where batch_no=?");
					st4.setInt(1,quantity3);
					st4.setString(2,bt3);
					st4.executeUpdate();
					}
					else
					{
						JOptionPane.showMessageDialog(null,"stock have less quantity of product "+p3);
						t23.setText(null);
						t24.setText(null);
						t25.setText(null);
						t26.setText(null);
						t27.setText(null);
						t28.setText(null);
						t29.setText(null);
						t30.setText(null);
						t31.setText(null);
						
						total_amount=total_amount-amount3;
						t50.setText(""+total_amount);
					}
					    }
					}
					catch(Exception e)
					{
						
					}
					
					try
					{
				    if(val8.replace(" ","").length()!=0)
					{
						String bt4=t32.getText();
					String p4=t33.getText();
					String exp4=t34.getText();
					String sz4=t35.getText();
					int size4 = Integer.parseInt(sz4);
					String rt4=t36.getText();
					double rate4=Double.parseDouble(rt4);
					String gt4=t37.getText();
					double gst4=Double.parseDouble(gt4);
					String tx4=t38.getText();
					double tax4=Double.parseDouble(tx4);
					String qt4=t39.getText();
					int quantity4=Integer.parseInt(qt4);
					
					
					Statement stmt;
					stmt=con.createStatement();	
						String q1="select * from product where Batch_no='"+bt4+"'";	
						ResultSet rs1=stmt.executeQuery(q1);
						rs1.next();
					String	quantity=rs1.getString("quantity");
					int qt=Integer.parseInt(quantity);
					if(quantity4<=qt)
					{
						String amt4=t40.getText();
					 amount4=Double.parseDouble(amt4);
					 total_amount=total_amount+amount4;
					 ins4=con.prepareStatement("insert into transaction_details values(?,?,?,?,?,?,?,?,?,?)");
					 ins4.setInt(1,value1);
					 ins4.setString(2,bt4);
					 ins4.setString(3,p4);
					 ins4.setString(4,exp4);
					 ins4.setInt(5,size4);
					 ins4.setDouble(6,rate4);
					 ins4.setDouble(7,gst4);
					 ins4.setDouble(8,tax4);
					 ins4.setInt(9,quantity4);
					 ins4.setDouble(10,amount4);
					 ins4.executeUpdate();
					
		            st5 = con.prepareStatement("update product set quantity=quantity-? where batch_no=?");
					st5.setInt(1,quantity4);
					st5.setString(2,bt4);
					st5.executeUpdate();
					}
					else
					{
						JOptionPane.showMessageDialog(null,"stock have less quantity of product "+p4);
						t32.setText(null);
						t33.setText(null);
						t34.setText(null);
						t35.setText(null);
						t36.setText(null);
						t37.setText(null);
						t38.setText(null);
						t39.setText(null);
						t40.setText(null);
						total_amount=total_amount-amount4;
						t50.setText(""+total_amount);
					}
					}
					}
					catch(Exception e)
					{
						
					}
					
					try
					{
					if(val10.replace(" ","").length()!=0)
					{
						String bt5=t41.getText();
					String p5=t42.getText();
					String exp5=t43.getText();
					String sz5=t44.getText();
					int size5 = Integer.parseInt(sz5);
					String rt5=t45.getText();
					double rate5=Double.parseDouble(rt5);
					String gt5=t46.getText();
					double gst5=Double.parseDouble(gt5);
					String tx5=t47.getText();
					double tax5=Double.parseDouble(tx5);
					String qt5=t48.getText();
					int quantity5=Integer.parseInt(qt5);
					
					Statement stmt;
					stmt=con.createStatement();	
						String q1="select * from product where Batch_no='"+bt5+"'";	
						ResultSet rs1=stmt.executeQuery(q1);
						rs1.next();
					String	quantity=rs1.getString("quantity");
					int qt=Integer.parseInt(quantity);
					if(quantity5<=qt)
					{
						String amt5=t49.getText();
					 amount5=Double.parseDouble(amt5);
					 total_amount=total_amount+amount5;
					 ins4=con.prepareStatement("insert into transaction_details values(?,?,?,?,?,?,?,?,?,?)");
					 ins4.setInt(1,value1);
					 ins4.setString(2,bt5);
					 ins4.setString(3,p5);
					 ins4.setString(4,exp5);
					 ins4.setInt(5,size5);
					 ins4.setDouble(6,rate5);
					 ins4.setDouble(7,gst5);
					 ins4.setDouble(8,tax5);
					 ins4.setInt(9,quantity5);
					 ins4.setDouble(10,amount5);
					 ins4.executeUpdate();
						
		            st6 = con.prepareStatement("update product set quantity=quantity-? where batch_no=?");
					st6.setInt(1,quantity5);
					st6.setString(2,bt5);
					st6.executeUpdate();
					}
					else
					{
						JOptionPane.showMessageDialog(null,"stock have less quantity of product "+p5);
						t41.setText(null);
						t42.setText(null);
						t43.setText(null);
						t44.setText(null);
						t45.setText(null);
						t46.setText(null);
						t47.setText(null);
						t48.setText(null);
						t49.setText(null);
						total_amount=total_amount-amount4;
						t50.setText(""+total_amount);
					}
					}
					}
					catch(Exception e)
					{
						
					}
					
					total_amount=amount1+amount2+amount3+amount4+amount5;
					t50.setText(""+total_amount);
					PreparedStatement st = null;
					if(total_amount>0.0)
					{
					 st = con.prepareStatement("insert into bill values(?,?,?,?,?)");
					 st.setInt(1,value1);
					 st.setString(2,value2);
					 st.setString(3,value3);
					 st.setDouble(4,value4);
					st.setDouble(5,total_amount);
					 st.executeUpdate();
					 value1+=1;
					 t1.setText(""+value1);
				
						 JOptionPane.showMessageDialog(null,"bill record inserted successfully");
						 
					 String amt=tpamount.getText();
                     double tamt=Double.parseDouble(amt);
                     tamt=tamt+total_amount;
                     tpamount.setText(""+tamt);	

                      st1 = con.prepareStatement("update customer set pending_amt=pending_amt+? where aadhar_no=?");
					  st1.setDouble(1,total_amount);
					  st1.setDouble(2,value4);
					  st1.executeUpdate();					 	 
					}
					else
					{
						JOptionPane.showMessageDialog(null,"bill not inserted");
					}

	                	st.close();
	                	con.close();
		               
		
		}
				 catch(Exception e)
				 {
					 System.out.println(e);
				 }
                }
		}		
		});
		
		JButton transaction = new JButton("Transaction");
		transaction.setForeground(Color.WHITE);
		transaction.setBackground(Color.BLUE);
		transaction.setBounds(260,395,130,50);
		transaction.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(transaction);
		
		transaction.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				transaction t = new transaction();
                t.pack();
		        t.setBounds(400,200,700,400);
                t.setVisible(true);
			}
		});
		
		JButton refresh = new JButton("Refresh");
		refresh.setForeground(Color.WHITE);
		refresh.setBackground(Color.BLUE);
		refresh.setBounds(440,395,120,50);
		refresh.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(refresh);
		
		refresh.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				t3.setText(null);      
				t4.setText(null);
				t5.setText(null);      
				t6.setText(null);
				t7.setText(null);      
				t8.setText(null);
				t9.setText(null);      
				t10.setText(null);
				t11.setText(null);     
				t12.setText(null);
				t13.setText(null);     
				t14.setText(null);
				t15.setText(null);     
				t16.setText(null);
				t17.setText(null);     
				t18.setText(null);
				t19.setText(null);     
				t20.setText(null);
				t21.setText(null);     
				t22.setText(null);
				t23.setText(null);     
				t24.setText(null);
				t25.setText(null);     
				t26.setText(null);
				t27.setText(null);     
				t28.setText(null);
				t29.setText(null);     
				t30.setText(null);
				t31.setText(null);     
				t32.setText(null);
				t33.setText(null);     
				t34.setText(null);
				t35.setText(null);     
				t36.setText(null);
				t37.setText(null);     
				t38.setText(null);
				t39.setText(null);     
				t40.setText(null);
				t41.setText(null);     
				t42.setText(null);
				t43.setText(null);     
				t44.setText(null);
				t45.setText(null);     
				t46.setText(null);
				t47.setText(null);     
				t48.setText(null);
				t49.setText(null); 				
				t50.setText(null);
				tpamount.setText(null);
			}
		});
		
		JButton view=new JButton("View");
		view.setBounds(610,395,100,50);
		view.setForeground(Color.WHITE);
		view.setBackground(Color.BLUE);
	    view.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(view);
		
		view.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				 billdata b = new billdata();
                 b.pack();
		         b.setBounds(400,200,700,400);
                 b.setVisible(true);
			}
		});
		
		JButton back = new JButton("Back");
		back.setForeground(Color.WHITE);
		back.setBackground(Color.BLUE);
		back.setBounds(750,395,100,50);
		back.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(back);
		
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				new home();
				dispose();
			}
		});
		
		setTitle("BILL");
		setSize(1400,750);
		setLayout(null);

		ImageIcon img=new ImageIcon("agrosoft.jpg");
		Image im = img.getImage();
		Image temp_img=im.getScaledInstance(1400,750,Image.SCALE_SMOOTH);
		img=new ImageIcon(temp_img);
		JLabel background = new JLabel("",img,JLabel.CENTER);
        background.setBounds(0,0,1400,750);
		add(background);
		background.add(panel2);
		setVisible(true);
		
	}
}

//bill transaction page
class transaction extends JFrame
{
    public transaction()
	{
		
        ArrayList columnNames = new ArrayList();
        ArrayList data = new ArrayList();

                    String url="jdbc:mysql://localhost:3306/agrosoft_amol";
		            String user="root";
		            String password = "amol2260";
		            String sql = "SELECT * FROM transaction_details";

        try (Connection connection = DriverManager.getConnection( url, user, password );
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery( sql ))
        {
            ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();

            for (int i = 1; i <= columns; i++)
            {
                columnNames.add( md.getColumnName(i) );
            }

            while (rs.next())
            {
                ArrayList row = new ArrayList(columns);

                for (int i = 1; i <= columns; i++)
                {
                    row.add( rs.getObject(i) );
                }

                data.add( row );
            }
        }
        catch (SQLException e)
        {
            System.out.println( e.getMessage() );
        }

        Vector columnNamesVector = new Vector();
        Vector dataVector = new Vector();

        for (int i = 0; i < data.size(); i++)
        {
            ArrayList subArray = (ArrayList)data.get(i);
            Vector subVector = new Vector();
            for (int j = 0; j < subArray.size(); j++)
            {
                subVector.add(subArray.get(j));
            }
            dataVector.add(subVector);
        }

        for (int i = 0; i < columnNames.size(); i++ )
            columnNamesVector.add(columnNames.get(i));
  
        JTable table = new JTable(dataVector, columnNamesVector)
        {
            public Class getColumnClass(int column)
            {
                for (int row = 0; row < getRowCount(); row++)
                {
                    Object o = getValueAt(row, column);

                    if (o != null)
                    {
                        return o.getClass();
                    }
                }

                return Object.class;
            }
        };
		 JScrollPane pane = new JScrollPane( table );
		pane.setBounds(20,20,1360,700);
		getContentPane().setBackground(Color.RED);
        getContentPane().add( pane );
    }
}

//bill data page

class billdata extends JFrame
{
    public billdata()
	{
		
        ArrayList columnNames = new ArrayList();
        ArrayList data = new ArrayList();

                    String url="jdbc:mysql://localhost:3306/agrosoft_amol";
		            String user="root";
		            String password = "amol2260";
		            String sql = "SELECT * FROM bill";

        try (Connection connection = DriverManager.getConnection( url, user, password );
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery( sql ))
        {
            ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();

            for (int i = 1; i <= columns; i++)
            {
                columnNames.add( md.getColumnName(i) );
            }

            while (rs.next())
            {
                ArrayList row = new ArrayList(columns);

                for (int i = 1; i <= columns; i++)
                {
                    row.add( rs.getObject(i) );
                }

                data.add( row );
            }
        }
        catch (SQLException e)
        {
            System.out.println( e.getMessage() );
        }

        Vector columnNamesVector = new Vector();
        Vector dataVector = new Vector();

        for (int i = 0; i < data.size(); i++)
        {
            ArrayList subArray = (ArrayList)data.get(i);
            Vector subVector = new Vector();
            for (int j = 0; j < subArray.size(); j++)
            {
                subVector.add(subArray.get(j));
            }
            dataVector.add(subVector);
        }

        for (int i = 0; i < columnNames.size(); i++ )
            columnNamesVector.add(columnNames.get(i));

        JTable table = new JTable(dataVector, columnNamesVector)
        {
            public Class getColumnClass(int column)
            {
                for (int row = 0; row < getRowCount(); row++)
                {
                    Object o = getValueAt(row, column);

                    if (o != null)
                    {
                        return o.getClass();
                    }
                }

                return Object.class;
            }
        };
		
		 JScrollPane pane = new JScrollPane( table );
		pane.setBounds(20,20,1360,700);
		getContentPane().setBackground(Color.RED);
        getContentPane().add( pane );
    }
}

//manage party page

class party extends JFrame
{
	JTextField t1;
	party()
	{
		JPanel panel2=new JPanel();
		panel2.setLayout(null);
		panel2.setBorder(BorderFactory.createLineBorder(Color.ORANGE,5));
		panel2.setBackground(new Color(0,0,0,100));
		panel2.setBounds(220,100,880,480);
		
		try
		{
	            	String driverClassName="com.mysql.jdbc.Driver";
		            String url="jdbc:mysql://localhost:3306/agrosoft_amol";
		            String user="root";
		            String password = "amol2260";
		
		            Class.forName("com.mysql.jdbc.Driver");
	
	                 Connection con = null;
		             con = DriverManager.getConnection(url,user,password);
					Statement stmt=con.createStatement();
					ResultSet rs = stmt.executeQuery("SELECT max(party_id) from party");
					rs.next();
					int id=rs.getInt("max(party_id)");
					id+=1;
		
		JLabel l1=new JLabel("Party Id");
		l1.setBounds(100,10,200,80);
		l1.setFont(new Font("arial",Font.BOLD,17));
		l1.setForeground(Color.WHITE);
		panel2.add(l1);
		
		t1=new JTextField("");
		t1.setBounds(170,35,200,30);
		t1.setText(""+id);
		t1.setForeground(Color.RED);
		t1.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t1);
	}
		catch(Exception e)
		{
			
		}
		
		JLabel l2=new JLabel("Party Name");
		l2.setBounds(510,10,200,80);
		l2.setForeground(Color.WHITE);
		l2.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(l2);
		
		JTextField t2=new JTextField("");
		t2.setBounds(610,35,200,30);
		t2.setForeground(Color.BLUE);
		t2.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t2);
		
		JLabel l3=new JLabel("Address");
		l3.setBounds(100,75,200,80);
		l3.setFont(new Font("arial",Font.BOLD,17));
		l3.setForeground(Color.WHITE);
		panel2.add(l3);
		
		JTextField t3=new JTextField("");
		t3.setBounds(170,105,200,30);
		t3.setForeground(Color.BLUE);
		t3.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t3); 
		
		JLabel l4=new JLabel("Mobile No.");
		l4.setBounds(520,85,200,80);
		l4.setForeground(Color.WHITE);
		l4.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(l4);
		
		JTextField t4=new JTextField("");
		t4.setBounds(610,105,200,30);
		t4.setForeground(Color.BLUE);
        t4.setFont(new Font("arial",Font.BOLD,17));		   
        panel2.add(t4);
		
		JLabel l5=new JLabel("Product Name");
		l5.setBounds(50,150,200,80);
		l5.setForeground(Color.WHITE);
		l5.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(l5);
		
		JTextField t5=new JTextField("");
		t5.setBounds(170,175,200,30);
		t5.setForeground(Color.BLUE);
		t5.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t5);
		
		JLabel l6=new JLabel("Company Name");
		l6.setBounds(480,150,200,80);
		l6.setForeground(Color.WHITE);
		l6.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(l6);
		
		JTextField t6=new JTextField("");
		t6.setBounds(610,175,200,30);
		t6.setForeground(Color.BLUE);
        t6.setFont(new Font("arial",Font.BOLD,17));		   
        panel2.add(t6);
		
		JLabel l7=new JLabel("Size");
		l7.setBounds(130,225,200,80);
		l7.setForeground(Color.WHITE);
		l7.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(l7);
		
		JTextField t7=new JTextField("");
		t7.setBounds(170,245,200,30);
		t7.setForeground(Color.BLUE);
		t7.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t7);
		
		JLabel l8=new JLabel("Quantity");
		l8.setBounds(540,225,200,80);
		l8.setForeground(Color.WHITE);
		l8.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(l8);
		
		JTextField t8=new JTextField("");
		t8.setBounds(610,245,200,30);
		t8.setForeground(Color.BLUE);
        t8.setFont(new Font("arial",Font.BOLD,17));		   
        panel2.add(t8);
		
		JLabel l9=new JLabel("Date");
		l9.setBounds(120,290,200,80);
		l9.setForeground(Color.WHITE);
		l9.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(l9);
		
		JTextField t9=new JTextField("");
		t9.setBounds(170,310,200,30);
		t9.setForeground(Color.BLUE);
		t9.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t9);
		
		JButton submit=new JButton("Submit");
		submit.setBounds(250,370,100,50);
		submit.setForeground(Color.WHITE);
		submit.setBackground(Color.BLUE);
		submit.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(submit);
		
		submit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(t1.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"insert party id");
				}
				else if(t2.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"insert party name");
				}
				else if(t3.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"insert Address");
				}
				else if(t4.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"insert mobile number");
				}
				else if(t4.getText().length() != 10)
				{
					JOptionPane.showMessageDialog(null,"invalid mobile number");
				}
				else if(t5.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"insert product Name");
				}
				else if(t6.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"insert Company Name");
				}
				else if(t7.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"insert Product Size");
				}
				else if(t8.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"insert Quantity");
				}
				else if(t9.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"insert Date");
				}
				
			else 
			{
				int value1,value7,value8;
                double value4;				
				String id,value2,value3,mbl,value5,value6,sz,qt,value9;
				 id = t1.getText();
				 value1 = Integer.parseInt(id);
				 value2 = t2.getText();
				 value3 = t3.getText();
				 mbl = t4.getText();
				 value4 = Double.parseDouble(mbl);
				 value5 = t5.getText();
				 value6 = t6.getText();
				 sz = t7.getText();
				 value7 = Integer.parseInt(sz);
				 qt = t8.getText();
				 value8 = Integer.parseInt(qt);
				 value9 = t9.getText();
				
				try
				   {
                
					String driverClassName="com.mysql.jdbc.Driver";
		            String url="jdbc:mysql://localhost:3306/agrosoft_amol";
		            String user="root";
		            String password = "amol2260";
		
		            Class.forName("com.mysql.jdbc.Driver");
	
	                 Connection con = null;
		             con = DriverManager.getConnection(url,user,password);
		             System.out.println("con-->"+con);
					
					PreparedStatement st = null;
		            st = con.prepareStatement("insert into party values(?,?,?,?,?,?,?,?,?)");
					 
					 st.setInt(1,value1);
					 st.setString(2,value2);
					 st.setString(3,value3);
					 st.setDouble(4,value4);
					 st.setString(5,value5);
					 st.setString(6,value6);
					 st.setInt(7,value7);
					 st.setInt(8,value8);
					 st.setString(9,value9);
					 
					 st.executeUpdate();
					 
				     t2.setText(null);
				     t3.setText(null);
				     t4.setText(null);
				     t5.setText(null);
					 t6.setText(null);
					 t7.setText(null);
					 t8.setText(null);
					 t9.setText(null);
					 
					 value1+=1;
					 t1.setText(""+value1);
					
						 JOptionPane.showMessageDialog(null," record inserted successfully");
	                	st.close();
	                	con.close();
		
		               
		
		}
				 catch(Exception e)
				 {
					 System.out.println(e);
				 }
			}
			}
		});
		
		JButton view=new JButton("View");
		view.setBounds(390,370,100,50);
		view.setForeground(Color.WHITE);
		view.setBackground(Color.BLUE);
		view.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(view);
		
		view.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				partydata p = new partydata();
                p.pack();
				p.setBounds(400,200,600,400);
				p.setBackground(Color.RED);
		        p.setVisible(true);
			}
		});	 
		
		JButton back = new JButton("Back");
		back.setForeground(Color.WHITE);
		back.setBackground(Color.BLUE);
		back.setBounds(530,370,100,50);
		back.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(back);
		
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				new home();
				dispose();
			}
		});
		
		setTitle("PARTY INFO");
		setSize(1400,750);
		setLayout(null);

		ImageIcon img=new ImageIcon("agrosoft.jpg");
		Image im = img.getImage();
		Image temp_img=im.getScaledInstance(1400,750,Image.SCALE_SMOOTH);
		img=new ImageIcon(temp_img);
		JLabel background = new JLabel("",img,JLabel.CENTER);
        background.setBounds(0,0,1400,750);
		add(background);
		background.add(panel2);
		setVisible(true);
		
	}
}
//partydata page
 class partydata extends JFrame
{
    public partydata()
	{
		
        ArrayList columnNames = new ArrayList();
        ArrayList data = new ArrayList();

                    String url="jdbc:mysql://localhost:3306/agrosoft_amol";
		            String user="root";
		            String password = "amol2260";
		            String sql = "SELECT * FROM party";

        try (Connection connection = DriverManager.getConnection( url, user, password );
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery( sql ))
        {
            ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();

            for (int i = 1; i <= columns; i++)
            {
                columnNames.add( md.getColumnName(i) );
            }

            while (rs.next())
            {
                ArrayList row = new ArrayList(columns);

                for (int i = 1; i <= columns; i++)
                {
                    row.add( rs.getObject(i) );
                }

                data.add( row );
            }
        }
        catch (SQLException e)
        {
            System.out.println( e.getMessage() );
        }

        Vector columnNamesVector = new Vector();
        Vector dataVector = new Vector();

        for (int i = 0; i < data.size(); i++)
        {
            ArrayList subArray = (ArrayList)data.get(i);
            Vector subVector = new Vector();
            for (int j = 0; j < subArray.size(); j++)
            {
                subVector.add(subArray.get(j));
            }
            dataVector.add(subVector);
        }

        for (int i = 0; i < columnNames.size(); i++ )
            columnNamesVector.add(columnNames.get(i));
   
        JTable table = new JTable(dataVector, columnNamesVector)
        {
            public Class getColumnClass(int column)
            {
                for (int row = 0; row < getRowCount(); row++)
                {
                    Object o = getValueAt(row, column);

                    if (o != null)
                    {
                        return o.getClass();
                    }
                }

                return Object.class;
            }
        };
		 JScrollPane pane = new JScrollPane( table );
		pane.setBounds(20,20,1360,700);
		getContentPane().setBackground(Color.RED);
        getContentPane().add( pane );
    }
}
//received check page
class receivedcheck extends JFrame
{
	receivedcheck()
	{
		
		JPanel panel2=new JPanel();
		panel2.setLayout(null);
		panel2.setBorder(BorderFactory.createLineBorder(Color.GREEN,5));
		panel2.setBackground(new Color(0,0,0,100));
		panel2.setBounds(220,100,880,360);
		
		JLabel l1=new JLabel("Cheque No.");
		l1.setBounds(70,10,200,80);
		l1.setForeground(Color.WHITE);
		l1.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(l1);
		
		JTextField t1=new JTextField("");
		t1.setBounds(170,35,200,30);
		t1.setForeground(Color.BLUE);
		t1.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t1);
		
		JLabel l2=new JLabel("Bank Name");
		l2.setBounds(510,10,200,80);
		l2.setForeground(Color.WHITE);
		l2.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(l2);
		
		JTextField t2=new JTextField("");
		t2.setBounds(610,35,200,30);
		t2.setForeground(Color.BLUE);
		t2.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t2);
		
		JLabel l3=new JLabel("customer Name");
		l3.setBounds(40,75,200,80);
		l3.setFont(new Font("arial",Font.BOLD,17));
		l3.setForeground(Color.WHITE);
		panel2.add(l3);
		
		JTextField t3=new JTextField("");
		t3.setBounds(170,105,200,30);
		t3.setForeground(Color.BLUE);
		t3.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t3); 
		
		JLabel l4=new JLabel("Account No.");
		l4.setBounds(500,85,200,80);
		l4.setForeground(Color.WHITE);
		l4.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(l4);
		
		JTextField t4=new JTextField("");
		t4.setBounds(610,105,200,30);
		t4.setForeground(Color.BLUE);
        t4.setFont(new Font("arial",Font.BOLD,17));		   
        panel2.add(t4);
		
		JLabel l5=new JLabel("Amount");
		l5.setBounds(100,150,200,80);
		l5.setForeground(Color.WHITE);
		l5.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(l5);
		
		JTextField t5=new JTextField("");
		t5.setBounds(170,175,200,30);
		t5.setForeground(Color.BLUE);
		t5.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t5);
		
		JLabel l6=new JLabel("Date");
		l6.setBounds(560,150,200,80);
		l6.setForeground(Color.WHITE);
		l6.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(l6);
		
		JTextField t6=new JTextField("");
		t6.setBounds(610,175,200,30);
		t6.setForeground(Color.BLUE);
		t6.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t6);
		
		JButton submit=new JButton("Submit");
		submit.setBounds(250,250,100,50);
		submit.setForeground(Color.WHITE);
		submit.setBackground(Color.BLUE);
		submit.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(submit);
		
		submit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(t1.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"insert cheque No.");
				}
				else if(t2.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"insert Bank Name");
				}
				else if(t3.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"insert cheque Name");
				}
				else if(t4.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"insert Account Number");
				}
				else if(t5.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"insert Amount");
				}
				else if(t6.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"insert Date");
				}	
			else 
			{
				int value1;
				double value4,value5;	
				String ckno,value2,value3,accno,amt,value6;
				 ckno = t1.getText();
				 value1 = Integer.parseInt(ckno);
				 value2 = t2.getText();
				 value3 = t3.getText();
				 accno = t4.getText();
				 value4 = Double.parseDouble(accno);
				 amt = t5.getText();
				 value5 = Double.parseDouble(amt);
				 value6 = t6.getText();
				
				try
				   {
                
					String driverClassName="com.mysql.jdbc.Driver";
		            String url="jdbc:mysql://localhost:3306/agrosoft_amol";
		            String user="root";
		            String password = "amol2260";
		
		            Class.forName("com.mysql.jdbc.Driver");
	
	                 Connection con = null;
		             con = DriverManager.getConnection(url,user,password);
		             System.out.println("con-->"+con);
					
					PreparedStatement st = null;
		            st = con.prepareStatement("insert into receivedck values(?,?,?,?,?,?)");
					 
					 st.setInt(1,value1);
					 st.setString(2,value2);
					 st.setString(3,value3);
					 st.setDouble(4,value4);
					 st.setDouble(5,value5);
					 st.setString(6,value6);
					 
					 st.executeUpdate();
					 
				     t1.setText(null);
				     t2.setText(null);
				     t3.setText(null);
				     t4.setText(null);
				     t5.setText(null);
					 t6.setText(null);
					
						 JOptionPane.showMessageDialog(null," record inserted successfully");
	                	st.close();
	                	con.close();
		}
				 catch(Exception e)
				 {
					 System.out.println(e);
				 }
			}
			}
		});
		
		JButton view=new JButton("View");
		view.setBounds(400,250,100,50);
		view.setForeground(Color.WHITE);
		view.setBackground(Color.BLUE);
		view.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(view);
		
		view.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				receivedcheckdata rc = new receivedcheckdata();
                rc.pack();
				rc.setBounds(400,200,700,400);
				rc.setBackground(Color.RED);
		        rc.setVisible(true);
			}
		});	 
		
		JButton back = new JButton("Back");
		back.setForeground(Color.WHITE);
		back.setBackground(Color.BLUE);
		back.setBounds(530,250,100,50);
		back.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(back);
		
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				new home();
				dispose();
			}
		});
		
		setTitle("Received Cheque");
		setSize(1400,750);
		setLayout(null);
		
		ImageIcon img=new ImageIcon("agrosoft.jpg");
		Image im = img.getImage();
		Image temp_img=im.getScaledInstance(1400,750,Image.SCALE_SMOOTH);
		img=new ImageIcon(temp_img);
		JLabel background = new JLabel("",img,JLabel.CENTER);
        background.setBounds(0,0,1400,750);
		add(background);
		background.add(panel2);
		setVisible(true);
		
	}
}
//received check data
class receivedcheckdata extends JFrame
{
    public receivedcheckdata()
	{
		
        ArrayList columnNames = new ArrayList();
        ArrayList data = new ArrayList();

                    String url="jdbc:mysql://localhost:3306/agrosoft_amol";
		            String user="root";
		            String password = "amol2260";
		            String sql = "SELECT * FROM receivedck";

        try (Connection connection = DriverManager.getConnection( url, user, password );
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery( sql ))
        {
            ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();

            for (int i = 1; i <= columns; i++)
            {
                columnNames.add( md.getColumnName(i) );
            }
			
            while (rs.next())
            {
                ArrayList row = new ArrayList(columns);

                for (int i = 1; i <= columns; i++)
                {
                    row.add( rs.getObject(i) );
                }

                data.add( row );
            }
        }
        catch (SQLException e)
        {
            System.out.println( e.getMessage() );
        }

        Vector columnNamesVector = new Vector();
        Vector dataVector = new Vector();

        for (int i = 0; i < data.size(); i++)
        {
            ArrayList subArray = (ArrayList)data.get(i);
            Vector subVector = new Vector();
            for (int j = 0; j < subArray.size(); j++)
            {
                subVector.add(subArray.get(j));
            }
            dataVector.add(subVector);
        }

        for (int i = 0; i < columnNames.size(); i++ )
            columnNamesVector.add(columnNames.get(i));
 
        JTable table = new JTable(dataVector, columnNamesVector)
        {
            public Class getColumnClass(int column)
            {
                for (int row = 0; row < getRowCount(); row++)
                {
                    Object o = getValueAt(row, column);

                    if (o != null)
                    {
                        return o.getClass();
                    }
                }

                return Object.class;
            }
        };
		 JScrollPane pane = new JScrollPane( table );
		pane.setBounds(20,20,1360,700);
		getContentPane().setBackground(Color.RED);
        getContentPane().add( pane );
    }
}
//givencheck page
class givencheck extends JFrame
{
	givencheck()
	{
		
		JPanel panel2=new JPanel();
		panel2.setLayout(null);
		panel2.setBorder(BorderFactory.createLineBorder(Color.RED,5));
		panel2.setBackground(new Color(0,0,0,100));
		panel2.setBounds(220,100,880,360);
		
		JLabel l1=new JLabel("Cheque No.");
		l1.setBounds(70,10,200,80);
		l1.setForeground(Color.WHITE);
		l1.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(l1);
		
		JTextField t1=new JTextField("");
		t1.setBounds(170,35,200,30);
		t1.setForeground(Color.BLUE);
		t1.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t1);
		
		JLabel l2=new JLabel("Bank Name");
		l2.setBounds(510,10,200,80);
		l2.setForeground(Color.WHITE);
		l2.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(l2);
		
		JTextField t2=new JTextField("");
		t2.setBounds(610,35,200,30);
		t2.setForeground(Color.BLUE);
		t2.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t2);
		
		JLabel l3=new JLabel("Cheque Name");
		l3.setBounds(50,75,200,80);
		l3.setFont(new Font("arial",Font.BOLD,17));
		l3.setForeground(Color.WHITE);
		panel2.add(l3);
		
		JTextField t3=new JTextField("");
		t3.setBounds(170,105,200,30);
		t3.setForeground(Color.BLUE);
		t3.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t3); 
		
		JLabel l4=new JLabel("Account No.");
		l4.setBounds(500,85,200,80);
		l4.setForeground(Color.WHITE);
		l4.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(l4);
		
		JTextField t4=new JTextField("");
		t4.setBounds(610,105,200,30);
		t4.setForeground(Color.BLUE);
        t4.setFont(new Font("arial",Font.BOLD,17));		   
        panel2.add(t4);
		
		JLabel l5=new JLabel("Amount");
		l5.setBounds(100,150,200,80);
		l5.setForeground(Color.WHITE);
		l5.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(l5);
		
		JTextField t5=new JTextField("");
		t5.setBounds(170,175,200,30);
		t5.setForeground(Color.BLUE);
		t5.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t5);
		
		JLabel l6=new JLabel("Date");
		l6.setBounds(560,150,200,80);
		l6.setForeground(Color.WHITE);
		l6.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(l6);
		
		JTextField t6=new JTextField("");
		t6.setBounds(610,175,200,30);
		t6.setForeground(Color.BLUE);
		t6.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t6);
		
		JButton submit=new JButton("Submit");
		submit.setBounds(250,250,100,50);
		submit.setForeground(Color.WHITE);
		submit.setBackground(Color.BLUE);
		submit.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(submit);
		
		submit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(t1.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"insert cheque No.");
				}
				else if(t2.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"insert Bank Name");
				}
				else if(t3.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"insert cheque Name");
				}
				else if(t4.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"insert Account Number");
				}
				else if(t5.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"insert Amount");
				}
				else if(t6.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"insert Date");
				}	
			else 
			{
				int value1;
				double value4,value5;	
				String ckno,value2,value3,accno,amt,value6;
				 ckno = t1.getText();
				 value1 = Integer.parseInt(ckno);
				 value2 = t2.getText();
				 value3 = t3.getText();
				 accno = t4.getText();
				 value4 = Double.parseDouble(accno);
				 amt = t5.getText();
				 value5 = Double.parseDouble(amt);
				 value6 = t6.getText();
				
				try
				   {
                
					String driverClassName="com.mysql.jdbc.Driver";
		            String url="jdbc:mysql://localhost:3306/agrosoft_amol";
		            String user="root";
		            String password = "amol2260";
		
		            Class.forName("com.mysql.jdbc.Driver");
	
	                 Connection con = null;
		             con = DriverManager.getConnection(url,user,password);
		             System.out.println("con-->"+con);
					
					PreparedStatement st = null;
		            st = con.prepareStatement("insert into givenck values(?,?,?,?,?,?)");
					 
					 st.setInt(1,value1);
					 st.setString(2,value2);
					 st.setString(3,value3);
					 st.setDouble(4,value4);
					 st.setDouble(5,value5);
					 st.setString(6,value6);
					 
					 st.executeUpdate();
					 
				     t1.setText(null);
				     t2.setText(null);
				     t3.setText(null);
				     t4.setText(null);
				     t5.setText(null);
					 t6.setText(null);
					
						 JOptionPane.showMessageDialog(null," record inserted successfully");
	                	st.close();
	                	con.close();
		}
				 catch(Exception e)
				 {
					 System.out.println(e);
				 }
			}
			}
		});
		
		JButton view=new JButton("View");
		view.setBounds(400,250,100,50);
		view.setForeground(Color.WHITE);
		view.setBackground(Color.BLUE);
		view.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(view);
		
		view.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				givencheckdata gc = new givencheckdata();
                gc.pack();
				gc.setBounds(400,200,700,400);
				gc.setBackground(Color.RED);
		        gc.setVisible(true);
			}
		});
		
		JButton back = new JButton("Back");
		back.setForeground(Color.WHITE);
		back.setBackground(Color.BLUE);
		back.setBounds(530,250,100,50);
		back.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(back);
		
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				new home();
				dispose();
			}
		});
		
		setTitle("Given Check Info");
		setSize(1400,750);
		setLayout(null);

		ImageIcon img=new ImageIcon("agrosoft.jpg");
		Image im = img.getImage();
		Image temp_img=im.getScaledInstance(1400,750,Image.SCALE_SMOOTH);
		img=new ImageIcon(temp_img);
		JLabel background = new JLabel("",img,JLabel.CENTER);
        background.setBounds(0,0,1400,750);
		add(background);
		background.add(panel2);
		setVisible(true);
		
	}
}
//givencheck data
class givencheckdata extends JFrame
{
    public givencheckdata()
	{
		
        ArrayList columnNames = new ArrayList();
        ArrayList data = new ArrayList();

                    String url="jdbc:mysql://localhost:3306/agrosoft_amol";
		            String user="root";
		            String password = "amol2260";
		            String sql = "SELECT * FROM givenck";

        try (Connection connection = DriverManager.getConnection( url, user, password );
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery( sql ))
        {
            ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();

            for (int i = 1; i <= columns; i++)
            {
                columnNames.add( md.getColumnName(i) );
            }
			
            while (rs.next())
            {
                ArrayList row = new ArrayList(columns);

                for (int i = 1; i <= columns; i++)
                {
                    row.add( rs.getObject(i) );
                }

                data.add( row );
            }
        }
        catch (SQLException e)
        {
            System.out.println( e.getMessage() );
        }

        Vector columnNamesVector = new Vector();
        Vector dataVector = new Vector();

        for (int i = 0; i < data.size(); i++)
        {
            ArrayList subArray = (ArrayList)data.get(i);
            Vector subVector = new Vector();
            for (int j = 0; j < subArray.size(); j++)
            {
                subVector.add(subArray.get(j));
            }
            dataVector.add(subVector);
        }

        for (int i = 0; i < columnNames.size(); i++ )
            columnNamesVector.add(columnNames.get(i));
 
        JTable table = new JTable(dataVector, columnNamesVector)
        {
            public Class getColumnClass(int column)
            {
                for (int row = 0; row < getRowCount(); row++)
                {
                    Object o = getValueAt(row, column);

                    if (o != null)
                    {
                        return o.getClass();
                    }
                }

                return Object.class;
            }
        };
		 JScrollPane pane = new JScrollPane( table );
		pane.setBounds(20,20,1360,700);
		getContentPane().setBackground(Color.RED);
        getContentPane().add( pane );
    }
}
