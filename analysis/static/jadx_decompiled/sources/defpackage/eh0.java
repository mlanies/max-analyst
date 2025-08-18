package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class eh0 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ jh0 Y;
    public final /* synthetic */ vg0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh0(jh0 jh0Var, oz2 oz2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = jh0Var;
        this.Z = oz2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((eh0) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new eh0(this.Y, (oz2) this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            jh0 jh0Var = this.Y;
            jh0Var.getClass();
            Object objK = j1e.k(new ih0(jh0Var, this.Z, null), this);
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
        return e5fVar;
    }
}
