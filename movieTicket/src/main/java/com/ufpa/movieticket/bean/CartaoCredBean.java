/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufpa.movieticket.bean;

import com.ufpa.movieticket.model.Cartaocred;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author thiberius
 */
@ManagedBean(name = "cartaoCredBean")
@ViewScoped
public class CartaoCredBean extends AbstractBean {

    private Cartaocred cartaoCred;

    public void updateCartaoCred() {
        getDaoGenerico().update(cartaoCred);
    }

}
