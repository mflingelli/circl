package de.flingelli.security.circl;

import com.google.gson.annotations.SerializedName;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class CveItem {
    @SerializedName("Modified")
    private String modified;
    @SerializedName("Published")
    private String published;
    @SerializedName("capec")
    private List<Capec> capecs;
    private Double cvss;
    private String cwe;
    private String id;
    @SerializedName("last-modified")
    private String lastModified;
    private List<Nessus> nessus;
    private List<String> references;
    private Refmap refmap;
    private String summary;

    public String getModified() {
        return modified;
    }

    public String getPublished() {
        return published;
    }

    public List<Capec> getCapecs() {
        return capecs;
    }

    public Double getCvss() {
        return cvss;
    }

    public String getCwe() {
        return cwe;
    }

    public String getId() {
        return id;
    }

    public String getLastModified() {
        return lastModified;
    }

    public List<Nessus> getNessus() {
        return nessus;
    }

    public List<String> getReferences() {
        return references;
    }

    public Refmap getRefmap() {
        return refmap;
    }

    public String getSummary() {
        return summary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CveItem cveItem = (CveItem) o;
        return Objects.equals(id, cveItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Date getModifiedAsDate() throws ParseException {
        return getTimeStampAsDate(getModified());
    }

    public Date getPublishedAsDate() throws ParseException {
        return getTimeStampAsDate(getPublished());
    }

    public Date getLastModifiedAsDate() throws ParseException {
        return getTimeStampAsDate(getLastModified());
    }

    private Date getTimeStampAsDate(String timeStamp) throws ParseException {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(timeStamp);
    }
}
