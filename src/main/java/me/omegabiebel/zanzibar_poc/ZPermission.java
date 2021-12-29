package me.omegabiebel.zanzibar_poc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import me.omegabiebel.zanzibar_poc.interfaces.Permissible;
import me.omegabiebel.zanzibar_poc.interfaces.ZCalculable;
import org.jetbrains.annotations.NotNull;

public class ZPermission implements ZCalculable, Permissible {
    public Set<ZCalculable> calculables = new HashSet<>(1);
    @Override
    public List<ZObject> calculateObjects() {
        List<ZObject> objects = new ArrayList<>();
        for (ZCalculable calculable : calculables) {
            objects.addAll(calculable.calculateObjects());
        }
        return objects;
    }
    public void addCalculable(@NotNull ZCalculable calculable) {
        calculables.add(calculable);
    }
    public void removeCalculable(@NotNull ZCalculable calculable) {
        calculables.remove(calculable);
    }
}
