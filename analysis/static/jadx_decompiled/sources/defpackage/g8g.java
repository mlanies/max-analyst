package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class g8g {
    public final String a;
    public final m7g b;
    public final d24 c;
    public final int d;
    public final int e;
    public final List f;
    public final List g;

    public g8g(String str, m7g m7gVar, d24 d24Var, int i, int i2, ArrayList arrayList, ArrayList arrayList2) {
        this.a = str;
        this.b = m7gVar;
        this.c = d24Var;
        this.d = i;
        this.e = i2;
        this.f = arrayList;
        this.g = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8g)) {
            return false;
        }
        g8g g8gVar = (g8g) obj;
        return tpa.f(this.a, g8gVar.a) && this.b == g8gVar.b && tpa.f(this.c, g8gVar.c) && this.d == g8gVar.d && this.e == g8gVar.e && tpa.f(this.f, g8gVar.f) && tpa.f(this.g, g8gVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + k7d.g(this.f, k7d.e(this.e, k7d.e(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "WorkInfoPojo(id=" + this.a + ", state=" + this.b + ", output=" + this.c + ", runAttemptCount=" + this.d + ", generation=" + this.e + ", tags=" + this.f + ", progress=" + this.g + ')';
    }
}
