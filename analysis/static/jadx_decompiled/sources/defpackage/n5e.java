package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class n5e extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ q5e Z;
    public final /* synthetic */ l5e s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5e(q5e q5eVar, l5e l5eVar, Continuation continuation) {
        super(2, continuation);
        this.Z = q5eVar;
        this.s0 = l5eVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((n5e) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        n5e n5eVar = new n5e(this.Z, this.s0, continuation);
        n5eVar.Y = obj;
        return n5eVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        sx3 sx3Var;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3Var2 = (sx3) this.Y;
            y4e y4eVar = (y4e) this.Z.o.getValue();
            l5e l5eVar = this.s0;
            String str = l5eVar.a;
            long j = l5eVar.b;
            this.Y = sx3Var2;
            this.X = 1;
            Object objB = y4eVar.b(str, j, 50, this);
            if (objB == tx3Var) {
                return tx3Var;
            }
            sx3Var = sx3Var2;
            obj = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sx3Var = (sx3) this.Y;
            od2.a0(obj);
        }
        t4e t4eVar = (t4e) obj;
        this.Z.w0.updateAndGet(new m5e(t4eVar, 0));
        String name = sx3Var.getClass().getName();
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, name, "Stickers search next page. finish, size:" + t4eVar.a.size() + "|marker:" + t4eVar.b, null);
        }
        List list = t4eVar.a;
        q5e q5eVar = this.Z;
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(q5e.q(q5eVar, (d2e) it.next()));
        }
        this.Z.Z.m(null, new szc(2, x53.t0(((szc) this.Z.Z.getValue()).b, arrayList)));
        return e5f.a;
    }
}
