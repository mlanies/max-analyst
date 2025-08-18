package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xcd extends ffe implements a66 {
    public add X;
    public s35 Y;
    public int Z;
    public final /* synthetic */ add s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xcd(add addVar, Continuation continuation) {
        super(2, continuation);
        this.s0 = addVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((xcd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new xcd(this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        s35 s35Var;
        add addVar;
        tx3 tx3Var = tx3.a;
        int i = this.Z;
        add addVar2 = this.s0;
        if (i == 0) {
            od2.a0(obj);
            q0e q0eVar = addVar2.D0;
            this.X = addVar2;
            s35Var = addVar2.A0;
            this.Y = s35Var;
            this.Z = 1;
            obj = addVar2.o.a(this);
            if (obj == tx3Var) {
                return tx3Var;
            }
            addVar = addVar2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
                return e5f.a;
            }
            s35Var = this.Y;
            addVar = this.X;
            od2.a0(obj);
        }
        agd agdVar = new agd((Uri) obj);
        bc7[] bc7VarArr = add.K0;
        addVar.getClass();
        pnf.o(s35Var, agdVar);
        nx3 nx3VarA = ((w9a) addVar2.r()).a();
        wcd wcdVar = new wcd(2, null);
        this.X = null;
        this.Y = null;
        this.Z = 2;
        if (j47.t0(nx3VarA, wcdVar, this) == tx3Var) {
            return tx3Var;
        }
        return e5f.a;
    }
}
