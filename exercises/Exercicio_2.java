import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Exercicio_2 {
    public static void main(String[] args) {
        JFrame Frame = new JFrame();
        Frame.setSize(400, 300);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        JLabel label1 = new JLabel("Bem-vindo às Configurações!");
        panel1.add(label1);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.BLUE);
        JLabel nomeLabel = new JLabel("Insira seu nome: ");
        JTextField nomeTextField = new JTextField(20);
        // Carrega a imagem original
        ImageIcon userIcon = new ImageIcon("icons/perfil.png");

        // Redimensiona para 32x32 (por exemplo)
        Image img = userIcon.getImage();
        Image newImg = img.getScaledInstance(32, 32, Image.SCALE_SMOOTH);

        // Cria um novo ícone redimensionado
        ImageIcon resizedIcon = new ImageIcon(newImg);
        JLabel iconLabel = new JLabel(resizedIcon);
        nomeTextField.setSize(200, 5);
        panel2.add(iconLabel);
        panel2.add(nomeLabel);
        panel2.add(nomeTextField);

        JPanel panel3 = new JPanel();
        JLabel duvidasLabel = new JLabel("Tire suas dúvidas aqui: ");
        JTextArea duvidasTextArea = new JTextArea();
        panel3.add(duvidasLabel);
        panel3.add(duvidasTextArea);

        JTabbedPane abas = new JTabbedPane();
        abas.addTab("Configurações", panel1);
        abas.addTab("Perfil", panel2);
        abas.addTab("Ajuda", panel3);
        Frame.add(abas);
        Frame.setLocationRelativeTo(null);

        // torna visível
        Frame.setVisible(true);
    }
}
