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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diorgenes
 */
public class Usuario {    
    private String nick;
    private String email;
    private String senha;
    private String nome;
    private Integer vitorias;
    private String avatar;
    private String pais;
    private String sexo;
    private int nascDia;
    private int nascMes;
    private int nascAno;
    private String status;
    
    public Usuario()
    {
        /*
            Tomar no cú
        */
    }
    
    public Usuario(String nick, String email, String senha, String nome, int nascDia, int nascMes, int nascAno) {
        this.nick = nick;
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.nascDia = nascDia;
        this.nascMes = nascMes;
        this.nascAno = nascAno;
    }
    
    /*######################################## Database ######################################*/
        
    public ArrayList<Usuario> SelectRanking()
    {
        
        Connection c = null;
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        try {
            c = Conector.getConexao();
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sql = "";
        ResultSet rs;
        
        sql = "SELECT * FROM Usuario ORDER BY vitorias DESC LIMIT 10";
        
        try {
            PreparedStatement Query1 = c.prepareStatement(sql);
            rs = Query1.executeQuery();
            
            while(rs.next())
            {
                Usuario u = new Usuario();
                u.setNick(rs.getString("nick"));
                u.setEmail(rs.getString("email"));
                u.setNome(rs.getString("nome"));
                u.setSenha(rs.getString("senha"));
                u.setVitorias(rs.getInt("vitorias"));
                u.setAvatar(rs.getString("avatar"));
                u.setPais(rs.getString("pais"));
                u.setSexo(rs.getString("sexo"));
                u.setNascDia(rs.getInt("nasc_dia"));
                u.setNascMes(rs.getInt("nasc_mes"));
                u.setNascAno(rs.getInt("nasc_ano"));
                u.setStatus(rs.getString("status"));
                usuarios.add(u);
            }

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return usuarios;
    }
        
    public int getDerrotas()
    {
        Connection c = null;
        int derrotas = 0;
        try {
            c = Conector.getConexao();
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sql = "";
        ResultSet rs;
        
        sql = "SELECT COUNT(*) AS derrotas FROM historico WHERE perdedor = ?";
        try {
            PreparedStatement Query1 = c.prepareStatement(sql);
            Query1.setString(1, this.nick);
            rs = Query1.executeQuery();
            while(rs.next())
            {
                derrotas = rs.getInt("derrotas");
            }

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return -1;
        }
        return derrotas;
    }
    
        
    public boolean SelectById()
    {
        Connection c = null;
        try {
            c = Conector.getConexao();
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sql = "";
        ResultSet rs;
        
        sql = "SELECT * FROM Usuario WHERE nick = ?";
        try {
            PreparedStatement Query1 = c.prepareStatement(sql);
            Query1.setString(1, this.nick);
            rs = Query1.executeQuery();
            
            while(rs.next())
            {
                this.nick = rs.getString("nick");
                this.email = rs.getString("email");
                this.nome = rs.getString("nome");
                this.senha = rs.getString("senha");
                this.vitorias = rs.getInt("vitorias");
                this.avatar = rs.getString("avatar");
                this.pais = rs.getString("pais");
                this.sexo = rs.getString("sexo");
                this.nascDia = rs.getInt("nasc_dia");
                this.nascMes = rs.getInt("nasc_mes");
                this.nascAno = rs.getInt("nasc_ano");
                this.status = rs.getString("status"); 
            }

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
    
    public static boolean Existe(String nickname)
    {
        if(nickname.equals("") || nickname.equals(null)) return false;
        Connection c = null;
        try {
            c = Conector.getConexao();
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sql = "";
        ResultSet rs;
        
        sql = "SELECT * FROM Usuario WHERE nick = ?";
        try {
            PreparedStatement Query1 = c.prepareStatement(sql);
            Query1.setString(1, nickname);
            rs = Query1.executeQuery();
            
            if(rs.next()) return true;
            else return false;

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean Salvar() {
        Connection c = null;
        try {
            c = Conector.getConexao();
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sql = "";

        sql = "INSERT INTO Usuario (nick,email,senha,nome,nasc_dia,nasc_mes,nasc_ano) values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement Query1 = c.prepareStatement(sql);
            Query1.setString(1, this.nick);
            Query1.setString(2, this.email);
            Query1.setString(3, this.senha);
            Query1.setString(4, this.nome);
            Query1.setInt(5, this.nascDia);
            Query1.setInt(6, this.nascMes);
            Query1.setInt(7, this.nascAno);
            Query1.execute();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
    
    /*######################################## Getter e Setter ######################################*/
    
    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVitorias() {
        return vitorias;
    }

    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getNascDia() {
        return nascDia;
    }

    public void setNascDia(int nascDia) {
        this.nascDia = nascDia;
    }

    public int getNascMes() {
        return nascMes;
    }

    public void setNascMes(int nascMes) {
        this.nascMes = nascMes;
    }

    public int getNascAno() {
        return nascAno;
    }

    public void setNascAno(int nascAno) {
        this.nascAno = nascAno;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}
