package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class oj7 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ vj7 Y;
    public final /* synthetic */ String Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj7(vj7 vj7Var, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = vj7Var;
        this.Z = str;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((oj7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new oj7(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            nj7 nj7Var = new nj7(((zb2) ((ta2) this.Y.p.getValue())).g(), this.Z, 0);
            this.X = 1;
            obj = od2.C(nj7Var, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return obj;
    }
}
