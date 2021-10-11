import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * Created by JFormDesigner on Sat Oct 09 22:24:45 EDT 2021
 */



/**
 * @author unknown
 */
public class CreatePanel extends JPanel {
    CarHistory history;


    public CreatePanel(CarHistory history) {

        initComponents();
        this.history=history;

    }

    private void button1MouseClicked(MouseEvent e) {

        String brand=textField1.getText();
        int year=Integer.parseInt(textField2.getText());
        int seats=Integer.parseInt(textField3.getText());
        long serialNumber=Long.parseLong(textField4.getText());
        long modelNumber =Long.parseLong(textField5.getText());
        String certificace = textField6.getText();
        boolean available=Boolean.parseBoolean(textField7.getText());
        String city=textField8.getText();
        String manufacturers=textField9.getText();

        String check_1="(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))-02-29)";
        Pattern re_1=Pattern.compile(check_1);
        String birth=textField6.getText();
        Matcher matcher=re_1.matcher(birth);
        boolean isMatch= matcher.matches();
        if (!isMatch){
            JOptionPane.showMessageDialog(this,"wrong layout of certificace");
            textField1.setText("");
            textField2.setText("");
            textField3.setText("");
            textField4.setText("");
            textField5.setText("");
            textField6.setText("");
            textField7.setText("");
            textField8.setText("");
            textField9.setText("");
            return;
        }

        String check_year="^([0-9]{4})$";
        Pattern re_year=Pattern.compile(check_year);
        String year_1=textField2.getText();
        Matcher matcher_1=re_year.matcher(year_1);
        boolean isMatch_1= matcher.matches();
        long r = 0;
        if (!isMatch_1||year>2021){
            JOptionPane.showMessageDialog(this,"wrong layout of year");
            textField1.setText("");
            textField2.setText("");
            textField3.setText("");
            textField4.setText("");
            textField5.setText("");
            textField6.setText("");
            textField7.setText("");
            textField8.setText("");
            textField9.setText("");
            return;
        }


        Car newCar= history.addNewCar();
        newCar.setBrand(brand);
        newCar.setCertificace(certificace);
        newCar.setSeats(seats);
        newCar.setModelNumber(modelNumber);
        newCar.setSerialNumber(serialNumber);
        newCar.setYear(year);
        newCar.setAvailable(available);
        newCar.setCity(city);
        newCar.setMaufacturers(manufacturers);
        JOptionPane.showMessageDialog(null,"New Car added.");
        textField1.setText("");
        textField2.setText("");
        textField3.setText("");
        textField4.setText("");
        textField5.setText("");
        textField6.setText("");
        textField7.setText("");
        textField8.setText("");
        textField9.setText("");
        history.setTime();

    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        label2 = new JLabel();
        label3 = new JLabel();
        textField1 = new JTextField();
        label4 = new JLabel();
        textField2 = new JTextField();
        label5 = new JLabel();
        textField3 = new JTextField();
        label6 = new JLabel();
        textField4 = new JTextField();
        label7 = new JLabel();
        textField5 = new JTextField();
        label8 = new JLabel();
        textField6 = new JTextField();
        label1 = new JLabel();
        textField7 = new JTextField();
        label9 = new JLabel();
        textField8 = new JTextField();
        label10 = new JLabel();
        textField9 = new JTextField();
        button1 = new JButton();

        //======== this ========
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.
        EmptyBorder(0,0,0,0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn",javax.swing.border.TitledBorder.CENTER,javax.swing
        .border.TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,12),
        java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener()
        {@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("\u0062ord\u0065r".equals(e.getPropertyName()))
        throw new RuntimeException();}});
        setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //---- label2 ----
        label2.setText("create car information");
        add(label2, "cell 1 0");

        //---- label3 ----
        label3.setText("brand");
        add(label3, "cell 0 1");
        add(textField1, "cell 1 1");

        //---- label4 ----
        label4.setText("year");
        add(label4, "cell 0 2");
        add(textField2, "cell 1 2");

        //---- label5 ----
        label5.setText("seat");
        add(label5, "cell 0 3");
        add(textField3, "cell 1 3");

        //---- label6 ----
        label6.setText("serial number");
        add(label6, "cell 0 4");
        add(textField4, "cell 1 4");

        //---- label7 ----
        label7.setText("model number");
        add(label7, "cell 0 5");
        add(textField5, "cell 1 5");

        //---- label8 ----
        label8.setText("certificaced(yy-mm-dd)");
        add(label8, "cell 0 6");
        add(textField6, "cell 1 6");

        //---- label1 ----
        label1.setText("available(true/false)");
        add(label1, "cell 0 7");
        add(textField7, "cell 1 7");

        //---- label9 ----
        label9.setText("city");
        add(label9, "cell 0 8");
        add(textField8, "cell 1 8");

        //---- label10 ----
        label10.setText("manifacturers");
        add(label10, "cell 0 9");
        add(textField9, "cell 1 9");

        //---- button1 ----
        button1.setText("save");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        add(button1, "cell 1 10");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JLabel label2;
    private JLabel label3;
    private JTextField textField1;
    private JLabel label4;
    private JTextField textField2;
    private JLabel label5;
    private JTextField textField3;
    private JLabel label6;
    private JTextField textField4;
    private JLabel label7;
    private JTextField textField5;
    private JLabel label8;
    private JTextField textField6;
    private JLabel label1;
    private JTextField textField7;
    private JLabel label9;
    private JTextField textField8;
    private JLabel label10;
    private JTextField textField9;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

}

