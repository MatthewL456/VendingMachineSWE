import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VendingMachineGUI extends JFrame {
    private JPanel panelMain;
    private JLabel vendingMachineLabel;
    private JButton aButton;
    private JButton key1Button;
    private JButton key2Button;
    private JButton bButton;
    private JButton key4Button;
    private JButton key5Button;
    private JButton cButton;
    private JButton key7Button;
    private JButton key8Button;
    private JButton key3Button;
    private JButton key6Button;
    private JButton key9Button;
    private JButton selectButton;
    private JButton cancelButton;
    private JLabel displayLabel;
    private JTextField txtName;

    String rowSelection = "";
    String coloumnSelection = "";
    String drinkSelection;

    public VendingMachineGUI() {
        aButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rowSelection = "A";
                selectionUpdater();
            }
        });
        bButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rowSelection = "B";
                selectionUpdater();
            }
        });
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rowSelection = "C";
                selectionUpdater();
            }
        });
        key1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coloumnSelection = "1";
                selectionUpdater();
            }
        });
        key2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coloumnSelection = "2";
                selectionUpdater();
            }
        });
        key3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coloumnSelection = "3";
                selectionUpdater();
            }
        });
        key4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coloumnSelection = "4";
                selectionUpdater();
            }
        });
        key5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coloumnSelection = "5";
                selectionUpdater();
            }
        });
        key6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coloumnSelection = "6";
                selectionUpdater();
            }
        });
        key7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coloumnSelection = "7";
                selectionUpdater();
            }
        });
        key8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coloumnSelection = "8";
                selectionUpdater();
            }
        });
        key9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coloumnSelection = "9";
                selectionUpdater();}
        });
        selectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drinkSelection = rowSelection + coloumnSelection;
                System.out.println(drinkSelection);
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drinkSelection = "";
                rowSelection = "";
                coloumnSelection = "";
                selectionUpdater();
            }
        });

    }
    public void selectionUpdater() {
        drinkSelection = rowSelection + coloumnSelection;
        displayLabel.setText(drinkSelection);
    };

    public static void main(String[] args) {
        //CreateStocklist asdf = new CreateStocklist();
        Stocklist.createFile();
        VendingMachineGUI h = new VendingMachineGUI();
        h.setContentPane(h.panelMain);
        h.setTitle("Vending Machine");
        h.setSize(1000, 700);
        h.setLocationRelativeTo(null);
        h.setVisible(true);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
