import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ConversorTemperatura implements ActionListener {
    private final JTextField textField1;
    private final JTextField textField2;
    private final JTextField textField3;
    private final JButton button1;
    private final JButton button2;

    public ConversorTemperatura() {
        JFrame frame = new JFrame("Conversor de Temperatura");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel label1 = new JLabel("Fahrenheit:");
        panel.add(label1);
        textField1 = new JTextField(10);
        panel.add(textField1);

        JLabel label2 = new JLabel("Celsius:");
        panel.add(label2);
        textField2 = new JTextField(10);
        panel.add(textField2);

        button1 = new JButton("Convertir a Celsius");
        panel.add(button1);
        button1.addActionListener(this);

        button2 = new JButton("Convertir a Fahrenheit");
        panel.add(button2);
        button2.addActionListener(this);

        JLabel label3 = new JLabel("");
        panel.add(label3);
        textField3 = new JTextField(10);
        textField3.setEditable(false);
        panel.add(textField3);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(300, 150);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            String fahrenheit = textField1.getText();
            if (fahrenheit.equals("")) {
                JOptionPane.showMessageDialog(null, "Ingrese un valor en grados Fahrenheit");
                return;
            }
            double celsius = (Double.parseDouble(fahrenheit) - 32) * 5/9;
            textField2.setText(String.format("%.2f", celsius));
            textField3.setText("");
        } else if (e.getSource() == button2) {
            String celsius = textField2.getText();
            if (celsius.equals("")) {
                JOptionPane.showMessageDialog(null, "Ingrese un valor en grados Celsius");
                return;
            }
            double fahrenheit = Double.parseDouble(celsius) * 9/5 + 32;
            textField1.setText(String.format("%.2f", fahrenheit));
            textField3.setText("");
        }
    }

    public static void main(String[] args) {
        new ConversorTemperatura();
    }
}
