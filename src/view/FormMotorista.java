package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;

public class FormMotorista extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private JPanel contentPane;
    private JLabel lblNmeroDaCnh;
    private JLabel lblValidade;
    private JLabel lblNewLabel;
    private JLabel lblMotorista;
    private JLabel lblCaminhao;
    private JLabel lblPlaca;
    private JLabel lblEstadoDoLicenciamento;

    //TextFields
    private JTextField textField_NomeMotorista;
    private JTextField textField_CNH;
    private JTextField textField_ValidadeCNH;
    private JTextField textField_Telefone1;
    private JTextField textField_telefone2;
    private JTextField textField_Placa;
    private JTextField textField_tipoVeiculo;
    private JTextField textField_Carga;
    private JTextField textField_Carroceria;
    private JTextField textField_altura;
    private JTextField textField_comprimento;
    private JTextField textField_volume;
    private JTextField textField_largura;
    private JTextField textField_estado;
    private JTextField textField_cidade;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FormMotorista frame = new FormMotorista();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public FormMotorista() {
        setTitle("Cadastro de Motoristas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 735, 444);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        textField_NomeMotorista = new JTextField();
        textField_NomeMotorista.setBounds(10, 54, 268, 20);
        contentPane.add(textField_NomeMotorista);
        textField_NomeMotorista.setColumns(10);

        textField_CNH = new JTextField();
        textField_CNH.setBounds(10, 102, 143, 20);
        contentPane.add(textField_CNH);
        textField_CNH.setColumns(10);

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(10, 39, 46, 14);
        contentPane.add(lblNome);

        lblNmeroDaCnh = new JLabel("N\u00FAmero da CNH");
        lblNmeroDaCnh.setBounds(10, 85, 128, 14);
        contentPane.add(lblNmeroDaCnh);

        textField_ValidadeCNH = new JTextField();
        textField_ValidadeCNH.setBounds(181, 102, 97, 20);
        contentPane.add(textField_ValidadeCNH);
        textField_ValidadeCNH.setColumns(10);

        lblValidade = new JLabel("Validade:");
        lblValidade.setBounds(181, 85, 56, 14);
        contentPane.add(lblValidade);

        textField_Telefone1 = new JTextField();
        textField_Telefone1.setBounds(10, 159, 128, 20);
        contentPane.add(textField_Telefone1);
        textField_Telefone1.setColumns(10);

        textField_telefone2 = new JTextField();
        textField_telefone2.setBounds(148, 159, 130, 20);
        contentPane.add(textField_telefone2);
        textField_telefone2.setColumns(10);

        lblNewLabel = new JLabel("Telefones para Contato:");
        lblNewLabel.setBounds(10, 133, 195, 14);
        contentPane.add(lblNewLabel);

        lblMotorista = new JLabel("Motorista");
        lblMotorista.setHorizontalAlignment(SwingConstants.CENTER);
        lblMotorista.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lblMotorista.setBounds(10, 11, 254, 20);
        contentPane.add(lblMotorista);

        lblCaminhao = new JLabel("Ve\u00EDculo");
        lblCaminhao.setHorizontalAlignment(SwingConstants.CENTER);
        lblCaminhao.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lblCaminhao.setBounds(360, 15, 310, 20);
        contentPane.add(lblCaminhao);

        textField_Placa = new JTextField();
        textField_Placa.setBounds(370, 54, 115, 20);
        contentPane.add(textField_Placa);
        textField_Placa.setColumns(10);

        lblPlaca = new JLabel("Placa:");
        lblPlaca.setBounds(370, 39, 46, 14);
        contentPane.add(lblPlaca);

        textField_tipoVeiculo = new JTextField();
        textField_tipoVeiculo.setEditable(false);
        textField_tipoVeiculo.setBounds(370, 102, 274, 20);
        contentPane.add(textField_tipoVeiculo);
        textField_tipoVeiculo.setColumns(10);

        JComboBox comboBox_tipoVeiculo = new JComboBox();
        comboBox_tipoVeiculo.setBounds(642, 102, 28, 20);
        contentPane.add(comboBox_tipoVeiculo);

        JLabel lblTipoDoVeculo = new JLabel("Tipo do Ve\u00EDculo:");
        lblTipoDoVeculo.setBounds(370, 85, 97, 14);
        contentPane.add(lblTipoDoVeculo);

        textField_Carga = new JTextField();
        textField_Carga.setEditable(false);
        textField_Carga.setBounds(370, 148, 103, 20);
        contentPane.add(textField_Carga);
        textField_Carga.setColumns(10);

        JLabel lblCarga = new JLabel("Capacidade de Carga:");
        lblCarga.setBounds(370, 133, 128, 14);
        contentPane.add(lblCarga);

        JLabel lblKg = new JLabel("Kg");
        lblKg.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblKg.setBounds(477, 151, 20, 14);
        contentPane.add(lblKg);

        JLabel lblCarroceria = new JLabel("Carroceria:");
        lblCarroceria.setBounds(370, 179, 143, 14);
        contentPane.add(lblCarroceria);

        textField_Carroceria = new JTextField();
        textField_Carroceria.setEditable(false);
        textField_Carroceria.setBounds(369, 193, 275, 20);
        contentPane.add(textField_Carroceria);
        textField_Carroceria.setColumns(10);

        JComboBox comboBox_carroceria = new JComboBox();
        comboBox_carroceria.setBounds(642, 193, 28, 20);
        contentPane.add(comboBox_carroceria);

        textField_altura = new JTextField();
        textField_altura.setEditable(false);
        textField_altura.setBounds(370, 242, 86, 20);
        contentPane.add(textField_altura);
        textField_altura.setColumns(10);

        textField_comprimento = new JTextField();
        textField_comprimento.setEditable(false);
        textField_comprimento.setColumns(10);
        textField_comprimento.setBounds(528, 242, 86, 20);
        contentPane.add(textField_comprimento);

        textField_volume = new JTextField();
        textField_volume.setEditable(false);
        textField_volume.setColumns(10);
        textField_volume.setBounds(528, 291, 86, 20);
        contentPane.add(textField_volume);

        textField_largura = new JTextField();
        textField_largura.setEditable(false);
        textField_largura.setColumns(10);
        textField_largura.setBounds(370, 291, 86, 20);
        contentPane.add(textField_largura);

        JLabel lblNewLabel_1 = new JLabel("Altura");
        lblNewLabel_1.setBounds(370, 224, 46, 14);
        contentPane.add(lblNewLabel_1);

        JLabel lblComprimento = new JLabel("Comprimento");
        lblComprimento.setBounds(528, 224, 86, 14);
        contentPane.add(lblComprimento);

        JLabel lblNewLabel_2 = new JLabel("Largura");
        lblNewLabel_2.setBounds(372, 273, 46, 14);
        contentPane.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("Volume");
        lblNewLabel_3.setBounds(528, 273, 46, 14);
        contentPane.add(lblNewLabel_3);

        JLabel lblMetros = new JLabel("Metros");
        lblMetros.setBounds(467, 245, 46, 14);
        contentPane.add(lblMetros);

        JLabel label = new JLabel("Metros");
        label.setBounds(624, 245, 46, 14);
        contentPane.add(label);

        JLabel label_1 = new JLabel("Metros");
        label_1.setBounds(466, 294, 46, 14);
        contentPane.add(label_1);

        JLabel lblM = new JLabel("M\u00B3");
        lblM.setBounds(624, 294, 46, 14);
        contentPane.add(lblM);

        textField_estado = new JTextField();
        textField_estado.setBounds(370, 346, 86, 20);
        contentPane.add(textField_estado);
        textField_estado.setColumns(10);

        lblEstadoDoLicenciamento = new JLabel("Estado de Registro");
        lblEstadoDoLicenciamento.setBounds(370, 322, 165, 14);
        contentPane.add(lblEstadoDoLicenciamento);

        JButton btnSalvar = new JButton("SALVAR");
        btnSalvar.setForeground(Color.RED);
        btnSalvar.setBounds(49, 269, 89, 23);
        contentPane.add(btnSalvar);

        JButton btnLimpar = new JButton("LIMPAR");
        btnLimpar.setForeground(Color.RED);
        btnLimpar.setBounds(175, 269, 89, 23);
        contentPane.add(btnLimpar);

        JButton btnSair = new JButton("SAIR");
        btnSair.setForeground(Color.RED);
        btnSair.setBounds(113, 345, 89, 23);
        contentPane.add(btnSair);

        JComboBox comboBox_estado = new JComboBox();
        comboBox_estado.setBounds(454, 346, 28, 20);
        contentPane.add(comboBox_estado);

        textField_cidade = new JTextField();
        textField_cidade.setBounds(528, 346, 142, 20);
        contentPane.add(textField_cidade);
        textField_cidade.setColumns(10);

        JLabel lblCidadeDoLicenciamento = new JLabel("Cidade de Registro:");
        lblCidadeDoLicenciamento.setBounds(528, 322, 142, 14);
        contentPane.add(lblCidadeDoLicenciamento);
    }
}
