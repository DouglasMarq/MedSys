/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

/**
 *
 * @author gabri
 */
public interface dao<T> {

	public void create(T obj); // grava

	public List<T> read(); // seleciona todos

	public void update(long id, T obj); // atualiza

	public void delete(long idDel, String cpfDel, String nomeDel); // exclui

	public T findOne(long idFind, String cpfFind, String nomeFind); 
	
	public T findById(long id); // retorna somente 1

}
