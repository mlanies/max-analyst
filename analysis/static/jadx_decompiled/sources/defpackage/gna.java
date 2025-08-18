package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;

/* loaded from: classes2.dex */
public final class gna extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ OtherNotificationsSettingsScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gna(Continuation continuation, OtherNotificationsSettingsScreen otherNotificationsSettingsScreen) {
        super(2, continuation);
        this.Y = otherNotificationsSettingsScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        gna gnaVar = (gna) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        gnaVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        gna gnaVar = new gna(continuation, this.Y);
        gnaVar.X = obj;
        return gnaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.Y.c.E((List) this.X);
        return e5f.a;
    }
}
