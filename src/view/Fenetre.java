package view;

import java.awt.GridLayout;
import javax.swing.JFrame;

public class Fenetre extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Fenetre(Bouton[][] boutons) {
		this.setTitle("Morpion");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.setLayout(new GridLayout(3, 3));
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				this.getContentPane().add(boutons[i][j]);
			}
		}
		
		this.setVisible(true);
	}
}
