
package challenge.technical.habib.smoothcomm.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SmoothCommerce {

    @SerializedName("brand")
    @Expose
    private String brand;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("likes")
    @Expose
    private Integer likes;
    @SerializedName("comments")
    @Expose
    private Integer comments;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getComments() {
        return comments;
    }

    public void setComments(Integer comments) {
        this.comments = comments;
    }

}
