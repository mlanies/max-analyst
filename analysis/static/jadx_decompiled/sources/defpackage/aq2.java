package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public final class aq2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ rq2 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ CharSequence s0;
    public final /* synthetic */ List t0;
    public final /* synthetic */ boolean u0;
    public final /* synthetic */ Long v0;
    public final /* synthetic */ cz5 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq2(rq2 rq2Var, long j, CharSequence charSequence, List list, boolean z, Long l, cz5 cz5Var, Continuation continuation) {
        super(2, continuation);
        this.Y = rq2Var;
        this.Z = j;
        this.s0 = charSequence;
        this.t0 = list;
        this.u0 = z;
        this.v0 = l;
        this.w0 = cz5Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((aq2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new aq2(this.Y, this.Z, this.s0, this.t0, this.u0, this.v0, this.w0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        int size;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        rq2 rq2Var = this.Y;
        if (i == 0) {
            od2.a0(obj);
            p5d p5dVar = (p5d) rq2Var.D0.getValue();
            this.X = 1;
            if (p5dVar.a(this.Z, this.s0, this.t0, this.u0, this.v0, this.w0, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
                pnf.o(rq2Var.b1, (zo2) obj);
                return e5f.a;
            }
            od2.a0(obj);
        }
        rq2Var.s();
        boolean z = this.u0;
        List list = this.t0;
        if (z) {
            size = list.size();
        } else {
            qyc qycVar = (qyc) ((y7d) rq2Var.y0.getValue());
            qycVar.getClass();
            int iQ = (int) qycVar.q(PmsKey.f62maxattachcount, 12);
            size = (list.size() / iQ) + (list.size() % iQ == 0 ? 0 : 1);
        }
        int i2 = size;
        lu0 lu0Var = (lu0) rq2Var.E0.getValue();
        this.X = 2;
        obj = zo2.d.c(this.Z, i2, lu0Var, this.w0, false, this);
        if (obj == tx3Var) {
            return tx3Var;
        }
        pnf.o(rq2Var.b1, (zo2) obj);
        return e5f.a;
    }
}
