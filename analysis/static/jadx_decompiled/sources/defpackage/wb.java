package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ bc Y;
    public final /* synthetic */ String Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb(bc bcVar, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = bcVar;
        this.Z = str;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((wb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new wb(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        String strB;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            pb pbVar = this.Y.c;
            this.X = 1;
            List list = (List) pbVar.h.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                uj3 uj3Var = (uj3) obj2;
                String strValueOf = String.valueOf(uj3Var.o());
                String str = this.Z;
                if (!eae.o0(strValueOf, str, false)) {
                    je7 je7Var = pbVar.e;
                    if (((b0d) je7Var.getValue()).h(String.valueOf(uj3Var.d()), str) || ((strB = bre.b(uj3Var.g())) != null && ((b0d) je7Var.getValue()).h(strB, str))) {
                    }
                }
                arrayList.add(obj2);
            }
            ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(pbVar.b((uj3) it.next()));
            }
            ((oq3) pbVar.b.getValue()).c(arrayList2, new k8(6));
            Object objA = pbVar.k.a(arrayList2, this);
            if (objA != tx3Var) {
                objA = e5fVar;
            }
            if (objA == tx3Var) {
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
