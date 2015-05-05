package de.java2enterprise.onlinebanking.view;

import java.awt.Dimension;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import de.java2enterprise.onlinebanking.model.Kunde;
import de.java2enterprise.onlinebanking.service.KundeService;
import de.java2enterprise.onlinebanking.service.KundeServiceImpl;

public class MyTable  extends JScrollPane
{
	public MyTable() throws Exception
	{
		KundeService kundeService = new KundeServiceImpl();
		List<Kunde> kunden = kundeService.getKunden();
		String[][] rowData = new String[kunden.size()][2];
		for(int i = 0; i< kunden.size(); i++)
		{
			rowData[i][0] = kunden.get(i).getEmail();
			rowData[i][1] = kunden.get(i).getPassword();
		}
		String[] columnNames = {"E-Mail", "PASSWORD"};
		JTable table = new JTable(rowData, columnNames);
		setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		setPreferredSize( new Dimension(400,100));
		setViewportView(table);

	}
	}
	
