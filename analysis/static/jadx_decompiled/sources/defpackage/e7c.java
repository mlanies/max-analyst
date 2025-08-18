package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.onechat.reactions.ReactionsViewModel;

/* loaded from: classes2.dex */
public final class e7c extends ffe implements a66 {
    public final /* synthetic */ ReactionsViewModel X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7c(ReactionsViewModel reactionsViewModel, Continuation continuation) {
        super(2, continuation);
        this.X = reactionsViewModel;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        e7c e7cVar = (e7c) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        e7cVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new e7c(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        ReactionsViewModel reactionsViewModel = this.X;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "ru.ok.onechat.reactions.ReactionsViewModel", zr6.i("defaultReactions = [", x53.n0(x53.y0((List) reactionsViewModel.q.getValue(), 8), null, null, null, null, 63), "]"), null);
        }
        e52 e52VarI = this.X.i();
        if (e52VarI != null) {
            ReactionsViewModel reactionsViewModel2 = this.X;
            long j = e52VarI.b.l0;
            csc cscVar = reactionsViewModel2.g;
            if (cscVar != null) {
                cscVar.b(Long.valueOf(j), "lastReactedMessageId");
            }
        }
        return e5f.a;
    }
}
