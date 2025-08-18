package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.settings.SettingsListScreen;

/* loaded from: classes2.dex */
public final class fgd extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ SettingsListScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgd(SettingsListScreen settingsListScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = settingsListScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        fgd fgdVar = (fgd) n((List) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        fgdVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        fgd fgdVar = new fgd(this.Y, continuation);
        fgdVar.X = obj;
        return fgdVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.Y.z0.E((List) this.X);
        return e5f.a;
    }
}
