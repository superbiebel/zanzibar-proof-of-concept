package me.omegabiebel.zanzibar_poc.gates;

import java.util.ArrayList;
import java.util.List;
import me.omegabiebel.zanzibar_poc.ZObject;

public class Exclusion extends Gate {

    @Override
    public List<ZObject> calculateObjects() {
        List<ZObject> calculable2List = new ArrayList<>(calculable2.calculateObjects());
        calculable2List.removeAll(calculable1.calculateObjects());
        return calculable2List;
    }
}
