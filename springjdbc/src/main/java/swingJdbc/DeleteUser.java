package swingJdbc;

import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DeleteUser extends JFrame {
	Boolean x = true;
	JLabel l1;
	private static final long serialVersionUID = -3105459112998680273L;
	DeleteUser()
	{
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel l2 = new JLabel("hello");
		l2.setBounds(60, 40, 100, 20);
		this.add(l2);
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Push bean = context.getBean("push",Push.class);
		List<User> allUser = bean.getAllUser();	
		Iterator<User> iterator = allUser.iterator();
		while(iterator.hasNext())
		{
		User u =iterator.next();
		System.out.println(u);
		}

	}
}