
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
    "category_id",
    "name",
    "parent_id"
})
public class Category {

    @JsonProperty("category_id")
    private Integer categoryId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("parent_id")
    private Integer parentId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The categoryId
     */
    @JsonProperty("category_id")
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * 
     * @param categoryId
     *     The category_id
     */
    @JsonProperty("category_id")
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
