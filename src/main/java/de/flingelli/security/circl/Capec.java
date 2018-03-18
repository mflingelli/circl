package de.flingelli.security.circl;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

public class Capec {
    private int id;
    private String name;
    private String prerequisites;
    @SerializedName("related_weakness")
    private List<Integer> relatedWeakness;
    private String solutions;
    private String summary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public List<Integer> getRelatedWeakness() {
        return relatedWeakness;
    }

    public String getSolutions() {
        return solutions;
    }

    public String getSummary() {
        return summary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Capec capec = (Capec) o;
        return id == capec.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
