package soa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import soa.entities.cause;
import soa.entities.incident;
import soa.entities.ouvrage;
import soa.entities.poste;
import soa.repository.causeRepo;
import soa.repository.incidentRepo;
import soa.repository.ouvrageRepo;
import soa.repository.posteRepo;

@RestController
@RequestMapping("/")
public class GR {

    @Autowired
    private causeRepo causeRepo;
    @Autowired
    private incidentRepo incidentRepo;
    @Autowired
    private posteRepo posteRepo;
    @Autowired
    private ouvrageRepo ouvrageRepo;


    @GetMapping(value = "cause/getAll", produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<cause> getAll() {
        return causeRepo.findAll();
    }

    @GetMapping(value = "cause/get/{code_cause}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public cause getCause(@PathVariable int code_cause) {
        return causeRepo.findById(code_cause).orElse(null);
    }
    @GetMapping(value = "cause/findCauseByDesignation/{Designation}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<cause> findCauseByDesignation(@PathVariable String Designation) {
        return causeRepo.findCauseByDesignation(Designation);
    }
    @GetMapping(value = "incident/findIncidentByPostName/{PostName}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<incident> findIncidentByPostName(@PathVariable String PostName) {
        return incidentRepo.findIncidentByPostName(PostName);
    }
    @GetMapping(value = "poste/findPosteByPostName/{PostName}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<poste> findPosteByPostName(@PathVariable String PostName) {
        return posteRepo.findPosteByPostName(PostName);
    }
    @GetMapping(value = "ouvrage/findOuvrageByPostName/{PostName}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<ouvrage> findOuvrageByPostName(@PathVariable String PostName) {
        return ouvrageRepo.findOuvrageByPostName(PostName);
    }

    @DeleteMapping(value = "cause/delete/{code_cause}")
    public ResponseEntity<String> deleteReglement(@PathVariable int code_cause) {
        try {
            causeRepo.deleteById(code_cause);
            return new ResponseEntity<>("Cause with ID " + code_cause + " deleted successfully", HttpStatus.OK);
        } catch (EmptyResultDataAccessException e) {
            // This exception is thrown if the entity with the specified ID is not found
            return new ResponseEntity<>("Cause with ID " + code_cause + " not found", HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            // Handle other exceptions (e.g., database connectivity issues)
            return new ResponseEntity<>("Error deleting Cause with ID " + code_cause, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(value = "cause/add", consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }
            ,produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public cause saveCause(@RequestBody cause r) {
        try {
            return causeRepo.save(r);
        }
        catch (Exception e) {
            // Log the exception
            e.printStackTrace();

        }
        return r;
    }

    @PutMapping(value = "cause/update/{code_cause}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public cause updateCause(@RequestBody cause r,@PathVariable int code_cause) {
        Optional<cause> update = causeRepo.findById(code_cause);
        if (update.isPresent())
        {
            cause c = update.get();
            c.setCode_cause(r.getCode_cause());
            c.setDesignation(r.getDesignation());
            return causeRepo.save(c);

        }
        return null;
    }



    @GetMapping(value = "ouvrage/getAll", produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<ouvrage> getAllOuvrages() {
        return ouvrageRepo.findAll();
    }

    @GetMapping(value = "ouvrage/get/{nom_ouvrage}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ouvrage getOuvrage(@PathVariable String nom_ouvrage) {
        return ouvrageRepo.findById(nom_ouvrage).orElse(null);
    }


    @DeleteMapping(value = "ouvrage/delete/{nom_ouvrage}")
    public ResponseEntity<String> deleteOuvrage(@PathVariable String nom_ouvrage) {
        try {
            ouvrageRepo.deleteById(String.valueOf(nom_ouvrage));
            return new ResponseEntity<>("Cause with ID " + nom_ouvrage + " deleted successfully", HttpStatus.OK);
        } catch (EmptyResultDataAccessException e) {
            // This exception is thrown if the entity with the specified ID is not found
            return new ResponseEntity<>("Cause with ID " + nom_ouvrage + " not found", HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            // Handle other exceptions (e.g., database connectivity issues)
            return new ResponseEntity<>("Error deleting Cause with ID " + nom_ouvrage, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(value = "ouvrage/add", consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }
            ,produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public ouvrage saveOuvrage(@RequestBody ouvrage r) {
        try {
            return ouvrageRepo.save(r);
        }
        catch (Exception e) {
            // Log the exception
            e.printStackTrace();

        }
        return r;
    }

    @PutMapping(value = "ouvrage/update/{nom_ouvrage}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public ouvrage updateOuvrage(@RequestBody ouvrage r,@PathVariable String nom_ouvrage) {
        Optional<ouvrage> update = ouvrageRepo.findById(nom_ouvrage);
        if (update.isPresent())
        {
            ouvrage o= update.get();
            o.setNom_Poste(r.getNom_Poste());
            o.setNom_Ouvrage(r.getNom_Ouvrage());
            o.setDesignation(r.getDesignation());
            o.setType_SA(r.getType_SA());
            o.setTension_KV(r.getTension_KV());
            o.setPrecision_KV(r.getPrecision_KV());
            return ouvrageRepo.save(o);

        }
        return null;
    }



    @GetMapping(value = "poste/getAll", produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<poste> getAllPostes() {
        return posteRepo.findAll();
    }

    @GetMapping(value = "poste/get/{nom_poste}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public poste getPostes(@PathVariable String nom_poste) {
        return posteRepo.findById(nom_poste).orElse(null);
    }


    @DeleteMapping(value = "poste/delete/{nom_poste}")
    public ResponseEntity<String> deletePoste(@PathVariable String nom_poste) {
        try {
            posteRepo.deleteById(String.valueOf(nom_poste));
            return new ResponseEntity<>("Cause with ID " + nom_poste + " deleted successfully", HttpStatus.OK);
        } catch (EmptyResultDataAccessException e) {
            // This exception is thrown if the entity with the specified ID is not found
            return new ResponseEntity<>("Cause with ID " + nom_poste + " not found", HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            // Handle other exceptions (e.g., database connectivity issues)
            return new ResponseEntity<>("Error deleting Cause with ID " + nom_poste, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(value = "poste/add", consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }
            ,produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public poste savePoste(@RequestBody poste r) {
        try {
            return posteRepo.save(r);
        }
        catch (Exception e) {
            // Log the exception
            e.printStackTrace();

        }
        return r;
    }

    @PutMapping(value = "poste/update/{nom_poste}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public poste updatePoste(@RequestBody poste r,@PathVariable String nom_poste) {
        Optional<poste> update = posteRepo.findById(nom_poste);
        if (update.isPresent())
        {
            poste p = update.get();
            p.setNom_Poste(r.getNom_Poste());
            p.setDesignation(r.getDesignation());
            p.setType(r.getType());
            return posteRepo.save(p);

        }
        return null;
    }



    @GetMapping(value = "incident/getAll", produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<incident> getAllIncidents() {
        return incidentRepo.findAll();
    }

    @GetMapping(value = "incident/get/{num_Incident}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public incident getPostes(@PathVariable int num_Incident) {
        return incidentRepo.findById(num_Incident).orElse(null);
    }


    @DeleteMapping(value = "incident/delete/{num_Incident}")
    public ResponseEntity<String> deleteIncident(@PathVariable int num_Incident) {
        try {
            incidentRepo.deleteById(num_Incident);
            return new ResponseEntity<>("incident with ID " + num_Incident + " deleted successfully", HttpStatus.OK);
        } catch (EmptyResultDataAccessException e) {
            // This exception is thrown if the entity with the specified ID is not found
            return new ResponseEntity<>("incident with ID " + num_Incident + " not found", HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            // Handle other exceptions (e.g., database connectivity issues)
            return new ResponseEntity<>("Error incident Cause with ID " + num_Incident, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(value = "incident/add", consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }
            ,produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public incident saveIncident(@RequestBody incident r) {
        try {
            return incidentRepo.save(r);
        }
        catch (Exception e) {
            // Log the exception
            e.printStackTrace();

        }
        return r;
    }

    @PutMapping(value = "incident/update/{num_Incident}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public incident updateIncident(@RequestBody incident r,@PathVariable int num_Incident) {
        Optional<incident> update = incidentRepo.findById(num_Incident);
        if (update.isPresent())
        {
            incident i = update.get();
            i.setNum_Incident(r.getNum_Incident());
            i.setAnnee_Inc(r.getAnnee_Inc());
            i.setMois_Inc(r.getMois_Inc());
            i.setJour_Inc(r.getJour_Inc());
            i.setHeure_Inc(r.getHeure_Inc());
            i.setMinute_Inc(r.getMinute_Inc());
            i.setAnnee_Ret(r.getAnnee_Ret());
            i.setMois_Ret(r.getMois_Ret());
            i.setJour_Ret(r.getJour_Ret());
            i.setHeure_Ret(r.getHeure_Ret());
            i.setMinute_Ret(r.getMinute_Ret());
            i.setCode_Cause(r.getCode_Cause());
            i.setCode_Siege1(r.getCode_Siege1());
            i.setCode_Nat_Dcl(r.getCode_Nat_Dcl());
            i.setNom_Depart(r.getNom_Depart());
            i.setNom_Poste(r.getNom_Poste());
            return incidentRepo.save(i);

        }
        return null;
    }


}
