package defpackage;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class r02 {
    public static final boolean[] A;
    public static final int[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;
    public static final int v = c(2, 2, 2, 0);
    public static final int w;
    public static final int[] x;
    public static final int[] y;
    public static final int[] z;
    public final ArrayList a = new ArrayList();
    public final SpannableStringBuilder b = new SpannableStringBuilder();
    public boolean c;
    public boolean d;
    public int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;

    static {
        int iC = c(0, 0, 0, 0);
        w = iC;
        int iC2 = c(0, 0, 0, 3);
        x = new int[]{0, 0, 0, 0, 0, 2, 0};
        y = new int[]{0, 0, 0, 0, 0, 0, 2};
        z = new int[]{3, 3, 3, 3, 3, 3, 1};
        A = new boolean[]{false, false, false, true, true, true, false};
        B = new int[]{iC, iC2, iC, iC, iC2, iC, iC};
        C = new int[]{0, 1, 2, 3, 4, 3, 4};
        D = new int[]{0, 0, 0, 0, 0, 3, 3};
        E = new int[]{iC, iC, iC, iC, iC, iC2, iC2};
    }

    public r02() {
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(int r4, int r5, int r6, int r7) {
        /*
            r0 = 4
            defpackage.fm9.g(r4, r0)
            defpackage.fm9.g(r5, r0)
            defpackage.fm9.g(r6, r0)
            defpackage.fm9.g(r7, r0)
            r0 = 0
            r1 = 1
            r2 = 255(0xff, float:3.57E-43)
            if (r7 == 0) goto L1b
            if (r7 == r1) goto L1b
            r3 = 2
            if (r7 == r3) goto L1f
            r3 = 3
            if (r7 == r3) goto L1d
        L1b:
            r7 = r2
            goto L21
        L1d:
            r7 = r0
            goto L21
        L1f:
            r7 = 127(0x7f, float:1.78E-43)
        L21:
            if (r4 <= r1) goto L25
            r4 = r2
            goto L26
        L25:
            r4 = r0
        L26:
            if (r5 <= r1) goto L2a
            r5 = r2
            goto L2b
        L2a:
            r5 = r0
        L2b:
            if (r6 <= r1) goto L2e
            r0 = r2
        L2e:
            int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r02.c(int, int, int, int):int");
    }

    public final void a(char c) {
        SpannableStringBuilder spannableStringBuilder = this.b;
        if (c != '\n') {
            spannableStringBuilder.append(c);
            return;
        }
        ArrayList arrayList = this.a;
        arrayList.add(b());
        spannableStringBuilder.clear();
        if (this.o != -1) {
            this.o = 0;
        }
        if (this.p != -1) {
            this.p = 0;
        }
        if (this.q != -1) {
            this.q = 0;
        }
        if (this.s != -1) {
            this.s = 0;
        }
        while (true) {
            if (arrayList.size() < this.j && arrayList.size() < 15) {
                this.u = arrayList.size();
                return;
            }
            arrayList.remove(0);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.o, length, 33);
            }
            if (this.p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.p, length, 33);
            }
            if (this.q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.r), this.q, length, 33);
            }
            if (this.s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.t), this.s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.a.clear();
        this.b.clear();
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.s = -1;
        this.u = 0;
        this.c = false;
        this.d = false;
        this.e = 4;
        this.f = false;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 15;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        int i = w;
        this.n = i;
        this.r = v;
        this.t = i;
    }

    public final void e(boolean z2, boolean z3) {
        int i = this.o;
        SpannableStringBuilder spannableStringBuilder = this.b;
        if (i != -1) {
            if (!z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.o, spannableStringBuilder.length(), 33);
                this.o = -1;
            }
        } else if (z2) {
            this.o = spannableStringBuilder.length();
        }
        if (this.p == -1) {
            if (z3) {
                this.p = spannableStringBuilder.length();
            }
        } else {
            if (z3) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.p, spannableStringBuilder.length(), 33);
            this.p = -1;
        }
    }

    public final void f(int i, int i2) {
        int i3 = this.q;
        SpannableStringBuilder spannableStringBuilder = this.b;
        if (i3 != -1 && this.r != i) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.r), this.q, spannableStringBuilder.length(), 33);
        }
        if (i != v) {
            this.q = spannableStringBuilder.length();
            this.r = i;
        }
        if (this.s != -1 && this.t != i2) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.t), this.s, spannableStringBuilder.length(), 33);
        }
        if (i2 != w) {
            this.s = spannableStringBuilder.length();
            this.t = i2;
        }
    }
}
