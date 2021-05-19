import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.sql.*;
import java.util.*;
class stock extends JFrame
{
	stock()
	{

        //panel2
		JPanel panel2=new JPanel();
		panel2.setLayout(null);
		panel2.setBackground(new Color(0,0,0,100));
		panel2.setBorder(BorderFactory.createLineBorder(Color.BLUE,3));
		panel2.setBounds(190,100,950,390);
		
		//product Name
		JLabel l1=new JLabel("Product Name");
		l1.setBounds(50,10,200,80);
		l1.setForeground(Color.WHITE);
		l1.setFont(new Font("arial",Font.BOLD,20));
		panel2.add(l1);
		
		JTextField t1=new JTextField("");
		t1.setBounds(200,35,200,30);
		t1.setForeground(Color.BLUE);
		t1.setFont(new Font("arial",Font.BOLD,20));
		panel2.add(t1);
		
		//company name
		JLabel l2=new JLabel("Company Name");
		l2.setBounds(500,10,200,80);
		l2.setForeground(Color.WHITE);
		l2.setFont(new Font("arial",Font.BOLD,20));
		panel2.add(l2);
		
		JTextField t2=new JTextField("");
		t2.setBounds(660,35,200,30);
		t2.setForeground(Color.BLUE);
		t2.setFont(new Font("arial",Font.BOLD,20));
		panel2.add(t2);
			
		//size
		JLabel l3=new JLabel("size");
		l3.setBounds(140,85,200,80);
		l3.setFont(new Font("arial",Font.BOLD,20));
		l3.setForeground(Color.WHITE);
		panel2.add(l3);
		
		String size[]={"100","250","500","1000"};        
        JComboBox s=new JComboBox(size); 
        s.setFont(new Font("arial",Font.BOLD,20));		
        s.setBounds(200,105,200,30);    
        panel2.add(s); 
		
		
		//rate
		JLabel l4=new JLabel("Rate");
		l4.setBounds(590,100,200,50);
		l4.setFont(new Font("arial",Font.BOLD,20));
		l4.setForeground(Color.WHITE);
		panel2.add(l4);
		
	    JTextField t4=new JTextField("");
		t4.setBounds(660,105,200,30);
		t4.setForeground(Color.BLUE);
		t4.setFont(new Font("arial",Font.BOLD,20));
		panel2.add(t4);
	
		//quantity
		JLabel l5=new JLabel("Quantity");
		l5.setBounds(110,150,200,80);
		l5.setForeground(Color.WHITE);
		l5.setFont(new Font("arial",Font.BOLD,20));
		panel2.add(l5);
		
		JTextField t5=new JTextField("");
		t5.setBounds(200,175,200,30);
		t5.setForeground(Color.BLUE);
		t5.setFont(new Font("arial",Font.BOLD,20));
		panel2.add(t5);
		
		//submit
		JButton submit=new JButton("Submit");
		submit.setBounds(140,265,100,40);
		submit.setBackground(Color.BLUE);
		submit.setForeground(Color.WHITE);
		submit.setFont(new Font("arial",Font.BOLD,15));
		panel2.add(submit);
		
		submit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				int value3,value5;
                double value4;				
				String value1,value2,sz,rate,quantity;
				 value1 = t1.getText();
				value2 = t2.getText();
				String selected = (String)s.getSelectedItem();
                 if(selected.equals("50"))
				 {
					 sz="100";
					 value3 = Integer.parseInt(sz);
				 }
			     else
					 if(selected.equals("100"))
					 {
						 sz = "250";
						 value3 = Integer.parseInt(sz);
					 }
				 else if(selected.equals("500"))
				 {
					 sz="500";
					 value3 = Integer.parseInt(sz);
				 }
				 else
				 {
					 sz = "1000";
					 value3 = Integer.parseInt(sz);
				 }	
				 rate = t4.getText();
				 value4 = Double.parseDouble(rate);
				 quantity = t5.getText();
				 value5 = Integer.parseInt(quantity);
				
				try
				   {
                
					String driverClassName="com.mysql.jdbc.Driver";
		            String url="jdbc:mysql://localhost:3306/agrosoft";
		            String user="root";
		            String password = "amol2260";
		
		            //2.Load Jdbc driverClassName
		            Class.forName("com.mysql.jdbc.Driver");
	
	                 Connection con = null;
		             con = DriverManager.getConnection(url,user,password);
		             System.out.println("con-->"+con);
					
					PreparedStatement st = null;
		            st = con.prepareStatement("insert into stock values(?,?,?,?,?)");
					 
					 st.setString(1,value1);
					 st.setString(2,value2);
					 st.setInt(3,value3);
					 st.setDouble(4,value4);
					 st.setInt(5,value5);
					 
					 st.executeUpdate();
					 
					 t1.setText(null);
				     t2.setText(null);
				     t4.setText(null);
				     t5.setText(null);
					
						 JOptionPane.showMessageDialog(null,"Stock inserted successfully");
		             //5.close statement and connection
	                	st.close();
	                	con.close();
		}
				 catch(Exception e)
				 {
					System.out.println(e);
				 }
			}
		});
		
		//view button
		JButton view = new JButton("View");
		view.setForeground(Color.WHITE);
		view.setBackground(Color.BLUE);
		view.setBounds(280,265,100,40);
		view.setFont(new Font("arial",Font.BOLD,15));
		panel2.add(view);
		
		view.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				stockdata s = new stockdata();
                s.pack();
		        s.setSize(1200,700);
		        s.setVisible(true);
			}
		});
		
		//update button
		JButton update = new JButton("Update");
		update.setForeground(Color.WHITE);
		update.setBackground(Color.BLUE);
		update.setBounds(430,265,100,40);
		update.setFont(new Font("arial",Font.BOLD,15));
		panel2.add(update);
		
		//delete button
		JButton delete = new JButton("Delete");
		delete.setForeground(Color.WHITE);
		delete.setBackground(Color.BLUE);
		delete.setBounds(580,265,100,40);
		delete.setFont(new Font("arial",Font.BOLD,15));
		panel2.add(delete);
		
		
		//home button
		JButton home = new JButton("Home");
		home.setForeground(Color.WHITE);
		home.setBackground(Color.BLUE);
		home.setBounds(730,265,100,40);
		home.setFont(new Font("arial",Font.BOLD,15));
		panel2.add(home);
		
		home.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				new home();
			}
		});
		
		
		
		
		//Frame
		setTitle("STOCK INFO");
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
class stockdemo
{
	public static void main(String[] args)
	{
		new stock();
	}
}








 class stockdata extends JFrame
{
    public stockdata()
	{
		
        ArrayList columnNames = new ArrayList();
        ArrayList data = new ArrayList();

        //  Connect to an MySQL Database, run query, get result set
                    String url="jdbc:mysql://localhost:3306/agrosoft";
		            String user="root";
		            String password = "amol2260";
		            String sql = "SELECT * FROM stock";

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
