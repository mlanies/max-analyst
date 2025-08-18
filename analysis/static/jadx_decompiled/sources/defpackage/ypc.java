package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import androidx.media3.transformer.ExportException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.sdk.media.transformer.MediaTransformException;
import one.me.sdk.transfer.exceptions.HttpUrlExpiredException;
import org.webrtc.MediaStreamTrack;
import org.webrtc.StatsObserver;
import org.webrtc.StatsReport;
import ru.ok.android.externcalls.sdk.waiting_room.ConversationWaitingParticipantId;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.media.converter.VideoConverterException;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class ypc implements s0a, eqc, pv6, StatsObserver, xha, b66, mq1, wu, grd, qj3, km7, ehe, d38, bb3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ypc(a9f a9fVar) {
        this.a = 18;
        q8f q8fVar = q8f.UPLOADING;
        this.b = a9fVar;
        this.c = q8fVar;
    }

    @Override // defpackage.xha
    public void I(yha yhaVar) {
        ((k56) this.b).invoke();
        int i = gud.$EnumSwitchMapping$0[yhaVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            ((k56) this.c).invoke();
        }
    }

    @Override // defpackage.ehe
    public Object a() {
        switch (this.a) {
            case 16:
                gqc gqcVar = (gqc) ((t8f) this.b).c;
                gqcVar.getClass();
                Iterable iterable = (Iterable) this.c;
                if (iterable.iterator().hasNext()) {
                    gqcVar.m().compileStatement("DELETE FROM events WHERE _id in " + gqc.m0(iterable)).execute();
                    break;
                }
                break;
            default:
                t8f t8fVar = (t8f) this.b;
                t8fVar.getClass();
                Iterator it = ((Map) this.c).entrySet().iterator();
                while (it.hasNext()) {
                    ((gqc) t8fVar.i).U(((Integer) r1.getValue()).intValue(), rs7.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                break;
        }
        return null;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (this.a) {
            case 10:
                ((vpe) obj3).a.put((CharSequence) obj2, (upe) obj);
                break;
            case 13:
                c7f c7fVar = (c7f) obj3;
                c7fVar.getClass();
                if (((Throwable) obj) instanceof HttpUrlExpiredException) {
                    u6f u6fVarB = ((v6f) obj2).b();
                    u6fVarB.d = null;
                    u6fVarB.e = 0.0f;
                    c7fVar.b(u6fVarB.a());
                    break;
                }
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                c7f c7fVar2 = (c7f) obj3;
                c7fVar2.getClass();
                StringBuilder sb = new StringBuilder("onErrorUpload: data=");
                d7f d7fVar = (d7f) obj2;
                sb.append(d7fVar);
                hm9.p("c7f", sb.toString(), (Throwable) obj);
                c7fVar2.d(d7fVar);
                c7fVar2.c(d7fVar);
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                Throwable th = (Throwable) obj;
                g8f g8fVar = (g8f) obj3;
                g8fVar.getClass();
                if ((th instanceof TamErrorException) && "invalid.token".equals(((TamErrorException) th).a.b)) {
                    d7f d7fVarB = g8f.b((iy8) obj2);
                    c7f c7fVar3 = g8fVar.a;
                    c7fVar3.d(d7fVarB);
                    c7fVar3.c(d7fVarB);
                    break;
                }
                break;
            case 25:
                wef wefVar = (wef) obj3;
                wefVar.getClass();
                Locale locale = Locale.ENGLISH;
                StringBuilder sb2 = new StringBuilder("onError: conversionData=");
                lef lefVar = (lef) obj2;
                sb2.append(lefVar);
                hm9.p("wef", sb2.toString(), (Throwable) obj);
                wefVar.a(lefVar);
                break;
            default:
                Throwable th2 = (Throwable) obj;
                dlf dlfVar = (dlf) obj3;
                if (!dlfVar.a(th2)) {
                    ad adVar = (ad) dlfVar.c.get();
                    k20 k20Var = (k20) obj2;
                    if (adVar != null) {
                        if (oag.t(k20Var.i)) {
                            adVar.f("ACTION_VIDEO_FETCH_FAILURE");
                        } else {
                            adVar.g("ACTION_VIDEO_FETCH_FAILURE", k20Var.i);
                        }
                    }
                    hm9.p("VideoRipper", "ripVideo: failed to fetch " + k20Var.h, th2);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.eqc, defpackage.b66
    /* renamed from: apply */
    public bm7 mo131apply(Object obj) {
        switch (this.a) {
            case 8:
                List list = (List) obj;
                ((ihe) this.b).toString();
                Objects.toString(list);
                if (list.isEmpty()) {
                    return new dw6(1, new IllegalArgumentException("Unable to open capture session without surfaces"));
                }
                if (list.contains(null)) {
                    return new dw6(1, new DeferrableSurface$SurfaceClosedException((xf4) ((List) this.c).get(list.indexOf(null)), "Surface closed"));
                }
                return kq0.r(list);
            default:
                ejc ejcVar = (ejc) this.b;
                ejcVar.getClass();
                List list2 = (List) this.c;
                Integer num = (Integer) ((kz1) list2.get(0)).b.f(kz1.j, 100);
                Objects.requireNonNull(num);
                int iIntValue = num.intValue();
                Integer num2 = (Integer) ((kz1) list2.get(0)).b.f(kz1.i, 0);
                Objects.requireNonNull(num2);
                int iIntValue2 = num2.intValue();
                nw4 nw4Var = ((c9e) ((bqc) ejcVar.d).b).u;
                return nw4Var != null ? ((lee) nw4Var.b).b(iIntValue, iIntValue2) : new dw6(1, new Exception("Failed to take picture: pipeline is not ready."));
        }
    }

    @Override // defpackage.bb3
    public void b(ra3 ra3Var) {
        switch (this.a) {
            case 19:
                a9f a9fVar = (a9f) this.b;
                String str = (String) this.c;
                a9fVar.getClass();
                hm9.n("a9f", "removeUploadWithPhotoToken: token=" + str);
                synchronized (a9fVar) {
                    a9fVar.a.e(str).e(((y8f) a9fVar.b.getValue()).e(str)).a();
                }
                if (ra3Var.h()) {
                    return;
                }
                ra3Var.b();
                return;
            case 20:
                a9f a9fVar2 = (a9f) this.b;
                v6f v6fVar = (v6f) this.c;
                a9fVar2.getClass();
                hm9.n("a9f", "putUpload: upload=" + v6fVar);
                synchronized (a9fVar2) {
                    a9fVar2.a.a(v6fVar).e(((y8f) a9fVar2.b.getValue()).a(v6fVar)).a();
                }
                if (ra3Var.h()) {
                    return;
                }
                ra3Var.b();
                return;
            case 21:
                c9f c9fVar = (c9f) this.b;
                c9fVar.getClass();
                v6f v6fVar2 = (v6f) this.c;
                ((Map) c9fVar.b).put(v6fVar2.a, v6fVar2);
                ra3Var.b();
                return;
            default:
                c9f c9fVar2 = (c9f) this.b;
                b7b b7bVar = (b7b) this.c;
                synchronized (((Map) c9fVar2.b)) {
                    try {
                        Iterator it = ((Map) c9fVar2.b).entrySet().iterator();
                        while (it.hasNext()) {
                            p8f p8fVar = ((v6f) ((Map.Entry) it.next()).getValue()).h;
                            if ((p8fVar != null) && b7bVar.test(p8fVar)) {
                                it.remove();
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (ra3Var.h()) {
                    return;
                }
                ra3Var.b();
                return;
        }
    }

    @Override // defpackage.d38
    public void d(j28 j28Var) {
        List list;
        a9f a9fVar = (a9f) this.b;
        q8f q8fVar = (q8f) this.c;
        a9fVar.getClass();
        hm9.n("a9f", "getUploadsWithStatus: uploadStatus=" + q8fVar);
        synchronized (a9fVar) {
            list = (List) ((y8f) a9fVar.b.getValue()).f().b();
        }
        if (j28Var.h()) {
            return;
        }
        if (list == null || list.isEmpty()) {
            j28Var.b();
        } else {
            j28Var.a(list);
        }
    }

    @Override // defpackage.s0a
    public void e(ez9 ez9Var) {
        ay3 ay3Var = new ay3((String[]) this.b, ez9Var, 2);
        ilc ilcVar = (ilc) this.c;
        ilcVar.e.a(ay3Var);
        dm4.d(ez9Var, new w6(0, new p00((OneMeRoomDatabase) ilcVar, 9, ay3Var)));
        ez9Var.d(ngg.c);
    }

    @Override // defpackage.pv6
    public void f(qv6 qv6Var) {
        hqc hqcVar = (hqc) this.b;
        hqcVar.getClass();
        ((pv6) this.c).f(hqcVar);
    }

    @Override // defpackage.km7
    public void invoke(Object obj) {
        ol8 ol8Var = (ol8) obj;
        h1f h1fVar = (h1f) this.b;
        h1fVar.t.getClass();
        v85 v85VarA = h1fVar.q.a();
        String str = ol8Var.b;
        ExportException exportException = (ExportException) this.c;
        hm9.p(str, "onError", exportException);
        MediaTransformException mediaTransformException = new MediaTransformException("Media transform failed", exportException);
        ml8 ml8Var = ol8Var.a;
        ml8Var.f.set(v85VarA);
        ml8Var.g.set(mediaTransformException);
        ol8Var.a();
    }

    @Override // defpackage.grd
    public void j(nqd nqdVar) {
        ArrayList<nqb> arrayListS;
        boolean zE;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 9:
                tle tleVar = (tle) obj2;
                tleVar.getClass();
                rle rleVar = new rle(nqdVar);
                je7 je7Var = tleVar.x0;
                ((yle) je7Var.getValue()).f(false);
                gaa gaaVar = new gaa(rleVar);
                yle yleVar = (yle) je7Var.getValue();
                dle dleVar = (dle) obj;
                long jD = tleVar.d(dleVar);
                x9d x9dVar = (x9d) yleVar.Y.get();
                if (x9dVar != null && !yleVar.e(dleVar, gaaVar)) {
                    x9dVar.i(dleVar, false, jD, gaaVar);
                    break;
                }
                break;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                wef wefVar = (wef) obj2;
                wefVar.getClass();
                kef kefVar = (kef) obj;
                lef lefVar = kefVar.a;
                af8 af8Var = wefVar.a;
                cj0 cj0Var = (cj0) af8Var;
                String str = kefVar.c;
                cj0Var.getClass();
                nqbVar = null;
                try {
                    arrayListS = j1e.s(Uri.parse(str), cj0Var.a, cj0Var);
                } catch (Throwable th) {
                    hm9.p("cj0", "getAvailableQualitiesForVideo: failed", th);
                    arrayListS = null;
                }
                if (arrayListS != null && !arrayListS.isEmpty()) {
                    mqb mqbVar = lefVar.b.a;
                    while (true) {
                        nqb nqbVar = nqbVar;
                        for (nqb nqbVar2 : arrayListS) {
                            if (nqbVar2.a == mqbVar) {
                                break;
                            }
                        }
                        if (nqbVar == null) {
                            if (!nqdVar.h()) {
                                nqdVar.onError(new VideoConverterException("no available quality found for video"));
                                break;
                            }
                        } else {
                            boolean z = nqbVar.f;
                            ref refVar = lefVar.b;
                            if (z && refVar.b == 0.0f && refVar.c == 1.0f && !refVar.d) {
                                w36 w36VarA = kefVar.a();
                                w36VarA.o = str;
                                kefVar = new kef(w36VarA);
                                zE = true;
                            } else {
                                kj6.r(kefVar.d);
                                try {
                                    zE = ((ada) af8Var).e(kefVar.c, kefVar.d, refVar.b, refVar.c, nqbVar, refVar.d, new n2f(17));
                                    ad adVar = wefVar.d;
                                    if (zE) {
                                        adVar.f("VIDEO_CONVERT_SUCCESS");
                                    } else {
                                        adVar.f("VIDEO_CONVERT_ERROR");
                                    }
                                } catch (InterruptedException e) {
                                    if (nqdVar.h()) {
                                        return;
                                    }
                                    nqdVar.onError(e);
                                    return;
                                }
                            }
                            if (!nqdVar.h()) {
                                if (zE) {
                                    w36 w36VarA2 = kefVar.a();
                                    w36VarA2.a = true;
                                    nqdVar.a(new kef(w36VarA2));
                                    break;
                                } else {
                                    nqdVar.onError(new VideoConverterException("failed to convert video"));
                                    break;
                                }
                            }
                        }
                    }
                } else if (!nqdVar.h()) {
                    nqdVar.onError(new VideoConverterException("no available qualities for video"));
                    break;
                }
                break;
            default:
                WaitingRoomParticipants.resolveInternalIdSingle$lambda$1((WaitingRoomParticipants) obj2, (ConversationWaitingParticipantId) obj, nqdVar);
                break;
        }
    }

    @Override // org.webrtc.StatsObserver
    public void onComplete(StatsReport[] statsReportArr) {
        String str;
        StatsReport[] statsReportArr2 = statsReportArr;
        h7d h7dVar = (h7d) this.b;
        h7dVar.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = statsReportArr2.length;
        int i = 0;
        while (i < length) {
            StatsReport statsReport = statsReportArr2[i];
            if ("ssrc".equals(statsReport.type) && "ssrc".equals(statsReport.type)) {
                StatsReport.Value[] valueArr = statsReport.values;
                int length2 = valueArr.length;
                int i2 = 0;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    if (i2 < length2) {
                        StatsReport.Value value = valueArr[i2];
                        if ("googTrackId".equals(value.name)) {
                            String str2 = value.value;
                            if (str2 != null && str2.endsWith("audio-mix")) {
                                arrayList2.add(new dbg(null, true, false));
                                arrayList.add(statsReport);
                                break;
                            }
                            String str3 = value.value;
                            bg1 bg1VarB = (TextUtils.isEmpty(str3) || !str3.startsWith("audio-") || str3.length() == 6) ? null : bg1.b(str3.substring(6));
                            if (bg1VarB == null) {
                                bg1VarB = f46.a0(str3);
                            }
                            if (bg1VarB == null) {
                                d dVar = h7dVar.s0;
                                if (dVar != null && (str = value.value) != null && str.startsWith(((kq7) dVar.a().b).m)) {
                                    arrayList2.add(new dbg(null, false, true));
                                    arrayList.add(statsReport);
                                    break;
                                }
                            } else {
                                arrayList2.add(new dbg(bg1VarB, false, false));
                                arrayList.add(statsReport);
                                break;
                            }
                        } else if ("mediaType".equals(value.name) && MediaStreamTrack.AUDIO_TRACK_KIND.equals(value.value)) {
                            z = true;
                        } else if ("packetsReceived".equals(value.name)) {
                            z2 = true;
                        }
                        if (z && z2) {
                            arrayList2.add(new dbg(null, true, false));
                            arrayList.add(statsReport);
                            break;
                        }
                        i2++;
                    }
                }
            }
            i++;
            statsReportArr2 = statsReportArr;
        }
        h7dVar.a.post(new vq1(h7dVar, statsReportArr, (StatsReport[]) arrayList.toArray(new StatsReport[0]), arrayList2, (y1e) this.c, 7));
    }

    @Override // defpackage.mq1
    public String q(lq1 lq1Var) {
        switch (this.a) {
            case 7:
                see seeVar = (see) this.b;
                seeVar.getClass();
                ((AtomicReference) this.c).set(lq1Var);
                return "SurfaceRequest-surface-recreation(" + seeVar.hashCode() + ")";
            case 11:
                hre hreVar = (hre) this.b;
                see seeVar2 = hreVar.h;
                ok4 ok4VarK = ju0.k();
                cy1 cy1Var = new cy1(9, lq1Var);
                Surface surface = (Surface) this.c;
                seeVar2.b(surface, ok4VarK, cy1Var);
                return "provideSurface[request=" + hreVar.h + " surface=" + surface + "]";
            default:
                ((rdf) this.b).getClass();
                Integer numValueOf = Integer.valueOf(lq1Var.hashCode());
                bad badVar = (bad) this.c;
                ((ui9) badVar.b.g).a.put("androidx.camera.video.VideoCapture.streamUpdate", numValueOf);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                ndf ndfVar = new ndf(atomicBoolean, lq1Var, badVar);
                lq1Var.a(new ewc(atomicBoolean, badVar, ndfVar, 12), ju0.k());
                badVar.b.b(ndfVar);
                return String.format("%s[0x%x]", "androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(lq1Var.hashCode()));
        }
    }

    public /* synthetic */ ypc(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e4 A[Catch: all -> 0x016c, TryCatch #0 {all -> 0x016c, blocks: (B:28:0x00de, B:30:0x00e4, B:32:0x00f4, B:33:0x0100), top: B:50:0x00de }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011f  */
    @Override // defpackage.eqc, defpackage.b66
    /* renamed from: apply */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo131apply(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ypc.mo131apply(java.lang.Object):java.lang.Object");
    }
}
