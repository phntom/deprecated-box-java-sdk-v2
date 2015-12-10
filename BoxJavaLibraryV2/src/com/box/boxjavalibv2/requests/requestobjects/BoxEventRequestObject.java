package com.box.boxjavalibv2.requests.requestobjects;

import com.box.restclientv2.requestsbase.BoxDefaultRequestObject;

import java.util.Objects;

public class BoxEventRequestObject extends BoxDefaultRequestObject {

    private BoxEventRequestObject() {
        super();
    }

    /**
     * Stream position of "now",See http://developers.box.com/docs/#events. Currently it's only supported for regular events, not enterprise events(admin_logs).
     */
    public static final int STREAM_POSITION_NOW = -1;
    public static final String STREAM_POSITION_NOW_STRING = String.valueOf(STREAM_POSITION_NOW);

    public static final String STREAM_TYPE_ALL = "all";
    public static final String STREAM_TYPE_CHANGES = "changes";
    public static final String STREAM_TYPE_SYNC = "sync";

    /**
     * Construct a new events object for fetching the event stream.
     *
     * @param streamPosition
     *            Stream position. See http://developers.box.com/docs/#events for how to set this. To set this to "now", use
     *            BoxEventRequestObject.STREAM_POSITION_NOW.Don't use STREAM_POSITION_NOW if you are requesting for enterprise
     *            events(admin_logs),STREAM_POSITION_NOW is only supported for regular events.
     * @return BoxEventRequestObject.
     */
    public static BoxEventRequestObject getEventsRequestObject(final long streamPosition) {
        return getEventsRequestObject(streamPosition == STREAM_POSITION_NOW ? "now" : String.valueOf(streamPosition));
    }

    public static BoxEventRequestObject getEventsRequestObject(final String streamPosition) {
        BoxEventRequestObject req = new BoxEventRequestObject();
        req.getRequestExtras().addQueryParam("stream_position",
                Objects.equals(STREAM_POSITION_NOW_STRING, streamPosition) ? "now" : streamPosition
        );
        return req;
    }

    /**
     * Set the stream_type.
     *
     * @param streamType
     *            Use STREAM_TYPE_ALL (default), STREAM_TYPE_CHANGES or STREAM_TYPE_SYNC.
     * @return BoxEventRequestObject.
     */
    public BoxEventRequestObject setStreamType(String streamType) {
        getRequestExtras().addQueryParam("stream_type", streamType);
        return this;
    }

    /**
     * Set the limit for the number of events that will be returned.
     *
     * @param limit
     *            Default is 100.
     * @return BoxEventRequestObject.
     */
    public BoxEventRequestObject setLimit(int limit) {
        getRequestExtras().addQueryParam("limit", String.valueOf(limit));
        return this;
    }

}
