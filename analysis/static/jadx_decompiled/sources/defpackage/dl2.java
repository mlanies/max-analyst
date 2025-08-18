package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class dl2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ fl2 Y;
    public final /* synthetic */ fs8 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl2(fl2 fl2Var, fs8 fs8Var, Continuation continuation) {
        super(2, continuation);
        this.Y = fl2Var;
        this.Z = fs8Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((dl2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new dl2(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        fl2 fl2Var = this.Y;
        if (i == 0) {
            od2.a0(obj);
            il2 il2Var = (il2) fl2Var.a;
            this.X = 1;
            obj = od2.A(il2Var.a, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        long jLongValue = ((Number) obj).longValue();
        au8 au8Var = (au8) ((je7) fl2Var.d).getValue();
        fs8 fs8Var = this.Z;
        cu8 cu8VarJ = au8Var.j(jLongValue, fs8Var.a);
        if (cu8VarJ == null) {
            long jT = ((hyc) ((q33) ((je7) fl2Var.f).getValue())).t();
            je7 je7Var = (je7) fl2Var.d;
            cu8VarJ = ((au8) je7Var.getValue()).q(((au8) je7Var.getValue()).f(jLongValue, jT, this.Z));
            ((p82) ((je7) fl2Var.e).getValue()).T(jLongValue, fs8Var.o == jT, cu8VarJ, false, 0L);
        }
        return cu8VarJ;
    }
}
