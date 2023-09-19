import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CompararNumerosApp extends JFrame implements ActionListener {
    private JLabel valorALabel, valorBLabel, resultadoLabel;
    private JTextField valorAField, valorBField;
    private JButton compararButton;

    public CompararNumerosApp() {
        // Configurar la ventana
        setTitle("Comparador de Números");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Componentes de la interfaz
        valorALabel = new JLabel("Valor A:");
        valorAField = new JTextField(10);
        valorBLabel = new JLabel("Valor B:");
        valorBField = new JTextField(10);
        compararButton = new JButton("Comparar");
        resultadoLabel = new JLabel();

        // Agregar componentes a la ventana
        add(valorALabel);
        add(valorAField);
        add(valorBLabel);
        add(valorBField);
        add(compararButton);
        add(resultadoLabel);

        // Manejar el evento del botón Comparar
        compararButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            // Obtener los valores A y B ingresados por el usuario
            double valorA = Double.parseDouble(valorAField.getText());
            double valorB = Double.parseDouble(valorBField.getText());

            // Comparar A y B y mostrar el mensaje correspondiente
            if (valorA > valorB) {
                resultadoLabel.setText("A es mayor que B.");
            } else if (valorA < valorB) {
                resultadoLabel.setText("A es menor que B.");
            } else {
                resultadoLabel.setText("A es igual a B.");
            }
        } catch (NumberFormatException ex) {
            resultadoLabel.setText("Error: Ingresa valores numéricos válidos.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CompararNumerosApp app = new CompararNumerosApp();
            app.setVisible(true);
        });
    }
}
