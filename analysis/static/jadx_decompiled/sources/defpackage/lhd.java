package defpackage;

import kotlin.coroutines.Continuation;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;

/* loaded from: classes2.dex */
public final class lhd extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ SettingsPrivacyScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lhd(Continuation continuation, SettingsPrivacyScreen settingsPrivacyScreen) {
        super(2, continuation);
        this.Y = settingsPrivacyScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        lhd lhdVar = (lhd) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        lhdVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        lhd lhdVar = new lhd(continuation, this.Y);
        lhdVar.X = obj;
        return lhdVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        String str = (String) this.X;
        wha whaVar = new wha(this.Y);
        whaVar.h(str);
        whaVar.i();
        return e5f.a;
    }
}
