package com.afuera.gesstock1.service;

import java.util.List;

import com.afuera.gesstock1.model.Product;


public interface ProductService {

	Product save(Product product);

	/*
	 * Recupera la lista de usuarios
	 * @return lista de usuarios
	 */
	List<Product> findAll();
	
	void deleteProduct(Integer id);

}
