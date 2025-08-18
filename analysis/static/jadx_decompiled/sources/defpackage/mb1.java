package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class mb1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ vb1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb1(vb1 vb1Var, Continuation continuation) {
        super(2, continuation);
        this.Y = vb1Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        mb1 mb1Var = (mb1) n((t51) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        mb1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        mb1 mb1Var = new mb1(this.Y, continuation);
        mb1Var.X = obj;
        return mb1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object value;
        nb1 nb1Var;
        String str;
        od2.a0(obj);
        t51 t51Var = (t51) this.X;
        if (t51Var instanceof l51) {
            long j = ((l51) t51Var).a;
            Long l = this.Y.z0;
            if (l != null && j == l.longValue()) {
                this.Y.z0 = null;
            }
        } else if (t51Var instanceof m51) {
            m51 m51Var = (m51) t51Var;
            long j2 = m51Var.a.a;
            Long l2 = this.Y.z0;
            if (l2 != null && j2 == l2.longValue()) {
                this.Y.z0 = null;
                vb1 vb1Var = this.Y;
                q0e q0eVar = vb1Var.w0;
                do {
                    value = q0eVar.getValue();
                    nb1Var = (nb1) value;
                    hi7 hi7Var = m51Var.a;
                    dh6 dh6Var = hi7Var.X;
                    if (dh6Var == null || (str = dh6Var.X) == null) {
                        def defVar = hi7Var.Y;
                        str = defVar != null ? defVar.o : null;
                    }
                    def defVar2 = hi7Var.Y;
                    vb1Var.y0.o1(vb1Var, vb1.B0[0], j47.S(vb1Var.a, ((w9a) ((kke) vb1Var.u0.getValue())).b(), vx3.b, new tb1(defVar2.t0, defVar2.X, vb1Var, null)));
                } while (!q0eVar.c(value, nb1.a(nb1Var, null, null, null, false, str != null ? new iqe(str) : new eqe(b8a.c0), null, null, 111)));
            }
        }
        return e5f.a;
    }
}
