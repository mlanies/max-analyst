package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.util.List;

/* loaded from: classes.dex */
public final class x3f implements obe {
    public final String X;
    public final float Y;
    public final int Z;
    public final wpa a = new wpa();
    public final boolean b;
    public final int c;
    public final int o;

    public x3f(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.c = 0;
            this.o = -1;
            this.X = "sans-serif";
            this.b = false;
            this.Y = 0.85f;
            this.Z = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.c = bArr[24];
        this.o = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.X = "Serif".equals(new String(bArr, 43, bArr.length - 43, b52.c)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.Z = i;
        boolean z = (bArr[0] & 32) != 0;
        this.b = z;
        if (z) {
            this.Y = oaf.i(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.Y = 0.85f;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.obe
    public final void G(byte[] bArr, int i, int i2, nbe nbeVar, pj3 pj3Var) {
        String strS;
        wpa wpaVar = this.a;
        wpaVar.E(i + i2, bArr);
        wpaVar.G(i);
        int i3 = 2;
        int i4 = 0;
        fm9.f(wpaVar.a() >= 2);
        int iA = wpaVar.A();
        if (iA == 0) {
            strS = "";
        } else {
            int i5 = wpaVar.b;
            Charset charsetC = wpaVar.C();
            int i6 = iA - (wpaVar.b - i5);
            if (charsetC == null) {
                charsetC = b52.c;
            }
            strS = wpaVar.s(i6, charsetC);
        }
        if (strS.isEmpty()) {
            ls5 ls5Var = zw6.b;
            pj3Var.accept(new b04(-9223372036854775807L, -9223372036854775807L, ffc.X));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strS);
        b(spannableStringBuilder, this.c, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.o, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.X;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fI = this.Y;
        while (wpaVar.a() >= 8) {
            int i7 = wpaVar.b;
            int iG = wpaVar.g();
            int iG2 = wpaVar.g();
            if (iG2 == 1937013100) {
                fm9.f(wpaVar.a() >= i3 ? 1 : i4);
                int iA2 = wpaVar.A();
                int i8 = i4;
                while (i8 < iA2) {
                    fm9.f(wpaVar.a() >= 12 ? 1 : i4);
                    int iA3 = wpaVar.A();
                    int iA4 = wpaVar.A();
                    wpaVar.H(i3);
                    int iU = wpaVar.u();
                    wpaVar.H(1);
                    int iG3 = wpaVar.g();
                    if (iA4 > spannableStringBuilder.length()) {
                        StringBuilder sbN = rh4.n(iA4, "Truncating styl end (", ") to cueText.length() (");
                        sbN.append(spannableStringBuilder.length());
                        sbN.append(").");
                        z04.c0(sbN.toString());
                        iA4 = spannableStringBuilder.length();
                    }
                    if (iA3 >= iA4) {
                        z04.c0("Ignoring styl with start (" + iA3 + ") >= end (" + iA4 + ").");
                    } else {
                        int i9 = iA4;
                        b(spannableStringBuilder, iU, this.c, iA3, i9, 0);
                        a(spannableStringBuilder, iG3, this.o, iA3, i9, 0);
                    }
                    i8++;
                    i3 = 2;
                    i4 = 0;
                }
            } else if (iG2 == 1952608120 && this.b) {
                i3 = 2;
                fm9.f(wpaVar.a() >= 2);
                fI = oaf.i(wpaVar.A() / this.Z, 0.0f, 0.95f);
            } else {
                i3 = 2;
            }
            wpaVar.G(i7 + iG);
            i4 = 0;
        }
        pj3Var.accept(new b04(-9223372036854775807L, -9223372036854775807L, zw6.n(new yz3(spannableStringBuilder, null, null, null, fI, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f))));
    }

    @Override // defpackage.obe
    public final int J() {
        return 2;
    }
}
