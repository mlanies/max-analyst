package ru.ok.android.externcalls.sdk.api;

import defpackage.bg1;
import defpackage.db7;
import defpackage.xw0;
import defpackage.za7;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import ru.ok.android.api.json.JsonTypeMismatchException;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* loaded from: classes2.dex */
public class BatchInternalIdResponse {
    public static final za7 PARSER = new xw0(29);
    public final Map<ParticipantId, bg1> externalToInternalIdsMap;

    public BatchInternalIdResponse(Map<ParticipantId, bg1> map) {
        this.externalToInternalIdsMap = map;
    }

    public static BatchInternalIdResponse parse(db7 db7Var) throws JsonTypeMismatchException, IOException {
        HashMap map = new HashMap();
        db7Var.s();
        while (db7Var.hasNext()) {
            if (db7Var.T().equals("ids")) {
                readIdsArray(db7Var, map);
            } else {
                db7Var.z();
            }
        }
        db7Var.q();
        return new BatchInternalIdResponse(map);
    }

    private static ParticipantId readExternalId(db7 db7Var) throws JsonTypeMismatchException, IOException {
        db7Var.s();
        String strH = null;
        Boolean boolValueOf = null;
        while (db7Var.hasNext()) {
            String strT = db7Var.T();
            strT.getClass();
            if (strT.equals("id")) {
                strH = db7Var.H();
            } else if (strT.equals("ok_anonym")) {
                boolValueOf = Boolean.valueOf(db7Var.a0());
            } else {
                db7Var.z();
            }
        }
        db7Var.q();
        if (strH == null || boolValueOf == null) {
            return null;
        }
        return ParticipantId.withoutDeviceId(strH, boolValueOf.booleanValue());
    }

    private static void readIdMapping(db7 db7Var, Map<ParticipantId, bg1> map) throws JsonTypeMismatchException, IOException {
        db7Var.s();
        bg1 bg1VarA = null;
        ParticipantId externalId = null;
        while (db7Var.hasNext()) {
            String strT = db7Var.T();
            strT.getClass();
            if (strT.equals("external_user_id")) {
                externalId = readExternalId(db7Var);
            } else if (strT.equals("ok_user_id")) {
                bg1VarA = bg1.a(db7Var.H());
            } else {
                db7Var.z();
            }
        }
        db7Var.q();
        if (bg1VarA == null || externalId == null) {
            return;
        }
        map.put(externalId, bg1VarA);
    }

    private static void readIdsArray(db7 db7Var, Map<ParticipantId, bg1> map) throws JsonTypeMismatchException, IOException {
        db7Var.u();
        while (db7Var.hasNext()) {
            readIdMapping(db7Var, map);
        }
        db7Var.t();
    }
}
