
package de.thack.api.getyourguide.model;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "sw_lat",
    "sw_long",
    "ne_lat",
    "ne_long"
})
public class Viewport {

    @JsonProperty("sw_lat")
    private Double swLat;
    @JsonProperty("sw_long")
    private Double swLong;
    @JsonProperty("ne_lat")
    private Double neLat;
    @JsonProperty("ne_long")
    private Double neLong;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The swLat
     */
    @JsonProperty("sw_lat")
    public Double getSwLat() {
        return swLat;
    }

    /**
     * 
     * @param swLat
     *     The sw_lat
     */
    @JsonProperty("sw_lat")
    public void setSwLat(Double swLat) {
        this.swLat = swLat;
    }

    /**
     * 
     * @return
     *     The swLong
     */
    @JsonProperty("sw_long")
    public Double getSwLong() {
        return swLong;
    }

    /**
     * 
     * @param swLong
     *     The sw_long
     */
    @JsonProperty("sw_long")
    public void setSwLong(Double swLong) {
        this.swLong = swLong;
    }

    /**
     * 
     * @return
     *     The neLat
     */
    @JsonProperty("ne_lat")
    public Double getNeLat() {
        return neLat;
    }

    /**
     * 
     * @param neLat
     *     The ne_lat
     */
    @JsonProperty("ne_lat")
    public void setNeLat(Double neLat) {
        this.neLat = neLat;
    }

    /**
     * 
     * @return
     *     The neLong
     */
    @JsonProperty("ne_long")
    public Double getNeLong() {
        return neLong;
    }

    /**
     * 
     * @param neLong
     *     The ne_long
     */
    @JsonProperty("ne_long")
    public void setNeLong(Double neLong) {
        this.neLong = neLong;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
