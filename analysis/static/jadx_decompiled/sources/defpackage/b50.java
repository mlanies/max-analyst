package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class b50 extends ffe implements a66 {
    public final /* synthetic */ c50 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b50(c50 c50Var, Continuation continuation) {
        super(2, continuation);
        this.X = c50Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((b50) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new b50(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object value;
        Object value2;
        boolean z;
        Float f;
        Object value3;
        od2.a0(obj);
        c50 c50Var = this.X;
        bc7[] bc7VarArr = c50.h;
        long jL = ((uh9) c50Var.g()).l();
        Long l = this.X.e;
        e5f e5fVar = e5f.a;
        if (l == null || jL != l.longValue()) {
            q0e q0eVar = this.X.f;
            do {
                value = q0eVar.getValue();
                ((zl7) value).getClass();
            } while (!q0eVar.c(value, new zl7(null, false)));
            return e5fVar;
        }
        if (this.X.g().b()) {
            q0e q0eVar2 = this.X.f;
            do {
                value3 = q0eVar2.getValue();
            } while (!q0eVar2.c(value3, new zl7(null, false)));
            return e5fVar;
        }
        c50 c50Var2 = this.X;
        q0e q0eVar3 = c50Var2.f;
        do {
            value2 = q0eVar3.getValue();
            zl7 zl7Var = (zl7) value2;
            z = ((uh9) c50Var2.g()).x;
            f = zl7Var.a;
            zl7Var.getClass();
        } while (!q0eVar3.c(value2, new zl7(f, z)));
        return e5fVar;
    }
}
