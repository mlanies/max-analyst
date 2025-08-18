package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class pxa implements ol7 {
    public final Uri X;
    public final boolean Y;
    public final boolean Z;
    public final long a;
    public final long b;
    public final CharSequence c;
    public final jqe o;
    public final gza s0;
    public final CharSequence t0;
    public final boolean u0;
    public final long v0;

    public pxa(long j, long j2, CharSequence charSequence, jqe jqeVar, Uri uri, boolean z, boolean z2, gza gzaVar, CharSequence charSequence2, boolean z3) {
        this.a = j;
        this.b = j2;
        this.c = charSequence;
        this.o = jqeVar;
        this.X = uri;
        this.Y = z;
        this.Z = z2;
        this.s0 = gzaVar;
        this.t0 = charSequence2;
        this.u0 = z3;
        this.v0 = gzaVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxa)) {
            return false;
        }
        pxa pxaVar = (pxa) obj;
        return this.a == pxaVar.a && this.b == pxaVar.b && tpa.f(this.c, pxaVar.c) && tpa.f(this.o, pxaVar.o) && tpa.f(this.X, pxaVar.X) && this.Y == pxaVar.Y && this.Z == pxaVar.Z && tpa.f(this.s0, pxaVar.s0) && tpa.f(this.t0, pxaVar.t0) && this.u0 == pxaVar.u0;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.v0;
    }

    @Override // defpackage.ol7
    public final boolean h(ol7 ol7Var) {
        return this.v0 == ol7Var.getItemId();
    }

    public final int hashCode() {
        int iF = rh4.f(this.c, h4f.m(Long.hashCode(this.a) * 31, 31, this.b), 31);
        jqe jqeVar = this.o;
        int iHashCode = (iF + (jqeVar == null ? 0 : jqeVar.hashCode())) * 31;
        Uri uri = this.X;
        return Boolean.hashCode(this.u0) + rh4.f(this.t0, (this.s0.hashCode() + ms2.d(ms2.d((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31, 31, this.Y), 31, this.Z)) * 31, 31);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return 0;
    }

    @Override // defpackage.ol7
    public final Object n(Object obj) {
        ol7 ol7Var = (ol7) obj;
        pxa pxaVar = ol7Var instanceof pxa ? (pxa) ol7Var : null;
        if (pxaVar == null) {
            return null;
        }
        boolean z = this.Y;
        boolean z2 = pxaVar.Y;
        if (z != z2) {
            return new oxa(z2);
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PickerChatListItem(id=");
        sb.append(this.a);
        sb.append(", avatarSourceId=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append((Object) this.c);
        sb.append(", subtitle=");
        sb.append(this.o);
        sb.append(", avatar=");
        sb.append(this.X);
        sb.append(", isOnline=");
        sb.append(this.Y);
        sb.append(", isVerified=");
        sb.append(this.Z);
        sb.append(", entity=");
        sb.append(this.s0);
        sb.append(", abbreviation=");
        sb.append((Object) this.t0);
        sb.append(", isEnabled=");
        return au1.j(sb, this.u0, ")");
    }
}
