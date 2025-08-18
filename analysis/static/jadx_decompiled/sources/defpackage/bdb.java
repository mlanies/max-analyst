package defpackage;

import androidx.camera.core.ImageCaptureException;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.MediaStreamTrack;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.messages.video.fetcher.FetcherException;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class bdb implements mm0, a76, dke, gq1, obe, l3a {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ bdb(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:204:0x03a3, code lost:
    
        r1.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0123, code lost:
    
        r0 = r5;
        r3 = 2;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0362 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    @Override // defpackage.obe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void G(byte[] r20, int r21, int r22, defpackage.nbe r23, defpackage.pj3 r24) {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdb.G(byte[], int, int, nbe, pj3):void");
    }

    @Override // defpackage.obe
    public int J() {
        return 1;
    }

    @Override // defpackage.a76
    public void a(Object obj) {
        n05 n05Var;
        switch (this.a) {
            case 2:
                n05 n05Var2 = (n05) obj;
                Objects.toString(n05Var2);
                if (n05Var2 != null) {
                    adc adcVar = (adc) this.c;
                    ScheduledFuture scheduledFuture = adcVar.Y;
                    if (scheduledFuture != null && scheduledFuture.cancel(false) && (n05Var = adcVar.F) != null && n05Var == n05Var2) {
                        adc.r(n05Var);
                    }
                    adcVar.b0 = (zm4) this.b;
                    adcVar.A(null);
                    adcVar.v(adcVar.o());
                    break;
                }
                break;
            default:
                ((vje) this.c).b.E();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.ybe b(long r19, java.util.ArrayList r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, defpackage.r7b r25, int r26) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdb.b(long, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String, r7b, int):ybe");
    }

    public void c(JSONObject jSONObject) {
        ylc ylcVar;
        l7b l7bVar = (l7b) this.c;
        l7bVar.getClass();
        try {
            bg1 bg1VarA = bg1.a(jSONObject.getString("initiatorId"));
            String strT = f8.t(jSONObject, "sharedUrl");
            ((yb9) l7bVar.c).getClass();
            ylcVar = new ylc(bg1VarA, strT, yb9.e(jSONObject));
        } catch (JSONException e) {
            ((a4c) l7bVar.b).logException("UrlSharingParser", "Can't parse url sharing", e);
            ylcVar = null;
        }
        if (ylcVar == null) {
            return;
        }
        String str = ylcVar.b;
        ((j9f) this.b).onUrlSharingInfoUpdated(new zn1(ylcVar.c, str != null ? new jpd(ylcVar.a, str) : null));
    }

    @Override // defpackage.a76
    public void d(Throwable th) {
        switch (this.a) {
            case 2:
                Objects.toString(th);
                break;
            default:
                h7b h7bVar = (h7b) this.b;
                if (!((yhc) h7bVar.c).g) {
                    int iA = ((kz1) ((List) h7bVar.b).get(0)).a();
                    boolean z = th instanceof ImageCaptureException;
                    vje vjeVar = (vje) this.c;
                    if (z) {
                        jc6 jc6Var = vjeVar.c;
                        ec0 ec0Var = new ec0(iA, (ImageCaptureException) th);
                        jc6Var.getClass();
                        kq0.e();
                        ((y90) jc6Var.X).k.accept(ec0Var);
                    } else {
                        jc6 jc6Var2 = vjeVar.c;
                        ec0 ec0Var2 = new ec0(iA, new ImageCaptureException("Failed to submit capture request", th));
                        jc6Var2.getClass();
                        kq0.e();
                        ((y90) jc6Var2.X).k.accept(ec0Var2);
                    }
                    vjeVar.b.E();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.dke
    public void e(gle gleVar) {
        z9c z9cVar;
        int iIndexOf;
        int iIndexOf2;
        int i = 17;
        int i2 = 29;
        int i3 = 3;
        int i4 = 20;
        int i5 = 2;
        int i6 = 1;
        int i7 = 0;
        yoa yoaVar = (yoa) this.b;
        short s = yoaVar.d;
        yb9 yb9Var = sla.c;
        v9d v9dVar = (v9d) this.c;
        if (s == 1) {
            wle wleVar = (wle) v9dVar.b.u;
            wleVar.getClass();
            hm9.n("wle", "onPing");
            mle mleVar = wleVar.o;
            if (mleVar != null) {
                ((yle) ((tle) mleVar).x0.getValue()).h();
            }
            x9d.c(v9dVar.b, new yoa((byte) 1, yoaVar.c, yoaVar.d, yoa.h, 0));
            return;
        }
        if (s == 2) {
            wle wleVar2 = (wle) v9dVar.b.u;
            wleVar2.getClass();
            wleVar2.a(new vle(wleVar2, i5, (s44) gleVar));
            return;
        }
        if (s == 20) {
            wle wleVar3 = (wle) v9dVar.b.u;
            if (wleVar3.o != null) {
                hm9.n("wle", "onLogout");
                ((ExecutorService) ((tle) wleVar3.o).y0.getValue()).execute(new ule(i7, wleVar3));
                return;
            }
            return;
        }
        if (s == 3) {
            boolean z = gleVar == gle.b;
            bs9 bs9Var = v9dVar.b.u;
            if (z) {
                z9cVar = new z9c();
                z9cVar.o = true;
            } else {
                z9cVar = (z9c) gleVar;
            }
            wle wleVar4 = (wle) bs9Var;
            wleVar4.getClass();
            String strSubstring = null;
            hm9.m("wle", "onReconnect: host=%s port=%s", (oag.t(z9cVar.c) || (iIndexOf2 = z9cVar.c.indexOf(":")) <= 0) ? null : z9cVar.c.substring(0, iIndexOf2), z9cVar.c());
            if (!oag.t(z9cVar.c)) {
                p7b p7bVar = (p7b) wleVar4.a;
                t33 t33Var = p7bVar.a;
                if (!oag.t(z9cVar.c) && (iIndexOf = z9cVar.c.indexOf(":")) > 0) {
                    strSubstring = z9cVar.c.substring(0, iIndexOf);
                }
                t33Var.m("server.host", strSubstring);
                p7bVar.a.m("server.port", z9cVar.c());
                p7bVar.a.j("server.useTls", z9cVar.o);
            }
            tle tleVar = (tle) wleVar4.o;
            tleVar.getClass();
            hm9.n(tle.B0, "restart");
            x9d x9dVar = (x9d) ((yle) tleVar.x0.getValue()).Y.get();
            if (x9dVar != null) {
                x9dVar.q(false);
            }
            ((ExecutorService) tleVar.z0.getValue()).execute(new u3c(i2, tleVar));
            return;
        }
        sla slaVar = sla.L1;
        if (s == slaVar.a) {
            uxc uxcVar = v9dVar.b.o;
            uxcVar.getClass();
            if (((t33) ((q33) uxcVar.a.c(q33.class))).G()) {
                return;
            }
            hs9 hs9Var = (hs9) gleVar;
            x9d x9dVar2 = v9dVar.b;
            gs9 gs9Var = new gs9(slaVar, i7);
            gs9Var.i(hs9Var.c, ApiProtocol.PARAM_CHAT_ID);
            fs8 fs8Var = hs9Var.X;
            gs9Var.i(fs8Var.a, "messageId");
            if (fs8Var.u0 == fy8.GROUP) {
                gs9Var.p("chatType", "GROUP_CHAT");
            }
            x9d.c(x9dVar2, yoa.a(gs9Var, (byte) 1, yoaVar.c));
            wle wleVar5 = (wle) v9dVar.b.u;
            wleVar5.getClass();
            wleVar5.a(new p00(wleVar5, 27, hs9Var));
            return;
        }
        if (s == sla.N1.a) {
            wle wleVar6 = (wle) v9dVar.b.u;
            wleVar6.getClass();
            wleVar6.a(new p00(wleVar6, 25, (es9) gleVar));
            ((yle) ((tle) wleVar6.o).x0.getValue()).h();
            return;
        }
        if (s == sla.M1.a) {
            wle wleVar7 = (wle) v9dVar.b.u;
            wleVar7.getClass();
            wleVar7.a(new p00(wleVar7, 21, (at9) gleVar));
            return;
        }
        if (s == sla.P1.a) {
            wle wleVar8 = (wle) v9dVar.b.u;
            wleVar8.getClass();
            wleVar8.a(new p00(wleVar8, i2, (xs9) gleVar));
            return;
        }
        if (s == sla.O1.a) {
            wle wleVar9 = (wle) v9dVar.b.u;
            wleVar9.getClass();
            wleVar9.a(new p00(wleVar9, 16, (vr9) gleVar));
            return;
        }
        if (s == sla.Q1.a) {
            wle wleVar10 = (wle) v9dVar.b.u;
            wleVar10.getClass();
            wleVar10.a(new p00(wleVar10, i, (tr9) gleVar));
            return;
        }
        if (s == sla.R1.a) {
            wle wleVar11 = (wle) v9dVar.b.u;
            wleVar11.getClass();
            wleVar11.a(new p00(wleVar11, i4, (rr9) gleVar));
            return;
        }
        if (s == sla.S1.a) {
            wle wleVar12 = (wle) v9dVar.b.u;
            wleVar12.getClass();
            wleVar12.a(new p00(wleVar12, 26, (nr9) gleVar));
            return;
        }
        if (s == sla.T1.a) {
            or9 or9Var = (or9) gleVar;
            wle wleVar13 = (wle) v9dVar.b.u;
            if (((n6a) wleVar13.j.getValue()).a()) {
                return;
            }
            wleVar13.a(new vle(wleVar13, i3, new yg1(or9Var.X, or9Var.Y, or9Var.c, "", "", or9Var.t0 == 3, or9Var.o)));
            return;
        }
        if (s == sla.U1.a) {
            wle wleVar14 = (wle) v9dVar.b.u;
            wleVar14.getClass();
            wleVar14.a(new p00(wleVar14, 22, (wr9) gleVar));
            return;
        }
        if (s == sla.V1.a) {
            wle wleVar15 = (wle) v9dVar.b.u;
            wleVar15.getClass();
            wleVar15.a(new vle(wleVar15, 4, (ss9) gleVar));
            return;
        }
        if (s == sla.W1.a) {
            wle wleVar16 = (wle) v9dVar.b.u;
            wleVar16.getClass();
            wleVar16.a(new p00(wleVar16, 18, (qs9) gleVar));
            return;
        }
        if (s == sla.X1.a) {
            wle wleVar17 = (wle) v9dVar.b.u;
            wleVar17.getClass();
            wleVar17.a(new vle(wleVar17, i7, (us9) gleVar));
            return;
        }
        if (s == sla.Y1.a) {
            wle wleVar18 = (wle) v9dVar.b.u;
            wleVar18.getClass();
            wleVar18.a(new p00(wleVar18, 13, (ws9) gleVar));
            return;
        }
        if (s == sla.Z1.a) {
            wle wleVar19 = (wle) v9dVar.b.u;
            wleVar19.getClass();
            wleVar19.a(new p00(wleVar19, 24, (pr9) gleVar));
            return;
        }
        if (s == sla.d2.a) {
            wle wleVar20 = (wle) v9dVar.b.u;
            wleVar20.getClass();
            wleVar20.a(new e5(i, wleVar20));
            return;
        }
        if (s == sla.c2.a) {
            wle wleVar21 = (wle) v9dVar.b.u;
            wleVar21.getClass();
            wleVar21.a(new p00(wleVar21, 15, (cs9) gleVar));
            return;
        }
        if (s == sla.e2.a) {
            wle wleVar22 = (wle) v9dVar.b.u;
            wleVar22.getClass();
            wleVar22.a(new p00(wleVar22, 28, (mr9) gleVar));
            return;
        }
        if (s == sla.f2.a) {
            wle wleVar23 = (wle) v9dVar.b.u;
            wleVar23.getClass();
            wleVar23.a(new vle(wleVar23, i6, (yr9) gleVar));
            return;
        }
        if (s == sla.g2.a) {
            wle wleVar24 = (wle) v9dVar.b.u;
            wleVar24.getClass();
            wleVar24.a(new p00(wleVar24, 19, (zr9) gleVar));
            return;
        }
        if (s == sla.l2.a) {
            wle wleVar25 = (wle) v9dVar.b.u;
            wleVar25.getClass();
            wleVar25.a(new p00(wleVar25, 14, (ks9) gleVar));
        } else if (s == sla.m2.a) {
            wle wleVar26 = (wle) v9dVar.b.u;
            wleVar26.getClass();
            wleVar26.a(new p00(wleVar26, 23, (ys9) gleVar));
        } else {
            sla.c.getClass();
            String strConcat = "Illegal state in handleNotif, unknown opcode ".concat(yb9.c(s));
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(strConcat);
            hm9.p(v9dVar.b.a, strConcat, illegalArgumentException);
            v9dVar.b.o(illegalArgumentException);
        }
    }

    @Override // defpackage.mm0
    public void f() {
        byte[] bArr = maf.f;
        yaf yafVar = (yaf) this.c;
        yafVar.getClass();
        yafVar.F(bArr.length, bArr);
    }

    @Override // defpackage.dke
    public void g(pke pkeVar) {
        IllegalStateException illegalStateException = new IllegalStateException("illegal state in handleNotif, onFail", pkeVar.X);
        v9d v9dVar = (v9d) this.c;
        hm9.p(v9dVar.b.a, "illegal state in handleNotif, onFail", illegalStateException);
        v9dVar.b.o(illegalStateException);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011c A[EDGE_INSN: B:64:0x011c->B:50:0x011c BREAK  A[LOOP:1: B:36:0x00e3->B:49:0x010b], SYNTHETIC] */
    @Override // defpackage.mm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.lm0 h(defpackage.ra4 r17, long r18) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdb.h(ra4, long):lm0");
    }

    @Override // defpackage.dke
    public long i() {
        return 0L;
    }

    public yzd j(l7g l7gVar) {
        yzd yzdVar;
        synchronized (this.b) {
            yzdVar = (yzd) ((LinkedHashMap) this.c).remove(l7gVar);
        }
        return yzdVar;
    }

    public List k(String str) {
        List listD0;
        synchronized (this.b) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (tpa.f(((l7g) entry.getKey()).a, str)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap2.keySet().iterator();
                while (it.hasNext()) {
                    ((LinkedHashMap) this.c).remove((l7g) it.next());
                }
                listD0 = x53.D0(linkedHashMap2.values());
            } catch (Throwable th) {
                throw th;
            }
        }
        return listD0;
    }

    @Override // defpackage.l3a
    public void l(Task task) {
        mkg mkgVar = (mkg) this.b;
        qne qneVar = (qne) this.c;
        synchronized (mkgVar.f) {
            mkgVar.e.remove(qneVar);
        }
    }

    @Override // defpackage.gq1
    public void m(b8c b8cVar, yic yicVar) throws NumberFormatException {
        int i;
        boolean zM = yicVar.m();
        l7b l7bVar = (l7b) this.b;
        if (!zM) {
            ((qq9) this.c).getClass();
            int i2 = yicVar.o;
            if (i2 == 403) {
                new IOException("Video has restricted playback");
            } else if (i2 != 404) {
                new IOException("An unknown error occurred");
            } else {
                new IOException("Video could not be found");
            }
            l7bVar.j();
            return;
        }
        String strU = yicVar.Z.U();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(strU);
            JSONObject jSONObject2 = jSONObject.getJSONObject(MediaStreamTrack.VIDEO_TRACK_KIND);
            jSONObject2.getLong("duration");
            jSONObject2.getString("title");
            JSONObject jSONObject3 = jSONObject2.getJSONObject("owner");
            jSONObject3.optString("account_type");
            jSONObject3.optString("name");
            jSONObject3.optString("img");
            jSONObject3.optString("img_2x");
            jSONObject3.optString("url");
            jSONObject3.optLong("id");
            JSONObject jSONObject4 = jSONObject2.getJSONObject("thumbs");
            Iterator<String> itKeys = jSONObject4.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map2.put(next, jSONObject4.getString(next));
            }
            JSONArray jSONArray = jSONObject.getJSONObject("request").getJSONObject("files").getJSONArray("progressive");
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                JSONObject jSONObject5 = jSONArray.getJSONObject(i3);
                map.put(jSONObject5.getString("quality"), jSONObject5.getString("url"));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        nqd nqdVar = (nqd) ((sqd) l7bVar.b);
        if (nqdVar.h()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            try {
                i = Integer.parseInt(str.replace("p", ""));
            } catch (Exception e2) {
                hm9.p("ypf", "failed to parse quality string: " + str, e2);
                i = 0;
            }
            arrayList.add(new df5(3, -1, i, 0, (String) entry.getValue()));
        }
        if (arrayList.isEmpty()) {
            nqdVar.onError(new FetcherException(4, "No supported quality"));
        }
        ((ypf) l7bVar.c).getClass();
        nqdVar.a(new ff5("Vimeo", arrayList));
    }

    public yzd o(l7g l7gVar) {
        yzd yzdVar;
        synchronized (this.b) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
                Object yzdVar2 = linkedHashMap.get(l7gVar);
                if (yzdVar2 == null) {
                    yzdVar2 = new yzd(l7gVar);
                    linkedHashMap.put(l7gVar, yzdVar2);
                }
                yzdVar = (yzd) yzdVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return yzdVar;
    }

    @Override // defpackage.gq1
    public void q(b8c b8cVar, IOException iOException) {
        ((l7b) this.b).j();
    }

    public String toString() {
        switch (this.a) {
            case 11:
                return ((String) this.b) + ", " + ((String) this.c);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ bdb(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public bdb(pkg pkgVar, rw4 rw4Var, int i) {
        this.a = 15;
        this.c = pkgVar;
        this.b = rw4Var;
    }

    public bdb(q6d q6dVar) {
        this.a = 12;
        this.b = q6dVar;
        this.c = new AtomicInteger(0);
    }

    public bdb(int i) {
        this.a = i;
        switch (i) {
            case 6:
                this.b = new Object();
                this.c = new LinkedHashMap();
                break;
            case 9:
                this.b = new ConcurrentHashMap();
                this.c = new ReferenceQueue();
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                this.b = new wpa();
                this.c = new d4g();
                break;
        }
    }

    public bdb(sue sueVar) {
        this.a = 1;
        this.b = sueVar;
        this.c = new yaf(3, false);
    }
}
