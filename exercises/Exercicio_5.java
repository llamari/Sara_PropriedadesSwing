import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Exercicio_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JRadioButton fem = new JRadioButton("Feminino");
        JRadioButton masc = new JRadioButton("Masculino");
        JRadioButton other = new JRadioButton("Outro");

        ButtonGroup group = new ButtonGroup();
        group.add(fem);
        group.add(masc);
        group.add(other);

        panel.add(fem);
        panel.add(masc);
        panel.add(other);

        JButton showGender = new JButton("Mostrar selecionado");
        showGender.addActionListener(e -> {
            if (fem.isSelected()) {
                JOptionPane.showMessageDialog(frame, "Gênero feminino");
            } else if (masc.isSelected()) {
                JOptionPane.showMessageDialog(frame, "Gênero masculino");
            } else if (other.isSelected()) {
                JOptionPane.showMessageDialog(frame, "Outro gênero");
            } else {
                JOptionPane.showMessageDialog(frame, "Nenhuma opção selecionada!");
            }
        });
        panel.add(showGender);

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
