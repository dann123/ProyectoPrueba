/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.prueba.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import pe.edu.upeu.prueba.config.Conexion;
import pe.edu.upeu.prueba.modelo.Distrito;

/**
 *
 * @author alum.fial7
 */
public class DistritoDAO {
    private final ArrayList<Distrito> lista= new ArrayList;
    Distrito d= new Distrito();
    public String sql;
    public Statement st;
    public Connection cx;
    public ResultSet rs;
    public ArrayList<Distrito>listarDisttrito(){
        
        sql = "SELECT * FROM distrito";
        try {
        cx=Conexion.getConexion();
        st=cx.createStatement();
        rs=st.executeQuery(sql);
        while (rs.next()){
        lista.add(Distrito.loadDistrito(rs));
        }
        }catch(SQLException e){
        
        
        
        
        }
        
        
        
        return lista;
    }
    
}
