package com.example.ollamh.whodat;

/**
 * Created by carleneberry on 7/25/17.
 */

public class Character {

    String name;
    String house;
    String relevance;
    String background;
    String season1;
    //TODO: More seasons

    Character(){
        name="";
        house="";
        relevance="";
        background="";
        season1="";


    }

    public void setName(String n){

        name=n;

    }

    public String getName(){

        return name;
    }
    public void setRelevance(String n){
        relevance=n;
    }

    public String getRelevance(){
        return relevance;
    }

    public void setHouse(String n){
        house = n;
    }

    public String getHouse(){
        return house;
    }

    public String getBackground(){
        return background;
    }
    public void setBackground(String n){
        background = n;
    }
    public String getSeason1(){
        return season1;
    }
    public void setSeason1(String n){
        season1 = n;
    }

}

