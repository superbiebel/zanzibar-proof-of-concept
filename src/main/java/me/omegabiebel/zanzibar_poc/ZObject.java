package me.omegabiebel.zanzibar_poc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;
import me.omegabiebel.zanzibar_poc.interfaces.ZCalculable;

public class ZObject implements ZCalculable {
    @Getter
    private String type;
    @Getter
    private final Map<String, ZRelation> relations = new HashMap<>();
    @Getter
    private final Map<String, ZPermission> permissions = new HashMap<>();

    @Override
    public List<ZObject> calculateObjects() {
        List<ZObject> objects = new ArrayList<>(1);
        objects.add(this);
        return objects;
    }
}
