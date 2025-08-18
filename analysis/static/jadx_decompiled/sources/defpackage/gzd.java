package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gzd extends ffe implements a66 {
    public int X;
    public final /* synthetic */ jzd Y;
    public final /* synthetic */ long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gzd(jzd jzdVar, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = jzdVar;
        this.Z = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((gzd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new gzd(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        jzd jzdVar = this.Y;
        if (i == 0) {
            od2.a0(obj);
            iy2 iy2Var = (iy2) jzdVar.X.getValue();
            this.X = 1;
            obj = ((jz2) iy2Var).u(this.Z, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        e52 e52Var = (e52) obj;
        if (e52Var != null) {
            pnf.o(jzdVar.y0, syd.c.Z1(e52Var.a));
        }
        return e5f.a;
    }
}
