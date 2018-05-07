package packInterfaces;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import packModelo.GestorBD;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Register extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JPasswordField passwordField;
	private static Register miRegister;

	/**
	 * Launch the application.
	 */
	public void empezar() {
		try {
			Register dialog = getRegister();;
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Register getRegister() {
		if (miRegister == null) {
			miRegister = new Register();
		}
		return miRegister;
	}

	/**
	 * Create the dialog.
	 */
	public Register() {
		setTitle("Registrarme");
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
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Registrarme");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int h = GestorBD.getGestorBD().sqlUpdate("Insert into Usuarios(Usuario,Pass) values('" + textField.getText()
								+ "','" + new String(passwordField.getPassword()) + "');");
						if (h > 0) {
							JOptionPane.showMessageDialog(null,
									"Te has registrado correctamente, redirigiendo a la pantalla de inicio de sesión");
							miRegister.setVisible(false);
							miRegister.dispose();
							Login.getLogin().empezar();
						} else {
							JOptionPane.showMessageDialog(null, "No se ha podido realizar el registro");
						}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Volver");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						miRegister.setVisible(false);
						miRegister.dispose();
						Login.getLogin().empezar();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
