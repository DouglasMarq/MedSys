package util;

import java.text.ParseException;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

public class Formata {
    
    public static DefaultFormatterFactory cpf(){
        MaskFormatter mask = null;
        try {
            mask = new MaskFormatter("###.###.###-##");
            mask.setPlaceholderCharacter('_');
        } catch (ParseException ex) {
        }
        return (new DefaultFormatterFactory(mask,mask));
    }
    
    public static DefaultFormatterFactory celular(){
        MaskFormatter mask = null;
        try {
            mask = new MaskFormatter("(##) 9####-####");
            mask.setPlaceholderCharacter('_');
        } catch (ParseException ex) {
        }
        return (new DefaultFormatterFactory(mask,mask));
    }
    
    public static DefaultFormatterFactory telefone(){
        MaskFormatter mask = null;
        try {
            mask = new MaskFormatter("(##) ####-####");
            mask.setPlaceholderCharacter('_');
        } catch (ParseException ex) {
        }
        return (new DefaultFormatterFactory(mask,mask));
    }
    
    public static DefaultFormatterFactory DtNascimento(){
        MaskFormatter mask = null;
        try {
            mask = new MaskFormatter("##/##/####");
            mask.setPlaceholderCharacter('_');
        } catch (ParseException ex) {
        }
        return (new DefaultFormatterFactory(mask,mask));
    }
    
    public static DefaultFormatterFactory RG(){
        MaskFormatter mask = null;
        try {
            mask = new MaskFormatter("##.###.###-#");
            mask.setPlaceholderCharacter('_');
        } catch (ParseException ex) {
        }
        return (new DefaultFormatterFactory(mask,mask));
    }
    
}
