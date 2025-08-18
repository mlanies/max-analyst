package defpackage;

import java.net.URL;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ox4 {
    public final URL a;
    public final JSONObject b;

    public ox4(JSONObject jSONObject, String str) {
        Object njcVar;
        this.a = new URL(str);
        this.b = jSONObject;
        jSONObject.optInt("width");
        jSONObject.optInt("height");
        String strOptString = jSONObject.optString("staticUrl");
        if (strOptString != null) {
            try {
                njcVar = new URL(strOptString);
            } catch (Throwable th) {
                njcVar = new njc(th);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox4)) {
            return false;
        }
        ox4 ox4Var = (ox4) obj;
        return tpa.f(this.a, ox4Var.a) && tpa.f(this.b, ox4Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        JSONObject jSONObject = this.b;
        return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public final String toString() {
        return "Animation(url=" + this.a + ", otherProperties=" + this.b + ")";
    }
}
