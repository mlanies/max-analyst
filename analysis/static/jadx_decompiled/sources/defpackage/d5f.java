package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.IceCandidate;
import org.webrtc.PeerConnection;
import org.webrtc.SessionDescription;

/* loaded from: classes2.dex */
public final class d5f implements rsa, msa {
    public static final Pattern J0 = Pattern.compile("a=ssrc:(\\d+)");
    public final lsa A0;
    public volatile nsa B0;
    public SessionDescription C0;
    public boolean D0;
    public final boolean E0;
    public boolean F0;
    public String G0;
    public final CopyOnWriteArraySet H0;
    public ji9 I0;
    public final d4c X;
    public final a4c Y;
    public final rod Z;
    public final ag1 a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList o;
    public final i7b s0;
    public final qld t0;
    public final HashSet u0 = new HashSet();
    public final re6 v0;
    public final bg4 w0;
    public final h7d x0;
    public ssa y0;
    public final boolean z0;

    public d5f(g7d g7dVar, h7d h7dVar) {
        ag1 ag1Var = g7dVar.m;
        this.a = ag1Var;
        this.b = g7dVar.j;
        this.c = g7dVar.k;
        this.o = g7dVar.l;
        this.x0 = h7dVar;
        d4c d4cVar = g7dVar.p;
        this.X = d4cVar;
        a4c a4cVar = g7dVar.o;
        this.Y = a4cVar;
        this.Z = g7dVar.i;
        this.s0 = g7dVar.r;
        qld qldVar = g7dVar.a;
        this.t0 = qldVar;
        this.w0 = g7dVar.u;
        this.v0 = g7dVar.n;
        this.H0 = new CopyOnWriteArraySet();
        this.z0 = g7dVar.s;
        ag1 ag1Var2 = g7dVar.m;
        this.E0 = ag1Var2.m;
        lsa lsaVar = new lsa();
        lsaVar.a = qldVar;
        lsaVar.b = g7dVar.b;
        lsaVar.q = 0;
        lsaVar.c = g7dVar.d;
        lsaVar.e = g7dVar.e;
        lsaVar.f = d4cVar;
        lsaVar.g = a4cVar;
        lsaVar.h = true;
        lsaVar.i = true;
        lsaVar.d = ag1Var;
        lsaVar.j = ag1Var.h;
        lsaVar.m = ag1Var.i;
        lsaVar.s = ag1Var.g > 0;
        lsaVar.w = g7dVar.t;
        lsaVar.n = ag1Var2.p;
        lsaVar.o = ag1Var2.q;
        lsaVar.p = ag1Var2.r;
        bg4 bg4Var = g7dVar.u;
        lsaVar.x = new kj(bg4Var, (kad) bg4Var.o, 2);
        bg4 bg4Var2 = g7dVar.u;
        lsaVar.y = new ni(bg4Var2, (kad) bg4Var2.o);
        lsaVar.z = 1;
        lsaVar.v = ag1Var.B.g;
        lsaVar.u = false;
        lsaVar.t = nsa.A().b;
        lsaVar.A = g7dVar.x;
        lsaVar.k = g7dVar.m.x;
        lsaVar.B = g7dVar.y;
        lsaVar.C = g7dVar.z;
        lsaVar.D = g7dVar.A;
        this.A0 = lsaVar;
        i();
        if (this.B0 != null) {
            this.B0.I(this.y0);
        }
    }

    @Override // defpackage.msa
    public final void a(nsa nsaVar, SessionDescription sessionDescription) {
        if (sessionDescription.type == SessionDescription.Type.OFFER) {
            if (nsaVar.m1) {
                throw new IllegalStateException();
            }
            this.B0.w();
        }
    }

    @Override // defpackage.msa
    public final void b(nsa nsaVar) {
        this.Y.log("UnifiedPeerConnection", "onPeerConnectionRenegotiationNeeded, " + nsaVar);
    }

