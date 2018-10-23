package dao;

import java.util.List;

public interface dao<T> {

	public void create(T obj); // grava

	public List<T> read(); // seleciona todos

	public void update(long id, T obj); // atualiza

	public void delete(long id); // exclui

	public T findById(long id); // retorna somente 1

}
