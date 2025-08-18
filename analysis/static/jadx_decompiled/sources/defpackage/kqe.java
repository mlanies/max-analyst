package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.widget.TextView;
import java.util.EnumMap;

/* loaded from: classes2.dex */
public final class kqe {
    public final boolean a;
    public final EnumMap b;
    public final EnumMap c;
    public final boolean d;
    public final long e;
    public final String f;
    public final int g;

    public kqe(boolean z, EnumMap enumMap, EnumMap enumMap2, boolean z2, long j, String str, int i) {
        this.a = z;
        this.b = enumMap;
        this.c = enumMap2;
        this.d = z2;
        this.e = j;
        this.f = str;
        this.g = i;
    }

    public final void a(TextPaint textPaint, DisplayMetrics displayMetrics, du4 du4Var) {
        textPaint.setTypeface(Typeface.create(Typeface.create(this.f, 0), rh4.b(this.g), false));
        textPaint.setLetterSpacing(ck4.d(this.e, displayMetrics));
        EnumMap enumMap = this.b;
        ck4 ck4Var = (ck4) enumMap.get(du4Var);
        if (ck4Var == null) {
            ck4Var = (ck4) x53.f0(enumMap.values());
        }
        textPaint.setTextSize(ck4.d(ck4Var.a, displayMetrics));
        textPaint.setLinearText(true);
        textPaint.setSubpixelText(true);
        textPaint.setAntiAlias(true);
    }

    public final void b(TextView textView, du4 du4Var) {
        textView.setTag(zfa.a, this);
        EnumMap enumMap = this.b;
        ck4 ck4Var = (ck4) enumMap.get(du4Var);
        if (ck4Var == null) {
            ck4Var = (ck4) x53.f0(enumMap.values());
        }
        textView.setAllCaps(this.a);
        long j = ck4Var.a;
        textView.setTextSize((int) (j >> 32), ck4.e(j));
        EnumMap enumMap2 = this.c;
        ck4 ck4Var2 = (ck4) enumMap2.get(du4Var);
        if (ck4Var2 == null) {
            ck4Var2 = (ck4) x53.f0(enumMap2.values());
        }
        textView.setLineHeight((int) ck4.d(ck4Var2.a, textView.getResources().getDisplayMetrics()));
        textView.setIncludeFontPadding(this.d);
        textView.setLetterSpacing(ck4.d(this.e, textView.getResources().getDisplayMetrics()));
        textView.setTypeface(Typeface.create(Typeface.create(this.f, 0), rh4.b(this.g), false));
    }

    public final EnumMap e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kqe)) {
            return false;
        }
        kqe kqeVar = (kqe) obj;
        return this.a == kqeVar.a && tpa.f(this.b, kqeVar.b) && tpa.f(this.c, kqeVar.c) && this.d == kqeVar.d && this.e == kqeVar.e && tpa.f(this.f, kqeVar.f) && this.g == kqeVar.g;
    }

    public final EnumMap f() {
        return this.b;
    }

    public final long g(du4 du4Var) {
        EnumMap enumMap = this.b;
        ck4 ck4Var = (ck4) enumMap.get(du4Var);
        return ck4Var != null ? ck4Var.a : ((ck4) x53.f0(enumMap.values())).a;
    }

    public final int hashCode() {
        return au1.s(this.g) + rh4.d(h4f.m(ms2.d((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        String strK = zr6.k(new StringBuilder("Dimension(encodedValue="), this.e, ")");
        StringBuilder sb = new StringBuilder("TextStyle(textAllCaps=");
        sb.append(this.a);
        sb.append(", textSizes=");
        sb.append(this.b);
        sb.append(", lineHeights=");
        sb.append(this.c);
        sb.append(", includeFontPadding=");
        sb.append(this.d);
        sb.append(", letterSpacing=");
        sb.append(strK);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontWeight=");
        int i = this.g;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "Bold" : "Semibold" : "Medium" : "Regular");
        sb.append(")");
        return sb.toString();
    }

    public kqe(boolean z, long j, long j2, boolean z2, long j3, String str, int i) {
        EnumMap enumMap = new EnumMap(du4.class);
        du4 du4Var = du4.b;
        EnumMap enumMapL = k7d.l(j, enumMap, du4Var, du4.class);
        enumMapL.put((EnumMap) du4Var, (du4) new ck4(j2));
        this(z, enumMap, enumMapL, z2, j3, str, i);
    }
}
