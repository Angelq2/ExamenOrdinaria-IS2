package view;

import java.awt.*;
import javax.swing.*;
        
/**
 *
 * @author angel
 */
public class MovieCatalogDisplay extends JFrame{

    public MovieCatalogDisplay(String title){
        super(title);
        setLocation(100,50);
        setSize(550,315);
        setMinimumSize(new Dimension(200,100));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
