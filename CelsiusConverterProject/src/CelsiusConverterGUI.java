import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusConverterGUI {
    private JPanel CelsiusConverter;
    private JTextField textField1;
    private JButton button1;
    private JLabel Fah;

    public CelsiusConverterGUI() {
        button1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                int temp = (int)((Double.parseDouble(textField1.getText())) * 1.8 + 32);
                String message = temp + " Fahrenheit";
                Fah.setText(message);
                //JOptionPane.showMessageDialog(null,message);
            }
        }
        );
    }

    public static void main(String[] args) {
        JFrame myMessageFrame = new JFrame("Celsius Conversion Result");
        myMessageFrame.setContentPane(new CelsiusConverterGUI().CelsiusConverter);
        myMessageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myMessageFrame.pack();
        myMessageFrame.setVisible(true);
    }
}

