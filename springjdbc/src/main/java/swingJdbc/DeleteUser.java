package swingJdbc;

import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DeleteUser extends JFrame {
	Boolean x = true;
	JLabel l1;
	private static final long serialVersionUID = -3105459112998680273L;
	DeleteUser()
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Push bean = context.getBean("push",Push.class);
		List<User> allUser = bean.getAllUser();	
		Iterator<User> iterator = allUser.iterator();
	
		this.setVisible(true);
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel l2 = new JLabel("hello");
		l2.setBounds(60, 40, 100, 20);
		this.add(l2);
	
			
	
      
		while(iterator.hasNext())
		{
		User u =iterator.next();
		 l1 = new JLabel(u.getFirstname())
				 
		    l2.setBounds(40, 40, 100, 20);
			this.add(l1);
		
		}

	}
}
