/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.weld_example;

import javax.enterprise.inject.Produces;

/**
 *
 * @author ThigoYure
 */
public class FactoryDao {
    @Produces
    public Dao createUsuarioDao(){
        return new UsuarioDao();
    }
}
