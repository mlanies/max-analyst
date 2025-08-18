package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class sp9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ wp9 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp9(wp9 wp9Var, Continuation continuation) {
        super(2, continuation);
        this.Y = wp9Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((sp9) n((e8b) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        sp9 sp9Var = new sp9(this.Y, continuation);
        sp9Var.X = obj;
        return sp9Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        e8b e8bVar = (e8b) this.X;
        e5f e5fVar = e5f.a;
        if (e8bVar == null) {
            return e5fVar;
        }
        qo9 qo9Var = e8bVar.c;
        this.Y.y0.setValue(e8bVar.a);
        this.Y.X.setValue(e8bVar.b);
        if (qo9Var == null) {
            return e5fVar;
        }
        this.Y.o = qo9Var;
        this.Y.c.d(qo9Var);
        return e5fVar;
    }
}
