package hei.tp06.service;

import hei.tp06.entity.Evenement;

import java.util.List;

/**
 * Created by Anaïck on 14/02/2017.
 */
public interface EvenementService {

    List<Evenement> listAllEvenements();

    Evenement getEvenement(long id);

    void saveEvenement(Evenement evenement);
}
