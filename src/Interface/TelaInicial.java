package Interface;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class TelaInicial extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JLabel lblNewLabel_4;
    private JLabel lblNewLabel_4_1;
    private final JButton botaoSimples;
    private JButton btnNewButton_1;
    private JPanel panel;
	protected JTextField textField_4;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TelaInicial frame = new TelaInicial();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public TelaInicial() {
        super("PetShop"); // aba
        this.botaoSimples = new JButton();

        getContentPane().setLayout(new FlowLayout());// aba
        ImageIcon icone = new ImageIcon(getClass().getResource("/pet.png"));// aba
        setIconImage(((ImageIcon) icone).getImage());// aba

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 526, 356);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JButton btnNewButton = new JButton("CADASTRAR CLIENTE"); // botao
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evento) { // janela de cadastro realizado
                JOptionPane.showMessageDialog(null, String.format("CADASTRO REALIZADO", evento.getActionCommand()));
            }

        });
        SpringLayout sl_contentPane = new SpringLayout();
        sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, 10, SpringLayout.NORTH, contentPane);
        sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, 10, SpringLayout.WEST, contentPane);
        sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton, 166, SpringLayout.WEST, contentPane);
        contentPane.setLayout(sl_contentPane);
        contentPane.add(btnNewButton);

        textField = new JTextField();// dialogo nome
        sl_contentPane.putConstraint(SpringLayout.WEST, textField, 10, SpringLayout.WEST, contentPane);
        sl_contentPane.putConstraint(SpringLayout.SOUTH, textField, -229, SpringLayout.SOUTH, contentPane);
        sl_contentPane.putConstraint(SpringLayout.EAST, textField, 0, SpringLayout.EAST, btnNewButton);
        contentPane.add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel = new JLabel("Nome"); // cliente
        sl_contentPane.putConstraint(SpringLayout.NORTH, textField, 7, SpringLayout.SOUTH, lblNewLabel);
        sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel, -256, SpringLayout.SOUTH, contentPane);
        sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, btnNewButton);
        sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel, -432, SpringLayout.EAST, contentPane);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Telefone");// cliente
        sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 6, SpringLayout.SOUTH, textField);
        sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, btnNewButton);
        sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -214, SpringLayout.SOUTH, contentPane);
        sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel_1, -395, SpringLayout.EAST, contentPane);
        contentPane.add(lblNewLabel_1);

        textField_1 = new JTextField();// dialogo telefone
        sl_contentPane.putConstraint(SpringLayout.NORTH, textField_1, 6, SpringLayout.SOUTH, lblNewLabel_1);
        sl_contentPane.putConstraint(SpringLayout.WEST, textField_1, 0, SpringLayout.WEST, btnNewButton);
        sl_contentPane.putConstraint(SpringLayout.SOUTH, textField_1, -188, SpringLayout.SOUTH, contentPane);
        sl_contentPane.putConstraint(SpringLayout.EAST, textField_1, -5, SpringLayout.EAST, btnNewButton);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        JLabel lblNewLabel_2 = new JLabel("Endereço");// cliente
        sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 6, SpringLayout.SOUTH, textField_1);
        sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, btnNewButton);
        contentPane.add(lblNewLabel_2);

        textField_2 = new JTextField();// dialogo endereço
        sl_contentPane.putConstraint(SpringLayout.NORTH, textField_2, 6, SpringLayout.SOUTH, lblNewLabel_2);
        sl_contentPane.putConstraint(SpringLayout.WEST, textField_2, 0, SpringLayout.WEST, btnNewButton);
        sl_contentPane.putConstraint(SpringLayout.EAST, textField_2, -5, SpringLayout.EAST, btnNewButton);
        contentPane.add(textField_2);
        textField_2.setColumns(10);

        JLabel lblNewLabel_3 = new JLabel("Pet(s)");// cliente
        sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 6, SpringLayout.SOUTH, textField_2);
        sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_3, 0, SpringLayout.WEST, btnNewButton);
        contentPane.add(lblNewLabel_3);

        textField_3 = new JTextField();// dialogo
        sl_contentPane.putConstraint(SpringLayout.NORTH, textField_3, 6, SpringLayout.SOUTH, lblNewLabel_3);
        sl_contentPane.putConstraint(SpringLayout.WEST, textField_3, 0, SpringLayout.WEST, btnNewButton);
        sl_contentPane.putConstraint(SpringLayout.EAST, textField_3, -5, SpringLayout.EAST, btnNewButton);
        contentPane.add(textField_3);
        textField_3.setColumns(10);

        setLblNewLabel_4(new JLabel());// imagem tela
        ImageIcon tela = new ImageIcon(getClass().getResource("/pet.png"));
        lblNewLabel_4_1         = new JLabel(tela, SwingConstants.LEFT);
        sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_4_1, 10, SpringLayout.NORTH, contentPane);
        sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_4_1, 20, SpringLayout.EAST, btnNewButton);
        sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel_4_1, 235, SpringLayout.NORTH, contentPane);
        contentPane.add(lblNewLabel_4_1);

        btnNewButton_1 = new JButton("BUSCAR CLIENTE");// botao buscar cliente
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evento) {
                JOptionPane.showMessageDialog(null, String.format("Informe o telefone: ", evento.getActionCommand()));
                panel = new JPanel();
                JTextField textField_5 = new JTextField();// dialogo
                sl_contentPane.putConstraint(SpringLayout.NORTH, textField_3, 6, SpringLayout.SOUTH, textField_5);
                sl_contentPane.putConstraint(SpringLayout.WEST, textField_3, 0, SpringLayout.WEST, btnNewButton_1);
                sl_contentPane.putConstraint(SpringLayout.EAST, textField_3, -5, SpringLayout.EAST, btnNewButton_1);

                contentPane.add(textField_5);
                textField_4.setColumns(10);
                contentPane.add(panel);
            }
        });
        sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_1, -33, SpringLayout.SOUTH, contentPane);
        sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_1, -216, SpringLayout.EAST, contentPane);
        sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_1, -10, SpringLayout.SOUTH, contentPane);
        sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_1, -43, SpringLayout.EAST, contentPane);
        contentPane.add(btnNewButton_1);

    }

	public JLabel getLblNewLabel_4_1() {
		return lblNewLabel_4_1;
	}

	public void setLblNewLabel_4_1(JLabel lblNewLabel_4_1) {
		this.lblNewLabel_4_1 = lblNewLabel_4_1;
	}

	public JButton getBotaoSimples() {
		return botaoSimples;
	}

	public JLabel getLblNewLabel_4() {
		return lblNewLabel_4;
	}

	public void setLblNewLabel_4(JLabel lblNewLabel_4) {
		this.lblNewLabel_4 = lblNewLabel_4;
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}

	public JTextField getTextField_3() {
		return textField_3;
	}

	public void setTextField_3(JTextField textField_3) {
		this.textField_3 = textField_3;
	}

	public JButton getBtnNewButton_1() {
		return btnNewButton_1;
	}

	public void setBtnNewButton_1(JButton btnNewButton_1) {
		this.btnNewButton_1 = btnNewButton_1;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JTextField getTextField_4() {
		return textField_4;
	}

	public void setTextField_4(JTextField textField_4) {
		this.textField_4 = textField_4;
	}

	@Override
	public String toString() {
		return "TelaInicial [contentPane=" + contentPane + ", textField=" + textField + ", textField_1=" + textField_1
				+ ", textField_2=" + textField_2 + ", textField_3=" + textField_3 + ", lblNewLabel_4=" + lblNewLabel_4
				+ ", lblNewLabel_4_1=" + lblNewLabel_4_1 + ", botaoSimples=" + botaoSimples + ", btnNewButton_1="
				+ btnNewButton_1 + ", panel=" + panel + ", textField_4=" + textField_4 + "]";
	}
}

