package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class hz5 extends ffe implements a66 {
    public Object X;
    public int Y;
    public final /* synthetic */ iz5 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz5(iz5 iz5Var, Continuation continuation) {
        super(2, continuation);
        this.Z = iz5Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((hz5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new hz5(this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        iz5 iz5Var;
        ti9 ti9Var;
        a06 a06Var;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        e5f e5fVar = e5f.a;
        iz5 iz5Var2 = this.Z;
        if (i == 0) {
            od2.a0(obj);
            r79 r79Var = (r79) wy5.a.getAccessor().c(r79.class);
            Set set = iz5Var2.a;
            this.X = iz5Var2;
            this.Y = 1;
            obj = r79Var.b(set, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
            iz5Var = iz5Var2;
        } else {
            if (i != 1) {
                if (i == 2) {
                    ti9Var = (ti9) this.X;
                    od2.a0(obj);
                    a06Var = (a06) obj;
                    ti9Var.setValue(a06Var);
                    return e5fVar;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ti9Var = (ti9) this.X;
                od2.a0(obj);
                a06Var = (a06) obj;
                ti9Var.setValue(a06Var);
                return e5fVar;
            }
            iz5Var = (iz5) this.X;
            od2.a0(obj);
        }
        iz5Var.o = (List) obj;
        q0e q0eVar = iz5Var2.m;
        int size = iz5Var2.a.size();
        d06 d06Var = iz5Var2.b;
        if (size <= 1) {
            cu8 cu8Var = (cu8) x53.i0(iz5Var2.o);
            if (cu8Var == null) {
                return e5fVar;
            }
            this.X = q0eVar;
            this.Y = 3;
            Object objA = d06Var.a(cu8Var, iz5Var2.d, this);
            if (objA == tx3Var) {
                return tx3Var;
            }
            obj = objA;
            ti9Var = q0eVar;
            a06Var = (a06) obj;
            ti9Var.setValue(a06Var);
            return e5fVar;
        }
        cu8 cu8Var2 = (cu8) x53.i0(iz5Var2.o);
        if (cu8Var2 == null) {
            return e5fVar;
        }
        List list = iz5Var2.o;
        this.X = q0eVar;
        this.Y = 2;
        Object objB = d06Var.b(cu8Var2.t0, list, this);
        if (objB == tx3Var) {
            return tx3Var;
        }
        obj = objB;
        ti9Var = q0eVar;
        a06Var = (a06) obj;
        ti9Var.setValue(a06Var);
        return e5fVar;
    }
}
