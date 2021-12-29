package me.omegabiebel.zanzibar_poc.gates;

import java.util.List;
import me.omegabiebel.zanzibar_poc.ZObject;

public class Union extends Gate {
    @Override
    public List<ZObject> calculateObjects() {
        List<ZObject> unionList =  calculable1.calculateObjects();
        unionList.addAll(calculable2.calculateObjects());
        return unionList;
    }
}
