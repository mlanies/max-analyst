package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class xl4 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ yl4 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl4(yl4 yl4Var, Continuation continuation) {
        super(2, continuation);
        this.Y = yl4Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((xl4) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new xl4(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            yl4 yl4Var = this.Y;
            si9 si9Var = (si9) yl4Var.c.getValue();
            int i2 = ft4.o;
            m32 m32VarQ = nu0.Q(si9Var, z7.R(1, kt4.SECONDS));
            xw xwVar = new xw(5, yl4Var);
            this.X = 1;
            Object objD = m32VarQ.d(new zb(xwVar, 19, yl4Var), this);
            if (objD != tx3Var) {
                objD = e5fVar;
            }
            if (objD == tx3Var) {
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
