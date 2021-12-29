package me.omegabiebel.zanzibar_poc.gates;

import java.util.ArrayList;
import java.util.List;
import me.omegabiebel.zanzibar_poc.ZObject;

public class Intersection extends Gate {
    @Override
    public List<ZObject> calculateObjects() {
        List<ZObject> calculableList2 = new ArrayList<>(calculable2.calculateObjects());
        return calculable1.calculateObjects().stream().filter(calculableList2::contains).toList();
    }
}
