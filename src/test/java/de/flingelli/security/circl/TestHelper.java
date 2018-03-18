package de.flingelli.security.circl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

final class TestHelper {

    private TestHelper() {

    }

    static CveItem getCveItem() {
        return JsonReader.getCveItem(getContent("src/test/resources/CVE-2018-6521.json"));
    }

    static CveItem getCveItem(String fileName) {
        return JsonReader.getCveItem(getContent(fileName));
    }

    static String getContent(String fileName) {
        String content;
        try {
            content = new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            content = "";
        }
        return content;
    }

    public static String convertDateToString(Date date) {
        return new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(date);
    }
}
