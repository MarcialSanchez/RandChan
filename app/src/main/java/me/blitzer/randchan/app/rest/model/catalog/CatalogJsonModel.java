
package me.blitzer.randchan.app.rest.model.catalog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CatalogJsonModel {

    private Integer page;
    private List<Thread> threads = new ArrayList<Thread>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The page
     */
    public Integer getPage() {
        return page;
    }

    /**
     * 
     * @param page
     *     The page
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * 
     * @return
     *     The threads
     */
    public List<Thread> getThreads() {
        return threads;
    }

    /**
     * 
     * @param threads
     *     The threads
     */
    public void setThreads(List<Thread> threads) {
        this.threads = threads;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
