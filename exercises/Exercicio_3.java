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
        textArea.setText("Java Swing é uma biblioteca do Java usada para criar interfaces gráficas modernas e portáveis. \r\n" + //
                        "Ela fornece uma grande variedade de componentes como botões, caixas de texto, tabelas e menus. \r\n" + //
                        "Com Swing, é possível construir aplicações desktop interativas e responsivas de forma simples. \r\n" + //
                        "Um dos pontos fortes do Swing é a sua independência de plataforma, funcionando em qualquer SO. \r\n" + //
                        "Além disso, o Swing permite personalizar cores, fontes e estilos para melhorar a experiência do usuário. \r\n" + //
                        "O componente JTextArea é útil quando queremos exibir ou editar textos grandes em uma aplicação. \r\n" + //
                        "No entanto, quando o texto excede as dimensões da área visível, parte dele fica escondido. \r\n" + //
                        "Para resolver isso, usamos o JScrollPane, que adiciona barras de rolagem verticais e horizontais. \r\n" + //
                        "Assim, mesmo que o conteúdo cresça além do espaço definido, o usuário pode navegar pelo texto. \r\n" + //
                        "Portanto, o JScrollPane é essencial para garantir usabilidade em textos longos dentro do Swing. \r\n" + //
                        "");
        scrollPane.setViewportView(textArea);

        Frame.add(scrollPane);
        Frame.setLocationRelativeTo(null);
        Frame.setVisible(true);
    }
}


//JScrollPane é necessário nesse caso pq o textArea pode ficar maior soq a tela normal, e aí o usuário precisa ir de um lado pro outro ou para baixo para poder ler ou editar tudo que quiser, se não ele não vê