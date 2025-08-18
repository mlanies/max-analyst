package defpackage;

import org.apache.http.cookie.ClientCookie;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class eh3 {
    public final String a;
    public final String b;
    public final boolean c;
    public final khe d = new khe(new md1(22, this));

    public eh3(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public static final eh3 a(JSONObject jSONObject) {
        try {
            return new eh3(jSONObject.optString("host"), jSONObject.optString(ClientCookie.PORT_ATTR), jSONObject.optBoolean("tls", true));
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh3)) {
            return false;
        }
        eh3 eh3Var = (eh3) obj;
        return tpa.f(this.a, eh3Var.a) && tpa.f(this.b, eh3Var.b) && this.c == eh3Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + rh4.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConnectionHost{host=");
        sb.append(this.a);
        sb.append("|port=");
        sb.append(this.b);
        sb.append("|tls=");
        return au1.j(sb, this.c, "}");
    }
}
