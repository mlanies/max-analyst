package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Camera;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.AndroidVideoDecoder;
import org.webrtc.EglBase;
import org.webrtc.MediaStreamTrack;
import org.webrtc.NetworkChangeDetector;
import org.webrtc.NetworkMonitor;
import org.webrtc.PeerConnection;
import org.webrtc.StatsReport;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.analytics.events.SdkIntervalStatEvent;
import ru.ok.android.externcalls.sdk.b;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;

/* loaded from: classes2.dex */
public final class py0 implements xn1, mq7, NetworkMonitor.NetworkObserver {
    public static final ExecutorService o2 = Executors.newSingleThreadExecutor();
    public static final ExecutorService p2 = Executors.newSingleThreadExecutor();
    public boolean A0;
    public boolean A1;
    public boolean B0;
    public final boolean B1;
    public final boolean C0;
    public final boolean C1;
    public final gw3 D0;
    public final o9g D1;
    public final boolean E0;
    public final bg4 E1;
    public String F0;
    public final vte F1;
    public long G0;
    public final yuc G1;
    public long H0;
    public bg1 I1;
    public List J1;
    public volatile boolean K1;
    public List L0;
    public final kd1 L1;
    public final wva M1;
    public boolean N0;
    public final dq1 N1;
    public final int O0;
    public final g03 O1;
    public boolean P0;
    public final glc P1;
    public ji6 Q0;
    public final oq9 Q1;
    public boolean R0;
    public final vk8 R1;
    public final kxf S0;
    public final vm1 S1;
    public final kxf T0;
    public final epd T1;
    public final d4c U0;
    public final qp4 U1;
    public final a4c V0;
    public final fd7 V1;
    public final rf0 W0;
    public final id1 W1;
    public final boolean X0;
    public final va8 X1;
    public final sl1 Y1;
    public rod Z;
    public final rh1 Z1;
    public boolean a;
    public boolean a1;
    public final t01 a2;
    public wq9 b;
    public b b1;
    public final die b2;
    public boolean c1;
    public final pl5 c2;
    public rj3 d1;
    public final boolean d2;
    public final re6 e1;
    public final tg4 e2;
    public long f1;
    public b0e f2;
    public final h7b g2;
    public final od h2;
    public volatile boolean i2;
    public final s04 j1;
    public final vq7 j2;
    public final qld k1;
    public final va8 k2;
    public final d l1;
    public ssa l2;
    public final i50 m1;
    public ssa m2;
    public final aq7 n1;
    public final kj6 n2;
    public final i7b o1;
    public final kg1 p1;
    public boolean s1;
    public final Context t0;
    public yn1 t1;
    public final ag1 u0;
    public yn1 u1;
    public String v0;
    public pg4 v1;
    public boolean w0;
    public volatile ly0 w1;
    public final EglBase x0;
    public boolean x1;
    public final oe1 y0;
    public final ji9 y1;
    public final oq0 z1;
    public final wx0 c = new wx0(this, 2);
    public final wx0 o = new wx0(this, 0);
    public final sbg X = new sbg(this);
    public final xx0 Y = new xx0(this);
    public final Handler s0 = new Handler(Looper.getMainLooper());
    public final EnumSet z0 = EnumSet.noneOf(oy0.class);
    public boolean I0 = false;
    public final gwe J0 = new gwe(7, this);
    public boolean K0 = false;
    public final ArrayList M0 = new ArrayList();
    public boolean Y0 = true;
    public boolean Z0 = true;
    public final zbg g1 = new zbg(this);
    public final nh3 h1 = new nh3(1, this);
    public final oof i1 = new oof(this);
    public final CopyOnWriteArraySet q1 = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet r1 = new CopyOnWriteArraySet();
    public int H1 = 0;

