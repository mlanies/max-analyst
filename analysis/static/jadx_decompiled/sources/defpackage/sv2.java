package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class sv2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ gw2 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ fs8 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv2(gw2 gw2Var, long j, fs8 fs8Var, Continuation continuation) {
        super(2, continuation);
        this.Y = gw2Var;
        this.Z = j;
        this.s0 = fs8Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((sv2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new sv2(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            r79 r79Var = (r79) this.Y.x0.getValue();
            this.X = 1;
            r79Var.getClass();
            obj = z04.e0(r79Var.a.a.m(), new p79(r79Var, this.Z, this.s0, null), this);
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
        if (cu8Var != null) {
            return new Long(cu8Var.b);
        }
        return null;
    }
}
