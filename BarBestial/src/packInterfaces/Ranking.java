package packInterfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

import packModelo.GestorBD;

public class Ranking extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private static Ranking miRanking;

	/**
	 * Launch the application.
	 */
	public void empezar() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ranking frame = getRankings();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws SQLException
	 */
	public Ranking() throws SQLException {
		setTitle("Ranking");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Rellenar las tablas con datos de la BBDD
		int size = GestorBD.getGestorBD().rowsRanking();

		ResultSet rs = GestorBD.getGestorBD().ranking();

		DefaultTableModel modelo = new DefaultTableModel();
		modelo.setColumnCount(3);
		modelo.setColumnIdentifiers(new String[] { "Usuario", "Puntuacion", "Fecha" });
		modelo.setRowCount(size + 1);

		modelo.setValueAt("Usuario", 0, 0);
		modelo.setValueAt("Puntuacion", 0, 1);
		modelo.setValueAt("Fecha", 0, 2);
		for (int i = 0; i < size; i++) {
			rs.next();
			modelo.setValueAt(rs.getString(1), i + 1, 0);
			modelo.setValueAt(rs.getInt(2), i + 1, 1);
			modelo.setValueAt(rs.getDate(3), i + 1, 2);
		}
		table = new JTable();
		table.setModel(modelo);
		table.setBounds(30, 32, 377, 190);
		contentPane.add(table);

		JButton btnVolver = new JButton("Volver");
		btnVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				miRanking.setVisible(false);
				miRanking = null;
				Login.getLogin().setVisible(true);
			}
		});
		btnVolver.setBounds(318, 228, 89, 23);
		contentPane.add(btnVolver);
	}

	public static Ranking getRankings() throws SQLException {
		if (miRanking == null) {
			miRanking = new Ranking();
		}
		return miRanking;
	}

}
