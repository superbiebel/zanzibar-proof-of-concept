package me.superbiebel.zanzibar_poc_tests;

import me.omegabiebel.zanzibar_poc.ZObject;
import me.omegabiebel.zanzibar_poc.ZPermission;
import me.omegabiebel.zanzibar_poc.ZRelation;
import org.junit.jupiter.api.Test;

class ZTest {
    @Test
    void historyTest() {
        ZObject doc = new ZObject();

        ZObject org = new ZObject();

        ZRelation ownerRelation = new ZRelation();
        ownerRelation.objects.put();


        ZPermission readPermission = new ZPermission();
        readPermission.calculables.add(ownerRelation);
        doc.addPermission("readPermission", readPermission);
    }
}
