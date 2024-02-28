package org.example;

import java.util.Objects;

public class RequestParameters {
    String method;
    String format;
    String lang;

    public RequestParameters(String lang) {
        method = "getQuote";
        format = "json";
        if (Objects.equals(lang, "Russian")) {
            this.lang = "ru";
        } else {
            this.lang = "en";
        }
    }

    @Override
    public String toString() {
        return "?method=" + method + '&' +
                "format=" + format + '&' +
                "lang=" + lang + '&';
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}
