package com.apatel

class Doctor {

String fullName
String qualification
String position
String doctorEmail
String doctorOffice
String password
String doctorPhone
String bio

String toString(){
return fullName
}

    static constraints = {
fullName nullable:false, blank:false
qualification  nullable:false, blank:false
position  nullable:false, blank:false
doctorEmail  nullable:false, blank:false, email:true, unique:true
doctorOffice  blank:false, nullable:false
password  nullable:false, blank:false
doctorPhone  nullable:false, blank:false
bio  nullable:false, blank:false, widget:'textarea'
    }

static hasMany = [appointments:Appointment, patients:Patient, nurses:Nurse, prescriptions:Prescription]

static belongsTo = [surgery:Surgery]

//a doctor has many appointments
//a doctor has many patients
//a doctor has many nurses
//a doctor has many prescriptions
//a doctor belongs to a surgery
}
