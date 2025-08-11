import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Exercicio_1 {
    public static void main(String[] args) {
        JFrame Frame = new JFrame(); //cria o frame

        //configuração do JFrame
        Frame.setSize(400, 300);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel Panel = new JPanel(); //cria o Panel

        //estilização do Panel
        Panel.setSize(400, 300);
        Panel.setBackground(Color.GREEN);

        Border border = BorderFactory.createTitledBorder("Painel de Controle"); //criação da border
        Panel.setBorder(border); //adiciona a border ao panel

        JButton button = new JButton(); //cria o botão
        //estilização do botão
        button.setBackground(Color.YELLOW);
        button.setText("Clique aqui!");

        //coloca os itens um dentro do outro
        Panel.add(button);
        Frame.add(Panel);
        Frame.setLocationRelativeTo(null);

        //torna visível
        Frame.setVisible(true);
    }
}
