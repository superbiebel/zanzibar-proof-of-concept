package me.omegabiebel.zanzibar_poc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import me.omegabiebel.zanzibar_poc.interfaces.ZCalculable;

public class ZObject implements ZCalculable {
    public String type;
    public Map<String, List<ZRelation>> relations = new HashMap<>();
    public Map<String, List<ZPermission>> permissions = new HashMap<>();

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
        List<ZPermission> match;
        if ((match = permissions.get(name)) == null) {
            match = new ArrayList<>(1);
        }
        match.add(relation);
    }
    public void removePermission(String name) {
        permissions.remove(name);
    }
    public void removePermission(String name, ZPermission relation) {
        List<ZPermission> match = permissions.get(name);
        match.remove(relation);
    }
}
