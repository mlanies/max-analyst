package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.onechat.reactions.ReactionsViewModel;

/* loaded from: classes2.dex */
public final class h7c extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ReactionsViewModel Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7c(ReactionsViewModel reactionsViewModel, Continuation continuation) {
        super(2, continuation);
        this.Y = reactionsViewModel;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((h7c) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new h7c(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        e5f e5fVar = e5f.a;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            jr2 jr2Var = (jr2) this.Y.t.getValue();
            this.X = 1;
            jr2Var.j = true;
            try {
                x77 x77Var = jr2Var.f;
                if (x77Var != null) {
                    x77Var.cancel(null);
                }
            } catch (Throwable th) {
                hm9.p("jr2", "cancel fail!", th);
            }
            jr2Var.e(this);
            if (e5fVar == tx3Var) {
                return tx3Var;
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
