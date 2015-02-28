
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
    "_metadata",
    "data"
})
public class TourResponse {

    @JsonProperty("_metadata")
    private de.thack.api.getyourguide.model.Metadata Metadata;
    @JsonProperty("data")
    private Data data;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Metadata
     */
    @JsonProperty("_metadata")
    public de.thack.api.getyourguide.model.Metadata getMetadata() {
        return Metadata;
    }

    /**
     * 
     * @param Metadata
     *     The _metadata
     */
    @JsonProperty("_metadata")
    public void setMetadata(de.thack.api.getyourguide.model.Metadata Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * 
     * @return
     *     The data
     */
    @JsonProperty("data")
    public Data getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    @JsonProperty("data")
    public void setData(Data data) {
        this.data = data;
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
