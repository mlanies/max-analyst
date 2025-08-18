package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zh7 {
    public static boolean p = false;
    public static int q = 1000;
    public final c9b c;
    public ws[] f;
    public final cjg l;
    public ws o;
    public boolean a = false;
    public int b = 0;
    public int d = 32;
    public int e = 32;
    public boolean g = false;
    public boolean[] h = new boolean[32];
    public int i = 1;
    public int j = 0;
    public int k = 32;
    public sud[] m = new sud[q];
    public int n = 0;

    public zh7() {
        this.f = null;
        this.f = new ws[32];
        s();
        cjg cjgVar = new cjg();
        cjgVar.a = new u5b();
        cjgVar.b = new u5b();
        cjgVar.c = new sud[32];
        this.l = cjgVar;
        c9b c9bVar = new c9b(cjgVar);
        c9bVar.f = new sud[128];
        c9bVar.g = new sud[128];
        c9bVar.h = 0;
        c9bVar.i = new b9b(c9bVar);
        this.c = c9bVar;
        this.o = new ws(cjgVar);
    }

    public static int n(Object obj) {
        sud sudVar = ((oi3) obj).i;
        if (sudVar != null) {
            return (int) (sudVar.X + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final sud a(int i) {
        u5b u5bVar = (u5b) this.l.b;
        int i2 = u5bVar.b;
        sud sudVar = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            ?? r3 = u5bVar.a;
            ?? r4 = r3[i3];
            r3[i3] = 0;
            u5bVar.b = i3;
            sudVar = r4;
        }
        sud sudVar2 = sudVar;
        if (sudVar2 == null) {
            sudVar2 = new sud(i);
            sudVar2.w0 = i;
        } else {
            sudVar2.c();
            sudVar2.w0 = i;
        }
        int i4 = this.n;
        int i5 = q;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            q = i6;
            this.m = (sud[]) Arrays.copyOf(this.m, i6);
        }
        sud[] sudVarArr = this.m;
        int i7 = this.n;
        this.n = i7 + 1;
        sudVarArr[i7] = sudVar2;
        return sudVar2;
    }

    public final void b(sud sudVar, sud sudVar2, int i, float f, sud sudVar3, sud sudVar4, int i2, int i3) {
        ws wsVarL = l();
        if (sudVar2 == sudVar3) {
            wsVarL.d.j(sudVar, 1.0f);
            wsVarL.d.j(sudVar4, 1.0f);
            wsVarL.d.j(sudVar2, -2.0f);
        } else if (f == 0.5f) {
            wsVarL.d.j(sudVar, 1.0f);
            wsVarL.d.j(sudVar2, -1.0f);
            wsVarL.d.j(sudVar3, -1.0f);
            wsVarL.d.j(sudVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                wsVarL.b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            wsVarL.d.j(sudVar, -1.0f);
            wsVarL.d.j(sudVar2, 1.0f);
            wsVarL.b = i;
        } else if (f >= 1.0f) {
            wsVarL.d.j(sudVar4, -1.0f);
            wsVarL.d.j(sudVar3, 1.0f);
            wsVarL.b = -i2;
        } else {
            float f2 = 1.0f - f;
            wsVarL.d.j(sudVar, f2 * 1.0f);
            wsVarL.d.j(sudVar2, f2 * (-1.0f));
            wsVarL.d.j(sudVar3, (-1.0f) * f);
            wsVarL.d.j(sudVar4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                wsVarL.b = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 8) {
            wsVarL.a(this, i3);
        }
        c(wsVarL);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a5 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.ws r17) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zh7.c(ws):void");
    }

    public final void d(sud sudVar, int i) {
        int i2 = sudVar.c;
        if (i2 == -1) {
            sudVar.d(this, i);
            for (int i3 = 0; i3 < this.b + 1; i3++) {
                sud sudVar2 = ((sud[]) this.l.c)[i3];
            }
            return;
        }
        if (i2 == -1) {
            ws wsVarL = l();
            wsVarL.a = sudVar;
            float f = i;
            sudVar.X = f;
            wsVarL.b = f;
            wsVarL.e = true;
            c(wsVarL);
            return;
        }
        ws wsVar = this.f[i2];
        if (wsVar.e) {
            wsVar.b = i;
            return;
        }
        if (wsVar.d.f() == 0) {
            wsVar.e = true;
            wsVar.b = i;
            return;
        }
        ws wsVarL2 = l();
        if (i < 0) {
            wsVarL2.b = i * (-1);
            wsVarL2.d.j(sudVar, 1.0f);
        } else {
            wsVarL2.b = i;
            wsVarL2.d.j(sudVar, -1.0f);
        }
        c(wsVarL2);
    }

    public final void e(sud sudVar, sud sudVar2, int i, int i2) {
        if (i2 == 8 && sudVar2.Y && sudVar.c == -1) {
            sudVar.d(this, sudVar2.X + i);
            return;
        }
        ws wsVarL = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            wsVarL.b = i;
        }
        if (z) {
            wsVarL.d.j(sudVar, 1.0f);
            wsVarL.d.j(sudVar2, -1.0f);
        } else {
            wsVarL.d.j(sudVar, -1.0f);
            wsVarL.d.j(sudVar2, 1.0f);
        }
        if (i2 != 8) {
            wsVarL.a(this, i2);
        }
        c(wsVarL);
    }

    public final void f(sud sudVar, sud sudVar2, int i, int i2) {
        ws wsVarL = l();
        sud sudVarM = m();
        sudVarM.o = 0;
        wsVarL.b(sudVar, sudVar2, sudVarM, i);
        if (i2 != 8) {
            wsVarL.d.j(j(i2), (int) (wsVarL.d.e(sudVarM) * (-1.0f)));
        }
        c(wsVarL);
    }

    public final void g(sud sudVar, sud sudVar2, int i, int i2) {
        ws wsVarL = l();
        sud sudVarM = m();
        sudVarM.o = 0;
        wsVarL.c(sudVar, sudVar2, sudVarM, i);
        if (i2 != 8) {
            wsVarL.d.j(j(i2), (int) (wsVarL.d.e(sudVarM) * (-1.0f)));
        }
        c(wsVarL);
    }

    public final void h(ws wsVar) {
        int i;
        if (wsVar.e) {
            wsVar.a.d(this, wsVar.b);
        } else {
            ws[] wsVarArr = this.f;
            int i2 = this.j;
            wsVarArr[i2] = wsVar;
            sud sudVar = wsVar.a;
            sudVar.c = i2;
            this.j = i2 + 1;
            sudVar.e(this, wsVar);
        }
        if (this.a) {
            int i3 = 0;
            while (i3 < this.j) {
                if (this.f[i3] == null) {
                    System.out.println("WTF");
                }
                ws wsVar2 = this.f[i3];
                if (wsVar2 != null && wsVar2.e) {
                    wsVar2.a.d(this, wsVar2.b);
                    ((u5b) this.l.a).a(wsVar2);
                    this.f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.j;
                        if (i4 >= i) {
                            break;
                        }
                        ws[] wsVarArr2 = this.f;
                        int i6 = i4 - 1;
                        ws wsVar3 = wsVarArr2[i4];
                        wsVarArr2[i6] = wsVar3;
                        sud sudVar2 = wsVar3.a;
                        if (sudVar2.c == i4) {
                            sudVar2.c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f[i5] = null;
                    }
                    this.j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.a = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.j; i++) {
            ws wsVar = this.f[i];
            wsVar.a.X = wsVar.b;
        }
    }

    public final sud j(int i) {
        if (this.i + 1 >= this.e) {
            o();
        }
        sud sudVarA = a(4);
        int i2 = this.b + 1;
        this.b = i2;
        this.i++;
        sudVarA.b = i2;
        sudVarA.o = i;
        ((sud[]) this.l.c)[i2] = sudVarA;
        c9b c9bVar = this.c;
        c9bVar.i.b = sudVarA;
        float[] fArr = sudVarA.s0;
        Arrays.fill(fArr, 0.0f);
        fArr[sudVarA.o] = 1.0f;
        c9bVar.j(sudVarA);
        return sudVarA;
    }

    public final sud k(Object obj) {
        sud sudVar = null;
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.e) {
            o();
        }
        if (obj instanceof oi3) {
            oi3 oi3Var = (oi3) obj;
            sudVar = oi3Var.i;
            if (sudVar == null) {
                oi3Var.k();
                sudVar = oi3Var.i;
            }
            int i = sudVar.b;
            cjg cjgVar = this.l;
            if (i == -1 || i > this.b || ((sud[]) cjgVar.c)[i] == null) {
                if (i != -1) {
                    sudVar.c();
                }
                int i2 = this.b + 1;
                this.b = i2;
                this.i++;
                sudVar.b = i2;
                sudVar.w0 = 1;
                ((sud[]) cjgVar.c)[i2] = sudVar;
            }
        }
        return sudVar;
    }

    public final ws l() {
        Object obj;
        cjg cjgVar = this.l;
        u5b u5bVar = (u5b) cjgVar.a;
        int i = u5bVar.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = u5bVar.a;
            obj = objArr[i2];
            objArr[i2] = null;
            u5bVar.b = i2;
        } else {
            obj = null;
        }
        ws wsVar = (ws) obj;
        if (wsVar == null) {
            return new ws(cjgVar);
        }
        wsVar.a = null;
        wsVar.d.b();
        wsVar.b = 0.0f;
        wsVar.e = false;
        return wsVar;
    }

    public final sud m() {
        if (this.i + 1 >= this.e) {
            o();
        }
        sud sudVarA = a(3);
        int i = this.b + 1;
        this.b = i;
        this.i++;
        sudVarA.b = i;
        ((sud[]) this.l.c)[i] = sudVarA;
        return sudVarA;
    }

    public final void o() {
        int i = this.d * 2;
        this.d = i;
        this.f = (ws[]) Arrays.copyOf(this.f, i);
        cjg cjgVar = this.l;
        cjgVar.c = (sud[]) Arrays.copyOf((sud[]) cjgVar.c, this.d);
        int i2 = this.d;
        this.h = new boolean[i2];
        this.e = i2;
        this.k = i2;
    }

    public final void p() {
        c9b c9bVar = this.c;
        if (c9bVar.e()) {
            i();
            return;
        }
        if (!this.g) {
            q(c9bVar);
            return;
        }
        for (int i = 0; i < this.j; i++) {
            if (!this.f[i].e) {
                q(c9bVar);
                return;
            }
        }
        i();
    }

    public final void q(ws wsVar) {
        int i = 0;
        while (true) {
            if (i >= this.j) {
                break;
            }
            ws wsVar2 = this.f[i];
            int i2 = 1;
            if (wsVar2.a.w0 != 1) {
                float f = 0.0f;
                if (wsVar2.b < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.j) {
                            ws wsVar3 = this.f[i6];
                            if (wsVar3.a.w0 != i2 && !wsVar3.e && wsVar3.b < f) {
                                int iF = wsVar3.d.f();
                                int i8 = 0;
                                while (i8 < iF) {
                                    sud sudVarG = wsVar3.d.g(i8);
                                    float fE = wsVar3.d.e(sudVarG);
                                    if (fE > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = sudVarG.Z[i9] / fE;
                                            if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = sudVarG.b;
                                                i4 = i6;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i6++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            ws wsVar4 = this.f[i4];
                            wsVar4.a.c = -1;
                            wsVar4.g(((sud[]) this.l.c)[i5]);
                            sud sudVar = wsVar4.a;
                            sudVar.c = i4;
                            sudVar.e(this, wsVar4);
                        } else {
                            z = true;
                        }
                        if (i3 > this.i / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                }
            }
            i++;
        }
        r(wsVar);
        i();
    }

    public final void r(ws wsVar) {
        for (int i = 0; i < this.i; i++) {
            this.h[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.i * 2) {
                return;
            }
            sud sudVar = wsVar.a;
            if (sudVar != null) {
                this.h[sudVar.b] = true;
            }
            sud sudVarD = wsVar.d(this.h);
            if (sudVarD != null) {
                boolean[] zArr = this.h;
                int i3 = sudVarD.b;
                if (zArr[i3]) {
                    return;
                } else {
                    zArr[i3] = true;
                }
            }
            if (sudVarD != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.j; i5++) {
                    ws wsVar2 = this.f[i5];
                    if (wsVar2.a.w0 != 1 && !wsVar2.e && wsVar2.d.c(sudVarD)) {
                        float fE = wsVar2.d.e(sudVarD);
                        if (fE < 0.0f) {
                            float f2 = (-wsVar2.b) / fE;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    ws wsVar3 = this.f[i4];
                    wsVar3.a.c = -1;
                    wsVar3.g(sudVarD);
                    sud sudVar2 = wsVar3.a;
                    sudVar2.c = i4;
                    sudVar2.e(this, wsVar3);
                }
            } else {
                z = true;
            }
        }
    }

    public final void s() {
        for (int i = 0; i < this.j; i++) {
            ws wsVar = this.f[i];
            if (wsVar != null) {
                ((u5b) this.l.a).a(wsVar);
            }
            this.f[i] = null;
        }
    }

    public final void t() {
        cjg cjgVar;
        int i = 0;
        while (true) {
            cjgVar = this.l;
            sud[] sudVarArr = (sud[]) cjgVar.c;
            if (i >= sudVarArr.length) {
                break;
            }
            sud sudVar = sudVarArr[i];
            if (sudVar != null) {
                sudVar.c();
            }
            i++;
        }
        u5b u5bVar = (u5b) cjgVar.b;
        sud[] sudVarArr2 = this.m;
        int length = this.n;
        u5bVar.getClass();
        if (length > sudVarArr2.length) {
            length = sudVarArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            sud sudVar2 = sudVarArr2[i2];
            int i3 = u5bVar.b;
            Object[] objArr = u5bVar.a;
            if (i3 < objArr.length) {
                objArr[i3] = sudVar2;
                u5bVar.b = i3 + 1;
            }
        }
        this.n = 0;
        Arrays.fill((sud[]) cjgVar.c, (Object) null);
        this.b = 0;
        c9b c9bVar = this.c;
        c9bVar.h = 0;
        c9bVar.b = 0.0f;
        this.i = 1;
        for (int i4 = 0; i4 < this.j; i4++) {
            ws wsVar = this.f[i4];
        }
        s();
        this.j = 0;
        this.o = new ws(cjgVar);
    }
}
