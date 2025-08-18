package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class p91 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ s91 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p91(s91 s91Var, Continuation continuation) {
        super(2, continuation);
        this.Y = s91Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        p91 p91Var = (p91) n((Long) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        p91Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        p91 p91Var = new p91(this.Y, continuation);
        p91Var.X = obj;
        return p91Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object value;
        String strI;
        od2.a0(obj);
        Long l = (Long) this.X;
        s91 s91Var = this.Y;
        q0e q0eVar = s91Var.Z;
        do {
            value = q0eVar.getValue();
            if (l != null) {
                s91Var.o.getClass();
                strI = wg0.i("· ", bn1.e(l));
            } else {
                strI = null;
            }
            if (strI == null) {
                strI = "";
            }
        } while (!q0eVar.c(value, strI));
        return e5f.a;
    }
}
