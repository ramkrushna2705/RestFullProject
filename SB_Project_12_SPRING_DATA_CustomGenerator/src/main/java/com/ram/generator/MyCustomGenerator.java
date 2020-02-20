package com.ram.generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class MyCustomGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		final String SEQUENCE_QUERY = "SELECT CONTACT_ID_SEQ.NEXTVAL FROM DUAL";
		String prefix = "TCS-RAM-";
		int sufix = 0;
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			connection = session.connection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(SEQUENCE_QUERY);
			if (resultSet.next()) {
				sufix = resultSet.getInt(1);
			}
		} catch (Exception se) {
			se.printStackTrace();
		}
		return prefix + String.valueOf(sufix);
	}

}
