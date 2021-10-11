import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseEvent;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Sat Oct 09 22:00:00 EDT 2021
 */



/**
 * @author unknown
 */
public class MainPanel extends JPanel {

    CarHistory history;
    public MainPanel() {
        initComponents();
        history =new CarHistory();
    }


    private void button4MouseClicked(MouseEvent e) {
        CreatePanel c = new CreatePanel(history);
        splitPane1.setRightComponent(c);
//        CardLayout cl = (CardLayout)(rightPanel.getLayout());
//        cl.show(cards, (String)evt.getItem());
//        cl.next(c);
//        rightPanel.updateUI();
    }

    private void button2MousePressed(MouseEvent e) {
        ViewCar1 c = new ViewCar1(history);
        splitPane1.setRightComponent(c);
    }

    private void button3MousePressed(MouseEvent e) {
        SearchForm c = new SearchForm(history);
        splitPane1.setRightComponent(c);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        splitPane1 = new JSplitPane();
        leftPanel = new JPanel();
        button4 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        rightPanel = new JPanel();
        textArea1 = new JTextArea();

        //======== this ========
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.
        EmptyBorder(0,0,0,0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion",javax.swing.border.TitledBorder.CENTER,javax.swing
        .border.TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,12),
        java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener()
        {@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("bord\u0065r".equals(e.getPropertyName()))
        throw new RuntimeException();}});
        setLayout(new CardLayout());

        //======== splitPane1 ========
        {

            //======== leftPanel ========
            {
                leftPanel.setLayout(new MigLayout(
                    "hidemode 3",
                    // columns
                    "[fill]",
                    // rows
                    "[]" +
                    "[]" +
                    "[]"));

                //---- button4 ----
                button4.setText("save");
                button4.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button4MouseClicked(e);
                    }
                });
                leftPanel.add(button4, "cell 0 0");

                //---- button2 ----
                button2.setText("view");
                button2.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        button2MousePressed(e);
                    }
                });
                leftPanel.add(button2, "cell 0 1");

                //---- button3 ----
                button3.setText("search");
                button3.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        button3MousePressed(e);
                    }
                });
                leftPanel.add(button3, "cell 0 2");
            }
            splitPane1.setLeftComponent(leftPanel);

            //======== rightPanel ========
            {
                rightPanel.setLayout(new CardLayout());
                rightPanel.add(textArea1, "card1");
            }
            splitPane1.setRightComponent(rightPanel);
        }
        add(splitPane1, "card1");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JSplitPane splitPane1;
    private JPanel leftPanel;
    private JButton button4;
    private JButton button2;
    private JButton button3;
    private JPanel rightPanel;
    private JTextArea textArea1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String args[]){
//    Main main = new Main();
        MainPanel main = new MainPanel();
//        TestPanel main = new TestPanel();
//        main
//        textField1.setText(text);
        JFrame frame =new JFrame();
        frame.add(main);
        frame.setVisible(true);
        frame.setSize(500,200);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
