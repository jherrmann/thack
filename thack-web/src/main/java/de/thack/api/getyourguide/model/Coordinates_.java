
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
    "lat",
    "long"
})
public class Coordinates_ {

    @JsonProperty("lat")
    private Double lat;
    @JsonProperty("long")
    private Double _long;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The lat
     */
    @JsonProperty("lat")
    public Double getLat() {
        return lat;
    }

    /**
     * 
     * @param lat
     *     The lat
     */
    @JsonProperty("lat")
    public void setLat(Double lat) {
        this.lat = lat;
    }

    /**
     * 
     * @return
     *     The _long
     */
    @JsonProperty("long")
    public Double getLong() {
        return _long;
    }

    /**
     * 
     * @param _long
     *     The long
     */
    @JsonProperty("long")
    public void setLong(Double _long) {
        this._long = _long;
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
