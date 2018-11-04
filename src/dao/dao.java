package dao;

import java.util.List;

public interface dao<T> {
/**
 * Grava no banco de dados, precisa do objeto a ser gravado
 * @param obj
 * @return 
 */
	public int create(T obj); // grava
/**
 * Le do banco de dados
 * @return 
 */
	public List<T> read(); // seleciona todos
/**
 * Atualiza certa row no banco de dados, atualiza por id e precisa do objeto a ser atualizado
 * @param id
 * @param obj
 * @return 
 */
	public int update(long id, T obj); // atualiza
/**
 * Deleta certa row do banco de dados, deleta por id
 * @param idDel
 * @return 
 */
	public int delete(long idDel); // exclui

	
	

}
