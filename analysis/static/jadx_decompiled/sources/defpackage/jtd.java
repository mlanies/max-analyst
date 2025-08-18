package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jtd extends ffe implements a66 {
    public int X;
    public final /* synthetic */ je7 Y;
    public final /* synthetic */ ltd Z;
    public final /* synthetic */ je7 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jtd(je7 je7Var, ltd ltdVar, je7 je7Var2, Continuation continuation) {
        super(2, continuation);
        this.Y = je7Var;
        this.Z = ltdVar;
        this.s0 = je7Var2;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((jtd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new jtd(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            t03 t03Var = new t03(((jz2) ((iy2) this.Y.getValue())).m(this.Z.a), 11);
            this.X = 1;
            obj = od2.A(t03Var, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
                return e5f.a;
            }
            od2.a0(obj);
        }
        xb9 xb9Var = (xb9) this.s0.getValue();
        this.X = 2;
        if (xb9Var.o((e52) obj, this) == tx3Var) {
            return tx3Var;
        }
        return e5f.a;
    }
}
