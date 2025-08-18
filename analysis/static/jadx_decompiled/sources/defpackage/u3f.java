package defpackage;

import android.text.Layout;

/* loaded from: classes.dex */
public final class u3f {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public epe r;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final void a(u3f u3fVar) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (u3fVar != null) {
            if (!this.c && u3fVar.c) {
                this.b = u3fVar.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = u3fVar.h;
            }
            if (this.i == -1) {
                this.i = u3fVar.i;
            }
            if (this.a == null && (str = u3fVar.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = u3fVar.f;
            }
            if (this.g == -1) {
                this.g = u3fVar.g;
            }
            if (this.n == -1) {
                this.n = u3fVar.n;
            }
            if (this.o == null && (alignment2 = u3fVar.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = u3fVar.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = u3fVar.q;
            }
            if (this.j == -1) {
                this.j = u3fVar.j;
                this.k = u3fVar.k;
            }
            if (this.r == null) {
                this.r = u3fVar.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = u3fVar.s;
            }
            if (!this.e && u3fVar.e) {
                this.d = u3fVar.d;
                this.e = true;
            }
            if (this.m != -1 || (i = u3fVar.m) == -1) {
                return;
            }
            this.m = i;
        }
    }
}
