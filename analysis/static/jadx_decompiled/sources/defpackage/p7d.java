package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.devmenu.server.ServerHostBottomSheet;

/* loaded from: classes.dex */
public final class p7d extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ServerHostBottomSheet Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7d(Continuation continuation, ServerHostBottomSheet serverHostBottomSheet) {
        super(2, continuation);
        this.Y = serverHostBottomSheet;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        p7d p7dVar = (p7d) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        p7dVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        p7d p7dVar = new p7d(continuation, this.Y);
        p7dVar.X = obj;
        return p7dVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.Y.A0.E((List) this.X);
        return e5f.a;
    }
}
