package defpackage;

/* loaded from: classes.dex */
public final class ja7 {
    public static final ja7 d = new ja7();
    public final la7 a;
    public final oz7 b;
    public final xh3 c;

    public ja7() {
        la7 la7Var = new la7();
        oz7 oz7Var = ft.h;
        this.a = la7Var;
        this.b = oz7Var;
        this.c = new xh3(1);
    }

    public final Object a(cc7 cc7Var, String str) {
        l0f l0fVar = !this.a.o ? new l0f(str) : new q9e(str);
        Object objU = new x8(this, g9g.c, l0fVar, cc7Var.d(), (sw0) null).u(cc7Var);
        if (l0fVar.l() == 10) {
            return objU;
        }
        l0f.u(l0fVar, "Expected EOF after parsing, but had " + ((String) l0fVar.c).charAt(l0fVar.b - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final String b(cc7 cc7Var, Object obj) {
        char[] cArr;
        sh0 sh0Var = new sh0((char) 0, 9);
        p42 p42Var = p42.c;
        synchronized (p42Var) {
            hs hsVar = (hs) p42Var.b;
            cArr = null;
            char[] cArr2 = (char[]) (hsVar.isEmpty() ? null : hsVar.k());
            if (cArr2 != null) {
                p42Var.a -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        sh0Var.c = cArr;
        try {
            new xu3(this.a.e ? new gc3(sh0Var, this) : new ar0(sh0Var), this, g9g.c, new xu3[g9g.s0.getSize()]).l(cc7Var, obj);
            return sh0Var.toString();
        } finally {
            sh0Var.A();
        }
    }
}
