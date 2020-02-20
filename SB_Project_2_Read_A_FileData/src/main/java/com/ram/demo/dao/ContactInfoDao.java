package com.ram.demo.dao;

import java.util.List;

import com.ram.demo.model.ContactInfoModel;

public interface ContactInfoDao {

	boolean storeData(List<ContactInfoModel> list);

}
