package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class qr extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ y52 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr(y52 y52Var, Continuation continuation) {
        super(2, continuation);
        this.Y = y52Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        qr qrVar = (qr) n((pm2) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        qrVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        qr qrVar = new qr(this.Y, continuation);
        qrVar.X = obj;
        return qrVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.Y.a((pm2) this.X);
        return e5f.a;
    }
}
