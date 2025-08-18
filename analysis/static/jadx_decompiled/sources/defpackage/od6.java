package defpackage;

import android.net.Uri;
import java.util.List;

/* loaded from: classes.dex */
public final class od6 extends izc {
    public final Uri X;
    public final w6b Y;
    public final w6b Z;
    public final long c;
    public final CharSequence o;
    public final List s0;
    public final boolean t0;
    public final CharSequence u0;
    public final boolean v0;
    public final int w0;
    public final long x0;

    public od6(long j, String str, Uri uri, w6b w6bVar, w6b w6bVar2, List list, boolean z, CharSequence charSequence, boolean z2) {
        super(2, list);
        this.c = j;
        this.o = str;
        this.X = uri;
        this.Y = w6bVar;
        this.Z = w6bVar2;
        this.s0 = list;
        this.t0 = z;
        this.u0 = charSequence;
        this.v0 = z2;
        this.w0 = p8a.o;
        this.x0 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od6)) {
            return false;
        }
        od6 od6Var = (od6) obj;
        return this.c == od6Var.c && tpa.f(this.o, od6Var.o) && tpa.f(this.X, od6Var.X) && tpa.f(this.Y, od6Var.Y) && tpa.f(this.Z, od6Var.Z) && tpa.f(this.s0, od6Var.s0) && this.t0 == od6Var.t0 && tpa.f(this.u0, od6Var.u0) && this.v0 == od6Var.v0;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.x0;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.c) * 31;
        CharSequence charSequence = this.o;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        Uri uri = this.X;
        return Boolean.hashCode(this.v0) + rh4.f(this.u0, ms2.d(k7d.g(this.s0, (this.Z.hashCode() + ((this.Y.hashCode() + ((iHashCode2 + (uri != null ? uri.hashCode() : 0)) * 31)) * 31)) * 31, 31), 31, this.t0), 31);
    }

    @Override // defpackage.izc
    public final boolean k(izc izcVar) {
        return equals((od6) izcVar);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return this.w0;
    }

    @Override // defpackage.izc
    public final boolean m(izc izcVar) {
        return izcVar.getItemId() == this.x0;
    }

    public final String toString() {
        return "GlobalChatSearchModel(id=" + this.c + ", lastMessageTime=" + ((Object) this.o) + ", avatar=" + this.X + ", preProcessedTitle=" + this.Y + ", preProcessedSubtitle=" + this.Z + ", titleHighlights=" + this.s0 + ", isChannel=" + this.t0 + ", abbreviation=" + ((Object) this.u0) + ", isVerified=" + this.v0 + ")";
    }
}
