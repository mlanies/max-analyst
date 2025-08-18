package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class da7 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ c8d Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da7(c8d c8dVar, Continuation continuation) {
        super(2, continuation);
        this.Y = c8dVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((da7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new da7(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object next;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            Iterator it = ((List) this.Y.c).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((ia7) next).c().contains("WebAppBackButtonPressed")) {
                    break;
                }
            }
            ia7 ia7Var = (ia7) next;
            if (ia7Var != null) {
                this.X = 1;
                if (ia7Var.a("WebAppBackButtonPressed", "{}", this) == tx3Var) {
                    return tx3Var;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5f.a;
    }
}
