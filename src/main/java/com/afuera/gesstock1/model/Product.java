package com.afuera.gesstock1.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productos")
@Access(AccessType.FIELD)
public class Product implements Serializable{

	private static final long serialVersionUID = 9188255651608086339L;

	@Id
	//TODO generar ID automáticamente de manera incremental
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id_producto", unique = true, nullable = false)
	private int idProducto;
	
	@Column(name = "ref_producto", nullable=false, length=255)
	private String refProducto;
	
	@Column(name = "nombre_producto", nullable=false, length=255)
	private String nombreProducto;
	
	@Column(name = "desc_producto", nullable=true, length=255)
	private String descProducto;
	
	@Column(name = "id_img_ppal",   nullable=true)
	private int idImgPpal;
	
	@Column(name = "stock", nullable = true)
	private double stock;
	
	

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getRefProducto() {
		return refProducto;
	}

	public void setRefProducto(String refProducto) {
		this.refProducto = refProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getDescProducto() {
		return descProducto;
	}

	public void setDescProducto(String descProducto) {
		this.descProducto = descProducto;
	}

	public int getIdImgPpal() {
		return idImgPpal;
	}

	public void setIdImgPpal(int idImgPpal) {
		this.idImgPpal = idImgPpal;
	}

	public double getStock() {
		return stock;
	}

	public void setStock(double stock) {
		this.stock = stock;
	}
	
	
	

}
