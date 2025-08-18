package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.pinbars.PinBarsWidget;

/* loaded from: classes2.dex */
public final class d0b extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PinBarsWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0b(Continuation continuation, PinBarsWidget pinBarsWidget) {
        super(2, continuation);
        this.Y = pinBarsWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        d0b d0bVar = (d0b) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        d0bVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        d0b d0bVar = new d0b(continuation, this.Y);
        d0bVar.X = obj;
        return d0bVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        ch6 ch6Var = (ch6) this.X;
        int i = PinBarsWidget.t0;
        PinBarsWidget pinBarsWidget = this.Y;
        pinBarsWidget.getClass();
        if (!(ch6Var instanceof ch6)) {
            throw new NoWhenBranchMatchedException();
        }
        ((rg1) pinBarsWidget.o.getValue()).j(ch6Var.a, true, false, false, new lwa(1, ch6Var));
        return e5f.a;
    }
}
