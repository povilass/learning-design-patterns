package module.proxy.rmi.viewer;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.Naming;
import java.rmi.Remote;

public class ShowRMIRegistry implements ActionListener, ListSelectionListener {
    private JTextField registry;
    private JList list;
    private JEditorPane details;

    public ShowRMIRegistry() {
    }

    public void updateDetails(String var1) {
        String var2;
        try {
            Remote var3 = Naming.lookup(var1);
            var2 = HTMLToolKit.createClassDetails(var3.getClass());
        } catch (Exception var4) {
            var2 = var4.getMessage();
        }

        this.details.setText(var2);
    }

    public void updateList(String var1) {
        try {
            String[] var2 = Naming.list(var1);

            for(int var3 = 0; var3 < var2.length; ++var3) {
                this.list.setListData(var2);
            }

            this.details.setText("");
        } catch (Exception var4) {
            this.details.setText(var4.getMessage());
        }

    }

    public void valueChanged(ListSelectionEvent var1) {
        this.updateDetails((String)this.list.getSelectedValue());
    }

    public void actionPerformed(ActionEvent var1) {
        this.updateList(this.registry.getText());
    }

    protected GridBagConstraints createConstraints(int var1, int var2, int var3, int var4, double var5, double var7) {
        GridBagConstraints var9 = new GridBagConstraints();
        var9.fill = 1;
        var9.insets = new Insets(2, 2, 0, 0);
        var9.gridx = var1;
        var9.gridy = var2;
        var9.gridwidth = var3;
        var9.gridheight = var4;
        var9.weightx = var5;
        var9.weighty = var7;
        return var9;
    }

    protected Component createComponents() {
        JPanel var1 = new JPanel();
        var1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        var1.setLayout(new GridBagLayout());
        this.registry = new JTextField("rmi://hal/");
        var1.add(this.registry, this.createConstraints(0, 0, 8, 1, 1.0D, 0.0D));
        JButton var2 = new JButton("Retrieve");
        var2.addActionListener(this);
        var1.add(var2, this.createConstraints(8, 0, 2, 1, 0.0D, 0.0D));
        this.list = new JList();
        this.list.addListSelectionListener(this);
        var1.add(new JScrollPane(this.list), this.createConstraints(0, 1, 10, 1, 1.0D, 0.0D));
        this.details = new JEditorPane("text/html", "");
        this.details.setEditable(false);
        var1.add(new JScrollPane(this.details), this.createConstraints(0, 2, 10, 6, 1.0D, 1.0D));
        return var1;
    }

    public static void main(String[] var0) {
        JFrame var1 = new JFrame("RMI Registry Viewer");
        ShowRMIRegistry var2 = new ShowRMIRegistry();
        var1.getContentPane().add(var2.createComponents());
        //var1.addWindowListener(new 1());
        var1.setSize(700, 500);
        var1.setVisible(true);
    }
}