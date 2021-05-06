package com.apatel

class Prescription {
String pharmacyName
String prescripNumber
String medicine
String totalCost
int daysOfSupply
Date dateIssued
Boolean patientPaying

String toString(){
return medicine
}

    static constraints = {
pharmacyName  nullable:false, blank:false
prescripNumber  nullable:false, blank:false, unique:true
medicine  nullable:false, blank:false
totalCost  nullable:false, blank:false, scale:2
daysOfSupply  nullable:false, blank:false 
dateIssued  nullable:false, blank:false
patientPaying  nullable:false, blank:false

   }

static belongsTo = [doctor:Doctor, patient:Patient]
//a prescription belongs to a doctor
//a prescription belongs to a patient
}
