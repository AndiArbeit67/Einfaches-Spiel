package afranke.view;
import javax.swing.*;
import java.awt.*;

public class GrafikPanel extends JPanel {

    private JLabel rundenNummer = new JLabel("Tippe eine Zahl von 1 bis 9");
    private JLabel gesamtPunkte = new JLabel("Gesamtpunkte: ");
    private JTextField text = new JTextField();

    public GrafikPanel() {
        this.setLayout(new BorderLayout());

        JPanel layoutoben = new JPanel(new GridLayout(3, 2));

        layoutoben.add(new JLabel("Rundenergebnis:"));
        layoutoben.add(new JLabel("Gesamtpunkte:"));
        layoutoben.add(rundenNummer);
        layoutoben.add(gesamtPunkte);
        layoutoben.add(new JLabel("Deine Zahl:"));
        layoutoben.add(new JLabel("Computer:"));

        JPanel mitte = new JPanel(new GridLayout(1, 2));

        text.setHorizontalAlignment(JTextField.CENTER);
        text.setFont(new Font("SansSerif", Font.BOLD, 64));
        mitte.add(text);
        JLabel comp = new JLabel("3");
        comp.setFont(new Font("SansSerif", Font.BOLD, 64));
        comp.setBackground(Color.WHITE);
        comp.setHorizontalAlignment(SwingConstants.CENTER);
        mitte.add(comp);

        JPanel gesamt = new JPanel(new GridLayout(2, 2));
        gesamt.add(layoutoben);
        gesamt.add(mitte);
        this.add(gesamt, BorderLayout.CENTER);
    }

    public void setErgebnis(int z, int check) {
        if (check == 0) {
            if (z > 0) {
                rundenNummer.setText("+" + z);
            } else if (z < 0) {
                rundenNummer.setText("" + z);
            }
        } else {
            gesamtPunkte.setText("" + z);
        }
    }
}