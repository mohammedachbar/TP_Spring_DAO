package com.formation.dao;
import java.util.ArrayList;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import com.formation.modele.Adherent;
	
public class AdherentDao implements IAdherentDao{
		private JdbcTemplate jdbcTemplate;
		private DataSource dataSource;
		
		public DataSource getDataSource() {
				return dataSource;
		}
		
		public void setDataSource(DataSource dataSource) {
				this.jdbcTemplate = new JdbcTemplate(dataSource);
		}

		public int addAdherent(Adherent a) {
			String req="Insert into adherent values('"+a.getCodeAdherent()+"',"+
			"'"+a.getNom()+"','"+a.getPrenom()+"','"+a.getAdresse()+"')";
			return jdbcTemplate.update(req);
		}
			
		public Adherent getAdherentByCode(String codeAdherent) {
			String req="select * from adherent where code='"+codeAdherent+"'";
			Adherent a1=null;
			ArrayList<Map<String,Object>> l1=(ArrayList<Map<String,Object>>)jdbcTemplate.queryForList(req);
			if(l1.size()!=0){
				for(Map<String, Object> o:l1){
						a1=new Adherent();
						a1.setCodeAdherent((String)o.get("code"));
						a1.setNom((String)o.get("nom"));
						a1.setPrenom((String)o.get("prenom"));
						a1.setAdresse((String)o.get("adresse"));
				}
			}
			return a1;
		}
		
			
		public int removeAdherent(String codeAdherent) {
			String req="delete from adherent where code='"+codeAdherent+"'";
			return jdbcTemplate.update(req);
			}
		
		public ArrayList<Map<String,Object>> getAllAdherent() {
			String req="select * from adherent";
			ArrayList<Map<String,Object>> l1= (ArrayList<Map<String,Object>>)
			jdbcTemplate.queryForList(req);
			return l1;
		}
		
}