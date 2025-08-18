package defpackage;

import kotlin.coroutines.Continuation;
import one.me.pinbars.PinBarsWidget;

/* loaded from: classes2.dex */
public final class i0b extends ffe implements a66 {
    public /* synthetic */ float X;
    public final /* synthetic */ PinBarsWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0b(Continuation continuation, PinBarsWidget pinBarsWidget) {
        super(2, continuation);
        this.Y = pinBarsWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((i0b) n(Float.valueOf(((Number) obj).floatValue()), (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        i0b i0bVar = new i0b(continuation, this.Y);
        i0bVar.X = ((Number) obj).floatValue();
        return i0bVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        float f = this.X;
        eb9 eb9Var = this.Y.X;
        e5f e5fVar = e5f.a;
        if (eb9Var == null) {
            return e5fVar;
        }
        eb9Var.setProgress(f);
        return e5fVar;
    }
}
