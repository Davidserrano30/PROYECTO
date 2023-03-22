package proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AbstractDocument.Content;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.Window.Type;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.BoxLayout;

public class SpicyApp extends JFrame {
	JPanel pContent = new JPanel();
	int xMouse, yMouse;
	private JPanel backg;
	private final JPanel panel = new JPanel();

	/**
	 * Launch the application.
	 */

	// methode para mostrar paneles
	private void ShowPanel(JPanel p) {

		p.setSize(711, 522);
		p.setLocation(0, 0);
		pContent.setBounds(227, 72, 710, 532);

		pContent.removeAll();
		pContent.add(p, BorderLayout.CENTER);
		pContent.revalidate();
		pContent.repaint();

	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SpicyApp frame = new SpicyApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SpicyApp() {

		YoNunca yonunca = new YoNunca();
		QuePrefieres quePrefi = new QuePrefieres();
		VerdadOreto vOr = new VerdadOreto();
		Picaro picaro = new Picaro();
		Principal principal = new Principal();

		setLocationByPlatform(true);
		setUndecorated(true);
		setVisible(true);
		setResizable(false);
		setRootPaneCheckingEnabled(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 928, 604);
		backg = new JPanel();
		backg.setBackground(Color.WHITE);
		backg.addMouseListener(new MouseAdapter() {

		});
		backg.setBorder(new EmptyBorder(5, 5, 5, 15));

		setContentPane(backg);
		backg.setLayout(null);

		JPanel pMenu = new JPanel();
		pMenu.setBounds(227, 21, 701, 52);
		pMenu.setBackground(new Color(0, 0, 0));
		backg.add(pMenu);
		pMenu.setLayout(null);

		JLabel LabelYO_NU = new JLabel("YO NUNCA");
		LabelYO_NU.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				LabelYO_NU.setForeground(Color.white);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				LabelYO_NU.setForeground(new Color(255, 99, 71));
			}

			@Override
			public void mouseClicked(MouseEvent e) {

				ShowPanel(yonunca);
			}
		});
		LabelYO_NU.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		LabelYO_NU.setFont(new Font("Segoe Script", Font.BOLD, 16));
		LabelYO_NU.setHorizontalAlignment(SwingConstants.CENTER);
		LabelYO_NU.setForeground(new Color(255, 99, 71));
		LabelYO_NU.setBounds(10, 11, 116, 31);
		pMenu.add(LabelYO_NU);

		JLabel lblquePrefieres = new JLabel("¿QUE PREFIERES?");
		lblquePrefieres.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblquePrefieres.setForeground(Color.white);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblquePrefieres.setForeground(new Color(255, 99, 71));
			}

			@Override
			public void mouseClicked(MouseEvent e) {

				ShowPanel(quePrefi);
			}
		});
		lblquePrefieres.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblquePrefieres.setHorizontalAlignment(SwingConstants.CENTER);
		lblquePrefieres.setForeground(new Color(255, 99, 71));
		lblquePrefieres.setFont(new Font("Segoe Script", Font.BOLD, 16));
		lblquePrefieres.setBounds(157, 11, 188, 31);
		pMenu.add(lblquePrefieres);

		JLabel lblVerdadOReto = new JLabel("VERDAD O RETO");
		lblVerdadOReto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblVerdadOReto.setForeground(Color.white);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblVerdadOReto.setForeground(new Color(255, 99, 71));
			}

			@Override
			public void mouseClicked(MouseEvent e) {

				ShowPanel(vOr);
			}
		});
		lblVerdadOReto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblVerdadOReto.setHorizontalAlignment(SwingConstants.CENTER);
		lblVerdadOReto.setForeground(new Color(255, 99, 71));
		lblVerdadOReto.setFont(new Font("Segoe Script", Font.BOLD, 16));
		lblVerdadOReto.setBounds(371, 11, 190, 31);
		pMenu.add(lblVerdadOReto);

		JLabel lblPicaro = new JLabel("PICARO");
		lblPicaro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblPicaro.setForeground(Color.white);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblPicaro.setForeground(new Color(255, 99, 71));

			}

			@Override
			public void mouseClicked(MouseEvent e) {

				ShowPanel(picaro);
			}
		});
		lblPicaro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblPicaro.setHorizontalAlignment(SwingConstants.CENTER);
		lblPicaro.setForeground(new Color(255, 99, 71));
		lblPicaro.setFont(new Font("Segoe Script", Font.BOLD, 16));
		lblPicaro.setBounds(575, 11, 116, 31);
		pMenu.add(lblPicaro);
		panel.setBounds(0, 21, 228, 583);
		panel.setBackground(new Color(255, 160, 122));
		backg.add(panel);

		JLabel bSpicy = new JLabel("Spicy");
		bSpicy.setBounds(41, 11, 86, 35);
		bSpicy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				ShowPanel(principal);
			}

		});
		panel.setLayout(null);
		bSpicy.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bSpicy.setForeground(new Color(255, 0, 0));
		bSpicy.setFont(
				new Font("Segoe Script", bSpicy.getFont().getStyle() | Font.BOLD, bSpicy.getFont().getSize() + 14));
		bSpicy.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(bSpicy);

		JLabel bApp = new JLabel("App");
		bApp.setBounds(102, 11, 73, 35);
		bApp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				ShowPanel(principal);
			}

		});
		bApp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bApp.setFont(new Font("Segoe Script", bApp.getFont().getStyle() & ~Font.BOLD, bApp.getFont().getSize() + 14));
		bApp.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(bApp);

		JLabel imagen = new JLabel("");
		imagen.setBounds(0, 50, 228, 533);
		imagen.setIcon(new ImageIcon(SpicyApp.class.getResource("/imagen/Sans titre.png")));
		panel.add(imagen);

		JPanel pCerar = new JPanel();
		pCerar.setBounds(0, 0, 928, 22);
		pCerar.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
		pCerar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - xMouse, y - yMouse);

			}
		});
		pCerar.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				yMouse = e.getY();
				xMouse = e.getX();

			}
		});
		pCerar.setBackground(new Color(220, 220, 220));
		backg.add(pCerar);
		pCerar.setLayout(null);

		JLabel lblCERAR = new JLabel("X");
		lblCERAR.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				lblCERAR.setForeground(Color.red);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblCERAR.setForeground(Color.black);
			}
		});
		lblCERAR.setBounds(458, 0, 13, 21);
		pCerar.add(lblCERAR);
		lblCERAR.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblCERAR.setFont(new Font("Rockwell", Font.BOLD, 17));
		lblCERAR.setHorizontalAlignment(SwingConstants.CENTER);
		backg.add(pContent);
		pContent.setLayout(new BoxLayout(pContent, BoxLayout.X_AXIS));

		ShowPanel(principal);

	}
}
