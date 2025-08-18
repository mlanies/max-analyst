package defpackage;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.hardware.fingerprint.FingerprintManager;
import android.media.MediaCodec;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.media3.common.util.GlUtil$GlException;
import androidx.work.WorkRequest;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.CapturerObserver;
import org.webrtc.Size;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public class va8 implements p78, mde, a76, sya, xx4, ry9, erd, f2a, CapturerObserver {
    public static final int[] o = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ va8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void B(Throwable th) {
    }

    private final void D(EGLDisplay eGLDisplay) {
    }

    public void A(AttributeSet attributeSet, int i) {
        ProgressBar progressBar = (ProgressBar) this.b;
        k8g k8gVarX = k8g.x(progressBar.getContext(), attributeSet, o, i, 0);
        Drawable drawableO = k8gVarX.o(0);
        if (drawableO != null) {
            if (drawableO instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableO;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable drawableF = F(animationDrawable.getFrame(i2), true);
                    drawableF.setLevel(10000);
                    animationDrawable2.addFrame(drawableF, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                drawableO = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(drawableO);
        }
        Drawable drawableO2 = k8gVarX.o(1);
        if (drawableO2 != null) {
            progressBar.setProgressDrawable(F(drawableO2, false));
        }
        k8gVarX.z();
    }

    public void C(EGLDisplay eGLDisplay) throws GlUtil$GlException {
        switch (this.a) {
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                int i = 0;
                while (true) {
                    ArrayList arrayList = (ArrayList) this.c;
                    if (i >= arrayList.size()) {
                        break;
                    } else {
                        mr0.s((EGLContext) arrayList.get(i), eGLDisplay);
                        i++;
                    }
                }
        }
    }

    public void E(ConversationEndReason conversationEndReason) {
        if (conversationEndReason == null) {
            return;
        }
        ConversationEndReason conversationEndReason2 = (ConversationEndReason) this.c;
        a4c a4cVar = (a4c) this.b;
        if (conversationEndReason2 == null) {
            this.c = conversationEndReason;
            a4cVar.log("CallEndInfoHolder", "set end reason " + conversationEndReason);
            return;
        }
        a4cVar.log("CallEndInfoHolder", "warning: trying to replace end reason from " + conversationEndReason2 + " to " + conversationEndReason);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable F(Drawable drawable, boolean z) {
        if (drawable instanceof y8g) {
            ((z8g) ((y8g) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = F(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                    layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
                    layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
                    layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
                    layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
                    layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
                    layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
                    layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
                    layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
                    layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.c) == null) {
                    this.c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    @Override // defpackage.a76
    public void a(Object obj) {
        switch (this.a) {
            case 9:
                ((fu1) this.c).x0.remove((sz1) this.b);
                int iS = au1.s(((fu1) this.c).S0);
                if (iS != 1 && iS != 4) {
                    if (iS == 5 || (iS == 6 && ((fu1) this.c).v0 != 0)) {
                        ((fu1) this.c).toString();
                    }
                }
                if (((fu1) this.c).x0.isEmpty()) {
                    fu1 fu1Var = (fu1) this.c;
                    if (fu1Var.u0 != null) {
                        fu1Var.toString();
                        ((fu1) this.c).u0.close();
                        ((fu1) this.c).u0 = null;
                        break;
                    }
                }
                break;
            case 19:
                lq1 lq1Var = (lq1) this.b;
                try {
                    lq1Var.b(((l66) this.c).apply(obj));
                    break;
                } catch (Throwable th) {
                    lq1Var.d(th);
                    return;
                }
            default:
                ((b38) this.c).a(obj);
                break;
        }
    }

    @Override // defpackage.f2a
    public void b() {
        ((f2a) this.b).b();
    }

    @Override // defpackage.erd
    public void c(zl4 zl4Var) {
        switch (this.a) {
            case 23:
                dm4.c((AtomicReference) this.b, zl4Var);
                break;
            default:
                dm4.c((AtomicReference) this.c, zl4Var);
                break;
        }
    }

    @Override // defpackage.a76
    public void d(Throwable th) {
        switch (this.a) {
            case 9:
                break;
            default:
                ((lq1) this.b).d(th);
                break;
        }
    }

    @Override // defpackage.f2a
    public void e(Object obj) {
        ((f2a) this.b).e(obj);
    }

    @Override // defpackage.ry9
    public void f(Executor executor, py9 py9Var) {
        synchronized (((HashMap) this.c)) {
            zm7 zm7Var = (zm7) ((HashMap) this.c).get(py9Var);
            if (zm7Var != null) {
                zm7Var.a.set(false);
            }
            zm7 zm7Var2 = new zm7(executor, py9Var);
            ((HashMap) this.c).put(py9Var, zm7Var2);
            ju0.D().execute(new v05(this, zm7Var, zm7Var2, 10));
        }
    }

    @Override // defpackage.sya
    public mn5 g(long j) {
        Object next;
        Iterator it = ((Set) ((AtomicReference) ((x3c) this.b).Y).get()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((gza) next).a == j) {
                break;
            }
        }
        gza gzaVar = (gza) next;
        return gzaVar == null ? lz4.a : od2.M(new t03(od2.M(new t03(((qn3) ((je7) this.c).getValue()).a(), 4), new dr3(gzaVar, j, null)), 11), new er3(j, null));
    }

    @Override // defpackage.mde
    public Object get() {
        o90 o90Var = (o90) this.b;
        int i = o90Var.c;
        if (i == -1) {
            i = 5;
        }
        int i2 = o90Var.b;
        if (i2 == -1) {
            i2 = 2;
        }
        fa0 fa0Var = (fa0) this.c;
        int i3 = fa0Var.e;
        int i4 = o90Var.e;
        if (i4 != -1) {
            i3 = i4;
        }
        int iF = wmd.F(o90Var.d, i3, i2, fa0Var.d);
        List list = n90.e;
        a8g a8gVar = new a8g();
        a8gVar.a = -1;
        a8gVar.b = -1;
        a8gVar.c = -1;
        a8gVar.o = -1;
        a8gVar.a = Integer.valueOf(i);
        a8gVar.o = Integer.valueOf(i2);
        a8gVar.c = Integer.valueOf(i3);
        a8gVar.b = Integer.valueOf(iF);
        return a8gVar.c();
    }

    @Override // defpackage.xx4
    public Object h() {
        return (q5f) this.b;
    }

    @Override // defpackage.ry9
    public bm7 j() {
        return f8.g(new z16(10, this));
    }

    @Override // defpackage.xx4
    public boolean k(CharSequence charSequence, int i, int i2, b4f b4fVar) {
        if ((b4fVar.c & 4) > 0) {
            return true;
        }
        if (((q5f) this.b) == null) {
            this.b = new q5f(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((kj6) this.c).getClass();
        ((q5f) this.b).setSpan(new c4f(b4fVar), i, i2, 33);
        return true;
    }

    @Override // defpackage.ry9
    public void l(py9 py9Var) {
        synchronized (((HashMap) this.c)) {
            try {
                zm7 zm7Var = (zm7) ((HashMap) this.c).remove(py9Var);
                if (zm7Var != null) {
                    zm7Var.a.set(false);
                    ju0.D().execute(new vs5(this, 11, zm7Var));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public kl1 m(x30 x30Var) {
        kl1 kl1Var;
        Object objI;
        List listT0;
        HashMap map = (HashMap) this.c;
        kl1 kl1Var2 = (kl1) map.get((yad) x30Var.b);
        if (kl1Var2 == null && x30Var.a) {
            kl1Var = null;
        } else {
            if (kl1Var2 == null || (objI = kl1Var2.b) == null) {
                objI = "";
            }
            rpa rpaVar = (rpa) x30Var.c;
            if (rpaVar.l()) {
                objI = rpaVar.i();
            }
            String str = (String) objI;
            Object objValueOf = Boolean.valueOf(kl1Var2 != null ? kl1Var2.c : false);
            rpa rpaVar2 = (rpa) x30Var.o;
            if (rpaVar2.l()) {
                objValueOf = rpaVar2.i();
            }
            boolean zBooleanValue = ((Boolean) objValueOf).booleanValue();
            List list = kl1Var2 != null ? kl1Var2.d : null;
            List list2 = (List) ((rpa) x30Var.X).n();
            Iterable iterable = (List) ((rpa) x30Var.Y).n();
            List list3 = (List) ((rpa) x30Var.Z).n();
            if (list2 != null) {
                listT0 = list2;
            } else {
                Set setH0 = list3 != null ? x53.H0(list3) : wz4.a;
                if (iterable == null) {
                    iterable = nz4.a;
                }
                listT0 = list != null ? x53.t0(x53.s0(list, setH0), iterable) : x53.s0(iterable, setH0);
            }
            Object objValueOf2 = Integer.valueOf(kl1Var2 != null ? kl1Var2.e : 0);
            rpa rpaVar3 = (rpa) x30Var.s0;
            if (rpaVar3.l()) {
                objValueOf2 = rpaVar3.i();
            }
            int iIntValue = ((Number) objValueOf2).intValue();
            Object objI2 = kl1Var2 != null ? kl1Var2.f : null;
            rpa rpaVar4 = (rpa) x30Var.t0;
            if (rpaVar4.l()) {
                objI2 = rpaVar4.i();
            }
            bg1 bg1Var = (bg1) objI2;
            Object objI3 = kl1Var2 != null ? kl1Var2.g : null;
            rpa rpaVar5 = (rpa) x30Var.u0;
            if (rpaVar5.l()) {
                objI3 = rpaVar5.i();
            }
            yad yadVar = (yad) x30Var.b;
            kl1Var = new kl1(iIntValue, bg1Var, yadVar, (Long) objI3, str, listT0, zBooleanValue);
            map.put(yadVar, kl1Var);
        }
        if (kl1Var == null) {
            return null;
        }
        ((id1) this.b).f.onRoomUpdated(new ql1(kl1Var.a, mqd.I(kl1Var)));
        return kl1Var;
    }

    public int n() {
        s23 s23Var = (s23) this.c;
        if (s23Var == null) {
            return 1;
        }
        Context context = s23Var.a;
        FingerprintManager fingerprintManagerC = yk5.c(context);
        if (fingerprintManagerC == null || !yk5.e(fingerprintManagerC)) {
            return 12;
        }
        FingerprintManager fingerprintManagerC2 = yk5.c(context);
        return (fingerprintManagerC2 == null || !yk5.d(fingerprintManagerC2)) ? 11 : 0;
    }

    public void o() {
        HashMap map = (HashMap) this.c;
        List listD0 = x53.D0(map.keySet());
        map.clear();
        Iterator it = listD0.iterator();
        while (it.hasNext()) {
            ((id1) this.b).f.onRoomRemoved(new pl1((yad) it.next()));
        }
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStarted(boolean z) {
        jra jraVar = (jra) this.c;
        jraVar.c.log("PatchedVideoCapturer", "onCapturerStarted");
        CapturerObserver capturerObserver = (CapturerObserver) this.b;
        if (capturerObserver != null) {
            capturerObserver.onCapturerStarted(z);
        }
        jraVar.getClass();
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStopped() {
        jra jraVar = (jra) this.c;
        jraVar.c.log("PatchedVideoCapturer", "onCapturerStopped");
        CapturerObserver capturerObserver = (CapturerObserver) this.b;
        if (capturerObserver != null) {
            capturerObserver.onCapturerStopped();
        }
        jraVar.getClass();
    }

    @Override // defpackage.erd
    public void onError(Throwable th) {
        switch (this.a) {
            case 23:
                ((b38) this.c).onError(th);
                break;
            default:
                ((f2a) this.b).onError(th);
                break;
        }
    }

    @Override // org.webrtc.CapturerObserver
    public void onFrameCaptured(VideoFrame videoFrame) {
        qx1 qx1Var = ((jra) this.c).b;
        qx1Var.b.a();
        qx1Var.c = new Size(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
        if (SystemClock.elapsedRealtime() - qx1Var.d >= WorkRequest.MIN_BACKOFF_MILLIS) {
            qx1Var.a.log("CameraStatCollector", qx1Var.toString());
            qx1Var.d = SystemClock.elapsedRealtime();
        }
        if (((CapturerObserver) this.b) == null) {
            return;
        }
        VideoSink videoSink = ((jra) this.c).Y;
        ((jra) this.c).getClass();
        if (eae.k0(Build.MANUFACTURER, "xiaomi", true) || !(videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer)) {
            if (videoSink != null) {
                videoSink.onFrame(videoFrame);
            }
            ((CapturerObserver) this.b).onFrameCaptured(videoFrame);
        } else {
            VideoFrame videoFrame2 = new VideoFrame(new ymc((VideoFrame.TextureBuffer) videoFrame.getBuffer(), videoFrame.getRotation(), ((jra) this.c).X.getHandler(), ((jra) this.c).o), 0, videoFrame.getTimestampNs());
            if (videoSink != null) {
                videoSink.onFrame(videoFrame2);
            }
            ((CapturerObserver) this.b).onFrameCaptured(videoFrame2);
        }
    }

    @Override // defpackage.p78
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public zx i(n78 n78Var) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        zx zxVar;
        String str = n78Var.a.a;
        zx zxVar2 = null;
        try {
            String strValueOf = String.valueOf(str);
            j47.k(strValueOf.length() != 0 ? "createCodec:".concat(strValueOf) : new String("createCodec:"));
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                zxVar = new zx(mediaCodecCreateByCodecName, (HandlerThread) ((jde) this.b).get(), (HandlerThread) ((jde) this.c).get(), false, true);
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            mediaCodecCreateByCodecName = null;
        }
        try {
            j47.A();
            zx.b(zxVar, n78Var.b, n78Var.d, n78Var.e);
            return zxVar;
        } catch (Exception e3) {
            e = e3;
            zxVar2 = zxVar;
            if (zxVar2 != null) {
                zxVar2.release();
            } else if (mediaCodecCreateByCodecName != null) {
                mediaCodecCreateByCodecName.release();
            }
            throw e;
        }
    }

    public hd6 q(int i, int i2, int i3) throws GlUtil$GlException {
        switch (this.a) {
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                int[] iArr = new int[1];
                GLES20.glGenFramebuffers(1, iArr, 0);
                mr0.f();
                GLES20.glBindFramebuffer(36160, iArr[0]);
                mr0.f();
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
                mr0.f();
                return new hd6(i, iArr[0], i2, i3);
            default:
                return ((va8) this.b).q(i, i2, i3);
        }
    }

    public EGLContext r(EGLDisplay eGLDisplay, int i, int[] iArr) throws GlUtil$GlException {
        switch (this.a) {
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                EGLContext eGLContextM = mr0.m((EGLContext) this.b, eGLDisplay, i, iArr);
                ((ArrayList) this.c).add(eGLContextM);
                return eGLContextM;
            default:
                if (((EGLContext) this.c) == null) {
                    this.c = ((va8) this.b).r(eGLDisplay, i, iArr);
                }
                return (EGLContext) this.c;
        }
    }

    public EGLSurface s(EGLDisplay eGLDisplay, Object obj, int i, boolean z) throws GlUtil$GlException {
        int[] iArr;
        switch (this.a) {
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                int[] iArr2 = mr0.k;
                if (i == 3 || i == 10) {
                    iArr = mr0.g;
                } else {
                    if (i != 7 && i != 6) {
                        throw new IllegalArgumentException(zr6.h(i, "Unsupported color transfer: "));
                    }
                    iArr = mr0.h;
                    if (!z) {
                        if (i == 6) {
                            if (oaf.a < 33 || !mr0.L("EGL_EXT_gl_colorspace_bt2020_pq")) {
                                throw new GlUtil$GlException("BT.2020 PQ OpenGL output isn't supported.");
                            }
                            iArr2 = mr0.i;
                        } else {
                            if (!mr0.L("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                                throw new GlUtil$GlException("BT.2020 HLG OpenGL output isn't supported.");
                            }
                            iArr2 = mr0.j;
                        }
                    }
                }
                EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, mr0.B(eGLDisplay, iArr), obj, iArr2, 0);
                mr0.e("Error creating a new EGL surface");
                return eGLSurfaceEglCreateWindowSurface;
            default:
                return ((va8) this.b).s(eGLDisplay, obj, i, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0062, code lost:
    
        r8 = r7.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0063, code lost:
    
        if (r2 >= r8) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0065, code lost:
    
        r1 = r7[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006b, code lost:
    
        if (defpackage.tpa.f(r1, r4) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006d, code lost:
    
        r1.release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0070, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0073, code lost:
    
        if (r4 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007b, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        return new defpackage.ta8(r4, r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.ta8 t(android.net.Uri r8) {
        /*
            r7 = this;
            sa8 r0 = new sa8
            java.lang.Object r7 = r7.b
            android.content.Context r7 = (android.content.Context) r7
            r0.<init>(r7, r8)
            va4 r7 = new va4
            r7.<init>()
            monitor-enter(r7)
            r8 = 1
            r7.b = r8     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r7)
            monitor-enter(r7)
            r1 = 6
            r7.c = r1     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r7)
            t24 r1 = r0.a
            android.net.Uri r1 = r1.getUri()
            if (r1 == 0) goto L80
            oz4 r2 = defpackage.oz4.a
            la5[] r7 = r7.b(r1, r2)
            int r1 = r7.length
            r2 = 0
            if (r1 != r8) goto L32
            ta8 r8 = new ta8
            r7 = r7[r2]
            r8.<init>(r7, r0)
            goto L7f
        L32:
            int r8 = r7.length
            r1 = r2
        L34:
            r3 = 0
            if (r1 >= r8) goto L61
            r4 = r7[r1]
            sa4 r5 = r0.b     // Catch: java.lang.Throwable -> L54
            if (r5 == 0) goto L48
            boolean r5 = r4.n(r5)     // Catch: java.lang.Throwable -> L54
            sa4 r6 = r0.b
            if (r6 == 0) goto L5b
            r6.Y = r2
            goto L5b
        L48:
            java.lang.String r5 = "Required value was null."
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L54
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L54
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L54
            throw r6     // Catch: java.lang.Throwable -> L54
        L54:
            sa4 r5 = r0.b
            if (r5 == 0) goto L5a
            r5.Y = r2
        L5a:
            r5 = r2
        L5b:
            if (r5 == 0) goto L5e
            goto L62
        L5e:
            int r1 = r1 + 1
            goto L34
        L61:
            r4 = r3
        L62:
            int r8 = r7.length
        L63:
            if (r2 >= r8) goto L73
            r1 = r7[r2]
            boolean r5 = defpackage.tpa.f(r1, r4)
            if (r5 != 0) goto L70
            r1.release()
        L70:
            int r2 = r2 + 1
            goto L63
        L73:
            if (r4 == 0) goto L7b
            ta8 r8 = new ta8
            r8.<init>(r4, r0)
            goto L7f
        L7b:
            r0.close()
            r8 = r3
        L7f:
            return r8
        L80:
            java.lang.String r7 = "Required value was null."
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L8c:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L8c
            throw r8
        L8f:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L8f
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.va8.t(android.net.Uri):ta8");
    }

    public EGLSurface u(EGLContext eGLContext, EGLDisplay eGLDisplay) {
        switch (this.a) {
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                break;
            default:
                ((va8) this.b).getClass();
                break;
        }
        return mr0.o(eGLContext, eGLDisplay);
    }

    public CctBackendFactory v(String str) {
        Map mapEmptyMap;
        PackageManager packageManager;
        ServiceInfo serviceInfo;
        if (((Map) this.c) == null) {
            Context context = (Context) this.b;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
            }
            Bundle bundle = (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128)) == null) ? null : serviceInfo.metaData;
            if (bundle == null) {
                mapEmptyMap = Collections.emptyMap();
            } else {
                HashMap map = new HashMap();
                for (String str2 : bundle.keySet()) {
                    Object obj = bundle.get(str2);
                    if ((obj instanceof String) && str2.startsWith("backend:")) {
                        for (String str3 : ((String) obj).split(",", -1)) {
                            String strTrim = str3.trim();
                            if (!strTrim.isEmpty()) {
                                map.put(strTrim, str2.substring(8));
                            }
                        }
                    }
                }
                mapEmptyMap = map;
            }
            this.c = mapEmptyMap;
        }
        String str4 = (String) ((Map) this.c).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException unused2) {
            StringBuilder sb = new StringBuilder("Class ");
            sb.append(str4);
            sb.append(" is not found.");
            return null;
        } catch (IllegalAccessException unused3) {
            StringBuilder sb2 = new StringBuilder("Could not instantiate ");
            sb2.append(str4);
            sb2.append(".");
            return null;
        } catch (InstantiationException unused4) {
            StringBuilder sb3 = new StringBuilder("Could not instantiate ");
            sb3.append(str4);
            sb3.append(".");
            return null;
        } catch (NoSuchMethodException unused5) {
            "Could not instantiate ".concat(str4);
            return null;
        } catch (InvocationTargetException unused6) {
            "Could not instantiate ".concat(str4);
            return null;
        }
    }

    public LinkedHashSet w() {
        LinkedHashSet linkedHashSet;
        synchronized (this.b) {
            linkedHashSet = new LinkedHashSet(((LinkedHashMap) this.c).values());
        }
        return linkedHashSet;
    }

    public tad x(yad yadVar) {
        kl1 kl1Var = (kl1) ((HashMap) this.c).get(yadVar);
        if (kl1Var != null) {
            return mqd.I(kl1Var);
        }
        return null;
    }

    public void y(JSONObject jSONObject) {
        jz6 jz6Var;
        w4d w4dVar = (w4d) this.c;
        w4dVar.getClass();
        try {
            jz6Var = new jz6(f46.E(jSONObject), jSONObject.getString("message"), jSONObject.getBoolean("direct"));
        } catch (JSONException e) {
            ((a4c) w4dVar.b).logException("ChatParser", "Can't parse chat message", e);
            jz6Var = null;
        }
        if (jz6Var == null) {
            return;
        }
        ((md2) this.b).onNewMessage(jz6Var);
    }

    public void z(yg2 yg2Var) {
        synchronized (this.b) {
            try {
                yg2Var.getClass();
                for (String str : new LinkedHashSet((ArrayList) yg2Var.g)) {
                    ((LinkedHashMap) this.c).put(str, yg2Var.e(str));
                }
            } catch (CameraUnavailableException e) {
                throw new InitializationException(e);
            }
        }
    }

    public /* synthetic */ va8(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ va8(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public va8(id1 id1Var) {
        this.a = 8;
        this.b = id1Var;
        this.c = new HashMap();
    }

    public va8(il ilVar, Object obj) {
        this.a = 3;
        this.b = obj;
        this.c = ilVar.a;
    }

    public va8(qz7 qz7Var) {
        this.a = 21;
        this.b = (HashMap) qz7Var.b;
        this.c = (ArrayList) qz7Var.c;
    }

    public va8(Context context, int i) {
        this.a = i;
        switch (i) {
            case 25:
                this.c = null;
                this.b = context;
                break;
            default:
                this.b = context.getApplicationContext();
                this.c = va8.class.getName();
                break;
        }
    }

    public va8(int i, byte b) {
        this.a = i;
        switch (i) {
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                this.b = EGL14.EGL_NO_CONTEXT;
                this.c = new ArrayList();
                break;
            case 22:
                this.b = new ci9();
                this.c = new HashMap();
                break;
            case 26:
                this.b = new va8(15, (byte) 0);
                break;
            default:
                this.b = new Object();
                this.c = new LinkedHashMap();
                new HashSet();
                break;
        }
    }

    public va8(int i) {
        this.a = 4;
        yx yxVar = new yx(i, 0);
        yx yxVar2 = new yx(i, 2);
        this.b = yxVar;
        this.c = yxVar2;
    }

    public va8(MediaCodec.CryptoInfo cryptoInfo) {
        this.a = 14;
        this.b = cryptoInfo;
        this.c = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public va8(x8f x8fVar) {
        this.a = 17;
        nz4 nz4Var = nz4.a;
        this.b = x8fVar;
        this.c = nz4Var;
    }

    public va8(lq1 lq1Var) {
        this.a = 19;
        g76 g76Var = kq0.g;
        this.b = lq1Var;
        this.c = g76Var;
    }

    public va8(ArrayList arrayList, ArrayList arrayList2) {
        this.a = 20;
        int size = arrayList.size();
        this.b = new int[size];
        this.c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public va8(int i, int i2) {
        this.a = 20;
        this.b = new int[]{i, i2};
        this.c = new float[]{0.0f, 1.0f};
    }

    public va8(int i, int i2, int i3) {
        this.a = 20;
        this.b = new int[]{i, i2, i3};
        this.c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public va8(bn0 bn0Var) {
        this.a = 6;
        int i = Build.VERSION.SDK_INT;
        Context context = bn0Var.a;
        this.b = zm0.b(context);
        this.c = i <= 29 ? new s23(context) : null;
    }

    public va8(w98 w98Var, Looper looper) {
        this.a = 24;
        this.c = w98Var;
        this.b = new Handler(looper, new hl4(4, this));
    }
}
