package proyecto;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.Cursor;

public class QuePrefieres extends JPanel {

	/**
	 * Create the panel.
	 */
	public QuePrefieres() {
		setBackground(new Color(204, 153, 0));
		setLayout(null);

		JLabel lblNewLabel = new JLabel("Que Prefieres");
		lblNewLabel.setFont(new Font("Yu Gothic Light", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(243, 10, 216, 58);
		add(lblNewLabel);
		JProgressBar progressBarOP1 = new JProgressBar();
		progressBarOP1.setFont(new Font("Mistral", Font.BOLD | Font.ITALIC, 15));
		progressBarOP1.setForeground(new Color(0, 0, 0));
		progressBarOP1.setStringPainted(true);
		JProgressBar progressBarOP2 = new JProgressBar();
		progressBarOP2.setFont(new Font("Mistral", Font.BOLD | Font.ITALIC, 16));
		progressBarOP2.setForeground(new Color(0, 0, 0));
		progressBarOP2.setStringPainted(true);
		JLabel op1 = new JLabel("opción1");
		op1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		op1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				op1.setForeground(new Color(255, 0, 0));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				op1.setForeground(new Color(0, 0, 0));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				int  porsentage2 = (int) (Math. random()*100+1);
				int  porsentage = (int) (Math. random()*100+1);
	         if (porsentage<porsentage2) {
					
					 progressBarOP1.setForeground(new Color(255, 0, 51));
					 progressBarOP2.setForeground(new Color(51, 204, 0));
				}else {
					 progressBarOP2.setForeground(new Color(255, 0, 51));
					 progressBarOP1.setForeground(new Color(51, 204, 0));
				}
				
				progressBarOP1.setValue(porsentage);
				
				
				
				progressBarOP2.setValue(porsentage2);
				
			}
		});
		op1.setBackground(new Color(51, 255, 255));
		op1.setHorizontalAlignment(SwingConstants.CENTER);
		op1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 30));
		op1.setBounds(16, 78, 238, 116);
		add(op1);

		JLabel op2 = new JLabel("opción2");
		op2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		op2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				op2.setForeground(new Color(255, 0, 0));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				op2.setForeground(new Color(0, 0, 0));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				int  porsentage = (int) (Math. random()*100+1);
				
				int  porsentage2 = (int) (Math. random()*100+1);
				
				if (porsentage>porsentage2) {
					
					progressBarOP2.setForeground(new Color(255, 0, 51));
					progressBarOP1.setForeground(new Color(51, 204, 0));
				}else {
					progressBarOP1.setForeground(new Color(255, 0, 51));
					progressBarOP2.setForeground(new Color(51, 204, 0));
				}
				progressBarOP1.setValue(porsentage);

				progressBarOP2.setValue(porsentage2);
				
			}
		});
		op2.setHorizontalAlignment(SwingConstants.CENTER);
		op2.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 30));
		op2.setBackground(new Color(51, 255, 255));
		op2.setBounds(430, 91, 238, 91);
		add(op2);
		progressBarOP1.setValue(0);
		progressBarOP1.setBounds(16, 251, 225, 98);
		add(progressBarOP1);

	
		//progressBarOP2.setForeground(new Color(51, 204, 0));
		progressBarOP2.setValue(0);
		progressBarOP2.setBounds(443, 250, 225, 98);
		add(progressBarOP2);

		JLabel lblPorsentaje = new JLabel("porcentaje de personas que han elegido cada opción");
		lblPorsentaje.setHorizontalAlignment(SwingConstants.CENTER);
		lblPorsentaje.setFont(new Font("Yu Gothic Medium", Font.ITALIC, 27));
		lblPorsentaje.setBackground(new Color(51, 255, 255));
		lblPorsentaje.setBounds(10, 163, 681, 98);
		add(lblPorsentaje);

		JLabel lblNext = new JLabel("next ");
		lblNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				lblNext.setForeground(new Color(204, 255, 255));
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				lblNext.setForeground(new Color(51, 204, 0));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				progressBarOP2.setValue(0);
				progressBarOP1.setValue(0);
			}
		});
		lblNext.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNext.setOpaque(true);
		lblNext.setHorizontalAlignment(SwingConstants.CENTER);
		lblNext.setForeground(new Color(204, 255, 255));
		lblNext.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 27));
		lblNext.setBackground(new Color(0, 0, 0));
		lblNext.setBounds(201, 422, 263, 58);
		add(lblNext);

	}
}
