package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class f6e extends ffe implements a66 {
    public u4e X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ String s0;
    public final /* synthetic */ g6e t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6e(String str, g6e g6eVar, Continuation continuation) {
        super(2, continuation);
        this.s0 = str;
        this.t0 = g6eVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((f6e) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        f6e f6eVar = new f6e(this.s0, this.t0, continuation);
        f6eVar.Z = obj;
        return f6eVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        sx3 sx3Var;
        sx3 sx3Var2;
        u4e u4eVar;
        String name;
        ir6 ir6Var;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3Var3 = (sx3) this.Z;
            String str = this.s0;
            if (str == null || str.length() == 0) {
                g6e g6eVar = this.t0;
                bc7[] bc7VarArr = g6e.j;
                g6eVar.d.setValue(g6e.k);
                g6eVar.g.set(new c6e((String) null, 3));
                return e5fVar;
            }
            this.t0.g.updateAndGet(new o5e(this.s0, 1));
            y4e y4eVar = (y4e) this.t0.b.getValue();
            String str2 = this.s0;
            this.Z = sx3Var3;
            this.Y = 1;
            Object objD = y4e.d(y4eVar, str2, 0L, this, 6);
            if (objD == tx3Var) {
                return tx3Var;
            }
            sx3Var = sx3Var3;
            obj = objD;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u4eVar = this.X;
                sx3Var2 = (sx3) this.Z;
                od2.a0(obj);
                List list = (List) obj;
                this.t0.g.updateAndGet(new y5e(u4eVar, 2));
                name = sx3Var2.getClass().getName();
                ir6Var = hm9.m;
                if (ir6Var != null && ir6Var.c()) {
                    ir6Var.d(us7.X, name, "Stickers sets search. finish, size:" + u4eVar.a.size() + "|marker:" + u4eVar.b, null);
                }
                this.t0.d.m(null, new d6e(2, false, list));
                return e5fVar;
            }
            sx3Var = (sx3) this.Z;
            od2.a0(obj);
        }
        u4e u4eVar2 = (u4e) obj;
        uqd uqdVarC = ((a4e) this.t0.a.getValue()).c(u4eVar2.a);
        this.Z = sx3Var;
        this.X = u4eVar2;
        this.Y = 2;
        Object objF = s36.f(uqdVarC, this);
        if (objF == tx3Var) {
            return tx3Var;
        }
        sx3Var2 = sx3Var;
        u4eVar = u4eVar2;
        obj = objF;
        List list2 = (List) obj;
        this.t0.g.updateAndGet(new y5e(u4eVar, 2));
        name = sx3Var2.getClass().getName();
        ir6Var = hm9.m;
        if (ir6Var != null) {
            ir6Var.d(us7.X, name, "Stickers sets search. finish, size:" + u4eVar.a.size() + "|marker:" + u4eVar.b, null);
        }
        this.t0.d.m(null, new d6e(2, false, list2));
        return e5fVar;
    }
}
