package defpackage;

import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.text.TextUtils;
import androidx.media3.transformer.ExportException;
import com.my.tracker.obfuscated.g0;
import com.my.tracker.obfuscated.t;
import com.my.tracker.obfuscated.z0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.util.LangUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.ContextUtils;
import org.webrtc.EglBase;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.Size;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;
import org.webrtc.audio.JavaAudioDeviceModule;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener.UrlSharingListenerManagerImpl;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class ewc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ ewc(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        boolean z;
        int i;
        int i2 = 5;
        boolean z2 = false;
        z2 = false;
        switch (this.a) {
            case 0:
                fwc fwcVar = (fwc) this.b;
                Size size = (Size) this.c;
                Intent intent = (Intent) this.o;
                fwcVar.Y.e();
                l26 l26Var = fwcVar.X;
                l26Var.getClass();
                l26Var.c.c(new k26(l26Var, z2 ? 1 : 0));
                h26 h26Var = fwcVar.o;
                h26Var.getClass();
                h26Var.o.c(new v05(h26Var, intent, size, i2));
                return;
            case 1:
                qld qldVar = (qld) this.b;
                EglBase eglBase = (EglBase) this.c;
                a4c a4cVar = (a4c) this.o;
                qldVar.h = eglBase;
                a4cVar.log("SharedPeerConnectionFac", "create");
                qldVar.c = "H264";
                a4cVar.log("SharedPeerConnectionFac", "Preferred video codec: " + qldVar.c);
                a4cVar.log("SharedPeerConnectionFac", "Create internal peer connection factory ...");
                y8 y8Var = new y8(a4cVar);
                JavaAudioDeviceModule.AudioRecordErrorCallback l7bVar = new l7b(y8Var, a4cVar, z2, i2);
                JavaAudioDeviceModule.Builder builder = JavaAudioDeviceModule.builder(ContextUtils.getApplicationContext());
                fd7 fd7Var = new fd7();
                fd7Var.a = new CopyOnWriteArraySet();
                qldVar.f = fd7Var;
                qldVar.g = builder.setAudioRecordSampleHook(fd7Var).setAudioRecordStateCallback(y8Var).setAudioRecordErrorCallback(l7bVar).setAudioTrackStateCallback(y8Var).setAudioTrackErrorCallback(y8Var).setUseSilenceProvider(true).createAudioDeviceModule();
                if (nsa.A().g) {
                    qldVar.g.setMicrophoneMute(true);
                }
                qsa qsaVarA = nsa.A();
                String str = ((Object) "WebRTC-IntelVP8/Enabled/WebRTC-Audio-SendSideBwe/Enabled/WebRTC-SendSideBwe-WithOverhead/Enabled/WebRTC-FeedbackTimeout/Enabled/WebRTC-Bwe-SafeResetOnRouteChange/Enabled/".concat((qsaVarA.a || qsaVarA.b) ? "WebRTC-Audio-Red-For-Opus/Enabled-2/" : "WebRTC-Audio-Red-For-Opus/Disabled/")) + "WebRTC-SpsPpsIdrIsH264Keyframe/Enabled/";
                String str2 = qsaVarA.c;
                if (!TextUtils.isEmpty(str2)) {
                    str = ((Object) str) + "WebRTC-OK-StunCustomAttr/Enabled-" + str2 + "/";
                }
                String str3 = qsaVarA.d;
                if (!TextUtils.isEmpty(str3)) {
                    str = ((Object) str) + "WebRTC-OK-TurnChannelDataMark/" + str3 + "/";
                }
                Integer num = qsaVarA.e;
                if (num != null) {
                    int iIntValue = num.intValue();
                    if (iIntValue < 0) {
                        iIntValue = 1000;
                    }
                    str = ((Object) str) + "WebRTC-RttMult/Enabled-1.0," + iIntValue + "/";
                }
                String str4 = ((Object) str) + "WebRTC-Bwe-LossBasedBweV2/Enabled:true,CandidateFactors:1.02|1.0|0.95,DelayBasedCandidate:true,HigherBwBiasFactor:0.0002,HigherLogBwBiasFactor:0.02,ObservationDurationLowerBound:250ms,InstantUpperBoundBwBalance:75kbps,BwRampupUpperBoundFactor:1000000.0,InstantUpperBoundTemporalWeightFactor:0.9,TemporalWeightFactor:0.9,MaxIncreaseFactor:1.3,NewtonStepSize:0.75,InherentLossUpperBoundBwBalance:75kbps,LossThresholdOfHighBandwidthPreference:0.15,NotIncreaseIfInherentLossLessThanAverageLoss:true,_20230522/";
                if (qsaVarA.f) {
                    str4 = ((Object) str4) + "CallsSDK-Audio-EarlyStartPlayout/Enabled/";
                }
                if (qsaVarA.g) {
                    str4 = ((Object) str4) + "CallsSDK-Audio-EarlyStartRecording/Enabled/";
                }
                if (qsaVarA.h) {
                    str4 = ((Object) str4) + "WebRTC-IceFieldTrials/skip_relay_to_non_relay_connections:true/";
                }
                psa psaVar = qsaVarA.j;
                if (psaVar == null || !psaVar.a) {
                    z = false;
                } else {
                    Boolean bool = Boolean.TRUE;
                    if (tpa.f(psaVar.c, bool)) {
                        str4 = ((Object) str4) + "CallsSDK-Audio-OpusFECWithDRED/Enabled/";
                    }
                    if (tpa.f(psaVar.b, bool)) {
                        str4 = ((Object) str4) + "CallsSDK-Audio-OpusNOLACE/Enabled/";
                        z = true;
                    } else {
                        z = false;
                    }
                    Integer num2 = psaVar.f;
                    if (num2 != null) {
                        str4 = ((Object) str4) + "CallsSDK-Audio-OpusDREDByBitrate/Enabled:" + num2 + "/";
                    }
                    Integer num3 = psaVar.e;
                    if (num3 != null) {
                        str4 = ((Object) str4) + "CallsSDK-Audio-OpusAdapterMinBitrate/Enabled:" + num3 + "/";
                    }
                    if (tpa.f(psaVar.d, bool)) {
                        str4 = ((Object) str4) + qsa.a(z);
                        z2 = true;
                    }
                }
                osa osaVarB = qsaVarA.b();
                Integer num4 = osaVarB.b;
                int iIntValue2 = num4 != null ? num4.intValue() : 6;
                Integer num5 = osaVarB.a;
                int iIntValue3 = num5 != null ? num5.intValue() : 6;
                Boolean bool2 = osaVarB.c;
                String str5 = ((Object) str4) + "WebRTC-Audio-AdaptivePtime/enabled:true,min_payload_bitrate:" + iIntValue2 + "kbps,min_encoder_bitrate:" + iIntValue3 + "kbps,use_slow_adaptation:" + (bool2 != null ? bool2.booleanValue() : true) + "/";
                if (qsaVarA.k && !z2) {
                    str5 = ((Object) str5) + qsa.a(z);
                }
                if (qsaVarA.l) {
                    str5 = ((Object) str5) + "CallsSDK-DisableSharedSocket/Enabled/";
                }
                String str6 = qsaVarA.m;
                if (str6 != null && str6.length() != 0) {
                    str5 = ((Object) str5) + str6;
                }
                a4cVar.log("SharedPeerConnectionFac", "Field trials: " + str5);
                PeerConnectionFactory.initializeFieldTrials(str5);
                qldVar.d = PeerConnectionFactory.builder().setVideoDecoderFactory(qldVar.e).setVideoEncoderFactory(qldVar.j).setAudioDeviceModule(qldVar.g).createPeerConnectionFactory();
                if (qldVar.d == null) {
                    throw new IllegalStateException();
                }
                a4cVar.log("SharedPeerConnectionFac", jb9.c(qldVar.d) + " was created");
                boolean z3 = jb9.a ^ true;
                a4cVar.log("SharedPeerConnectionFac", "Is VIDEO HW acceleration enabled? ".concat(z3 ? "yes" : "no"));
                if (!z3 || eglBase == null) {
                    return;
                }
                a4cVar.log("SharedPeerConnectionFac", "Enable video hardware acceleration options for " + jb9.c(qldVar.d));
                return;
            case 2:
                qld qldVar2 = (qld) this.b;
                d dVar = (d) this.c;
                MediaProjection mediaProjection = (MediaProjection) this.o;
                qldVar2.getClass();
                kq7 kq7Var = dVar.z0;
                if (kq7Var != null) {
                    kq7Var.j(true);
                }
                qldVar2.g.startDeviceAudioShare(mediaProjection);
                return;
            case 3:
                rod rodVar = (rod) this.b;
                boolean z4 = rodVar.p;
                JSONObject jSONObject = (JSONObject) this.c;
                a4c a4cVar2 = rodVar.b;
                if (!z4) {
                    a4cVar2.log("OKSignaling", "<!> ignoring " + jSONObject.toString());
                    return;
                } else {
                    try {
                        Iterator it = rodVar.l.iterator();
                        while (it.hasNext()) {
                            ((qod) it.next()).j(jSONObject);
                        }
                        return;
                    } catch (JSONException e) {
                        a4cVar2.reportException("OKSignaling", (String) this.o, e);
                        return;
                    }
                }
            case 4:
                ((StereoRoomManagerImpl) this.b).idNotResolved((ParticipantId) this.c, (m56) this.o);
                return;
            case 5:
                h2e h2eVar = ((g2e) this.b).a;
                if (h2eVar.f == null) {
                    return;
                }
                String str7 = (String) this.o;
                boolean zT = oag.t(str7);
                File file = (File) this.c;
                if (!zT) {
                    kk5 kk5Var = (kk5) h2eVar.e;
                    kk5Var.getClass();
                    File fileO = pag.o(kk5.g(kk5Var.b(), "stickerCache"), tfg.e(str7));
                    if (fileO.exists() && fileO.canRead()) {
                        file = fileO;
                    } else {
                        try {
                            fileO.getParentFile().mkdirs();
                            s5c.s(file, fileO);
                            file = fileO;
                        } catch (IOException unused) {
                        }
                    }
                }
                h2eVar.c(h2eVar.f, file);
                return;
            case 6:
                ((nw4) this.b).k((iee) this.c, (Map.Entry) this.o);
                return;
            case 7:
                vee veeVar = ((wee) this.b).f;
                see seeVar = veeVar.b;
                if (seeVar != null) {
                    Objects.toString(seeVar);
                    veeVar.b.d();
                }
                boolean z5 = veeVar.Z;
                see seeVar2 = (see) this.c;
                if (z5) {
                    veeVar.Z = false;
                    seeVar2.d();
                    seeVar2.j.b(null);
                    return;
                }
                veeVar.b = seeVar2;
                veeVar.o = (u00) this.o;
                android.util.Size size2 = seeVar2.b;
                veeVar.a = size2;
                veeVar.Y = false;
                if (veeVar.a()) {
                    return;
                }
                veeVar.s0.e.getHolder().setFixedSize(size2.getWidth(), size2.getHeight());
                return;
            case 8:
                l1f l1fVar = (l1f) this.b;
                l1fVar.getClass();
                ffc ffcVarJ = ((ww6) this.c).j();
                k8g k8gVar = l1fVar.d;
                String str8 = (String) k8gVar.b;
                String str9 = (String) k8gVar.c;
                ece eceVar = l1fVar.e;
                eceVar.getClass();
                ExportException exportException = (ExportException) this.o;
                int i3 = exportException.a;
                h1f h1fVar = (h1f) eceVar.a;
                if (i3 == 7003 && ((i = h1fVar.v) == 5 || i == 6 || i == 1 || i == 2 || i == 3 || i == 4)) {
                    h1fVar.s = null;
                    h1fVar.r = null;
                    t85 t85Var = h1fVar.q;
                    t85Var.b();
                    t85Var.p = 6;
                    h1f.a(h1fVar);
                    return;
                }
                h1fVar.q.a.e(ffcVarJ);
                t85 t85Var2 = h1fVar.q;
                if (str8 != null) {
                    t85Var2.g = str8;
                }
                if (str9 != null) {
                    t85Var2.n = str9;
                }
                t85Var2.q = exportException;
                h1fVar.r = null;
                ypc ypcVar = new ypc(h1fVar, 12, exportException);
                pm7 pm7Var = h1fVar.f;
                pm7Var.c(-1, ypcVar);
                pm7Var.b();
                h1fVar.v = 0;
                return;
            case 9:
                UrlSharingListenerManagerImpl.saveUrlSharing$lambda$0((UrlSharingListenerManagerImpl) this.b, (jpd) this.c, (zad) this.o);
                return;
            case 10:
                bm7 bm7Var = (bm7) this.b;
                ccd ccdVar = (ccd) this.c;
                try {
                    try {
                        ccdVar.n(((vu) this.o).apply(fm9.C(bm7Var)));
                        return;
                    } catch (Throwable th) {
                        ccdVar.m(th);
                        return;
                    }
                } catch (Error | RuntimeException e2) {
                    ccdVar.m(e2);
                    return;
                } catch (CancellationException unused2) {
                    ccdVar.cancel(false);
                    return;
                } catch (ExecutionException e3) {
                    e = e3;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    ccdVar.m(e);
                    return;
                }
            case 11:
                ccd ccdVar2 = (ccd) this.b;
                Runnable runnable = (Runnable) this.c;
                Object obj = this.o;
                try {
                    if (ccdVar2.a instanceof q0) {
                        return;
                    }
                    runnable.run();
                    ccdVar2.l(obj);
                    return;
                } catch (Throwable th2) {
                    ccdVar2.m(th2);
                    return;
                }
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                c54.p("Surface update cancellation should only occur on main thread.", kq0.t());
                ((AtomicBoolean) this.b).set(true);
                bad badVar = (bad) this.c;
                ArrayList arrayList = (ArrayList) badVar.b.d;
                iv1 iv1Var = (iv1) this.o;
                arrayList.remove(iv1Var);
                badVar.e.remove(iv1Var);
                return;
            case 13:
                ((VideoFileRenderer) this.b).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) this.c, (VideoFrame) this.o);
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                aab aabVar = (aab) this.b;
                aabVar.getClass();
                int i4 = oaf.a;
                u75 u75Var = ((o75) aabVar.b).a;
                u75Var.getClass();
                i74 i74Var = u75Var.D0;
                fd fdVarF = i74Var.F();
                i74Var.I(fdVarF, 1017, new x64(fdVarF, (qy5) this.c, (s54) this.o, z2 ? 1 : 0));
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                wva wvaVar = (wva) this.b;
                wvaVar.getClass();
                int i5 = maf.a;
                n75 n75Var = (n75) wvaVar.c;
                n75Var.getClass();
                t75 t75Var = n75Var.a;
                t75Var.getClass();
                h74 h74Var = t75Var.C0;
                ed edVarP = h74Var.P();
                h74Var.Q(edVarP, 1017, new v64(edVarP, (oy5) this.c, (r54) this.o));
                return;
            case 16:
                hoc hocVar = (hoc) this.c;
                roc rocVar = (roc) this.o;
                k8g k8gVar2 = (k8g) this.b;
                Iterator it2 = ((CopyOnWriteArrayList) k8gVar2.b).iterator();
                while (it2.hasNext()) {
                    loc locVar = (loc) it2.next();
                    try {
                        Long l = (Long) locVar.d.get(hocVar);
                        if (l != null) {
                            locVar.b.log(locVar.a, "<- [" + l + "]: " + rocVar);
                        }
                    } catch (Throwable th3) {
                        ((a4c) k8gVar2.a).reportException("CallsListeners", "rtc.command.handle.listeners.oncommandsuccess", th3);
                    }
                }
                return;
            case LangUtils.HASH_SEED /* 17 */:
                hoc hocVar2 = (hoc) this.c;
                Throwable th4 = (Throwable) this.o;
                k8g k8gVar3 = (k8g) this.b;
                Iterator it3 = ((CopyOnWriteArrayList) k8gVar3.b).iterator();
                while (it3.hasNext()) {
                    loc locVar2 = (loc) it3.next();
                    try {
                        Long l2 = (Long) locVar2.d.get(hocVar2);
                        if (l2 != null) {
                            locVar2.b.log(locVar2.a, "<- [" + l2 + "]: " + th4);
                        }
                    } catch (Throwable th5) {
                        ((a4c) k8gVar3.a).reportException("CallsListeners", "rtc.command.handle.listeners.oncommanderror", th5);
                    }
                }
                return;
            default:
                g0.a((Context) this.b, (z0) this.c, (t) this.o);
                return;
        }
    }
}
