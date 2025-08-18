package defpackage;

import android.net.Uri;
import java.util.List;

/* loaded from: classes.dex */
public final class mx8 extends izc {
    public final fs8 X;
    public final e52 Y;
    public final String Z;
    public final Uri c;
    public final List o;
    public final w6b s0;
    public final CharSequence t0;
    public final long u0;
    public final int v0;
    public final long w0;

    public mx8(Uri uri, List list, fs8 fs8Var, e52 e52Var, String str, w6b w6bVar, CharSequence charSequence, long j) {
        super(5, list);
        this.c = uri;
        this.o = list;
        this.X = fs8Var;
        this.Y = e52Var;
        this.Z = str;
        this.s0 = w6bVar;
        this.t0 = charSequence;
        this.u0 = j;
        this.v0 = p8a.r;
        this.w0 = fs8Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx8)) {
            return false;
        }
        mx8 mx8Var = (mx8) obj;
        return tpa.f(this.c, mx8Var.c) && tpa.f(this.o, mx8Var.o) && tpa.f(this.X, mx8Var.X) && tpa.f(this.Y, mx8Var.Y) && tpa.f(this.Z, mx8Var.Z) && tpa.f(this.s0, mx8Var.s0) && tpa.f(this.t0, mx8Var.t0) && this.u0 == mx8Var.u0;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.w0;
    }

    public final int hashCode() {
        Uri uri = this.c;
        int iHashCode = (this.X.hashCode() + k7d.g(this.o, (uri == null ? 0 : uri.hashCode()) * 31, 31)) * 31;
        e52 e52Var = this.Y;
        int iHashCode2 = (iHashCode + (e52Var == null ? 0 : e52Var.hashCode())) * 31;
        String str = this.Z;
        int iHashCode3 = (this.s0.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        CharSequence charSequence = this.t0;
        return Long.hashCode(this.u0) + ((iHashCode3 + (charSequence != null ? charSequence.hashCode() : 0)) * 31);
    }

    @Override // defpackage.izc
    public final boolean k(izc izcVar) {
        mx8 mx8Var = (mx8) izcVar;
        if (tpa.f(this.c, mx8Var.c)) {
            fs8 fs8Var = this.X;
            long j = fs8Var.c;
            fs8 fs8Var2 = mx8Var.X;
            if (j == fs8Var2.c && tpa.f(fs8Var.Z, fs8Var2.Z) && fs8Var.X == fs8Var2.X) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return this.v0;
    }

    @Override // defpackage.izc
    public final boolean m(izc izcVar) {
        return this.w0 == izcVar.getItemId();
    }

    public final String toString() {
        String strX = pag.x(this.t0);
        StringBuilder sb = new StringBuilder("MessageSearchModel(avatar=");
        sb.append(this.c);
        sb.append(", messageHighlights=");
        sb.append(this.o);
        sb.append(", message=");
        sb.append(this.X);
        sb.append(", chat=");
        sb.append(this.Y);
        sb.append(", feedback=");
        sb.append(this.Z);
        sb.append(", preProcessedText=");
        sb.append(this.s0);
        sb.append(", preProcessedChatTitle=");
        sb.append((Object) strX);
        sb.append(", chatId=");
        sb.append(this.u0);
        sb.append(", viewType=");
        sb.append(this.v0);
        sb.append(", itemId=");
        return zr6.k(sb, this.w0, ")");
    }
}
