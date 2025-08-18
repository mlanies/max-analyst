package defpackage;

import java.util.HashSet;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.workmanager.BacklogWorker;

/* loaded from: classes2.dex */
public final class jf0 extends ffe implements a66 {
    public final /* synthetic */ BacklogWorker X;
    public final /* synthetic */ HashSet Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf0(BacklogWorker backlogWorker, HashSet hashSet, Continuation continuation) {
        super(2, continuation);
        this.X = backlogWorker;
        this.Y = hashSet;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        jf0 jf0Var = (jf0) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        jf0Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new jf0(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.X.e().g().delete(x53.D0(this.Y));
        return e5f.a;
    }
}
