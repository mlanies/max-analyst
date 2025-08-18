package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class rn6 extends erc {
    public final Map H;
    public dr4 I;

    public rn6(n64 n64Var, tr4 tr4Var, lr4 lr4Var, Map map) {
        super(n64Var, tr4Var, lr4Var);
        this.H = map;
    }

    @Override // defpackage.erc
    public final qy5 l(qy5 qy5Var) {
        dr4 dr4Var;
        dr4 dr4Var2 = this.I;
        if (dr4Var2 == null) {
            dr4Var2 = qy5Var.r;
        }
        if (dr4Var2 != null && (dr4Var = (dr4) this.H.get(dr4Var2.c)) != null) {
            dr4Var2 = dr4Var;
        }
        f99 f99Var = qy5Var.k;
        f99 f99Var2 = null;
        if (f99Var == null) {
            f99Var = f99Var2;
        } else {
            d99[] d99VarArr = f99Var.a;
            int length = d99VarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                d99 d99Var = d99VarArr[i2];
                if ((d99Var instanceof g9b) && "com.apple.streaming.transportStreamTimestamp".equals(((g9b) d99Var).b)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (length != 1) {
                    d99[] d99VarArr2 = new d99[length - 1];
                    while (i < length) {
                        if (i != i2) {
                            d99VarArr2[i < i2 ? i : i - 1] = d99VarArr[i];
                        }
                        i++;
                    }
                    f99Var2 = new f99(d99VarArr2);
                }
                f99Var = f99Var2;
            }
        }
        if (dr4Var2 != qy5Var.r || f99Var != qy5Var.k) {
            ny5 ny5VarA = qy5Var.a();
            ny5VarA.q = dr4Var2;
            ny5VarA.j = f99Var;
            qy5Var = ny5VarA.a();
        }
        return super.l(qy5Var);
    }
}
