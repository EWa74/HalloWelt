package de.java2enterprise.onlinebanking;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import de.java2enterprise.onlinebanking.service.KundeService;
import de.java2enterprise.onlinebanking.service.KundeServiceImpl;
import de.java2enterprise.onlinebanking.view.MyButton;
import de.java2enterprise.onlinebanking.view.MyLabel;
import de.java2enterprise.onlinebanking.view.MyTextField;

 
public class Onlinebanking  extends Frame  
{
	private Panel loginPanel = new Panel();
	private MyLabel lUsername = new MyLabel(20,50, "Username:");
	private MyTextField tfUsername = new MyTextField(150, 50);
	private MyLabel lPassword = new MyLabel(20,100, "Password:");
	private MyTextField tfPassword = new MyTextField(150, 100);
	private MyButton bOK = new MyButton(20, 150, "OK");
	private MyButton bCancel = new MyButton(150, 150, "Cancel");
	
	
	public static void main(String[] args) throws Exception 
	{
		/* Treiber in die Laufzeit integrieren: */
		/* Beachte: den Dienst mysqld vom command window ("DOS-Fenster") aus starten */
		new Onlinebanking(); 
	}
		
	public Onlinebanking()
	{
		setSize(400, 300);
		setLocation(200, 200);
		setTitle("Onlinebanking");
		getLoginPanel().setLayout(null);
		
		add(loginPanel);
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
						String password = getTfPassword().getText();
						boolean valid = kundeService.validate(email, password);
						if(valid)
						{
							System.out.println("Sie wurden authentifiziert!");
						}else
						{
							System.out.println("Ungültige Anmeldung!");
						}
					} catch(Exception ex)
					{
						ex.printStackTrace();
					}	
				});
		bCancel.addActionListener( e ->
		{
			System.out.println("Cancel Button betätigt!");
		});
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("onlinebanking.jpg"));
		setVisible(true);
		addWindowListener( new WindowAdapter()
		{
			public void windowClosing(WindowEvent event)
			{
				dispose();
			}
		});
	}

	public Panel getLoginPanel() {
		return loginPanel;
	}

	public void setLoginPanel(Panel loginPanel) {
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

	public MyTextField getTfPassword() {
		return tfPassword;
	}

	public void setTfPassword(MyTextField tfPassword) {
		this.tfPassword = tfPassword;
	}

} 