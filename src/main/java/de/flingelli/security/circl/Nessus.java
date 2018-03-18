package de.flingelli.security.circl;

import com.google.gson.annotations.SerializedName;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Nessus {
    @SerializedName("NASL family")
    private String naslFamily;
    @SerializedName("NASL id")
    private String naslId;
    private String description;
    @SerializedName("last seen")
    private String lastSeen;
    private String modified;
    @SerializedName("plugin id")
    private int pluginId;
    private String published;
    private String reporter;
    private String source;
    private String title;

    public String getNaslFamily() {
        return naslFamily;
    }

    public String getNaslId() {
        return naslId;
    }

    public String getDescription() {
        return description;
    }

    public String getLastSeen() {
        return lastSeen;
    }

    public String getModified() {
        return modified;
    }

    public int getPluginId() {
        return pluginId;
    }

    public String getPublished() {
        return published;
    }

    public String getReporter() {
        return reporter;
    }

    public String getSource() {
        return source;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nessus nessus = (Nessus) o;
        return Objects.equals(naslId, nessus.naslId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naslId);
    }

    public Date getLastSeenAsDate() throws ParseException {
        return getTimeStampAsDate(getLastSeen());
    }

    public Date getModifiedAsDate() throws ParseException {
        return getTimeStampAsDate(getModified());
    }

    public Date getPublishedAsDate() throws ParseException {
        return getTimeStampAsDate(getPublished());
    }

    private Date getTimeStampAsDate(String timeStamp) throws ParseException {
        return new SimpleDateFormat("yyyy-MM-dd").parse(timeStamp);
    }
}
