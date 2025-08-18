package defpackage;

import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class vie extends ffe implements a66 {
    public xie X;
    public xie Y;
    public int Z;
    public final /* synthetic */ xie s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vie(xie xieVar, Continuation continuation) {
        super(2, continuation);
        this.s0 = xieVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((vie) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new vie(this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        xie xieVar;
        xie xieVar2;
        tx3 tx3Var = tx3.a;
        int i = this.Z;
        try {
            if (i == 0) {
                od2.a0(obj);
                xie xieVar3 = this.s0;
                try {
                    vy1 vy1VarH = od2.h(((vt7) xieVar3.Y.getValue()).stream());
                    this.X = xieVar3;
                    this.Y = xieVar3;
                    this.Z = 1;
                    if (od2.A(vy1VarH, this) == tx3Var) {
                        return tx3Var;
                    }
                    xieVar2 = xieVar3;
                    xieVar = xieVar2;
                } catch (Throwable th) {
                    th = th;
                    xieVar = xieVar3;
                    hm9.l0(xieVar.a, "fail to track pms keys", th);
                    return e5f.a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                xieVar = this.Y;
                xieVar2 = this.X;
                try {
                    od2.a0(obj);
                } catch (Throwable th2) {
                    th = th2;
                    hm9.l0(xieVar.a, "fail to track pms keys", th);
                    return e5f.a;
                }
            }
            se5 se5Var = (se5) ((qe5) xieVar2.Z.getValue());
            se5Var.getClass();
            kpa kpaVar = new kpa("analytics-enabled", String.valueOf(se5Var.n(PmsKey.f3analyticsenabled, true)));
            se5 se5Var2 = (se5) ((qe5) xieVar2.Z.getValue());
            se5Var2.getClass();
            Map mapA0 = mz7.a0(kpaVar, new kpa("new-session-logic", String.valueOf(se5Var2.n(PmsKey.f93newsessionlogic, false))));
            ((np) xieVar2.c()).getClass();
            if (!mapA0.isEmpty()) {
                pje pjeVar = kye.f;
                if (pjeVar == null) {
                    pjeVar = null;
                }
                pjeVar.b(mapA0);
            }
            return e5f.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
