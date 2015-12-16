
package me.blitzer.randchan.app.rest.model.boards;

import java.util.HashMap;
import java.util.Map;

public class Board {

    private String board;
    private String title;
    private Integer wsBoard;
    private Integer perPage;
    private Integer pages;
    private Integer maxFilesize;
    private Integer maxWebmFilesize;
    private Integer maxCommentChars;
    private Integer bumpLimit;
    private Integer imageLimit;
    private Cooldowns cooldowns;
    private String metaDescription;
    private Integer isArchived;
    private Integer spoilers;
    private Integer customSpoilers;
    private Integer userIds;
    private Integer codeTags;
    private Integer countryFlags;
    private Integer sjisTags;
    private Integer mathTags;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The board
     */
    public String getBoard() {
        return board;
    }

    /**
     * 
     * @param board
     *     The board
     */
    public void setBoard(String board) {
        this.board = board;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The wsBoard
     */
    public Integer getWsBoard() {
        return wsBoard;
    }

    /**
     * 
     * @param wsBoard
     *     The ws_board
     */
    public void setWsBoard(Integer wsBoard) {
        this.wsBoard = wsBoard;
    }

    /**
     * 
     * @return
     *     The perPage
     */
    public Integer getPerPage() {
        return perPage;
    }

    /**
     * 
     * @param perPage
     *     The per_page
     */
    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    /**
     * 
     * @return
     *     The pages
     */
    public Integer getPages() {
        return pages;
    }

    /**
     * 
     * @param pages
     *     The pages
     */
    public void setPages(Integer pages) {
        this.pages = pages;
    }

    /**
     * 
     * @return
     *     The maxFilesize
     */
    public Integer getMaxFilesize() {
        return maxFilesize;
    }

    /**
     * 
     * @param maxFilesize
     *     The max_filesize
     */
    public void setMaxFilesize(Integer maxFilesize) {
        this.maxFilesize = maxFilesize;
    }

    /**
     * 
     * @return
     *     The maxWebmFilesize
     */
    public Integer getMaxWebmFilesize() {
        return maxWebmFilesize;
    }

    /**
     * 
     * @param maxWebmFilesize
     *     The max_webm_filesize
     */
    public void setMaxWebmFilesize(Integer maxWebmFilesize) {
        this.maxWebmFilesize = maxWebmFilesize;
    }

    /**
     * 
     * @return
     *     The maxCommentChars
     */
    public Integer getMaxCommentChars() {
        return maxCommentChars;
    }

    /**
     * 
     * @param maxCommentChars
     *     The max_comment_chars
     */
    public void setMaxCommentChars(Integer maxCommentChars) {
        this.maxCommentChars = maxCommentChars;
    }

    /**
     * 
     * @return
     *     The bumpLimit
     */
    public Integer getBumpLimit() {
        return bumpLimit;
    }

    /**
     * 
     * @param bumpLimit
     *     The bump_limit
     */
    public void setBumpLimit(Integer bumpLimit) {
        this.bumpLimit = bumpLimit;
    }

    /**
     * 
     * @return
     *     The imageLimit
     */
    public Integer getImageLimit() {
        return imageLimit;
    }

    /**
     * 
     * @param imageLimit
     *     The image_limit
     */
    public void setImageLimit(Integer imageLimit) {
        this.imageLimit = imageLimit;
    }

    /**
     * 
     * @return
     *     The cooldowns
     */
    public Cooldowns getCooldowns() {
        return cooldowns;
    }

    /**
     * 
     * @param cooldowns
     *     The cooldowns
     */
    public void setCooldowns(Cooldowns cooldowns) {
        this.cooldowns = cooldowns;
    }

    /**
     * 
     * @return
     *     The metaDescription
     */
    public String getMetaDescription() {
        return metaDescription;
    }

    /**
     * 
     * @param metaDescription
     *     The meta_description
     */
    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    /**
     * 
     * @return
     *     The isArchived
     */
    public Integer getIsArchived() {
        return isArchived;
    }

    /**
     * 
     * @param isArchived
     *     The is_archived
     */
    public void setIsArchived(Integer isArchived) {
        this.isArchived = isArchived;
    }

    /**
     * 
     * @return
     *     The spoilers
     */
    public Integer getSpoilers() {
        return spoilers;
    }

    /**
     * 
     * @param spoilers
     *     The spoilers
     */
    public void setSpoilers(Integer spoilers) {
        this.spoilers = spoilers;
    }

    /**
     * 
     * @return
     *     The customSpoilers
     */
    public Integer getCustomSpoilers() {
        return customSpoilers;
    }

    /**
     * 
     * @param customSpoilers
     *     The custom_spoilers
     */
    public void setCustomSpoilers(Integer customSpoilers) {
        this.customSpoilers = customSpoilers;
    }

    /**
     * 
     * @return
     *     The userIds
     */
    public Integer getUserIds() {
        return userIds;
    }

    /**
     * 
     * @param userIds
     *     The user_ids
     */
    public void setUserIds(Integer userIds) {
        this.userIds = userIds;
    }

    /**
     * 
     * @return
     *     The codeTags
     */
    public Integer getCodeTags() {
        return codeTags;
    }

    /**
     * 
     * @param codeTags
     *     The code_tags
     */
    public void setCodeTags(Integer codeTags) {
        this.codeTags = codeTags;
    }

    /**
     * 
     * @return
     *     The countryFlags
     */
    public Integer getCountryFlags() {
        return countryFlags;
    }

    /**
     * 
     * @param countryFlags
     *     The country_flags
     */
    public void setCountryFlags(Integer countryFlags) {
        this.countryFlags = countryFlags;
    }

    /**
     * 
     * @return
     *     The sjisTags
     */
    public Integer getSjisTags() {
        return sjisTags;
    }

    /**
     * 
     * @param sjisTags
     *     The sjis_tags
     */
    public void setSjisTags(Integer sjisTags) {
        this.sjisTags = sjisTags;
    }

    /**
     * 
     * @return
     *     The mathTags
     */
    public Integer getMathTags() {
        return mathTags;
    }

    /**
     * 
     * @param mathTags
     *     The math_tags
     */
    public void setMathTags(Integer mathTags) {
        this.mathTags = mathTags;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
