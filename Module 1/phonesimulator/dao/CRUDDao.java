package com.cap.phonesimulator.dao;

import java.util.List;

import com.cap.phonesimulator.dto.Contact;

public interface CRUDDao {

	public List<Contact> viewAllContacts();

	public	Contact viewContact(String name); 

	public boolean insertContact(Contact con);

	public boolean deleteContact(String name);

	public boolean updateContact(String name,String number);

}
