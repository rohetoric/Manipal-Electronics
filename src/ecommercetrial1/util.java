/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommercetrial1;
import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author student
 */
public class util {
    
    public static void showError(Component cmp, String msg){
    JOptionPane.showMessageDialog(cmp,msg,"ERROR-MESSAGE",JOptionPane.ERROR_MESSAGE);
    }
    public static void showWarning(Component cmp, String msg){
        JOptionPane.showMessageDialog(cmp,msg,"WARNING-MESSAGE",JOptionPane.ERROR_MESSAGE);
    }
    
    public static void showMessage(Component cmp, String msg){
        JOptionPane.showMessageDialog(cmp,msg);
    }
    
    
}
