package com.ram.demo.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ram.demo.dao.ContactInfoDao;
import com.ram.demo.model.ContactInfoModel;


@Service
public class ContactInfoServiceImpl implements ContactInfoService {

	@Autowired
	private ContactInfoDao dao;
	
	public void readContactInfo(String fileName) throws Exception {
		System.out.println("ContactInfoServiceImpl.readContactInfo()");
		FileReader fr = new FileReader(fileName);
		BufferedReader bufferReader = new BufferedReader(fr);
		String readLine = bufferReader.readLine();
		List<ContactInfoModel> list=new ArrayList<>();
		ContactInfoModel contact=null;
		while(readLine!=null) {
			String[] arr = readLine.split(",");
			contact=new ContactInfoModel(Integer.parseInt(arr[0]),arr[1],arr[2]);
			list.add(contact);
			System.out.println(contact);
			readLine=bufferReader.readLine();
		}
		boolean data = dao.storeData(list);
		if(data==true) {
			System.out.println("Record is stored");
		}else {
			System.out.println("Record is not stored");
		}
	}
	
}
