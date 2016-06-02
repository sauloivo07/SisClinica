/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Saulo
 */
public class camposControle extends PlainDocument {
    
    private String regex;
    private int limite;
    
    public camposControle(String regex, int limite){
        this.regex = regex;
        this.limite = limite;
    }
    
    @Override
    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
        if ((getLength() + str.length()) <= limite) {
            super.insertString(offset, str.replaceAll(regex, ""), attr);
        }
    }
    
    public void replace(int offset, String str, AttributeSet attr) throws BadLocationException {
       if ((getLength() + str.length()) <= limite) {
            super.insertString(offset, str.replaceAll(regex, ""), attr);
       }
    }
    
    private boolean cp(JTextField txt){
        boolean t = (txt.getText().isEmpty());
        return t;
    }
}
