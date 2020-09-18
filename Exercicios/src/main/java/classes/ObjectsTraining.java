package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author guilherme
 */
public class ObjectsTraining extends JFrame {

    private JLabel lblLogin, lblUsername, lblPassword;
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin, btnCadastrar, btnSair;

    public ObjectsTraining() {

        //Setar o título do frame
        setTitle("Treinando componentes Swing");
        
        
        //Ajuste do Background
        this.getContentPane().setBackground(Color.GRAY);
        
        
        //Ajuste das bordas do frame
        setUndecorated(true);
        
        //Aparecer a janela no meio da tela
        setLocationRelativeTo(null);
        
        //Ajuste do tamanho e layout
        setPreferredSize(new Dimension(400, 500));
        setLayout(null); // Definição do Layout absoluto

        Criar(); //Instancia componentes
        Adicionar(); //Adiciona os componentes ao form
        Configurar(); //Configura as posições dos componentes

        pack(); //Reorganiza

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void Criar() {
        lblLogin = new JLabel("LOGIN");
        lblUsername = new JLabel("USERNAME");
        lblPassword = new JLabel("PASSWORD");
        txtUsername = new JTextField(15);
        txtPassword = new JPasswordField(30);
        btnLogin = new JButton("LOGIN");
        btnCadastrar = new JButton("CADASTRO");
        btnSair = new JButton("SAIR");
        
        btnSair.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent arg0) { System.exit(0); } }); 
    }

    public void Adicionar() {
        add(lblLogin);
        add(lblUsername);
        add(lblPassword);
        add(txtUsername);
        add(txtPassword);
        add(btnLogin);
        add(btnCadastrar);
        add(btnSair);
    }
    
    public void Configurar(){
        //Configura a posicao dos objetos no frame
        // Setbounds( posicao x, posicao y, largura, altura )
        lblLogin.setBounds(150, 15, 225, 20);
        lblUsername.setBounds(35, 55, 200, 25);
        txtUsername.setBounds(35, 90, 200, 25);
        lblPassword.setBounds(35, 135, 200, 25);
        txtPassword.setBounds(35, 170, 200, 25);
        btnLogin.setBounds(30, 220, 100, 35);
        btnCadastrar.setBounds(140, 220, 150, 35);
        btnSair.setBounds(305, 220, 80, 35);
        
                
    }
    
    public static void main(String[] args) {
        ObjectsTraining obj = new ObjectsTraining();
    }
}
