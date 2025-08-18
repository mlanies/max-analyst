package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class el2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ fl2 Y;
    public final /* synthetic */ fs8 Z;
    public final /* synthetic */ nx8 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el2(fl2 fl2Var, fs8 fs8Var, nx8 nx8Var, Continuation continuation) {
        super(2, continuation);
        this.Y = fl2Var;
        this.Z = fs8Var;
        this.s0 = nx8Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((el2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new el2(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        fl2 fl2Var = this.Y;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            obj = fl2.b(fl2Var, this.Z, this);
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
        ((q0e) fl2Var.h).m(null, new gk6(cu8Var.o, cu8Var.b, cu8Var.c, this.s0.o));
        return e5f.a;
    }
}
