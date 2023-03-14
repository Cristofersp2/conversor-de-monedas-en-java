
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ConversorMoneda extends JFrame implements ActionListener {

    private JLabel label1, label2, label3;
    private JTextField textField1, textField2, textField3;
    private JButton button1, button2;

    public ConversorMoneda() {
        super("Conversor de Moneda");

        label1 = new JLabel("Dólares:");
        label2 = new JLabel("Euros:");
        label3 = new JLabel("");

        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        textField3 = new JTextField(10);
        textField3.setEditable(false);

        button1 = new JButton("Dólares a Euros");
        button2 = new JButton("Euros a Dólares");

        button1.addActionListener(this);
        button2.addActionListener(this);

        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(button1);
        panel.add(button2);
        panel.add(label3);
        panel.add(textField3);

        add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            String dollars = textField1.getText();
            if (dollars.equals("")) {
                JOptionPane.showMessageDialog(null, "Ingrese un valor en dólares");
                return;
            }
            double euros = Double.parseDouble(dollars) * 0.84;
            textField2.setText(String.format("%.2f", euros));
            textField3.setText("");
        } else if (e.getSource() == button2) {
            String euros = textField2.getText();
            if (euros.equals("")) {
                JOptionPane.showMessageDialog(null, "Ingrese un valor en euros");
                return;
            }
            double dollars = Double.parseDouble(euros) * 1.19;
            textField1.setText(String.format("%.2f", dollars));
            textField3.setText("");
        }
    }

    public static void main(String[] args) {
        new ConversorMoneda();
    }
}

