package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class gnd extends tt2 {
    public final long a;
    public final jqe b;
    public final jqe c;
    public final List d;

    public gnd(long j, jqe jqeVar, jqe jqeVar2, List list) {
        this.a = j;
        this.b = jqeVar;
        this.c = jqeVar2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gnd)) {
            return false;
        }
        gnd gndVar = (gnd) obj;
        return this.a == gndVar.a && tpa.f(this.b, gndVar.b) && tpa.f(this.c, gndVar.c) && tpa.f(this.d, gndVar.d);
    }

    public final int hashCode() {
        int iF = k7d.f(Long.hashCode(this.a) * 31, 31, this.b);
        jqe jqeVar = this.c;
        return this.d.hashCode() + ((iF + (jqeVar == null ? 0 : jqeVar.hashCode())) * 31);
    }

    public final String toString() {
        return "ShowConfirmation(chatId=" + this.a + ", title=" + this.b + ", description=" + this.c + ", buttons=" + this.d + ")";
    }
}
