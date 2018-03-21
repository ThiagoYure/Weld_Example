/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.weld_example;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ThigoYure
 */
public class CadastroController implements Command {

    @Inject
    private Dao userDao;
    @Inject
    private Usuario user;

    public CadastroController() {
    }

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res) {
        String nome = req.getParameter("nome");
        String email = req.getParameter("email");
        String senha = req.getParameter("senha");
        String sexo = req.getParameter("sexo");
        String nascimento = req.getParameter("nascimento");
        String profissao = req.getParameter("profissao");
        user.setDataNascimento(nascimento);
        user.setEmail(email);
        user.setNome(nome);
        user.setProfissao(profissao);
        user.setSenha(senha);
        user.setSexo(sexo);
        System.out.println(user.getEmail());
        if (userDao.create(user)) {
            try {
                res.sendRedirect("index.jsp");
            } catch (IOException ex) {
                Logger.getLogger(CadastroController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                res.sendRedirect("index.jsp?msg=nao");
            } catch (IOException ex) {
                Logger.getLogger(CadastroController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
