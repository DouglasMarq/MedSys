package dao;

import java.util.List;

public interface dao<T> {

	public void create(T obj); // grava

	public List<T> read(); // seleciona todos

	public void update(long id, T obj); // atualiza

	public void delete(long idDel, String cpfDel, String nomeDel); // exclui

	public T findOne(long idFind, String cpfFind, String nomeFind); 
	

}
