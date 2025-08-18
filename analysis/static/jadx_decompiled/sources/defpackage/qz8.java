package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qz8 extends ffe implements a66 {
    public final /* synthetic */ xz8 X;
    public final /* synthetic */ CharSequence Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz8(xz8 xz8Var, CharSequence charSequence, Continuation continuation) {
        super(2, continuation);
        this.X = xz8Var;
        this.Y = charSequence;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        qz8 qz8Var = (qz8) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        qz8Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new qz8(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        xz8 xz8Var = this.X;
        e52 e52Var = (e52) xz8Var.b.getValue();
        Long l = e52Var != null ? new Long(e52Var.b.a) : null;
        CharSequence charSequence = this.Y;
        if (charSequence != null && charSequence.length() != 0 && l != null) {
            sna snaVar = (sna) xz8Var.x0.getValue();
            long jLongValue = l.longValue();
            if (jLongValue == 0) {
                snaVar.getClass();
            } else {
                snaVar.f(jLongValue, null, 0L);
            }
        }
        return e5f.a;
    }
}
