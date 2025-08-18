package defpackage;

import java.lang.reflect.InvocationTargetException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* loaded from: classes.dex */
public final class sg3 extends zt0 {
    public final int x0;

    public sg3(int i, int i2, m56 m56Var) {
        super(i, m56Var);
        this.x0 = i2;
        if (i2 != 1) {
            if (i < 1) {
                throw new IllegalArgumentException(wg0.g(i, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + nec.a(zt0.class).b() + " instead").toString());
        }
    }

    public final Object K(Object obj, boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        j42 j42Var;
        m56 m56Var;
        UndeliveredElementException undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
        e5f e5fVar = e5f.a;
        if (this.x0 == 3) {
            Object objN = super.n(obj);
            if ((!(objN instanceof h42)) || (objN instanceof g42)) {
                return objN;
            }
            if (!z || (m56Var = this.b) == null || (undeliveredElementExceptionCallUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(m56Var, obj, null, 2, null)) == null) {
                return e5fVar;
            }
            throw undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
        }
        Object obj2 = bu0.d;
        j42 j42Var2 = (j42) zt0.s0.get(this);
        while (true) {
            long andIncrement = zt0.o.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zW = w(andIncrement, false);
            int i = bu0.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (j42Var2.id != j3) {
                j42 j42VarA = zt0.a(this, j3, j42Var2);
                if (j42VarA != null) {
                    j42Var = j42VarA;
                } else if (zW) {
                    return new g42(t());
                }
            } else {
                j42Var = j42Var2;
            }
            int iD = zt0.d(this, j42Var, i2, obj, j, obj2, zW);
            if (iD == 0) {
                j42Var.cleanPrev();
                return e5fVar;
            }
            if (iD == 1) {
                return e5fVar;
            }
            if (iD == 2) {
                if (zW) {
                    j42Var.onSlotCleaned();
                    return new g42(t());
                }
                irf irfVar = obj2 instanceof irf ? (irf) obj2 : null;
                if (irfVar != null) {
                    irfVar.a(j42Var, i2 + i);
                }
                m((j42Var.id * j2) + i2);
                return e5fVar;
            }
            if (iD == 3) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (iD == 4) {
                if (j < zt0.X.get(this)) {
                    j42Var.cleanPrev();
                }
                return new g42(t());
            }
            if (iD == 5) {
                j42Var.cleanPrev();
            }
            j42Var2 = j42Var;
        }
    }

    @Override // defpackage.zt0, defpackage.j5d
    public final Object n(Object obj) {
        return K(obj, false);
    }

    @Override // defpackage.zt0, defpackage.j5d
    public final Object o(Object obj, Continuation continuation) throws Throwable {
        UndeliveredElementException undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
        Object objK = K(obj, true);
        if (!(objK instanceof g42)) {
            return e5f.a;
        }
        i42.a(objK);
        m56 m56Var = this.b;
        if (m56Var == null || (undeliveredElementExceptionCallUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(m56Var, obj, null, 2, null)) == null) {
            throw t();
        }
        j47.e(undeliveredElementExceptionCallUndeliveredElementCatchingException$default, t());
        throw undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
    }

    @Override // defpackage.zt0
    public final boolean y() {
        return this.x0 == 2;
    }
}
