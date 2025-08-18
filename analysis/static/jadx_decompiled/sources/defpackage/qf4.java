package defpackage;

import android.content.Context;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.Pair;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class qf4 implements zff {
    public final int a;
    public final boolean b;
    public final va8 c;
    public final ExecutorService d;
    public final id6 e;
    public final int f;
    public final boolean g = false;
    public final boolean h = false;

    public qf4(int i, boolean z, va8 va8Var, ScheduledExecutorService scheduledExecutorService, hd0 hd0Var, int i2) {
        this.a = i;
        this.b = z;
        this.c = va8Var;
        this.d = scheduledExecutorService;
        this.e = hd0Var;
        this.f = i2;
    }

    @Override // defpackage.zff
    public final /* bridge */ /* synthetic */ bgf a(Context context, xw0 xw0Var, i63 i63Var, boolean z, g03 g03Var) {
        return b(context, xw0Var, i63Var, z, nk4.a, g03Var);
    }

    public final rf4 b(final Context context, final xw0 xw0Var, final i63 i63Var, final boolean z, final Executor executor, final agf agfVar) {
        ExecutorService executorServiceNewSingleThreadExecutor = this.d;
        boolean z2 = executorServiceNewSingleThreadExecutor == null;
        if (executorServiceNewSingleThreadExecutor == null) {
            int i = oaf.a;
            executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new pd3(2, "Effect:DefaultVideoFrameProcessor:GlThread"));
        }
        ExecutorService executorService = executorServiceNewSingleThreadExecutor;
        final nx0 nx0Var = new nx0(executorService, z2, new lf4(agfVar, 1));
        try {
            return (rf4) executorService.submit(new Callable() { // from class: pf4
                @Override // java.util.concurrent.Callable
                public final Object call() throws GlUtil$GlException {
                    Pair pairCreate;
                    qf4 qf4Var = this.a;
                    qf4Var.getClass();
                    int i2 = rf4.s;
                    EGLDisplay eGLDisplayA = mr0.A();
                    i63 i63Var2 = i63Var;
                    int[] iArr = i63.g(i63Var2) ? mr0.h : mr0.g;
                    int i3 = oaf.a;
                    va8 va8Var = qf4Var.c;
                    if (i3 < 29) {
                        EGLContext eGLContextR = va8Var.r(eGLDisplayA, 2, iArr);
                        pairCreate = Pair.create(eGLContextR, va8Var.u(eGLContextR, eGLDisplayA));
                    } else {
                        try {
                            EGLContext eGLContextR2 = va8Var.r(eGLDisplayA, 3, iArr);
                            pairCreate = Pair.create(eGLContextR2, va8Var.u(eGLContextR2, eGLDisplayA));
                        } catch (GlUtil$GlException unused) {
                            EGLContext eGLContextR3 = va8Var.r(eGLDisplayA, 2, iArr);
                            pairCreate = Pair.create(eGLContextR3, va8Var.u(eGLContextR3, eGLDisplayA));
                        }
                    }
                    g63 g63VarA = i63Var2.a();
                    g63VarA.c = 1;
                    g63VarA.d = null;
                    i63 i63Var3 = new i63(g63VarA.a, g63VarA.b, g63VarA.c, g63VarA.e, g63VarA.f, g63VarA.d);
                    boolean zG = i63.g(i63Var2);
                    int i4 = qf4Var.a;
                    i63 i63Var4 = (zG || i4 == 2) ? i63Var3 : i63Var2;
                    agf agfVar2 = agfVar;
                    Objects.requireNonNull(agfVar2);
                    lf4 lf4Var = new lf4(agfVar2, 0);
                    boolean z3 = qf4Var.g;
                    Context context2 = context;
                    nx0 nx0Var2 = nx0Var;
                    Executor executor2 = executor;
                    s27 s27Var = new s27(context2, i63Var4, va8Var, nx0Var2, executor2, lf4Var, i4, qf4Var.b, z3, qf4Var.h);
                    EGLContext eGLContext = (EGLContext) pairCreate.first;
                    EGLSurface eGLSurface = (EGLSurface) pairCreate.second;
                    xw0 xw0Var2 = xw0Var;
                    id6 id6Var = qf4Var.e;
                    int i5 = qf4Var.f;
                    boolean z4 = z;
                    return new rf4(context2, va8Var, eGLDisplayA, s27Var, nx0Var2, agfVar2, executor2, new rk5(context2, eGLDisplayA, eGLContext, eGLSurface, xw0Var2, i63Var2, nx0Var2, executor2, agfVar2, id6Var, i5, i4, z4), z4, i63Var2);
                }
            }).get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new VideoFrameProcessingException(e);
        } catch (ExecutionException e2) {
            throw new VideoFrameProcessingException(e2);
        }
    }
}
