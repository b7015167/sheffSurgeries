package com.apatel

class Patient {
String patientName
String patientAddress
String patientResidence
Date patientDob
String patientID
Date dateRegistered
String patientPhone

String toString(){
return patientName
}

    static constraints = {
patientName  nullable:false, blank:false
patientAddress  nullable:false, blank:false
patientResidence  nullable:false, blank:false
patientDob  nullable:false, blank:false
patientID  nullable:false, blank:false, unique:true
dateRegistered  nullable:false, blank:false, date:true
patientPhone  nullable:false, blank:false     

}
//a patient can have many prescriptions
//a patient can have many appointments
//a patient can see many doctors 
static hasMany = [prescriptions:Prescription, appointments:Appointment, doctors:Doctor]

//a patient belongs to a surgery
static belongsTo = [surgery:Surgery]
}
