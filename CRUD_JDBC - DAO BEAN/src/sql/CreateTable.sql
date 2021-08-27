/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  aluno
 * Created: 02/10/2019
 */



CREATE TABLE contato (
    id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(40) NOT NULL,
    idade INT,
    dataCadastro DATE
    PRIMARY KEY( id )
);