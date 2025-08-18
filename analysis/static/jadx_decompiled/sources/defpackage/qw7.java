package defpackage;

import android.content.Intent;
import kotlin.coroutines.Continuation;
import one.me.android.MainActivity;
import one.me.android.deeplink.LinkInterceptorActivity;

/* loaded from: classes.dex */
public final class qw7 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MainActivity Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw7(MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.Y = mainActivity;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        qw7 qw7Var = (qw7) n((ej7) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        qw7Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        qw7 qw7Var = new qw7(this.Y, continuation);
        qw7Var.X = obj;
        return qw7Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        ej7 ej7Var = (ej7) this.X;
        int i = LinkInterceptorActivity.K0;
        MainActivity mainActivity = this.Y;
        Intent intent = new Intent(mainActivity, (Class<?>) LinkInterceptorActivity.class);
        intent.putExtra("link:result", ej7Var);
        mainActivity.startActivity(intent);
        x77 x77Var = mainActivity.Z0;
        if (x77Var != null) {
            x77Var.cancel(null);
        }
        mainActivity.Z0 = null;
        return e5f.a;
    }
}
