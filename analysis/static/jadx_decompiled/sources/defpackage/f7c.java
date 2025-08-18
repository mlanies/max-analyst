package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.onechat.reactions.ReactionsViewModel;

/* loaded from: classes2.dex */
public final class f7c extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ReactionsViewModel Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7c(ReactionsViewModel reactionsViewModel, Continuation continuation) {
        super(2, continuation);
        this.Z = reactionsViewModel;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((f7c) n((g7c) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        f7c f7cVar = new f7c(this.Z, continuation);
        f7cVar.Y = obj;
        return f7cVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            g7c g7cVar = (g7c) this.Y;
            this.X = 1;
            if (ReactionsViewModel.e(this.Z, g7cVar, this) == tx3Var) {
                return tx3Var;
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
