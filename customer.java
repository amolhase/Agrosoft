import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.sql.PreparedStatement;
import javax.swing.table.*;
import javax.swing.border.*;
import java.util.*;
class customer extends JFrame
{
	JTextField t1;
	customer()
	{
		
		//panel 2
		JPanel panel2=new JPanel();
		panel2.setLayout(null);
		panel2.setBackground(new Color(0,0,0,100));
		panel2.setBorder(BorderFactory.createLineBorder(Color.BLUE,3));
		panel2.setBounds(200,90,950,530);
			
		//customer Id
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
		
		//customer name
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
		
		//aadhar
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
		
		//gender
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
		
		//address
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
		
		//mobile
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
		
		//pending_amount
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
		

		//ADD
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
		
		            //2.Load Jdbc driverClassName
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
					// st.setString(8,value8);
					 
					 st.executeUpdate();
					 value1+=1;
					 t1.setText(""+value1);
					 
				     t2.setText(null);
				     t3.setText(null);
				     t5.setText(null);
				     t6.setText(null);
				     t7.setText(null);
					
						 JOptionPane.showMessageDialog(null,"Customer record inserted successfully");
		             //5.close statement and connection
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
		
		//view
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
		
		//delete
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
		
		            //2.Load Jdbc driverClassName
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
		
		//update
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
		
		            //2.Load Jdbc driverClassName
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
	
		//back
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
		
		
		
		//Frame
		setTitle("CUSTOMER INFO");
		setSize(1400,750);
		setLayout(null);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Background
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
class customerdemo
{
	public static void main(String[] args)
	{
		customer c=new customer();
	}
}

class custdata extends JFrame
{
    public custdata()
	{
		
        ArrayList columnNames = new ArrayList();
        ArrayList data = new ArrayList();

        //  Connect to an MySQL Database, run query, get result set
                    String url="jdbc:mysql://localhost:3306/agrosoft_amol";
		            String user="root";
		            String password = "amol2260";
		            String sql = "SELECT * FROM customer";

        // Java SE 7 has try-with-resources
        // This will ensure that the sql objects are closed when the program 
        // is finished with them
        try (Connection connection = DriverManager.getConnection( url, user, password );
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery( sql ))
        {
            ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();

            //  Get column names
            for (int i = 1; i <= columns; i++)
            {
                columnNames.add( md.getColumnName(i) );
            }

            //  Get row data
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

        // Create Vectors and copy over elements from ArrayLists to them
        // Vector is deprecated but I am using them in this example to keep 
        // things simple - the best practice would be to create a custom defined
        // class which inherits from the AbstractTableModel class
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

        //  Create table with database data    
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
