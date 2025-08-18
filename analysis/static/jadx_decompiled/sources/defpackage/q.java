package defpackage;

import kotlin.coroutines.Continuation;
import one.me.aboutappsettings.AboutAppSettingsScreen;

/* loaded from: classes.dex */
public final class q extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AboutAppSettingsScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Continuation continuation, AboutAppSettingsScreen aboutAppSettingsScreen) {
        super(2, continuation);
        this.Y = aboutAppSettingsScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        q qVar = (q) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        qVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        q qVar = new q(continuation, this.Y);
        qVar.X = obj;
        return qVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wm9 wm9Var = (wm9) this.X;
        boolean zF = tpa.f(wm9Var, g43.b);
        AboutAppSettingsScreen aboutAppSettingsScreen = this.Y;
        if (zF) {
            aboutAppSettingsScreen.getRouter().C();
        } else if (wm9Var instanceof u) {
            tpa.o(aboutAppSettingsScreen.getContext(), ((u) wm9Var).b);
        }
        return e5f.a;
    }
}
