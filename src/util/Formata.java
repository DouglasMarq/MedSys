/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.text.ParseException;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Aluno
 */
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
            mask = new MaskFormatter("(##) # ####-####");
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
}
