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
        
        cd.read();
        Consultas.addRow(new Object[]{a,b,c,d,d2,e,e2});
        return Consultas;
    }
    
}
