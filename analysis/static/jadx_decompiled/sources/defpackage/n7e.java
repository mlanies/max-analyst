package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class n7e extends ffe implements a66 {
    public int X;
    public final /* synthetic */ a8e Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7e(a8e a8eVar, Continuation continuation) {
        super(2, continuation);
        this.Y = a8eVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((n7e) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new n7e(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        a8e a8eVar = this.Y;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7VarArr = a8e.C0;
            e0a e0aVarA = ((md5) a8eVar.Z.getValue()).a();
            this.X = 1;
            obj = s36.g(e0aVarA, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
                pnf.o(a8eVar.A0, new ued(woc.w, new eqe(hja.x)));
                return e5fVar;
            }
            od2.a0(obj);
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(z53.S(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(new Long(((d2e) it.next()).a));
        }
        if (arrayList.isEmpty()) {
            return e5fVar;
        }
        bc7[] bc7VarArr2 = a8e.C0;
        db3 db3VarD = ((md5) a8eVar.Z.getValue()).d(arrayList);
        this.X = 2;
        if (s36.e(db3VarD, this) == tx3Var) {
            return tx3Var;
        }
        pnf.o(a8eVar.A0, new ued(woc.w, new eqe(hja.x)));
        return e5fVar;
    }
}
