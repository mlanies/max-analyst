package androidx.work;

import android.content.Context;
import defpackage.bkb;
import defpackage.bm7;
import defpackage.cu1;
import defpackage.dcd;
import defpackage.gm7;
import defpackage.j1e;
import defpackage.j47;
import defpackage.j87;
import defpackage.jd4;
import defpackage.pag;
import defpackage.ql4;
import defpackage.qm;
import defpackage.wx3;
import defpackage.xx3;
import defpackage.y77;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/CoroutineWorker;", "Lgm7;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime-ktx_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends gm7 {
    public final y77 a;
    public final dcd b;
    public final jd4 c;

    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.a = pag.a();
        dcd dcdVar = new dcd();
        this.b = dcdVar;
        dcdVar.d(new cu1(21, this), (qm) ((bkb) getTaskExecutor()).a);
        this.c = ql4.a;
    }

    public abstract Object doWork(Continuation continuation);

    @Override // defpackage.gm7
    public final bm7 getForegroundInfoAsync() {
        y77 y77VarA = pag.a();
        ContextScope contextScopeA = j1e.a(this.c.plus(y77VarA));
        j87 j87Var = new j87(y77VarA);
        j47.T(contextScopeA, null, null, new wx3(j87Var, this, null), 3);
        return j87Var;
    }

    @Override // defpackage.gm7
    public final void onStopped() {
        this.b.cancel(false);
    }

    @Override // defpackage.gm7
    public final bm7 startWork() {
        j47.T(j1e.a(this.c.plus(this.a)), null, null, new xx3(this, null), 3);
        return this.b;
    }
}
