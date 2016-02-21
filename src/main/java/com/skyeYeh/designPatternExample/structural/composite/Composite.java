package com.skyeYeh.designPatternExample.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Skye on 2016/2/18.
 * 合成物件，定義元件的行為。
 */
public class Composite extends Component {
    private final Logger logger = Logger.getLogger(this.getClass().getName());

    // 子節點。
    List<Component> components = new ArrayList<>();

    String foobar;

    public Composite(String foobar) {
        this.foobar = foobar;
    }

    /**
     * 印出合成參數。
     */
    @Override
    void operation() {
        logger.log(Level.INFO, foobar);

        components.forEach(Component::operation);
    }

    /**
     * 新增子節點。
     *
     * @param component 子節點
     */
    @Override
    void add(Component component) {
        components.add(component);
    }

    /**
     * 移除子節點。
     *
     * @param component 子節點
     */
    @Override
    void remove(Component component) {
        components.remove(component);
    }

    /**
     * 取得子節點。
     *
     * @param index 索引
     * @return 子節點
     */
    @Override
    Component getChild(int index) {
        return components.get(index);
    }
}
