package afranke.view;
import javax.swing.*;
import java.awt.*;

public class GrafikPanel {
    private JLabel rundenNummer = new JLabel("Tippe eine Zahl von 1 bis 9");
    private JLabel gesamtPunkte = new JLabel("Gesamtpunkte: ");

    public GrafikPanel() {
        JPanel layoutOben = new JPanel(new GridLayout(3, 2));

        layoutOben.add(rundenNummer);
        layoutOben.add(gesamtPunkte);

        layoutOben.add(new JLabel("Rundenergebnis:"));
        layoutOben.add(new JLabel("Gesamtpunkte:"));
        layoutOben.add(new JLabel("Deine Zahl:"));
        layoutOben.add(new JLabel("Computer:"));
    }

    public void setErgebnis(int z, int check) {
        if(check == 0) {
            if(z > 0) {
                rundenNummer.setText("+" + z);
            } else if (z < 0) {
                rundenNummer.setText("" + z);
            }
        } else {
            gesamtPunkte.setText("" + z);
        }
    }
}