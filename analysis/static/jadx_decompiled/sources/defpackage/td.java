package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraCharacteristics;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import androidx.work.WorkRequest;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import org.webrtc.IceCandidate;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class td implements qv6, q78, z66, erd, a76, ofc {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;
    public Object o;

    public td() {
        this.a = 20;
        this.o = new Object();
    }

    public static boolean e(eu4 eu4Var, eu4 eu4Var2) {
        c54.p("Fully specified range is not actually fully specified.", eu4Var2.b());
        int i = eu4Var.a;
        int i2 = eu4Var2.a;
        if (i == 2 && i2 == 1) {
            return false;
        }
        if (i != 2 && i != 0 && i != i2) {
            return false;
        }
        int i3 = eu4Var.b;
        return i3 == 0 || i3 == eu4Var2.b;
    }

    public static boolean f(eu4 eu4Var, eu4 eu4Var2, HashSet hashSet) {
        if (hashSet.contains(eu4Var2)) {
            return e(eu4Var, eu4Var2);
        }
        eu4Var.toString();
        eu4Var2.toString();
        return false;
    }

    public static eu4 q(eu4 eu4Var, LinkedHashSet linkedHashSet, HashSet hashSet) {
        if (eu4Var.a == 1) {
            return null;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            eu4 eu4Var2 = (eu4) it.next();
            c54.o(eu4Var2, "Fully specified DynamicRange cannot be null.");
            c54.p("Fully specified DynamicRange must have fully defined encoding.", eu4Var2.b());
            if (eu4Var2.a != 1 && f(eu4Var, eu4Var2, hashSet)) {
                return eu4Var2;
            }
        }
        return null;
    }

    private final void r(Throwable th) {
    }

    public static void w(HashSet hashSet, eu4 eu4Var, o9g o9gVar) {
        c54.p("Cannot update already-empty constraints.", !hashSet.isEmpty());
        Set setC = ((iu4) o9gVar.b).c(eu4Var);
        if (setC.isEmpty()) {
            return;
        }
        HashSet hashSet2 = new HashSet(hashSet);
        hashSet.retainAll(setC);
        if (hashSet.isEmpty()) {
            throw new IllegalArgumentException("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  " + eu4Var + "\nConstraints:\n  " + TextUtils.join("\n  ", setC) + "\nExisting constraints:\n  " + TextUtils.join("\n  ", hashSet2));
        }
    }

    @Override // defpackage.z66
    public void a(Object obj) {
        int i;
        switch (this.a) {
            case 5:
                Bitmap bitmap = (Bitmap) obj;
                if (!this.b) {
                    bu9 bu9Var = (bu9) this.c;
                    bu9Var.k(bitmap);
                    sh0 sh0Var = new sh0(bu9Var.b());
                    ui0 ui0Var = (ui0) this.o;
                    ue ueVar = (ue) ui0Var.c;
                    ((a84) ueVar.g).execute(new t05(ueVar, ui0Var.b, (qh8) ui0Var.o, sh0Var, 2));
                    break;
                }
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ii8 ii8Var = (ii8) this.o;
                ii8Var.getClass();
                j47.m0(ii8Var.s, (ph8) obj);
                oaf.I(ii8Var.s);
                if (this.b) {
                    ii8Var.p((oh8) this.c);
                    break;
                }
                break;
            case 13:
                ph8 ph8Var = (ph8) obj;
                ii8 ii8Var2 = ((si8) this.o).f;
                Handler handler = ii8Var2.l;
                boolean z = this.b;
                oh8 oh8Var = (oh8) this.c;
                oaf.W(handler, new vs5(ii8Var2, oh8Var, new ii5(3, this, ph8Var, oh8Var, z), 19));
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                if (!this.b) {
                    ((erd) this.c).a(obj);
                    break;
                }
                break;
            default:
                rdf rdfVar = (rdf) this.o;
                if (((bm7) this.c) == rdfVar.t && (i = rdfVar.v) != 3) {
                    int i2 = this.b ? 1 : 2;
                    if (i2 != i) {
                        rdfVar.v = i2;
                        rdfVar.L().c(i2);
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:11:0x0024, B:13:0x002f, B:14:0x0034, B:18:0x003a, B:20:0x0046, B:23:0x004d, B:25:0x0050, B:28:0x005e, B:31:0x0064, B:33:0x006e, B:36:0x00dd, B:34:0x00b5, B:35:0x00d8), top: B:45:0x0024 }] */
    @Override // defpackage.ofc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void accept(java.lang.Object r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.td.accept(java.lang.Object, java.lang.Object):void");
    }

    public void b(fg1 fg1Var, nsa nsaVar) {
        ((a4c) this.o).log("IceCandidatesHandler", "handle, participant=" + fg1Var + ", client=" + nsaVar);
        if (!this.b || !fg1Var.b() || nsaVar == null || !nsaVar.l1) {
            ((a4c) this.o).log("IceCandidatesHandler", "Cant apply ice candidates, isIceApplyPermitted=" + this.b + ", " + fg1Var + ", client=" + nsaVar);
            return;
        }
        ((a4c) this.o).log("IceCandidatesHandler", nsaVar + " is iceable for " + fg1Var);
        Map map = (Map) ((HashMap) this.c).get(fg1Var);
        if (map != null) {
            if (Objects.equals(fg1Var.j, fg1.r)) {
                ((a4c) this.o).log("IceCandidatesHandler", "push all ice candidates to " + nsaVar);
                for (Map.Entry entry : map.entrySet()) {
                    Iterator it = ((List) ((kpa) entry.getValue()).a).iterator();
                    while (it.hasNext()) {
                        nsaVar.r((IceCandidate) it.next());
                    }
                    if (!((List) ((kpa) entry.getValue()).b).isEmpty()) {
                        nsaVar.H((IceCandidate[]) ((List) ((kpa) entry.getValue()).b).toArray(new IceCandidate[((List) ((kpa) entry.getValue()).b).size()]));
                    }
                }
            } else {
                kpa kpaVar = (kpa) map.get(fg1Var.j);
                if (kpaVar != null) {
                    Iterator it2 = ((List) kpaVar.a).iterator();
                    while (it2.hasNext()) {
                        nsaVar.r((IceCandidate) it2.next());
                    }
                    if (!((List) kpaVar.b).isEmpty()) {
                        List list = (List) kpaVar.b;
                        nsaVar.H((IceCandidate[]) list.toArray(new IceCandidate[list.size()]));
                    }
                }
            }
            map.clear();
        }
    }

    @Override // defpackage.erd
    public void c(zl4 zl4Var) {
        erd erdVar = (erd) this.c;
        try {
            ((qj3) this.o).accept(zl4Var);
            erdVar.c(zl4Var);
        } catch (Throwable th) {
            c37.B(th);
            this.b = true;
            zl4Var.g();
            iz4.c(th, erdVar);
        }
    }

    @Override // defpackage.qv6
    public void close() {
        synchronized (this.o) {
            ((ImageReader) this.c).close();
        }
    }

    @Override // defpackage.z66
    public void d(Throwable th) {
        switch (this.a) {
            case 5:
                if (!this.b) {
                    z04.c0("Failed to load bitmap: " + th.getMessage());
                    break;
                }
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                if (th instanceof UnsupportedOperationException) {
                    z04.d0("UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th);
                } else {
                    z04.v("Failure calling MediaSession.Callback.onPlaybackResumption(): " + th.getMessage(), th);
                }
                ii8 ii8Var = (ii8) this.o;
                oaf.I(ii8Var.s);
                if (this.b) {
                    ii8Var.p((oh8) this.c);
                    break;
                }
                break;
            case 13:
                break;
            default:
                boolean z = th instanceof CancellationException;
                break;
        }
    }

    @Override // defpackage.qv6
    public ov6 g() {
        Image imageAcquireLatestImage;
        synchronized (this.o) {
            try {
                imageAcquireLatestImage = ((ImageReader) this.c).acquireLatestImage();
            } catch (RuntimeException e) {
                if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                    throw e;
                }
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new rd(imageAcquireLatestImage);
        }
    }

    @Override // defpackage.qv6
    public int getHeight() {
        int height;
        synchronized (this.o) {
            height = ((ImageReader) this.c).getHeight();
        }
        return height;
    }

    @Override // defpackage.qv6
    public Surface getSurface() {
        Surface surface;
        synchronized (this.o) {
            surface = ((ImageReader) this.c).getSurface();
        }
        return surface;
    }

    @Override // defpackage.qv6
    public int getWidth() {
        int width;
        synchronized (this.o) {
            width = ((ImageReader) this.c).getWidth();
        }
        return width;
    }

    public void h() throws MediaCodec.CryptoException {
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int iDequeueOutputBuffer = ((MediaCodec) this.c).dequeueOutputBuffer(bufferInfo, WorkRequest.MIN_BACKOFF_MILLIS);
        if (this.b) {
            int iDequeueInputBuffer = ((MediaCodec) this.c).dequeueInputBuffer(WorkRequest.MIN_BACKOFF_MILLIS);
            if (iDequeueInputBuffer >= 0) {
                ((MediaCodec) this.c).queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                this.b = false;
            } else {
                this.b = true;
            }
        }
        if (iDequeueOutputBuffer == -3 || iDequeueOutputBuffer == -2 || iDequeueOutputBuffer == -1) {
            return;
        }
        if (iDequeueOutputBuffer < 0) {
            hm9.p("td", "unexpected result from encoder.dequeueOutputBuffer: " + iDequeueOutputBuffer, null);
            return;
        }
        boolean z = bufferInfo.size != 0;
        ((MediaCodec) this.c).releaseOutputBuffer(iDequeueOutputBuffer, z);
        xef xefVar = (xef) this.o;
        if (xefVar != null) {
            if (z) {
                long j = bufferInfo.presentationTimeUs;
                long j2 = xefVar.x;
                if (j >= j2) {
                    if (j >= xefVar.y) {
                        xefVar.m = true;
                    } else {
                        bufferInfo.presentationTimeUs = j - j2;
                        m5d m5dVar = xefVar.i;
                        EGLDisplay eGLDisplay = (EGLDisplay) m5dVar.b;
                        EGLSurface eGLSurface = (EGLSurface) m5dVar.o;
                        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, (EGLContext) m5dVar.c)) {
                            throw new RuntimeException("eglMakeCurrent failed");
                        }
                        yna ynaVar = xefVar.g;
                        synchronized (ynaVar.c) {
                            while (!ynaVar.o) {
                                try {
                                    ynaVar.c.wait(500L);
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                            ynaVar.o = false;
                        }
                        ynaVar.X.getClass();
                        ere.a("before updateTexImage");
                        ynaVar.a.updateTexImage();
                        yna ynaVar2 = xefVar.g;
                        ynaVar2.getClass();
                        ynaVar2.X.b(ynaVar2.a, 36197);
                        m5d m5dVar2 = xefVar.i;
                        EGLExt.eglPresentationTimeANDROID((EGLDisplay) m5dVar2.b, (EGLSurface) m5dVar2.o, bufferInfo.presentationTimeUs * 1000);
                        m5d m5dVar3 = xefVar.i;
                        EGL14.eglSwapBuffers((EGLDisplay) m5dVar3.b, (EGLSurface) m5dVar3.o);
                    }
                }
            }
            if ((bufferInfo.flags & 4) != 0) {
                xef xefVar2 = (xef) this.o;
                ((MediaCodec) xefVar2.h.a).signalEndOfInputStream();
                MediaCodec mediaCodec = (MediaCodec) xefVar2.f.c;
                if (mediaCodec != null) {
                    mediaCodec.stop();
                }
                MediaCodec mediaCodec2 = (MediaCodec) xefVar2.f.c;
                if (mediaCodec2 != null) {
                    mediaCodec2.release();
                }
                xefVar2.i.K();
                xefVar2.k = true;
            }
        }
    }

    @Override // defpackage.qv6
    public int j() {
        int imageFormat;
        synchronized (this.o) {
            imageFormat = ((ImageReader) this.c).getImageFormat();
        }
        return imageFormat;
    }

    @Override // defpackage.qv6
    public void k() {
        synchronized (this.o) {
            this.b = true;
            ((ImageReader) this.c).setOnImageAvailableListener(null, null);
        }
    }

    @Override // defpackage.qv6
    public void l(final pv6 pv6Var, final Executor executor) {
        synchronized (this.o) {
            this.b = false;
            ((ImageReader) this.c).setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: sd
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    td tdVar = this.a;
                    Executor executor2 = executor;
                    pv6 pv6Var2 = pv6Var;
                    synchronized (tdVar.o) {
                        try {
                            if (!tdVar.b) {
                                executor2.execute(new c(tdVar, 2, pv6Var2));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }, ay7.t());
        }
    }

    @Override // defpackage.qv6
    public int m() {
        int maxImages;
        synchronized (this.o) {
            maxImages = ((ImageReader) this.c).getMaxImages();
        }
        return maxImages;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c A[Catch: Exception -> 0x003a, TryCatch #1 {Exception -> 0x003a, blocks: (B:4:0x001a, B:6:0x001e, B:11:0x002b, B:13:0x0033, B:17:0x004c, B:16:0x003c), top: B:31:0x001a }] */
    @Override // defpackage.q78
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.ay i(defpackage.o78 r6) throws java.lang.Exception {
        /*
            r5 = this;
            java.lang.String r0 = "createCodec:"
            y78 r1 = r6.a
            java.lang.String r1 = r1.a
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6b
            r3.<init>(r0)     // Catch: java.lang.Exception -> L6b
            r3.append(r1)     // Catch: java.lang.Exception -> L6b
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Exception -> L6b
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Exception -> L6b
            android.media.MediaCodec r0 = android.media.MediaCodec.createByCodecName(r1)     // Catch: java.lang.Exception -> L6b
            boolean r1 = r5.b     // Catch: java.lang.Exception -> L3a
            if (r1 == 0) goto L3c
            qy5 r1 = r6.c     // Catch: java.lang.Exception -> L3a
            int r3 = defpackage.oaf.a     // Catch: java.lang.Exception -> L3a
            r4 = 34
            if (r3 >= r4) goto L27
            goto L3c
        L27:
            r4 = 35
            if (r3 >= r4) goto L33
            java.lang.String r1 = r1.n     // Catch: java.lang.Exception -> L3a
            boolean r1 = defpackage.ia9.k(r1)     // Catch: java.lang.Exception -> L3a
            if (r1 == 0) goto L3c
        L33:
            w5e r1 = new w5e     // Catch: java.lang.Exception -> L3a
            r1.<init>(r0)     // Catch: java.lang.Exception -> L3a
            r3 = 4
            goto L4c
        L3a:
            r5 = move-exception
            goto L6d
        L3c:
            gy r1 = new gy     // Catch: java.lang.Exception -> L3a
            java.lang.Object r3 = r5.o     // Catch: java.lang.Exception -> L3a
            jde r3 = (defpackage.jde) r3     // Catch: java.lang.Exception -> L3a
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Exception -> L3a
            android.os.HandlerThread r3 = (android.os.HandlerThread) r3     // Catch: java.lang.Exception -> L3a
            r1.<init>(r0, r3)     // Catch: java.lang.Exception -> L3a
            r3 = 0
        L4c:
            ay r4 = new ay     // Catch: java.lang.Exception -> L3a
            java.lang.Object r5 = r5.c     // Catch: java.lang.Exception -> L3a
            jde r5 = (defpackage.jde) r5     // Catch: java.lang.Exception -> L3a
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Exception -> L3a
            android.os.HandlerThread r5 = (android.os.HandlerThread) r5     // Catch: java.lang.Exception -> L3a
            r4.<init>(r0, r5, r1)     // Catch: java.lang.Exception -> L3a
            android.os.Trace.endSection()     // Catch: java.lang.Exception -> L68
            android.media.MediaFormat r5 = r6.b     // Catch: java.lang.Exception -> L68
            android.view.Surface r1 = r6.d     // Catch: java.lang.Exception -> L68
            android.media.MediaCrypto r6 = r6.e     // Catch: java.lang.Exception -> L68
            defpackage.ay.p(r4, r5, r1, r6, r3)     // Catch: java.lang.Exception -> L68
            return r4
        L68:
            r5 = move-exception
            r2 = r4
            goto L6d
        L6b:
            r5 = move-exception
            r0 = r2
        L6d:
            if (r2 != 0) goto L75
            if (r0 == 0) goto L78
            r0.release()
            goto L78
        L75:
            r2.release()
        L78:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.td.i(o78):ay");
    }

    @Override // defpackage.qv6
    public ov6 o() {
        Image imageAcquireNextImage;
        synchronized (this.o) {
            try {
                imageAcquireNextImage = ((ImageReader) this.c).acquireNextImage();
            } catch (RuntimeException e) {
                if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                    throw e;
                }
                imageAcquireNextImage = null;
            }
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new rd(imageAcquireNextImage);
        }
    }

    @Override // defpackage.erd
    public void onError(Throwable th) {
        if (this.b) {
            j47.Z(th);
        } else {
            ((erd) this.c).onError(th);
        }
    }

    public void p() {
        this.b = true;
    }

    public void s() {
        isc iscVar = (isc) this.c;
        gh7 gh7VarQ = iscVar.Q();
        if (gh7VarQ.d != fg7.b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        gh7VarQ.a(new fdc(0, iscVar));
        mm mmVar = (mm) this.o;
        if (!(!mmVar.c)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        gh7VarQ.a(new sjc(1, mmVar));
        mmVar.c = true;
        this.b = true;
    }

    public void t(Bundle bundle) {
        if (!this.b) {
            s();
        }
        gh7 gh7VarQ = ((isc) this.c).Q();
        if (!(!gh7VarQ.d.a(fg7.o))) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + gh7VarQ.d).toString());
        }
        mm mmVar = (mm) this.o;
        if (!mmVar.c) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!mmVar.d)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        mmVar.a = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        mmVar.d = true;
    }

    public void u(Bundle bundle) {
        mm mmVar = (mm) this.o;
        mmVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) mmVar.a;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        rqc rqcVar = (rqc) mmVar.f;
        rqcVar.getClass();
        pqc pqcVar = new pqc(rqcVar);
        rqcVar.c.put(pqcVar, Boolean.FALSE);
        while (pqcVar.hasNext()) {
            Map.Entry entry = (Map.Entry) pqcVar.next();
            bundle2.putBundle((String) entry.getKey(), ((hsc) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public void v() {
        if (this.b) {
            ((Context) this.c).unregisterReceiver((k30) this.o);
            this.b = false;
        }
    }

    public synchronized rw4 x() {
        return (rw4) this.c;
    }

    public void y(zjg zjgVar) {
        synchronized (this.o) {
            try {
                if (((ArrayDeque) this.c) == null) {
                    this.c = new ArrayDeque();
                }
                ((ArrayDeque) this.c).add(zjgVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z(Task task) {
        zjg zjgVar;
        synchronized (this.o) {
            if (((ArrayDeque) this.c) != null && !this.b) {
                this.b = true;
                while (true) {
                    synchronized (this.o) {
                        try {
                            zjgVar = (zjg) ((ArrayDeque) this.c).poll();
                            if (zjgVar == null) {
                                this.b = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    zjgVar.b(task);
                }
            }
        }
    }

    public /* synthetic */ td(int i, byte b) {
        this.a = i;
    }

    public /* synthetic */ td(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
    }

    public /* synthetic */ td(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj2;
        this.b = z;
        this.o = obj;
    }

    public td(reg regVar, rw4 rw4Var) {
        this.a = 19;
        this.o = regVar;
        this.b = true;
        this.c = rw4Var;
    }

    public td(fg1 fg1Var, boolean z, zad zadVar) {
        this.a = 17;
        this.c = fg1Var;
        this.b = z;
        this.o = zadVar;
    }

    public td(a4c a4cVar) {
        this.a = 18;
        this.c = new HashMap();
        this.o = a4cVar;
    }

    public td(Context context) {
        Sensor defaultSensor;
        this.a = 11;
        q0e q0eVarA = r0e.a(Float.valueOf(100.0f));
        this.c = q0eVarA;
        this.o = new w7c(q0eVarA);
        SensorManager sensorManager = (SensorManager) lt3.b(context, SensorManager.class);
        if (sensorManager == null || (defaultSensor = sensorManager.getDefaultSensor(5)) == null) {
            return;
        }
        sensorManager.registerListener(new jh7(0, this), defaultSensor, 3, 2500000);
    }

    public td(String str, MediaFormat mediaFormat, yna ynaVar, xef xefVar) throws IOException {
        this.a = 4;
        this.b = false;
        MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(str);
        this.c = mediaCodecCreateDecoderByType;
        hm9.n("td", mediaFormat.toString());
        mediaCodecCreateDecoderByType.configure(mediaFormat, ynaVar.b, (MediaCrypto) null, 0);
        mediaCodecCreateDecoderByType.start();
        this.o = xefVar;
    }

    public td(isc iscVar) {
        this.a = 14;
        this.c = iscVar;
        this.o = new mm();
    }

    public td(Context context, Handler handler, n75 n75Var) {
        this.a = 2;
        this.c = context.getApplicationContext();
        this.o = new k30(this, handler, n75Var, 0);
    }

    public td(Context context, Handler handler, o75 o75Var) {
        this.a = 3;
        this.c = context.getApplicationContext();
        this.o = new k30(this, handler, o75Var, 1);
    }

    public td(ImageReader imageReader) {
        this.a = 0;
        this.o = new Object();
        this.b = true;
        this.c = imageReader;
    }

    public td(xv1 xv1Var) {
        this.a = 6;
        this.c = xv1Var;
        this.o = o9g.x(xv1Var);
        int[] iArr = (int[]) xv1Var.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z = false;
        if (iArr != null) {
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (iArr[i] == 18) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.b = z;
    }

    public td(int i) {
        this.a = 1;
        yx yxVar = new yx(i, 1);
        yx yxVar2 = new yx(i, 3);
        this.c = yxVar;
        this.o = yxVar2;
        this.b = true;
    }

    public td(st1 st1Var, q6d q6dVar) {
        this.a = 7;
        this.b = false;
        this.c = new sh0(6, (byte) 0);
        this.o = q6dVar;
    }

    public td(ii8 ii8Var, oh8 oh8Var, boolean z, k3b k3bVar) {
        this.a = 12;
        this.o = ii8Var;
        this.c = oh8Var;
        this.b = z;
    }
}
