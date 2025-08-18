package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;

/* loaded from: classes2.dex */
public final class hm2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatNotificationsSettingsScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm2(Continuation continuation, ChatNotificationsSettingsScreen chatNotificationsSettingsScreen) {
        super(2, continuation);
        this.Y = chatNotificationsSettingsScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        hm2 hm2Var = (hm2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        hm2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        hm2 hm2Var = new hm2(continuation, this.Y);
        hm2Var.X = obj;
        return hm2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.Y.c.E((List) this.X);
        return e5f.a;
    }
}
