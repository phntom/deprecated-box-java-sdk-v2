package com.box.boxjavalibv2.dao;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BoxEventCollection extends BoxCollectionBase {

    public static final String FIELD_CHUNK_SIZE = "chunk_size";
    public static final String FIELD_NEXT_STREAM_POSITION = "next_stream_position";

    public BoxEventCollection() {
    }

    /**
     * Copy constructor, this does deep copy for all the fields.
     * 
     * @param obj
     */
    public BoxEventCollection(BoxEventCollection obj) {
        super(obj);
    }

    /**
     * Instantiate the object from a map. Each entry in the map reflects to a field.
     * 
     * @param map
     */
    public BoxEventCollection(Map<String, Object> map) {
        super(map);
    }

    /**
     * @return the chunk size
     */
    @JsonProperty(FIELD_CHUNK_SIZE)
    public Integer getChunkSize() {
        return (Integer) getValue(FIELD_CHUNK_SIZE);
    }

    /**
     * @param chunkSize
     *            size the chunk size
     */
    @JsonProperty(FIELD_CHUNK_SIZE)
    private void setChunkSize(Integer chunkSize) {
        put(FIELD_CHUNK_SIZE, chunkSize);
    }

    /**
     * @return the next stream_position
     */
    @JsonProperty(FIELD_NEXT_STREAM_POSITION)
    public String getNextStreamPosition() {
        return (String) getValue(FIELD_NEXT_STREAM_POSITION);
    }

    /**
     * @param nextStreamPosition
     *            the next stream position
     */
    @JsonProperty(FIELD_NEXT_STREAM_POSITION)
    private void setNextStreamPosition(String nextStreamPosition) {
        put(FIELD_NEXT_STREAM_POSITION, nextStreamPosition);
    }

    public BoxEventCollection(IBoxParcelWrapper in) {
        super(in);
    }
}
