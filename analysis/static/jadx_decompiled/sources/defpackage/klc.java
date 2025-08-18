package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ThreadLocalElement;

/* loaded from: classes.dex */
public final class klc extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ilc Z;
    public final /* synthetic */ ry1 s0;
    public final /* synthetic */ a66 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klc(ilc ilcVar, sy1 sy1Var, llc llcVar, Continuation continuation) {
        super(2, continuation);
        this.Z = ilcVar;
        this.s0 = sy1Var;
        this.t0 = llcVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((klc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        klc klcVar = new klc(this.Z, (sy1) this.s0, (llc) this.t0, continuation);
        klcVar.Y = obj;
        return klcVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Continuation continuation;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            iu3 iu3Var = (iu3) ((sx3) this.Y).getCoroutineContext().get(vu4.b);
            v0f v0fVar = new v0f(iu3Var);
            lx3 lx3VarPlus = iu3Var.plus(v0fVar).plus(new ThreadLocalElement(Integer.valueOf(System.identityHashCode(v0fVar)), this.Z.j));
            ry1 ry1Var = this.s0;
            this.Y = ry1Var;
            this.X = 1;
            obj = j47.t0(lx3VarPlus, this.t0, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
            continuation = ry1Var;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            continuation = (Continuation) this.Y;
            od2.a0(obj);
        }
        continuation.resumeWith(obj);
        return e5f.a;
    }
}
