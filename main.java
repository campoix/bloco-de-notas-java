import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class main {

    public static void main(String[] args){
      
        JFrame miJFrame = new JFrame("exemplo java swing");
        miJFrame.setSize(500,300); 

 
        JPanel miJPanel = new JPanel();
        miJPanel.setSize(300, 300);

     
        miJPanel.setLayout(new GridBagLayout());

        JLabel miJLabel = new JLabel();
        miJLabel.setText("notas:");

        JTextArea miJTextArea = new JTextArea(5,20); 

        miJPanel.add(miJLabel);
        miJPanel.add(miJTextArea);

        miJFrame.add(miJPanel);

        miJFrame.setVisible(true);
    }
}
