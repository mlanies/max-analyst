package defpackage;

import kotlin.coroutines.Continuation;
import one.me.settings.SettingsListScreen;

/* loaded from: classes2.dex */
public final class egd extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ SettingsListScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egd(SettingsListScreen settingsListScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = settingsListScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        egd egdVar = (egd) n((did) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        egdVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        egd egdVar = new egd(this.Y, continuation);
        egdVar.X = obj;
        return egdVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        did didVar = (did) this.X;
        bc7[] bc7VarArr = SettingsListScreen.B0;
        SettingsListScreen settingsListScreen = this.Y;
        settingsListScreen.p0().setTopBarContent(didVar);
        ((cla) settingsListScreen.t0.T0(settingsListScreen, SettingsListScreen.B0[1])).setTitle(didVar.c);
        return e5f.a;
    }
}
