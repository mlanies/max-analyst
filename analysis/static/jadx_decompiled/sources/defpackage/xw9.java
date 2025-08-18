package defpackage;

import android.os.Build;
import kotlin.coroutines.Continuation;
import one.me.notifications.settings.NotificationsSettingsScreen;

/* loaded from: classes2.dex */
public final class xw9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ NotificationsSettingsScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw9(Continuation continuation, NotificationsSettingsScreen notificationsSettingsScreen) {
        super(2, continuation);
        this.Y = notificationsSettingsScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        xw9 xw9Var = (xw9) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        xw9Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        xw9 xw9Var = new xw9(continuation, this.Y);
        xw9Var.X = obj;
        return xw9Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        if (((Boolean) this.X).booleanValue()) {
            NotificationsSettingsScreen notificationsSettingsScreen = this.Y;
            eua euaVar = (eua) notificationsSettingsScreen.o.getValue();
            l5g l5gVar = new l5g(notificationsSettingsScreen, 1);
            if (Build.VERSION.SDK_INT >= 33) {
                euaVar.d(l5gVar, eua.k, 177, j1c.permissions_post_notification_request_rationale, j1c.permissions_post_notification_request_title, j1c.permissions_post_notification_request_positive_button);
            } else {
                euaVar.getClass();
            }
        }
        return e5f.a;
    }
}
