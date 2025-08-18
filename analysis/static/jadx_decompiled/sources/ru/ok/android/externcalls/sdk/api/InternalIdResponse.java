package ru.ok.android.externcalls.sdk.api;

import defpackage.db7;
import defpackage.ig5;
import defpackage.za7;
import java.io.IOException;
import ru.ok.android.api.json.JsonTypeMismatchException;

/* loaded from: classes2.dex */
public class InternalIdResponse {
    public static final za7 PARSER = new ig5(25);
    public final String error;
    public final String name;
    public final long okId;

    public InternalIdResponse(long j, String str, String str2) {
        this.okId = j;
        this.name = str;
        this.error = str2;
    }

    public static InternalIdResponse parse(db7 db7Var) throws JsonTypeMismatchException, IOException {
        db7Var.s();
        long jW = 0;
        String strH = null;
        String strH2 = null;
        while (db7Var.hasNext()) {
            String strT = db7Var.T();
            strT.getClass();
            switch (strT) {
                case "name":
                    strH = db7Var.H();
                    break;
                case "error":
                    strH2 = db7Var.H();
                    break;
                case "ok_id":
                    jW = db7Var.w();
                    break;
                default:
                    db7Var.z();
                    break;
            }
        }
        db7Var.q();
        return new InternalIdResponse(jW, strH, strH2);
    }
}
