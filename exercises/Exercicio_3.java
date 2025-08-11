import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Exercicio_3 {
    public static void main(String[] args) {
        JFrame Frame = new JFrame();
        
        //configuração do JFrame
        Frame.setSize(400, 300);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JScrollPane scrollPane = new JScrollPane();
        JTextArea textArea = new JTextArea(10, 30);
        textArea.setBackground(Color.LIGHT_GRAY);
        Font fonte = new Font("Arial", 0, 12);
        textArea.setFont(fonte);
        scrollPane.setViewportView(textArea);

        Frame.add(scrollPane);
        Frame.setLocationRelativeTo(null);
        Frame.setVisible(true);
    }
}
