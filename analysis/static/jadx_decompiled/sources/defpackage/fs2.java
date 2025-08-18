package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class fs2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ks2 Y;
    public final /* synthetic */ je7 Z;
    public final /* synthetic */ je7 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs2(ks2 ks2Var, je7 je7Var, je7 je7Var2, Continuation continuation) {
        super(2, continuation);
        this.Y = ks2Var;
        this.Z = je7Var;
        this.s0 = je7Var2;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((fs2) n((zy3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        fs2 fs2Var = new fs2(this.Y, this.Z, this.s0, continuation);
        fs2Var.X = obj;
        return fs2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        zy3 zy3Var = (zy3) this.X;
        boolean z = zy3Var instanceof xy3;
        e5f e5fVar = e5f.a;
        ks2 ks2Var = this.Y;
        if (z) {
            if (((xy3) zy3Var).a != ks2Var.C0.get()) {
                return e5fVar;
            }
            pnf.o(ks2Var.B0, cs2.a);
        } else {
            if (!(zy3Var instanceof yy3)) {
                throw new NoWhenBranchMatchedException();
            }
            yy3 yy3Var = (yy3) zy3Var;
            if (yy3Var.a != ks2Var.C0.get()) {
                return e5fVar;
            }
            vxd vxdVarN = pnf.n(ks2Var, ((w9a) ((kke) this.Z.getValue())).b(), null, new es2(ks2Var, zy3Var, null), 2);
            ks2Var.E0.o1(ks2Var, ks2.I0[1], vxdVarN);
            se5 se5Var = (se5) ((qe5) this.s0.getValue());
            se5Var.getClass();
            boolean zN = se5Var.n(PmsKey.f33editchanneltypescreenenabled, false);
            long j = yy3Var.b;
            s35 s35Var = ks2Var.A0;
            if (zN) {
                pnf.o(s35Var, new qr2(j));
            } else {
                pnf.o(s35Var, new pr2(j));
            }
        }
        return e5fVar;
    }
}
