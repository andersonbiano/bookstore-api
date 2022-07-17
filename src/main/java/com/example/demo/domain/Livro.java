package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Livro {
	private Integer id;
	private String titulo;
	private String nome_autor;
	private String texto;
	
	private Categoria categoria;

	
}
