package me.omegabiebel.zanzibar_poc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import me.omegabiebel.zanzibar_poc.interfaces.ZCalculable;

public class ZRelation implements ZCalculable {
    public String relationName;
    public List<String> relationTypes = new ArrayList<>();
    public HashMap<String,List<ZCalculable>> objects = new HashMap<>();

    @Override
    public List<ZObject> calculateObjects() {
        return null;
    }
}
