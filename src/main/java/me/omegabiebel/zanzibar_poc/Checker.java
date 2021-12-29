package me.omegabiebel.zanzibar_poc;

import org.jetbrains.annotations.NotNull;

public class Checker {

    private Checker() {
    }

    public static boolean checkPermissionWithGraphTraversal(@NotNull ZPermission checkable, @NotNull ZObject actor) {
        return checkable.calculateObjects().contains(actor);
    }
}
