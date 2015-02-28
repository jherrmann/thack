
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
    "location_id",
    "type",
    "name",
    "english_name",
    "country",
    "coordinates",
    "parent_id",
    "viewport"
})
public class Location {

    @JsonProperty("location_id")
    private Integer locationId;
    @JsonProperty("type")
    private String type;
    @JsonProperty("name")
    private String name;
    @JsonProperty("english_name")
    private String englishName;
    @JsonProperty("country")
    private String country;
    @JsonProperty("coordinates")
    private Coordinates_ coordinates;
    @JsonProperty("parent_id")
    private Integer parentId;
    @JsonProperty("viewport")
    private Viewport viewport;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The locationId
     */
    @JsonProperty("location_id")
    public Integer getLocationId() {
        return locationId;
    }

    /**
     * 
     * @param locationId
     *     The location_id
     */
    @JsonProperty("location_id")
    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The englishName
     */
    @JsonProperty("english_name")
    public String getEnglishName() {
        return englishName;
    }

    /**
     * 
     * @param englishName
     *     The english_name
     */
    @JsonProperty("english_name")
    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    /**
     * 
     * @return
     *     The country
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * 
     * @param country
     *     The country
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * @return
     *     The coordinates
     */
    @JsonProperty("coordinates")
    public Coordinates_ getCoordinates() {
        return coordinates;
    }

    /**
     * 
     * @param coordinates
     *     The coordinates
     */
    @JsonProperty("coordinates")
    public void setCoordinates(Coordinates_ coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * 
     * @return
     *     The parentId
     */
    @JsonProperty("parent_id")
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 
     * @param parentId
     *     The parent_id
     */
    @JsonProperty("parent_id")
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 
     * @return
     *     The viewport
     */
    @JsonProperty("viewport")
    public Viewport getViewport() {
        return viewport;
    }

    /**
     * 
     * @param viewport
     *     The viewport
     */
    @JsonProperty("viewport")
    public void setViewport(Viewport viewport) {
        this.viewport = viewport;
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
