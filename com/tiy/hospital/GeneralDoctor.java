package com.tiy.hospital;

/**
 * Created by jessicatracy on 8/18/16.
 */
public class GeneralDoctor extends HospitalDoctor implements Doctor {

    public Diagnosis diagnose(int illness) {
        return new Diagnosis(illness);
    }
}
