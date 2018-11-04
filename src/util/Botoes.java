/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author lucas
 */


public class Botoes {
 /**
 * Configura a borda do botão ao entrar em foco com o mouse
 * @author lucas
 */
    public void botabotao (javax.swing.JLabel lbl){
        lbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }
    /**
     * Configura a borda do botão quando ele perde o foco do mouse
     * @param lbl 
     */
    public void tirabotao (javax.swing.JLabel lbl){
        lbl.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    }
}
