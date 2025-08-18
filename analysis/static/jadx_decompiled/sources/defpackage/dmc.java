package defpackage;

import android.os.CancellationSignal;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dmc extends ffe implements a66 {
    public int X;
    public final /* synthetic */ hmc Y;
    public final /* synthetic */ long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmc(hmc hmcVar, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = hmcVar;
        this.Z = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((dmc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new dmc(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            s1e s1eVarA = this.Y.a();
            this.X = 1;
            s1eVarA.getClass();
            xlc xlcVarA = xlc.a(1, "SELECT * FROM events WHERE id = ?");
            xlcVarA.j(1, this.Z);
            obj = ote.i(s1eVarA.a, new CancellationSignal(), new r1e(s1eVarA, xlcVarA, 1), this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        c0e c0eVar = (c0e) obj;
        if (c0eVar == null) {
            return null;
        }
        long j = c0eVar.a;
        return new ps7(c0eVar.b, j, c0eVar.c, c0eVar.d);
    }
}
