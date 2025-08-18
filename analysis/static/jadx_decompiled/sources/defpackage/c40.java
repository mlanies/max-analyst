package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class c40 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ f40 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ long s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c40(f40 f40Var, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.Y = f40Var;
        this.Z = j;
        this.s0 = j2;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((c40) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new c40(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        k8g k8gVar;
        l20 l20VarK;
        i10 i10Var;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        f40 f40Var = this.Y;
        if (i == 0) {
            od2.a0(obj);
            nx3 nx3VarB = ((w9a) ((kke) f40Var.Z.getValue())).b();
            b40 b40Var = new b40(f40Var, this.s0, null);
            this.X = 1;
            obj = j47.t0(nx3VarB, b40Var, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        cu8 cu8Var = (cu8) obj;
        e5f e5fVar = e5f.a;
        if (cu8Var == null || !cu8Var.u() || (k8gVar = cu8Var.z0) == null || (l20VarK = k8gVar.k(g20.X)) == null || (i10Var = l20VarK.e) == null) {
            return e5fVar;
        }
        au8 au8Var = (au8) f40Var.Y.getValue();
        au8Var.getClass();
        au8Var.t(cu8Var, l20VarK.r, new v72(au8Var, this.Z, i10Var.c));
        return e5fVar;
    }
}
