package me.omegabiebel.zanzibar_poc.gates;

import me.omegabiebel.zanzibar_poc.interfaces.Permissible;
import me.omegabiebel.zanzibar_poc.interfaces.ZCalculable;

public abstract class Gate implements ZCalculable, Permissible {
    public ZCalculable calculable1;
    public ZCalculable calculable2;
}
