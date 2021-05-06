package com.apatel

class Appointment {

String appID
Date appDate
String appTime
int appDuration
int roomNumber

String toString(){
return appID
}

    static constraints = {
appDate nullable:false, blank:false
appTime nullable:false, blank:false
appDuration nullable:false, blank:false
roomNumber nullable:false, blank:false
appID nullable:false, blank:false
    }

static belongsTo = [doctor:Doctor, surgery:Surgery, patient:Patient]
//an appointment belongs to a patient
//an appointment belongs to a surgery
//an appointment belongs to a doctor

}
