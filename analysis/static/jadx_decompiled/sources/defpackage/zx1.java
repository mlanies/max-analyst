package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.os.Trace;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class zx1 implements Runnable {
    public final /* synthetic */ int X;
    public final /* synthetic */ Context Y;
    public final /* synthetic */ lq1 Z;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ay1 b;
    public final /* synthetic */ Executor c;
    public final /* synthetic */ long o;

    public /* synthetic */ zx1(ay1 ay1Var, Context context, Executor executor, int i, lq1 lq1Var, long j) {
        this.b = ay1Var;
        this.Y = context;
        this.c = executor;
        this.X = i;
        this.Z = lq1Var;
        this.o = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.a) {
            case 0:
                ay1 ay1Var = this.b;
                Context context = this.Y;
                Executor executor = this.c;
                int i = this.X;
                lq1 lq1Var = this.Z;
                long j = this.o;
                ay1Var.getClass();
                Trace.beginSection(c37.F("CX:initAndRetryRecursively"));
                Context contextN = lz7.n(context);
                try {
                    try {
                        try {
                        } catch (InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException e) {
                            e = e;
                        }
                    } finally {
                        Trace.endSection();
                    }
                } catch (InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException e2) {
                    e = e2;
                    obj = obj;
                }
                if (ay1Var.c.b() == null) {
                    throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
                }
                w90 w90Var = new w90(ay1Var.d, ay1Var.e);
                px1 px1VarA = ay1Var.c.a();
                try {
                    ay1Var.f = new yg2(contextN, w90Var, px1VarA, ay1Var.c.c());
                } catch (InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException e3) {
                    e = e3;
                    obj = null;
                    zjc zjcVarB = ay1Var.i.b(new mx1(j, e));
                    if (hye.a()) {
                        Trace.setCounter(c37.F("CX:CameraProvider-RetryStatus"), r5.a);
                    }
                    if (!zjcVarB.b || i >= Integer.MAX_VALUE) {
                        synchronized (ay1Var.b) {
                            ay1Var.k = 3;
                        }
                        if (zjcVarB.c) {
                            synchronized (ay1Var.b) {
                                ay1Var.k = 4;
                            }
                            lq1Var.b(obj);
                        } else if (e instanceof CameraValidator$CameraIdListIncorrectException) {
                            lq1Var.d(new InitializationException(new CameraUnavailableException("Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator$CameraIdListIncorrectException) e).a)));
                        } else if (e instanceof InitializationException) {
                            lq1Var.d(e);
                        } else {
                            lq1Var.d(new InitializationException(e));
                        }
                    } else {
                        SystemClock.elapsedRealtime();
                        ay1Var.e.postDelayed(new zx1(ay1Var, executor, j, i, contextN, lq1Var), "retry_token", zjcVarB.a);
                    }
                    Trace.endSection();
                    return;
                }
                if (ay1Var.c.d() == null) {
                    throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
                }
                yg2 yg2Var = ay1Var.f;
                ay1Var.g = bv1.a(contextN, (dx1) yg2Var.f, new LinkedHashSet((ArrayList) yg2Var.g));
                if (ay1Var.c.j() == null) {
                    throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
                }
                ay1Var.h = new ev1(contextN);
                if (executor instanceof rw1) {
                    ((rw1) executor).a(ay1Var.f);
                }
                ay1Var.a.z(ay1Var.f);
                yx1.a(contextN, ay1Var.a, px1VarA);
                if (i > 1 && hye.a()) {
                    Trace.setCounter(c37.F("CX:CameraProvider-RetryStatus"), -1);
                }
                synchronized (ay1Var.b) {
                    try {
                        ay1Var.k = 4;
                    } finally {
                        th = th;
                        while (true) {
                            try {
                            } catch (Throwable th) {
                                th = th;
                            }
                        }
                    }
                }
                lq1Var.b(null);
                Trace.endSection();
                return;
            default:
                int i2 = this.X + 1;
                ay1 ay1Var2 = this.b;
                ay1Var2.getClass();
                Context context2 = this.Y;
                Executor executor2 = this.c;
                executor2.execute(new zx1(ay1Var2, context2, executor2, i2, this.Z, this.o));
                return;
        }
    }

    public /* synthetic */ zx1(ay1 ay1Var, Executor executor, long j, int i, Context context, lq1 lq1Var) {
        this.b = ay1Var;
        this.c = executor;
        this.o = j;
        this.X = i;
        this.Y = context;
        this.Z = lq1Var;
    }
}
