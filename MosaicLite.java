import javax.swing.JFrame;
import javax.swing.JPanel; 
import javax.swing.JButton; 

import java.awt.Container; 
import java.awt.GridLayout;
import java.awt.BorderLayout;
//import java.awt.FlowLayout; 

class MosaicLiteFrame extends JFrame {
    public MosaicLiteFrame() {
        setBounds(200,200,1200,800); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout()); 

        JPanel buttonPanel = new JPanel();
        contentPane.add(buttonPanel, BorderLayout.SOUTH); 

        JButton randomize = new JButton("Randomize"); 
        buttonPanel.add(randomize); 

        JPanel xAndOGridPanel = new JPanel();
        contentPane.add(xAndOGridPanel, BorderLayout.CENTER); 
        xAndOGridPanel.setLayout(new GridLayout(12,12)); 
    }
}
public class MosaicLite {
    public static void main(String[] args) {
        System.out.println("Mosaic Lite Starting...."); 

        MosaicLiteFrame myMosaicLiteFrame = new MosaicLiteFrame(); 
        myMosaicLiteFrame.setVisible(true); 
    }
}