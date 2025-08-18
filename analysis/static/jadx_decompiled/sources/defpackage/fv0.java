package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class fv0 implements Serializable {
    public final String X;
    public final boolean Y;
    public final long Z;
    public final String a;
    public final nv0 b;
    public final int c;
    public final String o;
    public final boolean s0;

    public fv0(cv0 cv0Var) {
        this.a = cv0Var.a;
        this.b = cv0Var.b;
        this.c = cv0Var.c;
        this.o = cv0Var.d;
        this.X = cv0Var.e;
        this.Y = cv0Var.f;
        this.s0 = cv0Var.g;
        this.Z = cv0Var.h;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fv0)) {
            return false;
        }
        fv0 fv0Var = (fv0) obj;
        if (oag.d(this.a, fv0Var.a) && oag.d(this.X, fv0Var.X) && this.b == fv0Var.b && this.Y == fv0Var.Y && this.c == fv0Var.c && this.Z == fv0Var.Z) {
            return oag.d(this.o, fv0Var.o);
        }
        return false;
    }
}
