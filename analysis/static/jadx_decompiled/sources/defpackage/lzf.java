package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lzf extends ffe implements a66 {
    public int X;
    public final /* synthetic */ zzf Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lzf(zzf zzfVar, Continuation continuation) {
        super(2, continuation);
        this.Y = zzfVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((lzf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new lzf(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            zzf zzfVar = this.Y;
            q0e q0eVar = zzfVar.F0;
            Boolean bool = Boolean.FALSE;
            q0eVar.m(null, bool);
            zzfVar.G0.m(null, bool);
            zzfVar.B0 = null;
            Iterator it = ((List) zzfVar.D0.c).iterator();
            while (it.hasNext()) {
                ((ia7) it.next()).d(null);
            }
            Object objT0 = j47.t0(((w9a) ((kke) zzfVar.u0.getValue())).b(), new nzf(zzfVar, null), this);
            if (objT0 != tx3Var) {
                objT0 = e5fVar;
            }
            if (objT0 == tx3Var) {
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
