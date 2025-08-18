package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import ru.ok.onechat.reactions.ReactionsViewModel;

/* loaded from: classes2.dex */
public final class i7c extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ReactionsViewModel Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7c(ReactionsViewModel reactionsViewModel, Continuation continuation) {
        super(2, continuation);
        this.Y = reactionsViewModel;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((i7c) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new i7c(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        try {
            if (i == 0) {
                od2.a0(obj);
                jr2 jr2Var = (jr2) this.Y.t.getValue();
                this.X = 1;
                jr2Var.getClass();
                Object objT0 = j47.t0(jr2Var.l, new gr2(jr2Var, null), this);
                if (objT0 != tx3Var) {
                    objT0 = e5fVar;
                }
                if (objT0 == tx3Var) {
                    return tx3Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
            }
        } catch (Throwable th) {
            if (!(th instanceof CancellationException)) {
                hm9.p("ru.ok.onechat.reactions.ReactionsViewModel", "runChatSubscribeNotifObserving: fail to run()", th);
            }
        }
        return e5fVar;
    }
}
