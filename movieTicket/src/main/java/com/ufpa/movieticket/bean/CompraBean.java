/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufpa.movieticket.bean;

import com.ufpa.movieticket.model.Compra;
import com.ufpa.movieticket.model.CompraId;
import com.ufpa.movieticket.model.Exibicao;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author thiberius
 */
@ManagedBean(name = "compraBean")
@ViewScoped
public class CompraBean extends AbstractBean {

    private Compra compra;
    private int pkExibicao;
    private double valorExibicao;
    private double valorTotal = 0;

    public void cadastrarCompra() {
        try {
            CompraId compraId = new CompraId();
            compraId.setCartaocredFkPessoa(0);
            compraId.setFkCartaocred(0);
            compraId.setFkExibicao(pkExibicao);
            compra.setId(compraId);
            compra.setDataCompra(getObjData());
            getDaoGenerico().save(compra);
            
            getObjMessage().info("Compra realizada!", "Compra realizada com sucesso");
        } catch (Exception e) {
            getObjMessage().warn("Compra não realizada!", "A compra não foi realizada");
        }

    }

    public Compra getCompra() {
        if (compra == null) {
            compra = new Compra();
        }
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public void exibicaoEscolhida(Exibicao exibicao) {
        pkExibicao = exibicao.getPkExibicao();
        valorExibicao = exibicao.getValorExibcao();
    }

    public double getValorTotal() {
        valorTotal = valorExibicao * compra.getQtdIngresso();

        return valorTotal;
    }

}
