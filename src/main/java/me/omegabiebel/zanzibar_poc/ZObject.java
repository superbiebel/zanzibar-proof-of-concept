package me.omegabiebel.zanzibar_poc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import me.omegabiebel.zanzibar_poc.interfaces.ZCalculable;

public class ZObject implements ZCalculable {
    public String type;
    public HashMap<String, List<ZRelation>> relations = new HashMap<>();
    public HashMap<String, List<ZCalculable>> permissions = new HashMap<>();

    @Override
    public List<ZObject> calculateObjects() {
        List<ZObject> objects = new ArrayList<>(1);
        objects.add(this);
        return objects;
    }
    public void addRelation (String name, ZRelation relation) {
        List<ZRelation> match;
        if ((match = relations.get(name)) == null) {
            match = new ArrayList<>(1);
        }
        match.add(relation);
    }
    public void removeRelation (String name) {
        relations.remove(name);
    }
    public void removeRelation(String name, ZRelation relation) {
        List<ZRelation> match = relations.get(name);
        match.remove(relation);
    }


    public void addPermission(String name, ZPermission relation) {
        List<ZCalculable> match;
        if ((match = permissions.get(name)) == null) {
            match = new ArrayList<>(1);
        }
        match.add(relation);
    }
    public void removePermission(String name) {
        permissions.remove(name);
    }
    public void removePermission(String name, ZRelation relation) {
        List<ZCalculable> match = permissions.get(name);
        match.remove(relation);
    }
}
