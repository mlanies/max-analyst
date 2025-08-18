package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.logout.a;

/* loaded from: classes2.dex */
public final class oa9 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ a Y;
    public final /* synthetic */ wa9 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa9(a aVar, wa9 wa9Var, Continuation continuation) {
        super(2, continuation);
        this.Y = aVar;
        this.Z = wa9Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((oa9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new oa9(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            if (this.Y.a(this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        wa9 wa9Var = this.Z;
        ((zc0) wa9Var.g.getValue()).b.clear();
        j1e.i(wa9Var.f, null);
        return e5f.a;
    }
}
