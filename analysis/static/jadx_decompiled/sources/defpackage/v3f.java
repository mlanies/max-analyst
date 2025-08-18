package defpackage;

import android.text.Layout;

/* loaded from: classes.dex */
public final class v3f {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public fpe r;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final void a(v3f v3fVar) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (v3fVar != null) {
            if (!this.c && v3fVar.c) {
                this.b = v3fVar.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = v3fVar.h;
            }
            if (this.i == -1) {
                this.i = v3fVar.i;
            }
            if (this.a == null && (str = v3fVar.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = v3fVar.f;
            }
            if (this.g == -1) {
                this.g = v3fVar.g;
            }
            if (this.n == -1) {
                this.n = v3fVar.n;
            }
            if (this.o == null && (alignment2 = v3fVar.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = v3fVar.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = v3fVar.q;
            }
            if (this.j == -1) {
                this.j = v3fVar.j;
                this.k = v3fVar.k;
            }
            if (this.r == null) {
                this.r = v3fVar.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = v3fVar.s;
            }
            if (!this.e && v3fVar.e) {
                this.d = v3fVar.d;
                this.e = true;
            }
            if (this.m != -1 || (i = v3fVar.m) == -1) {
                return;
            }
            this.m = i;
        }
    }
}
