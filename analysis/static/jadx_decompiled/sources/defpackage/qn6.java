package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class qn6 extends drc {
    public final Map H;
    public cr4 I;

    public qn6(n64 n64Var, sr4 sr4Var, kr4 kr4Var, Map map) {
        super(n64Var, sr4Var, kr4Var);
        this.H = map;
    }

    @Override // defpackage.drc
    public final oy5 m(oy5 oy5Var) {
        cr4 cr4Var;
        cr4 cr4Var2 = this.I;
        if (cr4Var2 == null) {
            cr4Var2 = oy5Var.z0;
        }
        if (cr4Var2 != null && (cr4Var = (cr4) this.H.get(cr4Var2.c)) != null) {
            cr4Var2 = cr4Var;
        }
        e99 e99Var = oy5Var.u0;
        e99 e99Var2 = null;
        if (e99Var == null) {
            e99Var = e99Var2;
        } else {
            c99[] c99VarArr = e99Var.a;
            int length = c99VarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                c99 c99Var = c99VarArr[i2];
                if ((c99Var instanceof f9b) && "com.apple.streaming.transportStreamTimestamp".equals(((f9b) c99Var).b)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (length != 1) {
                    c99[] c99VarArr2 = new c99[length - 1];
                    while (i < length) {
                        if (i != i2) {
                            c99VarArr2[i < i2 ? i : i - 1] = c99VarArr[i];
                        }
                        i++;
                    }
                    e99Var2 = new e99(c99VarArr2);
                }
                e99Var = e99Var2;
            }
        }
        if (cr4Var2 != oy5Var.z0 || e99Var != oy5Var.u0) {
            my5 my5VarA = oy5Var.a();
            my5VarA.n = cr4Var2;
            my5VarA.i = e99Var;
            oy5Var = my5VarA.a();
        }
        return super.m(oy5Var);
    }
}
