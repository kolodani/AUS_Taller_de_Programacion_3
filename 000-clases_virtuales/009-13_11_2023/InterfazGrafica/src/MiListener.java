import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class MiListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(((JButton)e.getSource()).getText());
    }
}
