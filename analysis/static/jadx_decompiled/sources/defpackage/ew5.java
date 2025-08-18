package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ew5 extends ffe implements a66 {
    public w9f X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ iw5 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew5(iw5 iw5Var, Continuation continuation) {
        super(2, continuation);
        this.s0 = iw5Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ew5) n((List) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ew5 ew5Var = new ew5(this.s0, continuation);
        ew5Var.Z = obj;
        return ew5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object objT0;
        List<at5> list;
        w9f w9fVar;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        e5f e5fVar = e5f.a;
        iw5 iw5Var = this.s0;
        if (i == 0) {
            od2.a0(obj);
            List list2 = (List) this.Z;
            w9f w9fVar2 = new w9f(null, v9f.c, new eqe(qba.m));
            ta2 ta2Var = iw5Var.b;
            this.Z = list2;
            this.X = w9fVar2;
            this.Y = 1;
            zb2 zb2Var = (zb2) ta2Var;
            zb2Var.getClass();
            objT0 = j47.t0(zb2Var.Y, new gb2(zb2Var, null), this);
            if (objT0 == tx3Var) {
                return tx3Var;
            }
            list = list2;
            w9fVar = w9fVar2;
        } else {
            if (i != 1) {
                if (i == 2) {
                    od2.a0(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w9fVar = this.X;
            List list3 = (List) this.Z;
            od2.a0(obj);
            list = list3;
            objT0 = obj;
        }
        Iterable<at5> iterable = (Iterable) objT0;
        ArrayList arrayList = new ArrayList(z53.S(iterable, 10));
        for (at5 at5Var : iterable) {
            v9f v9fVar = v9f.o;
            CharSequence charSequence = at5Var != null ? at5Var.b : null;
            if (charSequence == null) {
                charSequence = "";
            }
            arrayList.add(new w9f(at5Var, v9fVar, new iqe(charSequence)));
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        for (at5 at5Var2 : list) {
            arrayList2.add(new w9f(at5Var2, tpa.f(at5Var2.a, "all.chat.folder") ? v9f.a : v9f.b, new iqe(((hda) iw5Var.o.getValue()).a(at5Var2.b, at5Var2.y0, 2, false, 0, true))));
        }
        arrayList2.add(w9fVar);
        arrayList2.addAll(arrayList);
        q0e q0eVar = iw5Var.X;
        this.Z = null;
        this.X = null;
        this.Y = 2;
        q0eVar.m(null, arrayList2);
        return e5fVar == tx3Var ? tx3Var : e5fVar;
    }
}
