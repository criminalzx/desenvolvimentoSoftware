package com.desenvolvimento.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "vendas")
public class Venda implements Serializable{
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codVenda;
	
   @Column(length = 80, nullable = false)
   private double numeroVenda;
     
   @Temporal(TemporalType.DATE)
   @Column(name = "data_venda")
   @JsonFormat(pattern = "dd/MM/yyyy")
   private Date dataVenda;

   @ManyToOne
   @JoinColumn(name = "cliente_codigo")
   private Cliente cliente;
   
   // get/set
   
public Integer getCodVenda() {
	return codVenda;
}

public void setCodVenda(Integer codVenda) {
	this.codVenda = codVenda;
}

public double getQuantVenda() {
	return numeroVenda;
}

public void setQuantVenda(double numeroVenda) {
	this.numeroVenda = numeroVenda;
}

public Date getDataVenda() {
	return dataVenda;
}

public void setDataVenda(Date dataVenda) {
	this.dataVenda = dataVenda;
}

public Cliente getCliente() {
	return cliente;
}

public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}
   
  
   
   
}
