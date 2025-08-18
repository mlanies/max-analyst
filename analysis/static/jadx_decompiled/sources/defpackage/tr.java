package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.appearancesettings.singletheme.AppearanceSettingsScreen;

/* loaded from: classes.dex */
public final class tr extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AppearanceSettingsScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr(AppearanceSettingsScreen appearanceSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = appearanceSettingsScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        tr trVar = (tr) n((List) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        trVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        tr trVar = new tr(this.Y, continuation);
        trVar.X = obj;
        return trVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        List<c62> list = (List) this.X;
        bc7[] bc7VarArr = AppearanceSettingsScreen.Z;
        AppearanceSettingsScreen appearanceSettingsScreen = this.Y;
        appearanceSettingsScreen.getClass();
        ((y52) appearanceSettingsScreen.c.T0(appearanceSettingsScreen, AppearanceSettingsScreen.Z[0])).setThemeItems(list);
        return e5f.a;
    }
}
