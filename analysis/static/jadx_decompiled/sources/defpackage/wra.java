package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class wra extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ gh7 Z;
    public final /* synthetic */ fg7 s0;
    public final /* synthetic */ a66 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wra(gh7 gh7Var, fg7 fg7Var, a66 a66Var, Continuation continuation) {
        super(2, continuation);
        this.Z = gh7Var;
        this.s0 = fg7Var;
        this.t0 = a66Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((wra) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        wra wraVar = new wra(this.Z, this.s0, this.t0, continuation);
        wraVar.Y = obj;
        return wraVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        kg7 kg7Var;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kg7Var = (kg7) this.Y;
            try {
                od2.a0(obj);
                kg7Var.a();
                return obj;
            } catch (Throwable th) {
                th = th;
                kg7Var.a();
                throw th;
            }
        }
        od2.a0(obj);
        x77 x77Var = (x77) ((sx3) this.Y).getCoroutineContext().get(c32.X);
        if (x77Var == null) {
            throw new IllegalStateException("when[State] methods should have a parent job".toString());
        }
        vra vraVar = new vra();
        kg7 kg7Var2 = new kg7(this.Z, this.s0, vraVar.a, x77Var);
        try {
            a66 a66Var = this.t0;
            this.Y = kg7Var2;
            this.X = 1;
            obj = j47.t0(vraVar, a66Var, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
            kg7Var = kg7Var2;
            kg7Var.a();
            return obj;
        } catch (Throwable th2) {
            th = th2;
            kg7Var = kg7Var2;
            kg7Var.a();
            throw th;
        }
    }
}
