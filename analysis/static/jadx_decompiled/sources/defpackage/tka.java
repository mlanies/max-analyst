package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class tka {
    public final String a;
    public final CharSequence b;
    public final long c;
    public final Drawable d;
    public final od0 e;

    public tka(String str, CharSequence charSequence, long j, od0 od0Var, int i) {
        od0Var = (i & 16) != 0 ? null : od0Var;
        this.a = str;
        this.b = charSequence;
        this.c = j;
        this.d = null;
        this.e = od0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tka)) {
            return false;
        }
        tka tkaVar = (tka) obj;
        return tpa.f(this.a, tkaVar.a) && tpa.f(this.b, tkaVar.b) && this.c == tkaVar.c && tpa.f(this.d, tkaVar.d) && tpa.f(this.e, tkaVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iM = h4f.m(rh4.f(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.c);
        Drawable drawable = this.d;
        int iHashCode = (iM + (drawable == null ? 0 : drawable.hashCode())) * 31;
        od0 od0Var = this.e;
        return iHashCode + (od0Var != null ? od0Var.hashCode() : 0);
    }

    public final String toString() {
        return "AvatarParams(url=" + this.a + ", abbreviationName=" + ((Object) this.b) + ", id=" + this.c + ", placeholder=" + this.d + ", overlay=" + this.e + ")";
    }
}
