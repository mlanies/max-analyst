package defpackage;

import kotlin.coroutines.Continuation;
import one.me.webapp.settings.WebAppsSettingScreen;

/* loaded from: classes2.dex */
public final class c3g extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ WebAppsSettingScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3g(Continuation continuation, WebAppsSettingScreen webAppsSettingScreen) {
        super(2, continuation);
        this.Y = webAppsSettingScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        c3g c3gVar = (c3g) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        c3gVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        c3g c3gVar = new c3g(continuation, this.Y);
        c3gVar.X = obj;
        return c3gVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wm9 wm9Var = (wm9) this.X;
        bc7[] bc7VarArr = WebAppsSettingScreen.X;
        WebAppsSettingScreen webAppsSettingScreen = this.Y;
        webAppsSettingScreen.getClass();
        if (wm9Var instanceof g43) {
            webAppsSettingScreen.getRouter().C();
        } else if (wm9Var instanceof c64) {
            zxf.c.R1((c64) wm9Var);
        }
        return e5f.a;
    }
}
