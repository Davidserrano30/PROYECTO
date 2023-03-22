package proyecto;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;

public class VerdadOreto extends JPanel {

	/**
	 * Create the panel.
	 */
	public VerdadOreto() {
		setBackground(new Color(153, 204, 255));
		setLayout(null);

		JLabel titelVor = new JLabel("VERDDoRETO");
		titelVor.setForeground(new Color(51, 51, 51));
		titelVor.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 27));
		titelVor.setHorizontalAlignment(SwingConstants.CENTER);
		titelVor.setBounds(202, 10, 310, 68);

		add(titelVor);

		JLabel lblVerdd = new JLabel("VERDAD");
		lblVerdd.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblVerdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblVerdd.setBackground(new Color(204, 51, 51));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblVerdd.setBackground(new Color(0, 153, 51));
			}
		});
		lblVerdd.setBackground(new Color(0, 153, 51));
		lblVerdd.setHorizontalAlignment(SwingConstants.CENTER);
		lblVerdd.setForeground(new Color(204, 255, 255));
		lblVerdd.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 27));
		lblVerdd.setBounds(10, 126, 310, 68);
		lblVerdd.setOpaque(true);
		add(lblVerdd);

		JLabel lblreto = new JLabel("RETO");
		lblreto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblreto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblreto.setBackground(new Color(0, 153, 51));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblreto.setBackground(new Color(204, 51, 51));
			}
		});
		lblreto.setBackground(new Color(204, 51, 51));
		lblreto.setHorizontalAlignment(SwingConstants.CENTER);
		lblreto.setForeground(new Color(204, 255, 255));
		lblreto.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 27));
		lblreto.setBounds(379, 126, 310, 68);
		lblreto.setOpaque(true);
		add(lblreto);

		JLabel lblPreguntas = new JLabel("preguntas");
		lblPreguntas.setHorizontalAlignment(SwingConstants.CENTER);
		lblPreguntas.setForeground(new Color(0, 0, 0));
		lblPreguntas.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 27));
		lblPreguntas.setBounds(75, 287, 532, 122);
		add(lblPreguntas);

	}
}
