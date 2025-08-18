package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class qtf implements rtf {
    public final jqe a;
    public final List b;

    public qtf(eqe eqeVar, List list) {
        this.a = eqeVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qtf)) {
            return false;
        }
        qtf qtfVar = (qtf) obj;
        return tpa.f(this.a, qtfVar.a) && tpa.f(this.b, qtfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RequestOpenSettings(title=" + this.a + ", buttons=" + this.b + ")";
    }
}
