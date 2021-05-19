import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;
import java.time.*;
import java.util.Date; 
import javax.swing.border.*;
import java.sql.*;
import java.util.*;

class bill extends JFrame
{
	int j=0,k=0,i=1;
	JTextField tpamount;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25;
	JTextField t26,t27,t28,t29,t30,t31,t32,t33,t34,t35,t36,t37,t38,t39,t40,t41,t42,t43,t44,t45,t46,t47,t48,t49,t50;
	double total_amount;
	bill()
	{
		//panel2
		JPanel panel2 = new JPanel();
		panel2.setBorder(BorderFactory.createLineBorder(Color.BLUE,3));
		panel2.setLayout(null);
		panel2.setBounds(60,90,1200,480);
		panel2.setBackground(new Color(0,0,0,100));
		
		//Bill number
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
		//Date
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
		
		
		//customer name
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
		
		//aadhar number
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
	
	//pending amount
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
	
	//Batch no
		JLabel l5=new JLabel("Batch no");
		l5.setBounds(60,100,140,20);
		l5.setFont(new Font("arial",Font.BOLD,17));
		l5.setForeground(Color.WHITE);
		panel2.add(l5);
	
	//product name
		JLabel l6=new JLabel("Product name");
		l6.setBounds(200,100,140,20);
		l6.setFont(new Font("arial",Font.BOLD,17));
		l6.setForeground(Color.WHITE);
		panel2.add(l6);
	
	//expiry date
		JLabel l7=new JLabel("Expiry date");
		l7.setBounds(360,100,140,20);
		l7.setFont(new Font("arial",Font.BOLD,17));
		l7.setForeground(Color.WHITE);
		panel2.add(l7);
	
	//size
		JLabel l8=new JLabel("size");
		l8.setBounds(520,100,140,20);
		l8.setFont(new Font("arial",Font.BOLD,17));
		l8.setForeground(Color.WHITE);
		panel2.add(l8);
	
	//Rate
		JLabel l9=new JLabel("Rate");
		l9.setBounds(600,100,140,20);
		l9.setFont(new Font("arial",Font.BOLD,17));
		l9.setForeground(Color.WHITE);
		panel2.add(l9);
	
	//GST
		JLabel l10=new JLabel("GST");
		l10.setBounds(700,100,140,20);
		l10.setFont(new Font("arial",Font.BOLD,17));
		l10.setForeground(Color.WHITE);
		panel2.add(l10);
	
	//amount
		JLabel l11=new JLabel("Tax");
		l11.setBounds(820,100,140,20);
		l11.setFont(new Font("arial",Font.BOLD,17));
		l11.setForeground(Color.WHITE);
		panel2.add(l11);
	
	//Quantity
		JLabel l12=new JLabel("Quantity");
		l12.setBounds(950,100,140,20);
		l12.setFont(new Font("arial",Font.BOLD,17));
		l12.setForeground(Color.WHITE);
		panel2.add(l12);
		
		//total
		JLabel l13=new JLabel("Total");
		l13.setBounds(1080,100,140,20);
		l13.setFont(new Font("arial",Font.BOLD,17));
		l13.setForeground(Color.WHITE);
		panel2.add(l13);
	
	
	//row 1 of bill 
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
		t6.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t6);
		
