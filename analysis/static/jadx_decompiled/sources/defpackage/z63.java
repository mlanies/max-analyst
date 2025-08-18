package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class z63 implements lx3, Serializable {
    public final lx3 a;
    public final jx3 b;

    public z63(lx3 lx3Var, jx3 jx3Var) {
        this.a = lx3Var;
        this.b = jx3Var;
    }

    public final boolean equals(Object obj) {
        boolean zF;
        if (this != obj) {
            if (!(obj instanceof z63)) {
                return false;
            }
            z63 z63Var = (z63) obj;
            z63Var.getClass();
            int i = 2;
            z63 z63Var2 = z63Var;
            int i2 = 2;
            while (true) {
                lx3 lx3Var = z63Var2.a;
                z63Var2 = lx3Var instanceof z63 ? (z63) lx3Var : null;
                if (z63Var2 == null) {
                    break;
                }
                i2++;
            }
            z63 z63Var3 = this;
            while (true) {
                lx3 lx3Var2 = z63Var3.a;
                z63Var3 = lx3Var2 instanceof z63 ? (z63) lx3Var2 : null;
                if (z63Var3 == null) {
                    break;
                }
                i++;
            }
            if (i2 != i) {
                return false;
            }
            while (true) {
                jx3 jx3Var = this.b;
                if (!tpa.f(z63Var.get(jx3Var.getKey()), jx3Var)) {
                    zF = false;
                    break;
                }
                lx3 lx3Var3 = this.a;
                if (!(lx3Var3 instanceof z63)) {
                    jx3 jx3Var2 = (jx3) lx3Var3;
                    zF = tpa.f(z63Var.get(jx3Var2.getKey()), jx3Var2);
                    break;
                }
                this = (z63) lx3Var3;
            }
            if (!zF) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.lx3
    public final Object fold(Object obj, a66 a66Var) {
        return a66Var.invoke(this.a.fold(obj, a66Var), this.b);
    }

    @Override // defpackage.lx3
    public final jx3 get(kx3 kx3Var) {
        while (true) {
            jx3 jx3Var = this.b.get(kx3Var);
            if (jx3Var != null) {
                return jx3Var;
            }
            lx3 lx3Var = this.a;
            if (!(lx3Var instanceof z63)) {
                return lx3Var.get(kx3Var);
            }
            this = (z63) lx3Var;
        }
    }

    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode();
    }

    @Override // defpackage.lx3
    public final lx3 minusKey(kx3 kx3Var) {
        jx3 jx3Var = this.b;
        jx3 jx3Var2 = jx3Var.get(kx3Var);
        lx3 lx3Var = this.a;
        if (jx3Var2 != null) {
            return lx3Var;
        }
        lx3 lx3VarMinusKey = lx3Var.minusKey(kx3Var);
        return lx3VarMinusKey == lx3Var ? this : lx3VarMinusKey == hz4.a ? jx3Var : new z63(lx3VarMinusKey, jx3Var);
    }

    @Override // defpackage.lx3
    public final lx3 plus(lx3 lx3Var) {
        return ema.z(this, lx3Var);
    }

    public final String toString() {
        return rh4.m(new StringBuilder("["), (String) fold("", y63.b), ']');
    }
}
