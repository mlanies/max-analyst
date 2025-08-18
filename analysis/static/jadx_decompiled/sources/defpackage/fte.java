package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.devmenu.threadsviewer.ThreadsStateViewerScreen;

/* loaded from: classes.dex */
public final class fte extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ThreadsStateViewerScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fte(Continuation continuation, ThreadsStateViewerScreen threadsStateViewerScreen) {
        super(2, continuation);
        this.Y = threadsStateViewerScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        fte fteVar = (fte) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        fteVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        fte fteVar = new fte(continuation, this.Y);
        fteVar.X = obj;
        return fteVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.Y.o.E((List) this.X);
        return e5f.a;
    }
}
