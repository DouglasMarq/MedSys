package Model;

import dao.ConsultaDao;
import javax.swing.table.DefaultTableModel;

public class Consulta {
    
    private String a;
    private String b;
    private String c;
    private String d;
    private String d2;
    private String e;
    private String e2;
    
    public DefaultTableModel TableConsulta(){
        DefaultTableModel Consultas = new DefaultTableModel(new String[]{"Codigo da Consulta","Status","Data da Consulta","Paciente","Sobrenome","Medico","Sobrenome"}, 0);

        ConsultaDao cd = new ConsultaDao();

        for (Consulta ca : cd.read()) {
            Consultas.addRow(new String[]{ca.getA(),ca.getB(),ca.getC(), ca.getD(),ca.getD2(),ca.getE(),ca.getE2()});
        }
        return Consultas;
    }
    
        /*public static boolean validarlogin(String username, String password){
        login l = new login(username, password);
        l.validar_login(username, password);
        if(l.validar_login(username,password)){
            return true;
        } else {
            return false;
        }
    }*/

    public Consulta(String a, String b, String c, String d, String d2, String e, String e2) {
        setA(a);
        setB(b);
        setC(c);
        setD(d);
        setD2(d2);
        setE(e);
        setE2(e2);
    }
   
    /**
     * @return the a
     */
    public String getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(String a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public String getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(String b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public String getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(String c) {
        this.c = c;
    }

    /**
     * @return the d
     */
    public String getD() {
        return d;
    }

    /**
     * @param d the d to set
     */
    public void setD(String d) {
        this.d = d;
    }

    /**
     * @return the d2
     */
    public String getD2() {
        return d2;
    }

    /**
     * @param d2 the d2 to set
     */
    public void setD2(String d2) {
        this.d2 = d2;
    }

    /**
     * @return the e
     */
    public String getE() {
        return e;
    }

    /**
     * @param e the e to set
     */
    public void setE(String e) {
        this.e = e;
    }

    /**
     * @return the e2
     */
    public String getE2() {
        return e2;
    }

    /**
     * @param e2 the e2 to set
     */
    public void setE2(String e2) {
        this.e2 = e2;
    }
    
    
}
