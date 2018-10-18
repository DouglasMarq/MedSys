/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;

/**
 *
 * @author gabri
 */
public interface dao<T> {

	public void create(T obj); // grava

	public List<T> read(); // seleciona todos

	public void update(T obj); // atualiza

	public void delete(T obj); // exclui

	public T findById(long id); // retorna somente 1

}
