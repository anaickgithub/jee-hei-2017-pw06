package hei.tp06.service.impl;

import hei.tp06.dao.EvenementDAO;
import hei.tp06.entity.Evenement;
import hei.tp06.service.EvenementService;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by Anaïck on 14/02/2017.
 */
@Named
@Transactional
public class EvenementServiceImpl implements EvenementService{

    @Inject
    private EvenementDAO evenementDAO;

    public List<Evenement> listAllEvenements() {
        return evenementDAO.listAllEvenements();
    }

    public Evenement getEvenement(long id) {
        return evenementDAO.getEvenement(id);
    }

    public void saveEvenement(Evenement evenement) {
        evenementDAO.save(evenement);
    }
}
