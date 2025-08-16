import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Exercicio_7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());

        JLabel country = new JLabel("Argentina");

        String[] countries = { "Argentina", "Brasil", "Chile" };
        JComboBox<String> comboBox = new JComboBox<>(countries);
        comboBox.addItemListener(e -> {
            String selectedCountry = (String) comboBox.getSelectedItem();
            country.setText(selectedCountry);
        });
        panel.add(comboBox, BorderLayout.NORTH);
        panel.add(country, BorderLayout.CENTER);

        frame.add(panel);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}