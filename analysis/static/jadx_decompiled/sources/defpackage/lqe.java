package defpackage;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class lqe {
    public final float a;
    public final CharSequence b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final TextUtils.TruncateAt f;
    public final es8 g;
    public final int h;
    public final int i;
    public final boolean j;

    public /* synthetic */ lqe(float f, CharSequence charSequence, boolean z, boolean z2, int i) {
        this(f, charSequence, z, (i & 8) != 0 ? false : z2, Integer.MAX_VALUE, null, null, 0, 0);
    }

    public static lqe a(lqe lqeVar, CharSequence charSequence, int i, int i2) {
        if ((i2 & 2) != 0) {
            charSequence = lqeVar.b;
        }
        CharSequence charSequence2 = charSequence;
        boolean z = (i2 & 8) != 0 ? lqeVar.d : false;
        if ((i2 & 16) != 0) {
            i = lqeVar.e;
        }
        return new lqe(lqeVar.a, charSequence2, lqeVar.c, z, i, lqeVar.f, lqeVar.g, lqeVar.h, lqeVar.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqe)) {
            return false;
        }
        lqe lqeVar = (lqe) obj;
        return Float.compare(this.a, lqeVar.a) == 0 && tpa.f(this.b, lqeVar.b) && this.c == lqeVar.c && this.d == lqeVar.d && this.e == lqeVar.e && this.f == lqeVar.f && tpa.f(this.g, lqeVar.g) && this.h == lqeVar.h && this.i == lqeVar.i;
    }

    public final int hashCode() {
        int iE = k7d.e(this.e, ms2.d(ms2.d(rh4.f(this.b, Float.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31);
        TextUtils.TruncateAt truncateAt = this.f;
        int iHashCode = (iE + (truncateAt == null ? 0 : truncateAt.hashCode())) * 31;
        es8 es8Var = this.g;
        return Integer.hashCode(this.i) + k7d.e(this.h, (iHashCode + (es8Var != null ? es8Var.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreprocessTextResult(textSize=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append((Object) this.b);
        sb.append(", includeFontPadding=");
        sb.append(this.c);
        sb.append(", postProcessing=");
        sb.append(this.d);
        sb.append(", maxLines=");
        sb.append(this.e);
        sb.append(", truncateAt=");
        sb.append(this.f);
        sb.append(", replied=");
        sb.append(this.g);
        sb.append(", startPadding=");
        sb.append(this.h);
        sb.append(", endPadding=");
        return zr6.j(sb, this.i, ")");
    }

    public lqe(float f, CharSequence charSequence, boolean z, boolean z2, int i, TextUtils.TruncateAt truncateAt, es8 es8Var, int i2, int i3) {
        this.a = f;
        this.b = charSequence;
        this.c = z;
        this.d = z2;
        this.e = i;
        this.f = truncateAt;
        this.g = es8Var;
        this.h = i2;
        this.i = i3;
        this.j = i != Integer.MAX_VALUE;
    }
}
