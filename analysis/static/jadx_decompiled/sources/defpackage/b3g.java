package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.webapp.settings.WebAppsSettingScreen;

/* loaded from: classes2.dex */
public final class b3g extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ WebAppsSettingScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3g(Continuation continuation, WebAppsSettingScreen webAppsSettingScreen) {
        super(2, continuation);
        this.Y = webAppsSettingScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        b3g b3gVar = (b3g) n((List) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        b3gVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        b3g b3gVar = new b3g(continuation, this.Y);
        b3gVar.X = obj;
        return b3gVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.Y.o.E((List) this.X);
        return e5f.a;
    }
}
