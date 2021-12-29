package me.omegabiebel.zanzibar_poc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lombok.Getter;
import me.omegabiebel.zanzibar_poc.interfaces.Permissible;
import me.omegabiebel.zanzibar_poc.interfaces.ZCalculable;

public class ZPermission implements ZCalculable, Permissible {
    @Getter
    private final Set<ZCalculable> calculables = new HashSet<>(1);
    @Override
    public List<ZObject> calculateObjects() {
        List<ZObject> objects = new ArrayList<>();
        for (ZCalculable calculable : calculables) {
            objects.addAll(calculable.calculateObjects());
        }
        return objects;
    }
}
