/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package editor;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author redblast71
 */
public class AnimationViewComponent extends JPanel{
    
    ImageIcon sheet;
    ImageIcon[] frames;
    
    public void setSheet(String imageRef){
        
        sheet = new ImageIcon("res/animation/"+imageRef);
        frames = new ImageIcon[(sheet.getIconWidth()*sheet.getIconHeight())/(192*192)];
        for(int i = 0; i < frames.length; i++){
            frames[i] = EditorGUI.subImage(sheet, 6, i, 192, 1);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(Color.BLUE);
        g2d.fillRect(0, 0, getWidth(), getHeight());
        g2d.drawImage(frames[0].getImage(), 0, 0, 192, 192, this);
        
    }
}
