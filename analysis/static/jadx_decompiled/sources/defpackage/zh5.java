package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zh5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ bi5 Y;
    public final /* synthetic */ String Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh5(bi5 bi5Var, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = bi5Var;
        this.Z = str;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((zh5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new zh5(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            bi5 bi5Var = this.Y;
            mqc mqcVar = new mqc(new co5(bi5Var.c, new zn5(bi5Var.m, new wh5(this.Z, null)), new jy2(13, bi5Var), null));
            xw xwVar = new xw(7, bi5Var);
            this.X = 1;
            if (mqcVar.d(xwVar, this) == tx3Var) {
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
