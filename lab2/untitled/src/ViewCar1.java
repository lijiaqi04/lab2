import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
import javax.swing.table.*;
import net.miginfocom.swing.*;

/*
 * Created by JFormDesigner on Sun Oct 10 11:44:50 EDT 2021
 */



/**
 * @author unknown
 */
public class ViewCar1 extends JPanel {
    CarHistory history;
    public ViewCar1(CarHistory history) {
        initComponents();
        SimpleDateFormat sdf = new SimpleDateFormat( " yyyy-MM-dd HH:mm:ss " );
        String date = sdf.format(history.getTime());
        textField1.setText(date);
        this.history=history;
        populateTable();
        table1.getTableHeader().setBackground(new Color(255, 255, 255, 0));
    }



    private void button1MousePressed(MouseEvent e) {
        int selected=table1.getSelectedRow();
        if(selected<0){
            JOptionPane.showMessageDialog(this,"please select a row");
            return;
        }
        DefaultTableModel model_1=(DefaultTableModel)table1.getModel();
//        Car selectedCar=(Car) model_1.getValueAt(selected,0);
        history.deleteCar(selected);
        JOptionPane.showMessageDialog(this,"Car deleted");
        populateTable();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        label1 = new JLabel();
        panel1 = new JPanel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        button1 = new JButton();
        textField1 = new JTextField();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing.
        border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder. CENTER
        , javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog" ,java .awt .Font
        .BOLD ,12 ), java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (
        new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order"
        .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
        setLayout(new MigLayout(
            "hidemode 3",
            // columns
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
            "[]"));

        //---- label1 ----
        label1.setText("view car");
        add(label1, "cell 2 1,alignx center,growx 0");

        //======== panel1 ========
        {
            panel1.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[843,fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //======== scrollPane1 ========
            {

                //---- table1 ----
                table1.setModel(new DefaultTableModel(
                    new Object[][] {
                        {null, null, null, null, null, null, null, null, null},
                    },
                    new String[] {
                        "brand", "year", "serial number", "seats", "certificace", "model number", "available", "city", "manifacturers"
                    }
                ) {
                    boolean[] columnEditable = new boolean[] {
                        false, false, false, false, false, false, false, false, false
                    };
                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return columnEditable[columnIndex];
                    }
                });
                {
                    TableColumnModel cm = table1.getColumnModel();
                    cm.getColumn(0).setMinWidth(5);
                    cm.getColumn(2).setPreferredWidth(95);
                    cm.getColumn(3).setPreferredWidth(65);
                    cm.getColumn(4).setPreferredWidth(100);
                    cm.getColumn(5).setPreferredWidth(105);
                }
                table1.setBackground(Color.white);
                table1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                scrollPane1.setViewportView(table1);
            }
            panel1.add(scrollPane1, "cell 0 0");

            //---- button1 ----
            button1.setText("delete");
            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    button1MousePressed(e);
                }
            });
            panel1.add(button1, "cell 0 2");
            panel1.add(textField1, "cell 0 3,alignx center,growx 0");
        }
        add(panel1, "cell 2 2 3 1");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JLabel label1;
    private JPanel panel1;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JButton button1;
    private JTextField textField1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        model.setRowCount(0);
        for (Car vs : history.getHistory()) {
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
}
