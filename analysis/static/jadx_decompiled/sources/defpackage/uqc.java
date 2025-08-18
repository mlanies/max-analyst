package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class uqc implements je7, Serializable {
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(uqc.class, Object.class, "b");
    public volatile k56 a;
    public volatile Object b;

    @Override // defpackage.je7
    public final boolean a() {
        return this.b != qq9.v0;
    }

    @Override // defpackage.je7
    public final Object getValue() {
        Object obj = this.b;
        qq9 qq9Var = qq9.v0;
        if (obj != qq9Var) {
            return obj;
        }
        k56 k56Var = this.a;
        if (k56Var != null) {
            Object objInvoke = k56Var.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, qq9Var, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != qq9Var) {
                }
            }
            this.a = null;
            return objInvoke;
        }
        return this.b;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
