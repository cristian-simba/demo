package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {
	public static void main(String[] args) {
		Producto producto1 = new Producto(201,"Finalin");
		
		producto1.setDescripcion("Pastilla para el dolor de cabeza");
		producto1.setPeso(0.59);
		
		System.out.println("Codigo: " +producto1.getCodigo());
		System.out.println("Nombre: "+producto1.getNombre());
		System.out.println("Descripcion: "+producto1.getDescripcion());
		System.out.println("Peso: "+producto1.getPeso());
	}
}
