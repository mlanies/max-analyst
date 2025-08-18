package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class nab {
    public final wm3 a;
    public final Map b;
    public final List c;

    public nab(wm3 wm3Var, LinkedHashMap linkedHashMap, ArrayList arrayList) {
        this.a = wm3Var;
        this.b = linkedHashMap;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nab)) {
            return false;
        }
        nab nabVar = (nab) obj;
        return tpa.f(this.a, nabVar.a) && tpa.f(this.b, nabVar.b) && tpa.f(this.c, nabVar.c);
    }

    public final int hashCode() {
        wm3 wm3Var = this.a;
        int iHashCode = wm3Var == null ? 0 : wm3Var.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Profile(contactInfo=");
        sb.append(this.a);
        sb.append(", restrictions=");
        sb.append(this.b);
        sb.append(", profileOptions=");
        return au1.i(sb, this.c, ")");
    }
}
