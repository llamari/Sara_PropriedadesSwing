import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;

public class Exercicio_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        try {
            JLabel label = new JLabel("Data de nascimento:");
            MaskFormatter dateFormatter = new MaskFormatter("##/##/####");
            //primeiro a gnt cria um maskFormatter, q é basicamente a formatação da máscara, tipo o esqueleto doq tem q estar escrito
            dateFormatter.setPlaceholderCharacter('_'); //aí aqui ele fala q oa o usuário ainda não tiver escrito, vai ser substituído por um _

            JFormattedTextField dateField = new JFormattedTextField(dateFormatter); //aí quando vc cria o campo pra texto formatado, vc passa a máscara pra ele
            dateField.setColumns(8);
            panel.add(label);
            panel.add(dateField);
        } catch (java.text.ParseException e) {
            JLabel error = new JLabel("Erro ao formatar data");
            panel.add(error);
        }

        frame.add(panel);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
