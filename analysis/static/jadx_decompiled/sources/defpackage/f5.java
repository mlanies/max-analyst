package defpackage;

import android.graphics.Path;
import android.graphics.Rect;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.util.ArrayMap;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.fragment.app.a;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import com.my.tracker.campaign.CampaignService;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import org.json.JSONObject;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.PeerConnectionFactory;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextException;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextGLException;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class f5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ f5(o05 o05Var, int i, String str, Throwable th) {
        this.a = 28;
        this.b = o05Var;
        this.c = str;
        this.o = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nv4 nv4Var;
        Rect rect;
        Iterator it;
        char c;
        char c2;
        char c3;
        AbstractMap.SimpleEntry simpleEntry;
        Rect rect2;
        Iterator it2;
        Iterator it3;
        char c4 = 6;
        char c5 = 5;
        switch (this.a) {
            case 0:
                g5 g5Var = (g5) this.b;
                g5Var.getClass();
                HashSet hashSet = ActAttachesView.z1;
                g5Var.c.k0((a) this.c, (es8) this.o);
                return;
            case 1:
                qz7 qz7Var = (qz7) this.b;
                qz7Var.getClass();
                int i = oaf.a;
                u75 u75Var = ((o75) qz7Var.c).a;
                u75Var.getClass();
                i74 i74Var = u75Var.D0;
                fd fdVarF = i74Var.F();
                i74Var.I(fdVarF, 1009, new x64(fdVarF, (qy5) this.c, (s54) this.o, 1));
                return;
            case 2:
                ph4 ph4Var = (ph4) this.b;
                ph4Var.getClass();
                int i2 = maf.a;
                n75 n75Var = (n75) ph4Var.b;
                n75Var.getClass();
                t75 t75Var = n75Var.a;
                t75Var.getClass();
                h74 h74Var = t75Var.C0;
                ed edVarP = h74Var.P();
                h74Var.Q(edVarP, 1009, new yv3(edVarP, (oy5) this.c, (r54) this.o));
                return;
            case 3:
                e70 e70Var = (e70) this.b;
                int iS = au1.s(e70Var.g);
                if (iS == 0) {
                    e70Var.j = (Executor) this.c;
                    e70Var.k = (l7b) this.o;
                    return;
                } else {
                    if (iS == 1 || iS == 2) {
                        throw new AssertionError("The audio recording callback must be registered before the audio source is started.");
                    }
                    return;
                }
            case 4:
                ((qt0) this.b).g.a((ey1) this.c, (q6d) ((Executor) this.o));
                return;
            case 5:
                ww0 ww0Var = (ww0) this.c;
                g05 g05Var = (g05) this.o;
                du0 du0Var = (du0) this.b;
                rxd rxdVar = du0Var.g;
                try {
                    du0Var.f(ww0Var, g05Var);
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        rxdVar.d0(ww0Var, g05Var);
                        g05.d(g05Var);
                    }
                }
            case 6:
                py0 py0Var = (py0) this.b;
                qld qldVar = (qld) this.c;
                String str = (String) this.o;
                py0Var.getClass();
                try {
                    PeerConnectionFactory peerConnectionFactory = qldVar.d;
                    if (peerConnectionFactory == null) {
                        return;
                    }
                    peerConnectionFactory.submitDumpRequest(str, Integer.MAX_VALUE, null);
                    return;
                } catch (Throwable th2) {
                    py0Var.V0.logException("OKRTCCall", "Error starting local audio dump", th2);
                    return;
                }
            case 7:
                w51 w51Var = (w51) this.c;
                Object obj = this.o;
                py0 py0Var2 = (py0) this.b;
                Iterator it4 = py0Var2.M0.iterator();
                while (it4.hasNext()) {
                    try {
                        ((my0) it4.next()).onEvent(py0Var2, w51Var, obj);
                    } catch (Throwable th3) {
                        py0Var2.V0.logException("OKRTCCall", "Error on dispatch event " + w51Var, th3);
                    }
                }
                return;
            case 8:
                py0 py0Var3 = (py0) this.b;
                bg1 bg1Var = (bg1) this.c;
                JSONObject jSONObject = (JSONObject) this.o;
                ly0 ly0Var = py0Var3.w1;
                if (ly0Var != null) {
                    ly0Var.onCustomData(bg1Var, jSONObject);
                    return;
                }
                return;
            case 9:
                me1 me1Var = (me1) this.b;
                a4c a4cVar = me1Var.a;
                String str2 = me1Var.j;
                a4cVar.log(str2, "Initialize OpenGL context on openGL thread");
                EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
                if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
                    a4cVar.log(str2, "No default display found, will not initialize");
                    return;
                }
                int[] iArr = new int[2];
                if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
                    throw new CallOpenGLContext$CallOpenGLContextGLException(EGL14.eglGetError(), "Unable to initialize EGL14");
                }
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                if (!EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, (int[]) this.c, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
                    throw new CallOpenGLContext$CallOpenGLContextGLException(EGL14.eglGetError(), "getEglConfig()");
                }
                if (iArr2[0] <= 0) {
                    throw new CallOpenGLContext$CallOpenGLContextException("No valid OpenGL context present, can not continue");
                }
                EGLConfig eGLConfig = eGLConfigArr[0];
                if (eGLConfig == null) {
                    throw new CallOpenGLContext$CallOpenGLContextException("Returned matching OpenGL context is null");
                }
                EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfig, (EGLContext) this.o, new int[]{12440, EglBase.getOpenGlesVersionFromConfig(EglBase.CONFIG_PLAIN), 12344}, 0);
                if (eGLContextEglCreateContext == EGL14.EGL_NO_CONTEXT) {
                    throw new CallOpenGLContext$CallOpenGLContextGLException(EGL14.eglGetError(), "Failed to create EGL context");
                }
                me1Var.d = eGLContextEglCreateContext;
                me1Var.e = eGLDisplayEglGetDisplay;
                me1Var.f = eGLConfig;
                return;
            case 10:
                AppCompatTextView appCompatTextView = (AppCompatTextView) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                appCompatTextView.setText(charSequence);
                appCompatTextView.setVisibility((charSequence == null || w9e.C0(charSequence)) ^ true ? 0 : 8);
                ((dm1) this.o).x();
                return;
            case 11:
                CallsAudioManagerV3Impl.reportAudioDeviceOnMainThread$lambda$9((CallsAudioManagerV3Impl) this.b, (CallsAudioDeviceInfo) this.c, (CallsAudioManager.OnAudioDeviceInfoChangeListener) this.o);
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                pt1 pt1Var = ((st1) this.b).z;
                HashSet hashSet2 = (HashSet) pt1Var.b;
                iv1 iv1Var = (iv1) this.o;
                hashSet2.add(iv1Var);
                ((ArrayMap) pt1Var.c).put(iv1Var, (Executor) this.c);
                return;
            case 13:
                xu1 xu1Var = (xu1) this.b;
                xu1Var.getClass();
                xu1Var.d.a(TimeUnit.SECONDS.toMillis(3L) + System.currentTimeMillis(), (wu1) ((AtomicReference) this.c).get());
                ((lq1) this.o).b(null);
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ((CampaignService) this.b).a((String) this.c, (cu1) ((Runnable) this.o));
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                p82 p82Var = (p82) this.b;
                p82Var.getClass();
                mg4 mg4Var = (mg4) this.c;
                String strName = mg4Var.name();
                Collection<Long> collection = (Collection) this.o;
                hm9.m("p82", "syncMessages, itemType = %s, chatIds size = %d", strName, Integer.valueOf(collection.size()));
                for (Long l : collection) {
                    hm9.m("p82", "syncMessages, itemType = %s, chatId = %d", mg4Var.name(), l);
                    ((eoe) p82Var.t.get()).g(new q9d(((p7b) p82Var.n).a.o(), l.longValue(), 0, mg4Var), 0L, 0);
                }
                r9d.y((s8g) p82Var.w.get());
                return;
            case 16:
                bd3 bd3Var = (bd3) this.b;
                bd3Var.getClass();
                qy5 qy5Var = bd3Var.f;
                fm9.l(qy5Var);
                ((hlf) this.c).E(new VideoSink$VideoSinkException((VideoFrameProcessingException) this.o, qy5Var));
                return;
            case LangUtils.HASH_SEED /* 17 */:
                List listSingletonList = Collections.singletonList((qy3) this.c);
                ((o84) ((ty2) this.b).Y).getClass();
                o84.o(listSingletonList);
                ((CountDownLatch) this.o).countDown();
                return;
            case 18:
                ((ViewGroup) this.b).endViewTransition((View) this.c);
                rd4 rd4Var = (rd4) this.o;
                ((ovd) rd4Var.c.b).c(rd4Var);
                return;
            case 19:
                if (((ce4) this.b).u0) {
                    ((Runnable) this.c).run();
                    return;
                } else {
                    ((Runnable) this.o).run();
                    return;
                }
            case 20:
                ll4 ll4Var = (ll4) this.b;
                ll4Var.getClass();
                ((Runnable) this.c).run();
                he.d(new kl4(ll4Var, 0, (il4) this.o));
                return;
            case 21:
                ml4 ml4Var = (ml4) this.b;
                ml4Var.getClass();
                ((Runnable) this.c).run();
                ((ScheduledExecutorService) ((khe) tu0.l.f.b).getValue()).execute(new kl4(ml4Var, 1, (il4) this.o));
                return;
            case 22:
                kr4 kr4Var = (kr4) this.b;
                ((mr4) this.c).g(kr4Var.a, kr4Var.b, (Exception) this.o);
                return;
            case 23:
                lr4 lr4Var = (lr4) this.b;
                ((nr4) this.c).s(lr4Var.a, lr4Var.b, (Exception) this.o);
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                if (((vs4) this.b).Y) {
                    ((Runnable) this.c).run();
                    return;
                } else {
                    ((Runnable) this.o).run();
                    return;
                }
            case 25:
                qv4 qv4Var = (qv4) this.b;
                qv4Var.getClass();
                Rect rect3 = new Rect();
                ov4 ov4Var = (ov4) this.c;
                te0 te0Var = (te0) this.o;
                uv4 uv4Var = qv4Var.a;
                if (ov4Var != null && ov4Var.o) {
                    int width = uv4Var.getWidth();
                    int height = uv4Var.getHeight();
                    te0Var.c = width;
                    te0Var.d = height;
                } else if (te0Var.c == -1 && te0Var.d == -1) {
                    if (ov4Var != null) {
                        Rect rect4 = ov4Var.c;
                        int iWidth = rect4.width();
                        int iHeight = rect4.height();
                        te0Var.c = iWidth;
                        te0Var.d = iHeight;
                    } else {
                        int width2 = uv4Var.getWidth();
                        int measuredHeight = uv4Var.getMeasuredHeight();
                        te0Var.c = width2;
                        te0Var.d = measuredHeight;
                    }
                }
                te0.a(te0Var, uv4Var.getMeasuredWidth(), uv4Var.getMeasuredHeight(), rect3);
                uv4Var.setBounds(rect3);
                if (ov4Var != null) {
                    Rect bounds = uv4Var.getBounds();
                    ArrayList arrayList = new ArrayList();
                    HashMap map = new HashMap();
                    Iterator it5 = ov4Var.a.iterator();
                    while (it5.hasNext()) {
                        ee7 ee7Var = (ee7) it5.next();
                        if (au1.s(ee7Var.b) != 0) {
                            rect = bounds;
                            c2 = c4;
                            c3 = c5;
                            it = it5;
                            simpleEntry = null;
                            c = 7;
                        } else {
                            float fWidth = bounds.width();
                            Rect rect5 = ov4Var.c;
                            float fWidth2 = fWidth / rect5.width();
                            float fHeight = bounds.height() / rect5.height();
                            List list = ee7Var.X;
                            Iterator it6 = list.iterator();
                            while (it6.hasNext()) {
                                float[] fArr = ((yq4) it6.next()).b;
                                if (fArr != null) {
                                    for (int i3 = 0; i3 < fArr.length; i3++) {
                                        if (i3 % 2 == 0) {
                                            float f = fArr[i3] - rect5.left;
                                            fArr[i3] = f;
                                            float f2 = f * fWidth2;
                                            fArr[i3] = f2;
                                            fArr[i3] = f2 + bounds.left;
                                        } else {
                                            float f3 = fArr[i3] - rect5.top;
                                            fArr[i3] = f3;
                                            float f4 = f3 * fHeight;
                                            fArr[i3] = f4;
                                            fArr[i3] = f4 + bounds.top;
                                        }
                                    }
                                }
                            }
                            xq4 xq4Var = new xq4(ee7Var.c, (bounds.width() / rect5.width()) * ee7Var.o);
                            for (Iterator it7 = list.iterator(); it7.hasNext(); it7 = it2) {
                                yq4 yq4Var = (yq4) it7.next();
                                float[] fArr2 = yq4Var.b;
                                int iS2 = au1.s(yq4Var.a);
                                Path path = xq4Var.b;
                                ArrayList arrayList2 = xq4Var.a;
                                if (iS2 == 0) {
                                    rect2 = bounds;
                                    float f5 = fArr2[0];
                                    float f6 = fArr2[1];
                                    float f7 = fArr2[2];
                                    float f8 = fArr2[3];
                                    it2 = it7;
                                    it3 = it5;
                                    arrayList2.add(new yq4(1, new float[]{f5, f6, f7, f8}));
                                    path.moveTo(f5, f6);
                                    path.lineTo(f7, f8);
                                } else if (iS2 != 1) {
                                    rect2 = bounds;
                                    it2 = it7;
                                    it3 = it5;
                                } else {
                                    float f9 = fArr2[0];
                                    float f10 = fArr2[1];
                                    float f11 = fArr2[2];
                                    float f12 = fArr2[3];
                                    float f13 = fArr2[4];
                                    float f14 = fArr2[5];
                                    float f15 = fArr2[6];
                                    float f16 = fArr2[7];
                                    rect2 = bounds;
                                    arrayList2.add(new yq4(2, new float[]{f9, f10, f11, f12, f13, f14, f15, f16}));
                                    path.moveTo(f9, f10);
                                    path.cubicTo(f11, f12, f13, f14, f15, f16);
                                    it2 = it7;
                                    it3 = it5;
                                }
                                bounds = rect2;
                                it5 = it3;
                            }
                            rect = bounds;
                            it = it5;
                            c = 7;
                            c2 = 6;
                            c3 = 5;
                            simpleEntry = new AbstractMap.SimpleEntry(Integer.valueOf(ee7Var.a), xq4Var);
                        }
                        if (simpleEntry != null) {
                            arrayList.add((nv4) simpleEntry.getValue());
                            map.put((Integer) simpleEntry.getKey(), (nv4) simpleEntry.getValue());
                        }
                        bounds = rect;
                        c4 = c2;
                        c5 = c3;
                        it5 = it;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (e73 e73Var : ov4Var.b) {
                        s9 s9Var = (au1.s(e73Var.a) == 0 && (nv4Var = (nv4) map.get(Integer.valueOf(e73Var.b))) != null) ? new s9(nv4Var) : null;
                        if (s9Var != null) {
                            arrayList3.add(s9Var);
                        }
                    }
                    Iterator it8 = arrayList.iterator();
                    while (it8.hasNext()) {
                        uv4Var.a.add((nv4) it8.next());
                        uv4Var.invalidate();
                    }
                    qv4Var.d.addAll(arrayList3);
                    uv4Var.setDrawStickerEnabled(ov4Var.o);
                }
                qv4Var.b();
                return;
            case 26:
                ((EglRenderer) this.b).lambda$removeFrameListener$2((CountDownLatch) this.c, (EglRenderer.FrameListener) this.o);
                return;
            case 27:
                p9g p9gVar = (p9g) this.b;
                tu0 tu0Var = (tu0) this.c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.o;
                p9gVar.getClass();
                try {
                    mx5 mx5VarI = s36.i(p9gVar.a);
                    if (mx5VarI == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    lx5 lx5Var = (lx5) mx5VarI.a;
                    synchronized (lx5Var.o) {
                        lx5Var.Y = threadPoolExecutor;
                    }
                    mx5VarI.a.a(new yw4(tu0Var, threadPoolExecutor));
                    return;
                } catch (Throwable th4) {
                    tu0Var.v(th4);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 28:
                ((o05) this.b).b(new EncodeException((String) this.c, (Throwable) this.o));
                return;
            default:
                d15 d15Var = (d15) this.b;
                List list2 = (List) this.c;
                Runnable runnable = (Runnable) this.o;
                if (d15Var.D != 8) {
                    list2.isEmpty();
                    if ((d15Var.f instanceof c15) && !d15Var.A && xi4.a.e(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class) == null) {
                        d15Var.e.flush();
                        d15Var.z = true;
                    } else {
                        d15Var.e.stop();
                    }
                }
                if (runnable != null) {
                    runnable.run();
                }
                int i4 = d15Var.D;
                if (i4 == 7) {
                    d15Var.f();
                    return;
                }
                if (!d15Var.z) {
                    d15Var.h();
                }
                d15Var.i(1);
                if (i4 == 5 || i4 == 6) {
                    d15Var.k();
                    if (i4 == 6) {
                        d15Var.e();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ f5(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }
}
