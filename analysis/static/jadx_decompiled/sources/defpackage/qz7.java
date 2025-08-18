package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.CameraVideoCapturer;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;

/* loaded from: classes2.dex */
public final class qz7 implements qfd, pv1, CameraVideoCapturer.CameraSwitchHandler, ej5, vg1, zpa, l3a, ke7, bqd {
    public static final xw0 o = new xw0(19);
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ qz7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static qz7 g(Context context) throws IOException {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new qz7(channel, 14, fileLockLock);
                } catch (IOException | Error | OverlappingFileLockException unused) {
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused2) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException unused4) {
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException unused5) {
            channel = null;
            fileLockLock = null;
        }
    }

    @Override // defpackage.pv1
    public mv1 A() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.CONTROL_AF_STATE);
        mv1 mv1Var = mv1.a;
        if (num == null) {
            return mv1Var;
        }
        switch (num.intValue()) {
        }
        return mv1Var;
    }

    @Override // defpackage.qfd
    public void B(long j) {
        ((m56) this.c).invoke(Long.valueOf(j));
    }

    public void C(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.f0().o.C(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            c16 c16Var = (c16) it.next();
            if (!z || c16Var.b) {
                c16Var.a.getClass();
            }
        }
    }

    public void D(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.f0().o.D(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            c16 c16Var = (c16) it.next();
            if (!z || c16Var.b) {
                c16Var.a.getClass();
            }
        }
    }

    public void E(a aVar, boolean z) {
        c cVar = (c) this.b;
        Context context = cVar.w.u0;
        a aVar2 = cVar.y;
        if (aVar2 != null) {
            aVar2.f0().o.E(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            c16 c16Var = (c16) it.next();
            if (!z || c16Var.b) {
                c16Var.a.getClass();
            }
        }
    }

    public void F(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.f0().o.F(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            c16 c16Var = (c16) it.next();
            if (!z || c16Var.b) {
                c16Var.a.getClass();
            }
        }
    }

    public void G(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.f0().o.G(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            c16 c16Var = (c16) it.next();
            if (!z || c16Var.b) {
                c16Var.a.getClass();
            }
        }
    }

    public void H(a aVar, Bundle bundle, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.f0().o.H(aVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            c16 c16Var = (c16) it.next();
            if (!z || c16Var.b) {
                c16Var.a.getClass();
            }
        }
    }

    public void I(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.f0().o.I(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            c16 c16Var = (c16) it.next();
            if (!z || c16Var.b) {
                c16Var.a.getClass();
            }
        }
    }

    public void J(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.f0().o.J(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            c16 c16Var = (c16) it.next();
            if (!z || c16Var.b) {
                c16Var.a.getClass();
            }
        }
    }

    public void K(a aVar, View view, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.f0().o.K(aVar, view, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            c16 c16Var = (c16) it.next();
            if (!z || c16Var.b) {
                jo7 jo7Var = c16Var.a;
                c cVar = (c) this.b;
                if (aVar == ((a) jo7Var.a)) {
                    qz7 qz7Var = cVar.o;
                    synchronized (((CopyOnWriteArrayList) qz7Var.c)) {
                        int size = ((CopyOnWriteArrayList) qz7Var.c).size();
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                break;
                            }
                            if (((c16) ((CopyOnWriteArrayList) qz7Var.c).get(i)).a == jo7Var) {
                                ((CopyOnWriteArrayList) qz7Var.c).remove(i);
                                break;
                            }
                            i++;
                        }
                    }
                    vd8 vd8Var = (vd8) jo7Var.c;
                    FrameLayout frameLayout = (FrameLayout) jo7Var.b;
                    vd8Var.getClass();
                    vd8.C(view, frameLayout);
                } else {
                    continue;
                }
            }
        }
    }

    public void L(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.f0().o.L(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            c16 c16Var = (c16) it.next();
            if (!z || c16Var.b) {
                c16Var.a.getClass();
            }
        }
    }

    public int M() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.CONTROL_AE_MODE);
        if (num == null) {
            return 1;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return 2;
        }
        if (iIntValue == 1) {
            return 3;
        }
        if (iIntValue == 2) {
            return 4;
        }
        if (iIntValue == 3) {
            return 5;
        }
        if (iIntValue != 4) {
            return iIntValue != 5 ? 1 : 7;
        }
        return 6;
    }

    public int N() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return 1;
        }
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            if (iIntValue == 1 || iIntValue == 2) {
                return 3;
            }
            if (iIntValue == 3 || iIntValue == 4) {
                return 4;
            }
            if (iIntValue != 5) {
                return 1;
            }
        }
        return 2;
    }

    public int O() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.CONTROL_AWB_MODE);
        if (num == null) {
            return 1;
        }
        switch (num.intValue()) {
        }
        return 1;
    }

    public f98 P() {
        MediaController.PlaybackInfo playbackInfo = ((e98) this.b).a.getPlaybackInfo();
        if (playbackInfo != null) {
            return new f98(playbackInfo.getPlaybackType(), new j30(new i30(playbackInfo.getAudioAttributes())), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }
        return null;
    }

    public i3b Q() {
        e98 e98Var = (e98) this.b;
        pr6 pr6VarA = e98Var.e.a();
        if (pr6VarA != null) {
            try {
                return pr6VarA.getPlaybackState();
            } catch (RemoteException unused) {
            }
        }
        PlaybackState playbackState = e98Var.a.getPlaybackState();
        if (playbackState != null) {
            return i3b.a(playbackState);
        }
        return null;
    }

    public h98 R() {
        return new h98(((e98) this.b).a.getTransportControls());
    }

    public fpd S(JSONObject jSONObject, zad zadVar) {
        eqa eqaVar;
        try {
            jSONObject.optBoolean("markerFound");
            jSONObject.optInt("countBefore");
            jSONObject.optInt("countAfter");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("participants");
            if (jSONArrayOptJSONArray != null) {
                eqaVar = ((die) this.c).H(jSONArrayOptJSONArray, zadVar);
            } else {
                nz4 nz4Var = nz4.a;
                eqaVar = new eqa(nz4Var, nz4Var);
            }
            return new fpd(eqaVar);
        } catch (JSONException e) {
            ((a4c) this.b).logException("ParticipantListChunkParser", "Can't parse participant chunk", e);
            return null;
        }
    }

    @Override // defpackage.vg1
    public void T(float f, float f2) {
        Context context;
        cb5 cb5Var = (cb5) this.b;
        xg1 xg1Var = cb5Var.g;
        WindowManager windowManagerZ = null;
        ViewGroup.LayoutParams layoutParams = xg1Var != null ? xg1Var.getLayoutParams() : null;
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.x = (int) f;
            layoutParams2.y = (int) f2;
        } else {
            layoutParams2 = null;
        }
        xg1 xg1Var2 = (xg1) this.c;
        hm9.n("FakePipController", "update call local pip");
        if (layoutParams2 == null) {
            hm9.n("FakePipController", "update call local pip was skip due to layout params are null");
            return;
        }
        try {
            xg1 xg1Var3 = cb5Var.g;
            if (xg1Var3 != null && (context = xg1Var3.getContext()) != null) {
                windowManagerZ = nd7.z(context);
            }
            if (windowManagerZ != null) {
                windowManagerZ.updateViewLayout(xg1Var2, layoutParams2);
            }
        } catch (IllegalArgumentException e) {
            hm9.p("FakePipController", "can't update call local pip", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x0223, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void U(android.content.Context r12, android.content.res.XmlResourceParser r13) throws org.xmlpull.v1.XmlPullParserException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qz7.U(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public void V() throws IOException {
        try {
            ((FileLock) this.c).release();
            ((FileChannel) this.b).close();
        } catch (IOException unused) {
        }
    }

    public void W(ja8 ja8Var) {
        e98 e98Var = (e98) this.b;
        if ((e98Var.a.getFlags() & 4) == 0) {
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION, mf7.a(ja8Var, MediaDescriptionCompat.CREATOR));
        e98Var.a.sendCommand(MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM, bundle, null);
    }

    public void X(int i, int i2, int i3, int i4) {
        CardView cardView = (CardView) this.c;
        cardView.o.set(i, i2, i3, i4);
        Rect rect = cardView.c;
        super/*android.view.View*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    public yze Y(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = (int[]) this.b;
            if (i2 >= iArr.length) {
                z04.u("Unmatched track of type: " + i);
                return new sk4();
            }
            if (i == iArr[i2]) {
                return ((erc[]) this.c)[i2];
            }
            i2++;
        }
    }

    @Override // defpackage.zpa
    public Object a(Uri uri, w24 w24Var) {
        ok5 ok5Var = (ok5) ((zpa) this.b).a(uri, w24Var);
        List list = (List) this.c;
        return (list == null || list.isEmpty()) ? ok5Var : (ok5) ok5Var.a(list);
    }

    @Override // defpackage.pv1
    public void b(t55 t55Var) {
        CaptureResult captureResult = (CaptureResult) this.c;
        super.b(t55Var);
        try {
            Integer num = (Integer) captureResult.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                t55Var.d(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
        }
        Long l = (Long) captureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        ArrayList arrayList = t55Var.a;
        if (l != null) {
            t55Var.c("ExposureTime", String.valueOf(l.longValue() / TimeUnit.SECONDS.toNanos(1L)), arrayList);
        }
        Float f = (Float) captureResult.get(CaptureResult.LENS_APERTURE);
        if (f != null) {
            t55Var.c("FNumber", String.valueOf(f.floatValue()), arrayList);
        }
        Integer numValueOf = (Integer) captureResult.get(CaptureResult.SENSOR_SENSITIVITY);
        if (numValueOf != null) {
            if (((Integer) captureResult.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                numValueOf = Integer.valueOf(numValueOf.intValue() * ((int) (r2.intValue() / 100.0f)));
            }
            int iIntValue = numValueOf.intValue();
            t55Var.c("SensitivityType", String.valueOf(3), arrayList);
            t55Var.c("PhotographicSensitivity", String.valueOf(Math.min(65535, iIntValue)), arrayList);
        }
        Float f2 = (Float) captureResult.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f2 != null) {
            t55Var.c("FocalLength", ((long) (f2.floatValue() * 1000.0f)) + "/1000", arrayList);
        }
        Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AWB_MODE);
        if (num2 != null) {
            int iS = au1.s(num2.intValue() == 0 ? 2 : 1);
            t55Var.c("WhiteBalance", iS != 0 ? iS != 1 ? null : String.valueOf(1) : String.valueOf(0), arrayList);
        }
    }

    @Override // defpackage.pv1
    public nje c() {
        return (nje) this.b;
    }

    @Override // defpackage.dqd
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    @Override // defpackage.qfd
    public void e(long j, boolean z) {
        ((a66) this.b).invoke(Long.valueOf(j), Boolean.valueOf(z));
    }

    @Override // defpackage.ej5
    public void f(File file) {
        m94 m94VarG = o94.g((o94) this.c, file);
        if (m94VarG == null || m94VarG.b != ".cnt") {
            return;
        }
        ((ArrayList) this.b).add(new l94(file, m94VarG.c));
    }

    @Override // defpackage.ke7
    public Object get() {
        Object obj = this.c;
        if (obj != null) {
            return obj;
        }
        Object obj2 = ((lde) this.b).get();
        this.c = obj2;
        return obj2;
    }

    @Override // defpackage.pv1
    public long getTimestamp() {
        Long l = (Long) ((CaptureResult) this.c).get(CaptureResult.SENSOR_TIMESTAMP);
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    public void h(Object obj, String str) {
        ((ArrayList) this.b).add(rh4.j(str, "=", String.valueOf(obj)));
    }

    @Override // defpackage.dqd
    public boolean isEmpty() {
        return ((le9) ((AtomicReference) this.c).get()) == ((le9) ((AtomicReference) this.b).get());
    }

    @Override // defpackage.ej5
    public void j(File file) {
    }

    @Override // defpackage.l3a
    public void l(Task task) {
        boolean zH = task.h();
        Continuation continuation = (Continuation) this.c;
        xe6 xe6Var = (xe6) this.b;
        if (!zH) {
            hm9.p(xe6Var.b, "Fetching FCM registration token failed", task.e());
            continuation.resumeWith(null);
            return;
        }
        Object objF = task.f();
        if (objF == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        hm9.n(xe6Var.b, "FCM token fetched");
        continuation.resumeWith((String) objF);
    }

    @Override // defpackage.ej5
    public void m(File file) {
    }

    public void o(ou6 ou6Var, nu6 nu6Var, lu6 lu6Var) {
        if (((ArrayList) this.c) == null) {
            this.c = new ArrayList();
        }
        ((ArrayList) this.c).add(nu6Var);
        if (((HashMap) this.b) == null) {
            this.b = new HashMap();
        }
        ((HashMap) this.b).put(ou6Var, lu6Var);
    }

    @Override // defpackage.dqd
    public boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        le9 le9Var = new le9();
        le9Var.a = obj;
        ((le9) ((AtomicReference) this.b).getAndSet(le9Var)).lazySet(le9Var);
        return true;
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
    public void onCameraSwitchDone(boolean z) {
        tv1 tv1Var = (tv1) this.c;
        String str = (String) this.b;
        tv1Var.e.log("CameraCapturerAdapter", "onCameraSwitchDone, new camera: " + str + ", is front: " + z);
        synchronized (tv1Var.g) {
            tv1Var.h = str;
            tv1Var.i = z;
            tv1Var.j = false;
        }
        Iterator it = tv1Var.f.iterator();
        while (it.hasNext()) {
            ((kq7) it.next()).i(tv1Var, true);
        }
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
    public void onCameraSwitchError(String str) {
        tv1 tv1Var = (tv1) this.c;
        tv1Var.e.reportException("CameraCapturerAdapter", "Error on camera switch", new IllegalStateException(wg0.i("onCameraSwitchError, ", str)));
        synchronized (tv1Var.g) {
            tv1Var.j = false;
        }
        Iterator it = tv1Var.f.iterator();
        while (it.hasNext()) {
            ((kq7) it.next()).i(tv1Var, false);
        }
    }

    public void p(ja8 ja8Var, int i) {
        e98 e98Var = (e98) this.b;
        if ((e98Var.a.getFlags() & 4) == 0) {
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION, mf7.a(ja8Var, MediaDescriptionCompat.CREATOR));
        bundle.putInt(MediaControllerCompat.COMMAND_ARGUMENT_INDEX, i);
        e98Var.a.sendCommand(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM_AT, bundle, null);
    }

    @Override // defpackage.dqd
    public Object poll() {
        le9 le9Var;
        AtomicReference atomicReference = (AtomicReference) this.c;
        le9 le9Var2 = (le9) atomicReference.get();
        le9 le9Var3 = (le9) le9Var2.get();
        if (le9Var3 != null) {
            Object obj = le9Var3.a;
            le9Var3.a = null;
            atomicReference.lazySet(le9Var3);
            return obj;
        }
        if (le9Var2 == ((le9) ((AtomicReference) this.b).get())) {
            return null;
        }
        do {
            le9Var = (le9) le9Var2.get();
        } while (le9Var == null);
        Object obj2 = le9Var.a;
        le9Var.a = null;
        atomicReference.lazySet(le9Var);
        return obj2;
    }

    public void q(n54 n54Var) {
        synchronized (n54Var) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new q60(this, n54Var, 1));
        }
    }

    @Override // defpackage.pv1
    public nv1 r() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.CONTROL_AWB_STATE);
        nv1 nv1Var = nv1.a;
        if (num == null) {
            return nv1Var;
        }
        int iIntValue = num.intValue();
        return iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? nv1Var : nv1.X : nv1.o : nv1.c : nv1.b;
    }

    @Override // defpackage.pv1
    public int s() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return 1;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0 || iIntValue == 1) {
            return 2;
        }
        if (iIntValue != 2) {
            return (iIntValue == 3 || iIntValue == 4) ? 4 : 1;
        }
        return 3;
    }

    public void t(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.f0().o.t(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            c16 c16Var = (c16) it.next();
            if (!z || c16Var.b) {
                c16Var.a.getClass();
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 28:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.c.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(a aVar, boolean z) {
        c cVar = (c) this.b;
        Context context = cVar.w.u0;
        a aVar2 = cVar.y;
        if (aVar2 != null) {
            aVar2.f0().o.u(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            c16 c16Var = (c16) it.next();
            if (!z || c16Var.b) {
                c16Var.a.getClass();
            }
        }
    }

    @Override // defpackage.pv1
    public lv1 v() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.CONTROL_AE_STATE);
        lv1 lv1Var = lv1.a;
        if (num == null) {
            return lv1Var;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return lv1.b;
        }
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                return lv1.X;
            }
            if (iIntValue == 3) {
                return lv1.Y;
            }
            if (iIntValue == 4) {
                return lv1.o;
            }
            if (iIntValue != 5) {
                return lv1Var;
            }
        }
        return lv1.c;
    }

    public void w(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.f0().o.w(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            c16 c16Var = (c16) it.next();
            if (!z || c16Var.b) {
                c16Var.a.getClass();
            }
        }
    }

    public void x(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.f0().o.x(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            c16 c16Var = (c16) it.next();
            if (!z || c16Var.b) {
                c16Var.a.getClass();
            }
        }
    }

    @Override // defpackage.pv1
    public CaptureResult y() {
        return (CaptureResult) this.c;
    }

    @Override // defpackage.vg1
    public PointF z() {
        xg1 xg1Var = ((cb5) this.b).g;
        ViewGroup.LayoutParams layoutParams = xg1Var != null ? xg1Var.getLayoutParams() : null;
        return (layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null) != null ? new PointF(r1.x, r1.y) : dy7.y(((xg1) this.c).getContext());
    }

    public /* synthetic */ qz7(int i, boolean z) {
        this.a = i;
    }

    public qz7(EditText editText, boolean z) {
        this.a = 17;
        this.b = editText;
        qy4 qy4Var = new qy4(editText, z);
        this.c = qy4Var;
        editText.addTextChangedListener(qy4Var);
        if (cx4.b == null) {
            synchronized (cx4.a) {
                try {
                    if (cx4.b == null) {
                        cx4 cx4Var = new cx4();
                        try {
                            cx4.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, cx4.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        cx4.b = cx4Var;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(cx4.b);
    }

    public /* synthetic */ qz7(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public qz7(tv1 tv1Var, String str) {
        this.a = 10;
        this.c = tv1Var;
        this.b = str;
    }

    public qz7(bg4 bg4Var, qld qldVar, bi biVar, kad kadVar) {
        this.a = 1;
        this.b = biVar;
        this.c = o;
    }

    public qz7(d4c d4cVar, CallAnalyticsSender callAnalyticsSender) {
        this.a = 7;
        this.b = d4cVar;
        this.c = callAnalyticsSender;
        callAnalyticsSender.setIdle(false);
    }

    public /* synthetic */ qz7(Object obj) {
        this.a = 28;
        fp3.n(obj);
        this.c = obj;
        this.b = new ArrayList();
    }

    public qz7(String str, z04 z04Var, pq9 pq9Var) {
        this.a = 3;
        this.b = str;
        this.c = z04Var;
    }

    public qz7(je7 je7Var) {
        this.a = 0;
        this.b = qz7.class.getName();
        this.c = je7Var;
    }

    public qz7(c cVar) {
        this.a = 20;
        this.b = cVar;
        this.c = new CopyOnWriteArrayList();
    }

    public qz7(Context context, ai8 ai8Var) {
        this.a = 25;
        if (ai8Var != null) {
            this.c = Collections.synchronizedSet(new HashSet());
            this.b = new e98(context, ai8Var);
            return;
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public qz7(o94 o94Var) {
        this.a = 15;
        this.c = o94Var;
        this.b = new ArrayList();
    }

    public qz7(int i) {
        this.a = i;
        switch (i) {
            case 27:
                AtomicReference atomicReference = new AtomicReference();
                this.b = atomicReference;
                AtomicReference atomicReference2 = new AtomicReference();
                this.c = atomicReference2;
                le9 le9Var = new le9();
                atomicReference2.lazySet(le9Var);
                break;
            default:
                this.b = new AtomicBoolean(false);
                break;
        }
    }

    public qz7(CardView cardView) {
        this.a = 11;
        this.c = cardView;
    }
}
