package util;

import java.text.ParseException;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

public class Formata {
    /**
     * Formatação para o campo de CPF
     * @return 
     */
    public static DefaultFormatterFactory cpf(){
        MaskFormatter mask = null;
        try {
            mask = new MaskFormatter("###.###.###-##");
            mask.setPlaceholderCharacter('_');
        } catch (ParseException ex) {
        }
        return (new DefaultFormatterFactory(mask,mask));
    }
    /**
     * Formatação para o campo de Celular
     * @return 
     */
    public static DefaultFormatterFactory celular(){
        MaskFormatter mask = null;
        try {
            mask = new MaskFormatter("(##) 9####-####");
            mask.setPlaceholderCharacter('_');
        } catch (ParseException ex) {
        }
        return (new DefaultFormatterFactory(mask,mask));
    }
    /**
     * Formatação para o campo de Telefone
     * @return 
     */
    public static DefaultFormatterFactory telefone(){
        MaskFormatter mask = null;
        try {
            mask = new MaskFormatter("(##) ####-####");
            mask.setPlaceholderCharacter('_');
        } catch (ParseException ex) {
        }
        return (new DefaultFormatterFactory(mask,mask));
    }
    /**
     * Formatação para o campo de data de nascimento
     * @return 
     */
    public static DefaultFormatterFactory DtNascimento(){
        MaskFormatter mask = null;
        try {
            mask = new MaskFormatter("##/##/####");
            mask.setPlaceholderCharacter('_');
        } catch (ParseException ex) {
        }
        return (new DefaultFormatterFactory(mask,mask));
    }
    /**
     * Formatação para o campo de rg
     * @return 
     */
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
