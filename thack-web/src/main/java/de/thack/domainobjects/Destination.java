
package de.thack.domainobjects;

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
    "Rank",
    "Destination"
})
public class Destination {

    @org.codehaus.jackson.annotate.JsonProperty("Rank")
    private Integer Rank;
    @JsonProperty("Destination")
    private Destination_ Destination;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Rank
     */
    @JsonProperty("Rank")
    public Integer getRank() {
        return Rank;
    }

    /**
     * 
     * @param Rank
     *     The Rank
     */
    @JsonProperty("Rank")
    public void setRank(Integer Rank) {
        this.Rank = Rank;
    }

    /**
     * 
     * @return
     *     The Destination
     */
    @JsonProperty("Destination")
    public Destination_ getDestination() {
        return Destination;
    }

    /**
     * 
     * @param Destination
     *     The Destination
     */
    @JsonProperty("Destination")
    public void setDestination(Destination_ Destination) {
        this.Destination = Destination;
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
