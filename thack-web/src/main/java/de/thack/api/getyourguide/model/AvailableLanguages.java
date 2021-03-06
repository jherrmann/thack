
package de.thack.api.getyourguide.model;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "0",
    "1",
    "2",
    "4"
})
@JsonIgnoreProperties(ignoreUnknown=true)
public class AvailableLanguages {

    @JsonProperty("0")
    private String _0;
    @JsonProperty("1")
    private String _1;
    @JsonProperty("2")
    private String _2;
    @JsonProperty("4")
    private String _4;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The _0
     */
    @JsonProperty("0")
    public String get0() {
        return _0;
    }

    /**
     * 
     * @param _0
     *     The 0
     */
    @JsonProperty("0")
    public void set0(String _0) {
        this._0 = _0;
    }

    /**
     * 
     * @return
     *     The _1
     */
    @JsonProperty("1")
    public String get1() {
        return _1;
    }

    /**
     * 
     * @param _1
     *     The 1
     */
    @JsonProperty("1")
    public void set1(String _1) {
        this._1 = _1;
    }

    /**
     * 
     * @return
     *     The _2
     */
    @JsonProperty("2")
    public String get2() {
        return _2;
    }

    /**
     * 
     * @param _2
     *     The 2
     */
    @JsonProperty("2")
    public void set2(String _2) {
        this._2 = _2;
    }

    /**
     * 
     * @return
     *     The _4
     */
    @JsonProperty("4")
    public String get4() {
        return _4;
    }

    /**
     * 
     * @param _4
     *     The 4
     */
    @JsonProperty("4")
    public void set4(String _4) {
        this._4 = _4;
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
