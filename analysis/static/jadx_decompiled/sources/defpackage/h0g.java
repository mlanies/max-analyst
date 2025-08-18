package defpackage;

import kotlin.coroutines.Continuation;
import one.me.webapp.settings.WebAppSettingsScreen;

/* loaded from: classes2.dex */
public final class h0g extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ WebAppSettingsScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0g(Continuation continuation, WebAppSettingsScreen webAppSettingsScreen) {
        super(2, continuation);
        this.Y = webAppSettingsScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        h0g h0gVar = (h0g) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        h0gVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        h0g h0gVar = new h0g(continuation, this.Y);
        h0gVar.X = obj;
        return h0gVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wm9 wm9Var = (wm9) this.X;
        bc7[] bc7VarArr = WebAppSettingsScreen.s0;
        WebAppSettingsScreen webAppSettingsScreen = this.Y;
        webAppSettingsScreen.getClass();
        if (wm9Var instanceof g43) {
            webAppSettingsScreen.getRouter().C();
        } else if (wm9Var instanceof c64) {
            zxf.c.R1((c64) wm9Var);
        } else if (wm9Var instanceof k0g) {
            webAppSettingsScreen.getRouter().C();
            zxf.c.R1(((k0g) wm9Var).b);
        }
        return e5f.a;
    }
}
