import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import net.miginfocom.swing.*;
import java.util.Date;
import java.text.SimpleDateFormat;
/*
 * Created by JFormDesigner on Sun Oct 10 14:37:47 EDT 2021
 */



/**
 * @author unknown
 */
public class SearchForm extends JPanel {
    CarHistory history;
    public SearchForm(CarHistory history) {
        initComponents();
        this.history=history;
        table1.getTableHeader().setBackground(new Color(255, 255, 255, 0));

    }


    private void button1MousePressed(MouseEvent e) {
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        model.setRowCount(0);
        for(Car vs:history.getHistory()){
            if(vs.isAvailable()){
                Object[] row = new Object[9];
                row[0] = vs.getBrand();
                row[1] = vs.getYear();
                row[2] = vs.getSerialNumber();
                row[3] = vs.getSeats();
                row[4] = vs.getCertificace();
                row[5] = vs.getModelNumber();
                row[6] = vs.isAvailable();
                row[7] = vs.getCity();
                row[8] = vs.getMaufacturers();
                model.addRow(row);

                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
                textField5.setText("");
                textField6.setText("");
                textField1.setText("");
                textField7.setText("");

                return;
            }
            JOptionPane.showMessageDialog(this,"no car available");
            textField2.setText("");
            textField3.setText("");
            textField4.setText("");
            textField5.setText("");
            textField6.setText("");
            textField1.setText("");
            textField7.setText("");

        }


    }

    private void button2MousePressed(MouseEvent e) {
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        model.setRowCount(0);
        int count=0;
        for(Car vs:history.getHistory()){
            if(vs.isAvailable()){
               count++;
            }
            textField2.setText(String.valueOf(count));
            textField3.setText("");
            textField4.setText("");
            textField5.setText("");
            textField6.setText("");
            textField1.setText("");
            textField7.setText("");

        }
    }

    private void button3MousePressed(MouseEvent e) {
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        model.setRowCount(0);
        if(textField3.getText().equals("")){
            JOptionPane.showMessageDialog(this,"wrong input");
            return;
        }
        for(Car vs:history.getHistory()){
            if(vs.getMaufacturers().equals(textField3.getText()))
            {
                Object[] row = new Object[9];
                row[0] = vs.getBrand();
                row[1] = vs.getYear();
                row[2] = vs.getSerialNumber();
                row[3] = vs.getSeats();
                row[4] = vs.getCertificace();
                row[5] = vs.getModelNumber();
                row[6] = vs.isAvailable();
                row[7] = vs.getCity();
                row[8] = vs.getMaufacturers();
                model.addRow(row);

            }

        }
        textField2.setText("");
        textField3.setText("");
        textField4.setText("");
        textField5.setText("");
        textField6.setText("");
        textField1.setText("");
        textField7.setText("");

    }

    private void button5MousePressed(MouseEvent e) {
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        model.setRowCount(0);
        int count=0;
        for(Car vs:history.getHistory()){
            if(vs.isAvailable()){
                Object[] row = new Object[9];
                row[0] = vs.getBrand();
                row[1] = vs.getYear();
                row[2] = vs.getSerialNumber();
                row[3] = vs.getSeats();
                row[4] = vs.getCertificace();
                row[5] = vs.getModelNumber();
                row[6] = vs.isAvailable();
                row[7] = vs.getCity();
                row[8] = vs.getMaufacturers();
                model.addRow(row);

                count++;
            }


        }
        if (count==0){
            JOptionPane.showMessageDialog(this,"no car available");
        }
        textField2.setText("");
        textField3.setText("");
        textField4.setText("");
        textField5.setText("");
        textField6.setText("");
        textField1.setText("");
        textField7.setText("");
        // TODO add your code here
    }

    private void button4MousePressed(MouseEvent e) {
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        model.setRowCount(0);
        int count=0;
        for(Car vs:history.getHistory()){
            String year = vs.getCertificace().substring(0,4);
            String month = vs.getCertificace().substring(5,7);
            String day = vs.getCertificace().substring(8,10);
            if (Integer.parseInt(year)<=2021&Integer.parseInt(month)<=10&Integer.parseInt(day)<=10){
                Object[] row = new Object[9];
                row[0] = vs.getBrand();
                row[1] = vs.getYear();
                row[2] = vs.getSerialNumber();
                row[3] = vs.getSeats();
                row[4] = vs.getCertificace();
                row[5] = vs.getModelNumber();
                row[6] = vs.isAvailable();
                row[7] = vs.getCity();
                row[8] = vs.getMaufacturers();
                model.addRow(row);

                count++;

            }


        }
        if (count==0){
            JOptionPane.showMessageDialog(this,"no car have  have expired maintenance certificate");
        }
        // TODO add your code here
    }

