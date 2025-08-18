package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class sxa extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ txa Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sxa(txa txaVar, Continuation continuation) {
        super(2, continuation);
        this.Z = txaVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((sxa) n((Set) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        sxa sxaVar = new sxa(this.Z, continuation);
        sxaVar.Y = obj;
        return sxaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            Set set = (Set) this.Y;
            boolean zIsEmpty = set.isEmpty();
            txa txaVar = this.Z;
            if (zIsEmpty) {
                txaVar.o.m(null, oz4.a);
            } else {
                CharSequence charSequence = (CharSequence) txaVar.t0.getValue();
                if (!(charSequence == null || charSequence.length() == 0)) {
                    pnf.o(txaVar.s0, uxa.a);
                }
                ArrayList arrayList = new ArrayList(z53.S(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(txaVar.b.g(((Number) it.next()).longValue()));
                }
                ki4 ki4Var = new ki4((mn5[]) x53.D0(arrayList).toArray(new mn5[0]), 3);
                v59 v59Var = new v59(2, txaVar.o, ti9.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 6);
                this.X = 1;
                if (od2.r(ki4Var, v59Var, this) == tx3Var) {
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
