package com.ufpa.movieticket.model;
// Generated 25/03/2017 21:20:43 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Cartaocred generated by hbm2java
 */
@Entity
@Table(name="cartaocred"
    ,catalog="bd_sistemaCinema"
)
public class Cartaocred  implements java.io.Serializable {


     private CartaocredId id;
     private Pessoa pessoa;
     private long numCartao;
     private int codSeguranca;
     private Set<Compra> compras = new HashSet<Compra>(0);

    public Cartaocred() {
    }

	
    public Cartaocred(CartaocredId id, Pessoa pessoa, long numCartao, int codSeguranca) {
        this.id = id;
        this.pessoa = pessoa;
        this.numCartao = numCartao;
        this.codSeguranca = codSeguranca;
    }
    public Cartaocred(CartaocredId id, Pessoa pessoa, long numCartao, int codSeguranca, Set<Compra> compras) {
       this.id = id;
       this.pessoa = pessoa;
       this.numCartao = numCartao;
       this.codSeguranca = codSeguranca;
       this.compras = compras;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="pkCartaocred", column=@Column(name="pk_cartaocred", nullable=false) ), 
        @AttributeOverride(name="fkPessoa", column=@Column(name="fk_pessoa", nullable=false) ) } )
    public CartaocredId getId() {
        return this.id;
    }
    
    public void setId(CartaocredId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_pessoa", nullable=false, insertable=false, updatable=false)
    public Pessoa getPessoa() {
        return this.pessoa;
    }
    
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    
    @Column(name="num_cartao", nullable=false)
    public long getNumCartao() {
        return this.numCartao;
    }
    
    public void setNumCartao(long numCartao) {
        this.numCartao = numCartao;
    }

    
    @Column(name="cod_seguranca", nullable=false)
    public int getCodSeguranca() {
        return this.codSeguranca;
    }
    
    public void setCodSeguranca(int codSeguranca) {
        this.codSeguranca = codSeguranca;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="cartaocred")
    public Set<Compra> getCompras() {
        return this.compras;
    }
    
    public void setCompras(Set<Compra> compras) {
        this.compras = compras;
    }




}

