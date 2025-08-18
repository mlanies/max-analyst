package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class utf extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ouf Y;
    public final /* synthetic */ boolean Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public utf(ouf oufVar, Continuation continuation, boolean z) {
        super(2, continuation);
        this.Y = oufVar;
        this.Z = z;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((utf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new utf(this.Y, continuation, this.Z);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            w97 w97Var = this.Y.l;
            kn0 kn0Var = w97Var instanceof kn0 ? (kn0) w97Var : null;
            if (kn0Var == null) {
                w97 w97Var2 = this.Y.l;
                if (w97Var2 != null) {
                    w97Var2.b(new s0());
                }
                this.Y.l = null;
                return e5fVar;
            }
            if (this.Z) {
                kn0Var.a(e5fVar);
                kld kldVar = this.Y.j;
                otf otfVar = otf.a;
                this.X = 1;
                if (kldVar.a(otfVar, this) == tx3Var) {
                    return tx3Var;
                }
            } else {
                kn0Var.b(new uuf());
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        this.Y.l = null;
        return e5fVar;
    }
}
