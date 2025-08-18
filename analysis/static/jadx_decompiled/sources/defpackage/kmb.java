package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class kmb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ cnb Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmb(cnb cnbVar, Continuation continuation) {
        super(2, continuation);
        this.Y = cnbVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        kmb kmbVar = (kmb) n((chb) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        kmbVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        kmb kmbVar = new kmb(this.Y, continuation);
        kmbVar.X = obj;
        return kmbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        chb chbVar = (chb) this.X;
        boolean z = chbVar instanceof zgb;
        cnb cnbVar = this.Y;
        if (z) {
            zgb zgbVar = (zgb) chbVar;
            Long l = zgbVar.a;
            long jG = cnbVar.O0.g();
            if (l != null && l.longValue() == jG) {
                j47.T(cnbVar.a, ((w9a) cnbVar.u()).b(), null, new qmb(cnbVar, null), 2);
                pnf.o(cnbVar.z0, new zlb(zgbVar.b, Integer.valueOf(woc.I)));
            }
        } else {
            if (!(chbVar instanceof ahb)) {
                throw new NoWhenBranchMatchedException();
            }
            Long l2 = ((ahb) chbVar).a;
            long jG2 = cnbVar.O0.g();
            if (l2 != null && l2.longValue() == jG2) {
                pnf.o(cnbVar.z0, new zlb(new eqe(yea.Z), Integer.valueOf(yfa.k)));
            }
        }
        return e5f.a;
    }
}
