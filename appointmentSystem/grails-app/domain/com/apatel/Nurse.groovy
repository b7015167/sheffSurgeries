package com.apatel

class Nurse {

String nurseName
String qualifications
String nurseEmail
String nurseOffice
String nursePhone

String toString(){
return nurseName
}

    static constraints = {
nurseName  nullable:false, blank:false
qualifications  nullable:false, blank:false
nurseEmail  nullable:false, blank:false
nurseOffice  nullable:false, blank:false
nursePhone  nullable:false, blank:false    

}

static hasMany = [doctors:Doctor]

static belongsTo = [surgery:Surgery, doctors:Doctor]

//nurses belong to a surgery
//nurses belong to doctors
//nurses have many doctors
}
