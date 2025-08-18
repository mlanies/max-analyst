package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class s81 {
    public final boolean a;
    public final Map b;

    public s81(Map map, boolean z) {
        this.a = z;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s81)) {
            return false;
        }
        s81 s81Var = (s81) obj;
        return this.a == s81Var.a && tpa.f(this.b, s81Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SelectedMode(isEnabled=" + this.a + ", selectedIds=" + this.b + ")";
    }

    public /* synthetic */ s81() {
        this(oz4.a, false);
    }
}