		t7=new JTextField("");
		t7.setBounds(350,135,120,25);
		t7.setForeground(Color.BLUE);
		t7.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t7);
		
	    t8=new JTextField("");
		t8.setBounds(500,135,70,25);
		t8.setForeground(Color.BLUE);
		t8.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t8);
		
		
		t9=new JTextField("");
		t9.setBounds(590,135,70,25);
		t9.setForeground(Color.BLUE);
		t9.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t9);
		
		t10=new JTextField("");
		t10.setBounds(680,135,100,25);
		t10.setForeground(Color.BLUE);
		t10.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t10);
		
		t11=new JTextField("");
		t11.setBounds(800,135,100,25);
		t11.setForeground(Color.BLUE);
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
		
		//row 2 of bill
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
		t15.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t15);
		
	    t16=new JTextField("");
		t16.setBounds(350,175,120,25);
		t16.setForeground(Color.BLUE);
		t16.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t16);
		
	    t17=new JTextField("");
		t17.setBounds(500,175,70,25);
		t17.setForeground(Color.BLUE);
		t17.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t17);
		
	    t18=new JTextField("");
		t18.setBounds(590,175,70,25);
		t18.setForeground(Color.BLUE);
		t18.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t18);
		
		t19=new JTextField("");
		t19.setBounds(680,175,100,25);
		t19.setForeground(Color.BLUE);
		t19.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t19);
		
		t20=new JTextField("");
		t20.setBounds(800,175,100,25);
		t20.setForeground(Color.BLUE);
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
		
		//row 3 of bill
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
		t24.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t24);
		
		t25=new JTextField("");
		t25.setBounds(350,215,120,25);
		t25.setForeground(Color.BLUE);
		t25.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t25);
		
		t26=new JTextField("");
		t26.setBounds(500,215,70,25);
		t26.setForeground(Color.BLUE);
		t26.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t26);
		
		t27=new JTextField("");
		t27.setBounds(590,215,70,25);
		t27.setForeground(Color.BLUE);
		t27.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t27);
		
		t28=new JTextField("");
		t28.setBounds(680,215,100,25);
		t28.setForeground(Color.BLUE);
		t28.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t28);
		
		t29=new JTextField("");
		t29.setBounds(800,215,100,25);
		t29.setForeground(Color.BLUE);
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
		
		
		//row 4 of bill
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
		t33.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t33);
		
		t34=new JTextField("");
		t34.setBounds(350,255,120,25);
		t34.setForeground(Color.BLUE);
		t34.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t34);
		
		t35=new JTextField("");
		t35.setBounds(500,255,70,25);
		t35.setForeground(Color.BLUE);
		t35.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t35);
		
		t36=new JTextField("");
		t36.setBounds(590,255,70,25);
		t36.setForeground(Color.BLUE);
		t36.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t36);
		
		t37=new JTextField("");
		t37.setBounds(680,255,100,25);
		t37.setForeground(Color.BLUE);
		t37.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t37);
		
		t38=new JTextField("");
		t38.setBounds(800,255,100,25);
		t38.setForeground(Color.BLUE);
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
		
		//row 5 of bill
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
		t42.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t42);
		
		t43=new JTextField("");
		t43.setBounds(350,295,120,25);
		t43.setForeground(Color.BLUE);
		t43.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t43);
		
		t44=new JTextField("");
		t44.setBounds(500,295,70,25);
		t44.setForeground(Color.BLUE);
		t44.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t44);
		
		t45=new JTextField("");
		t45.setBounds(590,295,70,25);
		t45.setForeground(Color.BLUE);
		t45.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t45);
		
		t46=new JTextField("");
		t46.setBounds(680,295,100,25);
		t46.setForeground(Color.BLUE);
		t46.setFont(new Font("arial",Font.BOLD,17));
		panel2.add(t46);
		
		t47=new JTextField("");
		t47.setBounds(800,295,100,25);
		t47.setForeground(Color.BLUE);
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
			
		//total amount
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
	
	
		//submit button
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
		
		            //2.Load Jdbc driverClassName
		            Class.forName("com.mysql.jdbc.Driver");
	
	                 Connection con = null;
		             con = DriverManager.getConnection(url,user,password);
					 
					// value1+=1;
					// t1.setText(""+value1);
					 
					 PreparedStatement st1 = null,st2=null,st3=null,st4=null,st5=null,st6=null,ins1=null,ins2=null,ins3=null,ins4=null,ins5=null;
					/* //update customer pending amount
		            st1 = con.prepareStatement("update customer set pending_amt=pending_amt+? where aadhar_no=?");
					st1.setDouble(1,value30);
					st1.setDouble(2,value4);
					 st1.executeUpdate();*/
					 
					//insert first row details and update quantity 
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
					 
					//insert second row details and update quantity
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
					
					//insert third row details and update quantity
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
					
					//insert fourth row details and update quantity
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
					
					//insert fifth row details and update quantity
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
					
					//t50.setText(""+total_amount);
					total_amount=amount1+amount2+amount3+amount4+amount5;
					t50.setText(""+total_amount);
					PreparedStatement st = null;
					//value1-=1;
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
		
		//delete button
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
		
		//refresh button
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
				//t1.setText(null);      t2.setText(null);
				t3.setText(null);      t4.setText(null);
				t5.setText(null);      t6.setText(null);
				t7.setText(null);      t8.setText(null);
				t9.setText(null);      t10.setText(null);
				t11.setText(null);     t12.setText(null);
				t13.setText(null);     t14.setText(null);
				t15.setText(null);     t16.setText(null);
				t17.setText(null);     t18.setText(null);
				t19.setText(null);     t20.setText(null);
				t21.setText(null);     t22.setText(null);
				t23.setText(null);     t24.setText(null);
				t25.setText(null);     t26.setText(null);
				t27.setText(null);     t28.setText(null);
				t29.setText(null);     t30.setText(null);
				t31.setText(null);     t32.setText(null);
				t33.setText(null);     t34.setText(null);
				t35.setText(null);     t36.setText(null);
				t37.setText(null);     t38.setText(null);
				t39.setText(null);     t40.setText(null);
				t41.setText(null);     t42.setText(null);
				t43.setText(null);     t44.setText(null);
				t45.setText(null);     t46.setText(null);
				t47.setText(null);     t48.setText(null);
				t49.setText(null);     t50.setText(null);
				tpamount.setText(null);
			}
		});
		
		
		//view
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
       // c.setDefaultCloseOperation( EXIT_ON_CLOSE );
        b.pack();
		//b.setSize(1360,700);
		b.setBounds(400,200,700,400);
        b.setVisible(true);
			}
		});
		
		
		//home button
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
		
		//Frame
		setTitle("BILL");
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
class billdemo
{
	public static void main(String[] args)
	{
		new bill();
	}
}



class transaction extends JFrame
{
    public transaction()
	{
		
        ArrayList columnNames = new ArrayList();
        ArrayList data = new ArrayList();

        //  Connect to an MySQL Database, run query, get result set
                    String url="jdbc:mysql://localhost:3306/agrosoft_amol";
		            String user="root";
		            String password = "amol2260";
		            String sql = "SELECT * FROM transaction_details";

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


//billdata

class billdata extends JFrame
{
    public billdata()
	{
		
        ArrayList columnNames = new ArrayList();
        ArrayList data = new ArrayList();

        //  Connect to an MySQL Database, run query, get result set
                    String url="jdbc:mysql://localhost:3306/agrosoft_amol";
		            String user="root";
		            String password = "amol2260";
		            String sql = "SELECT * FROM bill";

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
		
      /*  JPanel panel = new JPanel();
		panel.setBounds(20,20,1200,500);
		panel.setBackground(new Color(0,0,0,100));
        getContentPane().add( panel );
		*/
		 JScrollPane pane = new JScrollPane( table );
		pane.setBounds(20,20,1360,700);
		getContentPane().setBackground(Color.RED);
        getContentPane().add( pane );
		
		/*JButton back = new JButton("Back");
		back.setBounds(800,650,100,100);
		back.setForeground(Color.BLUE);
		panel.add(back);
		
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				new home();
				dispose();
			}
		});
		*/
    }
}
