package org.acme.patient.onboarding.utils;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import model.Doctor;
import model.Hospital;
import model.Patient;

@Path("onboard")
@RegisterRestClient
public interface OnboardingServiceClient {

    @POST
    @Path("assignhospital")
    Hospital assignHospitalToPatient(String zip);

    @POST
    @Path("assigndoctor")
    Doctor assignDoctorToPatient(String condition);

    @POST
    @Path("notify")
    Patient notifyPatient(String email);
}
