package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseArray;
import androidx.camera.camera2.Camera2Config$DefaultProvider;
import androidx.camera.core.impl.MetadataHolderService;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ay1 {
    public static final Object l = new Object();
    public static final SparseArray m = new SparseArray();
    public final va8 a = new va8(10, (byte) 0);
    public final Object b = new Object();
    public final by1 c;
    public final Executor d;
    public final Handler e;
    public yg2 f;
    public y7g g;
    public ev1 h;
    public final akc i;
    public final oq1 j;
    public int k;

    public ay1(Context context) {
        Object objH;
        Bundle bundle;
        Object objH2;
        Object objH3;
        oq1 oq1VarG;
        String string;
        boolean z = true;
        this.k = 1;
        Context contextN = lz7.n(context);
        while (true) {
            if (!(contextN instanceof ContextWrapper)) {
                break;
            }
            if (contextN instanceof Application) {
                break;
            }
            contextN = ((ContextWrapper) contextN).getBaseContext();
        }
        try {
            Context contextN2 = lz7.n(context);
            Bundle bundle2 = contextN2.getPackageManager().getServiceInfo(new ComponentName(contextN2, (Class<?>) MetadataHolderService.class), 640).metaData;
            string = bundle2 != null ? bundle2.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException unused) {
        }
        Camera2Config$DefaultProvider camera2Config$DefaultProvider = string == null ? null : (Camera2Config$DefaultProvider) Class.forName(string).getDeclaredConstructor(null).newInstance(null);
        if (camera2Config$DefaultProvider == null) {
            throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
        }
        by1 cameraXConfig = camera2Config$DefaultProvider.getCameraXConfig();
        this.c = cameraXConfig;
        aa0 aa0Var = by1.v0;
        wma wmaVar = cameraXConfig.a;
        wmaVar.getClass();
        try {
            objH = wmaVar.h(aa0Var);
        } catch (IllegalArgumentException unused2) {
            objH = null;
        }
        wrb wrbVarA = (wrb) objH;
        if (wrbVarA != null) {
            wrbVarA.toString();
        } else {
            try {
                bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) zrb.class), 640).metaData;
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            wrbVarA = bundle == null ? null : asb.a(context, bundle);
            Objects.toString(wrbVarA);
        }
        if (wrbVarA == null) {
            wrbVarA = yrb.b;
            Objects.toString(wrbVarA);
        }
        yrb.c.a.v(wrbVarA);
        by1 by1Var = this.c;
        aa0 aa0Var2 = by1.X;
        wma wmaVar2 = by1Var.a;
        wmaVar2.getClass();
        try {
            objH2 = wmaVar2.h(aa0Var2);
        } catch (IllegalArgumentException unused4) {
            objH2 = null;
        }
        Executor executor = (Executor) objH2;
        by1 by1Var2 = this.c;
        aa0 aa0Var3 = by1.Y;
        wma wmaVar3 = by1Var2.a;
        wmaVar3.getClass();
        try {
            objH3 = wmaVar3.h(aa0Var3);
        } catch (IllegalArgumentException unused5) {
            objH3 = null;
        }
        Handler handler = (Handler) objH3;
        this.d = executor == null ? new rw1() : executor;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            handlerThread.start();
            this.e = Handler.createAsync(handlerThread.getLooper());
        } else {
            this.e = handler;
        }
        Integer num = (Integer) this.c.f(by1.Z, null);
        synchronized (l) {
            try {
                if (num != null) {
                    c54.l(num.intValue(), "minLogLevel", 3, 6);
                    SparseArray sparseArray = m;
                    sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? ((Integer) sparseArray.get(num.intValue())).intValue() + 1 : 1));
                    if (sparseArray.size() == 0 || sparseArray.get(3) != null) {
                        mqd.e = 3;
                    } else if (sparseArray.get(4) != null) {
                        mqd.e = 4;
                    } else if (sparseArray.get(5) != null) {
                        mqd.e = 5;
                    } else if (sparseArray.get(6) != null) {
                        mqd.e = 6;
                    }
                }
            } finally {
            }
        }
        by1 by1Var3 = this.c;
        by1Var3.getClass();
        aa0 aa0Var4 = by1.u0;
        Object objH4 = akc.a;
        wma wmaVar4 = by1Var3.a;
        wmaVar4.getClass();
        try {
            objH4 = wmaVar4.h(aa0Var4);
        } catch (IllegalArgumentException unused6) {
        }
        akc akcVar = (akc) objH4;
        Objects.requireNonNull(akcVar);
        long jA = akcVar.a();
        this.i = akcVar instanceof ox1 ? ((ox1) akcVar).c(jA) : new rue(jA, akcVar);
        synchronized (this.b) {
            if (this.k != 1) {
                z = false;
            }
            c54.p("CameraX.initInternal() should only be called once per instance", z);
            this.k = 2;
            oq1VarG = f8.g(new f9(this, 16, context));
        }
        this.j = oq1VarG;
    }
}
