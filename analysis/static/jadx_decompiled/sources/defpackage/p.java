package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.aboutappsettings.AboutAppSettingsScreen;

/* loaded from: classes.dex */
public final class p extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AboutAppSettingsScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Continuation continuation, AboutAppSettingsScreen aboutAppSettingsScreen) {
        super(2, continuation);
        this.Y = aboutAppSettingsScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        p pVar = (p) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        pVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        p pVar = new p(continuation, this.Y);
        pVar.X = obj;
        return pVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.Y.b.E((List) this.X);
        return e5f.a;
    }
}
