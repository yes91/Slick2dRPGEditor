/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseeditor;

/**
 *
 * @author Kieran
 */

import databaseeditor.panel.ActorPanel;
import databaseeditor.panel.DepPanel;
import databaseeditor.panel.ClassPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

public class DatabaseEditor extends JFrame implements ActionListener, MouseMotionListener, MouseListener{

     private JLabel statusbar;
     private JMenuItem fileOpen;
     private JMenuItem fileSave;
     private int mouseX;
     private int mouseY;
     private Rectangle mouseBounds;
     public static String loadedImage;
     public static JToolBar toolbar;
     private JFileChooser fc;

    public DatabaseEditor() {
        ItemReader.populateItems();
        initUI();
    }

    public final void initUI() {

        mouseBounds = new Rectangle(0, 0, 5, 5);
        fc = new JFileChooser();
        JMenuBar menubar = new JMenuBar();
        ImageIcon iconNew = new ImageIcon(getClass().getResource("new.png"));
        ImageIcon iconOpen = new ImageIcon(getClass().getResource("open.png"));
        ImageIcon iconSave = new ImageIcon(getClass().getResource("save.png"));
        ImageIcon iconExit = new ImageIcon(getClass().getResource("exit.png"));
        
        JTabbedPane tabbedPane = new JTabbedPane();
        
        JComponent panel1 = new ActorPanel();
        tabbedPane.addTab("Actors", null, panel1,
                "Does nothing");
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
        
        JComponent panel2 = new ClassPanel();
        tabbedPane.addTab("Classes", null, panel2,
                "Does twice as much nothing");
        tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);
        
        JComponent panel3 = new DepPanel();
        tabbedPane.addTab("Skills", null, panel3,
                "Still does nothing");
        tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);
        
        JComponent panel4 = makeTextPanel("Panel #4");
        tabbedPane.addTab("Items", null, panel4,
                "Still does nothing");
        tabbedPane.setMnemonicAt(3, KeyEvent.VK_4);
        
        JComponent panel5 = makeTextPanel(
                "Panel #5 (has a preferred size of 410 x 50).");
        panel4.setPreferredSize(new Dimension(410, 50));
        tabbedPane.addTab("Weapons", null, panel5,
                "Does nothing at all");
        tabbedPane.setMnemonicAt(4, KeyEvent.VK_5);
        
        JComponent panel6 = makeTextPanel("Panel #6");
        tabbedPane.addTab("Armors", null, panel6,
                "Still does nothing");
        tabbedPane.setMnemonicAt(5, KeyEvent.VK_6);
        
        JComponent panel7 = makeTextPanel("Panel #7");
        tabbedPane.addTab("Enemies", null, panel7,
                "Still does nothing");
        tabbedPane.setMnemonicAt(6, KeyEvent.VK_7);
        
        JComponent panel8 = makeTextPanel("Panel #8");
        tabbedPane.addTab("Troops", null, panel8,
                "Still does nothing");
        tabbedPane.setMnemonicAt(7, KeyEvent.VK_8);
        
        JComponent panel9 = makeTextPanel("Panel #9");
        tabbedPane.addTab("States", null, panel9,
                "Still does nothing");
        tabbedPane.setMnemonicAt(8, KeyEvent.VK_9);
        
        JComponent panel10 = makeTextPanel("Panel #10");
        tabbedPane.addTab("Animations", null, panel10,
                "Still does nothing");
        tabbedPane.setMnemonicAt(9, KeyEvent.VK_F1);
        
        JComponent panel11 = makeTextPanel("Panel #11");
        tabbedPane.addTab("Common Events", null, panel11,
                "Still does nothing");
        tabbedPane.setMnemonicAt(10, KeyEvent.VK_F2);
        
        JComponent panel12 = makeTextPanel("Panel #12");
        tabbedPane.addTab("System", null, panel12,
                "Still does nothing");
        tabbedPane.setMnemonicAt(11, KeyEvent.VK_F3);
        
        JComponent panel13 = makeTextPanel("Panel #13");
        tabbedPane.addTab("Terms", null, panel13,
                "Still does nothing");
        tabbedPane.setMnemonicAt(12, KeyEvent.VK_F4);
        
        //Add the tabbed pane to this panel.
        add(tabbedPane);
        
        //The following line enables to use scrolling tabs.
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);

        JMenu file = new JMenu("File");
        file.setMnemonic(KeyEvent.VK_F);

        JMenuItem fileNew = new JMenuItem("New", iconNew);
        fileNew.setMnemonic(KeyEvent.VK_N);

        fileOpen = new JMenuItem("Open", iconOpen);
        fileOpen.setMnemonic(KeyEvent.VK_O);
        fileOpen.addActionListener(this);

        toolbar = new JToolBar();        
        add(toolbar, BorderLayout.NORTH);

        fileSave = new JMenuItem("Save", iconSave);
        fileSave.setMnemonic(KeyEvent.VK_S);
        fileSave.addActionListener(this);

        JMenuItem fileExit = new JMenuItem("Exit", iconExit);
        fileExit.setMnemonic(KeyEvent.VK_C);
        fileExit.setToolTipText("Exit application");
        fileExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W,
            ActionEvent.CTRL_MASK));

        fileExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }

        });

        file.add(fileNew);
        file.add(fileOpen);
        file.add(fileSave);
        file.addSeparator();
        file.add(fileExit);

        menubar.add(file);
        addMouseListener(this);
        addMouseMotionListener(this);

        setJMenuBar(menubar);

        setTitle("RPG Database Editor");
        setResizable(true);
        setSize(1024, 768);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    protected JComponent makeTextPanel(String text) {
        JPanel panel = new JPanel(false);
        JLabel filler = new JLabel(text);
        filler.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        return panel;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == fileOpen) {
            int returnVal = fc.showOpenDialog(DatabaseEditor.this);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                String location;
                location = file.toURI().getPath();
                location = location.replaceFirst("/", "");
                if(location.contains(".png")){
                System.out.println(location); 
                }
                if(location.contains(".xml")){
                        DataBaseWriter.loadAnimation(file);
                }
                if(!location.contains(".xml") && !location.contains(".png")){
                    JOptionPane.showMessageDialog(this, "Invalid file, use .xml or .png");
                }
            }
        }
        if(e.getSource() == fileSave){
            int returnVal = fc.showSaveDialog(DatabaseEditor.this);
            if (returnVal == JFileChooser.APPROVE_OPTION){
                File file = fc.getSelectedFile();
                String location;
                location = file.toURI().getPath();
                location = location.replaceFirst("/", "");
                System.out.println(location);
                DataBaseWriter.saveAnimation(location);
                
            }  
        }
        repaint();
    }
        

    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                DatabaseEditor ex = new DatabaseEditor();
                ex.setVisible(true);
            }
        });
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
     
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Clicked");
       
                repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

   
}