    @Override // defpackage.msa
    public final void c(nsa nsaVar) {
        if (this.B0.E()) {
            h7d h7dVar = this.x0;
            h7dVar.getClass();
            h7dVar.S("resendDisplayLayouts, " + h7dVar);
            uj4 uj4Var = h7dVar.K0;
            List list = uj4Var.c;
            h7dVar.J0.getClass();
            h7dVar.I0.p(hx9.n(list));
            uj4Var.e = true;
            uj4Var.a(uj4Var.c);
            xn1 xn1Var = h7dVar.y0;
            if (xn1Var != null) {
                ((py0) xn1Var).z(h7dVar);
            }
        }
        if (this.B0.m1 && this.C0 != null) {
            this.Y.log("UnifiedPeerConnection", "apply postponed remote sdp=" + this.C0.type.canonicalForm() + " to just created " + nsaVar);
            this.B0.J(this.C0);
            this.C0 = null;
        }
        this.B0.s(this.I0);
    }

    @Override // defpackage.msa
    public final void d() {
        this.Y.reportException("PeerConnectionWrapperBase", "server.topology.create.sdp", new Exception("server.topology.create.sdp"));
    }

    @Override // defpackage.msa
    public final void e(String str) {
        this.Y.log("UnifiedPeerConnection", "audio-mix enabled");
        h7d h7dVar = this.x0;
        h7dVar.getClass();
        if (str == null || !str.endsWith("audio-mix") || h7dVar.y0 == null) {
            return;
        }
        h7dVar.v("audio-mix enabled");
    }

    @Override // defpackage.msa
    public final void f() {
        this.Y.reportException("PeerConnectionWrapperBase", "server.topolog.set.sdp", new Exception("server.topolog.set.sdp"));
    }

