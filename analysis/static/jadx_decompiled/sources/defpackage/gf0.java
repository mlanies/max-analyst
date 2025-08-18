package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.workmanager.BacklogWorker;

/* loaded from: classes2.dex */
public final class gf0 extends ffe implements a66 {
    public final /* synthetic */ BacklogWorker X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf0(BacklogWorker backlogWorker, Continuation continuation) {
        super(2, continuation);
        this.X = backlogWorker;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((gf0) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new gf0(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        return new Integer(this.X.e().g().count(0));
    }
}
