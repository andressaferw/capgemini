package Eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MinhaTela {

    private JTextField textField1;
    private JPanel panel1;
    private JButton button1;

    public MinhaTela() {
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JOptionPane.showMessageDialog(rootPane, "Seja bem vindo");
            }
        });
        button1.addMouseListener(new MouseAdapter() {
        });
    }
}
