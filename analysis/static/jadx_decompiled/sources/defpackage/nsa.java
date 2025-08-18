package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Size;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.webrtc.AudioTrack;
import org.webrtc.DataChannel;
import org.webrtc.IceCandidate;
import org.webrtc.Logging;
import org.webrtc.MediaConstraints;
import org.webrtc.MediaStreamTrack;
import org.webrtc.NativeLibraryLoader;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.RtpSender;
import org.webrtc.SessionDescription;
import org.webrtc.VideoFrame;
import org.webrtc.VideoTrack;

/* loaded from: classes2.dex */
public final class nsa implements mq7, lq7, al5, tcg, gqa {
    public static final Pattern w1 = Pattern.compile("^a=rtpmap:(\\d+) H264(/\\d+)+[\r]?$", 8);
    public static final Pattern x1 = Pattern.compile("^a=animoji:(\\d+)", 8);
    public static volatile h7b y1 = null;
    public static final re6 z1 = new re6(23, false);
    public final boolean A0;
    public final hd9 B0;
    public final qld D0;
    public final d E0;
    public final ExecutorService F0;
    public final roa G0;
    public final int H0;
    public final Context I0;
    public final d4c J0;
    public final a4c K0;
    public final ag1 L0;
    public final die M0;
    public final yr6 N0;
    public final koc O0;
    public final qp4 P0;
    public final bl5 Q0;
    public final boolean R0;
    public final String[] S0;
    public final String[] T0;
    public volatile PeerConnection V0;
    public boolean W0;
    public final boolean X;
    public MediaConstraints X0;
    public final boolean Y;
    public MediaConstraints Y0;
    public final Integer Z;
    public msa Z0;
    public final boolean a;
    public RtpSender a1;
    public final bwc b;
    public RtpSender b1;
    public final c8d c;
    public RtpSender c1;
    public List d1;
    public RtpSender e1;
    public kq7 g1;
    public volatile boolean i1;
    public volatile boolean j1;
    public boolean k1;
    public volatile boolean l1;
    public ssa n1;
    public final boolean o;
    public final rz3 o1;
    public final ej3 p1;
    public final yuc q1;
    public final boolean r1;
    public final Integer s0;
    public final float s1;
    public final kj t0;
    public final float t1;
    public boolean u0;
    public final boolean u1;
    public final ni v0;
    public final int v1;
    public int w0 = 0;
    public int x0 = 0;
    public int y0 = 0;
    public int z0 = 0;
    public final Handler C0 = new Handler(Looper.getMainLooper());
    public long U0 = -1;
    public final ArrayList f1 = new ArrayList();
    public boolean h1 = true;
    public volatile boolean m1 = true;

