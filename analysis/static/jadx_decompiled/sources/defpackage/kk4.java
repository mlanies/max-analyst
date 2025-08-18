package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.IceCandidate;
import org.webrtc.NetworkChangeDetector;
import org.webrtc.NetworkMonitor;
import org.webrtc.PeerConnection;
import org.webrtc.SessionDescription;

/* loaded from: classes2.dex */
public final class kk4 extends yn1 implements qod, msa, NetworkMonitor.NetworkObserver {
    public final bg4 D0;
    public final Context E0;
    public final rod F0;
    public final pg4 G0;
    public final qld H0;
    public final ExecutorService I0;
    public final HashMap J0;
    public final HashMap K0;
    public final HashMap L0;
    public final td M0;
    public final HashMap N0;
    public final HashMap O0;
    public final o9g P0;
    public final vte Q0;
    public final poc R0;
    public final qoa S0;
    public final ik4 T0;
    public final boolean U0;

    public kk4(jk4 jk4Var) {
        super(jk4Var.h, jk4Var.g, jk4Var.j, jk4Var.k, jk4Var.l, jk4Var.m, jk4Var.b, jk4Var.q, jk4Var.r, null);
        this.J0 = new HashMap();
        this.K0 = new HashMap();
        this.L0 = new HashMap();
        this.N0 = new HashMap();
        this.O0 = new HashMap();
        this.T0 = new ik4(this, 1);
        S(this + " ctor");
        this.P0 = jk4Var.o;
        this.Q0 = jk4Var.t;
        this.M0 = new td(jk4Var.k);
        this.E0 = jk4Var.e;
        rod rodVar = jk4Var.i;
        this.F0 = rodVar;
        this.H0 = jk4Var.a;
        this.I0 = jk4Var.d;
        this.G0 = jk4Var.c;
        this.U0 = jk4Var.n;
        this.D0 = jk4Var.p;
        rodVar.k.add(this);
        this.R0 = jk4Var.s;
        Iterator it = this.v0.i().iterator();
        while (it.hasNext()) {
            this.J0.put(((fg1) it.next()).a, X());
        }
        uf0 uf0Var = this.o.A;
        sf0 sf0Var = uf0Var.d;
        qoa qoaVar = this.S0;
        qoa qoaVar2 = null;
        if (qoaVar != null) {
            qoaVar.f.invoke("stop reporter");
            sd7 sd7Var = qoaVar.g;
            if (sd7Var != null) {
                dm4.a(sd7Var);
            }
            qoaVar.g = null;
            qoaVar.h = null;
        }
        a4c a4cVar = this.Y;
        jy2 jy2Var = new jy2(10, this);
        ga gaVar = new ga(this, 12, sf0Var);
        dhc dhcVar = uf0Var.b;
        if (dhcVar != null) {
            ey3 ey3Var = new ey3(uf0Var, 2, a4cVar);
            rx0 rx0Var = uf0Var.a;
            qoaVar2 = new qoa(dhcVar, rx0Var != null ? new moa(rx0Var, ey3Var) : new oq9(14), a4cVar, jy2Var, gaVar, ey3Var);
        }
        this.S0 = qoaVar2;
        if (qoaVar2 != null) {
            ztc ztcVarA = ce.a();
            qoaVar2.f.invoke("start reporter");
            sd7 sd7Var2 = qoaVar2.g;
            if (sd7Var2 != null) {
                dm4.a(sd7Var2);
            }
            qoaVar2.h = ztcVarA;
            r0a r0aVarN = qy9.l(qoaVar2.a.b, TimeUnit.MILLISECONDS).n(ztcVarA);
            ccg ccgVar = new ccg(qoaVar2, 0);
            ccg ccgVar2 = new ccg(qoaVar2, 1);
            sd7 sd7Var3 = new sd7(new gpf(qoaVar2), new hgf(qoaVar2), ft.d);
            Objects.requireNonNull(sd7Var3, "observer is null");
            try {
                wz9 wz9Var = new wz9(sd7Var3, ccgVar2, 1);
                Objects.requireNonNull(wz9Var, "observer is null");
                try {
                    r0aVarN.a(new d0a(wz9Var, ccgVar, 1));
                    qoaVar2.g = sd7Var3;
                } catch (NullPointerException e) {
                    throw e;
                } catch (Throwable th) {
                    c37.B(th);
                    j47.Z(th);
                    NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
                    nullPointerException.initCause(th);
                    throw nullPointerException;
                }
            } catch (NullPointerException e2) {
                throw e2;
            } catch (Throwable th2) {
                c37.B(th2);
                j47.Z(th2);
                NullPointerException nullPointerException2 = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
                nullPointerException2.initCause(th2);
                throw nullPointerException2;
            }
        }
        NetworkMonitor.getInstance().addObserver(this);
    }

