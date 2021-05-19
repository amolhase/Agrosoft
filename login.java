import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;
class login extends JFrame
{
	login()
	{
		//Font
		Font f=new Font("arial",Font.BOLD,80);
		
		//header
		JPanel header=new JPanel();
		header.setBackground(new Color(0,0,0,100));    //set header background
		header.setBounds(0,0,1400,100);
		JLabel name=new JLabel("WELCOME");
		name.setFont(f);                             //set font to the name
		name.setForeground(Color.WHITE);            //set the text color of name
		header.add(name);
		
		//loginpanel
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
         
        //Button
		JButton b1=new JButton("login");
		b1.setBounds(50,230,100,50);
		b1.setFont(new Font("arial",Font.BOLD,25));
		b1.setBackground(Color.BLUE);
		b1.setForeground(Color.WHITE);
		login.add(b1);
		 
		//Frame
		setTitle("login frame");
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
		background.add(header);
        background.add(login);
		setVisible(true); 
		
       //username and password validation
	    b1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {

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
	
	    //Exit
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
}
class logindemo
{
	public static void main(String[] args)
	{
		 new login();
	}
}




