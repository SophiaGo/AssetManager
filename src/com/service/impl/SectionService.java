package com.service.impl;

import java.util.List;

import com.dao.impl.SectionDao;
import com.model.Section;
import com.model.User;
import com.service.ISectionService;

public class SectionService implements ISectionService{
	private SectionDao sectionDao;
	
	@Override
	public int create(Section section) {
		try {
			sectionDao.create(section);
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
			return 1;
		}
	}

	@Override
	public int update(Section section) {
		try {
			sectionDao.update(section);
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
			return 1;
		}		
	}

	@Override
	public List<User> findSectionUser(String sectionID) {
		try {
			return sectionDao.findSectionUsers(sectionID);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	public void setSectionDao(SectionDao sectionDao) {
		this.sectionDao = sectionDao;
	}

	@Override
	public List<Section> findSections() {
		
		return sectionDao.findSections();
	}

	@Override
	public int remove(String sectionID) {
		try {
			Section section = new Section();
			section.setId(Integer.parseInt(sectionID));
			if(section.getId()<=0)
				return 1;
			sectionDao.remove(section);
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 2;
	}

}
