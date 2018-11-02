package dao;

import java.util.List;

public interface dao<T> {

	public int create(T obj); // grava

	public List<T> read(); // seleciona todos

	public int update(long id, T obj); // atualiza

	public int delete(long idDel, String cpfDel, String nomeDel); // exclui

	public T findOne(String codeFind); 
	

}
