package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.util.ArrayMap;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class xt1 extends CameraDevice.StateCallback {
    public final /* synthetic */ lq1 a;
    public final /* synthetic */ fu1 b;

    public xt1(fu1 fu1Var, lq1 lq1Var) {
        this.b = fu1Var;
        this.a = lq1Var;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        this.b.toString();
        this.a.b(null);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        this.b.toString();
        this.a.b(null);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        this.b.toString();
        this.a.b(null);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        fu1 fu1Var = this.b;
        fu1Var.toString();
        sz1 sz1Var = new sz1(fu1Var.P0, new bj6(Collections.emptyList()), false);
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        Surface surface = new Surface(surfaceTexture);
        fw6 fw6Var = new fw6(surface);
        kq0.w(fw6Var.e).d(new wt1(surface, 0, surfaceTexture), ju0.k());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        mi9 mi9VarB = mi9.b();
        ArrayList arrayList = new ArrayList();
        ui9 ui9VarA = ui9.a();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        eu4 eu4Var = eu4.d;
        xe5 xe5VarA = rb0.a(fw6Var);
        xe5VarA.Y = eu4Var;
        linkedHashSet.add(xe5VarA.a());
        fu1Var.toString();
        ArrayList arrayList5 = new ArrayList(linkedHashSet);
        ArrayList arrayList6 = new ArrayList(arrayList2);
        ArrayList arrayList7 = new ArrayList(arrayList3);
        ArrayList arrayList8 = new ArrayList(arrayList4);
        ArrayList arrayList9 = new ArrayList(hashSet);
        wma wmaVarA = wma.a(mi9VarB);
        ArrayList arrayList10 = new ArrayList(arrayList);
        nje njeVar = nje.b;
        ArrayMap arrayMap = new ArrayMap();
        Map map = ui9VarA.a;
        for (Iterator it = map.keySet().iterator(); it.hasNext(); it = it) {
            String str = (String) it.next();
            arrayMap.put(str, map.get(str));
        }
        fad fadVar = new fad(arrayList5, arrayList6, arrayList7, arrayList8, new kz1(arrayList9, wmaVarA, 1, false, arrayList10, false, new nje(arrayMap), null), null, null, 0, null);
        z23 z23Var = fu1Var.J0;
        b76 b76VarA = b76.a(f8.g(new f76(sz1Var.l(fadVar, cameraDevice, new jhe((bj6) z23Var.e, (bj6) z23Var.f, (q40) z23Var.d, (Executor) z23Var.b, (ScheduledExecutorService) z23Var.a, (Handler) z23Var.c)), 0)));
        f9 f9Var = new f9(sz1Var, 12, fw6Var);
        b76VarA.getClass();
        q6d q6dVar = fu1Var.c;
        k12 k12VarK = kq0.K(b76VarA, f9Var, q6dVar);
        Objects.requireNonNull(cameraDevice);
        k12VarK.d(new b(29, cameraDevice), q6dVar);
    }
}
