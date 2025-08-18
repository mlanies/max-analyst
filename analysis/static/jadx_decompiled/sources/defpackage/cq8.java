package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cq8 extends ffe implements a66 {
    public e52 X;
    public int Y;
    public final /* synthetic */ jq8 Z;
    public final /* synthetic */ boolean s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq8(jq8 jq8Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Z = jq8Var;
        this.s0 = z;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((cq8) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new cq8(this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        e52 e52VarT;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        e5f e5fVar = e5f.a;
        jq8 jq8Var = this.Z;
        if (i == 0) {
            od2.a0(obj);
            hm9.n(jq8Var.J0, "load members with read status");
            e52VarT = jq8Var.t();
            if (e52VarT == null) {
                return e5fVar;
            }
            this.X = e52VarT;
            this.Y = 1;
            if (jq8.r(jq8Var, e52VarT, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
                jq8.q(jq8Var);
                return e5fVar;
            }
            e52VarT = this.X;
            od2.a0(obj);
        }
        if (!this.s0) {
            return e5fVar;
        }
        this.X = null;
        this.Y = 2;
        if (jq8.s(jq8Var, e52VarT, this) == tx3Var) {
            return tx3Var;
        }
        jq8.q(jq8Var);
        return e5fVar;
    }
}
