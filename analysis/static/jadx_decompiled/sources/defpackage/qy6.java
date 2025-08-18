package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qy6 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ fz6 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy6(fz6 fz6Var, Continuation continuation) {
        super(2, continuation);
        this.Z = fz6Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((qy6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        qy6 qy6Var = new qy6(this.Z, continuation);
        qy6Var.Y = obj;
        return qy6Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        sx3 sx3Var;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        fz6 fz6Var = this.Z;
        if (i == 0) {
            od2.a0(obj);
            sx3Var = (sx3) this.Y;
            this.Y = sx3Var;
            this.X = 1;
            obj = j47.t0(((w9a) fz6Var.c).b(), new iy6(fz6Var, null), this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
                return x53.x0((Iterable) obj, new l45(2, fz6Var));
            }
            sx3Var = (sx3) this.Y;
            od2.a0(obj);
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(z53.S(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(j47.h(sx3Var, ((w9a) fz6Var.c).b(), new py6(fz6Var, (b86) it.next(), null), 2));
        }
        this.Y = null;
        this.X = 2;
        obj = pag.c(arrayList, this);
        if (obj == tx3Var) {
            return tx3Var;
        }
        return x53.x0((Iterable) obj, new l45(2, fz6Var));
    }
}
