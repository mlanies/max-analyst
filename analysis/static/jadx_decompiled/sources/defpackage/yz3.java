package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class yz3 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public final CharSequence a;
    public final Layout.Alignment b;
    public final Layout.Alignment c;
    public final Bitmap d;
    public final float e;
    public final int f;
    public final int g;
    public final float h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final int m;
    public final int n;
    public final float o;
    public final int p;
    public final float q;

    static {
        new yz3("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
        int i = oaf.a;
        r = Integer.toString(0, 36);
        s = Integer.toString(17, 36);
        t = Integer.toString(1, 36);
        u = Integer.toString(2, 36);
        v = Integer.toString(3, 36);
        w = Integer.toString(18, 36);
        x = Integer.toString(4, 36);
        y = Integer.toString(5, 36);
        z = Integer.toString(6, 36);
        A = Integer.toString(7, 36);
        B = Integer.toString(8, 36);
        C = Integer.toString(9, 36);
        D = Integer.toString(10, 36);
        E = Integer.toString(11, 36);
        F = Integer.toString(12, 36);
        G = Integer.toString(13, 36);
        H = Integer.toString(14, 36);
        I = Integer.toString(15, 36);
        J = Integer.toString(16, 36);
    }

    public yz3(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z2, int i5, int i6, float f6) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            fm9.f(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.a = charSequence.toString();
        } else {
            this.a = null;
        }
        this.b = alignment;
        this.c = alignment2;
        this.d = bitmap;
        this.e = f;
        this.f = i;
        this.g = i2;
        this.h = f2;
        this.i = i3;
        this.j = f4;
        this.k = f5;
        this.l = z2;
        this.m = i5;
        this.n = i4;
        this.o = f3;
        this.p = i6;
        this.q = f6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0140  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36, types: [android.text.Spannable, android.text.SpannableString] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.yz3 a(android.os.Bundle r29) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yz3.a(android.os.Bundle):yz3");
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            bundle.putCharSequence(r, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = q04.a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (npc npcVar : (npc[]) spanned.getSpans(0, spanned.length(), npc.class)) {
                    npcVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(npc.c, npcVar.a);
                    bundle2.putInt(npc.d, npcVar.b);
                    arrayList.add(q04.a(spanned, npcVar, 1, bundle2));
                }
                for (hpe hpeVar : (hpe[]) spanned.getSpans(0, spanned.length(), hpe.class)) {
                    hpeVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(hpe.d, hpeVar.a);
                    bundle3.putInt(hpe.e, hpeVar.b);
                    bundle3.putInt(hpe.f, hpeVar.c);
                    arrayList.add(q04.a(spanned, hpeVar, 2, bundle3));
                }
                for (do6 do6Var : (do6[]) spanned.getSpans(0, spanned.length(), do6.class)) {
                    arrayList.add(q04.a(spanned, do6Var, 3, null));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(s, arrayList);
                }
            }
        }
        bundle.putSerializable(t, this.b);
        bundle.putSerializable(u, this.c);
        bundle.putFloat(x, this.e);
        bundle.putInt(y, this.f);
        bundle.putInt(z, this.g);
        bundle.putFloat(A, this.h);
        bundle.putInt(B, this.i);
        bundle.putInt(C, this.n);
        bundle.putFloat(D, this.o);
        bundle.putFloat(E, this.j);
        bundle.putFloat(F, this.k);
        bundle.putBoolean(H, this.l);
        bundle.putInt(G, this.m);
        bundle.putInt(I, this.p);
        bundle.putFloat(J, this.q);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yz3.class != obj.getClass()) {
            return false;
        }
        yz3 yz3Var = (yz3) obj;
        if (TextUtils.equals(this.a, yz3Var.a) && this.b == yz3Var.b && this.c == yz3Var.c) {
            Bitmap bitmap = yz3Var.d;
            Bitmap bitmap2 = this.d;
            if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                if (this.e == yz3Var.e && this.f == yz3Var.f && this.g == yz3Var.g && this.h == yz3Var.h && this.i == yz3Var.i && this.j == yz3Var.j && this.k == yz3Var.k && this.l == yz3Var.l && this.m == yz3Var.m && this.n == yz3Var.n && this.o == yz3Var.o && this.p == yz3Var.p && this.q == yz3Var.q) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Float.valueOf(this.h), Integer.valueOf(this.i), Float.valueOf(this.j), Float.valueOf(this.k), Boolean.valueOf(this.l), Integer.valueOf(this.m), Integer.valueOf(this.n), Float.valueOf(this.o), Integer.valueOf(this.p), Float.valueOf(this.q)});
    }
}