    private void button6MousePressed(MouseEvent e) {
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        model.setRowCount(0);
        if(textField4.getText()==""){
            textField2.setText("");
            textField3.setText("");
            textField4.setText("");
            textField5.setText("");
            textField6.setText("");
            textField1.setText("");
            textField7.setText("");
            JOptionPane.showMessageDialog(this,"wrong input");
            return;
        }
        int count=0;
        for(Car vs:history.getHistory()){
            if (vs.getCity().equals(textField4.getText())){
                Object[] row = new Object[9];
                row[0] = vs.getBrand();
                row[1] = vs.getYear();
                row[2] = vs.getSerialNumber();
                row[3] = vs.getSeats();
                row[4] = vs.getCertificace();
                row[5] = vs.getModelNumber();
                row[6] = vs.isAvailable();
                row[7] = vs.getCity();
                row[8] = vs.getMaufacturers();
                model.addRow(row);

                count++;

            }


        }
        if (count==0){
            JOptionPane.showMessageDialog(this,"this city have no car");
        }
        textField2.setText("");
        textField3.setText("");
        textField4.setText("");
        textField5.setText("");
        textField6.setText("");
        textField1.setText("");
        textField7.setText("");
        // TODO add your code here
    }

    private void button7MousePressed(MouseEvent e) {
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        model.setRowCount(0);
        if (textField1.getText().equals("") && textField7.getText().equals("")) {
            textField2.setText("");
            textField3.setText("");
            textField4.setText("");
            textField5.setText("");
            textField6.setText("");
            textField1.setText("");
            textField7.setText("");
            JOptionPane.showMessageDialog(this, "wrong input");
            return;
        }
        int count=0;
        int small = Integer.parseInt(textField1.getText());
        int large = Integer.parseInt(textField7.getText());
        for (Car vs : history.getHistory()) {
            if (small < vs.getSeats() & vs.getSeats() < large) {
                Object[] row = new Object[9];
                row[0] = vs.getBrand();
                row[1] = vs.getYear();
                row[2] = vs.getSerialNumber();
                row[3] = vs.getSeats();
                row[4] = vs.getCertificace();
                row[5] = vs.getModelNumber();
                row[6] = vs.isAvailable();
                row[7] = vs.getCity();
                row[8] = vs.getMaufacturers();
                model.addRow(row);
                count++;
            }
        }
        if(count==0){
            JOptionPane.showMessageDialog(this,"there have no car meet the criteria");
        }
        textField2.setText("");
        textField3.setText("");
        textField4.setText("");
        textField5.setText("");
        textField6.setText("");
        textField1.setText("");
        textField7.setText("");
    }

    private void button8MousePressed(MouseEvent e) {
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        model.setRowCount(0);
        if (textField6.getText().equals("")) {
            textField2.setText("");
            textField3.setText("");
            textField4.setText("");
            textField5.setText("");
            textField6.setText("");
            textField1.setText("");
            textField7.setText("");
            JOptionPane.showMessageDialog(this, "wrong input");
            return;
        }
        int count=0;
        int large = Integer.parseInt(textField6.getText());
        for (Car vs : history.getHistory()) {
            if (vs.getYear() == large) {
                Object[] row = new Object[9];
                row[0] = vs.getBrand();
                row[1] = vs.getYear();
                row[2] = vs.getSerialNumber();
                row[3] = vs.getSeats();
                row[4] = vs.getCertificace();
                row[5] = vs.getModelNumber();
                row[6] = vs.isAvailable();
                row[7] = vs.getCity();
                row[8] = vs.getMaufacturers();
                model.addRow(row);
                count++;
            }
        }
        if(count==0){
            JOptionPane.showMessageDialog(this,"there have no car meet the criteria");
        }
        textField2.setText("");
        textField3.setText("");
        textField4.setText("");
        textField5.setText("");
        textField6.setText("");
        textField1.setText("");
        textField7.setText("");
        // TODO add your code here
    }

    private void button9MousePressed(MouseEvent e) {
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        model.setRowCount(0);
        if (textField5.getText().equals("")) {
            textField2.setText("");
            textField3.setText("");
            textField4.setText("");
            textField5.setText("");
            textField6.setText("");
            textField1.setText("");
            textField7.setText("");
            JOptionPane.showMessageDialog(this, "wrong input");
            return;
        }
        int count=0;
        long large = Long.getLong(textField5.getText());
        for (Car vs : history.getHistory()) {
            if (vs.getSerialNumber() == large) {
                Object[] row = new Object[9];
                row[0] = vs.getBrand();
                row[1] = vs.getYear();
                row[2] = vs.getSerialNumber();
                row[3] = vs.getSeats();
                row[4] = vs.getCertificace();
                row[5] = vs.getModelNumber();
                row[6] = vs.isAvailable();
                row[7] = vs.getCity();
                row[8] = vs.getMaufacturers();
                model.addRow(row);
                count++;
            }
        }
        if(count==0){
            JOptionPane.showMessageDialog(this,"there have no car meet the criteria");
        }
        textField2.setText("");
        textField3.setText("");
        textField4.setText("");
        textField5.setText("");
        textField6.setText("");
        textField1.setText("");
        textField7.setText("");
        // TODO add your code here
    }




    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        label4 = new JLabel();
        label13 = new JLabel();
        label1 = new JLabel();
        button1 = new JButton();
        scrollPane2 = new JScrollPane();
        table1 = new JTable();
        label2 = new JLabel();
        button2 = new JButton();
        label12 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        textField3 = new JTextField();
        button3 = new JButton();
        label5 = new JLabel();
        button4 = new JButton();
        label6 = new JLabel();
        button5 = new JButton();
        label7 = new JLabel();
        textField4 = new JTextField();
        button6 = new JButton();
        label11 = new JLabel();
        label14 = new JLabel();
        label8 = new JLabel();
        textField1 = new JTextField();
        textField7 = new JTextField();
        button7 = new JButton();
        label9 = new JLabel();
        textField6 = new JTextField();
        button8 = new JButton();
        label10 = new JLabel();
        textField5 = new JTextField();
        button9 = new JButton();

