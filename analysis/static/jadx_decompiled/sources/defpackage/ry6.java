package defpackage;

import android.os.SystemClock;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ry6 extends ffe implements a66 {
    public long X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ fz6 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry6(fz6 fz6Var, Continuation continuation) {
        super(2, continuation);
        this.s0 = fz6Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ry6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ry6 ry6Var = new ry6(this.s0, continuation);
        ry6Var.Z = obj;
        return ry6Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        long j;
        sx3 sx3Var;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        fz6 fz6Var = this.s0;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3Var2 = (sx3) this.Z;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            hm9.n(fz6.E0, "prefetch " + fz6Var.x0.get() + ": start load real albums");
            qy6 qy6Var = new qy6(fz6Var, null);
            this.Z = sx3Var2;
            this.X = jElapsedRealtime;
            this.Y = 1;
            Object objK = j1e.k(qy6Var, this);
            if (objK == tx3Var) {
                return tx3Var;
            }
            j = jElapsedRealtime;
            obj = objK;
            sx3Var = sx3Var2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.X;
            sx3Var = (sx3) this.Z;
            od2.a0(obj);
        }
        List list = (List) obj;
        boolean z = j1e.z(sx3Var);
        e5f e5fVar = e5f.a;
        if (!z) {
            return e5fVar;
        }
        fz6Var.v0.m(null, new p35(list));
        hm9.n(fz6.E0, "prefetch " + fz6Var.x0.get() + ": finish load real albums, time = " + (SystemClock.elapsedRealtime() - j) + "ms");
        return e5fVar;
    }
}
