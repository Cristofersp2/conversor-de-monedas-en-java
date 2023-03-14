import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int option = JOptionPane.showOptionDialog(null, "Seleccione el conversor que desea usar:", "Conversores",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                new Object[] { "Conversor de Moneda", "Conversor de Temperatura" }, null);

        if (option == 0) {
            new ConversorMoneda();
        } else if (option == 1) {
            new ConversorTemperatura();
        }
    }
}
