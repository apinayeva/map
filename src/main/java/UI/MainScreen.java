//package UI;
//
//import javax.imageio.ImageIO;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//import static com.sun.java.accessibility.util.AWTEventMonitor.addMouseListener;
//
//public class MainScreen {
//
//    public static void main(String[] args) throws IOException {
//        // Menu
//        JMenu menu, help, submenu;
//        JMenuItem i1, i2, i3, i4, i5;
//        JMenuBar mb = new JMenuBar();
//        menu = new JMenu("Menu");
//        help = new JMenu("Help");
//        submenu = new JMenu("Sub Menu");
//        i1 = new JMenuItem("Item 1");
//        i2 = new JMenuItem("Item 2");
//        i3 = new JMenuItem("Item 3");
//        i4 = new JMenuItem("Item 4");
//        i5 = new JMenuItem("Item 5");
//        menu.add(i1);
//        menu.add(i2);
//        menu.add(i3);
//        submenu.add(i4);
//        submenu.add(i5);
//        menu.add(submenu);
//        mb.add(menu);
//        mb.add(help);
//
////        // Canvas
////        BufferedImage image = null;
////        final List<Point> points;
////
////            points = new ArrayList<>(25);
////            try {
////                image = ImageIO.read(new File("/Users/gannapinaieva/Map/map.jpg"));
////            } catch (IOException ex) {
////                ex.printStackTrace();
////            }
////
////            addMouseListener(new MouseAdapter() {
////                @Override
////                public void mouseClicked(MouseEvent e) {
////                    points.add(e.getPoint());
//////                    repaint();
////                }
////            });
//
////        // Picture
//        JLabel label = new JLabel(new ImageIcon(image));
//        JFrame f = new JFrame("Map");
//        //What happens when the frame closes?
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.getContentPane().add(new TestPane());
////        f.getContentPane().add(panel, BorderLayout.SOUTH);
//        f.setJMenuBar(mb);
//
////        f.getContentPane().add(label);
//        f.pack();
//        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        f.setVisible(true);
//    }
//
//    public class MainScreen extends JPanel {
//
//        private List<Point> points;
//        private BufferedImage image;
//
//        public MainScreen() {
//            points = new ArrayList<>(25);
//            try {
//                image = ImageIO.read(new File("/Users/gannapinaieva/Map/map.jpg"));
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//
//            addMouseListener(new MouseAdapter() {
//                @Override
//                public void mouseClicked(MouseEvent e) {
//                    points.add(e.getPoint());
//                    repaint();
//                }
//            });
//        }
//
//        @Override
//        public Dimension getPreferredSize() {
//            return image == null ? new Dimension(200, 200) : new Dimension(image.getWidth(), image.getHeight());
//        }
//
//        @Override
//        protected void paintComponent(Graphics g) {
//            super.paintComponent(g);
//            Graphics2D g2d = (Graphics2D) g.create();
//            if (image != null) {
//                g2d.drawImage(image, 0, 0, this);
//            }
//            g2d.setColor(Color.RED);
//            for (Point p : points) {
//                g2d.fillOval(p.x - 4, p.y - 4, 8, 8);
//            }
//            g2d.dispose();
//        }
//
//    }
//}
