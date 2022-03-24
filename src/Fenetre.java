import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Fenetre extends JFrame {

	private JPanel contentPane;
	
	JComboBox comboBoxEtudiant = new JComboBox();
	JComboBox comboBoxMatiere = new JComboBox();
	JComboBox comboBoxDevoir = new JComboBox();

	/**
	 * Create the frame.
	 */
	public Fenetre() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelGeneral = new JPanel();
		panelGeneral.setBounds(0, 0, 600, 150);
		panelGeneral.setBackground(new Color(240, 128, 128));	
		contentPane.add(panelGeneral);
		panelGeneral.setLayout(null);
		
		JLabel lblGenerale = new JLabel("Générale");
		lblGenerale.setFont(new Font("Dialog", Font.BOLD, 14));
		lblGenerale.setBounds(30, 67, 80, 15);
		panelGeneral.add(lblGenerale);
		
		JLabel lblMoyenne = new JLabel("Moyenne");
		lblMoyenne.setBounds(169, 25, 70, 15);
		panelGeneral.add(lblMoyenne);
		
		JLabel lblMini = new JLabel("Mini");
		lblMini.setBounds(169, 65, 70, 15);
		panelGeneral.add(lblMini);
		
		JLabel lblMaxi = new JLabel("Maxi");
		lblMaxi.setBounds(169, 105, 70, 15);
		panelGeneral.add(lblMaxi);
		
		JLabel lblNoteMoyenne = new JLabel("noteMoyenne");
		lblNoteMoyenne.setBounds(270, 25, 250, 15);
		panelGeneral.add(lblNoteMoyenne);
		
		JLabel lblNoteMini = new JLabel("noteMini");
		lblNoteMini.setBounds(270, 67, 250, 15);
		panelGeneral.add(lblNoteMini);
		
		JLabel lblNotemaxi = new JLabel("noteMaxi");
		lblNotemaxi.setBounds(270, 105, 250, 15);
		panelGeneral.add(lblNotemaxi);
		
		JPanel panelEtudiant = new JPanel();
		panelEtudiant.setBounds(0, 150, 600, 100);
		panelEtudiant.setBackground(new Color(144, 238, 144));	
		contentPane.add(panelEtudiant);
		panelEtudiant.setLayout(null);
		
		JLabel lblEtudiant = new JLabel("Etudiant");
		lblEtudiant.setFont(new Font("Dialog", Font.BOLD, 14));
		lblEtudiant.setBounds(30, 42, 70, 15);
		panelEtudiant.add(lblEtudiant);
		
		JPanel panelMatiere = new JPanel();
		panelMatiere.setBounds(0, 250, 600, 100);
		panelMatiere.setBackground(new Color(135, 206, 235));	
		contentPane.add(panelMatiere);
		panelMatiere.setLayout(null);
		
		JLabel lblMatiere = new JLabel("Matière");
		lblMatiere.setFont(new Font("Dialog", Font.BOLD, 14));
		lblMatiere.setBounds(30, 42, 70, 15);
		panelMatiere.add(lblMatiere);
		
		JPanel panelDevoir = new JPanel();
		panelDevoir.setBounds(0, 350, 600, 100);
		panelDevoir.setBackground(new Color(238, 232, 170));	
		contentPane.add(panelDevoir);
		panelDevoir.setLayout(null);
		
		JLabel lblDevoir = new JLabel("Devoir");
		lblDevoir.setFont(new Font("Dialog", Font.BOLD, 14));
		lblDevoir.setBounds(30, 42, 70, 15);
		panelDevoir.add(lblDevoir);
		
		//Initialisation des boutons ci-dessous :
		
		JButton btnRechercherEtudiant = new JButton("Rechercher");
		btnRechercherEtudiant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Action ici
			}
		});
		btnRechercherEtudiant.setBounds(458, 37, 117, 25);
		panelEtudiant.add(btnRechercherEtudiant);
		
		JButton btnRechercherMatiere = new JButton("Rechercher");
		btnRechercherMatiere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Action ici
			}
		});
		btnRechercherMatiere.setBounds(458, 37, 117, 25);
		panelMatiere.add(btnRechercherMatiere);
		
		JButton btnRechercherDevoir = new JButton("Rechercher");
		btnRechercherDevoir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Action ici
			}
		});
		btnRechercherDevoir.setBounds(458, 37, 117, 25);
		panelDevoir.add(btnRechercherDevoir);
		
		//Initialisation des comboBox ci-dessous :
		
		comboBoxEtudiant.setBounds(160, 38, 273, 24);
		panelEtudiant.add(comboBoxEtudiant);
		
		comboBoxMatiere.setBounds(160, 38, 273, 24);
		panelMatiere.add(comboBoxMatiere);
		
		comboBoxDevoir.setBounds(160, 38, 273, 24);
		panelDevoir.add(comboBoxDevoir);
	}
	
	public void rafraichirJCombos(ArrayList<Matiere> lesMatieres, ArrayList<Devoir> lesDevoirs, ArrayList<Etudiant> lesEtudiants) {
		for(int i = 0; i < lesMatieres.size(); i++) {
			comboBoxMatiere.addItem(lesMatieres.get(i));
		}
		for(int i = 0; i < lesDevoirs.size(); i++) {
			comboBoxDevoir.addItem(lesDevoirs.get(i));
		}
		for(int i = 0; i < lesEtudiants.size(); i++) {
			comboBoxEtudiant.addItem(lesEtudiants.get(i));
		}
	}
}
