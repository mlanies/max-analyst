package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.stickerssettings.StickersSettingsScreen;

/* loaded from: classes2.dex */
public final class n6e extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ StickersSettingsScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6e(Continuation continuation, StickersSettingsScreen stickersSettingsScreen) {
        super(2, continuation);
        this.Y = stickersSettingsScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        n6e n6eVar = (n6e) n((List) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        n6eVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        n6e n6eVar = new n6e(continuation, this.Y);
        n6eVar.X = obj;
        return n6eVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.Y.X.E((List) this.X);
        return e5f.a;
    }
}
