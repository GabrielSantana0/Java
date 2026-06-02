package Desafio.ArraysDesafios.desafio2;
import javax.swing.*;
import java.awt.*;

public class Screen extends JFrame {
    private JButton btutton;
    private JTextField txtnome;
    private JLabel lblnome;

    public Screen() {
        super("Primeira tela");
        btutton = new JButton("OK");
        txtnome = new JTextField(20);
        lblnome = new JLabel("Nome: ");

        JPanel painel = new JPanel();

        painel.add(lblnome);
        painel.add(txtnome);
        painel.add(btutton);

        add(painel);

        setTitle("Tela de Nome");
        setSize(350, 120);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main() {
        new Screen();
    }
}
