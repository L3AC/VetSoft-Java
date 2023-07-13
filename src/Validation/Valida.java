/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validation;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author LEAC2
 */
public class Valida extends PlainDocument{
    private int maxLength;
    private String allowedPattern;

    public Valida(int maxLength, String allowedPattern) {
        this.maxLength = maxLength;
        this.allowedPattern = allowedPattern;
    }

    @Override
    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
        if (str == null)
            return;

        String currentText = getText(0, getLength());
        String newText = currentText.substring(0, offset) + str + currentText.substring(offset);

        if (newText.matches(allowedPattern) && newText.length() <= maxLength)
            super.insertString(offset, str, attr);
    }
}
