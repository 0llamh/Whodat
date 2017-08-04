package com.example.ollamh.whodat;

/**
 * Created by carleneberry on 7/25/17.
 */

public class Character {

    String name;
    String house;
    String relevance;

    Character(){
        name="";
        house="Stark";
        relevance="1234567";


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

}

