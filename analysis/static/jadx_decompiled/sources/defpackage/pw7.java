package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;
import one.me.android.MainActivity;

/* loaded from: classes.dex */
public final class pw7 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MainActivity Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw7(MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.Y = mainActivity;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((pw7) n((Uri) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        pw7 pw7Var = new pw7(this.Y, continuation);
        pw7Var.X = obj;
        return pw7Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        Uri uri = (Uri) this.X;
        String name = this.Y.getClass().getName();
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, name, "handle mytracker link " + uri, null);
        }
        return ((vj7) ((wj7) y8a.a.getAccessor().c(wj7.class)).b.getValue()).e(uri);
    }
}
