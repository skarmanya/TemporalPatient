package org.acme.patient.onboarding.app;

import io.temporal.activity.ActivityInterface;
import model.Doctor;
import model.Hospital;

@ActivityInterface
public interface ServiceExecutor {
    Hospital assignHospitalToPatient(String zip);
    Doctor assignDoctorToPatient(String condition);
    String finalizeOnboarding();
    void notifyViaEmail(String email);
    void notifyViaText(String number);
}
