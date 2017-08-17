import java.awt.*;
import java.awt.event.*;

/**
 * Created by danawacomputer on 2017-07-14.
 */
public class InnerEx8 {
    public static void main(String[] args) {
        Button b = new Button("Start!");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Action event occurred!");
            }
        }//익명 함수 끝
        );
    }//main
}
