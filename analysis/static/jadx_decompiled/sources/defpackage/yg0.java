package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class yg0 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ bh0 Y;
    public final /* synthetic */ je7 Z;
    public final /* synthetic */ boolean s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg0(bh0 bh0Var, je7 je7Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = bh0Var;
        this.Z = je7Var;
        this.s0 = z;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((yg0) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new yg0(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        bh0 bh0Var = this.Y;
        if (i == 0) {
            od2.a0(obj);
            jh0 jh0Var = bh0Var.c;
            vg0 vg0Var = (vg0) this.Z.getValue();
            this.X = 1;
            jh0Var.getClass();
            Object objK = j1e.k(new ih0(jh0Var, vg0Var, null), this);
            if (objK != tx3Var) {
                objK = e5fVar;
            }
            if (objK == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        bh0Var.Z.m(null, bh0Var.q(this.s0));
        return e5fVar;
    }
}
