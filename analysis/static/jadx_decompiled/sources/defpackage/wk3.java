package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wk3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ zk3 Y;
    public final /* synthetic */ String Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk3(zk3 zk3Var, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = zk3Var;
        this.Z = str;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((wk3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new wk3(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            a03 a03Var = (a03) this.Y.k.getValue();
            this.X = 1;
            obj = a03Var.a(this.Z, 3, this);
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
