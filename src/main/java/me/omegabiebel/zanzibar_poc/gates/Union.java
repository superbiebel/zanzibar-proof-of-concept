package me.omegabiebel.zanzibar_poc.gates;

import java.util.List;
import me.omegabiebel.zanzibar_poc.ZObject;

public class Union extends Gate {
    @Override
    public List<ZObject> calculateObjects() {
        List<ZObject> unionlist =  calculable1.calculateObjects();
        unionlist.addAll(calculable2.calculateObjects());
        return unionlist;
    }
}
