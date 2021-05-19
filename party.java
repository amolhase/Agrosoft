import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;
import java.util.*;
class party extends JFrame
{
	JTextField t1;
	party()
	{
		//panel 2
		JPanel panel2=new JPanel();
		panel2.setLayout(null);
		panel2.setBorder(BorderFactory.createLineBorder(Color.ORANGE,5));
		panel2.setBackground(new Color(0,0,0,100));
		panel2.setBounds(220,100,880,480);
		
		//party id
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
		
		//party name
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
		
		//address
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
		
		//mobile no
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
		
		//product name
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
		
		//company name
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
		
		//size
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
		
		//quantity
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
		
		//date
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
		
		//submit
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
		
		            //2.Load Jdbc driverClassName
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
		       // p.setSize(800,700);
				p.setBackground(Color.RED);
		        p.setVisible(true);
			}
		});	 
		
		//back button
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
		
		//Frame
		setTitle("PARTY INFO");
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
class partydemo
{
	public static void main(String[] args)
	{
		new party();
	}
}


 class partydata extends JFrame
{
    public partydata()
	{
		
        ArrayList columnNames = new ArrayList();
        ArrayList data = new ArrayList();

        //  Connect to an MySQL Database, run query, get result set
                    String url="jdbc:mysql://localhost:3306/agrosoft_amol";
		            String user="root";
		            String password = "amol2260";
		            String sql = "SELECT * FROM party";

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
		pane.setBounds(20,20,1360,700);
		getContentPane().setBackground(Color.RED);
        getContentPane().add( pane );
    }
}