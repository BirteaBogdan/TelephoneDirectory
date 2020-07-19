package com.example.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.model.ContactGroup;
import com.example.repository.ContactGroupRepository;
import com.example.service.ContactGroupService;

public class ContactGroupImpl implements ContactGroupService{
	
	@Autowired
	ContactGroupRepository contactGroupRepository;
	
	@Override
	public List<ContactGroup> getContactGroupList() {
		return contactGroupRepository.findAll();
	}

}
