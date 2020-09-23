

package ejer3;

import javax.swing.JOptionPane;


public class Ejer3 {

    
    public static void main(String[] args) {
        
        int m,factor=1;
        int suma=0;
        
        m=Integer.parseInt(JOptionPane.showInputDialog("Digite hasta q numero va a terminar la suma de factoriales: "));
        for(int i=1;i<=m;i++){
            factor*=i;
            suma+=factor;
        }
        JOptionPane.showMessageDialog(null, "La suma de factoriales: "+suma);
    }
    
}
