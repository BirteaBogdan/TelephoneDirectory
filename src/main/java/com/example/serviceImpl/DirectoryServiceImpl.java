package com.example.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Directory;
import com.example.service.DirectoryService;

@Service
public class DirectoryServiceImpl implements DirectoryService {

	@Override
	public List<Directory> getNumbers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int saveNumbers(Directory number) {
		System.out.println("Hello from saveNumbers");
		int x = 5;
		return x;
	}

}
