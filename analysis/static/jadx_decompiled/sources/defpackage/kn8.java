package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class kn8 implements ol7 {
    public final Uri X;
    public final CharSequence Y;
    public final boolean Z;
    public final long a;
    public final CharSequence b;
    public final CharSequence c;
    public final jqe o;
    public final boolean s0;
    public final boolean t0;
    public final boolean u0;
    public final boolean v0;
    public final int w0;
    public final jqe x0;

    public kn8(long j, CharSequence charSequence, CharSequence charSequence2, jqe jqeVar, Uri uri, CharSequence charSequence3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, jqe jqeVar2) {
        this.a = j;
        this.b = charSequence;
        this.c = charSequence2;
        this.o = jqeVar;
        this.X = uri;
        this.Y = charSequence3;
        this.Z = z;
        this.s0 = z2;
        this.t0 = z3;
        this.u0 = z4;
        this.v0 = z5;
        this.w0 = i;
        this.x0 = jqeVar2;
    }

    public static kn8 k(kn8 kn8Var, boolean z) {
        return new kn8(kn8Var.a, kn8Var.b, kn8Var.c, kn8Var.o, kn8Var.X, kn8Var.Y, kn8Var.Z, kn8Var.s0, z, kn8Var.u0, kn8Var.v0, kn8Var.w0, kn8Var.x0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn8)) {
            return false;
        }
        kn8 kn8Var = (kn8) obj;
        return this.a == kn8Var.a && tpa.f(this.b, kn8Var.b) && tpa.f(this.c, kn8Var.c) && tpa.f(this.o, kn8Var.o) && tpa.f(this.X, kn8Var.X) && tpa.f(this.Y, kn8Var.Y) && this.Z == kn8Var.Z && this.s0 == kn8Var.s0 && this.t0 == kn8Var.t0 && this.u0 == kn8Var.u0 && this.v0 == kn8Var.v0 && this.w0 == kn8Var.w0 && tpa.f(this.x0, kn8Var.x0);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.a;
    }

    @Override // defpackage.ol7
    public final boolean h(ol7 ol7Var) {
        return this.a == ol7Var.getItemId();
    }

    public final int hashCode() {
        int iF = rh4.f(this.b, Long.hashCode(this.a) * 31, 31);
        CharSequence charSequence = this.c;
        int iF2 = k7d.f((iF + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.o);
        Uri uri = this.X;
        int iE = k7d.e(this.w0, ms2.d(ms2.d(ms2.d(ms2.d(ms2.d(rh4.f(this.Y, (iF2 + (uri == null ? 0 : uri.hashCode())) * 31, 31), 31, this.Z), 31, this.s0), 31, this.t0), 31, this.u0), 31, this.v0), 31);
        jqe jqeVar = this.x0;
        return iE + (jqeVar != null ? jqeVar.hashCode() : 0);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return 1;
    }

    public final String toString() {
        return "MemberListItem(id=" + this.a + ", name=" + ((Object) this.b) + ", shortName=" + ((Object) this.c) + ", subtitle=" + this.o + ", avatar=" + this.X + ", abbreviation=" + ((Object) this.Y) + ", isVerified=" + this.Z + ", isSelf=" + this.s0 + ", isOwner=" + this.t0 + ", isEnabled=" + this.u0 + ", isSelectable=" + this.v0 + ", presence=" + this.w0 + ", alias=" + this.x0 + ")";
    }
}
