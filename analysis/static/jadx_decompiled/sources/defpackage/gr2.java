package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gr2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ jr2 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr2(jr2 jr2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = jr2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((gr2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        gr2 gr2Var = new gr2(this.Y, continuation);
        gr2Var.X = obj;
        return gr2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        sx3 sx3Var = (sx3) this.X;
        boolean zBooleanValue = ((Boolean) this.Y.d.invoke()).booleanValue();
        e5f e5fVar = e5f.a;
        if (!zBooleanValue) {
            return e5fVar;
        }
        this.Y.j = false;
        x77 x77Var = this.Y.f;
        if (x77Var != null) {
            x77Var.cancel(null);
        }
        jr2 jr2Var = this.Y;
        jr2Var.f = j47.T(sx3Var, jr2Var.l, null, new cr2(jr2Var, null), 2);
        jr2 jr2Var2 = this.Y;
        ac acVar = new ac(new t03(((jz2) jr2Var2.c).m(jr2Var2.a), 11), 14, this.Y);
        int i = ft4.o;
        od2.L(new ac(new zn5(od2.u(acVar, j47.p0(z7.R(10, kt4.SECONDS))), new dr2(this.Y, null), 5), 18, new er2(3, null, 0)), sx3Var);
        return e5fVar;
    }
}
