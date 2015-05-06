package de.java2enterprise.onlinebanking;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import de.java2enterprise.onlinebanking.service.KundeService;
import de.java2enterprise.onlinebanking.service.KundeServiceImpl;
import de.java2enterprise.onlinebanking.view.MyButton;
import de.java2enterprise.onlinebanking.view.MyLabel;
import de.java2enterprise.onlinebanking.view.MyPasswordField;
import de.java2enterprise.onlinebanking.view.MyTable;
import de.java2enterprise.onlinebanking.view.MyTextField;

 
public class Onlinebanking  extends JFrame  
{
	private JPanel loginPanel = new JPanel();
	private MyLabel lUsername = new MyLabel("Username:");
	private MyTextField tfUsername = new MyTextField();
	private MyLabel lPassword = new MyLabel("Password:");
	private MyPasswordField tfPassword = new MyPasswordField();
	private MyButton bOK = new MyButton("OK");
	private MyButton bCancel = new MyButton("Cancel");
	private MyLabel lHeadline = new MyLabel("Onlinebanking");
	private MyTable table;
	
	
	public static void main(String[] args) throws Exception 
	{
		/* Treiber in die Laufzeit integrieren: */
		/* Beachte: den Dienst mysqld vom command window ("DOS-Fenster") aus starten Bei WIN8 als Admin!!*/
		new Onlinebanking(); 
	}
		
	public Onlinebanking() throws Exception
	{
		setSize(400, 300);
		setLocation(200, 200);
		setTitle("Onlinebanking");
		setLayout( new BorderLayout(30, 30));
		getLoginPanel().setLayout( new GridLayout(3,2, 30,30));
		add(loginPanel);
		add(lHeadline, BorderLayout.NORTH);

		
		getLoginPanel().add(lUsername);
		getLoginPanel().add(tfUsername);
		getLoginPanel().add(lPassword);
		getLoginPanel().add(tfPassword);
		getLoginPanel().add(bOK);
		getLoginPanel().add(bCancel);
		
		bOK.addActionListener( e -> 
				{
					try
					{
						KundeService kundeService = new KundeServiceImpl();
						String email = getTfUsername().getText();
						String password = new String(getTfPassword().getPassword());
						boolean valid = kundeService.validate(email, password);
						if(valid)
						{
							JOptionPane.showMessageDialog(this, "Sie wurden authentifiziert!");
						}else
						{
							JOptionPane.showMessageDialog(this, "Ungültige Anmeldung!");
						}
					} catch(Exception ex)
					{
						JOptionPane.showMessageDialog(this,ex.getMessage());
					}	
				});
		bCancel.addActionListener( e ->
		{
			JOptionPane.showMessageDialog(this,"Cancel Button betätigt!");
		});
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("onlinebanking.jpg"));
		getContentPane().setBackground(Color.WHITE);
		getLoginPanel().setBackground(Color.WHITE);
		addWindowListener(new WindowAdapter() 
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				setVisible(false);
				dispose(); /* ruft automatisch windowClosed() auf*/
			}
			
			@Override
			public void windowClosed(WindowEvent e)
			{
				System.exit(0);
			}
		});	
		add(new MyTable(), BorderLayout.SOUTH);
		
		JMenuBar mb = new JMenuBar();
		JMenu menu = new JMenu("Programm");
		mb.add(menu);
		
		JMenuItem miBeenden = new JMenuItem("Beenden");
		miBeenden.addActionListener(e -> System.exit(0));
		menu.add(miBeenden);
		
		setJMenuBar(mb);
			
		pack();
		setVisible(true);
	}


	public JPanel getLoginPanel() {
		return loginPanel;
	}

	public void setLoginPanel(JPanel loginPanel) {
		this.loginPanel = loginPanel;
	}

	public MyLabel getlUsername() {
		return lUsername;
	}

	public void setlUsername(MyLabel lUsername) {
		this.lUsername = lUsername;
	}

	public MyTextField getTfUsername() {
		return tfUsername;
	}

	public void setTfUsername(MyTextField tfUsername) {
		this.tfUsername = tfUsername;
	}

	public MyLabel getlPassword() {
		return lPassword;
	}

	public void setlPassword(MyLabel lPassword) {
		this.lPassword = lPassword;
	}

	
	public MyPasswordField getTfPassword() {
		return tfPassword;
	}

	public void setTfPassword(MyPasswordField tfPassword) {
		this.tfPassword = tfPassword;
	}

	public MyButton getbOK() {
		return bOK;
	}

	public void setbOK(MyButton bOK) {
		this.bOK = bOK;
	}

	public MyButton getbCancel() {
		return bCancel;
	}

	public void setbCancel(MyButton bCancel) {
		this.bCancel = bCancel;
	}

	public MyLabel getlHeadline() {
		return lHeadline;
	}

	public void setlHeadline(MyLabel lHeadline) {
		this.lHeadline = lHeadline;
	}


} 