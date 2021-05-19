import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;
class givencheck extends JFrame
{
	givencheck()
	{
		
		//panel 2
		JPanel panel2=new JPanel();
		panel2.setLayout(null);
		panel2.setBorder(BorderFactory.createLineBorder(Color.RED,5));
		panel2.setBackground(new Color(0,0,0,100));
		panel2.setBounds(220,100,880,360);
		
		//cheque  no
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
		
		//bank name
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
		
		//Cheque name
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
		
		//account no
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
		
		//amount
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
		
		//date
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
		
		//submit
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
		
		            //2.Load Jdbc driverClassName
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
		
		//back button
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
		
		//Frame
		setTitle("Given Check Info");
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
class givencheckdemo
{
	public static void main(String[] args)
	{
		new givencheck();
	}
}

class givencheckdata extends JFrame
{
    public givencheckdata()
	{
		
        ArrayList columnNames = new ArrayList();
        ArrayList data = new ArrayList();

        //  Connect to an MySQL Database, run query, get result set
                    String url="jdbc:mysql://localhost:3306/agrosoft_amol";
		            String user="root";
		            String password = "amol2260";
		            String sql = "SELECT * FROM givenck";

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