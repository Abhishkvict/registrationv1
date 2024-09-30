package com.api.payload;
import java.util.Date;

public class ErrorDto {
    private String message;
    private Date date;
    private String Uri;

    public ErrorDto(String message, Date date, String uri) {
        this.message = message;
        this.date = date;
        Uri = uri;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

    public String getUri() {
        return Uri;
    }
}


