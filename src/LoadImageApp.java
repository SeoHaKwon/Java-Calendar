import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class LoadImageApp extends Component {   
    //���۸� Ȱ���� �̹��� Ŭ����
 BufferedImage img;
  
    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, null); //�׸��� �׸��� �޼ҵ�
    }
    //����Ʈ ������
    public LoadImageApp() {
       try {
        String filename="src/jpj/client/image/����.jpg"; // ������ ���
           img = ImageIO.read(new File(filename));   //�̹��� ������ �ҷ����� IO �޼ҵ�
                                //���ϰ���� �̹��� ������ �д´�.
       } catch (IOException e) {
        e.printStackTrace();
       }
    }

    public Dimension getPreferredSize() {
        if (img == null) {
             return new Dimension(100,100); //�׸� ������ ���� ��� �������� ũ�⸦ 100,100���� �����
        } else {
           return new Dimension(img.getWidth(null), img.getHeight(null)); //�׸��� ũ�⿡ ���� ȭ���� ũ�⸦ �����Ѵ�.
       }
    }
    public static void main(String[] args) {

        JFrame f = new JFrame("Load Image Sample");
            
        f.addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });

        f.add(new LoadImageApp());
        f.pack();
        f.setVisible(true);
    }
}