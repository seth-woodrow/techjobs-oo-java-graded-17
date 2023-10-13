package org.launchcode.techjobs.oo;

import org.junit.Test;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job(){

        this.id =nextId;
        nextId++;
}

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {

        this();
        this.name = (name.isEmpty()?"Data not available":name);
        this.employer = (employer == null || employer.getValue().isEmpty()) ? new Employer("Data not available") : employer;
        this.location = (location == null || location.getValue().isEmpty()) ? new Location("Data not available") : location;
        this.positionType = (positionType == null || positionType.getValue().isEmpty()) ? new PositionType("Data not available") : positionType;
        this.coreCompetency = (coreCompetency == null || coreCompetency.getValue().isEmpty()) ? new CoreCompetency("Data not available") : coreCompetency;

        if(name.isEmpty()){
            this.id=0;
        }
    }

// TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job job)) return false;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

/*    @Override
    public String toString() {
        return System.lineSeparator()+
                "Id:" + id+
                System.lineSeparator()+"Name:" + name +System.lineSeparator()+
                "Employer:" + employer +System.lineSeparator()+
                "Location:" + location +System.lineSeparator()+
                "Position Type:" + positionType +System.lineSeparator()+
                "Core Competency:" + coreCompetency +System.lineSeparator();
    }*/
@Override
public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(System.lineSeparator())
            .append("Id:").append(id).append(System.lineSeparator())
            .append("Name:").append(name.isEmpty() ? "Data not available" : name).append(System.lineSeparator())
            .append("Employer:").append(employer == null || employer.getValue().isEmpty() ? "Data not available" : employer.getValue()).append(System.lineSeparator())
            .append("Location:").append(location == null || location.getValue().isEmpty() ? "Data not available" : location.getValue()).append(System.lineSeparator())
            .append("Position Type:").append(positionType == null || positionType.getValue().isEmpty() ? "Data not available" : positionType.getValue()).append(System.lineSeparator())
            .append("Core Competency:").append(coreCompetency == null || coreCompetency.getValue().isEmpty() ? "Data not available" : coreCompetency.getValue()).append(System.lineSeparator());

    return stringBuilder.toString();
}

}
