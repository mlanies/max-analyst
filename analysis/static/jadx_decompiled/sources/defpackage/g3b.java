package defpackage;

import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g3b {
    public int b;
    public long c;
    public long d;
    public float e;
    public long f;
    public int g;
    public CharSequence h;
    public long i;
    public Bundle k;
    public final ArrayList a = new ArrayList();
    public long j = -1;

    public final void a(h3b h3bVar) {
        this.a.add(h3bVar);
    }

    public final i3b b() {
        return new i3b(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.a, this.j, this.k);
    }

    public final void c(long j) {
        this.f = j;
    }

    public final void d(long j) {
        this.j = j;
    }

    public final void e(long j) {
        this.d = j;
    }

    public final void f(int i, String str) {
        this.g = i;
        this.h = str;
    }

    public final void g(Bundle bundle) {
        this.k = bundle;
    }

    public final void h(int i, long j, float f, long j2) {
        this.b = i;
        this.c = j;
        this.i = j2;
        this.e = f;
    }
}
