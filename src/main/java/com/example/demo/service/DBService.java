package com.example.demo.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Categoria;
import com.example.demo.domain.Livro;
import com.example.demo.repositories.CategoriaRepository;
import com.example.demo.repositories.LivroRepository;

@Service
public class DBService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;
	
	public void instanciaBaseDeDados() {
		Categoria cat1 = new Categoria(null,"Informática","Livros de TI");
		Categoria cat2 = new Categoria(null,"Literatura","Livros literários");
		
		Livro l1 = new Livro(null,"Clean Code", "Baiano Moral","Bla Bla",cat1);
		Livro l2 = new Livro(null,"Código Sujo","Fransico","Babouseira",cat1);
		Livro l3 = new Livro(null,"Comadre Florzinha","Josefa","Babouseira",cat2);
		Livro l4 = new Livro(null,"Irineu","Baiano","Nada demais",cat2);
		
		cat1.getLivros().addAll(Arrays.asList(l1,l2));
		cat2.getLivros().addAll(Arrays.asList(l3,l4));
		
		this.categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
		
		this.livroRepository.saveAll(Arrays.asList(l1,l2,l3,l4));
	}

}
