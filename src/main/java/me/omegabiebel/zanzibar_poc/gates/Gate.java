package me.omegabiebel.zanzibar_poc.gates;

import lombok.Getter;
import lombok.Setter;
import me.omegabiebel.zanzibar_poc.interfaces.Permissible;
import me.omegabiebel.zanzibar_poc.interfaces.ZCalculable;

public abstract class Gate implements ZCalculable, Permissible {
    @Getter
    @Setter
    public ZCalculable calculable1;
    @Getter
    @Setter
    public ZCalculable calculable2;

}
