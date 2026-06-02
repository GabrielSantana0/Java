package Desafio.ArraysDesafios.desafio2;

import javax.swing.*;
import java.awt.*;

public class AgendaPessoal extends JFrame {

    private JLabel labelNome, labelEmail, labelTelefone;
    private JTextField txtNome, txtEmail, txtTelefone;
    private JPanel painel, painelbtn;
    private JButton btnSalvar, btnLimpar, btnSair;

    public AgendaPessoal() {
        labelNome = new JLabel("Nome: ");
        txtNome = new JTextField(20);

        labelEmail = new JLabel("Email: ");
        txtEmail = new JTextField(20);

        labelTelefone = new JLabel("Telefone: ");
        txtTelefone = new JTextField(20);

        btnSalvar = new JButton("Salvar");
        btnLimpar = new JButton("Limpar");
        btnSair = new JButton("Sair");

        painel = new JPanel(new GridLayout(4 , 2));
        painelbtn = new JPanel();



        painel.add(labelNome);
        painel.add(txtNome);

        painel.add(labelEmail);
        painel.add(txtEmail);

        painel.add(labelTelefone);
        painel.add(txtTelefone);

        add(painel, BorderLayout.CENTER);


        painelbtn.add(btnSalvar);
        painelbtn.add(btnLimpar);
        painelbtn.add(btnSair);
        add(painelbtn, BorderLayout.SOUTH);


        setTitle("AgendaPessoal");
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
   public static void main(String[] args) {
        new AgendaPessoal();
    }
}