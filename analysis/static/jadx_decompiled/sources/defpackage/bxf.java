package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bxf extends ffe implements a66 {
    public int X;
    public final /* synthetic */ dxf Y;
    public final /* synthetic */ gxf Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxf(dxf dxfVar, gxf gxfVar, Continuation continuation) {
        super(2, continuation);
        this.Y = dxfVar;
        this.Z = gxfVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((bxf) n((e5f) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new bxf(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            if (dxf.f(this.Y, this.Z, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5f.a;
    }
}
