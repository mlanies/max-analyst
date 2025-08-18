package defpackage;

/* loaded from: classes2.dex */
public final class fic implements eic {
    public final k56 a;
    public volatile Object b = yxc.s0;
    public final Object c = this;

    public fic(k56 k56Var) {
        this.a = k56Var;
    }

    @Override // defpackage.je7
    public final boolean a() {
        return this.b != yxc.s0;
    }

    @Override // defpackage.je7
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.b;
        yxc yxcVar = yxc.s0;
        if (obj != yxcVar) {
            return obj;
        }
        synchronized (this.c) {
            objInvoke = this.b;
            if (objInvoke == yxcVar) {
                objInvoke = this.a.invoke();
                this.b = objInvoke;
            }
        }
        return objInvoke;
    }

    @Override // defpackage.eic
    public final void reset() {
        synchronized (this.c) {
            this.b = yxc.s0;
        }
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
