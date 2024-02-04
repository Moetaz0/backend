package soa.dao;



import soa.entities.cause;
import soa.entities.incident;
import soa.entities.ouvrage;
import soa.entities.poste;

import java.util.Date;
import java.util.List;


public interface IincidentDao
{
	public cause saveCause(cause r);
	public List<cause> findAllCause();
	public cause findOneCause(int Code_Cause);
	public cause updateCause(cause r);
	public void deleteCause(Long id);
	///////////////////////////////
	public ouvrage saveOuvrage(ouvrage r);
	public List<ouvrage> findAllOuvrage();
	public ouvrage findOneOvrage(String Nom_Ouvrage);
	public ouvrage updateOuvrage(ouvrage r);
	public void deleteOuvrage(String Nom_Ouvrage);

	//////////////////////////

	public incident saveIncident(incident r);
	public List<incident> findAllIncident();
	public incident findOneIncident(int Num_Incident);
	public incident updateIncident(incident r);
	public void deleteIncident(int Num_Incident);

	//////////////////////////

	public poste savePoste(poste r);
	public List<poste> findAllPoste();
	public poste findOnePoste(String Nom_Poste);
	public poste updatePoste(poste r);
	public void deletePoste(String Nom_Poste);



}
