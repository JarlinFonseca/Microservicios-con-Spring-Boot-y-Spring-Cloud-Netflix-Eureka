package com.formacionbdi.springboot.app.item.models.service;

import java.util.List;

import com.formacionbdi.springboot.app.item.models.Item;
import com.formacionbdi.springboot.app.item.models.Producto;

public interface ItemService {
	public List<Item> findAll();
	public Item findById(Long id, Integer cantidad);
	public Producto crear(Producto producto);
	public Producto update(Producto producto, Long id);
	public void eliminar(Long id);

}
