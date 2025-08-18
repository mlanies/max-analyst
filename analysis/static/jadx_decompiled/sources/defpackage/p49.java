package defpackage;

import java.util.EnumSet;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class p49 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ n59 Z;
    public final /* synthetic */ List s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p49(n59 n59Var, List list, Continuation continuation) {
        super(2, continuation);
        this.Z = n59Var;
        this.s0 = list;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((p49) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        p49 p49Var = new p49(this.Z, this.s0, continuation);
        p49Var.Y = obj;
        return p49Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        String[] strArr;
        Object njcVar;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            EnumSet enumSetNoneOf = EnumSet.noneOf(da3.class);
            bc7[] bc7VarArr = n59.D1;
            n59 n59Var = this.Z;
            qyc qycVar = (qyc) ((y7d) n59Var.D0.getValue());
            qycVar.getClass();
            List listH = qycVar.h(PmsKey.f8availablecomplaints.name(), null);
            if (listH == null || (strArr = (String[]) listH.toArray(new String[0])) == null) {
                strArr = new String[0];
            }
            for (String str : strArr) {
                try {
                    njcVar = da3.a(str);
                } catch (Throwable th) {
                    njcVar = new njc(th);
                }
                if (njcVar instanceof njc) {
                    njcVar = null;
                }
                da3 da3Var = (da3) njcVar;
                if (da3Var != null) {
                    enumSetNoneOf.add(da3Var);
                }
            }
            if (!enumSetNoneOf.isEmpty()) {
                mg3 mg3Var = hs8.a;
                eqe eqeVar = new eqe(oda.x);
                eqe eqeVar2 = new eqe(oda.w);
                kl7 kl7VarL = j1e.l();
                if (enumSetNoneOf.contains(da3.SPAM)) {
                    kl7VarL.add(new mg3(mda.k, new eqe(oda.C), 3, false));
                }
                if (enumSetNoneOf.contains(da3.PORNO)) {
                    kl7VarL.add(new mg3(mda.j, new eqe(oda.B), 3, false));
                }
                if (enumSetNoneOf.contains(da3.FAKE)) {
                    kl7VarL.add(new mg3(mda.h, new eqe(oda.z), 3, false));
                }
                if (enumSetNoneOf.contains(da3.EXTREMISM)) {
                    kl7VarL.add(new mg3(mda.g, new eqe(oda.y), 3, false));
                }
                if (enumSetNoneOf.contains(da3.THREAT)) {
                    kl7VarL.add(new mg3(mda.l, new eqe(oda.D), 3, false));
                }
                if (enumSetNoneOf.contains(da3.OTHER)) {
                    kl7VarL.add(new mg3(mda.i, new eqe(oda.A), 3, false));
                }
                kl7VarL.add(hs8.a);
                pnf.o(n59Var.u1, new fnd(this.s0, eqeVar, eqeVar2, j1e.d(kl7VarL)));
            } else {
                cx7 cx7VarC = ((w9a) n59Var.Y).c();
                o49 o49Var = new o49(n59Var, null);
                this.X = 1;
                if (j47.t0(cx7VarC, o49Var, this) == tx3Var) {
                    return tx3Var;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5f.a;
    }
}