    public static bg1 W(nsa nsaVar, HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() == nsaVar) {
                return (bg1) entry.getKey();
            }
        }
        return null;
    }

    @Override // defpackage.yn1
    public final void C(y1e y1eVar) {
        jb9.e();
        for (Map.Entry entry : this.K0.entrySet()) {
            bg1 bg1Var = (bg1) entry.getKey();
            nsa nsaVar = (nsa) entry.getValue();
            u00 u00Var = new u00(this, bg1Var, y1eVar, 7);
            nsaVar.getClass();
            nsaVar.i("getStats.legacy", new adg(nsaVar, new gsa(nsaVar, 2, u00Var), 1));
        }
    }

    @Override // defpackage.yn1
    public final String D() {
        return "DirectCallTopology";
    }

    @Override // defpackage.yn1
    public final void E(bg1 bg1Var, List list, boolean z, ay0 ay0Var) {
        try {
            this.F0.h(f46.u(bg1Var, list, z), ay0Var);
        } catch (JSONException unused) {
            this.Y.logException("DirectCallTopology", "direct.topology.send.grantRoles", new Exception("direct.topology.send.grantRoles"));
        }
    }

    @Override // defpackage.yn1
    public final void F() {
        v("handleIceApplyPermissionChanged, " + this + ", isPermitted=true");
        td tdVar = this.M0;
        tdVar.b = true;
        if (I()) {
            for (Map.Entry entry : this.K0.entrySet()) {
                fg1 fg1VarZ = z((bg1) entry.getKey());
                if (fg1VarZ != null) {
                    tdVar.b(fg1VarZ, (nsa) entry.getValue());
                }
            }
        }
    }

    @Override // defpackage.yn1
    public final void G() {
        StringBuilder sb = new StringBuilder("handleStateChanged, ");
        sb.append(this);
        sb.append(", state=");
        String strB = yn1.B(1);
        sb.append(strB);
        S(sb.toString());
        boolean zI = I();
        rod rodVar = this.F0;
        if (zI) {
            this.Y.log("DirectCallTopology", "enable processing signaling replies in " + strB + " state");
            rodVar.k.add(this);
            U(this.B0);
        } else {
            V("disable processing signaling replies in " + strB + " state");
            rodVar.k.remove(this);
        }
        a0();
    }

    @Override // defpackage.yn1
    public final void K(bg1 bg1Var, zad zadVar, boolean z, by0 by0Var) {
        try {
            this.F0.h(f46.v(bg1Var, zadVar, z), by0Var);
        } catch (JSONException unused) {
            this.Y.logException("DirectCallTopology", "direct.topology.send.pinParticipant", new Exception("direct.topology.send.pinParticipant"));
        }
    }

    @Override // defpackage.yn1
    public final void L() {
        V(this + " release");
        NetworkMonitor.getInstance().removeObserver(this);
        this.a.removeCallbacksAndMessages(null);
        this.F0.k.remove(this);
        HashMap map = this.J0;
        for (nsa nsaVar : map.values()) {
            nsaVar.Z0 = null;
            nsaVar.p(true);
        }
        HashMap map2 = this.K0;
        for (nsa nsaVar2 : map2.values()) {
            nsaVar2.Z0 = null;
            nsaVar2.p(true);
        }
        map.clear();
        map2.clear();
        this.L0.clear();
        ((HashMap) this.M0.c).clear();
        this.N0.clear();
        this.O0.clear();
        qoa qoaVar = this.S0;
        if (qoaVar != null) {
            qoaVar.f.invoke("stop reporter");
            sd7 sd7Var = qoaVar.g;
            if (sd7Var != null) {
                dm4.a(sd7Var);
            }
            qoaVar.g = null;
            qoaVar.h = null;
        }
        super.L();
    }

    @Override // defpackage.yn1
    public final void P(o1e o1eVar) {
        jb9.e();
        Iterator it = this.K0.entrySet().iterator();
        while (it.hasNext()) {
            nsa nsaVar = (nsa) ((Map.Entry) it.next()).getValue();
            nsaVar.getClass();
            nsaVar.i("getStats.new", new adg(nsaVar, new oj3(3, o1eVar), 1));
        }
    }

    @Override // defpackage.yn1
    public final void Q(List list) {
        S("setIceServers, " + this);
        super.Q(list);
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(this.t0));
        for (nsa nsaVar : this.K0.values()) {
            nsaVar.getClass();
            nsaVar.K0.log("PCRTCClient", "setConfig, servers=" + listUnmodifiableList + ", " + nsaVar);
            nsaVar.i("setConfig", new adg(nsaVar, new gsa(nsaVar, 4, listUnmodifiableList), 1));
        }
    }

    @Override // defpackage.yn1
    public final void R(fp1 fp1Var, List list) {
        S("setRemoteVideoRenderers, " + this + ", " + fp1Var);
        jb9.e();
        nsa nsaVar = (nsa) this.K0.get(fp1Var.b);
        if (nsaVar == null) {
            V("peer connection not found for " + fp1Var);
            return;
        }
        String str = (String) this.L0.get(fp1Var.b);
        if (!TextUtils.isEmpty(str)) {
            nsaVar.p1.p(str, fp1Var, list);
            return;
        }
        V(this + ": video track not found for " + fp1Var);
    }

    @Override // defpackage.yn1
    public final void U(ssa ssaVar) {
        Iterator it = this.K0.entrySet().iterator();
        while (it.hasNext()) {
            nsa nsaVar = (nsa) ((Map.Entry) it.next()).getValue();
            if (nsaVar != null) {
                nsaVar.I(ssaVar);
                return;
            }
        }
    }

    public final nsa X() {
        psa psaVar;
        v("> createPeerConnectionClient, " + this);
        lsa lsaVar = new lsa();
        lsaVar.a = this.H0;
        lsaVar.b = this.s0;
        lsaVar.c = this.I0;
        lsaVar.e = this.E0;
        lsaVar.q = 0;
        lsaVar.f = this.X;
        lsaVar.g = this.Y;
        ag1 ag1Var = this.o;
        lsaVar.d = ag1Var;
        lsaVar.r = this.U0;
        lsaVar.w = this.P0;
        lsaVar.n = ag1Var.p;
        lsaVar.o = ag1Var.q;
        lsaVar.p = ag1Var.r;
        lsaVar.t = nsa.A().a;
        qsa qsaVarA = nsa.A();
        boolean z = true;
        if (!qsaVarA.i && ((psaVar = qsaVarA.j) == null || !psaVar.a)) {
            z = false;
        }
        lsaVar.u = z;
        lsaVar.v = ag1Var.B.g;
        bg4 bg4Var = this.D0;
        kad kadVar = (kad) bg4Var.o;
        lsaVar.y = new ni(bg4Var, kadVar);
        lsaVar.x = new kj(bg4Var, kadVar, null);
        ((bi) bg4Var.c).getClass();
        lsaVar.z = 4;
        lsaVar.B = false;
        lsaVar.C = this.Q0;
        lsaVar.D = this.C0;
        nsa nsaVarA = lsaVar.a();
        nsaVarA.Z0 = this;
        nsaVarA.V0 = null;
        nsaVarA.W0 = false;
        nsaVarA.a1 = null;
        nsaVarA.b1 = null;
        nsaVarA.c1 = null;
        nsaVarA.e1 = null;
        nsaVarA.i("createPeerConnectionFactoryInternal", new csa(nsaVarA, 2));
        v("< createPeerConnectionClient, " + this);
        return nsaVarA;
    }

    public final void Y(fg1 fg1Var) {
        S("maybeProcessRemoteAnswers, for " + fg1Var);
        if (!fg1Var.b()) {
            V(fg1Var + " still not accepted call");
            return;
        }
        cbg cbgVar = (cbg) this.O0.get(fg1Var.a);
        if (cbgVar == null || !cbgVar.e) {
            return;
        }
        HashMap map = cbgVar.a;
        SessionDescription sessionDescription = (SessionDescription) map.get(fg1Var.j);
        if (sessionDescription != null) {
            StringBuilder sb = new StringBuilder("Found answer for ");
            sb.append(fg1Var);
            sb.append(", peerid=");
            this.Y.log("DirectCallTopology", zr6.l(sb, (String) fg1Var.j.a, ", apply it"));
            cbgVar.c = sessionDescription;
            map.clear();
            ((nsa) this.K0.get(fg1Var.a)).J(sessionDescription);
        }
    }

    public final void Z(nsa nsaVar, PeerConnection.IceConnectionState iceConnectionState) {
        S("maybeRestart, " + this);
        if (!I()) {
            V(this + ": is not active yet");
            return;
        }
        if (!NetworkMonitor.isOnline()) {
            V("No net connectivity");
            return;
        }
        if (iceConnectionState == PeerConnection.IceConnectionState.FAILED) {
            v(nsaVar + " has " + iceConnectionState + " state");
            if (!nsaVar.E() || !nsaVar.m1) {
                V(nsaVar + " not ready or not stable");
                return;
            }
            cbg cbgVar = (cbg) this.O0.get(W(nsaVar, this.K0));
            if (cbgVar == null || cbgVar.d) {
                return;
            }
            V("Ice failed, restart " + nsaVar);
            cbgVar.d = true;
            cbgVar.e = false;
            cbgVar.c = null;
            cbgVar.a.clear();
            nsaVar.x(true);
        }
    }

    @Override // defpackage.msa
    public final void a(nsa nsaVar, SessionDescription sessionDescription) {
        S("onPeerConnectionRemoteDescription, " + this + ", type=" + sessionDescription.type + ", " + nsaVar);
        bg1 bg1VarW = W(nsaVar, this.K0);
        if (sessionDescription.type != SessionDescription.Type.OFFER || this.N0.get(bg1VarW) == null) {
            return;
        }
        nsaVar.w();
    }

    public final void a0() {
        S("maybeCreateConnection, " + this);
        if (!I()) {
            this.Y.log("DirectCallTopology", this + ": is not active yet");
            return;
        }
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(this.t0));
        for (nsa nsaVar : this.J0.values()) {
            if (!nsaVar.E() && !nsaVar.j1) {
                nsaVar.y(listUnmodifiableList);
            }
        }
        c0();
        b0();
    }

    @Override // defpackage.msa
    public final void b(nsa nsaVar) {
        S("onPeerConnectionRenegotiationNeeded, " + this + ", " + nsaVar);
    }

    public final void b0() {
        nsa nsaVar;
        S("maybeProcessSelfAnswers");
        if (!I()) {
            V(this + ": is not active yet");
            return;
        }
        for (Map.Entry entry : this.N0.entrySet()) {
            bg1 bg1Var = (bg1) entry.getKey();
            cbg cbgVar = (cbg) entry.getValue();
            if (cbgVar.b == null) {
                throw new IllegalStateException("Offer not found for participant=" + bg1Var);
            }
            if (!cbgVar.d && !cbgVar.e && (nsaVar = (nsa) this.K0.get(bg1Var)) != null) {
                this.Y.log("DirectCallTopology", this + ": start processing scheduled answer for participant=" + bg1Var);
                cbgVar.d = true;
                nsaVar.J(cbgVar.b);
            }
        }
    }

    @Override // defpackage.msa
    public final void c(nsa nsaVar) {
        xn1 xn1Var;
        S("onPeerConnectionCreated, " + this + ", " + nsaVar);
        HashMap map = this.J0;
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getValue() == nsaVar) {
                map.remove(entry.getKey());
                if (this.B0 != null) {
                    ((nsa) entry.getValue()).I(this.B0);
                }
                this.K0.put((bg1) entry.getKey(), (nsa) entry.getValue());
            }
        }
        a0();
        if (map.size() != 0 || (xn1Var = this.y0) == null) {
            return;
        }
        ((py0) xn1Var).z(this);
    }

    public final void c0() {
        nsa nsaVar;
        S("maybeProcessSelfOffers");
        if (!I()) {
            V(this + ": is not active yet");
            return;
        }
        for (Map.Entry entry : this.O0.entrySet()) {
            bg1 bg1Var = (bg1) entry.getKey();
            cbg cbgVar = (cbg) entry.getValue();
            if (!cbgVar.d && !cbgVar.e && (nsaVar = (nsa) this.K0.get(bg1Var)) != null) {
                this.Y.log("DirectCallTopology", this + ": start processing scheduled offer for participant=" + bg1Var);
                cbgVar.d = true;
                cbgVar.a.clear();
                cbgVar.c = null;
                nsaVar.x(false);
            }
        }
    }

    @Override // defpackage.msa
    public final void d() {
        this.Y.logException("DirectCallTopology", "direct.topology.create.sdp.failed", new Exception("direct.topology.create.sdp.failed"));
    }

    @Override // defpackage.msa
    public final void e(String str) {
    }

    @Override // defpackage.msa
    public final void f() {
        this.Y.logException("DirectCallTopology", "direct.topology.set.sdp.failed", new Exception("direct.topology.set.sdp.failed"));
    }

    @Override // defpackage.msa
    public final void g(nsa nsaVar, String str) {
        bg1 bg1Var;
        S("onPeerConnectionRemoteVideoTrackAdded, " + this + ", track=" + str + ", " + nsaVar);
        fg1 fg1VarZ = z(W(nsaVar, this.K0));
        if (fg1VarZ == null || (bg1Var = fg1VarZ.a) == null) {
            V(this + ": participant not found for " + jb9.c(nsaVar));
            return;
        }
        this.L0.put(bg1Var, str);
        bg1 bg1Var2 = fg1VarZ.a;
        pg4 pg4Var = this.G0;
        if (pg4Var.isEnabled()) {
            Map remoteVideoRenderers = pg4Var.getRemoteVideoRenderers(bg1Var2);
            for (fp1 fp1Var : remoteVideoRenderers.keySet()) {
                List list = (List) remoteVideoRenderers.get(fp1Var);
                if (list != null) {
                    nsaVar.p1.p(str, fp1Var, list);
                }
            }
        }
    }

    @Override // defpackage.msa
    public final void h(nsa nsaVar, IceCandidate[] iceCandidateArr) {
        S("onPeerConnectionIceCandidatesRemoved, " + this + ", " + nsaVar);
        bg1 bg1VarW = W(nsaVar, this.K0);
        StringBuilder sb = new StringBuilder("sendRemovedIceCandidatesRequest, participant=");
        sb.append(bg1VarW);
        S(sb.toString());
        try {
            this.F0.i(f46.x(bg1VarW, iceCandidateArr));
        } catch (JSONException unused) {
            this.Y.logException("DirectCallTopology", "direct.topology.send.remove.ice", new Exception("direct.topology.create.remove.ice.request"));
        }
    }

    @Override // defpackage.qod
    public final void j(JSONObject jSONObject) throws JSONException {
        String string;
        String string2 = jSONObject.getString("notification");
        string2.getClass();
        if (string2.equals("custom-data")) {
            uf0 uf0Var = this.o.A;
            sf0 sf0Var = uf0Var.d;
            boolean z = uf0Var.c.a;
            final qoa qoaVar = this.S0;
            if (!z || qoaVar == null) {
                StringBuilder sb = new StringBuilder("enabled && reporter != null = ");
                sb.append(z);
                sb.append(" && ");
                sb.append(qoaVar != null);
                string = sb.toString();
            } else {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                if (jSONObjectOptJSONObject != null) {
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("sdk");
                    if (jSONObjectOptJSONObject2 == null) {
                        string = "no sdk";
                    } else if (jSONObjectOptJSONObject2.optString("type").equals("bad-net")) {
                        final double dOptDouble = jSONObjectOptJSONObject2.optDouble("bitrate");
                        qoaVar.f.invoke("submit bitrate: " + dOptDouble);
                        ztc ztcVar = qoaVar.h;
                        if (ztcVar != null) {
                            ztcVar.b(new Runnable() { // from class: noa
                                @Override // java.lang.Runnable
                                public final void run() {
                                    qoaVar.b.c(dOptDouble);
                                }
                            });
                        }
                        string = "received bad-net: " + jSONObjectOptJSONObject2;
                    } else {
                        string = "type != bad-net";
                    }
                } else {
                    string = "no data";
                }
            }
            sf0Var.b(this.Y, "DirectCallTopology", "handleCustomDataNotification: " + string);
            return;
        }
        if (string2.equals("transmitted-data")) {
            bg1 bg1VarE = f46.E(jSONObject);
            fg1 fg1VarZ = z(bg1VarE);
            if (fg1VarZ == null) {
                this.Y.reportException("DirectCallTopology", "transmitted.data.npe", new Exception("td.unknown.participant.in.p2p"));
                return;
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.getJSONObject("data").optJSONObject("sdp");
            ArrayList arrayList = null;
            SessionDescription sessionDescription = jSONObjectOptJSONObject3 != null ? new SessionDescription(SessionDescription.Type.fromCanonicalForm(jSONObjectOptJSONObject3.getString("type")), jSONObjectOptJSONObject3.getString("sdp")) : null;
            if (sessionDescription != null) {
                if (sessionDescription.type == SessionDescription.Type.ANSWER) {
                    cbg cbgVar = (cbg) this.O0.get(bg1VarE);
                    if (cbgVar == null) {
                        StringBuilder sb2 = new StringBuilder("no.scheduled.offer.found");
                        if (this.N0.get(bg1VarE) != null) {
                            sb2.append(".but.answer.found");
                        }
                        this.Y.logException("DirectCallTopology", "answer.invariant", new Exception(sb2.toString()));
                        return;
                    }
                    if (!cbgVar.e) {
                        this.Y.logException("DirectCallTopology", "direct.topology.no.offer.for.answer", new Exception("offer.is.not.ready.yet"));
                        return;
                    }
                    if (cbgVar.c != null) {
                        this.Y.log("DirectCallTopology", "Answer was already applied from " + fg1VarZ);
                        return;
                    }
                    kpa kpaVarQ = f46.q(jSONObject);
                    if (kpaVarQ != null) {
                        cbgVar.a.put(kpaVarQ, sessionDescription);
                        Y(fg1VarZ);
                        return;
                    } else {
                        this.Y.log("DirectCallTopology", "sdp=" + jSONObject.toString());
                        this.Y.logException("DirectCallTopology", "direct.topology.bad.sdp", new Exception("bad.sdp.answer.from.participant"));
                        return;
                    }
                }
                return;
            }
            td tdVar = this.M0;
            nsa nsaVar = (nsa) this.K0.get(bg1VarE);
            ((a4c) tdVar.o).log("IceCandidatesHandler", "handleTransmittedData, " + fg1VarZ);
            kpa kpaVarQ2 = f46.q(jSONObject);
            if (kpaVarQ2 == null) {
                ((a4c) tdVar.o).log("IceCandidatesHandler", "No peer specified for " + fg1VarZ);
                return;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            JSONObject jSONObjectOptJSONObject4 = jSONObject2.optJSONObject("candidate");
            IceCandidate iceCandidate = jSONObjectOptJSONObject4 != null ? new IceCandidate(jSONObjectOptJSONObject4.getString("sdpMid"), jSONObjectOptJSONObject4.getInt("sdpMLineIndex"), jSONObjectOptJSONObject4.getString("candidate")) : null;
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("candidates-removed");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList2 = new ArrayList(jSONArrayOptJSONArray.length());
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i);
                    arrayList2.add(jSONObject3 != null ? new IceCandidate(jSONObject3.getString("sdpMid"), jSONObject3.getInt("sdpMLineIndex"), jSONObject3.getString("candidate")) : null);
                }
                arrayList = arrayList2;
            }
            if (iceCandidate == null && arrayList == null) {
                return;
            }
            Map map = (Map) ((HashMap) tdVar.c).get(fg1VarZ);
            if (map == null) {
                map = new HashMap();
                ((HashMap) tdVar.c).put(fg1VarZ, map);
            }
            kpa kpaVar = (kpa) map.get(kpaVarQ2);
            if (kpaVar == null) {
                kpaVar = new kpa(new ArrayList(), new ArrayList());
                map.put(kpaVarQ2, kpaVar);
            }
            if (iceCandidate != null) {
                ((List) kpaVar.a).add(iceCandidate);
            }
            if (arrayList != null) {
                ((List) kpaVar.b).addAll(arrayList);
            }
            tdVar.b(fg1VarZ, nsaVar);
        }
    }

    @Override // defpackage.msa
    public final void k(nsa nsaVar, PeerConnection.SignalingState signalingState) {
        S("onPeerConnectionSignalingState, " + this + " state=" + signalingState + ", " + nsaVar);
        if (signalingState == PeerConnection.SignalingState.STABLE) {
            Z(nsaVar, nsaVar.C());
        }
        fg1 fg1VarZ = z(W(nsaVar, this.K0));
        if (fg1VarZ != null) {
            this.M0.b(fg1VarZ, nsaVar);
        }
    }

    @Override // defpackage.msa
    public final void l(nsa nsaVar, IceCandidate iceCandidate) {
        S("onPeerConnectionIceCandidate, " + this + ", " + nsaVar);
        bg1 bg1VarW = W(nsaVar, this.K0);
        S("sendIceCandidateRequest, participant=" + bg1VarW + ", candidate=" + iceCandidate);
        try {
            this.F0.i(f46.w(bg1VarW, iceCandidate));
        } catch (JSONException unused) {
            this.Y.logException("DirectCallTopology", "direct.topology.send.add.ice", new Exception("direct.topology.create.add.ice.request"));
        }
    }

    @Override // defpackage.msa
    public final void m(nsa nsaVar, SessionDescription sessionDescription) {
        xn1 xn1Var;
        S("onPeerConnectionLocalDescription, " + this + ", type=" + sessionDescription.type + ", " + nsaVar);
        bg1 bg1VarW = W(nsaVar, this.K0);
        fg1 fg1VarZ = z(bg1VarW);
        if (fg1VarZ == null) {
            this.Y.logException("DirectCallTopology", "local.sdp.npe", new Exception("set.local.sdp.for.died.participant"));
            return;
        }
        SessionDescription.Type type = sessionDescription.type;
        SessionDescription.Type type2 = SessionDescription.Type.OFFER;
        if (type == type2) {
            cbg cbgVar = (cbg) this.O0.get(bg1VarW);
            if (cbgVar == null) {
                throw new IllegalStateException();
            }
            cbgVar.d = false;
            cbgVar.e = true;
        } else {
            cbg cbgVar2 = (cbg) this.N0.get(bg1VarW);
            if (cbgVar2 == null) {
                throw new IllegalStateException();
            }
            cbgVar2.d = false;
            cbgVar2.e = true;
        }
        S("sendOfferAnswerRequest, participant=" + bg1VarW + ", sdp type=" + sessionDescription.type.canonicalForm());
        try {
            this.F0.i(f46.b(f46.l(bg1VarW, sessionDescription), "transmit-data"));
            if (sessionDescription.type != type2 || (xn1Var = this.y0) == null) {
                return;
            }
            ((py0) xn1Var).V0.log("OKRTCCall", "handleTopologyOfferCreated, " + this + ", " + fg1VarZ + ", sdp=" + sessionDescription.type);
        } catch (JSONException e) {
            throw new RuntimeException("sdp " + sessionDescription.type + " " + sessionDescription.description, e);
        }
    }

    @Override // defpackage.msa
    public final void n(nsa nsaVar, PeerConnection.IceConnectionState iceConnectionState) {
        Runnable runnable;
        S("onPeerConnectionIceConnectionChange, " + this + ", state=" + iceConnectionState + ", " + nsaVar);
        Z(nsaVar, iceConnectionState);
        xn1 xn1Var = this.y0;
        if (xn1Var != null) {
            ((py0) xn1Var).A(this, iceConnectionState);
        }
        if (iceConnectionState != PeerConnection.IceConnectionState.CONNECTED || (runnable = this.c) == null) {
            return;
        }
        this.a.removeCallbacks(runnable);
    }

    @Override // defpackage.msa
    public final void o(nsa nsaVar, long j) {
        bg1 bg1VarW = W(nsaVar, this.J0);
        if (bg1VarW == null) {
            bg1VarW = W(nsaVar, this.K0);
        }
        if (bg1VarW != null) {
            fg1 fg1VarZ = z(bg1VarW);
            xn1 xn1Var = this.y0;
            if (xn1Var == null || fg1VarZ == null) {
                return;
            }
            ((py0) xn1Var).W1.b.onCallParticipantFingerprint(fg1VarZ, j);
        }
    }

    @Override // defpackage.yn1, defpackage.zy0
    public final void onActiveParticipantUpdated(yy0 yy0Var) {
        onActiveParticipantsRemoved(new xy0(yy0Var.a, Collections.emptyList()));
        Collection collection = yy0Var.b;
        onActiveParticipantsAdded(new uy0(collection, collection));
    }

    @Override // defpackage.yn1, defpackage.zy0
    public final void onActiveParticipantsAdded(uy0 uy0Var) {
        StringBuilder sb = new StringBuilder("onCallParticipantsAdded, ");
        sb.append(this);
        sb.append(", ");
        Collection<fg1> collection = uy0Var.a;
        sb.append(collection.size());
        S(sb.toString());
        for (fg1 fg1Var : collection) {
            HashMap map = this.J0;
            if (map.get(fg1Var.a) != null || this.K0.get(fg1Var.a) != null) {
                throw new IllegalStateException("Peer connection is already created for " + fg1Var);
            }
            map.put(fg1Var.a, X());
        }
        a0();
    }

    @Override // defpackage.yn1, defpackage.zy0
    public final void onActiveParticipantsChanged(vy0 vy0Var) {
        StringBuilder sb = new StringBuilder("onCallParticipantsChanged, ");
        Collection<fg1> collection = vy0Var.a;
        sb.append(collection.size());
        S(sb.toString());
        for (fg1 fg1Var : collection) {
            nsa nsaVar = (nsa) this.K0.get(fg1Var.a);
            if (nsaVar != null) {
                Y(fg1Var);
                this.M0.b(fg1Var, nsaVar);
            }
        }
    }

    @Override // defpackage.yn1, defpackage.zy0
    public final void onActiveParticipantsDeAnonimized(wy0 wy0Var) {
    }

    @Override // defpackage.yn1, defpackage.zy0
    public final void onActiveParticipantsRemoved(xy0 xy0Var) {
        StringBuilder sb = new StringBuilder("onCallParticipantsRemoved, ");
        sb.append(this);
        sb.append(", ");
        Collection<fg1> collection = xy0Var.a;
        sb.append(collection.size());
        S(sb.toString());
        for (fg1 fg1Var : collection) {
            nsa nsaVar = (nsa) this.J0.remove(fg1Var.a);
            if (nsaVar == null) {
                nsaVar = (nsa) this.K0.remove(fg1Var.a);
            }
            if (nsaVar != null) {
                nsaVar.Z0 = null;
                nsaVar.p(true);
            }
            this.L0.remove(fg1Var.a);
            this.N0.remove(fg1Var.a);
            this.O0.remove(fg1Var.a);
            ((HashMap) this.M0.c).remove(fg1Var);
        }
    }

    @Override // org.webrtc.NetworkMonitor.NetworkObserver
    public final void onConnectionTypeChanged(NetworkChangeDetector.ConnectionType connectionType) {
        S("onConnectionTypeChanged, " + this + ", type=" + connectionType);
        this.a.post(new ik4(this, 0));
    }

    @Override // defpackage.msa
    public final void q(nsa nsaVar) {
        pl5 pl5Var = this.Z;
        if (pl5Var == null || pl5Var.f.b || pl5Var.d.b || pl5Var.e.b) {
            return;
        }
        P(new wn1(pl5Var));
    }

    @Override // defpackage.yn1
    public final void s() {
        S("clearRemoteVideoRenderers");
        jb9.e();
        Iterator it = this.K0.values().iterator();
        while (it.hasNext()) {
            ((nsa) it.next()).p1.d();
        }
    }

    @Override // defpackage.yn1
    public final void t(bg1 bg1Var, SessionDescription sessionDescription) {
        v("createAnswerFor, " + this + ", participant=" + bg1Var + ", " + sessionDescription.type);
        jb9.e();
        SessionDescription.Type type = sessionDescription.type;
        SessionDescription.Type type2 = SessionDescription.Type.OFFER;
        if (type != type2) {
            throw new IllegalArgumentException(type2 + " expected, but " + sessionDescription.type + " specified");
        }
        fg1 fg1VarZ = z(bg1Var);
        if (fg1VarZ == null) {
            throw new IllegalStateException("Participant(" + bg1Var + ") not found");
        }
        HashMap map = this.O0;
        cbg cbgVar = (cbg) map.get(bg1Var);
        a4c a4cVar = this.Y;
        if (cbgVar != null) {
            if (!cbgVar.e) {
                a4cVar.log("DirectCallTopology", this + ": unexpected offer (is concurrent call?) from " + fg1VarZ);
                return;
            }
            a4cVar.log("DirectCallTopology", "Opponent " + bg1Var + " is requesting for renegotiation, let us accept the request, ");
            map.remove(bg1Var);
        }
        HashMap map2 = this.N0;
        cbg cbgVar2 = (cbg) map2.get(bg1Var);
        if (cbgVar2 != null) {
            SessionDescription sessionDescription2 = cbgVar2.b;
            if (TextUtils.equals(sessionDescription2 != null ? sessionDescription2.description : "", sessionDescription.description)) {
                a4cVar.reportException("DirectCallTopology", "answer.scheduled", new Exception("answer.creation.already.scheduled"));
                return;
            }
            if (cbgVar2.d) {
                a4cVar.reportException("DirectCallTopology", "repeated.answer", new Exception("repeated.answer.creation"));
                return;
            }
            V(this + ": re-schedule answer creation for " + fg1VarZ);
            map2.remove(bg1Var);
        }
        map2.put(bg1Var, new cbg(sessionDescription));
        b0();
    }

    @Override // defpackage.yn1
    public final void u(fg1 fg1Var, boolean z) {
        S("createOfferFor, " + this + ", " + fg1Var);
        jb9.e();
        if (!this.v0.k(fg1Var)) {
            throw new IllegalStateException("Participant not found");
        }
        HashMap map = this.O0;
        cbg cbgVar = (cbg) map.get(fg1Var.a);
        if (cbgVar == null) {
            map.put(fg1Var.a, new cbg(null));
        } else if (cbgVar.d) {
            this.Y.reportException("DirectCallTopology", "offer.scheduled", new Exception("offer.creation.already.scheduled"));
        } else if (z) {
            V(this + ": re-schedule offer creation for " + fg1Var);
            cbgVar.e = false;
        } else {
            V(this + ": offer already created for " + fg1Var);
        }
        c0();
    }

    @Override // defpackage.yn1
    public final Runnable w() {
        return this.T0;
    }

    @Override // defpackage.yn1
    public final long x() {
        jb9.e();
        Iterator it = this.K0.values().iterator();
        if (it.hasNext()) {
            return ((nsa) it.next()).U0;
        }
        return -1L;
    }

    @Override // defpackage.yn1
    public final xxe y() {
        return xxe.b;
    }
}
