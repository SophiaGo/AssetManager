package com.dao;


import java.util.List;

import com.model.Section;
import com.model.User;

public interface ISectionDao {

	public void create(Section section);
	
	public void update(Section section);
	
	public void remove(Section section);
	
	public List<User> findSectionUsers(String sectionID);
	
	public List<Section> findSections();
	
}