    @Override // defpackage.msa
    public final void g(nsa nsaVar, String str) {
        bg1 bg1Var;
        h7d h7dVar = this.x0;
        h7dVar.getClass();
        h7dVar.S("onPeerConnectionRemoteVideoTrackAdded, " + h7dVar + ", client=" + nsaVar + ", track=" + str);
        bg1 bg1VarA0 = f46.a0(str);
        fg1 fg1VarZ = bg1VarA0 != null ? h7dVar.z(bg1VarA0) : null;
        if (fg1VarZ == null || (bg1Var = fg1VarZ.a) == null) {
            h7dVar.Y.log("ServerCallTopology", "Cant find participant  for " + str + " video track, " + nsaVar);
            return;
        }
        pg4 pg4Var = h7dVar.E0;
        if (pg4Var.isEnabled()) {
            Map remoteVideoRenderers = pg4Var.getRemoteVideoRenderers(bg1Var);
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
    }

    public final void i() {
        lsa lsaVar = this.A0;
        lsaVar.l = this.F0;
        this.B0 = lsaVar.a();
        this.B0.Z0 = this;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            loc locVar = (loc) it.next();
            k8g k8gVar = this.B0.B().n;
            if (locVar == null) {
                k8gVar.getClass();
                throw new IllegalArgumentException("Illegal 'listener' value: null");
            }
            ((CopyOnWriteArrayList) k8gVar.b).add(locVar);
        }
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            poc pocVar = (poc) it2.next();
            qp4 qp4Var = this.B0.P0;
            if (qp4Var == null) {
                throw new IllegalStateException("Notifications receiver is not enabled");
            }
            if (pocVar == null) {
                throw new IllegalArgumentException("Illegal 'listener' value: null");
            }
            ((CopyOnWriteArrayList) qp4Var.a).add(pocVar);
        }
        Iterator it3 = this.o.iterator();
        while (it3.hasNext()) {
            xx0 xx0Var = (xx0) it3.next();
            if (this.B0.c != null) {
                ((CopyOnWriteArrayList) this.B0.c.o).add(xx0Var);
            }
        }
        nsa nsaVar = this.B0;
        nsaVar.V0 = null;
        nsaVar.W0 = false;
        nsaVar.a1 = null;
        nsaVar.b1 = null;
        nsaVar.c1 = null;
        nsaVar.e1 = null;
        nsaVar.i("createPeerConnectionFactoryInternal", new csa(nsaVar, 2));
    }

    public final void j() {
        this.B0.Z0 = null;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            loc locVar = (loc) it.next();
            k8g k8gVar = this.B0.B().n;
            if (locVar == null) {
                k8gVar.getClass();
                throw new IllegalArgumentException("Illegal 'listener' value: null");
            }
            ((CopyOnWriteArrayList) k8gVar.b).remove(locVar);
        }
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            poc pocVar = (poc) it2.next();
            qp4 qp4Var = this.B0.P0;
            if (qp4Var == null) {
                throw new IllegalStateException("Notifications receiver is not enabled");
            }
            if (pocVar == null) {
                throw new IllegalArgumentException("Illegal 'listener' value: null");
            }
            ((CopyOnWriteArrayList) qp4Var.a).remove(pocVar);
        }
        Iterator it3 = this.o.iterator();
        while (it3.hasNext()) {
            xx0 xx0Var = (xx0) it3.next();
            if (this.B0.c != null) {
                ((CopyOnWriteArrayList) this.B0.c.o).remove(xx0Var);
            }
        }
        this.B0.p(false);
    }

    @Override // defpackage.msa
    public final void k(nsa nsaVar, PeerConnection.SignalingState signalingState) {
        if (signalingState != PeerConnection.SignalingState.STABLE || this.C0 == null) {
            return;
        }
        this.Y.log("UnifiedPeerConnection", "apply postponed remote sdp=" + this.C0.type.canonicalForm() + " to " + nsaVar);
        this.B0.J(this.C0);
        this.C0 = null;
    }

    @Override // defpackage.msa
    public final void l(nsa nsaVar, IceCandidate iceCandidate) {
    }

    @Override // defpackage.msa
    public final void m(nsa nsaVar, SessionDescription sessionDescription) {
        SessionDescription.Type type = sessionDescription.type;
        SessionDescription.Type type2 = SessionDescription.Type.ANSWER;
        a4c a4cVar = this.Y;
        if (type != type2) {
            a4cVar.reportException("UnifiedPeerConnection", "server.topology.producer.create.local.sdp", new Exception("answer.expected"));
            return;
        }
        a4cVar.log("UnifiedPeerConnection", "sendRequestAcceptProducer," + this + ", sdp=" + sessionDescription.type.canonicalForm());
        try {
            rod rodVar = this.Z;
            HashSet hashSet = this.u0;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("description", sessionDescription.description);
            if (!hashSet.isEmpty()) {
                jSONObject.put("ssrcs", new JSONArray((Collection<?>) hashSet));
            }
            rodVar.i(f46.b(jSONObject, "accept-producer"));
        } catch (JSONException unused) {
            a4cVar.reportException("PeerConnectionWrapperBase", "server.topology.send.accept.producer", new Exception("server.topology.send.accept.producer"));
        }
    }

    @Override // defpackage.msa
    public final void n(nsa nsaVar, PeerConnection.IceConnectionState iceConnectionState) {
        this.Y.log("UnifiedPeerConnection", "onPeerConnectionIceConnectionChange, " + nsaVar + " state=" + iceConnectionState);
        h7d h7dVar = this.x0;
        if (h7dVar.I()) {
            if (iceConnectionState == PeerConnection.IceConnectionState.FAILED) {
                if (this.E0) {
                    this.H0.add(this.G0);
                    this.Z.i(f46.b(null, "request-realloc"));
                } else {
                    this.D0 = true;
                }
            }
            xn1 xn1Var = h7dVar.y0;
            if (xn1Var != null) {
                ((py0) xn1Var).A(h7dVar, iceConnectionState);
            }
        }
    }

    public final void p(ece eceVar) {
        bwc bwcVar = this.B0.b;
        if (bwcVar == null || bwcVar.f) {
            return;
        }
        bwcVar.h = Collections.unmodifiableSet((Set) eceVar.a);
        Iterator it = bwcVar.a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!bwcVar.h.contains(entry.getKey())) {
                vbg vbgVar = (vbg) entry.getValue();
                if (vbgVar != null) {
                    vbgVar.a();
                }
                it.remove();
            }
        }
    }

    @Override // defpackage.msa
    public final void q(nsa nsaVar) {
        h7d h7dVar = this.x0;
        pl5 pl5Var = h7dVar.Z;
        if (pl5Var == null || pl5Var.f.b || pl5Var.d.b || pl5Var.e.b) {
            return;
        }
        h7dVar.P(new wn1(pl5Var));
    }
}
