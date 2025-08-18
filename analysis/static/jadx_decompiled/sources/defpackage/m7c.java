package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.onechat.reactions.ReactionsViewModel;

/* loaded from: classes2.dex */
public final class m7c extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ n7c Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7c(n7c n7cVar, Continuation continuation) {
        super(2, continuation);
        this.Y = n7cVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        m7c m7cVar = (m7c) n((e52) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        m7cVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        m7c m7cVar = new m7c(this.Y, continuation);
        m7cVar.X = obj;
        return m7cVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        e52 e52Var = (e52) this.X;
        ReactionsViewModel reactionsViewModelQ = this.Y.q();
        long j = e52Var.b.l0;
        csc cscVar = reactionsViewModelQ.g;
        if (cscVar != null) {
            cscVar.b(Long.valueOf(j), "lastReactedMessageId");
        }
        return e5f.a;
    }
}
