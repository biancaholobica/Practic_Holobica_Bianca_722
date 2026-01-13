package org.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tribut {
    @JsonProperty("id") int id;
    @JsonProperty("name") String name;
    @JsonProperty("district") int district;
    @JsonProperty("status") Status status;
    @JsonProperty("skillLevel") int skillLevel;

    public Tribut() {}

    public Tribut(int id, String name, int district, Status status, int skillLevel) {
        this.id = id;
        this.name = name;
        this.district = district;
        this.status = status;
        this.skillLevel = skillLevel;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getDistrict() { return district; }
    public void setDistrict(int district) { this.district = district; }
    public Status getStatus() { return status; }
    public void setStatus(Status status) { this.status = status; }
    public int getSkillLevel() { return skillLevel; }
    public void setSkillLevel(int skillLevel) { this.skillLevel = skillLevel; }

    @Override
    public String toString() {
        return String.format("id: %d | name: %s | district: %d | status: %s |  skillLevel: %d");
    }
}
