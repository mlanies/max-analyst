package defpackage;

import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class by3 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ ilc s0;
    public final /* synthetic */ on5 t0;
    public final /* synthetic */ String[] u0;
    public final /* synthetic */ Callable v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by3(boolean z, ilc ilcVar, on5 on5Var, String[] strArr, Callable callable, Continuation continuation) {
        super(2, continuation);
        this.Z = z;
        this.s0 = ilcVar;
        this.t0 = on5Var;
        this.u0 = strArr;
        this.v0 = callable;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((by3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        by3 by3Var = new by3(this.Z, this.s0, this.t0, this.u0, this.v0, continuation);
        by3Var.Y = obj;
        return by3Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        lx3 lx3VarK;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3Var = (sx3) this.Y;
            zt0 zt0VarA = c37.a(-1, 0, 6);
            ay3 ay3Var = new ay3(this.u0, zt0VarA, 0);
            zt0VarA.n(e5fVar);
            v0f v0fVar = (v0f) sx3Var.getCoroutineContext().get(v0f.c);
            if (v0fVar == null || (lx3VarK = v0fVar.a) == null) {
                boolean z = this.Z;
                ilc ilcVar = this.s0;
                lx3VarK = z ? f8.k(ilcVar) : f8.h(ilcVar);
            }
            zt0 zt0VarA2 = c37.a(0, 0, 7);
            j47.T(sx3Var, lx3VarK, null, new zx3(this.s0, ay3Var, zt0VarA, this.v0, zt0VarA2, null), 2);
            this.X = 1;
            Object objV = fp3.v(this.t0, zt0VarA2, true, this);
            if (objV != tx3Var) {
                objV = e5fVar;
            }
            if (objV == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5fVar;
    }
}
