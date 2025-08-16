import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class Exercicio_6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JLabel left = new JLabel("Esquerda");
        JLabel right = new JLabel("Direita");
        panel1.add(left);
        panel2.add(right);

        panel1.setBackground(Color.RED);
        panel2.setBackground(Color.BLUE);

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panel1, panel2);

        frame.add(splitPane);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        //precisa colocar ele dps de frame.setVisible(true) pq só aí ele vai saber a largura da tela
        //oq ele faz é colocar a divisória a 40% da largura total partindo da esquerda. se eu colocar um número inteiro ele coloca a essa quantidade de pixels
        splitPane.setDividerLocation(0.4);
    }
}
