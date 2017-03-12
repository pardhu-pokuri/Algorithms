package practice.jdbc.constants;

public interface QueryConstants {
	
	String INSERT_QUERY = "INSERT INTO `inventory`.`users` (`id`,`name`) VALUES (3,'uglyFatGirl')";
	String UPDATE_QUERY = "UPDATE `inventory`.`users` SET `name` = 'Hanvitha' WHERE `id` = 3";
	String DELETE_QUERY = "DELETE FROM `inventory`.`users` WHERE `id` = 3";
}
