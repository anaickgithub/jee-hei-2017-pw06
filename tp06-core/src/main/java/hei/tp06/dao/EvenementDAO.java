package hei.tp06.dao;

import hei.tp06.entity.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Anaïck on 14/02/2017.
 */
public interface EvenementDAO extends JpaRepository<Evenement,Long>{

    List<Evenement> findAll();

    Evenement findOneById(long id);
}
