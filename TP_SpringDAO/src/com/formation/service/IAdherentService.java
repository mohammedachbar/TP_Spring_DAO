package com.formation.service;
import java.util.ArrayList;
import java.util.Map;
import com.formation.modele.Adherent;
public interface IAdherentService {
	public int addAdherent(Adherent a);
	public Adherent getAdherentByCode(String codeAdherent);
	public int removeAdherent(String codeAdherent);
	public ArrayList<Map<String,Object>> getAllAdherent();
	}
