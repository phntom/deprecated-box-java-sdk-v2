package com.box.boxjavalibv2.requests;

import com.box.boxjavalibv2.IBoxConfig;
import com.box.boxjavalibv2.jsonparsing.IBoxJSONParser;
import com.box.restclientv2.RestMethod;
import com.box.restclientv2.exceptions.BoxRestException;
import com.box.restclientv2.requestsbase.BoxDefaultRequestObject;
import com.box.restclientv2.requestsbase.DefaultBoxRequest;

public class GetGroupCollaborationsRequest extends DefaultBoxRequest {

    private static String URI = "/groups/%s/collaborations";

    public GetGroupCollaborationsRequest(final IBoxConfig config, final IBoxJSONParser parser, final String groupId, BoxDefaultRequestObject requestObject)
        throws BoxRestException {
        super(config, parser, getUri(groupId), RestMethod.GET, requestObject);
    }

    public static String getUri(final String groupId) {
        return String.format(URI, groupId);
    }

}
