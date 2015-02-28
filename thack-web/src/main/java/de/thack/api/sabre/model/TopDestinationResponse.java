
package de.thack.api.sabre.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Theme",
    "OriginLocation",
    "Destinations",
    "Links"
})
public class TopDestinationResponse {

    @JsonProperty("Theme")
    private String Theme;
    @JsonProperty("OriginLocation")
    private String OriginLocation;
    @JsonProperty("Destinations")
    private List<Destination> Destinations = new ArrayList<Destination>();
    @JsonProperty("Links")
    private List<Link> Links = new ArrayList<Link>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Theme
     */
    @JsonProperty("Theme")
    public String getTheme() {
        return Theme;
    }

    /**
     * 
     * @param Theme
     *     The Theme
     */
    @JsonProperty("Theme")
    public void setTheme(String Theme) {
        this.Theme = Theme;
    }

    /**
     * 
     * @return
     *     The OriginLocation
     */
    @JsonProperty("OriginLocation")
    public String getOriginLocation() {
        return OriginLocation;
    }

    /**
     * 
     * @param OriginLocation
     *     The OriginLocation
     */
    @JsonProperty("OriginLocation")
    public void setOriginLocation(String OriginLocation) {
        this.OriginLocation = OriginLocation;
    }

    /**
     * 
     * @return
     *     The Destinations
     */
    @JsonProperty("Destinations")
    public List<Destination> getDestinations() {
        return Destinations;
    }

    /**
     * 
     * @param Destinations
     *     The Destinations
     */
    @JsonProperty("Destinations")
    public void setDestinations(List<Destination> Destinations) {
        this.Destinations = Destinations;
    }

    /**
     * 
     * @return
     *     The Links
     */
    @JsonProperty("Links")
    public List<Link> getLinks() {
        return Links;
    }

    /**
     * 
     * @param Links
     *     The Links
     */
    @JsonProperty("Links")
    public void setLinks(List<Link> Links) {
        this.Links = Links;
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
