package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.logout.a;

/* loaded from: classes.dex */
public final class ku2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ pu2 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku2(pu2 pu2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = pu2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ku2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ku2(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        pu2 pu2Var = this.Y;
        if (i == 0) {
            od2.a0(obj);
            a aVar = pu2Var.Y;
            this.X = 1;
            if (aVar.a(this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        hm9.n(pu2Var.z0, "handle logout");
        j1e.i(pu2Var.A0, null);
        return e5f.a;
    }
}
