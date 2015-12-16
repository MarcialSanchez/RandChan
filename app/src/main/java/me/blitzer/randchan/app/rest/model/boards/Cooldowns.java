
package me.blitzer.randchan.app.rest.model.boards;

import java.util.HashMap;
import java.util.Map;

public class Cooldowns {

    private Integer threads;
    private Integer replies;
    private Integer images;
    private Integer repliesIntra;
    private Integer imagesIntra;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The threads
     */
    public Integer getThreads() {
        return threads;
    }

    /**
     * 
     * @param threads
     *     The threads
     */
    public void setThreads(Integer threads) {
        this.threads = threads;
    }

    /**
     * 
     * @return
     *     The replies
     */
    public Integer getReplies() {
        return replies;
    }

    /**
     * 
     * @param replies
     *     The replies
     */
    public void setReplies(Integer replies) {
        this.replies = replies;
    }

    /**
     * 
     * @return
     *     The images
     */
    public Integer getImages() {
        return images;
    }

    /**
     * 
     * @param images
     *     The images
     */
    public void setImages(Integer images) {
        this.images = images;
    }

    /**
     * 
     * @return
     *     The repliesIntra
     */
    public Integer getRepliesIntra() {
        return repliesIntra;
    }

    /**
     * 
     * @param repliesIntra
     *     The replies_intra
     */
    public void setRepliesIntra(Integer repliesIntra) {
        this.repliesIntra = repliesIntra;
    }

    /**
     * 
     * @return
     *     The imagesIntra
     */
    public Integer getImagesIntra() {
        return imagesIntra;
    }

    /**
     * 
     * @param imagesIntra
     *     The images_intra
     */
    public void setImagesIntra(Integer imagesIntra) {
        this.imagesIntra = imagesIntra;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
