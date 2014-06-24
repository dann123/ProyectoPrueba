/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.prueba.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author alum.fial7
 */
public class Iglesia {
      private int idigle;
private int idr;
private String iglesia;
private String cuenta;

    public Iglesia() {
    }

    public Iglesia(int idr, String iglesia, String cuenta) {
        this.idr = idr;
        this.iglesia = iglesia;
        this.cuenta = cuenta;
    }

    public int getIdigle() {
        return idigle;
    }

    public void setIdigle(int idigle) {
        this.idigle = idigle;
    }

    public int getIdr() {
        return idr;
    }

    public void setIdr(int idr) {
        this.idr = idr;
    }

    public String getIglesia() {
        return iglesia;
    }

    public void setIglesia(String iglesia) {
        this.iglesia = iglesia;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

  public static Iglesia loadIglesia (ResultSet rs) throws SQLException{
Iglesia i= new Iglesia ();
i.setIdigle(rs.getInt ("id"));
i.setIdr(rs.getInt ("idregion"));
i.setIglesia(rs.getString ("distrtio"));
i.setCuenta(rs.getString ("cuenta"));
    return i;
}  
}
