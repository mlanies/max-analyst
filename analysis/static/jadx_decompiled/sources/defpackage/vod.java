package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class vod implements uod {
    public final oq0 a;

    public vod(oq0 oq0Var) {
        this.a = oq0Var;
    }

    @Override // defpackage.uod
    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("command", "update-media-modifiers");
        oq0 oq0Var = this.a;
        oq0Var.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("denoise", oq0Var.a);
            jSONObject.put("denoiseAnn", oq0Var.b);
        } catch (Exception unused) {
        }
        return jSONObjectPut.put("mediaModifiers", jSONObject);
    }
}
