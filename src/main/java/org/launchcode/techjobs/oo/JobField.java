package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {

<<<<<<< HEAD
    //    Fields
=======
//    Fields
>>>>>>> b774f8f360f0a367649004e98e93386da1d2a206
    private int id;
    private static int nextId = 1;
    private String value;

<<<<<<< HEAD
    //    Constructors
=======
//    Constructors
>>>>>>> b774f8f360f0a367649004e98e93386da1d2a206
    public JobField() {
        this.id = nextId;
        nextId ++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

<<<<<<< HEAD
    //    Getters/Setters
=======
//    Getters/Setters
>>>>>>> b774f8f360f0a367649004e98e93386da1d2a206
    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

<<<<<<< HEAD
    //    Methods
=======
//    Methods
>>>>>>> b774f8f360f0a367649004e98e93386da1d2a206
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return id == jobField.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
