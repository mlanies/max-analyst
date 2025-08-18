package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.core.impl.utils.SurfaceUtil;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class sz1 {
    public ihe d;
    public ihe e;
    public fad f;
    public int i;
    public oq1 j;
    public lq1 k;
    public final vg8 o;
    public final o9g p;
    public final oq0 q;
    public final boolean r;
    public final Object a = new Object();
    public final ArrayList b = new ArrayList();
    public final HashMap g = new HashMap();
    public List h = Collections.emptyList();
    public Map l = new HashMap();
    public final ae3 m = new ae3(5);
    public final ae3 n = new ae3(7);
    public final rz1 c = new rz1(this);

    public sz1(o9g o9gVar, bj6 bj6Var, boolean z) {
        this.i = 1;
        this.i = 2;
        this.p = o9gVar;
        this.o = new vg8(bj6Var.d(CaptureNoResponseQuirk.class));
        this.q = new oq0(bj6Var, 6);
        this.r = z;
    }

    public static ju1 b(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        CameraCaptureSession.CaptureCallback ju1Var;
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            iv1 iv1Var = (iv1) it.next();
            if (iv1Var == null) {
                ju1Var = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                od2.b0(iv1Var, arrayList2);
                ju1Var = arrayList2.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList2.get(0) : new ju1(arrayList2);
            }
            arrayList.add(ju1Var);
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return new ju1(arrayList);
    }

    public static HashMap c(HashMap map, HashMap map2) {
        HashMap map3 = new HashMap();
        for (Integer num : map.keySet()) {
            num.getClass();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (rb0 rb0Var : (List) map.get(num)) {
                w3 w3VarA = SurfaceUtil.a((Surface) map2.get(rb0Var.a));
                if (i == 0) {
                    i = w3VarA.a;
                }
                m30.q();
                int i2 = w3VarA.b;
                int i3 = w3VarA.c;
                String str = rb0Var.c;
                Objects.requireNonNull(str);
                arrayList.add(m30.c(i2, i3, str));
            }
            if (i == 0 || arrayList.isEmpty()) {
                arrayList.size();
            } else {
                List list = null;
                try {
                    list = (List) OutputConfiguration.class.getMethod("createInstancesForMultiResolutionOutput", Collection.class, Integer.TYPE).invoke(null, arrayList, Integer.valueOf(i));
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    e.getMessage();
                }
                if (list != null) {
                    for (rb0 rb0Var2 : (List) map.get(num)) {
                        OutputConfiguration outputConfiguration = (OutputConfiguration) list.remove(0);
                        outputConfiguration.addSurface((Surface) map2.get(rb0Var2.a));
                        map3.put(rb0Var2, new tna(outputConfiguration));
                    }
                }
            }
        }
        return map3;
    }

    public static ArrayList f(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            tna tnaVar = (tna) it.next();
            if (!arrayList2.contains(tnaVar.a.d())) {
                arrayList2.add(tnaVar.a.d());
                arrayList3.add(tnaVar);
            }
        }
        return arrayList3;
    }

    public static HashMap g(ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            rb0 rb0Var = (rb0) it.next();
            if (rb0Var.e > 0 && rb0Var.b.isEmpty()) {
                int i = rb0Var.e;
                List arrayList2 = (List) map.get(Integer.valueOf(i));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    map.put(Integer.valueOf(i), arrayList2);
                }
                arrayList2.add(rb0Var);
            }
        }
        HashMap map2 = new HashMap();
        for (Integer num : map.keySet()) {
            num.getClass();
            if (((List) map.get(num)).size() >= 2) {
                map2.put(num, (List) map.get(num));
            }
        }
        return map2;
    }

    public final void a() {
        synchronized (this.a) {
            try {
                int iS = au1.s(this.i);
                if (iS == 0) {
                    throw new IllegalStateException("close() should not be possible in state: ".concat(wg0.t(this.i)));
                }
                if (iS == 1) {
                    this.i = 8;
                } else if (iS == 2) {
                    c54.o(this.d, "The Opener shouldn't null in state:".concat(wg0.t(this.i)));
                    this.d.p();
                    this.i = 8;
                } else if (iS == 3 || iS == 4) {
                    c54.o(this.d, "The Opener shouldn't null in state:".concat(wg0.t(this.i)));
                    this.d.p();
                    this.i = 6;
                    this.o.d();
                    this.f = null;
                }
            } finally {
            }
        }
    }

    public final void d() {
        if (this.i == 8) {
            return;
        }
        this.i = 8;
        this.e = null;
        lq1 lq1Var = this.k;
        if (lq1Var != null) {
            lq1Var.b(null);
            this.k = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.tna e(defpackage.rb0 r6, java.util.HashMap r7, java.lang.String r8) {
        /*
            r5 = this;
            xf4 r0 = r6.a
            java.lang.Object r0 = r7.get(r0)
            android.view.Surface r0 = (android.view.Surface) r0
            java.lang.String r1 = "Surface in OutputConfig not found in configuredSurfaceMap."
            defpackage.c54.o(r0, r1)
            tna r2 = new tna
            int r3 = r6.e
            r2.<init>(r3, r0)
            vna r0 = r2.a
            if (r8 == 0) goto L1c
            r0.g(r8)
            goto L21
        L1c:
            java.lang.String r8 = r6.c
            r0.g(r8)
        L21:
            r8 = 1
            int r3 = r6.d
            if (r3 != 0) goto L2a
            r0.f(r8)
            goto L30
        L2a:
            if (r3 != r8) goto L30
            r3 = 2
            r0.f(r3)
        L30:
            java.util.List r3 = r6.b
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L58
            r0.b()
            java.util.Iterator r3 = r3.iterator()
        L3f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L58
            java.lang.Object r4 = r3.next()
            xf4 r4 = (defpackage.xf4) r4
            java.lang.Object r4 = r7.get(r4)
            android.view.Surface r4 = (android.view.Surface) r4
            defpackage.c54.o(r4, r1)
            r0.a(r4)
            goto L3f
        L58:
            int r7 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r7 < r1) goto L87
            o9g r5 = r5.p
            r5.getClass()
            if (r7 < r1) goto L66
            goto L67
        L66:
            r8 = 0
        L67:
            java.lang.String r7 = "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher."
            defpackage.c54.p(r7, r8)
            java.lang.Object r5 = r5.b
            iu4 r5 = (defpackage.iu4) r5
            android.hardware.camera2.params.DynamicRangeProfiles r5 = r5.b()
            if (r5 == 0) goto L87
            eu4 r6 = r6.f
            java.lang.Long r5 = defpackage.fu4.a(r6, r5)
            if (r5 != 0) goto L82
            java.util.Objects.toString(r6)
            goto L87
        L82:
            long r5 = r5.longValue()
            goto L89
        L87:
            r5 = 1
        L89:
            r0.e(r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sz1.e(rb0, java.util.HashMap, java.lang.String):tna");
    }

    public final boolean h() {
        boolean z;
        synchronized (this.a) {
            int i = this.i;
            z = i == 5 || i == 4;
        }
        return z;
    }

    public final void i(List list) {
        pv1 pv1Var;
        synchronized (this.a) {
            try {
                if (this.i != 5) {
                    return;
                }
                if (list.isEmpty()) {
                    return;
                }
                try {
                    qt1 qt1Var = new qt1(1);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    boolean z = false;
                    while (it.hasNext()) {
                        kz1 kz1Var = (kz1) it.next();
                        if (!Collections.unmodifiableList(kz1Var.a).isEmpty()) {
                            Iterator it2 = Collections.unmodifiableList(kz1Var.a).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    xf4 xf4Var = (xf4) it2.next();
                                    if (!this.g.containsKey(xf4Var)) {
                                        Objects.toString(xf4Var);
                                        break;
                                    }
                                } else {
                                    if (kz1Var.c == 2) {
                                        z = true;
                                    }
                                    u40 u40Var = new u40(kz1Var);
                                    if (kz1Var.c == 5 && (pv1Var = kz1Var.h) != null) {
                                        u40Var.h = pv1Var;
                                    }
                                    fad fadVar = this.f;
                                    if (fadVar != null) {
                                        u40Var.c(fadVar.g.b);
                                    }
                                    u40Var.c(kz1Var.b);
                                    kz1 kz1VarD = u40Var.d();
                                    ihe iheVar = this.e;
                                    iheVar.f.getClass();
                                    CaptureRequest captureRequestE = oag.e(kz1VarD, ((CameraCaptureSession) ((ph4) iheVar.f.a).a).getDevice(), this.g, false, this.q);
                                    if (captureRequestE == null) {
                                        return;
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it3 = kz1Var.e.iterator();
                                    while (it3.hasNext()) {
                                        od2.b0((iv1) it3.next(), arrayList2);
                                    }
                                    qt1Var.a(captureRequestE, arrayList2);
                                    arrayList.add(captureRequestE);
                                }
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        if (this.m.i(arrayList, z)) {
                            ihe iheVar2 = this.e;
                            c54.o(iheVar2.f, "Need to call openCaptureSession before using this API.");
                            ((CameraCaptureSession) ((ph4) iheVar2.f.a).a).stopRepeating();
                            qt1Var.c = new qz1(this);
                        }
                        if (this.n.f(arrayList, z)) {
                            qt1Var.a((CaptureRequest) arrayList.get(arrayList.size() - 1), Collections.singletonList(new ju1(this)));
                        }
                        this.e.i(arrayList, qt1Var);
                    }
                } catch (CameraAccessException e) {
                    e.getMessage();
                    Thread.dumpStack();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(List list) {
        synchronized (this.a) {
            try {
                switch (au1.s(this.i)) {
                    case 0:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: ".concat(wg0.t(this.i)));
                    case 1:
                    case 2:
                    case 3:
                        this.b.addAll(list);
                        break;
                    case 4:
                        this.b.addAll(list);
                        this.o.c().d(new cu1(8, this), ju0.k());
                        break;
                    case 5:
                    case 6:
                    case 7:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                }
            } finally {
            }
        }
    }

    public final void k(fad fadVar) {
        synchronized (this.a) {
            try {
            } catch (Throwable th) {
                throw th;
            }
            if (fadVar == null) {
                return;
            }
            if (this.i != 5) {
                return;
            }
            kz1 kz1Var = fadVar.g;
            if (Collections.unmodifiableList(kz1Var.a).isEmpty()) {
                try {
                    ihe iheVar = this.e;
                    c54.o(iheVar.f, "Need to call openCaptureSession before using this API.");
                    ((CameraCaptureSession) ((ph4) iheVar.f.a).a).stopRepeating();
                } catch (CameraAccessException e) {
                    e.getMessage();
                    Thread.dumpStack();
                }
                return;
            }
            try {
                ihe iheVar2 = this.e;
                iheVar2.f.getClass();
                CaptureRequest captureRequestE = oag.e(kz1Var, ((CameraCaptureSession) ((ph4) iheVar2.f.a).a).getDevice(), this.g, true, this.q);
                if (captureRequestE == null) {
                    return;
                }
                this.e.n(captureRequestE, this.o.a(b(kz1Var.e, new CameraCaptureSession.CaptureCallback[0])));
                return;
            } catch (CameraAccessException e2) {
                e2.getMessage();
                Thread.dumpStack();
                return;
            }
            throw th;
        }
    }

    public final bm7 l(fad fadVar, CameraDevice cameraDevice, ihe iheVar) {
        synchronized (this.a) {
            try {
                if (au1.s(this.i) != 1) {
                    return new dw6(1, new IllegalStateException("open() should not allow the state: ".concat(wg0.t(this.i))));
                }
                this.i = 3;
                ArrayList arrayList = new ArrayList(fadVar.b());
                this.h = arrayList;
                this.d = iheVar;
                b76 b76VarA = b76.a(iheVar.o(arrayList));
                u00 u00Var = new u00(this, fadVar, cameraDevice, 2);
                Executor executor = this.d.c;
                b76VarA.getClass();
                k12 k12VarK = kq0.K(b76VarA, u00Var, executor);
                kq0.a(k12VarK, new fd7(this), this.d.c);
                return kq0.w(k12VarK);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final bm7 m() {
        synchronized (this.a) {
            try {
                switch (au1.s(this.i)) {
                    case 0:
                        throw new IllegalStateException("release() should not be possible in state: ".concat(wg0.t(this.i)));
                    case 2:
                        c54.o(this.d, "The Opener shouldn't null in state:".concat(wg0.t(this.i)));
                        this.d.p();
                    case 1:
                        this.i = 8;
                        return dw6.c;
                    case 4:
                    case 5:
                        ihe iheVar = this.e;
                        if (iheVar != null) {
                            iheVar.j();
                        }
                    case 3:
                        this.i = 7;
                        this.o.d();
                        c54.o(this.d, "The Opener shouldn't null in state:".concat(wg0.t(this.i)));
                        if (this.d.p()) {
                            d();
                            return dw6.c;
                        }
                    case 6:
                        if (this.j == null) {
                            this.j = f8.g(new qz1(this));
                        }
                        return this.j;
                    default:
                        return dw6.c;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(fad fadVar) {
        synchronized (this.a) {
            try {
                switch (au1.s(this.i)) {
                    case 0:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: ".concat(wg0.t(this.i)));
                    case 1:
                    case 2:
                    case 3:
                        this.f = fadVar;
                        break;
                    case 4:
                        this.f = fadVar;
                        if (fadVar != null) {
                            if (this.g.keySet().containsAll(fadVar.b())) {
                                k(this.f);
                                break;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    case 5:
                    case 6:
                    case 7:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                }
            } finally {
            }
        }
    }
}
