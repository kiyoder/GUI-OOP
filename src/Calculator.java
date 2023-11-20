import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JPanel Calculator;
    private JTextField textField1;
    private JComboBox opCB;
    private JTextField textField2;
    private JButton calcButton;
    private JTextField resultTextField;

    public Calculator(){

        calcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            double num1 = Double.parseDouble(textField1.getText());
            double num2 = Double.parseDouble(textField2.getText());
            double res;

            if(opCB.getSelectedIndex() == 0){
                res = num1 + num2;
                resultTextField.setText(String.valueOf(res));
            }

                if(opCB.getSelectedIndex() == 1){
                    res = num1 - num2;
                    resultTextField.setText(String.valueOf(res));
                }

                if(opCB.getSelectedIndex() == 2){
                    res = num1 * num2;
                    resultTextField.setText(String.valueOf(res));
                }

                if(opCB.getSelectedIndex() == 3){
                    res = num1 / num2;
                    resultTextField.setText(String.valueOf(res));
                }

                if(opCB.getSelectedIndex() == 4){
                    res = num1 % num2;
                    resultTextField.setText(String.valueOf(res));
                }




            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}


