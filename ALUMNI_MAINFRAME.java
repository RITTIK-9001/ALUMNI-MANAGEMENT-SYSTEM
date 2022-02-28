import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ALUMNI_MAINFRAME extends JFrame {
    public static void main() {
        new ALUMNI_MAINFRAME().setVisible(true);
    }

    public ALUMNI_MAINFRAME() {
        super("AMITY ALUMNI ASSOCIATION");
        initialize();
    }

    private void initialize() {

        setForeground(Color.CYAN);
        setLayout(null);

        JLabel NewLabel = new JLabel("");
        NewLabel.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/HOME.jpg")));
        NewLabel.setBounds(50, 10, 2420, 790);
        add(NewLabel);



        JLabel AlumniManagementSystem = new JLabel("AMITY ALUMNI ASSOCIATION ALUMNI FORUM");
        AlumniManagementSystem.setForeground(Color.BLUE);
        AlumniManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 36));
        AlumniManagementSystem.setBounds(350, 60, 1500, 35);
        NewLabel.add(AlumniManagementSystem);
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu AlumniSystem = new JMenu("UPDATE DATA");
        AlumniSystem.setForeground(Color.BLUE);
        menuBar.add(AlumniSystem);


        JMenuItem STD = new JMenuItem("UPDATE YOUR INFO ");
        AlumniSystem.add(STD);



        JMenu VA = new JMenu("VIEW AS");
        VA.setForeground(Color.RED);
        menuBar.add(VA);

        JMenuItem PUB = new JMenuItem("VIEW AS PUBLIC ");
        VA.add(PUB);




        STD.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
            UPDATE_YU_INFO.main();
            }
        });


        PUB.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                VIEW.main();
            }
        });

    }
}