    /* JADX WARN: Type inference failed for: r2v10, types: [gy0] */
    /* JADX WARN: Type inference failed for: r3v11, types: [gy0] */
    /* JADX WARN: Type inference failed for: r5v4, types: [ky0] */
    /* JADX WARN: Type inference failed for: r6v6, types: [ky0] */
    public py0(Context context, ag1 ag1Var, boolean z, boolean z2, fg1 fg1Var, hw3 hw3Var, boolean z3, boolean z4, d4c d4cVar, a4c a4cVar, b4c b4cVar, gy9 gy9Var, boolean z5, dnc dncVar, bi biVar, wte wteVar, CallAnalyticsSender callAnalyticsSender, i7b i7bVar, yuc yucVar) {
        id1 id1Var = new id1();
        this.W1 = id1Var;
        va8 va8Var = new va8(id1Var);
        this.X1 = va8Var;
        this.n2 = new kj6(19);
        this.F1 = wteVar;
        final kg1 kg1Var = new kg1(fg1Var, id1Var, va8Var, a4cVar);
        this.p1 = kg1Var;
        this.u0 = ag1Var;
        this.e1 = new re6(9);
        this.B0 = z;
        this.C0 = z2;
        ji9 ji9Var = fg1Var.c;
        this.y1 = ji9Var;
        this.z1 = new oq0();
        this.D0 = hw3Var;
        this.E0 = z4;
        this.U0 = d4cVar;
        this.V0 = a4cVar;
        aab aabVar = new aab();
        aabVar.a = a4cVar;
        this.o1 = i7bVar;
        this.B1 = z5;
        this.d2 = ag1Var.i;
        o9g o9gVar = new o9g(19);
        this.D1 = o9gVar;
        this.N1 = new dq1(a4cVar);
        uf0 uf0Var = ag1Var.A;
        this.W0 = new rf0(uf0Var.a != null, uf0Var.c.a);
        this.O1 = new g03(1, a4cVar);
        final int i = 0;
        final int i2 = 1;
        this.R1 = new vk8(a4cVar, aabVar, new m56(this) { // from class: gy0
            public final /* synthetic */ py0 b;

            {
                this.b = this;
            }

            @Override // defpackage.m56
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        this.b.t1.C((y1e) obj);
                        break;
                    default:
                        this.b.t1.P((o1e) obj);
                        break;
                }
                return e5f.a;
            }
        }, new m56(this) { // from class: gy0
            public final /* synthetic */ py0 b;

            {
                this.b = this;
            }

            @Override // defpackage.m56
            public final Object invoke(Object obj) {
                switch (i2) {
                    case 0:
                        this.b.t1.C((y1e) obj);
                        break;
                    default:
                        this.b.t1.P((o1e) obj);
                        break;
                }
                return e5f.a;
            }
        }, new xx0(this), wteVar);
        Context applicationContext = context.getApplicationContext();
        this.t0 = applicationContext;
        NetworkMonitor.init(applicationContext);
        vm1 vm1Var = new vm1(applicationContext, new qz7(d4cVar, callAnalyticsSender), wteVar, (ConnectivityManager) context.getSystemService("connectivity"), (TelephonyManager) context.getSystemService("phone"), a4cVar, new vx0(this, 1), hw3Var);
        this.S1 = vm1Var;
        vm1Var.m.c.getClass();
        a4cVar.log("OKRTCCall", "Call<init> caller = " + z + " " + Build.MANUFACTURER + " " + Build.MODEL + " " + Build.DEVICE);
        this.t1 = new zs4(kg1Var, ag1Var, a4cVar, d4cVar, id1Var);
        s04 s04Var = new s04();
        s04Var.d = new Hashtable();
        s04Var.e = new wk8();
        s04Var.f = ag1Var;
        s04Var.g = d4cVar;
        s04Var.h = a4cVar;
        s04Var.i = fg1Var;
        this.j1 = s04Var;
        v("rtc.init.sw.codec.false");
        v("rtc.abi." + Build.CPU_ABI);
        vq7 vq7Var = new vq7(a4cVar, d4cVar);
        this.j2 = vq7Var;
        za3 za3VarK = new sa3(2, new l5(3, vq7Var)).k(muc.a());
        uy1 uy1Var = new uy1(1);
        za3VarK.i(uy1Var);
        ((hc3) vq7Var.o).a(uy1Var);
        EglBase eglBaseCreate = EglBase.create();
        this.x0 = eglBaseCreate;
        a4cVar.log("OKRTCCall", jb9.c(eglBaseCreate) + " was created");
        this.y0 = new oe1(a4cVar, eglBaseCreate.getEglBaseContext(), EglBase.CONFIG_PLAIN, null);
        int numberOfCameras = Camera.getNumberOfCameras();
        this.O0 = numberOfCameras;
        u(e0e.callDevices, numberOfCameras + "_1");
        this.S0 = new kxf("pc_created", a4cVar);
        this.T0 = new kxf("accepted", a4cVar);
        tg4 tg4Var = new tg4(a4cVar);
        this.e2 = tg4Var;
        qld qldVar = new qld(eglBaseCreate, a4cVar, ag1Var, tg4Var);
        this.k1 = qldVar;
        aq7 aq7Var = new aq7(context, a4cVar);
        this.n1 = aq7Var;
        od odVar = new od();
        odVar.a = false;
        odVar.Y = context;
        odVar.o = ag1Var.j;
        odVar.b = gy9Var;
        odVar.X = aq7Var;
        odVar.a = ag1Var.B.a;
        odVar.c = a4cVar;
        if (((gy9) odVar.b) == null || ((aq7) odVar.X) == null) {
            throw new IllegalStateException();
        }
        i50 i50Var = new i50(odVar);
        this.m1 = i50Var;
        u5e u5eVar = new u5e(this);
        nld nldVar = new nld();
        nldVar.a = qldVar;
        nldVar.b = i50Var;
        nldVar.j = ag1Var.B.e;
        nldVar.c = ji9Var;
        nldVar.i = null;
        nldVar.d = context;
        nldVar.e = a4cVar;
        nldVar.k = ag1Var.c;
        nldVar.l = eglBaseCreate.getEglBaseContext();
        nldVar.f = ag1Var;
        nldVar.g = new xx0(this);
        nldVar.m = aq7Var;
        nldVar.o = dncVar;
        nldVar.n = wteVar;
        nldVar.p = new ync(12, aabVar);
        nldVar.h = u5eVar;
        if (nldVar.a == null || nldVar.b == null || nldVar.m == null || nldVar.d == null || nldVar.c == null || nldVar.e == null || nldVar.f == null || nldVar.g == null || nldVar.o == null || nldVar.h == null) {
            throw new IllegalStateException();
        }
        d dVar = new d(nldVar);
        this.l1 = dVar;
        dVar.y0.add(this);
        ece eceVar = new ece(this);
        dVar.H0 = eceVar;
        if (dVar.z0 != null) {
            dVar.z0.x = eceVar;
        }
        this.C1 = z3;
        ji9Var.a.add(new ii9() { // from class: yx0
            @Override // defpackage.ii9
            public final void i(ji9 ji9Var2) {
                q7 q7Var = this.a.S1.m;
                boolean z6 = ji9Var2.f;
                s7 s7Var = q7Var.b;
                if (!z6) {
                    s7Var.a();
                } else {
                    if (s7Var.b) {
                        return;
                    }
                    s7Var.b = true;
                    ((wte) ((vte) s7Var.c)).getClass();
                    s7Var.a = SystemClock.elapsedRealtime();
                }
            }
        });
        ji9Var.a.add(new e04(new ync(10, kg1Var)));
        AndroidVideoDecoder.errorCallback = new zx0(this);
        NetworkMonitor.getInstance().addObserver(this);
        this.X0 = ag1Var.k;
        this.M1 = new wva(a4cVar, 6, b4cVar);
        this.P1 = new glc(new i50(new wmc(this, false), new mfe(this), a4cVar, ag1Var));
        this.Q1 = new oq9(16);
        this.E1 = new bg4(this, qldVar, a4cVar, o9gVar, biVar, ji9Var, eglBaseCreate);
        final int i3 = 0;
        kd1 kd1Var = new kd1(kg1Var, a4cVar, new bk(1, this), new yb9(), new k56() { // from class: ky0
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return kg1Var.k;
                    default:
                        return Integer.valueOf(kg1Var.r());
                }
            }
        }, aq7Var);
        this.L1 = kd1Var;
        epd epdVar = new epd(a4cVar, kg1Var.a, kd1Var);
        this.T1 = epdVar;
        sl1 sl1Var = new sl1(a4cVar, kg1Var, va8Var, kd1Var, id1Var, new h7b(epdVar.g, new vx0(this, 2), false, 20), new imc(epdVar.o, new vx0(this, 3), false, 20), this.F1);
        this.Y1 = sl1Var;
        bk bkVar = new bk(1, this);
        id1 id1Var2 = this.W1;
        ag1 ag1Var2 = this.u0;
        qp4 qp4Var = new qp4();
        qp4Var.b = new k8g(kg1Var, epdVar.a, bkVar);
        qp4Var.c = new c8d(bkVar, a4cVar, epdVar.b, epdVar.d);
        qp4Var.a = new kxf(epdVar.m, epdVar.n, epdVar.o, sl1Var, ag1Var2.t);
        qp4Var.o = new c8d(a4cVar, epdVar.c, epdVar.h, id1Var2.j);
        qp4Var.X = new djb(epdVar.p, id1Var2.d, false, 13);
        qp4Var.Y = id1Var2.p;
        qp4Var.Z = new adb(kg1Var, epdVar.q, id1Var2.k);
        qp4Var.s0 = new bdb(id1Var2.q, 10, epdVar.k);
        qp4Var.t0 = new va8(id1Var2.r, 11, epdVar.l);
        this.U1 = qp4Var;
        fd7 fd7Var = new fd7();
        fd7Var.a = new mfe(id1Var.l);
        this.V1 = fd7Var;
        this.Z1 = new rh1(epdVar.i, id1Var);
        this.a2 = new t01(epdVar.j, id1Var);
        n61 n61Var = vm1Var.j;
        die dieVar = new die();
        dieVar.a = n61Var;
        dieVar.b = wteVar;
        dieVar.c = new LinkedHashMap();
        dieVar.o = new LinkedHashSet();
        this.b2 = dieVar;
        final int i4 = 1;
        this.c2 = new pl5(vm1Var.j, aabVar, wteVar, z, new vx0(this, 4), new k56() { // from class: ky0
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return kg1Var.k;
                    default:
                        return Integer.valueOf(kg1Var.r());
                }
            }
        }, a4cVar);
        this.g2 = new h7b(8, this);
        this.G1 = yucVar;
        vx0 vx0Var = new vx0(this, 0);
        od odVar2 = new od();
        odVar2.b = a4cVar;
        odVar2.c = vx0Var;
        xpb xpbVar = new xpb();
        odVar2.o = xpbVar;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ztc ztcVarA = muc.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(ztcVarA, "scheduler is null");
        odVar2.X = new hz9(xpbVar, timeUnit, ztcVarA, 0).n(ce.a()).p(new xje(4, odVar2));
        this.h2 = odVar2;
        odVar2.Y = new ync(10, kg1Var);
        pqf pqfVar = new pqf((short) 500, new Handler(Looper.getMainLooper()), new ule(16, new ync(11, odVar2)));
        qld qldVar2 = this.k1;
        qldVar2.getClass();
        qldVar2.a.execute(new tb2(qldVar2, pqfVar, 200L, 6));
        this.k2 = new va8(7, a4cVar);
    }

    public static boolean t(fg1 fg1Var) {
        for (eg1 eg1Var : fg1Var.e) {
            if (eg1Var == eg1.b || eg1Var == eg1.a) {
                return true;
            }
        }
        return false;
    }

    public final void A(yn1 yn1Var, PeerConnection.IceConnectionState iceConnectionState) {
        int i;
        this.V0.log("OKRTCCall", "handleTopologyIceConnectionChange, " + yn1Var + ", state=" + iceConnectionState);
        u(e0e.callIceConnectionState, iceConnectionState.toString());
        if (yn1Var != this.t1) {
            if (yn1Var != this.u1) {
                this.V0.reportException("OKRTCCall", "topology.ice.conn.change", new Exception("unexpected.topology"));
                return;
            }
            return;
        }
        boolean z = iceConnectionState == PeerConnection.IceConnectionState.CONNECTED;
        this.S1.k = z;
        if (!z) {
            if (iceConnectionState == PeerConnection.IceConnectionState.DISCONNECTED) {
                if (this.K0) {
                    this.G0 = (SystemClock.elapsedRealtime() - this.H0) + this.G0;
                }
                this.K0 = false;
                k(w51.b, null);
                return;
            }
            if (iceConnectionState == PeerConnection.IceConnectionState.FAILED) {
                yn1 yn1Var2 = this.t1;
                xxe xxeVar = xxe.c;
                if (yn1Var2.H(xxeVar) && NetworkMonitor.isOnline() && (i = this.H1) < 3) {
                    this.H1 = i + 1;
                    e(xxeVar, true);
                    c(this.t1);
                }
                this.s0.removeCallbacks(this.J0);
                boolean zH = yn1Var.H(xxe.b);
                if (!(this.F0 == null && this.f1 == 0 && this.C1) && zH) {
                    return;
                }
                Handler handler = this.s0;
                gwe gweVar = this.J0;
                this.u0.b.getClass();
                handler.postDelayed(gweVar, 30000);
                return;
            }
            return;
        }
        vm1 vm1Var = this.S1;
        sm1 sm1Var = vm1Var.h;
        sm1Var.i.g();
        sm1Var.j.c();
        h7b h7bVar = (h7b) sm1Var.l.o;
        h7bVar.b = null;
        h7bVar.c = null;
        sm1Var.k.c();
        glc glcVar = sm1Var.m;
        ((w4d) glcVar.b).b = null;
        ((w4d) glcVar.c).b = null;
        ((ece) vm1Var.g.o).a = null;
        this.K0 = true;
        if (this.Y0) {
            final a8g a8gVar = this.S1.f;
            a8gVar.getClass();
            long jX = yn1Var.x();
            if (jX != -1) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime() - jX;
                yn1Var.C(new y1e() { // from class: rm1
                    @Override // defpackage.y1e
                    public final void a(StatsReport[] statsReportArr, StatsReport[] statsReportArr2, ar0[] ar0VarArr, Map map, yn1 yn1Var3) {
                        a8g a8gVar2 = a8gVar;
                        x3c x3cVar = new x3c((a4c) a8gVar2.o, statsReportArr);
                        HashMap map2 = new HashMap();
                        qz7 qz7Var = (qz7) a8gVar2.a;
                        map2.put("vcid", ((d4c) qz7Var.b).conversationId);
                        String str = (String) x3cVar.o;
                        if (str == null) {
                            str = "";
                        }
                        map2.put("local_connection_type", str);
                        String str2 = (String) x3cVar.c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        map2.put("remote_connection_type", str2);
                        String str3 = (String) x3cVar.X;
                        if (str3 == null) {
                            str3 = "";
                        }
                        map2.put("local_address", str3);
                        String str4 = (String) x3cVar.Y;
                        map2.put("remote_address", str4 != null ? str4 : "");
                        map2.put("network_type", jb9.b((ConnectivityManager) a8gVar2.b, (TelephonyManager) a8gVar2.c));
                        map2.put("stat_time_delta", String.valueOf(jElapsedRealtime));
                        ((d4c) qz7Var.b).log(d4c.COLLECTOR_WEBRTC, "callStatConnect", map2);
                    }
                });
            }
        }
        this.Y0 = false;
        this.H0 = SystemClock.elapsedRealtime();
        k(w51.a, null);
        this.s0.removeCallbacks(this.J0);
        if (this.X0) {
            rf0 rf0Var = this.W0;
            rf0Var.c.b = 0.0d;
            rf0Var.b.b = 0.0d;
            rf0Var.m = false;
            rf0Var.p = Double.NaN;
            rf0Var.o = Double.NaN;
            rf0Var.a();
        }
        this.H1 = 0;
        yn1 yn1Var3 = this.u1;
        if (yn1Var3 != null) {
            yn1Var3.L();
            this.u1 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(boolean r7) {
        /*
            r6 = this;
            a4c r0 = r6.V0
            java.lang.String r1 = "OKRTCCall"
            java.lang.String r2 = "onUserAnswered"
            r0.log(r1, r2)
            boolean r0 = r6.K1
            r1 = 1
            if (r0 == 0) goto L4c
            h7b r0 = r6.g2
            oy0 r2 = defpackage.oy0.X
            java.lang.Object r0 = r0.b
            py0 r0 = (defpackage.py0) r0
            java.util.EnumSet r0 = r0.z0
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L1f
            return
        L1f:
            h7b r0 = r6.g2
            java.lang.Object r2 = r0.b
            py0 r2 = (defpackage.py0) r2
            kg1 r3 = r2.p1
            java.util.Collection r3 = r3.i()
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ r1
            if (r3 == 0) goto L33
            goto L4c
        L33:
            java.lang.Object r6 = r0.c
            nqa r6 = (defpackage.nqa) r6
            if (r6 != 0) goto L4b
            nqa r6 = new nqa
            r6.<init>(r0)
            id1 r7 = r2.W1
            nqa r7 = r7.c
            java.lang.Object r7 = r7.b
            java.util.concurrent.CopyOnWriteArraySet r7 = (java.util.concurrent.CopyOnWriteArraySet) r7
            r7.add(r6)
            r0.c = r6
        L4b:
            return
        L4c:
            h7b r0 = r6.g2
            java.lang.Object r2 = r0.c
            nqa r2 = (defpackage.nqa) r2
            r3 = 0
            if (r2 == 0) goto L66
            java.lang.Object r4 = r0.b
            py0 r4 = (defpackage.py0) r4
            id1 r4 = r4.W1
            nqa r4 = r4.c
            java.lang.Object r4 = r4.b
            java.util.concurrent.CopyOnWriteArraySet r4 = (java.util.concurrent.CopyOnWriteArraySet) r4
            r4.remove(r2)
            r0.c = r3
        L66:
            boolean r0 = r6.A1
            r0 = r0 ^ r1
            r6.A1 = r1
            boolean r2 = r6.i()
            if (r2 != 0) goto L72
            return
        L72:
            boolean r2 = r6.i2
            r4 = 0
            if (r2 == 0) goto L8f
            if (r7 == 0) goto L90
            aq7 r2 = r6.n1
            boolean r2 = r2.d
            if (r2 != 0) goto L90
            aq7 r7 = r6.n1
            boolean r7 = r7.a()
            if (r7 == 0) goto L8f
            aq7 r7 = r6.n1
            boolean r7 = r7.d
            if (r7 == 0) goto L8f
            r7 = r1
            goto L90
        L8f:
            r7 = r4
        L90:
            r6.s1 = r1
            e0e r2 = defpackage.e0e.callAcceptIncoming
            if (r7 == 0) goto L99
            java.lang.String r5 = "video"
            goto L9b
        L99:
            java.lang.String r5 = "audio"
        L9b:
            r6.u(r2, r5)
            r6.m(r7)
            kg1 r7 = r6.p1
            fg1 r7 = r7.a
            if (r0 == 0) goto Lae
            boolean r0 = r7.b()
            if (r0 == 0) goto Lae
            goto Laf
        Lae:
            r1 = r4
        Laf:
            boolean r0 = r7.b()
            if (r0 != 0) goto Lbe
            kpa r0 = defpackage.fg1.r
            r7.e(r0)
            r6.w()
            goto Lc1
        Lbe:
            r6.x()
        Lc1:
            if (r1 == 0) goto Lcd
            yn1 r7 = r6.t1
            r6.c(r7)
            w51 r7 = defpackage.w51.u0
            r6.k(r7, r3)
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.py0.B(boolean):void");
    }

    public final void C() {
        if (this.I0) {
            this.V0.log("OKRTCCall", "Can't start interaction twice. Ignore");
            return;
        }
        this.I0 = true;
        x();
        Iterator it = this.p1.i().iterator();
        while (it.hasNext()) {
            this.t1.u((fg1) it.next(), true);
        }
        boolean z = this.E0;
        m(z);
        u(e0e.callStart, z ? MediaStreamTrack.VIDEO_TRACK_KIND : MediaStreamTrack.AUDIO_TRACK_KIND);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(boolean r7) {
        /*
            r6 = this;
            boolean r0 = r6.i()
            if (r0 != 0) goto L7
            return
        L7:
            yn1 r0 = r6.t1
            xxe r1 = defpackage.xxe.c
            boolean r0 = r0.H(r1)
            if (r0 == 0) goto L88
            r0 = 0
            if (r7 == 0) goto L39
            d r7 = r6.l1
            ji9 r1 = r6.y1
            boolean r1 = r1.c
            kq7 r7 = r7.z0
            if (r7 == 0) goto L39
            if (r1 == 0) goto L2b
            zuc r7 = r7.t
            if (r7 == 0) goto L39
            org.webrtc.ScreenCapturerAndroid r7 = r7.a
            android.media.projection.MediaProjection r7 = r7.getMediaProjection()
            goto L3a
        L2b:
            fwc r7 = r7.u
            if (r7 != 0) goto L30
            goto L39
        L30:
            h26 r7 = r7.o
            org.webrtc.ScreenCapturerAndroid r7 = r7.Y
            android.media.projection.MediaProjection r7 = r7.getMediaProjection()
            goto L3a
        L39:
            r7 = r0
        L3a:
            w51 r1 = defpackage.w51.X
            if (r7 == 0) goto L63
            qld r2 = r6.k1
            d r3 = r6.l1
            r2.getClass()
            ewc r4 = new ewc
            r5 = 2
            r4.<init>(r2, r3, r7, r5)
            java.util.concurrent.ExecutorService r7 = r2.a
            r7.execute(r4)
            ji9 r7 = r6.y1
            boolean r2 = r7.b
            if (r2 == 0) goto L88
            r2 = 1
            r7.d = r2
            r7.a()
            r6.x()
            r6.k(r1, r0)
            goto L88
        L63:
            qld r7 = r6.k1
            d r2 = r6.l1
            r7.getClass()
            flc r3 = new flc
            r4 = 16
            r3.<init>(r7, r4, r2)
            java.util.concurrent.ExecutorService r7 = r7.a
            r7.execute(r3)
            ji9 r7 = r6.y1
            boolean r2 = r7.b
            if (r2 == 0) goto L88
            r2 = 0
            r7.d = r2
            r7.a()
            r6.x()
            r6.k(r1, r0)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.py0.D(boolean):void");
    }

    public final void E(boolean z) {
        if (i()) {
            if (!z) {
                if (!this.n1.c && this.n1.a() && this.n1.c) {
                    qld qldVar = this.k1;
                    qldVar.getClass();
                    qldVar.a.execute(new pld(qldVar, 0));
                } else if (nsa.A().g) {
                    qld qldVar2 = this.k1;
                    qldVar2.getClass();
                    qldVar2.a.execute(new pld(qldVar2, 0));
                }
            }
            kd1 kd1Var = this.L1;
            if (z) {
                kd1Var.getClass();
            } else {
                if (!kd1Var.f.c) {
                    return;
                }
                if (!kd1.d(new sq1(0, 1, hi9.class, kd1Var.i, "audioState", "getAudioState()Lru/ok/android/webrtc/media_options/MediaOptionState;"))) {
                    return;
                }
            }
            qld qldVar3 = this.k1;
            qldVar3.getClass();
            qldVar3.a.execute(new old(qldVar3, z, 0));
            ji9 ji9Var = this.y1;
            boolean z2 = !z;
            if (ji9Var.e != z2) {
                ji9Var.e = z2;
                ji9Var.a();
            }
            x();
        }
    }

    public final void F(final wq9 wq9Var) {
        final qld qldVar = this.k1;
        if (qldVar == null) {
            return;
        }
        boolean z = wq9Var.c;
        boolean z2 = this.a1;
        boolean z3 = wq9Var.d;
        boolean z4 = wq9Var.b;
        if (z2) {
            z |= z3;
            z4 |= z3;
            z3 = false;
        }
        boolean z5 = z4;
        final boolean z6 = z;
        this.b = wq9Var;
        this.V0.log("OKRTCCall", "new debug params " + wq9Var);
        boolean z7 = this.a1;
        final String str = wq9Var.f;
        final boolean z8 = (z7 || !z3 || str == null) ? false : true;
        o2.execute(new Runnable() { // from class: fy0
            @Override // java.lang.Runnable
            public final void run() {
                py0 py0Var = this.a;
                wq9 wq9Var2 = wq9Var;
                qld qldVar2 = qldVar;
                boolean z9 = z6;
                boolean z10 = z8;
                String str2 = str;
                py0Var.getClass();
                Runnable runnable = wq9Var2.m;
                qldVar2.getClass();
                qldVar2.a.execute(new old(qldVar2, z9, 2));
                qldVar2.d.setPreprocessorParams(z10, wq9Var2.e, str2, wq9Var2.g, wq9Var2.h, wq9Var2.i, wq9Var2.j, wq9Var2.k, wq9Var2.l, z10 ? new iy0(py0Var, runnable, 0) : new kc(4));
            }
        });
        oq0 oq0Var = this.z1;
        oq0Var.a = wq9Var.a;
        oq0Var.b = z5;
        this.Z.i(new vod(oq0Var));
    }

    public final void G(boolean z) {
        if (i()) {
            v("rtc.video.switch");
            m(z);
            x();
        }
    }

    public final void H(bg1 bg1Var) {
        this.p1.f(new dqa(bg1Var, new pq9(), new pq9(), new pq9(), new pq9(), new pq9(), new pq9()), xad.a);
    }

    public final void a(oy0 oy0Var) {
        int i = obg.a[oy0Var.ordinal()];
        k(i != 1 ? i != 2 ? i != 3 ? i != 4 ? w51.P0 : w51.O0 : w51.N0 : w51.M0 : w51.L0, null);
    }

    @Override // defpackage.mq7
    public final void b(kq7 kq7Var) {
        this.V0.log("OKRTCCall", "onLocalMediaStreamChanged, " + jb9.c(kq7Var));
        this.s0.post(new ux0(this, 2));
    }

    public final void c(yn1 yn1Var) {
        String str = "maybeSetTopologyState, " + yn1Var + ", state=" + yn1.B(1);
        a4c a4cVar = this.V0;
        a4cVar.log("OKRTCCall", str);
        if (!this.c1) {
            a4cVar.log("OKRTCCall", "cant set " + yn1Var + " to active state, conversation is not ready yet");
            return;
        }
        if (!this.B0) {
            if (!this.s1) {
                a4cVar.log("OKRTCCall", "cant set " + yn1Var + " to active state, conversation is not started yet");
                return;
            }
            if (!this.A1) {
                a4cVar.log("OKRTCCall", "cant set " + yn1Var + " to active state, user is not accepted call yet");
                return;
            }
        }
        yn1Var.Q(this.L0);
        jb9.e();
        if (true != yn1Var.A0) {
            yn1Var.A0 = true;
            yn1Var.F();
        }
        jb9.e();
        if (1 != yn1Var.z0) {
            yn1Var.z0 = 1;
            yn1Var.G();
        }
        this.y1.a();
    }

    public final void d(ji6 ji6Var) {
        this.V0.log("OKRTCCall", "hangup, " + jb9.c(ji6Var) + ", unknown");
        jb9.e();
        u(e0e.callHangup, ji6Var.toString());
        if (this.Z == null) {
            p(ji6Var, "hangup." + ji6Var + ".unknown");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reason", ji6Var.toString());
            rod rodVar = this.Z;
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("command", "hangup");
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                }
                rodVar.p = false;
                jb9.e();
                u3c u3cVar = new u3c(16, rodVar);
                rodVar.c.postDelayed(u3cVar, 8000L);
                rodVar.d(new ka6(jSONObject2), true, new cw0(rodVar, u3cVar), null);
                this.Z0 = false;
                p(ji6Var, "hangup." + ji6Var + ".unknown");
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final void e(xxe xxeVar, boolean z) {
        u38 u38Var;
        yn1 h7dVar;
        ar0 ar0Var;
        u38 u38Var2;
        ar0 ar0Var2;
        xxe xxeVarY = this.t1.y();
        this.e2.a(this.t1);
        yn1 yn1Var = this.u1;
        if (yn1Var != null) {
            yn1Var.L();
            this.u1 = null;
        }
        if (this.t1.H(xxeVar)) {
            this.t1.L();
        } else {
            this.u1 = this.t1;
        }
        xxe xxeVar2 = xxe.b;
        xxe xxeVar3 = xxe.c;
        if (xxeVar == xxeVar2) {
            jk4 jk4Var = new jk4();
            jk4Var.e = this.t0;
            jk4Var.h = this.p1;
            jk4Var.g = this.y1;
            jk4Var.i = this.Z;
            jk4Var.s = this.X;
            jk4Var.l = this.U0;
            a4c a4cVar = this.V0;
            jk4Var.k = a4cVar;
            jk4Var.m = this.c2;
            ag1 ag1Var = this.u0;
            jk4Var.j = ag1Var;
            jk4Var.a = this.k1;
            jk4Var.d = o2;
            jk4Var.f = this.x0;
            jk4Var.c = this.i1;
            jk4Var.b = this.l1;
            jk4Var.n = this.B1;
            jk4Var.o = this.D1;
            jk4Var.p = this.E1;
            jk4Var.q = this.W1;
            jk4Var.t = this.F1;
            imc imcVar = ag1Var.w;
            if (imcVar == null || (ar0Var2 = (ar0) imcVar.b) == null || !ar0Var2.a) {
                u38Var2 = null;
            } else {
                if (this.f2 == null) {
                    this.f2 = new b0e(this.R1, a4cVar, ag1Var.A.a != null);
                }
                u38Var2 = new u38(this.f2, (r38) ((ar0) this.u0.w.b).b, this.U0, this.F1, this.V0, this.D0);
            }
            jk4Var.r = u38Var2;
            if (jk4Var.a == null || jk4Var.e == null || jk4Var.h == null || jk4Var.g == null || jk4Var.i == null || jk4Var.j == null || jk4Var.k == null || jk4Var.l == null || jk4Var.f == null || jk4Var.c == null || jk4Var.b == null || jk4Var.o == null || jk4Var.q == null || jk4Var.t == null) {
                throw new IllegalStateException();
            }
            h7dVar = new kk4(jk4Var);
        } else {
            if (xxeVar != xxeVar3) {
                throw new IllegalArgumentException("Unsupported topology: " + xxeVar);
            }
            g7d g7dVar = new g7d();
            g7dVar.e = this.t0;
            g7dVar.h = this.p1;
            g7dVar.g = this.y1;
            g7dVar.i = this.Z;
            g7dVar.j.add(new loc(this.V0));
            g7dVar.k.add(this.X);
            g7dVar.k.add(new qoc(this.V0));
            g7dVar.p = this.U0;
            g7dVar.q = this.c2;
            g7dVar.o = this.V0;
            g7dVar.m = this.u0;
            g7dVar.n = this.e1;
            g7dVar.a = this.k1;
            g7dVar.d = o2;
            g7dVar.f = this.x0;
            g7dVar.c = this.i1;
            g7dVar.b = this.l1;
            g7dVar.r = this.o1;
            g7dVar.s = z;
            g7dVar.t = this.D1;
            g7dVar.u = this.E1;
            g7dVar.v = this.W1;
            g7dVar.x = this.b2;
            g7dVar.l.add(this.Y);
            ag1 ag1Var2 = this.u0;
            imc imcVar2 = ag1Var2.w;
            if (imcVar2 == null || (ar0Var = (ar0) imcVar2.c) == null || !ar0Var.a) {
                u38Var = null;
            } else {
                if (this.f2 == null) {
                    this.f2 = new b0e(this.R1, this.V0, ag1Var2.A.a != null);
                }
                u38Var = new u38(this.f2, (r38) ((ar0) this.u0.w.c).b, this.U0, this.F1, this.V0, this.D0);
            }
            g7dVar.w = u38Var;
            g7dVar.y = this.u0.z;
            vte vteVar = this.F1;
            g7dVar.z = vteVar;
            g7dVar.A = this.G1;
            if (g7dVar.e == null || g7dVar.h == null || g7dVar.g == null || g7dVar.i == null || g7dVar.m == null || g7dVar.o == null || g7dVar.p == null || g7dVar.f == null || g7dVar.c == null || g7dVar.b == null || g7dVar.t == null || g7dVar.v == null || vteVar == null) {
                throw new IllegalStateException();
            }
            h7dVar = new h7d(g7dVar);
        }
        h7dVar.Q(this.L0);
        jb9.e();
        h7dVar.y0 = this;
        this.t1 = h7dVar;
        tg4 tg4Var = this.e2;
        u38 u38Var3 = h7dVar.x0;
        tg4Var.a.log("MediaAdaptation", "Set new condition provider source. Is null = " + (u38Var3 == null));
        pn9 pn9Var = tg4Var.b;
        if (pn9Var != null) {
            pn9Var.a(tg4Var.e);
        }
        tg4Var.b = u38Var3;
        if (u38Var3 == null) {
            o38 o38Var = new o38(1, null, true);
            tg4Var.a.log("MediaAdaptation", "Since there are no new provider, trigger state change to " + o38Var);
            tg4Var.e.p(o38Var);
        } else {
            u38Var3.d(tg4Var.e);
        }
        this.e2.b(this.t1);
        boolean z2 = xxeVarY == xxeVar2;
        boolean z3 = xxeVar == xxeVar3;
        if (z2 && z3) {
            k(w51.R0, null);
        }
        xxe xxeVarY2 = this.t1.y();
        Iterator it = this.r1.iterator();
        while (it.hasNext()) {
            ((yxe) it.next()).onTopologyUpdated(xxeVarY, xxeVarY2);
        }
    }

    public final void f(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                arrayList.add(oy0.valueOf(string));
            } catch (IllegalArgumentException unused) {
                this.V0.log("OKRTCCall", zr6.i("got unknown conversation option '", string, "'"));
            }
        }
        EnumSet enumSet = this.z0;
        ArrayList arrayList2 = new ArrayList(enumSet);
        arrayList2.removeAll(arrayList);
        ArrayList arrayList3 = new ArrayList(arrayList);
        arrayList3.removeAll(enumSet);
        enumSet.clear();
        enumSet.addAll(arrayList);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            a((oy0) it.next());
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            a((oy0) it2.next());
        }
    }

    public final void g(JSONObject jSONObject) {
        boolean z = true;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("features");
        qp4 qp4Var = this.U1;
        ((c8d) qp4Var.c).w(jSONObject);
        ((c8d) qp4Var.c).x(jSONObject);
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                if ("ADD_PARTICIPANT".equalsIgnoreCase(jSONArrayOptJSONArray.optString(i))) {
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        StringBuilder sb = new StringBuilder("setFeatureAddParticipantEnabled, ");
        boolean z2 = jb9.a;
        sb.append(z ? "yes" : "no");
        this.V0.log("OKRTCCall", sb.toString());
        if (this.x1 != z) {
            this.x1 = z;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(37:140|(3:142|(1:144)(1:145)|146)(1:147)|148|(3:150|(1:152)(1:153)|154)(1:155)|156|(1:159)|160|(3:164|(6:167|268|168|(3:300|172|303)(1:302)|301|165)|299)|173|(1:175)|176|(2:182|(1:184)(2:185|(1:187)))(1:181)|188|(2:192|(1:194))|195|(1:197)(1:198)|199|(1:201)|202|(1:204)|205|(1:207)|208|(3:274|209|(4:211|270|212|220)(2:225|220))|(1:229)|230|(1:234)(1:233)|235|266|236|(1:238)(1:242)|(1:246)|247|264|248|(1:250)(1:254)|(1:313)(4:258|(1:260)(1:261)|262|263)) */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x06ba, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x06be, code lost:
    
        ((defpackage.a4c) r4.a).logException("AsrParser", r5, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0713, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0717, code lost:
    
        ((defpackage.a4c) r3.b).logException("UrlSharingParser", "Can't parse url sharing", r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x068e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x06b1 A[Catch: JSONException -> 0x06ba, TRY_LEAVE, TryCatch #1 {JSONException -> 0x06ba, blocks: (B:236:0x06ab, B:238:0x06b1), top: B:266:0x06ab }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x06ee A[Catch: JSONException -> 0x0713, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0713, blocks: (B:248:0x06e8, B:250:0x06ee), top: B:264:0x06e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:313:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02b3  */
    /* JADX WARN: Type inference failed for: r0v27, types: [mrf] */
    /* JADX WARN: Type inference failed for: r38v0, types: [py0] */
    /* JADX WARN: Type inference failed for: r39v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v69 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [bg1, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(org.json.JSONObject r39, boolean r40, boolean r41) throws org.json.JSONException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.py0.h(org.json.JSONObject, boolean, boolean):void");
    }

    public final boolean i() {
        if (!this.A0) {
            return true;
        }
        this.V0.log("OKRTCCall", "Call is already destroyed, reason=" + this.v0);
        return false;
    }

    public final void j(bg1 bg1Var, Boolean bool, Boolean bool2, qod qodVar) {
        a4c a4cVar = this.V0;
        a4cVar.log("OKRTCCall", "addParticipant, participant=" + bg1Var);
        if (i()) {
            fg1 fg1VarJ = this.p1.j(bg1Var);
            die dieVar = this.S1.g;
            Long lG = ((ece) dieVar.o).g();
            if (lG != null) {
                long jLongValue = lG.longValue();
                HashMap map = new HashMap();
                qz7 qz7Var = (qz7) dieVar.a;
                map.put("vcid", ((d4c) qz7Var.b).conversationId);
                map.put("stat_time_delta", String.valueOf(jLongValue));
                map.put("network_type", jb9.b((ConnectivityManager) dieVar.b, (TelephonyManager) dieVar.c));
                die.k(bg1Var, fg1VarJ, map);
                ((d4c) qz7Var.b).log(d4c.COLLECTOR_WEBRTC, "callAddParticipant", map);
            }
            try {
                this.Z.d(f46.s(bg1Var, bool, bool2.booleanValue()), false, new dy0(this, bg1Var, qodVar), qodVar);
            } catch (JSONException e) {
                a4cVar.reportException("OKRTCCall", "add.participant", e);
            }
        }
    }

    public final void k(w51 w51Var, Object obj) {
        a4c a4cVar = this.V0;
        a4cVar.log("OKRTCCall", "dispatch [ " + w51Var + " ]");
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.s0.post(new f5(this, w51Var, obj, 7));
            return;
        }
        Iterator it = this.M0.iterator();
        while (it.hasNext()) {
            try {
                ((my0) it.next()).onEvent(this, w51Var, obj);
            } catch (Throwable th) {
                a4cVar.logException("OKRTCCall", "Error on dispatch event " + w51Var, th);
            }
        }
    }

    public final void l(JSONObject jSONObject) {
        ipd ipdVarE;
        try {
            if (jSONObject.has("rooms")) {
                kxf kxfVar = (kxf) this.U1.a;
                JSONObject jSONObject2 = jSONObject.getJSONObject("rooms");
                if (kxfVar.b && (ipdVarE = ((pl8) kxfVar.o).E(jSONObject2)) != null) {
                    ((sl1) kxfVar.X).e(ipdVarE);
                }
            }
        } catch (JSONException e) {
            this.V0.logException("OKRTCCall", "Can't parse rooms from connection", e);
        }
    }

    public final void m(boolean z) {
        if (i()) {
            if (z) {
                this.n1.a();
            }
            kd1 kd1Var = this.L1;
            if (!z) {
                kd1Var.getClass();
            } else {
                if (!kd1Var.f.d) {
                    return;
                }
                if (!kd1.d(new sq1(0, 3, hi9.class, kd1Var.i, "videoState", "getVideoState()Lru/ok/android/webrtc/media_options/MediaOptionState;"))) {
                    return;
                }
            }
            if (z && this.y1.g) {
                this.E1.getClass();
            }
            this.V0.log("OKRTCCall", "Update my settings with video enabled=" + z);
            ji9 ji9Var = this.y1;
            if (ji9Var.f != z) {
                ji9Var.f = z;
                ji9Var.a();
            }
            k(w51.X, null);
        }
    }

    public final void n(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
        if (jSONObjectOptJSONObject != null) {
            if (jSONObjectOptJSONObject.opt("sdk") == null) {
                this.s0.post(new f5(this, f46.E(jSONObject), jSONObjectOptJSONObject, 8));
                return;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("sdk");
            if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.optString("type").equals("bad-net") && this.X0) {
                rf0 rf0Var = this.W0;
                rf0Var.getClass();
                if ("bad-net".equals(jSONObjectOptJSONObject2.optString("type"))) {
                    rf0Var.m = jSONObjectOptJSONObject2.optBoolean("value");
                    rf0Var.n = jSONObjectOptJSONObject2.has("value");
                    rf0Var.o = jSONObjectOptJSONObject2.optDouble("rtt");
                    rf0Var.p = jSONObjectOptJSONObject2.optDouble("loss");
                    rf0Var.a();
                }
            }
        }
    }

    public final void o(String str) {
        k(w51.c, null);
        rod rodVar = this.Z;
        if (rodVar != null) {
            rodVar.g();
        }
        p(null, "conversation_ended." + str);
    }

    @Override // org.webrtc.NetworkMonitor.NetworkObserver
    public final void onConnectionTypeChanged(NetworkChangeDetector.ConnectionType connectionType) {
        this.s0.post(new ux0(this, connectionType != NetworkChangeDetector.ConnectionType.CONNECTION_NONE));
    }

    public final void p(ji6 ji6Var, String str) {
        ConversationEndReason error;
        long jElapsedRealtime;
        int i;
        this.V0.log("OKRTCCall", wg0.i("destroy.reason=", str));
        jb9.e();
        if (this.A0) {
            this.V0.log("OKRTCCall", "   already destroyed, reason=" + this.v0);
            return;
        }
        this.A0 = true;
        va8 va8Var = this.k2;
        switch (ji6Var == null ? -1 : ki6.$EnumSwitchMapping$0[ji6Var.ordinal()]) {
            case -1:
                error = null;
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                error = ConversationEndReason.SignalingTimeout.INSTANCE;
                break;
            case 2:
                error = ConversationEndReason.Busy.INSTANCE;
                break;
            case 3:
                error = ConversationEndReason.Missed.INSTANCE;
                break;
            case 4:
                error = ConversationEndReason.Rejected.INSTANCE;
                break;
            case 5:
                error = new ConversationEndReason.Error(new RuntimeException("Call error"));
                break;
            case 6:
                error = ConversationEndReason.Hangup.INSTANCE;
                break;
            case 7:
                error = ConversationEndReason.Canceled.INSTANCE;
                break;
            case 8:
                error = ConversationEndReason.CallTimeout.INSTANCE;
                break;
            case 9:
                error = ConversationEndReason.RemovedFromCall.INSTANCE;
                break;
            case 10:
                error = new ConversationEndReason.ObsoleteClient(null);
                break;
        }
        va8Var.E(error);
        c11 c11Var = this.S1.l;
        o23 o23Var = (o23) c11Var.c;
        o23Var.o = null;
        try {
            ((Context) o23Var.a).unregisterReceiver((an) o23Var.X);
        } catch (Exception e) {
            ((a4c) o23Var.b).log("CallBatteryRetriever", wg0.i("Can't unregister BroadcastReceiver: ", e.getMessage()));
        }
        b11 b11Var = (b11) c11Var.e;
        if (b11Var != null && c11Var.a) {
            b11 b11Var2 = (b11) c11Var.f;
            b11 b11Var3 = (b11) c11Var.g;
            vte vteVar = (vte) c11Var.d;
            if (b11Var2 == null || b11Var3 == null) {
                ((wte) vteVar).getClass();
                jElapsedRealtime = SystemClock.elapsedRealtime() - b11Var.c;
                i = 0;
            } else {
                i = b11Var3.b - b11Var2.b;
                jElapsedRealtime = b11Var3.c - b11Var2.c;
            }
            Long lA = ((wte) vteVar).a();
            if (lA != null) {
                Map mapA0 = mz7.a0(new kpa("battery_level_change", EventItemValueKt.toEventItemValue(Math.abs(i))), new kpa("stat_time_delta", EventItemValueKt.toEventItemValue(jElapsedRealtime)), new kpa("timestamp", EventItemValueKt.toEventItemValue(lA.longValue())));
                EventItemsMap eventItemsMap = (EventItemsMap) c11Var.i;
                if (eventItemsMap != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(eventItemsMap.getItems());
                    linkedHashMap.putAll(mapA0);
                    ((CallAnalyticsSender) c11Var.b).send(new SdkIntervalStatEvent.Builder().addAll(new EventItemsMap(linkedHashMap)).build());
                }
            }
        }
        q7 q7Var = this.S1.m;
        q7Var.b.a();
        q7Var.c.c = null;
        oe1 oe1Var = this.y0;
        if (oe1Var != null) {
            oe1Var.a();
        }
        bg4 bg4Var = this.E1;
        ((bi) ((qz7) bg4Var.X).b).getClass();
        pi piVar = (pi) bg4Var.Y;
        if (!piVar.i) {
            piVar.i = true;
            piVar.c.removeCallbacksAndMessages(null);
            piVar.c.postAtFrontOfQueue(new b(9, piVar));
            piVar.h.a();
            piVar.b.quitSafely();
            piVar.f.clear();
            piVar.d.quitSafely();
            piVar.a.getClass();
        }
        NetworkMonitor.getInstance().removeObserver(this);
        this.q1.clear();
        this.r1.clear();
        vk8 vk8Var = this.R1;
        vk8Var.g = true;
        ((Handler) vk8Var.k).removeCallbacks((i0e) vk8Var.m);
        ((LinkedHashSet) vk8Var.f).clear();
        sd7 sd7Var = (sd7) vk8Var.l;
        if (sd7Var != null) {
            dm4.a(sd7Var);
        }
        vk8Var.l = null;
        this.s0.removeCallbacks(this.J0);
        this.t1.L();
        tg4 tg4Var = this.e2;
        if (tg4Var != null) {
            tg4Var.a(this.t1);
        }
        this.t1 = new zs4(this.p1, this.u0, this.V0, this.U0, this.W1);
        yn1 yn1Var = this.u1;
        if (yn1Var != null) {
            yn1Var.L();
            this.u1 = null;
        }
        b0e b0eVar = this.f2;
        if (b0eVar != null) {
            ((HashMap) b0eVar.a.d).remove(b0eVar);
        }
        v("rtc.destroy." + str);
        this.v0 = str;
        if (this.K0) {
            this.G0 = (SystemClock.elapsedRealtime() - this.H0) + this.G0;
            this.K0 = false;
        }
        long j = this.G0;
        if (j == 0) {
            v("rtc.connected.time2.-1");
        } else {
            long j2 = j / 60000;
            this.G0 = j2;
            this.G0 = Math.min(j2, 10L);
            v("rtc.connected.time2." + this.G0);
        }
        rod rodVar = this.Z;
        if (rodVar != null && this.Z0) {
            rodVar.k.remove(this.c);
            this.Z.l.remove(this.o);
            this.Z.g();
            this.Z = null;
        }
        this.p1.h();
        kg1 kg1Var = this.p1;
        kg1Var.e.b = wz4.a;
        kg1Var.i = null;
        kg1Var.f.clear();
        kg1Var.g.clear();
        kg1Var.h.clear();
        kg1Var.c.o();
        d dVar = this.l1;
        dVar.A0 = null;
        kq7 kq7Var = dVar.z0;
        if (kq7Var != null) {
            kq7Var.k(null);
        }
        d dVar2 = this.l1;
        dVar2.v0.log("SlmsSource", "release");
        dVar2.y0.clear();
        dVar2.X.a.remove(dVar2);
        dVar2.c.a.execute(new b(0, dVar2));
        this.m1.s0 = null;
        qld qldVar = this.k1;
        qldVar.b.log("SharedPeerConnectionFac", "release");
        qldVar.a.execute(new pld(qldVar, 1));
        this.u0.getClass();
        o2.execute(new ux0(this, 1));
        k(w51.s0, null);
        this.I1 = null;
        this.L1.getClass();
        sd7 sd7Var2 = (sd7) this.P1.o;
        sd7Var2.getClass();
        dm4.a(sd7Var2);
        vm1 vm1Var = this.S1;
        ((CallAnalyticsSender) vm1Var.a.c).setIdle(true);
        sd7 sd7Var3 = (sd7) vm1Var.i.c;
        if (sd7Var3 != null) {
            dm4.a(sd7Var3);
        }
        sd7 sd7Var4 = (sd7) this.h2.X;
        sd7Var4.getClass();
        dm4.a(sd7Var4);
        AndroidVideoDecoder.errorCallback = null;
        ((hc3) this.j2.o).g();
    }

    public final bg1 q() {
        kg1 kg1Var = this.p1;
        kg1Var.getClass();
        ArrayList arrayList = new ArrayList(kg1Var.d(kg1Var.k).keySet());
        if (arrayList.size() == 1) {
            return (bg1) arrayList.get(0);
        }
        return null;
    }

    public final void r(hrf hrfVar, List list, boolean z) {
        Intent intentRegisterReceiver;
        a4c a4cVar = this.V0;
        a4cVar.log("OKRTCCall", "init");
        jb9.e();
        if (this.N0) {
            throw new IllegalStateException("Is already initialized");
        }
        boolean z2 = true;
        this.N0 = true;
        ag1 ag1Var = this.u0;
        ag1Var.b.getClass();
        yf1 yf1Var = ag1Var.B;
        rod rodVar = new rod(hrfVar, (hw3) this.D0, this.V0, this.U0, ag1Var.l, yf1Var.i);
        this.Z = rodVar;
        rodVar.k.add(this.c);
        this.Z.l.add(this.o);
        this.L0 = list;
        StringBuilder sb = new StringBuilder();
        kg1 kg1Var = this.p1;
        sb.append(kg1Var.r());
        sb.append(" participants");
        a4cVar.log("OKRTCCall", sb.toString());
        if (kg1Var.r() > 1) {
            e(xxe.c, false);
        } else if (kg1Var.r() == 1) {
            e(xxe.b, false);
            if (z) {
                yn1 yn1Var = this.t1;
                yn1Var.getClass();
                jb9.e();
                if (1 != yn1Var.z0) {
                    yn1Var.z0 = 1;
                    yn1Var.G();
                }
            }
        }
        if (this.B0 && !yf1Var.j) {
            C();
        }
        if (this.X0) {
            this.W0.k.add(new rcg(this));
        }
        c11 c11Var = this.S1.l;
        o23 o23Var = (o23) c11Var.c;
        o23Var.o = (ey1) c11Var.h;
        b11 b11Var = null;
        try {
            intentRegisterReceiver = ((Context) o23Var.a).registerReceiver((an) o23Var.X, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (Exception e) {
            ((a4c) o23Var.b).log("CallBatteryRetriever", wg0.i("Can't register BroadcastReceiver: ", e.getMessage()));
            intentRegisterReceiver = null;
        }
        if (intentRegisterReceiver != null) {
            int intExtra = intentRegisterReceiver.getIntExtra("level", 0);
            ((wte) ((vte) o23Var.c)).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            int intExtra2 = intentRegisterReceiver.getIntExtra("status", -1);
            if (intExtra2 != 2 && intExtra2 != 5) {
                z2 = false;
            }
            b11Var = new b11(intExtra, jElapsedRealtime, z2);
        }
        c11Var.e = b11Var;
    }

    public final boolean s() {
        return this.B0 ? this.T0.b : this.A1;
    }

    public final void u(e0e e0eVar, String str) {
        this.U0.log(e0eVar, str, (String) null);
    }

    public final void v(String str) {
        u(e0e.app_event, str);
    }

    public final void w() {
        this.Q1.getClass();
        dpd dpdVarH = oq9.h(this.y1);
        this.P1.e(dpdVarH);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", "accept-call");
            jSONObject.put("mediaSettings", f46.p(dpdVarH, false, false));
            this.Z.h(new ka6(jSONObject), new wx0(this, 1));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public final void x() {
        this.V0.log("OKRTCCall", "sendMediaSettingsChange");
        this.Q1.getClass();
        this.P1.c(oq9.h(this.y1));
    }

    public final int y(bg1 bg1Var, JSONObject jSONObject) {
        fg1 fg1VarF;
        xad xadVar = xad.a;
        kg1 kg1Var = this.p1;
        if (jSONObject == null) {
            fg1VarF = kg1Var.f(new dqa(bg1Var, new pq9(), new pq9(), new pq9(), new pq9(), new pq9(), new pq9()), xadVar);
        } else {
            if ("ACCEPTED".equals(jSONObject.optString("state"))) {
                return 2;
            }
            kd1 kd1Var = this.L1;
            hi9 hi9VarF = kd1Var.f(jSONObject, bg1Var, "onParticipantAddedToCall", kd1Var.h(xadVar).a(), true);
            rpa pq9Var = new pq9();
            rpa pq9Var2 = new pq9();
            wmc wmcVar = new wmc(f46.q(jSONObject), false);
            wmc wmcVar2 = new wmc(hi9VarF, false);
            ji9 ji9VarO = f46.o(jSONObject);
            if (ji9VarO != null) {
                pq9Var = new wmc(ji9VarO, false);
            }
            rpa rpaVar = pq9Var;
            wmc wmcVar3 = new wmc(f46.y(jSONObject), false);
            o61 o61VarK = f46.k(jSONObject);
            if (o61VarK != null) {
                pq9Var2 = new wmc(o61VarK, false);
            }
            fg1VarF = kg1Var.f(new dqa(bg1Var, wmcVar, wmcVar2, rpaVar, wmcVar3, pq9Var2, new wmc(this.T1.a.h(jSONObject, xadVar), false)), xadVar);
        }
        this.t1.u(fg1VarF, true);
        return 1;
    }

    public final void z(yn1 yn1Var) {
        this.V0.log("OKRTCCall", "handleTopologyCreated, " + yn1Var);
        kxf kxfVar = this.S0;
        if (kxfVar.b) {
            return;
        }
        kxfVar.c();
    }
}
