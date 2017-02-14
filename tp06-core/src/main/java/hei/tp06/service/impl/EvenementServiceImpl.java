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

    public List<Evenement> findAll() {
        return evenementDAO.findAll();
    }

    public Evenement findOneById(long id) {
        return evenementDAO.findOneById(id);
    }

    public void save(Evenement evenement) {
        evenementDAO.save(evenement);
    }
}
