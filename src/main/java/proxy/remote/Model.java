package proxy.remote;

import java.io.Serializable;

/**
 * Created by wukong on 16-1-8.
 */
public class Model implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
