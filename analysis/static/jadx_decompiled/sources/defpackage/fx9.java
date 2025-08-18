package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fx9 extends ffe implements a66 {
    public final /* synthetic */ gx9 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx9(gx9 gx9Var, Continuation continuation) {
        super(2, continuation);
        this.X = gx9Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        fx9 fx9Var = (fx9) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        fx9Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new fx9(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        bc7[] bc7VarArr = gx9.C0;
        gx9 gx9Var = this.X;
        jp jpVar = (jp) gx9Var.q();
        jpVar.l("app.notification.dontDisturbUntil", 0L);
        jpVar.j("app.notification.show.text", true);
        jpVar.m("app.notification.ringtone", null);
        jpVar.j("app.notification.vibrate", true);
        jpVar.k(jpVar.v(), "app.notification.led.color");
        jpVar.k(0, "app.notification.dialogs.show");
        jpVar.j.e(0);
        jpVar.m("app.notification.dialogs.ringtone", null);
        jpVar.j("app.notification.dialogs.vibrate", true);
        jpVar.k(jpVar.v(), "app.notification.dialogs.led.color");
        jpVar.s(0);
        jpVar.m("app.notification.chats.ringtone", null);
        jpVar.j("app.notification.chats.vibrate", true);
        jpVar.k(jpVar.v(), "app.notification.chats.led.color");
        jpVar.m("app.group.chat.call.notification.status", "ON");
        jpVar.j("app.notification.in.app.sound", true);
        jpVar.j("app.notification.in.app.vibrate", true);
        jpVar.j("app.notification.show.new.users", true);
        jpVar.j("app.notification.show.drafts", true);
        pk pkVar = (pk) gx9Var.o.getValue();
        pkVar.getClass();
        ((k4a) pkVar).t(null, true);
        q0e q0eVar = gx9Var.x0;
        q0eVar.m(null, new Integer(((Number) q0eVar.getValue()).intValue() + 1));
        return e5f.a;
    }
}
