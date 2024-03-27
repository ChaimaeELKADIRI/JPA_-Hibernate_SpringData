package ma.chaimae.tp2app.service;

import ma.chaimae.tp2app.entities.Consultation;
import ma.chaimae.tp2app.entities.Medecin;
import ma.chaimae.tp2app.entities.Patient;
import ma.chaimae.tp2app.entities.RendezVous;

import java.beans.MethodDescriptor;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);
}
