package defpackage;

import android.content.Context;
import android.content.Intent;
import kotlin.coroutines.Continuation;
import one.me.notifications.settings.NotificationsSettingsScreen;

/* loaded from: classes2.dex */
public final class ax9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ NotificationsSettingsScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax9(Continuation continuation, NotificationsSettingsScreen notificationsSettingsScreen) {
        super(2, continuation);
        this.Y = notificationsSettingsScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ax9 ax9Var = (ax9) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ax9Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ax9 ax9Var = new ax9(continuation, this.Y);
        ax9Var.X = obj;
        return ax9Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object njcVar;
        od2.a0(obj);
        wm9 wm9Var = (wm9) this.X;
        boolean z = wm9Var instanceof c64;
        e5f e5fVar = e5f.a;
        if (z) {
            sv9.c.R1((c64) wm9Var);
        } else if (wm9Var instanceof uw9) {
            String str = o37.a;
            Context context = this.Y.getContext();
            try {
                Intent intent = new Intent();
                intent.setFlags(268435456);
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
                context.startActivity(intent);
                njcVar = e5fVar;
            } catch (Throwable th) {
                njcVar = new njc(th);
            }
            Throwable thA = pjc.a(njcVar);
            if (thA != null) {
                hm9.p(o37.a, "openNotificationsSettings: failed", thA);
            }
        }
        return e5fVar;
    }
}
