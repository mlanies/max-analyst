package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class n25 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ o25 Z;
    public final /* synthetic */ String s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n25(o25 o25Var, String str, Continuation continuation) {
        super(2, continuation);
        this.Z = o25Var;
        this.s0 = str;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((n25) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        n25 n25Var = new n25(this.Z, this.s0, continuation);
        n25Var.Y = obj;
        return n25Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        sx3 sx3Var;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        o25 o25Var = this.Z;
        try {
            if (i == 0) {
                od2.a0(obj);
                sx3 sx3Var2 = (sx3) this.Y;
                o25Var.t0 = true;
                khe kheVar = j15.a;
                String strA = j15.a(this.s0);
                if (!j1e.z(sx3Var2)) {
                    return e5fVar;
                }
                t33 t33Var = (t33) ((q33) o25Var.b.getValue());
                boolean zF = tpa.f(t33Var.g.getString("app.pin_" + t33Var.t(), null), strA);
                s35 s35Var = o25Var.X;
                if (!zF) {
                    pnf.o(s35Var, p25.b);
                    return e5fVar;
                }
                pnf.o(s35Var, p25.a);
                this.Y = sx3Var2;
                this.X = 1;
                if (j47.x(1000L, this) == tx3Var) {
                    return tx3Var;
                }
                sx3Var = sx3Var2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sx3Var = (sx3) this.Y;
                od2.a0(obj);
            }
            if (j1e.z(sx3Var)) {
                pnf.o(o25Var.Y, e5fVar);
            }
            return e5fVar;
        } finally {
            o25Var.t0 = false;
        }
    }
}
