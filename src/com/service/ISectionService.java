package com.service;

import java.util.List;

import com.dao.impl.SectionDao;
import com.model.Section;
import com.model.User;

public interface ISectionService {
	
	public int create(Section section);
	
	public int update(Section section);
	
	public List<User> findSectionUser(String sectionID);
	 
	public List<Section> findSections();
	
	public int remove(String sectionID);
}
