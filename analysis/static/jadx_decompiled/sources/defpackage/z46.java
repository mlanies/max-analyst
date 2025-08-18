package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.messages.settings.FrgMessagesSettings;

/* loaded from: classes2.dex */
public final class z46 extends ffe implements a66 {
    public final /* synthetic */ FrgMessagesSettings X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z46(FrgMessagesSettings frgMessagesSettings, Continuation continuation) {
        super(2, continuation);
        this.X = frgMessagesSettings;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        z46 z46Var = (z46) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        z46Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new z46(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        FrgMessagesSettings frgMessagesSettings = this.X;
        ((t6b) frgMessagesSettings.q1.getAccessor().c(t6b.class)).d();
        frgMessagesSettings.q1.f().O();
        return e5f.a;
    }
}
