package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class b54 {
    public final long a;
    public final jqe b;
    public final int c;
    public final jqe d;
    public final fp3 e;

    public b54(long j, jqe jqeVar, int i, jqe jqeVar2, fp3 fp3Var) {
        this.a = j;
        this.b = jqeVar;
        this.c = i;
        this.d = jqeVar2;
        this.e = fp3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b54)) {
            return false;
        }
        b54 b54Var = (b54) obj;
        return ei4.a(this.a, b54Var.a) && tpa.f(this.b, b54Var.b) && this.c == b54Var.c && tpa.f(this.d, b54Var.d) && tpa.f(this.e, b54Var.e);
    }

    public final int hashCode() {
        AtomicLong atomicLong = ei4.b;
        int iE = k7d.e(this.c, k7d.f(Long.hashCode(this.a) * 31, 31, this.b), 31);
        jqe jqeVar = this.d;
        return this.e.hashCode() + ((iE + (jqeVar == null ? 0 : jqeVar.hashCode())) * 31);
    }

    public final String toString() {
        return "DebugSettingItem(itemId=" + ei4.b(this.a) + ", titleRes=" + this.b + ", startIconRes=" + this.c + ", upperTextRes=" + this.d + ", action=" + this.e + ")";
    }

    public /* synthetic */ b54(long j, jqe jqeVar, int i, jqe jqeVar2, fp3 fp3Var, int i2) {
        this(j, jqeVar, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : jqeVar2, (i2 & 16) != 0 ? y44.e : fp3Var);
    }
}
