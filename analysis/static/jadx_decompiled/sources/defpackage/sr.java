package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.appearancesettings.singletheme.AppearanceSettingsScreen;

/* loaded from: classes.dex */
public final class sr extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AppearanceSettingsScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr(AppearanceSettingsScreen appearanceSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = appearanceSettingsScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        sr srVar = (sr) n((List) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        srVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        sr srVar = new sr(this.Y, continuation);
        srVar.X = obj;
        return srVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.Y.X.E((List) this.X);
        return e5f.a;
    }
}
