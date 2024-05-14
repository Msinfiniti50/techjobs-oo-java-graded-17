package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends Job {// inherits same behavior/methods from parent class

    private final int id;// generating a unique ID for each object and add 1 for the next ID
    private static int nextId = 1;
    private String value;

    public PositionType() { //constructor is assigning value to new ID field of object
        id = nextId;
        nextId++;
    }

    public PositionType(String value) {
        this();// constructor with one parameter, This assigns new unique ID to every new PTO
        this.value = value; //sets the value
    }
@Override
public String toString() {
        if(value == null || value.isEmpty()) {
            return "Data not available";
        } else {
            return value;
        }
}
    // TODO: Add a custom toString() method that returns the data stored in 'value'.

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

    // Getters and Setters:

    public int getId() {
        return id;
    }// returns value of ID

    public String getValue() {
        return value;
    } //encapsulation that retrieves the value data Field

    public void setValue(String value) {
        this.value = value;
    }// allows you to modify the v.a of instances of Class where method is


@Override
public int hashCode() {
    return Objects.hash(id);
}// stores collection with the unique identifiers for easy searching
@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PositionType that = (PositionType) o;
    return id == that.id;
}}

