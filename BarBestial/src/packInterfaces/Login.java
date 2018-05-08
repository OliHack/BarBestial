package packInterfaces;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import packModelo.GestorBD;
import packModelo.ListaJugador;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JPasswordField passwordField;
	private static Login miLogin;

	/**
	 * Launch the application.
	 */
	public void empezar() {
		try {
			Login dialog = getLogin();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Login getLogin() {
		if (miLogin == null) {
			miLogin = new Login();
		}
		return miLogin;
	}

	/**
	 * Create the dialog.
	 */
	public Login() {
		setTitle("Iniciar Sesión");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPanel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPanel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 1.0,
				Double.MIN_VALUE };
		gbl_contentPanel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblUsuario = new JLabel("Usuario");
			GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
			gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
			gbc_lblUsuario.gridx = 3;
			gbc_lblUsuario.gridy = 2;
			contentPanel.add(lblUsuario, gbc_lblUsuario);
		}
		{
			textField = new JTextField();
			GridBagConstraints gbc_textField = new GridBagConstraints();
			gbc_textField.gridwidth = 3;
			gbc_textField.insets = new Insets(0, 0, 5, 5);
			gbc_textField.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField.gridx = 5;
			gbc_textField.gridy = 2;
			contentPanel.add(textField, gbc_textField);
			textField.setColumns(10);
		}
		{
			JLabel lblContrasea = new JLabel("Contraseña");
			GridBagConstraints gbc_lblContrasea = new GridBagConstraints();
			gbc_lblContrasea.insets = new Insets(0, 0, 5, 5);
			gbc_lblContrasea.gridx = 3;
			gbc_lblContrasea.gridy = 4;
			contentPanel.add(lblContrasea, gbc_lblContrasea);
		}
		{
			passwordField = new JPasswordField();
			GridBagConstraints gbc_passwordField = new GridBagConstraints();
			gbc_passwordField.gridwidth = 3;
			gbc_passwordField.insets = new Insets(0, 0, 5, 5);
			gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
			gbc_passwordField.gridx = 5;
			gbc_passwordField.gridy = 4;
			contentPanel.add(passwordField, gbc_passwordField);
		}
		{
			JButton btnRegistrarme = new JButton("Registrarme");
			btnRegistrarme.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					miLogin.setVisible(false);
					miLogin.dispose();
					Register.getRegister().empezar();
				}
			});
			GridBagConstraints gbc_btnRegistrarme = new GridBagConstraints();
			gbc_btnRegistrarme.insets = new Insets(0, 0, 0, 5);
			gbc_btnRegistrarme.gridx = 8;
			gbc_btnRegistrarme.gridy = 6;
			contentPanel.add(btnRegistrarme, gbc_btnRegistrarme);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Iniciar Sesión");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						ResultSet rs = null;
						rs = GestorBD.getGestorBD()
								.sqlExec("Select * from Usuarios where usuario = '" + textField.getText()
										+ "' and pass = '" + new String(passwordField.getPassword()) + "';");
						try {
							if (rs.next()) {
								JOptionPane.showMessageDialog(null, "Has iniciado sesión correctamente");
								miLogin.setVisible(false);
								miLogin.dispose();
								IPartida frame = IPartida.getIPartida(textField.getText());
								frame.setVisible(true);
							} else {
								JOptionPane.showMessageDialog(null, "Inicio de sesión erróneo");
							}
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Salir");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
