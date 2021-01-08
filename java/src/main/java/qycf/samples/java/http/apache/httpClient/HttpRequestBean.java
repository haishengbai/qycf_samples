package qycf.samples.java.http.apache.httpClient;


public class HttpRequestBean {

    private String aggregationId;
    private Integer identifyTopNum;
    private String image;
    private Integer minScore;


    public String getAggregationId() {
        return aggregationId;
    }

    public void setAggregationId(String aggregationId) {
        this.aggregationId = aggregationId;
    }

    public Integer getIdentifyTopNum() {
        return identifyTopNum;
    }

    public void setIdentifyTopNum(Integer identifyTopNum) {
        this.identifyTopNum = identifyTopNum;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getMinScore() {
        return minScore;
    }

    public void setMinScore(Integer minScore) {
        this.minScore = minScore;
    }
}
