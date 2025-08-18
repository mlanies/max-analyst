package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class p5e extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ q5e s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5e(String str, q5e q5eVar, Continuation continuation) {
        super(2, continuation);
        this.Z = str;
        this.s0 = q5eVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((p5e) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        p5e p5eVar = new p5e(this.Z, this.s0, continuation);
        p5eVar.Y = obj;
        return p5eVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        sx3 sx3Var;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3Var2 = (sx3) this.Y;
            String str = this.Z;
            if (str == null || str.length() == 0) {
                this.s0.w0.updateAndGet(new oe2(11));
                this.s0.Z.m(null, new szc(2, (List) this.s0.v0.get()));
                return e5fVar;
            }
            this.s0.w0.updateAndGet(new o5e(this.Z, 0));
            y4e y4eVar = (y4e) this.s0.o.getValue();
            String str2 = this.Z;
            this.Y = sx3Var2;
            this.X = 1;
            Object objB = y4eVar.b(str2, 0L, 50, this);
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
        this.s0.w0.updateAndGet(new m5e(t4eVar, 1));
        String name = sx3Var.getClass().getName();
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, name, "Stickers search. finish, size:" + t4eVar.a.size() + "|marker:" + t4eVar.b, null);
        }
        List list = t4eVar.a;
        q5e q5eVar = this.s0;
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(q5e.q(q5eVar, (d2e) it.next()));
        }
        this.s0.Z.m(null, new szc(arrayList.isEmpty() ? 3 : 2, arrayList));
        return e5fVar;
    }
}
