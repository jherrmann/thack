
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
    "DestinationLocation",
    "AirportName",
    "CityName",
    "CountryCode",
    "CountryName",
    "RegionName",
    "Type"
})
public class Destination_ {

    @JsonProperty("DestinationLocation")
    private String DestinationLocation;
    @JsonProperty("AirportName")
    private String AirportName;
    @JsonProperty("CityName")
    private String CityName;
    @JsonProperty("CountryCode")
    private String CountryCode;
    @JsonProperty("CountryName")
    private String CountryName;
    @JsonProperty("RegionName")
    private String RegionName;
    @JsonProperty("Type")
    private String Type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The DestinationLocation
     */
    @JsonProperty("DestinationLocation")
    public String getDestinationLocation() {
        return DestinationLocation;
    }

    /**
     * 
     * @param DestinationLocation
     *     The DestinationLocation
     */
    @JsonProperty("DestinationLocation")
    public void setDestinationLocation(String DestinationLocation) {
        this.DestinationLocation = DestinationLocation;
    }

    /**
     * 
     * @return
     *     The AirportName
     */
    @JsonProperty("AirportName")
    public String getAirportName() {
        return AirportName;
    }

    /**
     * 
     * @param AirportName
     *     The AirportName
     */
    @JsonProperty("AirportName")
    public void setAirportName(String AirportName) {
        this.AirportName = AirportName;
    }

    /**
     * 
     * @return
     *     The CityName
     */
    @JsonProperty("CityName")
    public String getCityName() {
        return CityName;
    }

    /**
     * 
     * @param CityName
     *     The CityName
     */
    @JsonProperty("CityName")
    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    /**
     * 
     * @return
     *     The CountryCode
     */
    @JsonProperty("CountryCode")
    public String getCountryCode() {
        return CountryCode;
    }

    /**
     * 
     * @param CountryCode
     *     The CountryCode
     */
    @JsonProperty("CountryCode")
    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    /**
     * 
     * @return
     *     The CountryName
     */
    @JsonProperty("CountryName")
    public String getCountryName() {
        return CountryName;
    }

    /**
     * 
     * @param CountryName
     *     The CountryName
     */
    @JsonProperty("CountryName")
    public void setCountryName(String CountryName) {
        this.CountryName = CountryName;
    }

    /**
     * 
     * @return
     *     The RegionName
     */
    @JsonProperty("RegionName")
    public String getRegionName() {
        return RegionName;
    }

    /**
     * 
     * @param RegionName
     *     The RegionName
     */
    @JsonProperty("RegionName")
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * 
     * @return
     *     The Type
     */
    @JsonProperty("Type")
    public String getType() {
        return Type;
    }

    /**
     * 
     * @param Type
     *     The Type
     */
    @JsonProperty("Type")
    public void setType(String Type) {
        this.Type = Type;
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
