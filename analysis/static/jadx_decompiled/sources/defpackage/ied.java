package defpackage;

import java.util.Map;
import kotlin.coroutines.Continuation;
import one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen;

/* loaded from: classes2.dex */
public final class ied extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ SettingsBlacklistScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ied(Continuation continuation, SettingsBlacklistScreen settingsBlacklistScreen) {
        super(2, continuation);
        this.Y = settingsBlacklistScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ied iedVar = (ied) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        iedVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ied iedVar = new ied(continuation, this.Y);
        iedVar.X = obj;
        return iedVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        Map map = (Map) this.X;
        bc7[] bc7VarArr = SettingsBlacklistScreen.Z;
        SettingsBlacklistScreen settingsBlacklistScreen = this.Y;
        settingsBlacklistScreen.getClass();
        ((aba) settingsBlacklistScreen.X.T0(settingsBlacklistScreen, SettingsBlacklistScreen.Z[1])).setVisibility(map.values().isEmpty() ? 0 : 8);
        settingsBlacklistScreen.Y.E(x53.D0(map.values()));
        return e5f.a;
    }
}
