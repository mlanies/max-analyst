package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ProcessingException;
import androidx.media3.common.VideoFrameProcessingException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;
import ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;
import ru.ok.tamtam.android.widgets.quickcamera.CameraxCameraApiView;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class flc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ flc(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        ilc ilcVar;
        long j = 0;
        int i = 0;
        switch (this.a) {
            case 0:
                wv7 wv7Var = (wv7) this.b;
                int iH = wv7Var.h();
                while (i < iH) {
                    long jE = wv7Var.e(i);
                    r7b r7bVar = (r7b) wv7Var.i(i);
                    if (jE > j) {
                        ir3 ir3VarH = ((glc) this.c).h();
                        int i2 = r7bVar.b;
                        ilc ilcVar2 = ir3VarH.a;
                        ilcVar2.b();
                        th thVar = ir3VarH.d;
                        q36 q36VarF = thVar.f();
                        q36VarF.j(1, i2);
                        q36VarF.j(2, r7bVar.a);
                        q36VarF.j(3, jE);
                        try {
                            ilcVar2.c();
                            try {
                                q36VarF.n();
                                ilcVar2.r();
                                ilcVar2.l();
                            } catch (Throwable th) {
                                ilcVar2.l();
                                throw th;
                            }
                        } finally {
                            thVar.t(q36VarF);
                        }
                    }
                    i++;
                    j = 0;
                }
                return;
            case 1:
                for (Map.Entry entry : ((Map) this.b).entrySet()) {
                    long jLongValue = ((Number) entry.getKey()).longValue();
                    ix8 ix8Var = (ix8) entry.getValue();
                    t19 t19VarD = ((vlc) this.c).d();
                    ilc ilcVar3 = t19VarD.a;
                    ilcVar3.b();
                    p19 p19Var = t19VarD.n;
                    q36 q36VarF2 = p19Var.f();
                    t19VarD.a().getClass();
                    byte[] bArrD = v89.d(ix8Var);
                    if (bArrD == null) {
                        q36VarF2.W(1);
                    } else {
                        q36VarF2.k(1, bArrD);
                    }
                    q36VarF2.j(2, jLongValue);
                    try {
                        ilcVar3.c();
                        try {
                            q36VarF2.n();
                            ilcVar3.r();
                            ilcVar3.l();
                        } catch (Throwable th2) {
                            ilcVar3.l();
                            throw th2;
                        }
                    } finally {
                        p19Var.t(q36VarF2);
                    }
                }
                return;
            case 2:
                for (wua wuaVar : (List) this.b) {
                    wlc wlcVar = (wlc) this.c;
                    rva rvaVarC = wlcVar.c();
                    xua xuaVarB = wlc.b(wlcVar, wuaVar);
                    ilcVar = rvaVarC.a;
                    ilcVar.b();
                    ilcVar.c();
                    try {
                        rvaVarC.b.C(xuaVarB);
                        ilcVar.r();
                    } finally {
                        ilcVar.l();
                    }
                }
                return;
            case 3:
                for (Map.Entry entry2 : ((Map) this.b).entrySet()) {
                    String str = (String) entry2.getKey();
                    long jLongValue2 = ((Number) entry2.getValue()).longValue();
                    rva rvaVarC2 = ((wlc) this.c).c();
                    ilcVar = rvaVarC2.a;
                    ilcVar.b();
                    p19 p19Var2 = rvaVarC2.d;
                    q36 q36VarF3 = p19Var2.f();
                    q36VarF3.j(1, jLongValue2);
                    q36VarF3.j(2, 1);
                    if (str == null) {
                        q36VarF3.W(3);
                    } else {
                        q36VarF3.f(3, str);
                    }
                    try {
                        ilcVar.c();
                        try {
                            q36VarF3.n();
                            ilcVar.r();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    } finally {
                        p19Var2.t(q36VarF3);
                    }
                }
                return;
            case 4:
                koc kocVar = (koc) this.b;
                if (kocVar.j.get()) {
                    return;
                }
                long j2 = kocVar.k + 1;
                kocVar.k = j2;
                ioc iocVar = (ioc) this.c;
                kocVar.l.put(j2, new uag(j2, iocVar, kocVar.o));
                k8g k8gVar = kocVar.n;
                k8gVar.getClass();
                ((Handler) k8gVar.c).post(new gbg(k8gVar, iocVar.b, 0));
                kocVar.f.post(new joc(kocVar, j2, 0));
                return;
            case 5:
                koc kocVar2 = (koc) this.b;
                AtomicBoolean atomicBoolean = kocVar2.j;
                if (atomicBoolean.get()) {
                    return;
                }
                AtomicReference atomicReference = kocVar2.b;
                e24 e24Var = (e24) atomicReference.get();
                e24 e24Var2 = (e24) this.c;
                if (e24Var == e24Var2) {
                    return;
                }
                atomicReference.set(e24Var2);
                vag vagVar = kocVar2.d;
                pbg pbgVar = kocVar2.c;
                if (e24Var != null) {
                    if (pbgVar == null) {
                        throw new IllegalArgumentException("Illegal 'listener' value: null");
                    }
                    e24Var.c.remove(pbgVar);
                    e24Var.c(vagVar);
                }
                kocVar2.a();
                if (e24Var2 != null) {
                    e24Var2.a(vagVar);
                    if (pbgVar == null) {
                        throw new IllegalArgumentException("Illegal 'listener' value: null");
                    }
                    e24Var2.c.add(pbgVar);
                    boolean zB = e24Var2.b();
                    e24 e24Var3 = (e24) atomicReference.get();
                    if (atomicBoolean.get() || e24Var3 != e24Var2) {
                        return;
                    }
                    if (zB) {
                        kocVar2.b();
                        return;
                    } else {
                        kocVar2.a();
                        return;
                    }
                }
                return;
            case 6:
                qp4 qp4Var = (qp4) this.b;
                if (((AtomicBoolean) qp4Var.Z).get()) {
                    return;
                }
                AtomicReference atomicReference2 = (AtomicReference) qp4Var.s0;
                e24 e24Var4 = (e24) atomicReference2.get();
                e24 e24Var5 = (e24) this.c;
                if (e24Var4 != e24Var5) {
                    atomicReference2.set(e24Var5);
                    vag vagVar2 = (vag) qp4Var.t0;
                    if (e24Var4 != null) {
                        e24Var4.c(vagVar2);
                    }
                    if (e24Var5 != null) {
                        e24Var5.a(vagVar2);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                Throwable th4 = (Throwable) this.c;
                qp4 qp4Var2 = (qp4) this.b;
                Iterator it = ((CopyOnWriteArrayList) qp4Var2.a).iterator();
                while (it.hasNext()) {
                    try {
                        ((poc) it.next()).c(th4);
                    } catch (Throwable th5) {
                        ((a4c) qp4Var2.c).reportException("RtcNotificationReceiver", "rtc.notification.handle.notificationerror", th5);
                    }
                }
                return;
            case 8:
                ooc oocVar = (ooc) this.c;
                qp4 qp4Var3 = (qp4) this.b;
                Iterator it2 = ((CopyOnWriteArrayList) qp4Var3.a).iterator();
                while (it2.hasNext()) {
                    try {
                        ((poc) it2.next()).b(oocVar);
                    } catch (Throwable th6) {
                        ((a4c) qp4Var3.c).reportException("RtcNotificationReceiver", "rtc.notification.handle.notificationreceived", th6);
                    }
                }
                return;
            case 9:
                fwc fwcVar = (fwc) this.b;
                e24 e24Var6 = (e24) this.c;
                fwcVar.Y.d(e24Var6);
                if (!fwcVar.Z || e24Var6 == null) {
                    return;
                }
                fwcVar.Y.e();
                return;
            case 10:
                SessionRoomListenerManagerImpl.sendActualState$lambda$12((SessionRoomListenerManagerImpl) this.b, (SessionRoomsManager.OwnRoomsListener) this.c);
                return;
            case 11:
                SessionRoomListenerManagerImpl.onRoomUpdated$lambda$5((SessionRoomListenerManagerImpl) this.b, (ql1) this.c);
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                SessionRoomListenerManagerImpl.onCurrentParticipantActiveRoomChanged$lambda$9((SessionRoomListenerManagerImpl) this.b, (nl1) this.c);
                return;
            case 13:
                SessionRoomListenerManagerImpl.onRoomRemoved$lambda$3((SessionRoomListenerManagerImpl) this.b, (pl1) this.c);
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                SessionRoomListenerManagerImpl.onCurrentParticipantInvitedToRoom$lambda$7((SessionRoomListenerManagerImpl) this.b, (ol1) this.c);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                SessionRoomParticipantsDataProviderImpl.resolveInternalIdByExternal$lambda$1((m56) this.b, (ParticipantId) this.c);
                return;
            case 16:
                qld qldVar = (qld) this.b;
                d dVar = (d) this.c;
                qldVar.getClass();
                kq7 kq7Var = dVar.z0;
                if (kq7Var != null) {
                    kq7Var.j(false);
                }
                qldVar.g.stopDeviceAudioShare();
                return;
            case LangUtils.HASH_SEED /* 17 */:
                fd7 fd7Var = ((qld) this.b).f;
                if (fd7Var != null) {
                    ((CopyOnWriteArraySet) fd7Var.a).remove(new tag(0L, (z99) this.c));
                    return;
                }
                return;
            case 18:
                rod rodVar = (rod) this.b;
                boolean z = rodVar.p;
                JSONObject jSONObject = (JSONObject) this.c;
                a4c a4cVar = rodVar.b;
                if (!z) {
                    a4cVar.log("OKSignaling", "<!> ignoring " + jSONObject.toString());
                    return;
                }
                try {
                    Iterator it3 = rodVar.k.iterator();
                    while (it3.hasNext()) {
                        ((qod) it3.next()).j(jSONObject);
                    }
                    return;
                } catch (JSONException e) {
                    a4cVar.reportException("OKSignaling", "signaling.listener.response.notification", e);
                    return;
                }
            case 19:
                ((ard) ((g03) this.b).c).o.c((VideoFrameProcessingException) this.c);
                return;
            case 20:
                ((ViewPropertyAnimator) this.b).translationY(0.0f).setDuration(200L).setInterpolator((AccelerateDecelerateInterpolator) ((bud) this.c).b.getValue()).start();
                return;
            case 21:
                svd svdVar = (svd) this.b;
                SurfaceTexture surfaceTexture = svdVar.u0;
                Surface surface = svdVar.v0;
                SurfaceTexture surfaceTexture2 = (SurfaceTexture) this.c;
                Surface surface2 = new Surface(surfaceTexture2);
                svdVar.u0 = surfaceTexture2;
                svdVar.v0 = surface2;
                Iterator it4 = svdVar.a.iterator();
                while (it4.hasNext()) {
                    ((n75) it4.next()).a.m2(surface2);
                }
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 22:
                kee keeVar = (kee) this.b;
                keeVar.getClass();
                ((tj3) ((AtomicReference) this.c).get()).accept(new zb0(keeVar));
                return;
            case 23:
                see seeVar = (see) this.c;
                mee meeVar = (mee) this.b;
                meeVar.getClass();
                try {
                    meeVar.a.a(seeVar);
                    return;
                } catch (ProcessingException e2) {
                    meeVar.c.accept(e2);
                    return;
                }
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                kee keeVar2 = (kee) this.c;
                mee meeVar2 = (mee) this.b;
                meeVar2.getClass();
                try {
                    meeVar2.a.c(keeVar2);
                    return;
                } catch (ProcessingException e3) {
                    meeVar2.c.accept(e3);
                    return;
                }
            case 25:
                ((vje) this.b).X.remove((yhc) this.c);
                return;
            case 26:
                ey1 ey1Var = ((fc0) this.b).c;
                if (ey1Var == null) {
                    throw new IllegalStateException("One and only one callback is allowed.");
                }
                ey1Var.k((ImageCaptureException) this.c);
                return;
            case 27:
                ey1 ey1Var2 = ((fc0) this.b).c;
                Objects.requireNonNull(ey1Var2);
                ov6 ov6Var = (ov6) this.c;
                Objects.requireNonNull(ov6Var);
                hm9.n(ey1.class.getName(), "capture image with success");
                CameraxCameraApiView cameraxCameraApiView = (CameraxCameraApiView) ey1Var2.b;
                try {
                    ByteBuffer byteBufferT = ov6Var.v()[0].t();
                    byte[] bArr = new byte[byteBufferT.capacity()];
                    byteBufferT.rewind();
                    byteBufferT.get(bArr);
                    cx1 cx1Var = cameraxCameraApiView.s0;
                    if (cx1Var != null) {
                        urb urbVar = ((rrb) ((rxd) cx1Var).b).o;
                        if (urbVar == null) {
                            urbVar = null;
                        }
                        pnf.n(urbVar, ((w9a) urbVar.s0).b(), null, new srb(urbVar, bArr, null), 2);
                    }
                    m6d.c(ov6Var, null);
                    return;
                } catch (Throwable th7) {
                    try {
                        throw th7;
                    } catch (Throwable th8) {
                        m6d.c(ov6Var, th7);
                        throw th8;
                    }
                }
            case 28:
                ((lme) this.b).e((gle) this.c);
                return;
            default:
                f6 f6Var = (f6) this.c;
                wle wleVar = (wle) this.b;
                wleVar.getClass();
                try {
                    f6Var.run();
                    return;
                } catch (Throwable th9) {
                    hm9.p("wle", "fail", th9);
                    ((cba) ((o45) wleVar.k.getValue())).c(th9, true);
                    return;
                }
        }
    }
}
