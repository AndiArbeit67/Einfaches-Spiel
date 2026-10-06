package afranke.view;

import javax.swing.*;
import java.awt.*;

public class GrafikFrame extends JFrame
{
    public GrafikFrame() {
        this.add(new GrafikPanel());
        this.setVisible(true);
        this.setSize(600, 420);
    }
}