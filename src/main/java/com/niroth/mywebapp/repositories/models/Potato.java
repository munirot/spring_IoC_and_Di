package com.niroth.mywebapp.repositories.models;


public class Potato {
    int id;
    String type;
    double height;
    double size;
    String nationality;

    public Potato(int id, String type, double height, double size, String nationality) {
        this.id = id;
        this.type = type;
        this.height = height;
        this.size = size;
        this.nationality = nationality;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Potato{" +
                "id=" + id +
                ", type=" + type +
                ", height=" + height +
                ", size=" + size +
                ", nationality=" + nationality +
                '}';
    }
}
