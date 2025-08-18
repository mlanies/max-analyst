package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class x5e extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ b6e Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5e(b6e b6eVar, Continuation continuation) {
        super(2, continuation);
        this.Z = b6eVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((x5e) n((r0d) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        x5e x5eVar = new x5e(this.Z, continuation);
        x5eVar.Y = obj;
        return x5eVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        r0d r0dVar;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            r0d r0dVar2 = (r0d) this.Y;
            String name = this.Z.getClass().getName();
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.X, name, ey8.j("Sets loader. Section with sets exist:", r0dVar2 != null), null);
            }
            if ((r0dVar2 instanceof d4e) && ((List) this.Z.d.getValue()).isEmpty()) {
                uqd uqdVarC = ((a4e) this.Z.a.getValue()).c(((d4e) r0dVar2).c);
                this.Y = r0dVar2;
                this.X = 1;
                Object objF = s36.f(uqdVarC, this);
                if (objF == tx3Var) {
                    return tx3Var;
                }
                r0dVar = r0dVar2;
                obj = objF;
            }
            return e5f.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        r0dVar = (r0d) this.Y;
        od2.a0(obj);
        this.Z.f.updateAndGet(new iz0(10, r0dVar));
        this.Z.d.m(null, (List) obj);
        return e5f.a;
    }
}
