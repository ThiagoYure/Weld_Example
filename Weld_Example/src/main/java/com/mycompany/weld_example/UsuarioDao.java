/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.weld_example;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author ThigoYure
 */
@Named
class UsuarioDao implements Dao{
    @Inject Connection con;

    public UsuarioDao() {
    }

    
    @Override
    public boolean create(Usuario user) {
        try {
            int retorno;
            PreparedStatement st = con.prepareStatement("INSERT INTO usuario (nome,email,senha,sexo,profissao,datanascimento"
                    + ") VALUES(?,?,?,?,?,?)");
            st.setString(1, user.getNome());
            st.setString(2, user.getEmail());
            st.setString(3, user.getSenha());
            st.setString(4, user.getSexo());
            st.setString(5, user.getProfissao());
            st.setString(6, user.getDataNascimento());
            retorno = st.executeUpdate();
            st.close();
            return retorno > 0;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    @Override
    public Usuario read(String email) {

        try {
            Usuario user = new Usuario();
            PreparedStatement st = con.prepareStatement("SELECT * FROM usuario WHERE email=?");
            st.setString(1, email);
            ResultSet r = st.executeQuery();
            if (r.next()) {
                user.setNome(r.getString("nome"));
                user.setEmail(r.getString("email"));
                user.setSexo(r.getString("sexo"));
                user.setSenha(r.getString("senha"));
                user.setProfissao(r.getString("profissao"));
                user.setDataNascimento(r.getString("datanascimento"));
                st.close();
                con.close();
                return user;
            }
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
