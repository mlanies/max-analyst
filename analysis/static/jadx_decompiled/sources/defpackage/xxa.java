package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes.dex */
public final class xxa extends ffe implements a66 {
    public int X;
    public final /* synthetic */ eya Y;
    public final /* synthetic */ String Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xxa(eya eyaVar, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = eyaVar;
        this.Z = str;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((xxa) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new xxa(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object objM;
        Object objC;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        eya eyaVar = this.Y;
        if (i == 0) {
            od2.a0(obj);
            String str = this.Z;
            this.X = 1;
            sy1 sy1Var = new sy1(1, v3c.u(this));
            sy1Var.n();
            bc7[] bc7VarArr = eya.F0;
            eyaVar.r().d();
            eyaVar.r().i = new nw4(eyaVar, str, sy1Var, 10);
            yx7 yx7VarR = eyaVar.r();
            yx7VarR.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            hm9.H("yx7", "searchChats start", new Object[0]);
            yx7VarR.b();
            drd drdVarI = new q1a(2, new u24(yx7VarR, 5, str)).m(yx7VarR.c).i(yx7VarR.b);
            iq1 iq1Var = new iq1(new tx7(yx7VarR, jCurrentTimeMillis, str, 1), 2, new sx7(yx7VarR, str, 2));
            drdVarI.k(iq1Var);
            yx7VarR.k = iq1Var;
            sy1Var.d(new c01(7, eyaVar));
            objM = sy1Var.m();
            if (objM == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
                objC = obj;
                eyaVar.A0.setValue((List) objC);
                return e5f.a;
            }
            od2.a0(obj);
            objM = obj;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) objM) {
            kzc kzcVar = (kzc) obj2;
            boolean z = kzcVar.a == 4;
            boolean z2 = z && kzcVar.X.t();
            if (kzcVar.a == 1 || z2 || (((Boolean) eyaVar.Y.invoke()).booleanValue() && z)) {
                arrayList.add(obj2);
            }
        }
        ContextScope contextScopeA = j1e.a(this.b);
        ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(j47.h(contextScopeA, null, new wxa(it.next(), null, eyaVar), 3));
        }
        this.X = 2;
        objC = pag.c(arrayList2, this);
        if (objC == tx3Var) {
            return tx3Var;
        }
        eyaVar.A0.setValue((List) objC);
        return e5f.a;
    }
}
