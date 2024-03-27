package ma.chaimae.tp2app.repository;

import ma.chaimae.tp2app.entities.Patient;
import ma.chaimae.tp2app.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezVousRepository extends JpaRepository<RendezVous,String> {
}
