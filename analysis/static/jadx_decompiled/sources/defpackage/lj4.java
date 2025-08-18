package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;

/* loaded from: classes2.dex */
public final class lj4 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ DialogNotificationsSettingsScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj4(Continuation continuation, DialogNotificationsSettingsScreen dialogNotificationsSettingsScreen) {
        super(2, continuation);
        this.Y = dialogNotificationsSettingsScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        lj4 lj4Var = (lj4) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        lj4Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        lj4 lj4Var = new lj4(continuation, this.Y);
        lj4Var.X = obj;
        return lj4Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.Y.c.E((List) this.X);
        return e5f.a;
    }
}
