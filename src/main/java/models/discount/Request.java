package models.discount;

import java.util.ArrayList;


public abstract class Request {
    protected String requestId;
    protected static ArrayList<Request> requests;

    public Request(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return requestId;
    }

    public static ArrayList<Request> getRequests() {
        return requests;
    }
}
