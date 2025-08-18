package ru.ok.tamtam.workmanager;

import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.ay5;
import defpackage.bkb;
import defpackage.bm7;
import defpackage.d24;
import defpackage.dcd;
import defpackage.e5f;
import defpackage.fke;
import defpackage.gm7;
import defpackage.h76;
import defpackage.i76;
import defpackage.j1e;
import defpackage.j47;
import defpackage.j87;
import defpackage.je7;
import defpackage.jyc;
import defpackage.khe;
import defpackage.kyc;
import defpackage.lk4;
import defpackage.lyc;
import defpackage.myc;
import defpackage.nx3;
import defpackage.nyc;
import defpackage.pag;
import defpackage.qm;
import defpackage.r0;
import defpackage.sy1;
import defpackage.tx3;
import defpackage.u3c;
import defpackage.v3c;
import defpackage.w9a;
import defpackage.xa3;
import defpackage.xda;
import defpackage.y77;
import defpackage.z87;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\b¢\u0006\u0004\b\u0017\u0010\u000bJ\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020 8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010'\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ok/tamtam/workmanager/SdkCoroutineWorker;", "Lgm7;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lbm7;", "Lfm7;", "startWork", "()Lbm7;", "Le5f;", "onStopWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ld24;", "data", "setProgress", "(Ld24;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lay5;", "foregroundInfo", "setForeground", "(Lay5;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getForegroundInfoAsync", "onStopped", "()V", "Lxa3;", "job", "Lxa3;", "Ldcd;", "future", "Ldcd;", "Lfke;", "tamComponent$delegate", "Lje7;", "getTamComponent", "()Lfke;", "tamComponent", "Lnx3;", "coroutineContext", "Lnx3;", "getCoroutineContext", "()Lnx3;", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public abstract class SdkCoroutineWorker extends gm7 {
    private final nx3 coroutineContext;
    private final dcd future;
    private final xa3 job;

    /* renamed from: tamComponent$delegate, reason: from kotlin metadata */
    private final je7 tamComponent;

    public SdkCoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.job = pag.a();
        dcd dcdVar = new dcd();
        this.future = dcdVar;
        dcdVar.d(new u3c(10, this), (qm) ((bkb) getTaskExecutor()).a);
        this.tamComponent = new khe(new xda(context, 25));
        this.coroutineContext = ((w9a) ((jyc) getTamComponent()).s()).a();
    }

    public static void b(SdkCoroutineWorker sdkCoroutineWorker) {
        if (sdkCoroutineWorker.future.a instanceof r0) {
            ((z87) sdkCoroutineWorker.job).cancel((CancellationException) null);
        }
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(SdkCoroutineWorker sdkCoroutineWorker, Continuation<? super ay5> continuation) {
        throw new IllegalStateException("Not implemented");
    }

    public static /* synthetic */ Object onStopWork$suspendImpl(SdkCoroutineWorker sdkCoroutineWorker, Continuation<? super e5f> continuation) {
        return e5f.a;
    }

    public abstract Object doWork(Continuation continuation);

    /* renamed from: getCoroutineContext, reason: from getter */
    public nx3 getC() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(Continuation continuation) {
        return getForegroundInfo$suspendImpl(this, continuation);
    }

    @Override // defpackage.gm7
    public final bm7 getForegroundInfoAsync() {
        y77 y77VarA = pag.a();
        ContextScope contextScopeA = j1e.a(getC().plus(y77VarA));
        j87 j87Var = new j87(y77VarA);
        j47.T(contextScopeA, null, null, new kyc(j87Var, this, null), 3);
        return j87Var;
    }

    public final fke getTamComponent() {
        return (fke) this.tamComponent.getValue();
    }

    public Object onStopWork(Continuation<? super e5f> continuation) {
        return onStopWork$suspendImpl(this, continuation);
    }

    @Override // defpackage.gm7
    public final void onStopped() {
        this.future.cancel(false);
        j47.T(j1e.a(getC().plus(this.job)), null, null, new lyc(this, null), 3);
    }

    public final Object setForeground(ay5 ay5Var, Continuation<? super e5f> continuation) throws Throwable {
        bm7 foregroundAsync = setForegroundAsync(ay5Var);
        if (foregroundAsync.isDone()) {
            try {
                foregroundAsync.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    throw e;
                }
                throw cause;
            }
        } else {
            sy1 sy1Var = new sy1(1, v3c.u(continuation));
            sy1Var.n();
            foregroundAsync.d(new h76(sy1Var, 20, foregroundAsync), lk4.a);
            sy1Var.d(new myc(foregroundAsync, 0));
            Object objM = sy1Var.m();
            if (objM == tx3.a) {
                return objM;
            }
        }
        return e5f.a;
    }

    public final Object setProgress(d24 d24Var, Continuation<? super e5f> continuation) throws Throwable {
        bm7 progressAsync = setProgressAsync(d24Var);
        if (progressAsync.isDone()) {
            try {
                progressAsync.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    throw e;
                }
                throw cause;
            }
        } else {
            sy1 sy1Var = new sy1(1, v3c.u(continuation));
            sy1Var.n();
            progressAsync.d(new i76(sy1Var, 18, progressAsync), lk4.a);
            sy1Var.d(new myc(progressAsync, 1));
            Object objM = sy1Var.m();
            if (objM == tx3.a) {
                return objM;
            }
        }
        return e5f.a;
    }

    @Override // defpackage.gm7
    public final bm7 startWork() {
        j47.T(j1e.a(getC().plus(this.job)), null, null, new nyc(this, null), 3);
        return this.future;
    }
}
