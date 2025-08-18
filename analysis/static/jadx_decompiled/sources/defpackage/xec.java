package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class xec extends tg8 implements uec {
    public final String a;
    public final String b;
    public boolean c;
    public int d = -1;
    public int e;
    public tec f;
    public int g;
    public final /* synthetic */ yec h;

    public xec(yec yecVar, String str, String str2) {
        this.h = yecVar;
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.uec
    public final int a() {
        return this.g;
    }

    @Override // defpackage.uec
    public final void b(tec tecVar) {
        this.f = tecVar;
        int i = tecVar.e;
        tecVar.e = i + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.a);
        bundle.putString("routeGroupId", this.b);
        int i2 = tecVar.d;
        tecVar.d = i2 + 1;
        tecVar.b(3, i2, i, null, bundle);
        this.g = i;
        if (this.c) {
            tecVar.a(i);
            int i3 = this.d;
            if (i3 >= 0) {
                tecVar.c(this.g, i3);
                this.d = -1;
            }
            int i4 = this.e;
            if (i4 != 0) {
                tecVar.d(this.g, i4);
                this.e = 0;
            }
        }
    }

    @Override // defpackage.uec
    public final void c() {
        tec tecVar = this.f;
        if (tecVar != null) {
            int i = this.g;
            int i2 = tecVar.d;
            tecVar.d = i2 + 1;
            tecVar.b(4, i2, i, null, null);
            this.f = null;
            this.g = 0;
        }
    }

    @Override // defpackage.tg8
    public final void d() {
        yec yecVar = this.h;
        yecVar.v0.remove(this);
        c();
        yecVar.m();
    }

    @Override // defpackage.tg8
    public final void e() {
        this.c = true;
        tec tecVar = this.f;
        if (tecVar != null) {
            tecVar.a(this.g);
        }
    }

    @Override // defpackage.tg8
    public final void f(int i) {
        tec tecVar = this.f;
        if (tecVar != null) {
            tecVar.c(this.g, i);
        } else {
            this.d = i;
            this.e = 0;
        }
    }

    @Override // defpackage.tg8
    public final void g() {
        h(0);
    }

    @Override // defpackage.tg8
    public final void h(int i) {
        this.c = false;
        tec tecVar = this.f;
        if (tecVar != null) {
            int i2 = this.g;
            Bundle bundleG = zr6.g(i, "unselectReason");
            int i3 = tecVar.d;
            tecVar.d = i3 + 1;
            tecVar.b(6, i3, i2, null, bundleG);
        }
    }

    @Override // defpackage.tg8
    public final void i(int i) {
        tec tecVar = this.f;
        if (tecVar != null) {
            tecVar.d(this.g, i);
        } else {
            this.e += i;
        }
    }
}
