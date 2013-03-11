/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package editor;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
/**
 *
 * @author Kieran
 */
public class DataBaseWriter {
    
    public static void loadAnimation(File file){
        SAXBuilder builder = new SAXBuilder();
        //InputStream is = AnimationWriter.class.getResourceAsStream(loc);
        
        try {
            Document document = (Document) builder.build(file);
            Element rootNode = document.getRootElement();
            
        } catch (JDOMException ex) {
            Logger.getLogger(DataBaseWriter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DataBaseWriter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void saveAnimation(String path){
        SAXBuilder builder = new SAXBuilder();
        XMLOutputter serializer = new XMLOutputter();
        
        Element root = new Element("Animation");
        Document doc = new Document(root);
        
        try {
            FileWriter writer = new FileWriter(path);
        
        serializer.setFormat(Format.getPrettyFormat());
        
        serializer.output(doc, writer);
        serializer.output(doc, System.out);
        } catch (IOException ex) {
            Logger.getLogger(DataBaseWriter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
}
