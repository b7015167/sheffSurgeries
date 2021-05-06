package appointmentsystem

class BootStrap {

    def init = { servletContext ->
    

//nurse data
def nurse1 = new com.apatel.Nurse(
nurseName: 'Jackie Weaver',
qualifications: 'BSc Nursing',
nurseEmail: 'jackieweaver@gmail.com',
nurseOffice: '213',
nursePhone: '01162546895',
surgery: surgery1)
.save()

def nurse2 = new com.apatel.Nurse(
nurseName: 'Lindsay Lohan',
qualifications: 'BSc Healthcare',
nurseEmail: 'lindsaylohan@gmail.com',
nurseOffice: '321',
nursePhone: '01162556495',
surgery: surgery2)
.save()


//doctor data

def doctor1 = new com.apatel.Doctor (
fullName: 'Paris Hilton',
qualification: 'BSc Medicine',
position: 'Generap Practitioner',
doctorEmail: 'thatssogorge@gmail.com',
password: 'password789',
doctorOffice: '456',
doctorPhone: '01162546656',
bio: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit',
nurses: nurse1,
surgeries: surgery1)
.save()

def doctor2 = new com.apatel.Doctor (
fullName: 'Jason Derulo',
qualification: 'BSc Medicine',
position: 'General Practitioner',
doctorEmail: 'itsjsond@gmail.com',
password: 'jasooooon',
doctorOffice: '789',
doctorPhone: '01162564747',
bio: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit',
nurses: nurse2,
surgeries: surgery2)
.save()

//appointment data
def appointment1 = new com.apatel.Appointment (
appID: '1526',
appDate: new Date('19/10/2021'),
appTime: '11:15',
appDuration: '30',
roomNumber: '12',
patient: patient1,
doctor: doctor1,
surgery: surgery1)
.save()

def appointment2 = new com.apatel.Appointment (
appID: '2564',
appDate: new Date('10/07/2021'),
appTime: '10:00',
appDuration: '60',
roomNumber: '8',
patient: patient2,
doctor: doctor2,
surgery: surgery2)
.save()


//patient data
def patient1 = new com.apatel.Patient(
patientName: 'Jack Jones',
patientAddress: '40 Garfield Lane',
patientResidence: 'Leicester',
PatientDob: new Date ('25/11/1967'),
patientID: '5846',
dateRegistered: new Date ('25/11/1976'),
patientPhone: '07846556421',
surgery: surgery1,
doctor: doctor1)
.save()

def patient2 = new com.apatel.Patient(
patientName: 'Jeremy Jackson',
patientAddress: '56 West Street',
patientResidence: 'Sheffield',
PatientDob: new Date ('10/01/1998'),
patientID: '7845',
dateRegistered: new Date ('17/10/2015'),
patientPhone: '07459856241',
surgery: surgery2,
doctor: doctor2)
.save()


//prescription data

def prescription1 = new com.apatel.Prescription (
pharmacyName: 'Sayfees',
prescripNumber: '145226',
daysOfSupply: '14',
medicine: 'Hydrocodone',
totalCost: '7.50',
dateIssued: new Date('16/04/2021'),
patientPaying: true,
doctor: doctor1,
patient: patient1)
.save()

def prescription2 = new com.apatel.Prescription (
pharmacyName: 'Sunny Pharmacy',
prescripNumber: '2541',
daysOfSupply: '28',
medicine: 'Lisinopril',
totalCost: '10.25',
dateIssued: new Date('10/11/2021'),
patientPaying: false,
doctor: doctor2,
patient: patient2)
.save()

//surgery data

def surgery1 = new com.apatel.Surgery (
name: 'Evington Medical Surgery',
address: '1 Evington Parks Road',
postcode: 'LE1 2AB',
telephone: '01162546565',
numberOfPatients: '120',
description: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit',
openingTime: '07:00')
.save()

def surgery2 = new com.apatel.Surgery (
name: 'Oadby Surgery',
address: '18 Copse Close',
postcode: 'LE2 4DQ',
telephone: '0116284659',
numberOfPatients: '200',
description: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit',
openingTime: '08:30')
.save()

//receptionist data
def receptionist1 = new com.apatel.Receptionist(
recepName: 'Katy Jones',
recepEmail: 'katyjones@gmail.com',
recepUsername: 'katyjones1',
recepPassword: 'p4ssw0rd',
recepPhone: '01162456985',
surgery: surgery1)
.save()

def receptionist2 = new com.apatel.Receptionist(
recepName: 'Jacob Moore',
recepEmail: 'jacobmoore@gmail.com',
recepUsername: 'jacobmoore',
recepPassword: 'password123',
recepPhone: '01162896445',
surgery: surgery2)
.save()
}
    def destroy = {
    }
}
