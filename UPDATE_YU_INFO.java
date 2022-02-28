import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class UPDATE_YU_INFO extends JFrame implements ActionListener {
    JLabel l, l1, l2, l3, l4, l5;
    JButton b;
    JTextField tf1, tf2, tf3,tf4;
    JComboBox bx;
    String str;

    public UPDATE_YU_INFO () {
        setVisible(true);
        setSize(700, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("UPDATE YOUR INFO AS ALUMNI");
        l = new JLabel("Select Name:");
        b = new JButton("Submit");

        tf1 = new JTextField();

        tf2 = new JTextField();

        tf3 = new JTextField();

        tf4 = new JTextField();



        l.setBounds(20, 20, 200, 20);

        b.setBounds(50, 50, 150, 30);



        add(l);

        add(b);



        tf1.setEditable(false);

        tf2.setEditable(false);

        tf3.setEditable(false);
        tf4.setEditable(false);


        b.addActionListener(this);


        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumni","root","6290");

            PreparedStatement ps = con.prepareStatement("select Name from civil ");

            ResultSet rs = ps.executeQuery();

            Vector v = new Vector();

            while (rs.next()) {

                String s = rs.getString(1);



                v.add(s);

            }

            bx = new JComboBox(v);

            bx.setBounds(240, 20, 200, 20);

            add(bx);



        } catch (Exception ex) {

            System.out.println(ex);
        }

    }

    public void actionPerformed(ActionEvent e) {

        updateData();

    }

    private void updateData() {
    UPDATION_YOUR_INFO.main();

    }




    public static void main() {

        new UPDATE_YU_INFO();

    }

}