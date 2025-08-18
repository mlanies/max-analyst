package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class khe implements je7, Serializable {
    public k56 a;
    public volatile Object b = qq9.v0;
    public final Object c = this;

    public khe(k56 k56Var) {
        this.a = k56Var;
    }

    @Override // defpackage.je7
    public final boolean a() {
        return this.b != qq9.v0;
    }

    @Override // defpackage.je7
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.b;
        qq9 qq9Var = qq9.v0;
        if (obj != qq9Var) {
            return obj;
        }
        synchronized (this.c) {
            objInvoke = this.b;
            if (objInvoke == qq9Var) {
                objInvoke = this.a.invoke();
                this.b = objInvoke;
                this.a = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
