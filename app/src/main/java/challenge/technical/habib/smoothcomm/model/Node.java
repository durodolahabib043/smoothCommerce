package challenge.technical.habib.smoothcomm.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Node {
    @SerializedName("smoothcommerce")
    @Expose
    private List<SmoothCommerce> smoothcommerce = null;

    public List<SmoothCommerce> getSmoothcommerce() {
        return smoothcommerce;
    }

    public void setSmoothcommerce(List<SmoothCommerce> smoothcommerce) {
        this.smoothcommerce = smoothcommerce;
    }

}
