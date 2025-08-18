package defpackage;

import android.net.Uri;
import java.util.List;

/* loaded from: classes.dex */
public final class vq2 extends izc {
    public final boolean A0;
    public final boolean B0;
    public final boolean C0;
    public final boolean D0;
    public final CharSequence E0;
    public final boolean F0;
    public final int G0;
    public final long H0;
    public final boolean X;
    public final boolean Y;
    public final boolean Z;
    public final long c;
    public final boolean o;
    public final CharSequence s0;
    public final int t0;
    public final l62 u0;
    public final Uri v0;
    public final long w0;
    public final w6b x0;
    public final CharSequence y0;
    public final List z0;

    public vq2(long j, boolean z, boolean z2, boolean z3, boolean z4, String str, int i, l62 l62Var, Uri uri, long j2, w6b w6bVar, CharSequence charSequence, List list, boolean z5, boolean z6, boolean z7, boolean z8, CharSequence charSequence2, boolean z9) {
        super(1, list);
        this.c = j;
        this.o = z;
        this.X = z2;
        this.Y = z3;
        this.Z = z4;
        this.s0 = str;
        this.t0 = i;
        this.u0 = l62Var;
        this.v0 = uri;
        this.w0 = j2;
        this.x0 = w6bVar;
        this.y0 = charSequence;
        this.z0 = list;
        this.A0 = z5;
        this.B0 = z6;
        this.C0 = z7;
        this.D0 = z8;
        this.E0 = charSequence2;
        this.F0 = z9;
        this.G0 = p8a.l;
        this.H0 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vq2)) {
            return false;
        }
        vq2 vq2Var = (vq2) obj;
        return this.c == vq2Var.c && this.o == vq2Var.o && this.X == vq2Var.X && this.Y == vq2Var.Y && this.Z == vq2Var.Z && tpa.f(this.s0, vq2Var.s0) && this.t0 == vq2Var.t0 && this.u0 == vq2Var.u0 && tpa.f(this.v0, vq2Var.v0) && this.w0 == vq2Var.w0 && tpa.f(this.x0, vq2Var.x0) && tpa.f(this.y0, vq2Var.y0) && tpa.f(this.z0, vq2Var.z0) && this.A0 == vq2Var.A0 && this.B0 == vq2Var.B0 && this.C0 == vq2Var.C0 && this.D0 == vq2Var.D0 && tpa.f(this.E0, vq2Var.E0) && this.F0 == vq2Var.F0;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.H0;
    }

    public final int hashCode() {
        int iD = ms2.d(ms2.d(ms2.d(ms2.d(Long.hashCode(this.c) * 31, 31, this.o), 31, this.X), 31, this.Y), 31, this.Z);
        CharSequence charSequence = this.s0;
        int iHashCode = (this.u0.hashCode() + k7d.e(this.t0, (iD + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31)) * 31;
        Uri uri = this.v0;
        int iHashCode2 = (this.x0.hashCode() + h4f.m((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.w0)) * 31;
        CharSequence charSequence2 = this.y0;
        return Boolean.hashCode(this.F0) + rh4.f(this.E0, ms2.d(ms2.d(ms2.d(ms2.d(ms2.d(k7d.g(this.z0, (iHashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31, 31), 31, this.A0), 31, this.B0), 31, this.C0), 31, this.D0), 31, false), 31);
    }

    @Override // defpackage.izc
    public final boolean k(izc izcVar) {
        return equals((vq2) izcVar);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return this.G0;
    }

    @Override // defpackage.izc
    public final boolean m(izc izcVar) {
        return izcVar.getItemId() == this.H0;
    }

    public final String toString() {
        String strX = pag.x(this.x0.a);
        String strX2 = pag.x(this.y0);
        String strN0 = x53.n0(this.z0, null, null, null, new we1(23), 31);
        StringBuilder sb = new StringBuilder("ChatSearchModel(id=");
        sb.append(this.c);
        sb.append(", viewType=");
        sb.append(this.G0);
        sb.append(", itemId=");
        sb.append(this.H0);
        sb.append(", isPinned=");
        sb.append(this.o);
        sb.append(", isMuted=");
        sb.append(this.X);
        sb.append(", hasUnreadReplyOrMention=");
        sb.append(this.Y);
        sb.append(", hasReaction=");
        sb.append(this.Z);
        sb.append(", lastMessageTime=");
        sb.append((Object) this.s0);
        sb.append(", unreadCount=");
        sb.append(this.t0);
        sb.append(", status=");
        sb.append(this.u0);
        sb.append(", avatar=");
        sb.append(this.v0);
        sb.append(", avatarSourceId=");
        sb.append(this.w0);
        sb.append(", preProcessedChatTitle=");
        sb.append((Object) strX);
        sb.append(", subtitle=");
        sb.append((Object) strX2);
        sb.append(", titleHighlights=");
        sb.append(strN0);
        sb.append(", isChannel=");
        sb.append(this.A0);
        sb.append(", highlightTitle=");
        sb.append(this.B0);
        sb.append(", highlightLink=");
        sb.append(this.C0);
        sb.append(", highlightContactName=");
        sb.append(this.D0);
        sb.append(", selected=false, abbreviation=*, isVerified=");
        return au1.j(sb, this.F0, ")");
    }
}
