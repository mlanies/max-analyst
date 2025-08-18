package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class fu5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ nu5 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu5(nu5 nu5Var, Continuation continuation) {
        super(2, continuation);
        this.Y = nu5Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((fu5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new fu5(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            at5 at5Var = this.Y.A0;
            Iterable iterable = (Iterable) this.Y.y0.get();
            ArrayList arrayList = new ArrayList(z53.S(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(new Long(((e52) it.next()).b.a));
            }
            AbstractCollection abstractCollectionZ = arrayList;
            abstractCollectionZ = arrayList;
            if (this.Y.b != null && at5Var != null) {
                abstractCollectionZ = bcd.Z(at5Var.v0, arrayList);
            }
            nx3 nx3VarB = ((w9a) this.Y.o).b();
            eu5 eu5Var = new eu5(abstractCollectionZ, this.Y, null);
            this.X = 1;
            obj = j47.t0(nx3VarB, eu5Var, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        pnf.o(this.Y.x0, new pt5((List) obj));
        return e5f.a;
    }
}
