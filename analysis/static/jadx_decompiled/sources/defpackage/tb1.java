package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class tb1 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ List Z;
    public final /* synthetic */ int s0;
    public final /* synthetic */ vb1 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb1(List list, int i, vb1 vb1Var, Continuation continuation) {
        super(2, continuation);
        this.Z = list;
        this.s0 = i;
        this.t0 = vb1Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((tb1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        tb1 tb1Var = new tb1(this.Z, this.s0, this.t0, continuation);
        tb1Var.Y = obj;
        return tb1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object value;
        Object objA;
        Object value2;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        vb1 vb1Var = this.t0;
        int i2 = this.s0;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3Var = (sx3) this.Y;
            List list = this.Z;
            if (list.isEmpty() || i2 == 0) {
                q0e q0eVar = vb1Var.w0;
                do {
                    value = q0eVar.getValue();
                } while (!q0eVar.c(value, nb1.a((nb1) value, null, null, null, false, null, null, vb1.q(vb1Var, nz4.a, i2), 63)));
                return e5fVar;
            }
            ArrayList arrayList = new ArrayList(z53.S(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ds3) vb1Var.s0.getValue()).c(((Number) it.next()).longValue()));
            }
            sb1 sb1Var = new sb1((mn5[]) x53.D0(arrayList).toArray(new mn5[0]), sx3Var, list, vb1Var, 0);
            int i3 = ft4.o;
            ac acVarH = nu0.h(sb1Var, ft4.e(z7.R(5, kt4.SECONDS)), new pb1(2, null));
            this.X = 1;
            objA = od2.A(acVarH, this);
            if (objA == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
            objA = obj;
        }
        Object obj2 = ((pjc) objA).a;
        if (obj2 instanceof njc) {
            obj2 = null;
        }
        uj3[] uj3VarArr = (uj3[]) obj2;
        ArrayList arrayListD0 = uj3VarArr != null ? ys.d0(uj3VarArr) : null;
        if (arrayListD0 == null) {
            return e5fVar;
        }
        List<uj3> listY0 = x53.y0(arrayListD0, i2 <= 3 ? i2 : 2);
        ArrayList arrayList2 = new ArrayList();
        for (uj3 uj3Var : listY0) {
            arrayList2.add(new kpa(oag.a(uj3Var.m(), new Long(uj3Var.n())), uj3Var.p(kk0.a)));
        }
        if (i2 > 3) {
            arrayList2.add(vb1.C0);
        }
        q0e q0eVar2 = vb1Var.w0;
        do {
            value2 = q0eVar2.getValue();
        } while (!q0eVar2.c(value2, nb1.a((nb1) value2, null, null, null, false, null, arrayList2, vb1.q(vb1Var, arrayListD0, i2), 31)));
        return e5fVar;
    }
}
