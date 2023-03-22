package proyecto;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JInternalFrame;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Principal extends JPanel {
	private JLabel lblNosAlegraVerte;
	private JTextField entraPartisipantes;
	private Participantes p = new Participantes();

	/**
	 * Create the panel.
	 */
	public Principal() {

		setBackground(new Color(255, 160, 122));
		setLayout(null);

		JLabel lblNewLabel = new JLabel("esperamos que lo pases genial");
		lblNewLabel.setBounds(93, 52, 544, 67);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 27));
		add(lblNewLabel);

		lblNosAlegraVerte = new JLabel("Nos alegra verte en nuestro juego ");
		lblNosAlegraVerte.setHorizontalAlignment(SwingConstants.CENTER);
		lblNosAlegraVerte.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 30));
		lblNosAlegraVerte.setBounds(52, 0, 613, 96);
		add(lblNosAlegraVerte);

		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Segoe Script", Font.PLAIN, 15));
		textPane.setBackground(new Color(255, 160, 122));
		textPane.setBounds(10, 108, 684, 311);
		textPane.setEditable(false);

		// declarar un variable formattedText que es una cadena de texto formateado en
		// HTML que contiene etiquetas HTML
		String formattedText = "<html>"
				+ "<p  style='font-family: \"Segoe Script\", sans-serif;font-size: 12px;'><b color=\"blue\">Yo Nunca:</b> Consta de una serie de preguntas generales que podrás preguntar a los jugadores.<br>"
				+ "<b color=\"blue\">¿Qué prefieres?</b>: Este modo de juego consiste en una pregunta que se lanza a los jugadores los cuales tendrán a su disposición elegir entre dos opciones posibles.<br>"
				+ "<b color=\"blue\">Verdad o Reto:</b> El modo de juego más típico de este tipo de momentos con tus amigos. Podrás elegir entre revelar información delicada o realizar algún reto divertido…*<br>"
				+ "<b color=\"blue\">Pícaro:</b> Este modo es para los más mayores… Tendrá varias preguntas comprometidas para subir un poco la temperatura de la habitación de una manera divertida.*<br>"
				+ "</p></html>";

		// El método setContentType se establece en "text/html" para indicar que el
		// texto está en formato HTML.
		textPane.setContentType("text/html");

		// El método setText se utiliza para establecer el texto formateado en HTML en
		// el objeto textPane para su visualización.

		textPane.setText(formattedText);
		add(textPane);

		JLabel lblNewLabel_1 = new JLabel("Añadir Participantes");
		lblNewLabel_1.setForeground(new Color(51, 0, 0));
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_1.setBounds(21, 444, 272, 50);
		add(lblNewLabel_1);

		entraPartisipantes = new JTextField();
		entraPartisipantes.setColumns(10);
		entraPartisipantes.setBounds(282, 444, 355, 44);
		add(entraPartisipantes);

		JLabel addParti = new JLabel("+");
		addParti.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String nombre = entraPartisipantes.getText();
				p.addParticipantes(nombre);
				entraPartisipantes.setText("");
			}

			@Override
			public void mouseEntered(MouseEvent e) {

				addParti.setForeground(Color.BLUE);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				addParti.setForeground(Color.black);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				addParti.setFont(new Font("Tempus Sans ITC", Font.BOLD, 45));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				addParti.setFont(new Font("Tempus Sans ITC", Font.BOLD, 55));
			}
		});
		addParti.setHorizontalAlignment(SwingConstants.CENTER);
		addParti.setForeground(Color.BLACK);
		addParti.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 55));
		addParti.setBounds(647, 444, 47, 46);
		add(addParti);

	}
}
