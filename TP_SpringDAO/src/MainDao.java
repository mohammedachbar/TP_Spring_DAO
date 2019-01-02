import java.util.Map;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.formation.modele.Adherent;
import com.formation.service.AdherentService;


public class MainDao {
	
	public static ClassPathResource cpr= new ClassPathResource("applicationContext.xml");		
	public static ListableBeanFactory bf= new XmlBeanFactory(cpr);
	public static AdherentService as = (AdherentService) bf.getBean("gestionAdherent");
	
	public static void main(String[] args) {
		test1_addAdherents();
		//test2_printAllAdherents()
		//test3_findAdherentByCode("c300");
		//test4_removeAdherentByCode("c300");
	}

	public static void test1_addAdherents(){	
		as.addAdherent(new Adherent("C100","mohammed","ali","rabat"));
		as.addAdherent(new Adherent("C200","Hari","Badr ","Casablanca"));
		as.addAdherent(new Adherent("C300","EL Inaoui","Youness","Rabat"));
	}
	
	public static void test2_printAllAdherents(){		
		for(int i=0;i<as.getAllAdherent().size();i++){
			System.out.println(as.getAllAdherent().get(i));
		}		
	}
	
	public static void test3_findAdherentByCode(String code){			
		System.out.println(as.getAdherentByCode(code));		
	}
	
	public static void test4_removeAdherentByCode(String code){
		as.removeAdherent(code);
	}
	
	
	
}