    public nsa(lsa lsaVar) {
        roa roaVar;
        kra kraVar;
        int i = lsaVar.q;
        this.H0 = i;
        Context applicationContext = lsaVar.e.getApplicationContext();
        this.I0 = applicationContext;
        d4c d4cVar = lsaVar.f;
        this.J0 = d4cVar;
        a4c a4cVar = lsaVar.g;
        this.K0 = a4cVar;
        ag1 ag1Var = lsaVar.d;
        this.L0 = ag1Var;
        this.B0 = new hd9(a4cVar);
        qld qldVar = lsaVar.a;
        this.D0 = qldVar;
        ExecutorService executorService = qldVar != null ? qldVar.a : lsaVar.c;
        this.F0 = executorService;
        this.R0 = lsaVar.n;
        this.S0 = lsaVar.o;
        this.T0 = lsaVar.p;
        this.A0 = lsaVar.B;
        if (executorService == null) {
            ag1Var.getClass();
            roaVar = new roa(d4cVar);
        } else {
            roaVar = null;
        }
        this.G0 = roaVar;
        this.E0 = lsaVar.b;
        ag1Var.getClass();
        this.N0 = new yr6(d4cVar, a4cVar, i);
        o9g o9gVar = lsaVar.w;
        if (lsaVar.h) {
            Object re6Var = ag1Var.A.c.b ? new re6(26, o9gVar) : new sp3();
            aab aabVar = new aab();
            aabVar.b = re6Var;
            aabVar.a = a4cVar;
            this.O0 = new koc(aabVar);
        } else {
            this.O0 = null;
        }
        if (lsaVar.i) {
            bdb bdbVar = new bdb(3);
            bdbVar.b = null;
            bdbVar.c = null;
            cjg cjgVar = new cjg();
            cjgVar.a = o9gVar;
            cjgVar.b = new b9b(o9gVar, 14, a4cVar);
            cjgVar.c = new dq1(a4cVar);
            bdbVar.b = cjgVar;
            bdbVar.c = a4cVar;
            qp4 qp4Var = new qp4();
            qp4Var.a = new CopyOnWriteArrayList();
            qp4Var.Y = new Handler(Looper.getMainLooper());
            qp4Var.Z = new AtomicBoolean(false);
            qp4Var.s0 = new AtomicReference(null);
            qp4Var.t0 = new vag(0, qp4Var);
            cjg cjgVar2 = (cjg) bdbVar.b;
            if (cjgVar2 == null) {
                throw new IllegalArgumentException("Illegal 'serializer' value: null");
            }
            a4c a4cVar2 = (a4c) bdbVar.c;
            if (a4cVar2 == null) {
                throw new IllegalArgumentException("Illegal 'log' value: null");
            }
            qp4Var.b = cjgVar2;
            qp4Var.c = a4cVar2;
            HandlerThread handlerThread = new HandlerThread("RtcNotifRecv");
            qp4Var.o = handlerThread;
            handlerThread.start();
            qp4Var.X = new Handler(handlerThread.getLooper());
            this.P0 = qp4Var;
        } else {
            this.P0 = null;
        }
        yf1 yf1Var = ag1Var.B;
        this.r1 = yf1Var.b;
        this.s1 = yf1Var.c;
        this.t1 = yf1Var.d;
        Future futureSubmit = (executorService == null || qldVar == null) ? null : executorService.submit(new l5(11, qldVar));
        if (!lsaVar.j || futureSubmit == null) {
            this.b = null;
        } else {
            this.b = new bwc(lsaVar.g, o9gVar, futureSubmit, this, lsaVar.C);
        }
        if (lsaVar.k) {
            c8d c8dVar = new c8d();
            c8dVar.o = new CopyOnWriteArrayList();
            c8dVar.c = o9gVar;
            this.c = c8dVar;
        } else {
            this.c = null;
        }
        this.u0 = lsaVar.l;
        this.Q0 = new bl5(this);
        this.a = lsaVar.r;
        this.o = lsaVar.t;
        this.Y = lsaVar.u;
        this.X = lsaVar.v;
        psa psaVar = A().j;
        if (psaVar != null) {
            this.Z = psaVar.g;
            this.s0 = psaVar.h;
        } else {
            this.Z = null;
            this.s0 = null;
        }
        if (lsaVar.s) {
            this.p1 = new kqa(new isa(this), a4cVar, new esa(this), o9gVar);
        } else {
            this.p1 = new fd4(new isa(this), a4cVar, new esa(this), o9gVar);
        }
        this.t0 = lsaVar.x;
        this.v0 = lsaVar.y;
        this.v1 = lsaVar.z;
        this.M0 = lsaVar.A;
        if (qldVar != null && (kraVar = qldVar.j) != null) {
            kraVar.Y.add(this);
        }
        this.o1 = new rz3(qldVar, applicationContext, ag1Var, a4cVar);
        this.q1 = lsaVar.D;
        this.u1 = lsaVar.m;
    }

    public static qsa A() {
        if (y1 != null) {
            return (qsa) y1.b;
        }
        Boolean bool = Boolean.FALSE;
        return new qsa(true, true, null, null, null, false, false, false, false, new psa(false, null, null, bool, bool, null, null, null), false, false, null);
    }

    public static void D(Context context, h7b h7bVar, NativeLibraryLoader nativeLibraryLoader) {
        if (y1 == null) {
            y1 = h7bVar;
            a4c a4cVar = (a4c) y1.c;
            if (a4cVar != null) {
                re6 re6Var = z1;
                re6Var.getClass();
                re6Var.b = new WeakReference(a4cVar);
            }
            PeerConnectionFactory.InitializationOptions.Builder injectableLogger = PeerConnectionFactory.InitializationOptions.builder(context.getApplicationContext()).setInjectableLogger(z1, Logging.Severity.LS_VERBOSE);
            if (nativeLibraryLoader != null) {
                injectableLogger.setNativeLibraryLoader(nativeLibraryLoader);
            }
            PeerConnectionFactory.initialize(injectableLogger.createInitializationOptions());
        }
    }

