
package me.blitzer.randchan.app.rest.model.catalog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Thread {

    private Long no;
    private String now;
    private String name;
    private String sub;
    private String com;
    private String filename;
    private String ext;
    private Integer w;
    private Integer h;
    private Integer tnW;
    private Integer tnH;
    private Long tim;
    private Long time;
    private String md5;
    private Integer fsize;
    private Integer resto;
    private Integer bumplimit;
    private Integer imagelimit;
    private String semanticUrl;
    private Integer customSpoiler;
    private Integer replies;
    private Integer images;
    private Integer omittedPosts;
    private Integer omittedImages;
    private List<LastReply> lastReplies = new ArrayList<LastReply>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The no
     */
    public Long getNo() {
        return no;
    }

    /**
     * 
     * @param no
     *     The no
     */
    public void setNo(Long no) {
        this.no = no;
    }

    /**
     * 
     * @return
     *     The now
     */
    public String getNow() {
        return now;
    }

    /**
     * 
     * @param now
     *     The now
     */
    public void setNow(String now) {
        this.now = now;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The sub
     */
    public String getSub() {
        return sub;
    }

    /**
     * 
     * @param sub
     *     The sub
     */
    public void setSub(String sub) {
        this.sub = sub;
    }

    /**
     * 
     * @return
     *     The com
     */
    public String getCom() {
        return com;
    }

    /**
     * 
     * @param com
     *     The com
     */
    public void setCom(String com) {
        this.com = com;
    }

    /**
     * 
     * @return
     *     The filename
     */
    public String getFilename() {
        return filename;
    }

    /**
     * 
     * @param filename
     *     The filename
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * 
     * @return
     *     The ext
     */
    public String getExt() {
        return ext;
    }

    /**
     * 
     * @param ext
     *     The ext
     */
    public void setExt(String ext) {
        this.ext = ext;
    }

    /**
     * 
     * @return
     *     The w
     */
    public Integer getW() {
        return w;
    }

    /**
     * 
     * @param w
     *     The w
     */
    public void setW(Integer w) {
        this.w = w;
    }

    /**
     * 
     * @return
     *     The h
     */
    public Integer getH() {
        return h;
    }

    /**
     * 
     * @param h
     *     The h
     */
    public void setH(Integer h) {
        this.h = h;
    }

    /**
     * 
     * @return
     *     The tnW
     */
    public Integer getTnW() {
        return tnW;
    }

    /**
     * 
     * @param tnW
     *     The tn_w
     */
    public void setTnW(Integer tnW) {
        this.tnW = tnW;
    }

    /**
     * 
     * @return
     *     The tnH
     */
    public Integer getTnH() {
        return tnH;
    }

    /**
     * 
     * @param tnH
     *     The tn_h
     */
    public void setTnH(Integer tnH) {
        this.tnH = tnH;
    }

    /**
     * 
     * @return
     *     The tim
     */
    public Long getTim() {
        return tim;
    }

    /**
     * 
     * @param tim
     *     The tim
     */
    public void setTim(Long tim) {
        this.tim = tim;
    }

    /**
     * 
     * @return
     *     The time
     */
    public Long getTime() {
        return time;
    }

    /**
     * 
     * @param time
     *     The time
     */
    public void setTime(Long time) {
        this.time = time;
    }

    /**
     * 
     * @return
     *     The md5
     */
    public String getMd5() {
        return md5;
    }

    /**
     * 
     * @param md5
     *     The md5
     */
    public void setMd5(String md5) {
        this.md5 = md5;
    }

    /**
     * 
     * @return
     *     The fsize
     */
    public Integer getFsize() {
        return fsize;
    }

    /**
     * 
     * @param fsize
     *     The fsize
     */
    public void setFsize(Integer fsize) {
        this.fsize = fsize;
    }

    /**
     * 
     * @return
     *     The resto
     */
    public Integer getResto() {
        return resto;
    }

    /**
     * 
     * @param resto
     *     The resto
     */
    public void setResto(Integer resto) {
        this.resto = resto;
    }

    /**
     * 
     * @return
     *     The bumplimit
     */
    public Integer getBumplimit() {
        return bumplimit;
    }

    /**
     * 
     * @param bumplimit
     *     The bumplimit
     */
    public void setBumplimit(Integer bumplimit) {
        this.bumplimit = bumplimit;
    }

    /**
     * 
     * @return
     *     The imagelimit
     */
    public Integer getImagelimit() {
        return imagelimit;
    }

    /**
     * 
     * @param imagelimit
     *     The imagelimit
     */
    public void setImagelimit(Integer imagelimit) {
        this.imagelimit = imagelimit;
    }

    /**
     * 
     * @return
     *     The semanticUrl
     */
    public String getSemanticUrl() {
        return semanticUrl;
    }

    /**
     * 
     * @param semanticUrl
     *     The semantic_url
     */
    public void setSemanticUrl(String semanticUrl) {
        this.semanticUrl = semanticUrl;
    }

    /**
     * 
     * @return
     *     The customSpoiler
     */
    public Integer getCustomSpoiler() {
        return customSpoiler;
    }

    /**
     * 
     * @param customSpoiler
     *     The custom_spoiler
     */
    public void setCustomSpoiler(Integer customSpoiler) {
        this.customSpoiler = customSpoiler;
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
     *     The omittedPosts
     */
    public Integer getOmittedPosts() {
        return omittedPosts;
    }

    /**
     * 
     * @param omittedPosts
     *     The omitted_posts
     */
    public void setOmittedPosts(Integer omittedPosts) {
        this.omittedPosts = omittedPosts;
    }

    /**
     * 
     * @return
     *     The omittedImages
     */
    public Integer getOmittedImages() {
        return omittedImages;
    }

    /**
     * 
     * @param omittedImages
     *     The omitted_images
     */
    public void setOmittedImages(Integer omittedImages) {
        this.omittedImages = omittedImages;
    }

    /**
     * 
     * @return
     *     The lastReplies
     */
    public List<LastReply> getLastReplies() {
        return lastReplies;
    }

    /**
     * 
     * @param lastReplies
     *     The last_replies
     */
    public void setLastReplies(List<LastReply> lastReplies) {
        this.lastReplies = lastReplies;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
