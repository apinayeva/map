import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Test {


    public static void main(String[] args) throws IOException {
        // X and Y coordinates
        final JTextField xValueField1 = new JTextField("X value", 20);
        xValueField1.setCaretColor(Color.RED);
        final JTextField yValueField1 = new JTextField("Y value", 20);
        yValueField1.setCaretColor(Color.RED);

        final JTextField xValueField2 = new JTextField("X value", 20);
        xValueField2.setCaretColor(Color.RED);
        final JTextField yValueField2 = new JTextField("Y value", 20);
        yValueField2.setCaretColor(Color.RED);

        final JTextField xValueField3 = new JTextField("X value", 20);
        xValueField3.setCaretColor(Color.RED);
        final JTextField yValueField3 = new JTextField("Y value", 20);
        yValueField3.setCaretColor(Color.RED);

        final JTextField xValueField4 = new JTextField("X value", 20);
        xValueField4.setCaretColor(Color.RED);
        final JTextField yValueField4 = new JTextField("Y value", 20);
        yValueField4.setCaretColor(Color.RED);


        String imagePath = "C:/Users/apinayeva/Downloads/test.png";
        File file = new File(imagePath);


        BufferedImage image = ImageIO.read(file);
        final int[] count = {0};
        // Picture
        JLabel label = new JLabel(new ImageIcon(image));
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Point location = MouseInfo.getPointerInfo().getLocation();
                String x = String.valueOf(location.getX());
                String y = String.valueOf(location.getY());
                switch (count[0]) {
                    case 0:
                        xValueField1.setText(x);
                        yValueField1.setText(y);
                        break;
                    case 1:
                        xValueField2.setText(x);
                        yValueField2.setText(y);
                        break;
                    case 2:
                        xValueField3.setText(x);
                        yValueField3.setText(y);
                        break;
                    case 3:
                        xValueField4.setText(x);
                        yValueField4.setText(y);
                        break;
                    default:
                        count[0] = 0;
                        xValueField1.setText(x);
                        yValueField1.setText(y);
                        break;
                }
                count[0]++;
            }
        });

        JToolBar toolBar = new JToolBar("Инструментальная панель");
        toolBar.add(new JButton("Кнопка 1"));
        toolBar.add(xValueField1);
        toolBar.add(yValueField1);

        toolBar.add(new JButton("Кнопка 2"));
        toolBar.add(xValueField2);
        toolBar.add(yValueField2);

        toolBar.add(new JButton("Кнопка 3"));
        toolBar.add(xValueField3);
        toolBar.add(yValueField3);

        toolBar.add(new JButton("Кнопка 4"));
        toolBar.add(xValueField4);
        toolBar.add(yValueField4);
        // Panel for settings
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(toolBar);



        JFrame f = new JFrame("Map");
        //What happens when the frame closes?
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(label);
        f.getContentPane().add(panel, BorderLayout.SOUTH);
        f.pack();
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.setVisible(true);
    }
}
