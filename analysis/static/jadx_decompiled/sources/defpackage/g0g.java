package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.webapp.settings.WebAppSettingsScreen;

/* loaded from: classes2.dex */
public final class g0g extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ WebAppSettingsScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0g(Continuation continuation, WebAppSettingsScreen webAppSettingsScreen) {
        super(2, continuation);
        this.Y = webAppSettingsScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        g0g g0gVar = (g0g) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        g0gVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        g0g g0gVar = new g0g(continuation, this.Y);
        g0gVar.X = obj;
        return g0gVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        j0g j0gVar = (j0g) this.X;
        bc7[] bc7VarArr = WebAppSettingsScreen.s0;
        WebAppSettingsScreen webAppSettingsScreen = this.Y;
        webAppSettingsScreen.getClass();
        if (!(j0gVar instanceof j0g)) {
            throw new NoWhenBranchMatchedException();
        }
        bwf bwfVar = webAppSettingsScreen.Y;
        if (bwfVar != null) {
            bwfVar.e(j0gVar.b, j0gVar.a, null);
        }
        return e5f.a;
    }
}
