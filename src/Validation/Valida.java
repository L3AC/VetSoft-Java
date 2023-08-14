/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validation;

import Design.TextFieldSV;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import static org.apache.commons.validator.GenericValidator.minLength;

public class Valida extends PlainDocument {

    private int maxLength;

    private String allowedPattern;

    public Valida(int maxLength, String allowedPattern) {
        this.maxLength = maxLength;
        this.allowedPattern = allowedPattern;
    }

    public Valida() {

    }
    
    public static boolean validar(String cadena) {
        // Expresión regular para verificar al menos 8 dígitos
        String patron = "\\d{8,}";

        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(cadena);

        return matcher.find();
    }

    @Override
    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
        if (str == null) {
            return;
        }

        String currentText = getText(0, getLength());
        String newText = currentText.substring(0, offset) + str + currentText.substring(offset);

        if (newText.matches(allowedPattern) && newText.length() <= maxLength) {
            super.insertString(offset, str, attr);
        }

    }

    public void minL(TextFieldSV textField, JButton btn, int minLength) {
        String text = textField.getText();
        if (text.length() < minLength) {
            btn.setEnabled(false);
        } else {
            btn.setEnabled(true);
        }
    }

}
