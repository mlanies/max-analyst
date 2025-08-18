package ru.ok.android.externcalls.sdk;

import defpackage.qod;
import defpackage.rj3;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements qod {
    public final /* synthetic */ int a;
    public final /* synthetic */ rj3 b;

    public /* synthetic */ k(rj3 rj3Var, int i) {
        this.a = i;
        this.b = rj3Var;
    }

    @Override // defpackage.qod
    public final void j(JSONObject jSONObject) throws JSONException {
        int i = this.a;
        rj3 rj3Var = this.b;
        switch (i) {
            case 0:
                ConversationImpl.lambda$addParticipant$25(rj3Var, jSONObject);
                break;
            case 1:
                ConversationImpl.lambda$setCallOptionEnabled$24(rj3Var, jSONObject);
                break;
            default:
                ConversationImpl.lambda$addParticipant$27(rj3Var, jSONObject);
                break;
        }
    }
}
