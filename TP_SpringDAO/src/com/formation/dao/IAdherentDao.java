package com.formation.dao;
import java.util.ArrayList;
import java.util.Map;
import com.formation.modele.Adherent;

public interface IAdherentDao {
public int addAdherent(Adherent a);
public Adherent getAdherentByCode(String codeAdherent);
public int removeAdherent(String codeAdherent);
public ArrayList<Map<String,Object>> getAllAdherent();
}