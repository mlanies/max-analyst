package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class mf1 extends ffe implements a66 {
    public final /* synthetic */ of1 X;
    public final /* synthetic */ String Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf1(of1 of1Var, String str, Continuation continuation) {
        super(2, continuation);
        this.X = of1Var;
        this.Y = str;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        mf1 mf1Var = (mf1) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        mf1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new mf1(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        of1 of1Var = this.X;
        String str = this.Y;
        of1Var.y0 = str;
        pqa pqaVar = (pqa) ((cra) of1Var.o).w0.a.getValue();
        if (!w9e.C0(str)) {
            kl7 kl7VarL = j1e.l();
            je7 je7Var = of1Var.s0;
            if (((b0d) je7Var.getValue()).h(pqaVar.a.b.getName(), str)) {
                kl7VarL.add(pqaVar.a);
            }
            Collection collectionValues = pqaVar.c.values();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : collectionValues) {
                if (((b0d) je7Var.getValue()).h(((fqa) obj2).b.getName(), str)) {
                    arrayList.add(obj2);
                }
            }
            kl7VarL.addAll(arrayList);
            of1.q(of1Var, j1e.d(kl7VarL), pqaVar.g);
        } else {
            kl7 kl7VarL2 = j1e.l();
            kl7VarL2.add(pqaVar.a);
            kl7VarL2.addAll(pqaVar.c.values());
            of1.q(of1Var, j1e.d(kl7VarL2), pqaVar.g);
        }
        return e5f.a;
    }
}
