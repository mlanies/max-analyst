package defpackage;

import android.content.Context;
import android.content.Intent;
import android.hardware.camera2.TotalCaptureResult;
import android.media.MediaCodec;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.ArrayMap;
import androidx.camera.video.internal.audio.AudioSourceAccessException;
import androidx.media3.common.VideoFrameProcessingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextNotInitialized;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.util.HandledException;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 5;
        int i2 = 0;
        int i3 = 1;
        switch (this.a) {
            case 0:
                d dVar = (d) this.b;
                jx1 jx1Var = (jx1) this.c;
                if (dVar.z0 != null) {
                    dVar.z0.l(jx1Var);
                    return;
                } else {
                    dVar.G0 = jx1Var;
                    return;
                }
            case 1:
                ar0 ar0VarA = ((d) this.b).a();
                if (ar0VarA.a) {
                    return;
                }
                ((kq7) ar0VarA.b).d((ji9) this.c);
                return;
            case 2:
                td tdVar = (td) this.b;
                tdVar.getClass();
                ((pv6) this.c).f(tdVar);
                return;
            case 3:
                Runnable runnable = (Runnable) this.c;
                qm qmVar = (qm) this.b;
                qmVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    qmVar.a();
                }
            case 4:
                Set set = (Set) this.c;
                tf2 tf2Var = (tf2) this.b;
                tf2Var.getClass();
                try {
                    tf2Var.b.c(set);
                    return;
                } catch (Exception e) {
                    hm9.p(tf2Var.a, "deleteHistoryItem: exception", e);
                    tf2Var.Y.a(new HandledException(e));
                    return;
                }
            case 5:
                hy hyVar = (hy) this.b;
                MediaCodec mediaCodec = (MediaCodec) this.c;
                synchronized (hyVar.a) {
                    try {
                    } catch (Throwable th) {
                        throw th;
                    }
                    if (hyVar.l) {
                        return;
                    }
                    long j = hyVar.k - 1;
                    hyVar.k = j;
                    if (j > 0) {
                        return;
                    }
                    if (j < 0) {
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (hyVar.a) {
                            hyVar.m = illegalStateException;
                        }
                        return;
                    }
                    hyVar.b();
                    if (mediaCodec != null) {
                        try {
                            mediaCodec.start();
                        } catch (IllegalStateException e2) {
                            synchronized (hyVar.a) {
                                hyVar.m = e2;
                            }
                        } catch (Exception e3) {
                            IllegalStateException illegalStateException2 = new IllegalStateException(e3);
                            synchronized (hyVar.a) {
                                hyVar.m = illegalStateException2;
                            }
                        }
                    }
                    return;
                    throw th;
                }
            case 6:
                ph4 ph4Var = (ph4) this.b;
                ph4Var.getClass();
                int i4 = maf.a;
                h74 h74Var = ((n75) ph4Var.b).a.C0;
                ed edVarP = h74Var.P();
                h74Var.Q(edVarP, 1012, new v64(edVarP, 11, (String) this.c));
                return;
            case 7:
                qz7 qz7Var = (qz7) this.b;
                qz7Var.getClass();
                int i5 = oaf.a;
                i74 i74Var = ((o75) qz7Var.c).a.D0;
                fd fdVarF = i74Var.F();
                i74Var.I(fdVarF, 1012, new r64(fdVarF, (String) this.c, 3));
                return;
            case 8:
                l7b l7bVar = (l7b) this.b;
                l7bVar.getClass();
                Throwable th2 = (Throwable) this.c;
                if (th2 instanceof AudioSourceAccessException) {
                    ((tj3) l7bVar.b).accept(th2);
                    return;
                }
                return;
            case 9:
                e70 e70Var = (e70) this.b;
                int iS = au1.s(e70Var.g);
                if (iS != 0 && iS != 1) {
                    if (iS == 2) {
                        throw new AssertionError("AudioSource is released");
                    }
                    return;
                }
                z05 z05Var = e70Var.l;
                z05 z05Var2 = (z05) this.c;
                if (z05Var != z05Var2) {
                    e70Var.b(z05Var2);
                    return;
                }
                return;
            case 10:
                lq1 lq1Var = (lq1) this.c;
                e70 e70Var2 = (e70) this.b;
                e70Var2.getClass();
                qt0 qt0Var = e70Var2.d;
                try {
                    int iS2 = au1.s(e70Var2.g);
                    if (iS2 == 0 || iS2 == 1) {
                        e70Var2.b(null);
                        e70Var2.e.release();
                        qt0Var.release();
                        if (e70Var2.i) {
                            e70Var2.i = false;
                            qt0Var.stop();
                        }
                        e70Var2.g = 3;
                    }
                    lq1Var.b(null);
                    return;
                } catch (Throwable th3) {
                    lq1Var.d(th3);
                    return;
                }
            case 11:
                ((adc) ((l7b) this.c).c).c0 = ((e70) this.b).t;
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((qi0) this.b).d.c(VideoFrameProcessingException.a((Exception) this.c));
                return;
            case 13:
                wva wvaVar = ((py0) this.b).M1;
                a4c a4cVar = (a4c) wvaVar.b;
                try {
                    boolean zShouldHideSensitiveInformation = ((b4c) wvaVar.c).shouldHideSensitiveInformation();
                    JSONObject jSONObject = (JSONObject) this.c;
                    if (zShouldHideSensitiveInformation) {
                        a4cVar.log("OKRTCCall", "handleSignalingNotification, " + new JSONObject(c37.n(jSONObject.toString())).toString(2));
                    } else {
                        a4cVar.log("OKRTCCall", "handleSignalingNotification, " + jSONObject.toString(2));
                    }
                    return;
                } catch (JSONException e4) {
                    a4cVar.log("OKRTCCall", "error during notification logging: " + e4.getMessage());
                    return;
                }
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                try {
                    ((s21) this.b).b = (k9b) ((bm7) this.c).get();
                    return;
                } catch (Throwable th4) {
                    hm9.r("CameraPreviewHelper", th4, th4.getMessage(), new Object[0]);
                    return;
                }
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                me1 me1Var = (me1) this.b;
                String str = me1Var.j;
                a4c a4cVar2 = me1Var.a;
                try {
                    a4cVar2.log(str, "Starting release process");
                    EGLContext eGLContext = me1Var.d;
                    if (eGLContext == null) {
                        return;
                    }
                    a4cVar2.log(str, "Not yet released, continue");
                    EGLDisplay eGLDisplay = me1Var.e;
                    if (eGLDisplay == null) {
                        throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
                    }
                    GLES20.glUseProgram(0);
                    try {
                        me1Var.b.invoke(me1Var);
                    } catch (Throwable th5) {
                        a4cVar2.reportException(str, "Error on call dependent release callback", th5);
                    }
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    me1Var.g = eGLSurface;
                    EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                    EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                    EGL14.eglReleaseThread();
                    EGL14.eglTerminate(eGLDisplay);
                    me1Var.d = null;
                    me1Var.e = null;
                    me1Var.f = null;
                    a4cVar2.log(str, "Quitting handler thread");
                    me1Var.c.quit();
                    return;
                } finally {
                    a4cVar2.log(str, "Released, notify awaiting...");
                    countDownLatch.countDown();
                }
            case 16:
                try {
                    ((Context) this.b).startForegroundService((Intent) this.c);
                    return;
                } catch (Throwable th6) {
                    hm9.p("CallServiceTag", "cant start foreground service... handle exception: " + th6.getMessage(), null);
                    ((wr1) n31.a.d()).v();
                    return;
                }
            case LangUtils.HASH_SEED /* 17 */:
                mm1.A((mm1) this.b, (List) this.c);
                return;
            case 18:
                CallsAudioManagerV2Impl.reportAudioDeviceOnMainThread$lambda$4((CallsAudioManagerV2Impl) this.b, (CallsAudioDeviceInfo) this.c);
                return;
            case 19:
                ks1 ks1Var = (ks1) this.b;
                ze9 ze9Var = (ze9) this.c;
                ks1Var.getClass();
                if (ze9Var.a == ks1Var.t0) {
                    ks1Var.t0 = 0L;
                    if (f46.U(ze9Var.b.b)) {
                        return;
                    }
                    hm9.n("ks1", "onEvent: MsgGetErrorEvent, remove " + ze9Var.o.size() + " messagesIds from state");
                    for (Long l : ze9Var.o) {
                        List list = (List) ((LinkedHashMap) ks1Var.c.Y.a).get(Long.valueOf(ze9Var.c));
                        if (list != null) {
                            list.remove(l);
                        }
                    }
                    ks1Var.h();
                    return;
                }
                return;
            case 20:
                ks1 ks1Var2 = (ks1) this.b;
                ks1Var2.getClass();
                long j2 = ((oi0) this.c).a;
                if (j2 == ks1Var2.Z) {
                    ks1Var2.Z = 0L;
                    int i6 = 1;
                    if (!ks1Var2.Y.isEmpty()) {
                        ks1Var2.g(new is1(ks1Var2, i6));
                        return;
                    }
                    return;
                }
                if (j2 == ks1Var2.s0) {
                    ks1Var2.s0 = 0L;
                    if (!ks1Var2.Y.isEmpty()) {
                        ks1Var2.d();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                ks1 ks1Var3 = (ks1) this.b;
                vdf vdfVar = (vdf) this.c;
                long j3 = ks1Var3.Z;
                long j4 = vdfVar.a;
                if ((j3 == j4 || ks1Var3.s0 == j4) && vdfVar.Z.b() > 0) {
                    jc7 jc7Var = vdfVar.Z;
                    hm9.n("ks1", "onMissedMessages size: " + jc7Var.b());
                    jc7 jc7Var2 = ks1Var3.c.Y;
                    jc7Var2.getClass();
                    for (Map.Entry entry : ((LinkedHashMap) jc7Var.a).entrySet()) {
                        Iterator it = ((List) entry.getValue()).iterator();
                        while (it.hasNext()) {
                            jc7Var2.a(entry.getKey(), it.next());
                        }
                    }
                    ks1Var3.h();
                }
                long j5 = ks1Var3.Z;
                long j6 = vdfVar.a;
                if (j5 != j6) {
                    if (ks1Var3.s0 == j6) {
                        long j7 = vdfVar.b;
                        long j8 = vdfVar.c;
                        long j9 = vdfVar.X;
                        boolean z = vdfVar.Y;
                        ks1Var3.s0 = 0L;
                        if (j7 == 0 || j7 >= ks1Var3.c.a.a) {
                            j7 = ks1Var3.c.a.a;
                        }
                        if (ks1Var3.c.a.b != 0) {
                            j8 = ks1Var3.c.a.b;
                        }
                        d92 d92Var = new d92(j7, j8);
                        hm9.n("ks1", "onLoadNext: chunk change \nfrom: " + hm9.W(ks1Var3.c.a) + "\n  to: " + hm9.W(d92Var));
                        hm9.n("ks1", "onLoadNext: hasNext change from: " + ks1Var3.c.o + " to: " + z);
                        ks1Var3.c.a = d92Var;
                        ks1Var3.c.o = z;
                        ks1Var3.c.c = j9;
                        ks1Var3.h();
                        ks1Var3.g(new u60((Object) ks1Var3, false, 5));
                        return;
                    }
                    return;
                }
                long j10 = vdfVar.b;
                long j11 = vdfVar.c;
                long j12 = vdfVar.o;
                long j13 = vdfVar.X;
                boolean z2 = vdfVar.Y;
                ks1Var3.Z = 0L;
                long j14 = ks1Var3.c.a.a == 0 ? j10 : ks1Var3.c.a.a;
                if (j11 <= ks1Var3.c.a.b) {
                    j11 = ks1Var3.c.a.b;
                }
                d92 d92Var2 = new d92(j14, j11);
                hm9.n("ks1", "onSync: chunk change \nfrom: " + hm9.W(ks1Var3.c.a) + "\n  to: " + hm9.W(d92Var2));
                hm9.n("ks1", "onSync: hasPrev change from: " + ks1Var3.c.X + " to: " + z2);
                ks1Var3.c.a = d92Var2;
                ks1Var3.c.X = z2;
                if (j12 != 0) {
                    ks1Var3.c.b = j12;
                }
                if (ks1Var3.c.c == 0) {
                    hm9.n("ks1", "onSync: set backwardMarker to: " + j13);
                    ks1Var3.c.c = j13;
                }
                ks1Var3.h();
                if (ks1Var3.a) {
                    Iterator it2 = ks1Var3.o.iterator();
                    long j15 = 0;
                    while (it2.hasNext()) {
                        long j16 = ((es8) it2.next()).a.o;
                        if (j16 > j15) {
                            j15 = j16;
                        }
                    }
                    long j17 = j15 + 1;
                    long j18 = ks1Var3.c.a.b;
                    hm9.n("ks1", "onSync: load from db" + nu0.G(Long.valueOf(j17)) + " to: " + nu0.G(Long.valueOf(j18)));
                    ks1Var3.b(0, ks1Var3.x0.m(j17, j18));
                } else {
                    ks1Var3.g(new is1(ks1Var3, 5));
                }
                ks1Var3.f();
                if (!ks1Var3.c.X) {
                    ks1Var3.i();
                    return;
                } else {
                    hm9.n("ks1", "onSync: hasPrev == true, load one more page");
                    ks1Var3.g(new is1(ks1Var3, 1));
                    return;
                }
            case 22:
                ks1 ks1Var4 = (ks1) this.b;
                kz6 kz6Var = (kz6) this.c;
                ks1Var4.getClass();
                long j19 = kz6Var.c;
                ks1Var4.e();
                hm9.n("ks1", "onNewMessage hasPrev=" + ks1Var4.c.X);
                if (ks1Var4.c.X) {
                    return;
                }
                tp7 tp7Var = ks1Var4.v0;
                tp7Var.getClass();
                es8 es8Var = (es8) tp7.b(tp7Var, j19, true, 26).e();
                if (es8Var.a.v()) {
                    d92 d92Var3 = new d92(ks1Var4.c.a.a == 0 ? es8Var.a.o : ks1Var4.c.a.a, es8Var.a.o);
                    hm9.n("ks1", "inIncomingMessage: chunk change \nfrom: " + hm9.W(ks1Var4.c.a) + "\n  to: " + hm9.W(d92Var3));
                    ks1Var4.c.a = d92Var3;
                    ks1Var4.h();
                    if (ks1Var4.a) {
                        ks1Var4.b(0, Collections.singletonList(es8Var));
                        ks1Var4.f();
                    }
                    ks1Var4.i();
                    return;
                }
                return;
            case 23:
                ks1 ks1Var5 = (ks1) this.b;
                ut7 ut7Var = (ut7) this.c;
                ks1Var5.getClass();
                boolean z3 = ut7Var.o;
                ks1Var5.e();
                long j20 = ((p7b) ks1Var5.C0).a.g.getLong("user.callsLastSync", 0L);
                hm9.n("ks1", "onLogin: hasNewCalls: " + z3 + " callsLastSync: " + j20);
                if (z3) {
                    ks1Var5.c.X = true;
                    ks1Var5.g(new is1(ks1Var5, i3));
                } else if (j20 == 0) {
                    ks1Var5.c.X = false;
                    ks1Var5.c.o = false;
                    ks1Var5.i();
                } else {
                    ks1Var5.g(new is1(ks1Var5, i));
                    ks1Var5.c();
                }
                ks1Var5.h();
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                ks1 ks1Var6 = (ks1) this.b;
                af9 af9Var = (af9) this.c;
                if (ks1Var6.t0 == af9Var.a) {
                    long j21 = af9Var.b;
                    List list2 = af9Var.o;
                    List<Long> list3 = af9Var.X;
                    ks1Var6.t0 = 0L;
                    e52 e52VarZ = ks1Var6.y0.z(j21);
                    if (e52VarZ != null) {
                        hm9.n("ks1", "onMsgGet: insert " + list2.size() + " messages");
                        long c = ks1Var6.c.a.a;
                        long c2 = ks1Var6.c.a.b;
                        Iterator it3 = ks1Var6.D0.b(ks1Var6.x0.k(e52VarZ.a, list3)).iterator();
                        while (it3.hasNext()) {
                            es8 es8Var2 = (es8) it3.next();
                            int iBinarySearch = Collections.binarySearch(ks1Var6.o, es8Var2, new v00(6));
                            if (iBinarySearch < 0) {
                                iBinarySearch = Math.abs(iBinarySearch) - 1;
                            }
                            if (es8Var2.getC() < c) {
                                c = es8Var2.getC();
                            }
                            if (es8Var2.getC() > c2) {
                                c2 = es8Var2.getC();
                            }
                            ks1Var6.o.add(iBinarySearch, es8Var2);
                            ks1Var6.X.add(Long.valueOf(es8Var2.a.b));
                        }
                        ks1Var6.c.a = new d92(c, c2);
                        for (Long l2 : list3) {
                            List list4 = (List) ((LinkedHashMap) ks1Var6.c.Y.a).get(Long.valueOf(j21));
                            if (list4 != null) {
                                list4.remove(l2);
                            }
                            if (((List) ((LinkedHashMap) ks1Var6.c.Y.a).get(Long.valueOf(j21))).isEmpty()) {
                                ((LinkedHashMap) ks1Var6.c.Y.a).remove(Long.valueOf(j21));
                            }
                        }
                        ks1Var6.f();
                    } else {
                        ((LinkedHashMap) ks1Var6.c.Y.a).remove(Long.valueOf(j21));
                    }
                    ks1Var6.h();
                    ks1Var6.c();
                    return;
                }
                return;
            case 25:
                ks1 ks1Var7 = (ks1) this.b;
                vz2 vz2Var = (vz2) this.c;
                if (ks1Var7.c == null || !ks1Var7.a || Collections.disjoint(((LinkedHashMap) ks1Var7.c.Y.a).keySet(), vz2Var.s0)) {
                    return;
                }
                ks1Var7.c();
                return;
            case 26:
                ks1 ks1Var8 = (ks1) this.b;
                ks1Var8.getClass();
                re9 re9Var = (re9) this.c;
                long j22 = re9Var.b;
                if (ks1Var8.a) {
                    ArrayList arrayList = new ArrayList();
                    CopyOnWriteArrayList copyOnWriteArrayList = ks1Var8.o;
                    List list5 = re9Var.X;
                    if (list5 != null && list5.size() > 0) {
                        Iterator it4 = copyOnWriteArrayList.iterator();
                        while (it4.hasNext()) {
                            es8 es8Var3 = (es8) it4.next();
                            if (list5.contains(Long.valueOf(es8Var3.a.b))) {
                                arrayList.add(es8Var3);
                            }
                        }
                    }
                    long j23 = re9Var.c;
                    long j24 = re9Var.o;
                    if (j23 > 0 || j24 > 0) {
                        Iterator it5 = copyOnWriteArrayList.iterator();
                        while (it5.hasNext()) {
                            es8 es8Var4 = (es8) it5.next();
                            cu8 cu8Var = es8Var4.a;
                            if (cu8Var.t0 == j22) {
                                long j25 = cu8Var.o;
                                if (j25 >= j23 && j25 <= j24) {
                                    arrayList.add(es8Var4);
                                }
                            }
                        }
                    }
                    if (arrayList.size() > 0) {
                        hm9.n("ks1", "MsgDeleteEvent: remove " + arrayList.size() + " messages");
                        copyOnWriteArrayList.removeAll(arrayList);
                        ks1Var8.f();
                        return;
                    }
                    return;
                }
                return;
            case 27:
                pt1 pt1Var = ((st1) this.b).z;
                HashSet hashSet = (HashSet) pt1Var.b;
                iv1 iv1Var = (iv1) this.c;
                hashSet.remove(iv1Var);
                ((ArrayMap) pt1Var.c).remove(iv1Var);
                return;
            case 28:
                st1 st1Var = (st1) this.b;
                kq0.y(f8.g(new lt1(st1Var, st1Var.A(), i2)), (lq1) this.c);
                return;
            default:
                qt1 qt1Var = (qt1) this.b;
                qt1Var.getClass();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = (HashSet) qt1Var.b;
                Iterator it6 = hashSet3.iterator();
                while (it6.hasNext()) {
                    rt1 rt1Var = (rt1) it6.next();
                    if (rt1Var.a((TotalCaptureResult) this.c)) {
                        hashSet2.add(rt1Var);
                    }
                }
                if (hashSet2.isEmpty()) {
                    return;
                }
                hashSet3.removeAll(hashSet2);
                return;
        }
    }
}
