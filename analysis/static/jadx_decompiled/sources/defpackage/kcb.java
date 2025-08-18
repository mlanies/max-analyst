package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;

/* loaded from: classes2.dex */
public final class kcb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileChangeLinkScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kcb(Continuation continuation, ProfileChangeLinkScreen profileChangeLinkScreen) {
        super(2, continuation);
        this.Y = profileChangeLinkScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        kcb kcbVar = (kcb) n((List) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        kcbVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        kcb kcbVar = new kcb(continuation, this.Y);
        kcbVar.X = obj;
        return kcbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.Y.Y.E((List) this.X);
        return e5f.a;
    }
}
