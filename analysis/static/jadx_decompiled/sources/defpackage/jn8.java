package defpackage;

/* loaded from: classes2.dex */
public final class jn8 implements ol7 {
    public final boolean X;
    public final long Y;
    public final CharSequence Z;
    public final long a;
    public final CharSequence b;
    public final jqe c;
    public final String o;
    public final v5c s0;
    public final boolean t0;
    public final boolean u0;

    public jn8(long j, CharSequence charSequence, jqe jqeVar, String str, boolean z, long j2, CharSequence charSequence2, v5c v5cVar, boolean z2, boolean z3) {
        this.a = j;
        this.b = charSequence;
        this.c = jqeVar;
        this.o = str;
        this.X = z;
        this.Y = j2;
        this.Z = charSequence2;
        this.s0 = v5cVar;
        this.t0 = z2;
        this.u0 = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jn8)) {
            return false;
        }
        jn8 jn8Var = (jn8) obj;
        return this.a == jn8Var.a && tpa.f(this.b, jn8Var.b) && tpa.f(this.c, jn8Var.c) && tpa.f(this.o, jn8Var.o) && this.X == jn8Var.X && this.Y == jn8Var.Y && tpa.f(this.Z, jn8Var.Z) && tpa.f(this.s0, jn8Var.s0) && this.t0 == jn8Var.t0 && this.u0 == jn8Var.u0;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int iF = rh4.f(this.Z, h4f.m(ms2.d(rh4.d(k7d.f(rh4.f(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c), 31, this.o), 31, this.X), 31, this.Y), 31);
        v5c v5cVar = this.s0;
        return Boolean.hashCode(this.u0) + ms2.d((iF + (v5cVar == null ? 0 : v5cVar.hashCode())) * 31, 31, this.t0);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return mda.F;
    }

    @Override // defpackage.ol7
    public final Object n(Object obj) {
        ol7 ol7Var = (ol7) obj;
        if (!(ol7Var instanceof jn8)) {
            return null;
        }
        v5c v5cVar = this.s0;
        v5c v5cVar2 = ((jn8) ol7Var).s0;
        if (tpa.f(v5cVar, v5cVar2)) {
            return null;
        }
        return new in8(v5cVar2);
    }

    public final String toString() {
        return "MemberListItem(id=" + this.a + ", name=" + ((Object) this.b) + ", subtitle=" + this.c + ", avatar=" + this.o + ", isOnline=" + this.X + ", lastReadMark=" + this.Y + ", abbreviation=" + ((Object) this.Z) + ", reaction=" + ((Object) this.s0) + ", isRead=" + this.t0 + ", isSelf=" + this.u0 + ")";
    }
}
