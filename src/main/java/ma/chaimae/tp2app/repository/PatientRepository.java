package ma.chaimae.tp2app.repository;

import ma.chaimae.tp2app.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    Patient findByNom(String name);
}
