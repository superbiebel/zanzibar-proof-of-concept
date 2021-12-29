package me.superbiebel.zanzibar_poc_tests;

import me.omegabiebel.zanzibar_poc.Checker;
import me.omegabiebel.zanzibar_poc.ZObject;
import me.omegabiebel.zanzibar_poc.ZPermission;
import me.omegabiebel.zanzibar_poc.ZRelation;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;

class ZTest {
    @Test
    void historyTest() {
        ZObject doc = new ZObject();

        ZObject org = new ZObject();

        ZObject userA = new ZObject();

        ZRelation ownerRelation = new ZRelation();


        ZRelation adminRelation = new ZRelation();
        adminRelation.getObjects().add(userA);
        org.getRelations().put("admin", adminRelation);

        ownerRelation.getObjects().add(org.getRelations().get("admin"));
        doc.getRelations().put("owner", ownerRelation);


        ZPermission readPermission = new ZPermission();
        readPermission.getCalculables().add(ownerRelation);
        doc.getPermissions().put("read", readPermission);

        assertTrue(Checker.checkPermissionWithGraphTraversal(readPermission,userA));
    }
}
