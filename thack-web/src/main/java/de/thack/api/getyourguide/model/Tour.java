
package de.thack.api.getyourguide.model;

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
    "tour_id",
    "tour_code",
    "cond_language",
    "title",
    "abstract",
    "bestseller",
    "overall_rating",
    "number_of_ratings",
    "pictures",
    "coordinates",
    "price",
    "categories",
    "locations",
    "url",
    "durations"
})
public class Tour {

    @JsonProperty("tour_id")
    private Integer tourId;
    @JsonProperty("tour_code")
    private String tourCode;
    @JsonProperty("cond_language")
    private List<String> condLanguage = new ArrayList<String>();
    @JsonProperty("title")
    private String title;
    @JsonProperty("abstract")
    private String _abstract;
    @JsonProperty("bestseller")
    private Boolean bestseller;
    @JsonProperty("overall_rating")
    private Double overallRating;
    @JsonProperty("number_of_ratings")
    private Integer numberOfRatings;
    @JsonProperty("pictures")
    private List<Picture> pictures = new ArrayList<Picture>();
    @JsonProperty("coordinates")
    private Coordinates coordinates;
    @JsonProperty("price")
    private Price price;
    @JsonProperty("categories")
    private List<Category> categories = new ArrayList<Category>();
    @JsonProperty("locations")
    private List<Location> locations = new ArrayList<Location>();
    @JsonProperty("url")
    private String url;
    @JsonProperty("durations")
    private List<Duration> durations = new ArrayList<Duration>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The tourId
     */
    @JsonProperty("tour_id")
    public Integer getTourId() {
        return tourId;
    }

    /**
     * 
     * @param tourId
     *     The tour_id
     */
    @JsonProperty("tour_id")
    public void setTourId(Integer tourId) {
        this.tourId = tourId;
    }

    /**
     * 
     * @return
     *     The tourCode
     */
    @JsonProperty("tour_code")
    public String getTourCode() {
        return tourCode;
    }

    /**
     * 
     * @param tourCode
     *     The tour_code
     */
    @JsonProperty("tour_code")
    public void setTourCode(String tourCode) {
        this.tourCode = tourCode;
    }

    /**
     * 
     * @return
     *     The condLanguage
     */
    @JsonProperty("cond_language")
    public List<String> getCondLanguage() {
        return condLanguage;
    }

    /**
     * 
     * @param condLanguage
     *     The cond_language
     */
    @JsonProperty("cond_language")
    public void setCondLanguage(List<String> condLanguage) {
        this.condLanguage = condLanguage;
    }

    /**
     * 
     * @return
     *     The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The _abstract
     */
    @JsonProperty("abstract")
    public String getAbstract() {
        return _abstract;
    }

    /**
     * 
     * @param _abstract
     *     The abstract
     */
    @JsonProperty("abstract")
    public void setAbstract(String _abstract) {
        this._abstract = _abstract;
    }

    /**
     * 
     * @return
     *     The bestseller
     */
    @JsonProperty("bestseller")
    public Boolean getBestseller() {
        return bestseller;
    }

    /**
     * 
     * @param bestseller
     *     The bestseller
     */
    @JsonProperty("bestseller")
    public void setBestseller(Boolean bestseller) {
        this.bestseller = bestseller;
    }

    /**
     * 
     * @return
     *     The overallRating
     */
    @JsonProperty("overall_rating")
    public Double getOverallRating() {
        return overallRating;
    }

    /**
     * 
     * @param overallRating
     *     The overall_rating
     */
    @JsonProperty("overall_rating")
    public void setOverallRating(Double overallRating) {
        this.overallRating = overallRating;
    }

    /**
     * 
     * @return
     *     The numberOfRatings
     */
    @JsonProperty("number_of_ratings")
    public Integer getNumberOfRatings() {
        return numberOfRatings;
    }

    /**
     * 
     * @param numberOfRatings
     *     The number_of_ratings
     */
    @JsonProperty("number_of_ratings")
    public void setNumberOfRatings(Integer numberOfRatings) {
        this.numberOfRatings = numberOfRatings;
    }

    /**
     * 
     * @return
     *     The pictures
     */
    @JsonProperty("pictures")
    public List<Picture> getPictures() {
        return pictures;
    }

    /**
     * 
     * @param pictures
     *     The pictures
     */
    @JsonProperty("pictures")
    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }

    /**
     * 
     * @return
     *     The coordinates
     */
    @JsonProperty("coordinates")
    public Coordinates getCoordinates() {
        return coordinates;
    }

    /**
     * 
     * @param coordinates
     *     The coordinates
     */
    @JsonProperty("coordinates")
    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * 
     * @return
     *     The price
     */
    @JsonProperty("price")
    public Price getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    @JsonProperty("price")
    public void setPrice(Price price) {
        this.price = price;
    }

    /**
     * 
     * @return
     *     The categories
     */
    @JsonProperty("categories")
    public List<Category> getCategories() {
        return categories;
    }

    /**
     * 
     * @param categories
     *     The categories
     */
    @JsonProperty("categories")
    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    /**
     * 
     * @return
     *     The locations
     */
    @JsonProperty("locations")
    public List<Location> getLocations() {
        return locations;
    }

    /**
     * 
     * @param locations
     *     The locations
     */
    @JsonProperty("locations")
    public void setLocations(List<Location> locations) {
        this.locations = locations;
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
     *     The durations
     */
    @JsonProperty("durations")
    public List<Duration> getDurations() {
        return durations;
    }

    /**
     * 
     * @param durations
     *     The durations
     */
    @JsonProperty("durations")
    public void setDurations(List<Duration> durations) {
        this.durations = durations;
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
