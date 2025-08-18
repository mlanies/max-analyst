package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public final class eo3 extends ffe implements a66 {
    public final /* synthetic */ oo3 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo3(oo3 oo3Var, Continuation continuation) {
        super(2, continuation);
        this.X = oo3Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        eo3 eo3Var = (eo3) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        eo3Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new eo3(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        q0e q0eVar;
        Object value;
        od2.a0(obj);
        oo3 oo3Var = this.X;
        qyc qycVar = (qyc) ((y7d) oo3Var.x0.getValue());
        qycVar.getClass();
        int i = qycVar.n(PmsKey.f2accountnicknameenabled, false) ? a9a.k : a9a.j;
        do {
            q0eVar = oo3Var.E0;
            value = q0eVar.getValue();
        } while (!q0eVar.c(value, new eqe(i)));
        return e5f.a;
    }
}
