package com.ram.demo.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ram.demo.model.ContactInfoModel;

@Repository
public class ContactInfoDaoImpl implements ContactInfoDao {

	public static final String INSERT_CONTACT = "INSERT INTO CONTACT_INFO VALUES(?,?,?)";

	@Autowired
	private JdbcTemplate jt;
	
	
	@Override
	public boolean storeData(List<ContactInfoModel> list) {
		System.out.println("ContactInfoDaoImpl.storeData()");
		int[] arr = jt.batchUpdate(INSERT_CONTACT, new BatchPreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				ps.setInt(1, list.get(i).getContactId());
				ps.setString(2, list.get(i).getName());
				ps.setString(3, list.get(i).getCourse());
			}
			@Override
			public int getBatchSize() {
				return list.size();
			}
		});
		return arr.length>0;
	}
}
