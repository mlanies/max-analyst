package ru.ok.android.externcalls.sdk.api;

import defpackage.bg1;
import defpackage.db7;
import defpackage.za7;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.api.json.JsonTypeMismatchException;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;

/* loaded from: classes2.dex */
public class ExternalIdsResponse {
    public static final za7 INSTANCE = new za7() { // from class: ru.ok.android.externcalls.sdk.api.ExternalIdsResponse.1
        private void parseIds(Map<bg1, ParticipantId> map, db7 db7Var, boolean z) throws JsonTypeMismatchException, IOException {
            db7Var.s();
            while (db7Var.hasNext()) {
                String strT = db7Var.T();
                try {
                    map.put(bg1.a(strT), ParticipantId.withoutDeviceId(db7Var.H(), z));
                } catch (NumberFormatException unused) {
                    GlobalRTCLogger.log(ExternalIdsResponse.LOG_TAG, "got not parsable internal id '" + strT + "'");
                }
            }
            db7Var.q();
        }

        @Override // defpackage.za7
        public ExternalIdsResponse parse(db7 db7Var) throws JsonParseException, IOException {
            HashMap map = new HashMap();
            db7Var.s();
            while (db7Var.hasNext()) {
                String strT = db7Var.T();
                strT.getClass();
                if (strT.equals("external_ids")) {
                    parseIds(map, db7Var, false);
                } else if (strT.equals("anonym_ids")) {
                    parseIds(map, db7Var, true);
                } else {
                    db7Var.z();
                }
            }
            db7Var.q();
            return new ExternalIdsResponse(map);
        }
    };
    private static final String LOG_TAG = "ExternalIdsResponse";
    private final Map<bg1, ParticipantId> internalToExternal;

    public ExternalIdsResponse(Map<bg1, ParticipantId> map) {
        this.internalToExternal = map;
    }

    public Map<bg1, ParticipantId> getMapping() {
        return this.internalToExternal;
    }
}
