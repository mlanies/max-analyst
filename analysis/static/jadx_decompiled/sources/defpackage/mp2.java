package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class mp2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ rq2 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mp2(rq2 rq2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = rq2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((mp2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new mp2(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        rq2 rq2Var = this.Y;
        if (i == 0) {
            od2.a0(obj);
            e52 e52Var = (e52) rq2Var.Y0.a.getValue();
            if (e52Var != null) {
                eyd eydVar = (eyd) rq2Var.B0.getValue();
                String str = rq2Var.b;
                if (!(!(str == null || str.length() == 0))) {
                    str = null;
                }
                this.X = 1;
                if (eydVar.a(e52Var.a, str, this) == tx3Var) {
                    return tx3Var;
                }
            }
            return e5fVar;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        od2.a0(obj);
        rq2Var.b = null;
        return e5fVar;
    }
}
