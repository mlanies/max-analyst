package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class wod implements uod {
    public final dpd a;
    public final boolean b;
    public final boolean c;

    public wod(dpd dpdVar, boolean z, boolean z2) {
        this.a = dpdVar;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.uod
    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "change-media-settings");
        jSONObject.put("mediaSettings", f46.p(this.a, this.b, this.c));
        return jSONObject;
    }
}
