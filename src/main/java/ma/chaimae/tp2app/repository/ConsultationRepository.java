package ma.chaimae.tp2app.repository;

import ma.chaimae.tp2app.entities.Consultation;
import ma.chaimae.tp2app.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}
