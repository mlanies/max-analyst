package defpackage;

/* loaded from: classes.dex */
public final class yc4 {
    public final String a;
    public int b;
    public long c;
    public final yj8 d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ zc4 g;

    public yc4(zc4 zc4Var, String str, int i, yj8 yj8Var) {
        this.g = zc4Var;
        this.a = str;
        this.b = i;
        this.c = yj8Var == null ? -1L : yj8Var.d;
        if (yj8Var == null || !yj8Var.b()) {
            return;
        }
        this.d = yj8Var;
    }

    public final boolean a(fd fdVar) {
        yj8 yj8Var = fdVar.d;
        if (yj8Var == null) {
            return this.b != fdVar.c;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        if (yj8Var.d > j) {
            return true;
        }
        yj8 yj8Var2 = this.d;
        if (yj8Var2 == null) {
            return false;
        }
        mue mueVar = fdVar.b;
        int iB = mueVar.b(yj8Var.a);
        int iB2 = mueVar.b(yj8Var2.a);
        if (yj8Var.d < yj8Var2.d || iB < iB2) {
            return false;
        }
        if (iB > iB2) {
            return true;
        }
        boolean zB = yj8Var.b();
        int i = yj8Var2.b;
        if (!zB) {
            int i2 = yj8Var.e;
            return i2 == -1 || i2 > i;
        }
        int i3 = yj8Var.b;
        if (i3 > i) {
            return true;
        }
        if (i3 == i) {
            if (yj8Var.c > yj8Var2.c) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(mue mueVar, mue mueVar2) {
        int i = this.b;
        if (i < mueVar.p()) {
            zc4 zc4Var = this.g;
            mueVar.o(i, zc4Var.a);
            kue kueVar = zc4Var.a;
            for (int i2 = kueVar.n; i2 <= kueVar.o; i2++) {
                int iB = mueVar2.b(mueVar.m(i2));
                if (iB != -1) {
                    i = mueVar2.g(iB, zc4Var.b, false).c;
                    break;
                }
            }
            i = -1;
        } else if (i >= mueVar2.p()) {
            i = -1;
        }
        this.b = i;
        if (i == -1) {
            return false;
        }
        yj8 yj8Var = this.d;
        return yj8Var == null || mueVar2.b(yj8Var.a) != -1;
    }
}
