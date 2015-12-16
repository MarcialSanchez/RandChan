
package me.blitzer.randchan.app.rest.model.boards;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardsJsonModel {

    private List<Board> boards = new ArrayList<Board>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The boards
     */
    public List<Board> getBoards() {
        return boards;
    }

    /**
     * 
     * @param boards
     *     The boards
     */
    public void setBoards(List<Board> boards) {
        this.boards = boards;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
