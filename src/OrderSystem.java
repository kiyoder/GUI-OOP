import javax.swing.*;

public class OrderSystem extends JFrame{
    private JPanel OrderSystem;
    private JCheckBox porkCheckBox;
    private JCheckBox chickenCheckBox;
    private JCheckBox beefCheckBox;
    private JCheckBox veganCheckBox;
    private JCheckBox porkburger;
    private JCheckBox chickenburger;
    private JCheckBox beefburger;
    private JCheckBox veganburger;
    private JCheckBox cokeCheckBox;
    private JCheckBox spriteCheckBox;
    private JCheckBox mountainDewCheckBox;
    private JCheckBox bottledWaterCheckBox;
    private JCheckBox riceCheckBox;
    private JCheckBox friesCheckBox;
    private JCheckBox softServeIceCreamCheckBox;
    private JCheckBox gravyCheckBox;
    private JCheckBox PWD20CheckBox;
    private JCheckBox senior20CheckBox;
    private JCheckBox employee15CheckBox;
    private JButton ORDERButton;

    public OrderSystem(){


        ORDERButton.addActionListener(e->{
            double sum = 0;
            if(porkCheckBox.isSelected()){
                sum+=100;
            }
            if(chickenCheckBox.isSelected()){
                sum+=90;
            }
            if(beefCheckBox.isSelected()){
                sum+=120;
            }
            if(veganCheckBox.isSelected()){
                sum+=130;
            }

            if(porkburger.isSelected()){
                sum+=100;
            }
            if(chickenburger.isSelected()){
                sum+=90;
            }
            if(beefburger.isSelected()){
                sum+=120;
            }
            if(veganburger.isSelected()){
                sum+=130;
            }

            if(cokeCheckBox.isSelected() || spriteCheckBox.isSelected() || mountainDewCheckBox.isSelected() || bottledWaterCheckBox.isSelected()){
                sum+=50;
            }

            if(riceCheckBox.isSelected()){
                sum+=20;
            }

            if(friesCheckBox.isSelected()){
                sum+=75;
            }
            if(softServeIceCreamCheckBox.isSelected()){
                sum+=75;
            }
            if(gravyCheckBox.isSelected()){
                sum+=25;
            }

            if(PWD20CheckBox.isSelected() || senior20CheckBox.isSelected()){
                sum*=(0.8);
            }

            if(employee15CheckBox.isSelected()){
                sum*=0.85;
            }
            JOptionPane.showMessageDialog(this,"Total: " + sum);
                });


}

    public static void main(String[] args) {
        JFrame frame = new JFrame("OrderSystem");
        frame.setContentPane(new OrderSystem().OrderSystem);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
