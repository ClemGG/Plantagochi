package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel Lune;
	private JLabel Sol;
	private JLabel lblLuminosit;
	private JLabel lblT;
	private JLabel lblHair;
	private JLabel lblHsol;
	private JLabel Plante;
	private JButton btnSwitchLumiere;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Window frame = new Window();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Window() {
		setTitle("PlantagochiDeMerde.exe");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 837, 753);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLUE);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Plante = new JLabel("");
		Plante.setIcon(new ImageIcon(Window.class.getResource("/view/plant.png")));
		Plante.setBounds(215, 110, 355, 596);
		contentPane.add(Plante);
		
		btnSwitchLumiere = new JButton("Allumer");
		btnSwitchLumiere.setBounds(65, 584, 97, 25);
		contentPane.add(btnSwitchLumiere);
		
		lblHsol = new JLabel("H.Sol : 0");
		lblHsol.setForeground(Color.BLUE);
		lblHsol.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHsol.setBounds(581, 610, 97, 43);
		contentPane.add(lblHsol);
		
		lblHair = new JLabel("H.Air : 0");
		lblHair.setForeground(Color.BLUE);
		lblHair.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHair.setBounds(611, 372, 97, 43);
		contentPane.add(lblHair);
		
		lblT = new JLabel("Temp : 0 \u00B0C");
		lblT.setForeground(Color.RED);
		lblT.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblT.setBounds(611, 319, 97, 43);
		contentPane.add(lblT);
		
		lblLuminosit = new JLabel("Luminosit\u00E9 : 0");
		lblLuminosit.setForeground(Color.ORANGE);
		lblLuminosit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLuminosit.setBounds(306, 87, 182, 43);
		contentPane.add(lblLuminosit);
		
		Sol = new JLabel("");
		Sol.setIcon(new ImageIcon(Window.class.getResource("/view/th.jpg")));
		Sol.setBounds(84, 13, 120, 104);
		contentPane.add(Sol);
		
		Lune = new JLabel("");
		Lune.setIcon(new ImageIcon(Window.class.getResource("/view/276017.png")));
		Lune.setBounds(611, 38, 67, 63);
		contentPane.add(Lune);
		
		
	}


	public JPanel getContentPane() {
		return contentPane;
	}

	public JLabel getLblNewLabel_3() {
		return Lune;
	}

	public JLabel getLblNewLabel_2() {
		return Sol;
	}

	public JLabel getLblLuminosit() {
		return lblLuminosit;
	}

	public JLabel getLblT() {
		return lblT;
	}

	public JLabel getLblHair() {
		return lblHair;
	}

	public JLabel getLblHsol() {
		return lblHsol;
	}


	public JButton getBtnSwitchLumiere() {
		return btnSwitchLumiere;
	}


	
	
}