    public static LinkedList f(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (String str : strArr) {
            if (str != null && !str.isEmpty()) {
                int length = str.length();
                int iCharCount = 0;
                while (true) {
                    if (iCharCount < length) {
                        int iCodePointAt = str.codePointAt(iCharCount);
                        if (!Character.isWhitespace(iCodePointAt)) {
                            linkedList.add(str);
                            break;
                        }
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        return linkedList;
    }

    public final koc B() {
        koc kocVar = this.O0;
        if (kocVar != null) {
            return kocVar;
        }
        throw new IllegalStateException("Command executor is not enabled");
    }

    public final PeerConnection.IceConnectionState C() {
        PeerConnection peerConnection = this.V0;
        if (peerConnection == null) {
            return null;
        }
        try {
            return peerConnection.iceConnectionState();
        } catch (Exception e) {
            this.K0.reportException("PCRTCClient", "pc.conn.state", e);
            return null;
        }
    }

    public final boolean E() {
        return (this.i1 || this.j1 || this.V0 == null) ? false : true;
    }

    public final void F() {
        kq7 kq7Var = this.g1;
        if (kq7Var != null) {
            this.K0.log("PCRTCClient", "maybeUpdateSenders, " + this + ", " + jb9.c(kq7Var));
            if (G() != null) {
                RtpSender rtpSender = this.b1;
                RtpSender rtpSender2 = this.a1;
                kq7Var.n.log("OKRTCLmsAdapter", "bindTracksWith, " + kq7Var + ", audio sender=" + jb9.c(rtpSender) + " & video sender= " + jb9.c(rtpSender2));
                kq7Var.i.t(rtpSender);
                if (kq7Var.f.d) {
                    kq7Var.y.t(rtpSender2);
                }
            }
        }
    }

    public final PeerConnection G() {
        if (this.V0 != null && !this.i1 && !this.W0) {
            return this.V0;
        }
        StringBuilder sb = new StringBuilder();
        if (this.V0 == null) {
            sb.append("No web-rtc peer connection");
        }
        if (this.W0) {
            if (sb.length() > 0) {
                sb.append(", fatal error occurred");
            } else {
                sb.append("Fatal error occurred");
            }
        }
        if (this.i1) {
            this.K0.log("PCRTCClient", this + ": (closed) " + ((Object) sb));
            return null;
        }
        this.K0.log("PCRTCClient", this + ": (unclosed null peer connection) " + ((Object) sb));
        return null;
    }

    public final void H(IceCandidate[] iceCandidateArr) {
        this.K0.log("PCRTCClient", "removeRemoteIceCandidates, " + this);
        i("removeRemoteIceCandidates", new adg(this, new oj3(2, iceCandidateArr), 1));
    }

    public final void I(ssa ssaVar) {
        if (ssaVar == null || ssaVar.equals(this.n1)) {
            return;
        }
        ssa ssaVar2 = this.n1;
        boolean z = (ssaVar2 == null || Objects.equals(ssaVar2.i, ssaVar.i)) ? false : true;
        this.n1 = ssaVar;
        this.o1.j = ssaVar;
        this.K0.log("PCRTCClient", "setPeerVideoSettings, " + this + " settings=" + ssaVar.toString());
        i("setPeerVideoSettings", new adg(this, new xra(this, z, 1), 1));
    }

    public final void J(SessionDescription sessionDescription) {
        this.K0.log("PCRTCClient", "setRemoteDescription, " + this + ", sdp=" + sessionDescription.type);
        this.m1 = false;
        this.l1 = false;
        yr6 yr6Var = this.N0;
        if (yr6Var.f == 0) {
            yr6Var.f = SystemClock.elapsedRealtime();
        }
        i("setRemoteDescription", new adg(this, new asa(this, sessionDescription, 1), 1));
    }

    @Override // defpackage.gqa
    public final void a(bg1 bg1Var, VideoFrame videoFrame) {
        die dieVar = this.M0;
        if (dieVar != null) {
            ((wte) ((vte) dieVar.b)).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            muc.a().b(new ss5(dieVar, bg1Var, new Size(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight()), jElapsedRealtime, 1));
        }
        this.p1.a(bg1Var, videoFrame);
    }

    @Override // defpackage.mq7
    public final void b(kq7 kq7Var) {
        this.K0.log("PCRTCClient", "onLocalMediaStreamChanged, " + this + " ms=" + jb9.c(kq7Var));
        final org.webrtc.Size sizeH = kq7Var.h();
        zuc zucVar = kq7Var.t;
        final int i = zucVar != null ? zucVar.g : 0;
        zuc zucVar2 = kq7Var.t;
        final int i2 = zucVar2 != null ? zucVar2.f : 0;
        i("maybeUpdateSenders", new adg(this, new rj3() { // from class: zra
            @Override // defpackage.rj3
            public final void accept(Object obj) {
                PeerConnection peerConnection = (PeerConnection) obj;
                nsa nsaVar = this.a;
                nsaVar.F();
                org.webrtc.Size size = sizeH;
                int i3 = size.width;
                int i4 = size.height;
                int i5 = nsaVar.y0;
                rz3 rz3Var = nsaVar.o1;
                if (i5 != i3 || nsaVar.z0 != i4) {
                    rz3Var.f = i4;
                    rz3Var.c = i3;
                    StringBuilder sb = new StringBuilder("Camera video size changed: ");
                    sb.append(nsaVar.y0);
                    sb.append("x");
                    ms2.k(sb, nsaVar.z0, " -> ", i3, "x");
                    sb.append(i4);
                    nsaVar.K0.log("PCRTCClient", sb.toString());
                    nsaVar.y0 = i3;
                    nsaVar.z0 = i4;
                    nsaVar.u(peerConnection, false);
                }
                int i6 = nsaVar.w0;
                int i7 = i;
                int i8 = i2;
                if (i6 == i7 && nsaVar.x0 == i8) {
                    return;
                }
                rz3Var.g = i7;
                rz3Var.h = i8;
                nsaVar.w0 = i7;
                nsaVar.x0 = i8;
                nsaVar.k(peerConnection, false);
            }
        }, 1));
    }

    public final e24 c(String str, DataChannel.Init init) {
        init.ordered = true;
        init.maxRetransmitTimeMs = 10000000;
        DataChannel dataChannelCreateDataChannel = this.V0.createDataChannel(str, init);
        a4c a4cVar = this.K0;
        StringBuilder sbM = au1.m("DATACH create data channel: name: ", str, ", id: ");
        sbM.append(dataChannelCreateDataChannel.id());
        a4cVar.log("PCRTCClient", sbM.toString());
        return new e24(dataChannelCreateDataChannel, this.K0);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00cd A[PHI: r13
      0x00cd: PHI (r13v4 dcg) = (r13v3 dcg), (r13v6 dcg), (r13v6 dcg) binds: [B:34:0x00ba, B:36:0x00c0, B:39:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String d(java.lang.String r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nsa.d(java.lang.String, boolean):java.lang.String");
    }

    @Override // defpackage.al5
    public final void e(long j) {
        msa msaVar = this.Z0;
        if (msaVar != null) {
            msaVar.o(this, j);
        }
    }

    public final PeerConnection.RTCConfiguration g(List list) {
        ArrayList arrayList = new ArrayList();
        this.L0.getClass();
        Iterator it = list.iterator();
        boolean z = false;
        boolean z2 = false;
        int i = 1;
        while (it.hasNext()) {
            PeerConnection.IceServer iceServer = (PeerConnection.IceServer) it.next();
            String str = iceServer.uri;
            if (str == null || iceServer.password == null || iceServer.username == null) {
                throw new NullPointerException(iceServer.toString());
            }
            if (str.startsWith("turn")) {
                if (!iceServer.username.isEmpty() && !iceServer.password.isEmpty()) {
                    arrayList.add(iceServer);
                    if (i > 0) {
                        arrayList.add(PeerConnection.IceServer.builder(iceServer.uri.concat("?transport=tcp")).setUsername(iceServer.username).setPassword(iceServer.password).setTlsCertPolicy(iceServer.tlsCertPolicy).setHostname(iceServer.hostname).createIceServer());
                        i--;
                    }
                    z = true;
                }
            } else if (iceServer.uri.startsWith("stun")) {
                arrayList.add(iceServer);
                z2 = true;
            }
        }
        a4c a4cVar = this.K0;
        if (!z || !z2) {
            a4cVar.log("PCRTCClient", this + ": stun or turn servers are absent");
        }
        a4cVar.log("PCRTCClient", this + ": iceServers=" + arrayList);
        PeerConnection.RTCConfiguration rTCConfiguration = new PeerConnection.RTCConfiguration(arrayList);
        rTCConfiguration.tcpCandidatePolicy = PeerConnection.TcpCandidatePolicy.ENABLED;
        rTCConfiguration.bundlePolicy = PeerConnection.BundlePolicy.MAXBUNDLE;
        rTCConfiguration.rtcpMuxPolicy = PeerConnection.RtcpMuxPolicy.REQUIRE;
        rTCConfiguration.continualGatheringPolicy = PeerConnection.ContinualGatheringPolicy.GATHER_CONTINUALLY;
        rTCConfiguration.keyType = PeerConnection.KeyType.ECDSA;
        rTCConfiguration.iceTransportsType = this.a ? PeerConnection.IceTransportsType.RELAY : PeerConnection.IceTransportsType.ALL;
        rTCConfiguration.sdpSemantics = PeerConnection.SdpSemantics.UNIFIED_PLAN;
        rTCConfiguration.suspendBelowMinBitrate = this.A0;
        return rTCConfiguration;
    }

    public final void h(String str) {
        this.K0.log("PCRTCClient", "handleSdpCreateFailure, " + this + ", error=" + str);
        i("handleSdpCreateFailure", new yra(this, str, 1));
    }

    public final void i(String str, Runnable runnable) {
        ExecutorService executorService = this.F0;
        if (executorService != null) {
            executorService.execute(runnable);
            return;
        }
        roa roaVar = this.G0;
        roaVar.getClass();
        roaVar.a.execute(new mcg(roaVar, str, runnable));
    }

    public final void j(String str, String str2) {
        this.K0.reportException("PCRTCClient", rh4.k("reportError, ", str, " ", str2), new Exception(wg0.i("peer.connection.error.", str)));
        i("reportError", new csa(this, 6));
    }

    public final void k(PeerConnection peerConnection, boolean z) {
        a4c a4cVar = this.K0;
        try {
            l(peerConnection, z, true, this.e1);
        } catch (IllegalStateException e) {
            a4cVar.log("PCRTCClient", "IllegalStateException, " + this + " ex=" + e);
        } catch (Exception e2) {
            a4cVar.log("PCRTCClient", "Exception, " + this + " ex=" + e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0181  */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(org.webrtc.PeerConnection r25, boolean r26, boolean r27, org.webrtc.RtpSender r28) {
        /*
            Method dump skipped, instructions count: 1258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nsa.l(org.webrtc.PeerConnection, boolean, boolean, org.webrtc.RtpSender):void");
    }

    public final void m(SessionDescription sessionDescription) {
        this.K0.log("PCRTCClient", "handleSdpCreateSuccess, " + this + ", sdp=" + sessionDescription.type);
        i("handleSdpCreateSuccess", new adg(this, new asa(this, sessionDescription, 0), 1));
    }

    public final void n(final SessionDescription sessionDescription, final boolean z) {
        this.K0.log("PCRTCClient", "handleSdpSetSuccess, " + this + ", sdp=" + sessionDescription.type + ", local ? " + z);
        i("handleSdpSetSuccess", new adg(this, new rj3() { // from class: dsa
            @Override // defpackage.rj3
            public final void accept(Object obj) {
                final nsa nsaVar = this.a;
                Handler handler = nsaVar.C0;
                boolean z2 = z;
                final SessionDescription sessionDescription2 = sessionDescription;
                if (z2) {
                    final int i = 0;
                    handler.post(new Runnable() { // from class: hsa
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i) {
                                case 0:
                                    nsa nsaVar2 = nsaVar;
                                    nsaVar2.getClass();
                                    SessionDescription sessionDescription3 = sessionDescription2;
                                    String str = sessionDescription3.description;
                                    bl5 bl5Var = nsaVar2.Q0;
                                    if (bl5Var.c) {
                                        bl5Var.b = 0L;
                                        bl5Var.a = 0L;
                                        bl5Var.c = false;
                                    }
                                    long jA = bl5.a(str);
                                    bl5Var.b = jA;
                                    if (jA != 0) {
                                        long j = bl5Var.a;
                                        if (j != 0) {
                                            bl5Var.c = true;
                                            bl5Var.d.e(j ^ jA);
                                        }
                                    }
                                    msa msaVar = nsaVar2.Z0;
                                    if (msaVar != null) {
                                        msaVar.m(nsaVar2, sessionDescription3);
                                        break;
                                    }
                                    break;
                                default:
                                    nsa nsaVar3 = nsaVar;
                                    nsaVar3.getClass();
                                    SessionDescription sessionDescription4 = sessionDescription2;
                                    String str2 = sessionDescription4.description;
                                    bl5 bl5Var2 = nsaVar3.Q0;
                                    if (bl5Var2.c) {
                                        bl5Var2.b = 0L;
                                        bl5Var2.a = 0L;
                                        bl5Var2.c = false;
                                    }
                                    long jA2 = bl5.a(str2);
                                    bl5Var2.a = jA2;
                                    long j2 = bl5Var2.b;
                                    if (j2 != 0 && jA2 != 0) {
                                        bl5Var2.c = true;
                                        bl5Var2.d.e(jA2 ^ j2);
                                    }
                                    msa msaVar2 = nsaVar3.Z0;
                                    if (msaVar2 != null) {
                                        msaVar2.a(nsaVar3, sessionDescription4);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                } else {
                    final int i2 = 1;
                    handler.post(new Runnable() { // from class: hsa
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    nsa nsaVar2 = nsaVar;
                                    nsaVar2.getClass();
                                    SessionDescription sessionDescription3 = sessionDescription2;
                                    String str = sessionDescription3.description;
                                    bl5 bl5Var = nsaVar2.Q0;
                                    if (bl5Var.c) {
                                        bl5Var.b = 0L;
                                        bl5Var.a = 0L;
                                        bl5Var.c = false;
                                    }
                                    long jA = bl5.a(str);
                                    bl5Var.b = jA;
                                    if (jA != 0) {
                                        long j = bl5Var.a;
                                        if (j != 0) {
                                            bl5Var.c = true;
                                            bl5Var.d.e(j ^ jA);
                                        }
                                    }
                                    msa msaVar = nsaVar2.Z0;
                                    if (msaVar != null) {
                                        msaVar.m(nsaVar2, sessionDescription3);
                                        break;
                                    }
                                    break;
                                default:
                                    nsa nsaVar3 = nsaVar;
                                    nsaVar3.getClass();
                                    SessionDescription sessionDescription4 = sessionDescription2;
                                    String str2 = sessionDescription4.description;
                                    bl5 bl5Var2 = nsaVar3.Q0;
                                    if (bl5Var2.c) {
                                        bl5Var2.b = 0L;
                                        bl5Var2.a = 0L;
                                        bl5Var2.c = false;
                                    }
                                    long jA2 = bl5.a(str2);
                                    bl5Var2.a = jA2;
                                    long j2 = bl5Var2.b;
                                    if (j2 != 0 && jA2 != 0) {
                                        bl5Var2.c = true;
                                        bl5Var2.d.e(jA2 ^ j2);
                                    }
                                    msa msaVar2 = nsaVar3.Z0;
                                    if (msaVar2 != null) {
                                        msaVar2.a(nsaVar3, sessionDescription4);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                }
            }
        }, 1));
    }

    public final void o(SessionDescription sessionDescription, boolean z, String str) {
        String str2 = "handleSdpSetFailure " + sessionDescription.type + " " + z + " " + sessionDescription.description;
        a4c a4cVar = this.K0;
        a4cVar.log("PCRTCClient", str2);
        a4cVar.reportException("PCRTCClient", zr6.l(new StringBuilder("set."), z ? "local" : "remote", ".sdp.failed"), new Exception(str));
        i("onSetFailure", new yra(this, str, 0));
    }

    public final void p(boolean z) {
        kra kraVar;
        this.i1 = true;
        this.m1 = false;
        this.l1 = false;
        this.Z0 = null;
        this.p1.f();
        qld qldVar = this.D0;
        if (qldVar != null && (kraVar = qldVar.j) != null) {
            kraVar.Y.remove(this);
        }
        this.C0.removeCallbacksAndMessages(null);
        if (z) {
            i("releaseInternal", new csa(this, 7));
        } else {
            i("closeInternal", new csa(this, 8));
        }
    }

    public final void q() throws InterruptedException {
        e24 e24Var;
        this.K0.log("PCRTCClient", "closeInternal, " + this);
        Object obj = null;
        this.b1 = null;
        this.a1 = null;
        this.c1 = null;
        this.e1 = null;
        kq7 kq7Var = this.g1;
        if (kq7Var != null) {
            if (kq7Var.v == this) {
                kq7Var.v = null;
                fwc fwcVar = kq7Var.u;
                if (fwcVar != null) {
                    fwcVar.b.c(new flc(fwcVar, 9, obj));
                }
            }
            this.g1.c.remove(this);
            this.g1 = null;
        }
        koc kocVar = this.O0;
        if (kocVar != null && kocVar.j.compareAndSet(false, true)) {
            kocVar.g.removeCallbacksAndMessages(null);
            Handler handler = kocVar.f;
            handler.removeCallbacksAndMessages(null);
            handler.post(new u60(12, kocVar));
            kocVar.e.quitSafely();
        }
        qp4 qp4Var = this.P0;
        if (qp4Var != null && ((AtomicBoolean) qp4Var.Z).compareAndSet(false, true)) {
            Handler handler2 = (Handler) qp4Var.X;
            handler2.removeCallbacksAndMessages(null);
            handler2.post(new u60(13, qp4Var));
            ((HandlerThread) qp4Var.o).quitSafely();
        }
        c8d c8dVar = this.c;
        if (c8dVar != null && (e24Var = (e24) c8dVar.a) != null) {
            vag vagVar = (vag) c8dVar.b;
            if (vagVar != null) {
                e24Var.c(vagVar);
            }
            c8dVar.a = null;
            c8dVar.b = null;
        }
        koc kocVar2 = this.O0;
        if (kocVar2 != null) {
            try {
                kocVar2.e.join(500L);
            } catch (InterruptedException e) {
                this.K0.reportException("PCRTCClient", "command.exec.shutdown", e);
            }
        }
        qp4 qp4Var2 = this.P0;
        if (qp4Var2 != null) {
            try {
                ((HandlerThread) qp4Var2.o).join(500);
            } catch (InterruptedException e2) {
                this.K0.reportException("PCRTCClient", "notif.recv.shutdown", e2);
            }
        }
        bwc bwcVar = this.b;
        if (bwcVar != null) {
            bwcVar.f = true;
            for (vbg vbgVar : bwcVar.a.values()) {
                if (vbgVar != null) {
                    vbgVar.a();
                }
            }
            e24 e24Var2 = bwcVar.d;
            if (e24Var2 != null) {
                vag vagVar2 = bwcVar.g;
                if (vagVar2 != null) {
                    e24Var2.c(vagVar2);
                }
                bwcVar.d = null;
                bwcVar.g = null;
            }
        }
        ni niVar = this.v0;
        if (niVar != null) {
            e24 e24Var3 = niVar.c;
            if (e24Var3 != null) {
                e24Var3.c(niVar);
            }
            niVar.c = null;
        }
        kj kjVar = this.t0;
        if (kjVar != null) {
            kjVar.b();
        }
        kj kjVar2 = this.t0;
        if (kjVar2 != null) {
            kjVar2.b();
        }
        ni niVar2 = this.v0;
        if (niVar2 != null) {
            e24 e24Var4 = niVar2.c;
            if (e24Var4 != null) {
                e24Var4.c(niVar2);
            }
            niVar2.c = null;
        }
        if (this.V0 != null) {
            this.V0.dispose();
            this.K0.log("PCRTCClient", this + ": " + jb9.c(this.V0) + " was disposed");
            this.V0 = null;
        }
        this.K0.log("PCRTCClient", this + ": " + jb9.c(this) + " was closed");
    }

    public final void r(IceCandidate iceCandidate) {
        this.K0.log("PCRTCClient", "addRemoteIceCandidate, " + this);
        i("addRemoteIceCandidate", new adg(this, new bsa(this, iceCandidate, 0), 1));
    }

    public final void s(ji9 ji9Var) {
        yuc yucVar = this.q1;
        if (yucVar == null) {
            this.K0.reportException("PCRTCClient", "No permission provider passed", new IllegalStateException("No permission provider passed"));
            return;
        }
        boolean z = ji9Var.b;
        if (z != this.k1) {
            this.k1 = z;
            i("screenCaptureEnable", new v05(this, ji9Var, yucVar, 22));
        }
    }

    public final void t() {
        MediaConstraints mediaConstraints = new MediaConstraints();
        this.X0 = mediaConstraints;
        mediaConstraints.optional.add(new MediaConstraints.KeyValuePair("DtlsSrtpKeyAgreement", "true"));
        if (this.H0 == 2) {
            this.K0.log("PCRTCClient", this + ": video capture is disabled.");
        }
        this.Y0 = new MediaConstraints();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        boolean z = jb9.a;
        sb.append(Integer.toString(System.identityHashCode(this)));
        sb.append('@');
        int i = this.H0;
        sb.append(i != 0 ? i != 1 ? i != 2 ? "?" : "Receive" : "Send" : "SendReceive");
        sb.append("PeerConnection@");
        PeerConnection peerConnection = this.V0;
        sb.append(peerConnection != null ? Integer.toString(System.identityHashCode(peerConnection)) : "Ø");
        return sb.toString();
    }

    public final void u(PeerConnection peerConnection, boolean z) {
        a4c a4cVar = this.K0;
        try {
            l(peerConnection, z, false, this.a1);
        } catch (IllegalStateException e) {
            a4cVar.log("PCRTCClient", "IllegalStateException, " + this + " ex=" + e);
        } catch (Exception e2) {
            a4cVar.log("PCRTCClient", "Exception, " + this + " ex=" + e2);
        }
    }

    public final void v(PeerConnection peerConnection) {
        hd9 hd9Var = this.B0;
        hd9Var.getClass();
        int iG = hd9Var.g(this.e1) + hd9Var.g(this.a1) + hd9Var.g(this.c1) + hd9Var.g(this.b1);
        peerConnection.setBitrate(6000, null, Integer.valueOf(iG));
        this.K0.log("PCRTCClient", "Bitrate constraints were set to [6000:" + iG + "]");
    }

    public final void w() {
        this.K0.log("PCRTCClient", "createAnswer, " + this);
        this.m1 = false;
        i("createAnswer", new adg(this, new fsa(this, 1), 1));
    }

    public final void x(boolean z) {
        this.K0.log("PCRTCClient", "createOffer, " + this + " iceRestart=" + z);
        this.m1 = false;
        i("createOffer", new adg(this, new xra(this, z, 0), 1));
    }

    public final void y(List list) {
        if (y1 == null) {
            this.K0.log("PCRTCClient", "Creating peer connection without initializing factory.");
            return;
        }
        if (!this.j1) {
            this.j1 = true;
            i("createPeerConnection", new do9(this, 10, list));
            return;
        }
        this.K0.log("PCRTCClient", this + ": creation of a peer connection is already scheduled");
    }

    public final void z() {
        this.K0.log("PCRTCClient", "createPeerConnectionInternal, " + this);
        if (this.W0) {
            this.K0.log("PCRTCClient", this + ": fatal error occurred");
            return;
        }
        PeerConnectionFactory peerConnectionFactory = this.D0.d;
        if (peerConnectionFactory == null) {
            this.K0.log("PCRTCClient", this + ": no peer connection factory");
            return;
        }
        this.K0.log("PCRTCClient", this + ": peer connection constraints: " + this.X0.toString());
        PeerConnection.RTCConfiguration rTCConfigurationG = g(this.d1);
        if ((this.G0 == null || roa.X.get() != roa.o) && this.F0 == null) {
            this.C0.post(new nn6(25, new RuntimeException()));
        }
        this.V0 = peerConnectionFactory.createPeerConnection(rTCConfigurationG, this.X0, new isa(this));
        if (this.V0 == null) {
            throw new IllegalStateException("peerconnection is null");
        }
        boolean z = true;
        if (this.H0 != 2) {
            kq7 kq7Var = (kq7) this.E0.a().b;
            this.g1 = kq7Var;
            if (kq7Var != null) {
                this.K0.log("PCRTCClient", this + ": has " + jb9.c(this.g1));
                org.webrtc.Size sizeH = this.g1.h();
                this.y0 = sizeH.width;
                this.z0 = sizeH.height;
                zuc zucVar = this.g1.t;
                this.x0 = zucVar != null ? zucVar.f : 0;
                zuc zucVar2 = this.g1.t;
                this.w0 = zucVar2 != null ? zucVar2.g : 0;
                rz3 rz3Var = this.o1;
                rz3Var.f = this.z0;
                rz3Var.c = this.y0;
                zuc zucVar3 = this.g1.t;
                rz3Var.h = zucVar3 != null ? zucVar3.f : 0;
                rz3 rz3Var2 = this.o1;
                zuc zucVar4 = this.g1.t;
                rz3Var2.g = zucVar4 != null ? zucVar4.g : 0;
                PeerConnection peerConnection = this.V0;
                kq7 kq7Var2 = this.g1;
                List<String> listSingletonList = Collections.singletonList(kq7Var2.m);
                n60 n60Var = kq7Var2.i;
                AudioTrack audioTrack = n60Var != null ? (AudioTrack) ((MediaStreamTrack) n60Var.X) : null;
                if (audioTrack != null) {
                    hd9 hd9Var = this.B0;
                    RtpSender rtpSenderAddTrack = peerConnection.addTrack(audioTrack, listSingletonList);
                    hd9Var.c(rtpSenderAddTrack, MediaStreamTrack.AUDIO_TRACK_KIND);
                    this.b1 = rtpSenderAddTrack;
                }
                VideoTrack videoTrack = (VideoTrack) ((MediaStreamTrack) kq7Var2.y.X);
                if (videoTrack != null) {
                    hd9 hd9Var2 = this.B0;
                    RtpSender rtpSenderAddTrack2 = peerConnection.addTrack(videoTrack, listSingletonList);
                    hd9Var2.d(rtpSenderAddTrack2, MediaStreamTrack.VIDEO_TRACK_KIND, 30000, 2048000, null, false);
                    this.a1 = rtpSenderAddTrack2;
                }
                v(peerConnection);
                RtpSender rtpSender = this.a1;
                if (this.r1 && rtpSender != null) {
                    rtpSender.setVideoEncoderObserver(new ar0(this, z));
                }
                this.K0.log("PCRTCClient", this + ": " + jb9.c(this.b1) + "(audio) created");
                this.K0.log("PCRTCClient", this + ": " + jb9.c(this.a1) + "(video) created");
                F();
                this.g1.c.add(this);
                if (this.u1) {
                    kq7 kq7Var3 = this.g1;
                    e24 e24VarC = c("consumerScreenShare", new DataChannel.Init());
                    lq7 lq7Var = kq7Var3.v;
                    if (lq7Var != null) {
                        nsa nsaVar = (nsa) lq7Var;
                        nsaVar.K0.log("PCRTCClient", "Data channel screen capturer unbound from " + nsaVar);
                    }
                    kq7Var3.v = this;
                    this.K0.log("PCRTCClient", "Data channel screen capturer bound to " + this);
                    fwc fwcVar = kq7Var3.u;
                    if (fwcVar == null) {
                        fwcVar = new fwc(kq7Var3.a, kq7Var3.d.getApplicationContext(), kq7Var3.n, kq7Var3.E, kq7Var3.C);
                        kq7Var3.u = fwcVar;
                    }
                    fwcVar.b.c(new flc(fwcVar, 9, e24VarC));
                }
            }
        }
        if (this.O0 != null) {
            e24 e24VarC2 = c("producerCommand", new DataChannel.Init());
            koc kocVar = this.O0;
            if (kocVar.j.get()) {
                throw new IllegalStateException("Instance is disposed");
            }
            kocVar.f.post(new flc(kocVar, 5, e24VarC2));
        }
        if (this.P0 != null) {
            e24 e24VarC3 = c("producerNotification", new DataChannel.Init());
            qp4 qp4Var = this.P0;
            if (((AtomicBoolean) qp4Var.Z).get()) {
                throw new IllegalStateException("Instance is disposed");
            }
            ((Handler) qp4Var.X).post(new flc(qp4Var, 6, e24VarC3));
        }
        bwc bwcVar = this.b;
        if (bwcVar != null) {
            e24 e24VarC4 = c("producerScreenShare", new DataChannel.Init());
            e24 e24Var = bwcVar.d;
            if (e24Var != null) {
                vag vagVar = bwcVar.g;
                if (vagVar != null) {
                    e24Var.c(vagVar);
                }
                bwcVar.d = null;
                bwcVar.g = null;
            }
            bwcVar.d = e24VarC4;
            vag vagVar2 = new vag(3, bwcVar);
            bwcVar.g = vagVar2;
            e24VarC4.a(vagVar2);
        }
        if (this.c != null) {
            e24 e24VarC5 = c("asr", new DataChannel.Init());
            c8d c8dVar = this.c;
            e24 e24Var2 = (e24) c8dVar.a;
            if (e24Var2 != null) {
                vag vagVar3 = (vag) c8dVar.b;
                if (vagVar3 != null) {
                    e24Var2.c(vagVar3);
                }
                c8dVar.a = null;
                c8dVar.b = null;
            }
            c8dVar.a = e24VarC5;
            vag vagVar4 = new vag(1, c8dVar);
            c8dVar.b = vagVar4;
            e24VarC5.a(vagVar4);
        }
        int i = this.v1;
        if (i == 1 || i == 3) {
            DataChannel.Init init = new DataChannel.Init();
            if (this.v1 == 3) {
                init.id = 1;
                init.negotiated = true;
            }
            e24 e24VarC6 = c("animoji", init);
            kj kjVar = this.t0;
            if (kjVar != null) {
                kjVar.d(e24VarC6);
            }
            ni niVar = this.v0;
            if (niVar != null) {
                e24 e24Var3 = niVar.c;
                if (e24Var3 != null) {
                    e24Var3.c(niVar);
                }
                niVar.c = e24VarC6;
                kad kadVar = niVar.b;
                ((AtomicInteger) kadVar.X).set(0);
                ((AtomicInteger) kadVar.Y).set(0);
                e24VarC6.a(niVar);
            }
        }
        this.K0.log("PCRTCClient", this + ": peer connection created");
    }
}
