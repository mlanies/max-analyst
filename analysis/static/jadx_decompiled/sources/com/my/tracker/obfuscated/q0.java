package com.my.tracker.obfuscated;

import android.text.TextUtils;

/* loaded from: classes.dex */
public abstract class q0 {
    protected final l a = new l(16384);
    protected final l b = new l(4096);

    public static void a(r0 r0Var, c cVar, q qVar, l lVar, l lVar2) {
        lVar.a();
        if (cVar != null) {
            lVar2.a();
            lVar2.a(1, cVar.a);
            int i = cVar.b;
            if (i != -1) {
                lVar2.a(2, i);
            }
            if (lVar2.b() > 0) {
                lVar.a(31, lVar2);
            }
        }
        lVar.a(1, qVar.g);
        lVar.a(2, qVar.f);
        lVar.a(3, qVar.k);
        lVar.a(4, qVar.e);
        r0Var.a(21, lVar);
    }

    public static void a(r0 r0Var, boolean z, b1 b1Var, l lVar) {
        int i;
        lVar.a();
        if (!z && ((i = b1Var.b) == 0 || i == 1 || i == 2)) {
            lVar.a(1, i);
        }
        int i2 = b1Var.a;
        if (i2 > -1) {
            lVar.a(2, i2);
        }
        if (!z) {
            lVar.a(3, b1Var.c);
            lVar.a(4, b1Var.d);
            lVar.a(5, b1Var.e);
            lVar.a(6, b1Var.f);
            lVar.a(7, b1Var.g);
            lVar.a(8, b1Var.h);
            lVar.a(9, b1Var.i);
        }
        if (lVar.b() > 0) {
            r0Var.a(22, lVar);
        }
    }

    public static void a(r0 r0Var, String str, String str2, u uVar, l lVar, l lVar2) {
        q qVar = uVar.b;
        lVar.a();
        a(lVar, str, uVar.c, uVar.d, lVar2);
        int i = qVar.a;
        if (i != -1) {
            lVar.a(1, i);
        }
        if (!TextUtils.isEmpty(qVar.d)) {
            lVar.a(2, qVar.d);
        }
        if (!TextUtils.isEmpty(qVar.j)) {
            lVar.a(3, qVar.j);
        }
        if (!TextUtils.isEmpty(qVar.l)) {
            lVar.a(4, qVar.l);
        }
        if (!TextUtils.isEmpty(qVar.b)) {
            lVar.a(5, qVar.b);
        }
        if (!TextUtils.isEmpty(qVar.c)) {
            lVar.a(6, qVar.c);
        }
        if (!TextUtils.isEmpty(qVar.i)) {
            lVar.a(7, qVar.i);
        }
        if (!TextUtils.isEmpty(qVar.h)) {
            lVar.a(8, qVar.h);
        }
        int i2 = qVar.s;
        if (i2 != -1) {
            lVar.a(9, i2);
        }
        int i3 = qVar.m;
        if (i3 != -1) {
            lVar.a(10, i3);
        }
        int i4 = qVar.n;
        if (i4 != -1) {
            lVar.a(11, i4);
        }
        int i5 = qVar.o;
        if (i5 != -1) {
            lVar.a(12, i5);
        }
        if (!Float.isNaN(qVar.q)) {
            lVar.a(13, qVar.q);
        }
        if (!Float.isNaN(qVar.r)) {
            lVar.a(14, qVar.r);
        }
        if (!Float.isNaN(qVar.p)) {
            lVar.a(15, qVar.p);
        }
        lVar.a(16, str2);
        j jVar = uVar.f;
        if (jVar != null) {
            int i6 = jVar.a;
            if (i6 != -1) {
                lVar.a(17, i6);
            }
            int i7 = jVar.b;
            if (i7 >= 0) {
                lVar.a(18, i7);
            }
        }
        long j = qVar.t;
        if (j != -1) {
            lVar.a(19, j);
        }
        long j2 = qVar.u;
        if (j2 != -1) {
            lVar.a(20, j2);
        }
        int i8 = qVar.v;
        if (i8 != -1) {
            lVar.a(23, i8);
        }
        int i9 = qVar.w;
        if (i9 != -1) {
            lVar.a(24, i9);
        }
        w wVar = uVar.g;
        if (wVar != null && !TextUtils.isEmpty(wVar.a)) {
            lVar.a(25, uVar.g.a);
        }
        if (lVar.b() > 0) {
            r0Var.a(23, lVar);
        }
    }

    public static void a(r0 r0Var, String str, y yVar, d0 d0Var, l lVar) {
        lVar.a();
        lVar.a(1, str);
        if (yVar != null && !TextUtils.isEmpty(yVar.a)) {
            boolean z = yVar.b;
            lVar.a(2, yVar.a);
            lVar.a(3, z ? 1 : 0);
        }
        if (d0Var != null && !TextUtils.isEmpty(d0Var.a)) {
            boolean z2 = d0Var.b;
            lVar.a(4, d0Var.a);
            lVar.a(5, z2 ? 1 : 0);
        }
        if (lVar.b() > 0) {
            r0Var.a(31, lVar);
        }
    }

    public synchronized void a() {
        this.a.d();
        this.b.d();
    }
}
