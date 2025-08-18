package defpackage;

import kotlin.coroutines.Continuation;
import one.me.pinbars.PinBarsWidget;

/* loaded from: classes2.dex */
public final class k0b extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PinBarsWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0b(Continuation continuation, PinBarsWidget pinBarsWidget) {
        super(2, continuation);
        this.Y = pinBarsWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        k0b k0bVar = (k0b) n((c64) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        k0bVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        k0b k0bVar = new k0b(continuation, this.Y);
        k0bVar.X = obj;
        return k0bVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        n0b.c.R1((c64) this.X);
        return e5f.a;
    }
}
