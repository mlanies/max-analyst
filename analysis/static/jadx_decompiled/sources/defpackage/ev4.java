package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ev4 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ gv4 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev4(gv4 gv4Var, Continuation continuation) {
        super(2, continuation);
        this.Y = gv4Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ev4 ev4Var = (ev4) n((jv4) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ev4Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ev4 ev4Var = new ev4(this.Y, continuation);
        ev4Var.X = obj;
        return ev4Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        q0e q0eVar;
        Object value;
        meb mebVar;
        q0e q0eVar2;
        Object value2;
        od2.a0(obj);
        jv4 jv4Var = (jv4) this.X;
        gv4 gv4Var = this.Y;
        jv4 jv4Var2 = (jv4) gv4Var.i.getValue();
        boolean z = false;
        boolean z2 = jv4Var2 != null && jv4Var2.a(jv4Var);
        jv4 jv4Var3 = gv4Var.k;
        if (jv4Var3 != null && jv4Var3.b(jv4Var)) {
            z = true;
        }
        gv4Var.k = jv4Var;
        do {
            q0eVar = gv4Var.b;
            value = q0eVar.getValue();
            mebVar = (meb) q0eVar.getValue();
        } while (!q0eVar.c(value, mebVar != null ? meb.a(mebVar, null, z2, 111) : null));
        if (z) {
            do {
                q0eVar2 = gv4Var.c;
                value2 = q0eVar2.getValue();
            } while (!q0eVar2.c(value2, gv4Var.f().a(gv4Var)));
        }
        return e5f.a;
    }
}
