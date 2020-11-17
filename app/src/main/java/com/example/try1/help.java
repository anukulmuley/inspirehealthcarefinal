package com.example.try1;

class helperClass{
    String descip;


    public helperClass(){

    }

    public helperClass(String med1, String morn1, String aft1, String even1) {

    }


    public String getDescip() {
        return descip;
    }

    public void setDescip(String descip) {
        this.descip = descip;
    }

    public helperClass(String descip){
        this.descip = descip;
    }
}

class medicineDoctor{

    public medicineDoctor(){

    }
    String medicine1, morning, afternoon, evening;

    public String getMedicine1() {
        return medicine1;
    }

    public void setMedicine1(String medicine1) {
        this.medicine1 = medicine1;
    }

    public String getMorning() {
        return morning;
    }

    public void setMorning(String morning) {
        this.morning = morning;
    }

    public String getAfternoon() {
        return afternoon;
    }

    public void setAfternoon(String afternoon) {
        this.afternoon = afternoon;
    }

    public String getEvening() {
        return evening;
    }

    public void setEvening(String evening) {
        this.evening = evening;
    }

    public medicineDoctor(String medicine1, String morning, String afternoon, String evening) {
        this.medicine1 = medicine1;
        this.morning = morning;
        this.afternoon = afternoon;
        this.evening = evening;
    }

}