/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import Model.Conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diorgenes
 */
public class CV_Sala {
    private int idcv_sala;
    private String data;
    private int idsala;
    private String nick;
    private String texto;

    public boolean Salvar() {
        Connection c = null;
        try {
            c = Conector.getConexao();
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sql = "";

        sql = "INSERT INTO cv_sala (data,idsala,nick,texto) values (?,?,?,?)";
        try {
            PreparedStatement Query1 = c.prepareStatement(sql);
            Query1.setString(1, this.data);
            Query1.setInt(2, this.idsala);
            Query1.setString(3, this.nick);
            Query1.setString(4, this.texto);
            Query1.execute();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
    
    public String getAllCv()
    {
        Connection c = null;
        String CV = "";
        try {
            c = Conector.getConexao();
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sql = "";
        ResultSet rs;
        
        sql = "SELECT * FROM cv_sala";
        try {
            PreparedStatement Query1 = c.prepareStatement(sql);
            Query1.setString(1, this.nick);
            rs = Query1.executeQuery();
            
            while(rs.next())
            {
                CV+=rs.getString("nick")+"("+rs.getString("data")+"):"+rs.getString("texto");
            }

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return CV;
    }
    
    public int getIdcv_sala() {
        return idcv_sala;
    }

    public void setIdcv_sala(int idcv_sala) {
        this.idcv_sala = idcv_sala;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getIdsala() {
        return idsala;
    }

    public void setIdsala(int idsala) {
        this.idsala = idsala;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    
    
}
