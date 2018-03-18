package de.flingelli.security.circl;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public final class JsonReader {

    private JsonReader() {

    }

    public static CveItem getCveItem(String content) {
        Gson gson = new Gson();
        return gson.fromJson(content, new TypeToken<CveItem>(){}.getType());
    }
}
