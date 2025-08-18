package defpackage;

import android.app.Activity;
import kotlin.coroutines.Continuation;
import one.me.android.MainActivity;
import one.me.android.root.RootController;
import one.me.appupdate.forceupdate.ForceUpdateScreen;

/* loaded from: classes.dex */
public final class m6a extends ffe implements a66 {
    public final /* synthetic */ n6a X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6a(n6a n6aVar, Continuation continuation) {
        super(2, continuation);
        this.X = n6aVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((m6a) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new m6a(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        Activity activityD = ((haa) this.X.f.getValue()).f().C().d();
        MainActivity mainActivity = activityD instanceof MainActivity ? (MainActivity) activityD : null;
        e5f e5fVar = e5f.a;
        if (mainActivity == null) {
            return e5fVar;
        }
        RootController rootControllerS = a14.s(mainActivity);
        coc cocVar = (coc) x53.q0(rootControllerS.C().e());
        if ((cocVar != null ? cocVar.a : null) instanceof ForceUpdateScreen) {
            return e5fVar;
        }
        ao6 ao6Var = rootControllerS.C().e().isEmpty() ^ true ? new ao6(0) : null;
        rootControllerS.C().R(i24.e(new ForceUpdateScreen(), ao6Var, ao6Var));
        return e5fVar;
    }
}