        //======== this ========
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0
        ,0,0,0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion",javax.swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM
        ,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,12),java.awt.Color.red),
         getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e
        ){if("bord\u0065r".equals(e.getPropertyName()))throw new RuntimeException();}});
        setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[114,fill]" +
            "[fill]" +
            "[821,fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
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
            "[]" +
            "[]" +
            "[]"));

        //---- label4 ----
        label4.setText("search by");
        add(label4, "cell 0 0 5 1,alignx center,growx 0");

        //---- label13 ----
        label13.setText("search result");
        add(label13, "cell 5 0,alignx center,growx 0");

        //---- label1 ----
        label1.setText("first available car");
        add(label1, "cell 0 1");

        //---- button1 ----
        button1.setText("search");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button1MousePressed(e);
            }
        });
        add(button1, "cell 1 1");

        //======== scrollPane2 ========
        {

            //---- table1 ----
            table1.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null, null, null, null, null, null, null},
                },
                new String[] {
                    "brand", "year", "serial number", "seats", "cerificace", "model number", "available", "city", "manifacturer"
                }
            ));
            scrollPane2.setViewportView(table1);
        }
        add(scrollPane2, "cell 5 1 1 12");

        //---- label2 ----
        label2.setText("number of available cars");
        add(label2, "cell 0 2");

        //---- button2 ----
        button2.setText("search");
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button2MousePressed(e);
            }
        });
        add(button2, "cell 1 2");

        //---- label12 ----
        label12.setText("result");
        add(label12, "cell 2 2");
        add(textField2, "cell 3 2");

        //---- label3 ----
        label3.setText("car manufacturers");
        add(label3, "cell 0 3");
        add(textField3, "cell 1 3");

        //---- button3 ----
        button3.setText("search");
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button3MousePressed(e);
            }
        });
        add(button3, "cell 2 3");

        //---- label5 ----
        label5.setText("expired maintenance certificate");
        add(label5, "cell 0 4");

        //---- button4 ----
        button4.setText("search");
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button4MousePressed(e);
            }
        });
        add(button4, "cell 1 4");

        //---- label6 ----
        label6.setText("all available car");
        add(label6, "cell 0 5");

        //---- button5 ----
        button5.setText("search");
        button5.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button5MousePressed(e);
            }
        });
        add(button5, "cell 1 5");

        //---- label7 ----
        label7.setText("city");
        add(label7, "cell 0 6");
        add(textField4, "cell 1 6");

        //---- button6 ----
        button6.setText("search");
        button6.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button6MousePressed(e);
            }
        });
        add(button6, "cell 2 6");

        //---- label11 ----
        label11.setText("larger than(>)");
        add(label11, "cell 1 7");

        //---- label14 ----
        label14.setText("smaller than(<)");
        add(label14, "cell 2 7");

        //---- label8 ----
        label8.setText("seats");
        add(label8, "cell 0 8");
        add(textField1, "cell 1 8");
        add(textField7, "cell 2 8");

        //---- button7 ----
        button7.setText("search");
        button7.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button7MousePressed(e);
            }
        });
        add(button7, "cell 3 8");

        //---- label9 ----
        label9.setText("year");
        add(label9, "cell 0 9");
        add(textField6, "cell 1 9");

        //---- button8 ----
        button8.setText("search");
        button8.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button8MousePressed(e);
            }
        });
        add(button8, "cell 2 9");

        //---- label10 ----
        label10.setText("serial number");
        add(label10, "cell 0 10");
        add(textField5, "cell 1 10");

        //---- button9 ----
        button9.setText("search");
        button9.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button9MousePressed(e);
            }
        });
        add(button9, "cell 2 10");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JLabel label4;
    private JLabel label13;
    private JLabel label1;
    private JButton button1;
    private JScrollPane scrollPane2;
    private JTable table1;
    private JLabel label2;
    private JButton button2;
    private JLabel label12;
    private JTextField textField2;
    private JLabel label3;
    private JTextField textField3;
    private JButton button3;
    private JLabel label5;
    private JButton button4;
    private JLabel label6;
    private JButton button5;
    private JLabel label7;
    private JTextField textField4;
    private JButton button6;
    private JLabel label11;
    private JLabel label14;
    private JLabel label8;
    private JTextField textField1;
    private JTextField textField7;
    private JButton button7;
    private JLabel label9;
    private JTextField textField6;
    private JButton button8;
    private JLabel label10;
    private JTextField textField5;
    private JButton button9;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
