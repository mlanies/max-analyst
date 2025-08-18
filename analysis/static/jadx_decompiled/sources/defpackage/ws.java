package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class ws {
    public final ks d;
    public sud a = null;
    public float b = 0.0f;
    public final ArrayList c = new ArrayList();
    public boolean e = false;

    public ws(cjg cjgVar) {
        this.d = new ks(this, cjgVar);
    }

    public final void a(zh7 zh7Var, int i) {
        this.d.j(zh7Var.j(i), 1.0f);
        this.d.j(zh7Var.j(i), -1.0f);
    }

    public final void b(sud sudVar, sud sudVar2, sud sudVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.d.j(sudVar, 1.0f);
            this.d.j(sudVar2, -1.0f);
            this.d.j(sudVar3, -1.0f);
        } else {
            this.d.j(sudVar, -1.0f);
            this.d.j(sudVar2, 1.0f);
            this.d.j(sudVar3, 1.0f);
        }
    }

    public final void c(sud sudVar, sud sudVar2, sud sudVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.d.j(sudVar, 1.0f);
            this.d.j(sudVar2, -1.0f);
            this.d.j(sudVar3, 1.0f);
        } else {
            this.d.j(sudVar, -1.0f);
            this.d.j(sudVar2, 1.0f);
            this.d.j(sudVar3, -1.0f);
        }
    }

    public sud d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.d.f() == 0;
    }

    public final sud f(boolean[] zArr, sud sudVar) {
        int i;
        int iF = this.d.f();
        sud sudVar2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < iF; i2++) {
            float fH = this.d.h(i2);
            if (fH < 0.0f) {
                sud sudVarG = this.d.g(i2);
                if ((zArr == null || !zArr[sudVarG.b]) && sudVarG != sudVar && (((i = sudVarG.w0) == 3 || i == 4) && fH < f)) {
                    f = fH;
                    sudVar2 = sudVarG;
                }
            }
        }
        return sudVar2;
    }

    public final void g(sud sudVar) {
        sud sudVar2 = this.a;
        if (sudVar2 != null) {
            this.d.j(sudVar2, -1.0f);
            this.a.c = -1;
            this.a = null;
        }
        float fK = this.d.k(sudVar, true) * (-1.0f);
        this.a = sudVar;
        if (fK == 1.0f) {
            return;
        }
        this.b /= fK;
        this.d.d(fK);
    }

    public final void h(zh7 zh7Var, sud sudVar, boolean z) {
        if (sudVar == null || !sudVar.Y) {
            return;
        }
        float fE = this.d.e(sudVar);
        this.b = (sudVar.X * fE) + this.b;
        this.d.k(sudVar, z);
        if (z) {
            sudVar.b(this);
        }
        if (this.d.f() == 0) {
            this.e = true;
            zh7Var.a = true;
        }
    }

    public void i(zh7 zh7Var, ws wsVar, boolean z) {
        float fL = this.d.l(wsVar, z);
        this.b = (wsVar.b * fL) + this.b;
        if (z) {
            wsVar.a.b(this);
        }
        if (this.a == null || this.d.f() != 0) {
            return;
        }
        this.e = true;
        zh7Var.a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            sud r0 = r10.a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            sud r1 = r10.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = defpackage.au1.g(r0, r1)
            float r1 = r10.b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = defpackage.au1.l(r0)
            float r1 = r10.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r3
            goto L36
        L35:
            r1 = r4
        L36:
            ks r5 = r10.d
            int r5 = r5.f()
        L3c:
            if (r4 >= r5) goto L9c
            ks r6 = r10.d
            sud r6 = r6.g(r4)
            if (r6 != 0) goto L47
            goto L99
        L47:
            ks r7 = r10.d
            float r7 = r7.h(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L99
        L52:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L66
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L76
            java.lang.String r1 = "- "
            java.lang.String r0 = defpackage.au1.g(r0, r1)
        L64:
            float r7 = r7 * r9
            goto L76
        L66:
            if (r8 <= 0) goto L6f
            java.lang.String r1 = " + "
            java.lang.String r0 = defpackage.au1.g(r0, r1)
            goto L76
        L6f:
            java.lang.String r1 = " - "
            java.lang.String r0 = defpackage.au1.g(r0, r1)
            goto L64
        L76:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L81
            java.lang.String r0 = defpackage.au1.g(r0, r6)
            goto L98
        L81:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L98:
            r1 = r3
        L99:
            int r4 = r4 + 1
            goto L3c
        L9c:
            if (r1 != 0) goto La4
            java.lang.String r10 = "0.0"
            java.lang.String r0 = defpackage.au1.g(r0, r10)
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ws.toString():java.lang.String");
    }
}
