package defpackage;

/* loaded from: classes.dex */
public final class b1 extends tpa {
    @Override // defpackage.tpa
    public final void C(i1 i1Var, i1 i1Var2) {
        i1Var.b = i1Var2;
    }

    @Override // defpackage.tpa
    public final void D(i1 i1Var, Thread thread) {
        i1Var.a = thread;
    }

    @Override // defpackage.tpa
    public final boolean i(k1 k1Var, v0 v0Var, v0 v0Var2) {
        synchronized (k1Var) {
            try {
                if (k1Var.b != v0Var) {
                    return false;
                }
                k1Var.b = v0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.tpa
    public final boolean j(k1 k1Var, Object obj, Object obj2) {
        synchronized (k1Var) {
            try {
                if (k1Var.a != obj) {
                    return false;
                }
                k1Var.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.tpa
    public final boolean k(k1 k1Var, i1 i1Var, i1 i1Var2) {
        synchronized (k1Var) {
            try {
                if (k1Var.c != i1Var) {
                    return false;
                }
                k1Var.c = i1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.tpa
    public final v0 p(k1 k1Var) {
        v0 v0Var;
        v0 v0Var2 = v0.d;
        synchronized (k1Var) {
            v0Var = k1Var.b;
            if (v0Var != v0Var2) {
                k1Var.b = v0Var2;
            }
        }
        return v0Var;
    }

    @Override // defpackage.tpa
    public final i1 q(k1 k1Var) {
        i1 i1Var;
        i1 i1Var2 = i1.c;
        synchronized (k1Var) {
            i1Var = k1Var.c;
            if (i1Var != i1Var2) {
                k1Var.c = i1Var2;
            }
        }
        return i1Var;
    }
}
