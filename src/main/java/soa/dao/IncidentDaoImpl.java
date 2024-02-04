package soa.dao;
import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import soa.entities.cause;
import soa.entities.incident;
import soa.entities.ouvrage;
import soa.entities.poste;

@Repository
@Transactional
public class IncidentDaoImpl implements IincidentDao{

	@PersistenceContext
	private EntityManager em;
	public IncidentDaoImpl(EntityManager entityManager) {
		this.em = entityManager;
	}
	public cause saveCause(cause r) {
		em.persist(r);
		return r;
	}
	public List<cause> findAllCause() {
		Query query= em.createQuery("select r from cause r order by r.code_cause");
		return query.getResultList();
	}

	public cause findOneCause(int Code_Cause) {
		cause r = em.find(cause.class, Code_Cause);
		return r;
	}

	public cause updateCause(cause r) {
		em.merge(r);
		return r;
	}

	public void deleteCause(Long id) {
		cause r = em.find(cause.class, id);
		em.remove(r);
		
	}
	//////////////////////////////////////////////////////////
	public poste savePoste(poste r) {
		em.persist(r);
		return r;
	}
	public List<poste> findAllPoste() {
		Query query=
				em.createQuery("select r from poste r order by r.Nom_Poste");
		return query.getResultList();
	}

	public poste findOnePoste(String Nom_Poste ) {
		poste r = em.find(poste.class, Nom_Poste);
		return r;
	}

	public poste updatePoste(poste r) {
		em.merge(r);
		return r;
	}

	public void deletePoste(String Nom_Poste) {
		poste r = em.find(poste.class, Nom_Poste);
		em.remove(r);

	}
	//////////////////////////////////////////////////////////
	public ouvrage saveOuvrage(ouvrage r) {
		em.persist(r);
		return r;
	}
	public List<ouvrage> findAllOuvrage() {
		Query query=
				em.createQuery("select r from ouvrage r order by r.Nom_Ouvrage");
		return query.getResultList();
	}

	public ouvrage findOneOvrage(String Nom_Ouvrage) {
		ouvrage r = em.find(ouvrage.class, Nom_Ouvrage);
		return r;
	}

	public ouvrage updateOuvrage(ouvrage r) {
		em.merge(r);
		return r;
	}

	public void deleteOuvrage(String Nom_Ouvrage) {
		ouvrage r = em.find(ouvrage.class, Nom_Ouvrage);
		em.remove(r);

	}
	//////////////////////////////////////////////////////////
	public incident saveIncident(incident r) {
		em.persist(r);
		return r;
	}
	public List<incident> findAllIncident() {
		Query query=
				em.createQuery("select r from incident r order by r.Num_Incident");
		return query.getResultList();
	}

	public incident findOneIncident(int Num_Incident) {
		incident r = em.find(incident.class,Num_Incident);
		return r;
	}

	public incident updateIncident(incident r) {
		em.merge(r);
		return r;
	}

	public void deleteIncident(int  Num_Incident) {
		incident r = em.find(incident.class,Num_Incident);
		em.remove(r);

	}












}
