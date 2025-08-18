package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class v92 implements ol7 {
    public final long X;
    public final od0 Y;
    public final List Z;
    public final jqe a;
    public final jqe b;
    public final String c;
    public final CharSequence o;
    public final int s0;
    public final long t0;

    public v92(jqe jqeVar, jqe jqeVar2, String str, CharSequence charSequence, long j, od0 od0Var, List list) {
        this.a = jqeVar;
        this.b = jqeVar2;
        this.c = str;
        this.o = charSequence;
        this.X = j;
        this.Y = od0Var;
        this.Z = list;
        this.s0 = mda.e;
        this.t0 = Integer.hashCode(mda.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v92)) {
            return false;
        }
        v92 v92Var = (v92) obj;
        return tpa.f(this.a, v92Var.a) && tpa.f(this.b, v92Var.b) && tpa.f(this.c, v92Var.c) && tpa.f(this.o, v92Var.o) && this.X == v92Var.X && tpa.f(this.Y, v92Var.Y) && tpa.f(this.Z, v92Var.Z);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.t0;
    }

    public final int hashCode() {
        int iF = k7d.f(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.o;
        int iM = h4f.m((iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.X);
        od0 od0Var = this.Y;
        return this.Z.hashCode() + ((iM + (od0Var != null ? od0Var.hashCode() : 0)) * 31);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return this.s0;
    }

    public final String toString() {
        return "ChatDescriptionViewListItem(title=" + this.a + ", subtitle=" + this.b + ", avatarUrl=" + this.c + ", avatarPlaceholder=" + ((Object) this.o) + ", avatarPlaceholderId=" + this.X + ", avatarOverlayDrawable=" + this.Y + ", descriptionList=" + this.Z + ")";
    }

    public /* synthetic */ v92(jqe jqeVar, eqe eqeVar, String str, CharSequence charSequence, long j, List list, int i) {
        this(jqeVar, eqeVar, str, charSequence, j, (od0) null, (i & 64) != 0 ? nz4.a : list);
    }
}
