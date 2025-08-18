package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rl3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ jm3 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl3(jm3 jm3Var, Continuation continuation) {
        super(2, continuation);
        this.Y = jm3Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        rl3 rl3Var = (rl3) n((xu4) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        rl3Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        rl3 rl3Var = new rl3(this.Y, continuation);
        rl3Var.X = obj;
        return rl3Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object value;
        xu4 xu4Var;
        q0e q0eVar;
        Object value2;
        q0e q0eVar2;
        Object value3;
        od2.a0(obj);
        xu4 xu4Var2 = (xu4) this.X;
        jm3 jm3Var = this.Y;
        q0e q0eVar3 = jm3Var.j;
        do {
            value = q0eVar3.getValue();
            xu4Var = (xu4) value;
        } while (!q0eVar3.c(value, xu4Var != null ? xu4.c(xu4Var, null, null, null, null, null, xu4Var2.i, null, false, null, 7935) : null));
        boolean z = jm3Var.B.get();
        String str = xu4Var2.a;
        xu4 xu4Var3 = (xu4) jm3Var.i.getValue();
        meb mebVar = new meb(str, xu4Var2.b, xu4Var2.c, xu4Var2.d, xu4Var3 != null && xu4Var3.a((jv4) jm3Var.j.getValue()), z, z ? 2 : 1);
        List listA = jm3Var.f().a(jm3Var);
        do {
            q0eVar = jm3Var.b;
            value2 = q0eVar.getValue();
        } while (!q0eVar.c(value2, mebVar));
        do {
            q0eVar2 = jm3Var.c;
            value3 = q0eVar2.getValue();
        } while (!q0eVar2.c(value3, listA));
        return e5f.a;
    }
}
