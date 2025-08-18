package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class kf1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ of1 Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ je7 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf1(of1 of1Var, boolean z, je7 je7Var, Continuation continuation) {
        super(2, continuation);
        this.Y = of1Var;
        this.Z = z;
        this.s0 = je7Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        kf1 kf1Var = (kf1) n((aa) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        kf1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        kf1 kf1Var = new kf1(this.Y, this.Z, this.s0, continuation);
        kf1Var.X = obj;
        return kf1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object value;
        wf1 wf1Var;
        kl7 kl7VarR;
        boolean z;
        List listD;
        od2.a0(obj);
        aa aaVar = (aa) this.X;
        of1 of1Var = this.Y;
        q0e q0eVar = of1Var.z0;
        do {
            value = q0eVar.getValue();
            wf1Var = (wf1) value;
            kl7VarR = of1.r(aaVar.a, this.Z);
            z = aaVar.a;
            if (z) {
                aa aaVar2 = (aa) ((yz0) ((ez0) of1Var.t0.getValue())).F0.getValue();
                boolean z2 = aaVar2.b;
                kl7 kl7VarL = j1e.l();
                if (z2) {
                    kl7VarL.add(new l7a(y7a.b, Integer.valueOf(b8a.a), (Integer) null, Integer.valueOf(x7a.f), (Integer) null, 52));
                }
                if (aaVar2.c) {
                    kl7VarL.add(new l7a(y7a.d, Integer.valueOf(b8a.c), (Integer) null, Integer.valueOf(x7a.i), (Integer) null, 52));
                }
                kl7VarL.add(new l7a(y7a.c, Integer.valueOf(b8a.b), (Integer) null, Integer.valueOf(x7a.L), (Integer) null, 52));
                listD = j1e.d(kl7VarL);
            } else {
                listD = nz4.a;
            }
            if (!((se5) ((qe5) this.s0.getValue())).q()) {
                z = false;
            }
        } while (!q0eVar.c(value, wf1.a(wf1Var, null, kl7VarR, listD, true, null, z, 17)));
        return e5f.a;
    }
}
