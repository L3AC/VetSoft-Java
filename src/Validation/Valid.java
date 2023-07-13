
package Validation; 

import java.util.regex.Pattern;

import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class Valid {
    
    
    public static void valT(JTextField textField, int maxLength, final String regex) {
        // Limitar a maxLength caracteres
        textField.setDocument(new JTextFieldLimit(maxLength));

        // Validar con regex
        DocumentFilter filter = new DocumentFilter() {
            private Pattern pattern = Pattern.compile(regex);

            @Override
            public void insertString(DocumentFilter.FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
                StringBuilder sb = new StringBuilder();
                sb.append(fb.getDocument().getText(0, fb.getDocument().getLength()));
                sb.insert(offset, text);

                if (pattern.matcher(sb.toString()).matches()) {
                    super.insertString(fb, offset, text, attr);  // Permitir ingreso válido
                }
            }

            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                StringBuilder sb = new StringBuilder();
                sb.append(fb.getDocument().getText(0, fb.getDocument().getLength()));
                sb.replace(offset, offset + length, text);

                if (pattern.matcher(sb.toString()).matches()) {
                    super.replace(fb, offset, length, text, attrs);  // Permitir ingreso válido
                }
            }
        };

        textField.setDocument(new FilteredDocument(filter));
    }

    // Clase auxiliar para limitar la longitud del JTextField
    private static class JTextFieldLimit extends javax.swing.text.PlainDocument {
        private int limit;

        JTextFieldLimit(int limit) {
            super();
            this.limit = limit;
        }

        @Override
        public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
            if (str == null) return;

            if ((getLength() + str.length()) <= limit) {
                super.insertString(offset, str, attr);
            }
        }
    }

    // Clase auxiliar para aplicar el DocumentFilter al JTextField
    private static class FilteredDocument extends javax.swing.text.PlainDocument {
        private DocumentFilter filter;

        FilteredDocument(DocumentFilter filter) {
            super();
            this.filter = filter;
        }

        @Override
        public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
            filter.insertString(new DocumentFilter.FilterBypass() {
                @Override
                public javax.swing.text.Document getDocument() {
                    return FilteredDocument.this;
                }

                @Override
                public void remove(int offs, int len) throws BadLocationException {
                    FilteredDocument.this.remove(offs, len);
                }

                @Override
                public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                    FilteredDocument.this.insertString(offs, str, a);
                }

                @Override
                public void replace(int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                    FilteredDocument.this.replace(offset, length, text, attrs);
                }
            }, offset, str, attr);
        }

        @Override
        public void remove(int offset, int length) throws BadLocationException {
            filter.remove(new DocumentFilter.FilterBypass() {
                @Override
                public javax.swing.text.Document getDocument() {
                    return FilteredDocument.this;
                }

                @Override
                public void remove(int offs, int len) throws BadLocationException {
                    FilteredDocument.this.remove(offs, len);
                }

                @Override
                public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                    FilteredDocument.this.insertString(offs, str, a);
                }

                @Override
                public void replace(int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                    FilteredDocument.this.replace(offset, length, text, attrs);
                }
            }, offset, length);
        }
    }
}
