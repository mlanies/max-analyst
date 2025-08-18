package defpackage;

import java.lang.ref.WeakReference;
import one.me.sdk.arch.internal.BinderNotFoundValueException;

/* loaded from: classes2.dex */
public final class qm0 implements q7c, je7 {
    public WeakReference X;
    public final pm0 Y;
    public final m56 a;
    public final a66 b;
    public final m56 c;
    public Object o;

    public qm0(uu3 uu3Var, m56 m56Var, a66 a66Var, m56 m56Var2) {
        this.a = m56Var;
        this.b = a66Var;
        this.c = m56Var2;
        this.Y = new pm0(this, uu3Var);
    }

    @Override // defpackage.q7c
    public final Object T0(Object obj, bc7 bc7Var) {
        return getValue();
    }

    @Override // defpackage.je7
    public final boolean a() {
        return this.o != null;
    }

    @Override // defpackage.je7
    public final Object getValue() {
        Object obj = this.o;
        if (obj == null) {
            WeakReference weakReference = this.X;
            obj = weakReference != null ? weakReference.get() : null;
        }
        if (obj != null && ((Boolean) this.c.invoke(obj)).booleanValue()) {
            return obj;
        }
        try {
            Object objInvoke = this.a.invoke(obj);
            this.o = objInvoke;
            pm0 pm0Var = this.Y;
            pm0Var.a = false;
            a66 a66Var = this.b;
            if (a66Var != null) {
                a66Var.invoke(objInvoke, pm0Var);
            }
            return objInvoke;
        } catch (BinderNotFoundValueException e) {
            throw e;
        } catch (Throwable th) {
            throw new BinderNotFoundValueException(th, 1);
        }
    }

    public /* synthetic */ qm0(uu3 uu3Var, m56 m56Var, a5g a5gVar, int i) {
        this(uu3Var, m56Var, (i & 4) != 0 ? null : a5gVar, new k8(17));
    }
}
