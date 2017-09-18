package com.ontime.window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import org.jdesktop.swingx.JXButton;
import org.jdesktop.swingx.JXDatePicker;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class GUIMainWindow {

	private JFrame frame;
	private JTable table_1;
	/**
	 * @wbp.nonvisual location=33,759
	 */
	private final JXButton button = new JXButton();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIMainWindow window = new GUIMainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIMainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				// TODO onLoad, set up currentDatePicker to show current date.
			}
		});
		frame.setBounds(100, 100, 550, 619);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		frame.getContentPane().setLayout(null);
		
		
		
		JButton btnStartTimer = new JButton("Start Timer");
		btnStartTimer.setBounds(10, 32, 89, 23);
		frame.getContentPane().add(btnStartTimer);
		
		JButton btnStopTimer = new JButton("Stop Timer");
		btnStopTimer.setBounds(10, 58, 89, 23);
		frame.getContentPane().add(btnStopTimer);
		
		JLabel label = new JLabel("00:00");
		label.setFont(new Font("Yu Gothic", Font.PLAIN, 26));
		label.setBounds(109, 32, 132, 47);
		frame.getContentPane().add(label);
		
		JLabel lblCurrentTask = new JLabel("Current Task :");
		lblCurrentTask.setBounds(10, 11, 110, 16);
		frame.getContentPane().add(lblCurrentTask);
		
		JLabel lblTaskText = new JLabel("Please enter a task to start");
		lblTaskText.setForeground(Color.LIGHT_GRAY);
		lblTaskText.setBounds(109, 12, 415, 14);
		frame.getContentPane().add(lblTaskText);
		
		table_1 = new JTable();
		table_1.setBounds(10, 230, 514, 318);
		frame.getContentPane().add(table_1);
		
		JXDatePicker currentDatePicker = new JXDatePicker();
		currentDatePicker.getEditor().setForeground(Color.LIGHT_GRAY);
		currentDatePicker.getEditor().setText("Select a date");
		currentDatePicker.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				// TODO on date change, run new thread to get task rows for date
			}
		});
		currentDatePicker.setBounds(6, 139, 161, 22);
		frame.getContentPane().add(currentDatePicker);
	}
}
