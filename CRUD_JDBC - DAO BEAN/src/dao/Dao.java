/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

/**
 *
 * @author aluno
 */
public interface Dao<PK,T> {
    
    public void create( T entity );
    public T retrive( PK primaryKey );
    public void update( T entity );
    public void delete( PK primaryKey );
    public List<T> retriveAll();
    
}
