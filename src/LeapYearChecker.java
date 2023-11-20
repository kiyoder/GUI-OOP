import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearChecker extends JFrame {


    private JPanel LeapYearChecker;
    private JTextField yearTextField;
    private JButton validateButton;

    public LeapYearChecker() {
        validateButton.addActionListener(e-> {
                int y = Integer.parseInt(yearTextField.getText());

                if((y % 400 == 0) || (y % 100 != 0) && (y % 4 == 0)){
                JOptionPane.showMessageDialog(this,"Leap Year");
                }else JOptionPane.showMessageDialog(this,"Not A Leap Year");

        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("LeapYearChecker");
        frame.setContentPane(new LeapYearChecker().LeapYearChecker);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
