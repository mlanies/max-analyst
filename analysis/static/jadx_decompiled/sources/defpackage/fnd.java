package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class fnd implements s29 {
    public final List a;
    public final jqe b;
    public final jqe c;
    public final List d;

    public fnd(List list, jqe jqeVar, eqe eqeVar, List list2) {
        this.a = list;
        this.b = jqeVar;
        this.c = eqeVar;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fnd)) {
            return false;
        }
        fnd fndVar = (fnd) obj;
        return tpa.f(this.a, fndVar.a) && tpa.f(this.b, fndVar.b) && tpa.f(this.c, fndVar.c) && tpa.f(this.d, fndVar.d);
    }

    public final int hashCode() {
        int iF = k7d.f(this.a.hashCode() * 31, 31, this.b);
        jqe jqeVar = this.c;
        return this.d.hashCode() + ((iF + (jqeVar == null ? 0 : jqeVar.hashCode())) * 31);
    }

    public final String toString() {
        return "ShowConfirmation(messageIds=" + this.a + ", title=" + this.b + ", description=" + this.c + ", buttons=" + this.d + ")";
    }
}
