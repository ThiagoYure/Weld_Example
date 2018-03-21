/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.weld_example;

/**
 *
 * @author ThigoYure
 */
public interface Dao {
    boolean create(Usuario user);
    Usuario read(String email);
}
