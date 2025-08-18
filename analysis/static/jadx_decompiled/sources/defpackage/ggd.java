package defpackage;

import kotlin.coroutines.Continuation;
import one.me.settings.SettingsListScreen;

/* loaded from: classes2.dex */
public final class ggd extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ SettingsListScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggd(SettingsListScreen settingsListScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = settingsListScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ggd) n((o35) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ggd ggdVar = new ggd(this.Y, continuation);
        ggdVar.X = obj;
        return ggdVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        o35 o35Var = (o35) this.X;
        bgd bgdVar = o35Var instanceof bgd ? (bgd) o35Var : null;
        boolean z = bgdVar instanceof zfd;
        e5f e5fVar = e5f.a;
        SettingsListScreen settingsListScreen = this.Y;
        if (z) {
            zfd zfdVar = (zfd) bgdVar;
            tpa.o(settingsListScreen.getContext(), zfdVar.a);
            CharSequence charSequenceB = zfdVar.b.b(settingsListScreen.getContext());
            if (charSequenceB != null && tpa.s()) {
                wha whaVar = (wha) settingsListScreen.u0.getValue();
                whaVar.e(new kia(woc.r));
                whaVar.h(charSequenceB);
                whaVar.i();
            }
        } else if (bgdVar instanceof agd) {
            ((cn3) settingsListScreen.Y.getValue()).a(settingsListScreen.getContext(), ((agd) bgdVar).a);
        }
        return e5fVar;
    }
}
