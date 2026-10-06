package afranke.view;
import javax.swing.*;
import java.awt.*;

import static javax.swing.SwingConstants.CENTER;

public class GrafikPanel extends JPanel{
    private JLabel rundenErgebnis = new JLabel("Tippe eine Zahl von 1 bis 9");
    private JLabel gesamtPunkte = new JLabel("Gesamtpunkte: ");
    private JTextField[] txt = new JTextField[2];
    private JButton btn;

    public GrafikPanel() {
        BorderLayout b = new BorderLayout();
        this.setLayout(b);
        JPanel oben = new JPanel(new GridLayout(3, 2));
        oben.add(new JLabel("Rundenergebnis:"));
        oben.add(new JLabel("Gesamtpunkte:"));
        oben.add(rundenErgebnis);
        oben.add(gesamtPunkte);
        oben.add(new JLabel("Deine Zahl:"));
        oben.add(new JLabel("Computer:"));

        JPanel mitte = new JPanel(new GridLayout(1, 2));
        for (int i = 0; i < 2; i++) {
            txt[i] = new JTextField();
            txt[i].setHorizontalAlignment(CENTER);
            txt[i].setFont(new Font("SansSerif", Font.BOLD, 64));
            mitte.add(txt[i]);
        }
        txt[1].setEnabled(false);

        JPanel mische = new JPanel(new GridLayout(2, 2));
        mische.add(oben);
        mische.add(mitte);

        JPanel unten = new JPanel();
        this.btn = new JButton("Noch einmal!");
        unten.add(this.btn);

        this.add(mische, BorderLayout.CENTER);
        this.add(unten, BorderLayout.PAGE_END);
    }
    public void setRundenErgebnis(String s) {
        rundenErgebnis.setText(s);
    }

    public String getRundenErgebnis() {
        return rundenErgebnis.getText();
    }

    public String getGesamtErgebnis() {
        return gesamtPunkte.getText();
    }

    public void setGesamtErgebnis(String s) {
        gesamtPunkte.setText(s);
    }

    public JButton getButton() { return this.btn; }

    public String getTxt(int i) {
        return this.txt[i].getText();
    }

    public void setTxt(String s, int i) {
        this.txt[i].setText(s);
    }

    public JTextField getTxtField(int i) {
        return txt[i];
    }
}