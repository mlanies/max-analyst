package defpackage;

import java.util.Collection;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class l39 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ n59 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l39(n59 n59Var, Continuation continuation) {
        super(2, continuation);
        this.Z = n59Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((l39) n((yu8) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        l39 l39Var = new l39(this.Z, continuation);
        l39Var.Y = obj;
        return l39Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            yu8 yu8Var = (yu8) this.Y;
            String str = this.Z.A0;
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.X, str, "Got MessageEvent=" + yu8Var, null);
            }
            if (yu8Var instanceof su8) {
                n59 n59Var = this.Z;
                su8 su8Var = (su8) yu8Var;
                this.X = 1;
                n59Var.getClass();
                if (su8Var.b) {
                    String str2 = n59Var.A0;
                    ir6 ir6Var2 = hm9.m;
                    if (ir6Var2 != null && ir6Var2.c()) {
                        ir6Var2.d(us7.X, str2, zr6.h(su8Var.a.size(), "handleMessageAddEvent: delayed scroll for outgoing message, addedSize:"), null);
                    }
                    l89 l89VarB = n59Var.B();
                    Collection collection = su8Var.a;
                    l89VarB.getClass();
                    if (!collection.isEmpty()) {
                        l89VarB.l.updateAndGet(new v79(((Number) x53.o0(collection)).longValue(), 1));
                    }
                }
                if (e5fVar == tx3Var) {
                    return tx3Var;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5fVar;
    }
}
