package proyecto;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.security.PublicKey;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.DropMode;

public class YoNunca extends JPanel  {
	private Participantes p = new Participantes();
	private JLabel lblNewLabel_1;

	/**
	 * Create the panel.
	 */

	public YoNunca() {

		setBackground(new Color(100, 149, 237));
		setLayout(null);

		JLabel elegirParti = new JLabel("Empzar");
		elegirParti.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				JTextPane resultadoPantalla = new JTextPane();
				resultadoPantalla.setBounds(65, 162, 595, 175);
				add(resultadoPantalla);
				resultadoPantalla.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 26));
				resultadoPantalla.setBackground(new Color(100, 149, 237));
				p.getNombres();
				resultadoPantalla.setText(p.elegirPartisipante());

			}

			@Override
			public void mousePressed(MouseEvent e) {
				elegirParti.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				elegirParti.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 30));
			}
		});

		elegirParti.setForeground(new Color(0, 0, 128));
		elegirParti.setHorizontalAlignment(SwingConstants.CENTER);
		elegirParti.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 30));
		elegirParti.setBounds(92, 407, 537, 44);
		add(elegirParti);

		lblNewLabel_1 = new JLabel("YoNunca");
		lblNewLabel_1.setFont(new Font("Nirmala UI", Font.BOLD | Font.ITALIC, 31));
		lblNewLabel_1.setToolTipText("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(239, 11, 265, 71);
		add(lblNewLabel_1);
		
	

	}
}
