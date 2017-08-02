package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.Bouton;
import view.Fenetre;

public class Morpion {

	public static void main(String[] args) {
		Gameplay gm = new Gameplay();
		Bouton[][] boutons = new Bouton[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				Bouton bouton = new Bouton(i, j);
				bouton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						if (!gm.isFinished()) {
							if (gm.isPlayer()) {
								if (!gm.isOccuped(bouton.get_x(), bouton.get_y())) {
									bouton.setText("O");
									gm.setValue(bouton.get_x(), bouton.get_y());
									gm.setPlayer(!gm.isPlayer());
								}
							} else {
								if (!gm.isOccuped(bouton.get_x(), bouton.get_y())) {
									bouton.setText("X");
									gm.setValue(bouton.get_x(), bouton.get_y());
									gm.setPlayer(!gm.isPlayer());
								}
							}
							if (gm.checkMap()) {
								if (gm.isPlayer()) {									
									JOptionPane.showMessageDialog(
											null, 
											"Le joueur avec les croix a gagné", 
											"Résultat", 
											JOptionPane.INFORMATION_MESSAGE);
								} else {
									JOptionPane.showMessageDialog(
											null, 
											"Le joueur avec les cercles a gagné", 
											"Résultat", 
											JOptionPane.INFORMATION_MESSAGE);
								}
								gm.setFinished(true);
							}
						}
					}
				});
				boutons[i][j] = bouton;
			}
		}
		@SuppressWarnings("unused")
		Fenetre fen = new Fenetre(boutons);
	}

}
