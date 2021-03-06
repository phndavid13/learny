package com.lab.inmotion.learny.Model;

import com.parse.ParseClassName;
import com.parse.ParseObject;

import java.util.Date;

/**
 * Created by InMotionLab on 10/10/2015.
 */
@ParseClassName("Child")
public class Child extends ParseObject {

    public static final int CATEGORIAS = 6;

    private String firstName;
    private String lastName;
    private Date birth;
    private String parentName;
    private String address;
    private String school;
    private String educationLevel;
    private String testPlace;
    private Date testDate;
    private String sex;

    private double [] puntajes;
    private double [] tiempos;
    private boolean current;

    public Child(){
        this.puntajes = new double[CATEGORIAS-1];
        this.tiempos = new double[CATEGORIAS-1];
        current = false;
        for(int i=0;i<CATEGORIAS-1;i++){
            this.puntajes[i] = 0;
            this.tiempos[i] = 0;
        }

    }

    public void registerTime(double time,int index){
        tiempos[index] = time;
    }
    public void registerScore (double score, int index){
        puntajes[index] = score;
    }
    public String getLastName() {
        return lastName;
    }

    public Date getBirth() {
        return birth;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setBirth(Date birth){
        this.birth = birth;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public void setTestPlace(String testPlace) {
        this.testPlace = testPlace;
    }

    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }

    public String getAddress() {
        return address;
    }

    public String getSchool() {
        return school;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public String getTestPlace() {
        return testPlace;
    }

    public Date getTestDate() {
        return testDate;
    }
    public double[] getPuntajes(){
        return puntajes;
    }
    public double[] getTiempos(){
        return tiempos;
    }

    public boolean isCurrent() {
        return current;
    }

    public void setCurrent(boolean current) {
        this.current = current;
    }

    public void setPuntajes(double[] puntajes) {
        this.puntajes = puntajes;
    }

    public void setTiempos(double[] tiempos) {
        this.tiempos = tiempos;
    }
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

