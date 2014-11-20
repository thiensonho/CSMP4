/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

// TODO: MUSIC http://www3.ntu.edu.sg/home/ehchua/programming/java/J8c_PlayingSound.html



import java.awt.*;
import java.awt.event.*;



/**
 *
 * @author s506571
 */
public class GamePanel extends StatePanel implements ActionListener, MouseMotionListener {

Boolean up, down, left, right, mouseClick;
Point mouseLoc;
   public GamePanel() {
      
   }

   @Override
   public void paint(Graphics g) {
//       Graphics2D g2d = (Graphics2D)g;
//       g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
//       g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//       g2d.setPaint(new TexturePaint(Player.playerImg, new Rectangle2D.Float(0, 0, Player.playerImg.getWidth(), Player.playerImg.getHeight())));
       g.setColor(Color.WHITE);
       g.fillRect(0, 0, GameFrame.WINDOW_WIDTH, GameFrame.WINDOW_HEIGHT);
        ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
            RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
   }

   public static void init() {
        
   }
   

   @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            up = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            down = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            left = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            right = true;
        }
        
        repaint();
    }
    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            up = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            down = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            left = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            right = false;
        }
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        mouseClick = true;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        mouseClick = false;
    }


    public void actionPerformed(ActionEvent e) {
       repaint();
    }

    public void mouseDragged(MouseEvent e) {
        mouseLoc = e.getPoint();
    }

    public void mouseMoved(MouseEvent e) {
        mouseLoc = e.getPoint();
    }
}
