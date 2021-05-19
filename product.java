import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.border.*;
import java.sql.*;
import java.util.*;
class product extends JFrame
{
	product()
	{
		
		//panel2
		JPanel panel2=new JPanel();
		panel2.setLayout(null);
		panel2.setBackground(new Color(0,0,0,100));
		panel2.setBorder(BorderFactory.createLineBorder(Color.BLUE,3));
		panel2.setBounds(190,60,950,560);
		
		//batch no
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
		
		//product name
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
		
		//company name
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
			
		
		//size
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
		
		//mfg date
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
		
		
		//Exp date
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
		
		//rate
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
		
		//gst
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
		
		//quantity
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
		
		
		//add
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
		
		            //2.Load Jdbc driverClassName
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
		
		
		//update
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
		
		//delete
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
		
		            //2.Load Jdbc driverClassName
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
		
		//back
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
		
		
		
		
		//Frame
		setTitle("PRODUCT INFO");
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
class productdemo
{
	public static void main(String[] args)
	{
		new product();
	}
}



class proupdate extends JFrame
{
	proupdate()
	{
		
		//panel 2
		JPanel panel2=new JPanel();
		panel2.setLayout(null);
		panel2.setBorder(BorderFactory.createLineBorder(Color.GREEN,5));
		panel2.setBackground(new Color(0,0,0,100));
		panel2.setBounds(220,100,880,400);
		
		//batch  no
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
		
		//product name
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
		
		//company name
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
		
		//size
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
	
		//mfg date
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
		
		//expiry date
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
		
		//quantity
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
		
		//submit
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
		
		            //2.Load Jdbc driverClassName
		            Class.forName("com.mysql.jdbc.Driver");
	
	                 Connection con = null;
		             con = DriverManager.getConnection(url,user,password);
					
					//PreparedStatement st = null;
					String s="update product set batch_no=?,mfg_date=?,expiry_date=?,quantity=? where pname=? and company=? and size=?";
		           // st = con.prepareStatement("update product set batch_no=?,mfg_date=?,expiry_date=? and quantity=? where pname=? and company=?");
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
		
		//Back
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
		
		//Frame
		setTitle("Update Stock");
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

























 class prodata extends JFrame
{
    public prodata()
	{
		
        ArrayList columnNames = new ArrayList();
        ArrayList data = new ArrayList();

        //  Connect to an MySQL Database, run query, get result set
                    String url="jdbc:mysql://localhost:3306/agrosoft_amol";
		            String user="root";
		            String password = "amol2260";
		            String sql = "SELECT * FROM product";

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