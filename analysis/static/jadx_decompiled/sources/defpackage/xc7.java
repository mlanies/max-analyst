package defpackage;

import kotlin.coroutines.Continuation;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;

/* loaded from: classes2.dex */
public final class xc7 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ KeyboardStickersWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc7(KeyboardStickersWidget keyboardStickersWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = keyboardStickersWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        xc7 xc7Var = (xc7) n((l7e) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        xc7Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        xc7 xc7Var = new xc7(this.Y, continuation);
        xc7Var.X = obj;
        return xc7Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        l7e l7eVar = (l7e) this.X;
        KeyboardStickersWidget keyboardStickersWidget = this.Y;
        keyboardStickersWidget.Y.E(l7eVar.a);
        keyboardStickersWidget.Z.E(l7eVar.b);
        return e5f.a;
    }
}
