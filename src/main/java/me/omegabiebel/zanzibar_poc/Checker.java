package me.omegabiebel.zanzibar_poc;

import java.util.List;
import me.omegabiebel.zanzibar_poc.interfaces.ZCalculable;
import org.jetbrains.annotations.NotNull;

public class Checker {

    private Checker() {
    }

    public static boolean checkPermissionWithGraphTraversal(@NotNull ZPermission checkable, @NotNull ZObject actor) {
        return getAllPossibleObjects(checkable).contains(actor);
    }
    public static List<ZObject> getAllPossibleObjects(@NotNull ZCalculable calculable) {
        return calculable.calculateObjects();
    }
}
