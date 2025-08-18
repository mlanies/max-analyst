package defpackage;

import kotlin.coroutines.Continuation;
import one.me.stickerssettings.StickersSettingsScreen;

/* loaded from: classes2.dex */
public final class p6e extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ StickersSettingsScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6e(Continuation continuation, StickersSettingsScreen stickersSettingsScreen) {
        super(2, continuation);
        this.Y = stickersSettingsScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        p6e p6eVar = (p6e) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        p6eVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        p6e p6eVar = new p6e(continuation, this.Y);
        p6eVar.X = obj;
        return p6eVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wm9 wm9Var = (wm9) this.X;
        bc7[] bc7VarArr = StickersSettingsScreen.Y;
        StickersSettingsScreen stickersSettingsScreen = this.Y;
        stickersSettingsScreen.getClass();
        if (wm9Var instanceof g43) {
            stickersSettingsScreen.getRouter().C();
        } else if (wm9Var instanceof c64) {
            l6e.c.R1((c64) wm9Var);
        }
        return e5f.a;
    }
}
