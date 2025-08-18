package defpackage;

import kotlin.coroutines.Continuation;
import one.me.webapp.settings.WebAppSettingsScreen;

/* loaded from: classes2.dex */
public final class f0g extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ WebAppSettingsScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0g(Continuation continuation, WebAppSettingsScreen webAppSettingsScreen) {
        super(2, continuation);
        this.Y = webAppSettingsScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        f0g f0gVar = (f0g) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        f0gVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        f0g f0gVar = new f0g(continuation, this.Y);
        f0gVar.X = obj;
        return f0gVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        l0g l0gVar = (l0g) this.X;
        WebAppSettingsScreen webAppSettingsScreen = this.Y;
        webAppSettingsScreen.Z.E(l0gVar.b);
        webAppSettingsScreen.getClass();
        ((cla) webAppSettingsScreen.X.T0(webAppSettingsScreen, WebAppSettingsScreen.s0[2])).setTitle(l0gVar.a);
        return e5f.a;
    }
}
