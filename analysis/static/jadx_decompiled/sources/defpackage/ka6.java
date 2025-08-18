package defpackage;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ka6 implements uod {
    public final JSONObject a;

    public ka6(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    @Override // defpackage.uod
    public final JSONObject a() {
        return this.a;
    }

    public final void b(int i, String str) {
        this.a.put(str, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ka6) && tpa.f(this.a, ((ka6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GenericCommand(params=" + this.a + ")";
    }
}
