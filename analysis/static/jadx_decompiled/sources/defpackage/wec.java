package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class wec extends sg8 implements uec {
    public final String f;
    public String g;
    public String h;
    public boolean i;
    public int k;
    public tec l;
    public final /* synthetic */ yec n;
    public int j = -1;
    public int m = -1;

    public wec(yec yecVar, String str) {
        this.n = yecVar;
        this.f = str;
    }

    @Override // defpackage.uec
    public final int a() {
        return this.m;
    }

    @Override // defpackage.uec
    public final void b(tec tecVar) {
        vec vecVar = new vec(this);
        this.l = tecVar;
        int i = tecVar.e;
        tecVar.e = i + 1;
        int i2 = tecVar.d;
        tecVar.d = i2 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f);
        tecVar.b(11, i2, i, null, bundle);
        tecVar.h.put(i2, vecVar);
        this.m = i;
        if (this.i) {
            tecVar.a(i);
            int i3 = this.j;
            if (i3 >= 0) {
                tecVar.c(this.m, i3);
                this.j = -1;
            }
            int i4 = this.k;
            if (i4 != 0) {
                tecVar.d(this.m, i4);
                this.k = 0;
            }
        }
    }

    @Override // defpackage.uec
    public final void c() {
        tec tecVar = this.l;
        if (tecVar != null) {
            int i = this.m;
            int i2 = tecVar.d;
            tecVar.d = i2 + 1;
            tecVar.b(4, i2, i, null, null);
            this.l = null;
            this.m = 0;
        }
    }

    @Override // defpackage.tg8
    public final void d() {
        yec yecVar = this.n;
        yecVar.v0.remove(this);
        c();
        yecVar.m();
    }

    @Override // defpackage.tg8
    public final void e() {
        this.i = true;
        tec tecVar = this.l;
        if (tecVar != null) {
            tecVar.a(this.m);
        }
    }

    @Override // defpackage.tg8
    public final void f(int i) {
        tec tecVar = this.l;
        if (tecVar != null) {
            tecVar.c(this.m, i);
        } else {
            this.j = i;
            this.k = 0;
        }
    }

    @Override // defpackage.tg8
    public final void g() {
        h(0);
    }

    @Override // defpackage.tg8
    public final void h(int i) {
        this.i = false;
        tec tecVar = this.l;
        if (tecVar != null) {
            int i2 = this.m;
            Bundle bundleG = zr6.g(i, "unselectReason");
            int i3 = tecVar.d;
            tecVar.d = i3 + 1;
            tecVar.b(6, i3, i2, null, bundleG);
        }
    }

    @Override // defpackage.tg8
    public final void i(int i) {
        tec tecVar = this.l;
        if (tecVar != null) {
            tecVar.d(this.m, i);
        } else {
            this.k += i;
        }
    }

    @Override // defpackage.sg8
    public final String j() {
        return this.g;
    }

    @Override // defpackage.sg8
    public final String k() {
        return this.h;
    }

    @Override // defpackage.sg8
    public final void m(String str) {
        tec tecVar = this.l;
        if (tecVar != null) {
            int i = this.m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i2 = tecVar.d;
            tecVar.d = i2 + 1;
            tecVar.b(12, i2, i, null, bundle);
        }
    }

    @Override // defpackage.sg8
    public final void n(String str) {
        tec tecVar = this.l;
        if (tecVar != null) {
            int i = this.m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i2 = tecVar.d;
            tecVar.d = i2 + 1;
            tecVar.b(13, i2, i, null, bundle);
        }
    }

    @Override // defpackage.sg8
    public final void o(List list) {
        tec tecVar = this.l;
        if (tecVar != null) {
            int i = this.m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i2 = tecVar.d;
            tecVar.d = i2 + 1;
            tecVar.b(14, i2, i, null, bundle);
        }
    }
}
