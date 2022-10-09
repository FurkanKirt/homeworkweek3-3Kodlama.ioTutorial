package dataAccess;

import entities.Instructor;

public class JdbcIntructorDao implements IntructorDao{

	@Override
	public void add(Instructor intructor) {
		System.out.println("JDBC ile veri tabanýna eklendi" + intructor.getName());
		
	}

}
