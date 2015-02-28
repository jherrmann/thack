
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
    "descriptor",
    "url",
    "apiVersion",
    "method",
    "date",
    "status",
    "query",
    "availableLanguages",
    "exchange",
    "totalCount",
    "limit",
    "offset"
})
public class Metadata {

    @JsonProperty("descriptor")
    private String descriptor;
    @JsonProperty("url")
    private String url;
    @JsonProperty("apiVersion")
    private String apiVersion;
    @JsonProperty("method")
    private String method;
    @JsonProperty("date")
    private String date;
    @JsonProperty("status")
    private String status;
    @JsonProperty("query")
    private String query;
    @JsonProperty("availableLanguages")
    private AvailableLanguages availableLanguages;
    @JsonProperty("exchange")
    private Exchange exchange;
    @JsonProperty("totalCount")
    private Integer totalCount;
    @JsonProperty("limit")
    private Integer limit;
    @JsonProperty("offset")
    private Integer offset;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The descriptor
     */
    @JsonProperty("descriptor")
    public String getDescriptor() {
        return descriptor;
    }

    /**
     * 
     * @param descriptor
     *     The descriptor
     */
    @JsonProperty("descriptor")
    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    /**
     * 
     * @return
     *     The url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The apiVersion
     */
    @JsonProperty("apiVersion")
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * 
     * @param apiVersion
     *     The apiVersion
     */
    @JsonProperty("apiVersion")
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    /**
     * 
     * @return
     *     The method
     */
    @JsonProperty("method")
    public String getMethod() {
        return method;
    }

    /**
     * 
     * @param method
     *     The method
     */
    @JsonProperty("method")
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * 
     * @return
     *     The date
     */
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    /**
     * 
     * @param date
     *     The date
     */
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The query
     */
    @JsonProperty("query")
    public String getQuery() {
        return query;
    }

    /**
     * 
     * @param query
     *     The query
     */
    @JsonProperty("query")
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * 
     * @return
     *     The availableLanguages
     */
    @JsonProperty("availableLanguages")
    public AvailableLanguages getAvailableLanguages() {
        return availableLanguages;
    }

    /**
     * 
     * @param availableLanguages
     *     The availableLanguages
     */
    @JsonProperty("availableLanguages")
    public void setAvailableLanguages(AvailableLanguages availableLanguages) {
        this.availableLanguages = availableLanguages;
    }

    /**
     * 
     * @return
     *     The exchange
     */
    @JsonProperty("exchange")
    public Exchange getExchange() {
        return exchange;
    }

    /**
     * 
     * @param exchange
     *     The exchange
     */
    @JsonProperty("exchange")
    public void setExchange(Exchange exchange) {
        this.exchange = exchange;
    }

    /**
     * 
     * @return
     *     The totalCount
     */
    @JsonProperty("totalCount")
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * 
     * @param totalCount
     *     The totalCount
     */
    @JsonProperty("totalCount")
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * 
     * @return
     *     The limit
     */
    @JsonProperty("limit")
    public Integer getLimit() {
        return limit;
    }

    /**
     * 
     * @param limit
     *     The limit
     */
    @JsonProperty("limit")
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * 
     * @return
     *     The offset
     */
    @JsonProperty("offset")
    public Integer getOffset() {
        return offset;
    }

    /**
     * 
     * @param offset
     *     The offset
     */
    @JsonProperty("offset")
    public void setOffset(Integer offset) {
        this.offset = offset;
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
