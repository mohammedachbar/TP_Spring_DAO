package com.formation.service;

import java.util.ArrayList;
import java.util.Map;

import com.formation.dao.IAdherentDao;
import com.formation.modele.Adherent;

public class AdherentService implements IAdherentService{
	IAdherentDao dao;

	public IAdherentDao getDao() {
		return dao;
	}

	public void setDao(IAdherentDao dao) {
		this.dao = dao;
	}

	public int addAdherent(Adherent a) {
		return dao.addAdherent(a);
	}

	public Adherent getAdherentByCode(String codeAdherent) {
		return dao.getAdherentByCode(codeAdherent);
	}

	public int removeAdherent(String codeAdherent) {
		return dao.removeAdherent(codeAdherent);
	}

	public ArrayList<Map<String, Object>> getAllAdherent() {
		return dao.getAllAdherent();
	}

}
