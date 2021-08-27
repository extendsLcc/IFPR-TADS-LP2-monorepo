
-- -----------------------------------------------------
-- Schema dbVeiculo
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema dbVeiculo
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `dbVeiculo` DEFAULT CHARACTER SET utf8 ;
USE `dbVeiculo` ;

-- -----------------------------------------------------
-- Table `dbVeiculo`.`Categoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbVeiculo`.`Categoria` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `idCategoria_UNIQUE` (`id` ASC) );



-- -----------------------------------------------------
-- Table `dbVeiculo`.`Proprietario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbVeiculo`.`Proprietario` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(50) NOT NULL,
  `endereco` VARCHAR(100) NOT NULL,
  `bairro` VARCHAR(50) NOT NULL,
  `cpf` VARCHAR(50) NOT NULL,
  `telefone` VARCHAR(50) NOT NULL,
  `rg` VARCHAR(50) NOT NULL,
  `nascimento` DATE NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) )
;


-- -----------------------------------------------------
-- Table `dbVeiculo`.`Estado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbVeiculo`.`Estado` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(50) NOT NULL,
  `sigla` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) )
;


-- -----------------------------------------------------
-- Table `dbVeiculo`.`Municipio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbVeiculo`.`Municipio` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(150) NOT NULL,
  `Estado_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) ,
  INDEX `fk_Municipio_Estado1_idx` (`Estado_id` ASC) ,
  CONSTRAINT `fk_Municipio_Estado1`
    FOREIGN KEY (`Estado_id`)
    REFERENCES `dbVeiculo`.`Estado` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
;


-- -----------------------------------------------------
-- Table `dbVeiculo`.`Marca`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbVeiculo`.`Marca` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) )
;


-- -----------------------------------------------------
-- Table `dbVeiculo`.`Veiculo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbVeiculo`.`Veiculo` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `placa` VARCHAR(10) NOT NULL,
  `ano` DATE NOT NULL,
  `Proprietario_id` INT NOT NULL,
  `Municipio_id` INT NOT NULL,
  `Categoria_id` INT NOT NULL,
  `Marca_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `idVeiculo_UNIQUE` (`id` ASC) ,
  INDEX `fk_Veiculo_Proprietario_idx` (`Proprietario_id` ASC) ,
  INDEX `fk_Veiculo_Municipio1_idx` (`Municipio_id` ASC) ,
  INDEX `fk_Veiculo_Categoria1_idx` (`Categoria_id` ASC) ,
  INDEX `fk_Veiculo_Marca1_idx` (`Marca_id` ASC) ,
  CONSTRAINT `fk_Veiculo_Proprietario`
    FOREIGN KEY (`Proprietario_id`)
    REFERENCES `dbVeiculo`.`Proprietario` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Veiculo_Municipio1`
    FOREIGN KEY (`Municipio_id`)
    REFERENCES `dbVeiculo`.`Municipio` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Veiculo_Categoria1`
    FOREIGN KEY (`Categoria_id`)
    REFERENCES `dbVeiculo`.`Categoria` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Veiculo_Marca1`
    FOREIGN KEY (`Marca_id`)
    REFERENCES `dbVeiculo`.`Marca` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
