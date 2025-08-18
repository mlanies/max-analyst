package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.NetworkChangeDetector;
import org.webrtc.NetworkMonitor;
import org.webrtc.SessionDescription;

/* loaded from: classes2.dex */
public final class h7d extends yn1 implements qod, NetworkMonitor.NetworkObserver {
    public final i7b D0;
    public final pg4 E0;
    public final rod F0;
    public long G0;
    public long H0;
    public final d5f I0;
    public final hx9 J0;
    public final uj4 K0;

    public h7d(g7d g7dVar) {
        super(g7dVar.h, g7dVar.g, g7dVar.m, g7dVar.o, g7dVar.p, g7dVar.q, g7dVar.b, g7dVar.v, g7dVar.w, g7dVar.A);
        S(this + " ctor");
        rod rodVar = g7dVar.i;
        this.F0 = rodVar;
        this.E0 = g7dVar.c;
        this.D0 = g7dVar.r;
        rodVar.k.add(this);
        this.J0 = new hx9();
        d5f d5fVar = new d5f(g7dVar, this);
        this.I0 = d5fVar;
        this.K0 = new uj4(g7dVar.o, d5fVar);
        NetworkMonitor.getInstance().addObserver(this);
    }

    @Override // defpackage.yn1
    public final Map A() {
        int i;
        bwc bwcVar = this.I0.B0.b;
        if (bwcVar == null) {
            return null;
        }
        HashMap map = new HashMap();
        Iterator it = bwcVar.a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            vbg vbgVar = (vbg) entry.getValue();
            if (vbgVar != null) {
                t54 t54Var = vbgVar.g;
                long j = vbgVar.l.get();
                long j2 = vbgVar.m.get();
                long j3 = vbgVar.n.get();
                long j4 = vbgVar.o.get();
                Iterator it2 = it;
                HashMap map2 = map;
                long j5 = vbgVar.p.get();
                long j6 = vbgVar.q.get();
                long j7 = vbgVar.r.get();
                long j8 = vbgVar.s.get();
                long j9 = vbgVar.t.get();
                long j10 = vbgVar.y.get();
                long j11 = vbgVar.z.get();
                cue cueVar = vbgVar.u;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long j12 = (long) cueVar.b.b;
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                double dConvert = timeUnit.convert(j12, timeUnit2);
                double dConvert2 = timeUnit.convert((long) vbgVar.v.b.b, timeUnit2);
                double dConvert3 = timeUnit.convert((long) vbgVar.w.b.b, timeUnit2);
                double dConvert4 = timeUnit.convert((long) vbgVar.x.b.b, timeUnit2);
                if (t54Var != null && (i = t54Var.Y) != 1 && i != 2) {
                    throw null;
                }
                if (t54Var != null) {
                    t54Var.x0.get();
                }
                if (t54Var != null) {
                    t54Var.y0.get();
                }
                map = map2;
                map.put((bg1) entry.getKey(), new cwc(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, dConvert, dConvert2, dConvert3, dConvert4, (r36) vbgVar.A.o));
                it = it2;
            }
        }
        return map;
    }

    @Override // defpackage.yn1
    public final void C(y1e y1eVar) {
        ypc ypcVar = new ypc(this, 4, y1eVar);
        d5f d5fVar = this.I0;
        if (d5fVar.B0 != null) {
            nsa nsaVar = d5fVar.B0;
            nsaVar.getClass();
            nsaVar.i("getStats.legacy", new adg(nsaVar, new gsa(nsaVar, 2, ypcVar), 1));
        }
    }

    @Override // defpackage.yn1
    public final String D() {
        return "ServerCallTopology";
    }

    @Override // defpackage.yn1
    public final void E(bg1 bg1Var, List list, boolean z, ay0 ay0Var) {
        try {
            this.F0.h(f46.u(bg1Var, list, z), ay0Var);
        } catch (JSONException unused) {
            this.Y.reportException("ServerCallTopology", "server.topology.send.grantRoles", new Exception("server.topology.send.grantRoles"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fb  */
    @Override // defpackage.yn1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G() {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h7d.G():void");
    }

    @Override // defpackage.yn1
    public final void K(bg1 bg1Var, zad zadVar, boolean z, by0 by0Var) {
        try {
            this.F0.h(f46.v(bg1Var, zadVar, z), by0Var);
        } catch (JSONException unused) {
            this.Y.reportException("ServerCallTopology", "server.topology.send.pinParticipant", new Exception("server.topology.send.pinParticipant"));
        }
    }

    @Override // defpackage.yn1
    public final void L() {
        V(this + " release");
        NetworkMonitor.getInstance().removeObserver(this);
        this.a.removeCallbacksAndMessages(null);
        this.F0.k.remove(this);
        d5f d5fVar = this.I0;
        d5fVar.j();
        d5fVar.B0.p(true);
        super.L();
    }

    @Override // defpackage.yn1
    public final void M(long j, long j2) {
        chc chcVar = new chc(j, j2);
        this.o.A.d.b(this.Y, "ServerCallTopology", "send report-network-stat: " + chcVar);
        this.I0.B0.B().d(new ioc(new ioc(chcVar)));
    }

    @Override // defpackage.yn1
    public final void N(c4c c4cVar) {
        ArrayList arrayListV = j1e.v(c4cVar.c);
        if (arrayListV.isEmpty()) {
            return;
        }
        hxd hxdVar = (hxd) arrayListV.get(0);
        cz1 cz1VarC = c4cVar.c();
        if (cz1VarC != null) {
            ArrayList arrayListJ = j1e.J(arrayListV, cz1VarC);
            if (!arrayListJ.isEmpty()) {
                hxdVar = (hxd) arrayListJ.get(0);
            }
        }
        this.o.getClass();
        long j = hxdVar.o;
        if (j == this.G0 && hxdVar.p == this.H0) {
            return;
        }
        long j2 = hxdVar.p;
        if (j2 <= 0 || j <= 0) {
            return;
        }
        this.G0 = j;
        this.H0 = j2;
        ehc ehcVar = new ehc(j2, j);
        koc kocVarB = this.I0.B0.B();
        bqc bqcVar = new bqc(6, this);
        ioc iocVar = new ioc(ehcVar);
        iocVar.c = bqcVar;
        kocVarB.d(new ioc(iocVar));
    }

    @Override // defpackage.yn1
    public final void O(boolean z) {
        this.I0.B0.B().d(new ioc(new ioc(new nhc(z))));
        d5f d5fVar = this.I0;
        d5fVar.F0 = z;
        d5fVar.B0.u0 = d5fVar.F0;
    }

    @Override // defpackage.yn1
    public final void P(o1e o1eVar) {
        d5f d5fVar = this.I0;
        if (d5fVar.B0 != null) {
            nsa nsaVar = d5fVar.B0;
            nsaVar.getClass();
            nsaVar.i("getStats.new", new adg(nsaVar, new oj3(3, o1eVar), 1));
        }
    }

    @Override // defpackage.yn1
    public final void R(fp1 fp1Var, List list) {
        d5f d5fVar = this.I0;
        if (d5fVar.B0.E()) {
            d5fVar.B0.p1.p("video-" + fp1Var.b.c(), fp1Var, list);
        }
    }

    @Override // defpackage.yn1
    public final void T(List list) {
        S("updateDisplayLayouts, " + this);
        this.K0.a(list);
        this.J0.getClass();
        this.I0.p(hx9.n(list));
    }

    @Override // defpackage.yn1
    public final void U(ssa ssaVar) {
        d5f d5fVar = this.I0;
        d5fVar.y0 = ssaVar;
        if (d5fVar.B0 != null) {
            d5fVar.B0.I(d5fVar.y0);
        }
    }

    public final void W() {
        this.I0.i();
    }

    @Override // defpackage.yn1, defpackage.ii9
    public final void i(ji9 ji9Var) {
        d5f d5fVar = this.I0;
        d5fVar.B0.s(ji9Var);
        d5fVar.I0 = ji9Var;
    }

    @Override // defpackage.qod
    public final void j(JSONObject jSONObject) throws JSONException {
        String str;
        List listEmptyList;
        String string = jSONObject.getString("notification");
        if (!"producer-updated".equals(string)) {
            if ("consumer-answered".equals(string)) {
                this.I0.getClass();
                return;
            }
            return;
        }
        d5f d5fVar = this.I0;
        d5fVar.getClass();
        d5fVar.Y.log("UnifiedPeerConnection", "handleProducerUpdatedNotify, " + d5fVar + " " + jSONObject);
        String string2 = jSONObject.getString("sessionId");
        if (d5fVar.E0 && d5fVar.H0.contains(string2)) {
            d5fVar.Y.log("UnifiedPeerConnection", wg0.i("producer-updated contains expired sessionId: ", string2));
        } else {
            String string3 = jSONObject.getString("description");
            SessionDescription sessionDescription = new SessionDescription(SessionDescription.Type.OFFER, string3);
            Matcher matcher = d5f.J0.matcher(string3);
            HashSet hashSet = d5fVar.u0;
            hashSet.clear();
            while (matcher.find()) {
                hashSet.add(matcher.group(1));
            }
            if (!d5fVar.E0 || (str = d5fVar.G0) == null || str.equals(string2)) {
                if (d5fVar.B0.m1 && d5fVar.C0 != null) {
                    d5fVar.Y.log("UnifiedPeerConnection", "producer is stable but offerForProducer exists");
                    d5fVar.C0 = null;
                }
                if (d5fVar.B0.m1) {
                    d5fVar.Y.log("UnifiedPeerConnection", "set remote sdp=" + sessionDescription.type.canonicalForm() + " to " + d5fVar.B0);
                    d5fVar.B0.J(sessionDescription);
                } else {
                    d5fVar.Y.log("UnifiedPeerConnection", d5fVar.B0 + " is NOT STABLE, postpone set remote " + sessionDescription.type.canonicalForm() + " to it");
                    d5fVar.C0 = sessionDescription;
                }
            } else {
                d5fVar.H0.add(d5fVar.G0);
                d5fVar.Y.log("UnifiedPeerConnection", d5fVar.B0 + " is JUST RECREATED, postpone set remote " + sessionDescription.type.canonicalForm() + " to it");
                d5fVar.C0 = sessionDescription;
                d5fVar.j();
                d5fVar.i();
                if (d5fVar.B0 != null) {
                    d5fVar.B0.I(d5fVar.y0);
                }
                d5fVar.t0.e.c = false;
                if (!d5fVar.B0.E()) {
                    nsa nsaVar = d5fVar.B0;
                    if (d5fVar.a.d) {
                        h7d h7dVar = d5fVar.x0;
                        h7dVar.getClass();
                        listEmptyList = Collections.unmodifiableList(new ArrayList(h7dVar.t0));
                    } else {
                        listEmptyList = Collections.emptyList();
                    }
                    nsaVar.y(listEmptyList);
                }
            }
            d5fVar.G0 = string2;
        }
        S("resendDisplayLayouts, " + this);
        List list = this.K0.c;
        this.J0.getClass();
        this.I0.p(hx9.n(list));
        uj4 uj4Var = this.K0;
        uj4Var.e = true;
        uj4Var.a(uj4Var.c);
    }

    @Override // defpackage.yn1, defpackage.zy0
    public final void onActiveParticipantUpdated(yy0 yy0Var) {
        onActiveParticipantsRemoved(new xy0(yy0Var.a, Collections.emptyList()));
    }

    @Override // defpackage.yn1, defpackage.zy0
    public final void onActiveParticipantsAdded(uy0 uy0Var) {
    }

    @Override // defpackage.yn1, defpackage.zy0
    public final void onActiveParticipantsChanged(vy0 vy0Var) {
    }

    @Override // defpackage.yn1, defpackage.zy0
    public final void onActiveParticipantsDeAnonimized(wy0 wy0Var) {
    }

    @Override // defpackage.yn1, defpackage.zy0
    public final void onActiveParticipantsRemoved(xy0 xy0Var) {
        S("onCallParticipantsRemoved, " + xy0Var.a.size());
        for (fg1 fg1Var : xy0Var.a) {
            bg1 bg1Var = fg1Var.a;
            if (bg1Var != null) {
                d5f d5fVar = this.I0;
                if (d5fVar.B0.E()) {
                    d5fVar.B0.p1.e(bg1Var, "video-" + bg1Var.c());
                }
            }
            bg1 bg1Var2 = fg1Var.a;
            if (bg1Var2 != null) {
                uj4 uj4Var = this.K0;
                Set hashSet = (Set) uj4Var.d.get(bg1Var2);
                if (hashSet == null) {
                    hashSet = new HashSet();
                }
                adb adbVar = new adb(3);
                adbVar.a = bg1Var2;
                adbVar.b = olf.a;
                hashSet.add(adbVar.c());
                adb adbVar2 = new adb(3);
                adbVar2.a = bg1Var2;
                adbVar2.b = olf.b;
                hashSet.add(adbVar2.c());
                l7d l7dVar = new l7d();
                l7dVar.a = true;
                ArrayList arrayList = new ArrayList();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    arrayList.add(new m7d((fp1) it.next(), l7dVar));
                }
                d6f d6fVar = new d6f(arrayList, false);
                koc kocVarB = ((d5f) uj4Var.b).B0.B();
                tj4 tj4Var = new tj4(uj4Var, 2);
                tj4 tj4Var2 = new tj4(uj4Var, 3);
                ioc iocVar = new ioc(d6fVar);
                iocVar.c = tj4Var;
                iocVar.d = tj4Var2;
                kocVarB.d(new ioc(iocVar));
            }
        }
    }

    @Override // org.webrtc.NetworkMonitor.NetworkObserver
    public final void onConnectionTypeChanged(NetworkChangeDetector.ConnectionType connectionType) {
        S("onConnectionTypeChanged, " + this + ", type=" + connectionType);
        if (NetworkMonitor.isOnline()) {
            this.a.post(new f7d(this, 0));
        }
    }

    @Override // defpackage.yn1, defpackage.ep1
    public final void r(y8 y8Var) {
        d5f d5fVar = this.I0;
        pkf pkfVar = (pkf) y8Var.a;
        if (d5fVar.B0 != null) {
            nsa nsaVar = d5fVar.B0;
            nsaVar.getClass();
            Integer numValueOf = Integer.valueOf(pkfVar.c);
            rz3 rz3Var = nsaVar.o1;
            if (pkfVar.equals((pkf) ((a8d) rz3Var.i).b.get(numValueOf))) {
                return;
            }
            a8d a8dVar = (a8d) rz3Var.i;
            a8dVar.getClass();
            a8dVar.b.put(Integer.valueOf(pkfVar.c), pkfVar);
            nsaVar.K0.log("PCRTCClient", "updateVideoQuality, " + nsaVar + " update=" + pkfVar);
            nsaVar.i("updateVideoQuality", new adg(nsaVar, new gsa(nsaVar, 1, pkfVar), 1));
        }
    }

    @Override // defpackage.yn1
    public final Runnable w() {
        this.o.b.getClass();
        return new f7d(this, 1);
    }

    @Override // defpackage.yn1
    public final xxe y() {
        return xxe.c;
    }
}
