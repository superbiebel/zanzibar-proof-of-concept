package me.omegabiebel.zanzibar_poc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lombok.Getter;
import me.omegabiebel.zanzibar_poc.interfaces.ZCalculable;

public class ZRelation implements ZCalculable {
    @Getter
    private final Set<ZCalculable> objects = new HashSet<>();

    @Override
    public List<ZObject> calculateObjects() {
        List<ZObject> calculatedObjects = new ArrayList<>();
        objects.forEach(object -> calculatedObjects.addAll(object.calculateObjects()));
        return calculatedObjects;
    }
}
