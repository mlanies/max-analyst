package defpackage;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class nw1 extends CameraDevice.StateCallback {
    public final /* synthetic */ int a;
    public final Object b;

    public nw1(q40 q40Var) {
        this.a = 1;
        this.b = q40Var;
    }

    private final void c(CameraDevice cameraDevice) {
    }

    public void a() {
        ArrayList arrayListH;
        synchronized (((q40) this.b).b) {
            arrayListH = ((q40) this.b).h();
            ((LinkedHashSet) ((q40) this.b).X).clear();
            ((LinkedHashSet) ((q40) this.b).c).clear();
            ((LinkedHashSet) ((q40) this.b).o).clear();
        }
        Iterator it = arrayListH.iterator();
        while (it.hasNext()) {
            jhe jheVar = (jhe) ((ihe) it.next());
            synchronized (jheVar.a) {
                try {
                    List list = jheVar.j;
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            ((xf4) it2.next()).b();
                        }
                        jheVar.j = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            jheVar.t.d();
        }
    }

    public void b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (((q40) this.b).b) {
            linkedHashSet.addAll((LinkedHashSet) ((q40) this.b).X);
            linkedHashSet.addAll((LinkedHashSet) ((q40) this.b).c);
        }
        ((Executor) ((q40) this.b).a).execute(new cu1(9, linkedHashSet));
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onClosed(cameraDevice);
                }
                break;
            default:
                b();
                a();
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onDisconnected(cameraDevice);
                }
                break;
            default:
                b();
                a();
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onError(cameraDevice, i);
                }
                return;
            default:
                b();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                synchronized (((q40) this.b).b) {
                    linkedHashSet.addAll((LinkedHashSet) ((q40) this.b).X);
                    linkedHashSet.addAll((LinkedHashSet) ((q40) this.b).c);
                }
                ((Executor) ((q40) this.b).a).execute(new l40(i, 6, linkedHashSet));
                a();
                return;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onOpened(cameraDevice);
                }
                break;
        }
    }

    public nw1(ArrayList arrayList) {
        this.a = 0;
        this.b = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CameraDevice.StateCallback stateCallback = (CameraDevice.StateCallback) it.next();
            if (!(stateCallback instanceof ow1)) {
                ((ArrayList) this.b).add(stateCallback);
            }
        }
    }
}
