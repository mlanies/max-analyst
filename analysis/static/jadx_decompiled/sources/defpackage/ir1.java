package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.locks.ReentrantLock;
import ru.ok.android.externcalls.sdk.AudioLevelListener;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;
import ru.ok.android.externcalls.sdk.record.RecordManager;
import ru.ok.android.externcalls.sdk.video.CameraManager;

/* loaded from: classes.dex */
public final class ir1 {
    public static final /* synthetic */ bc7[] y;
    public final kr1 a;
    public final z01 b;
    public final jt4 c;
    public final oqa d;
    public final r21 e;
    public final b31 f;
    public final xs1 g;
    public final xuc h;
    public final lvc i;
    public final jpb j;
    public final jr1 k;
    public final ez0 l;
    public final je7 m;
    public final q0e n;
    public final w7c o;
    public final khe p;
    public final khe q;
    public final khe r;
    public final r44 s;
    public final khe t;
    public final khe u;
    public final w4d v;
    public final zn5 w;
    public final khe x;

    static {
        oi9 oi9Var = new oi9(ir1.class, "vpnStatusJob", "getVpnStatusJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        y = new bc7[]{oi9Var};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ir1(kr1 kr1Var, z01 z01Var, jt4 jt4Var, oqa oqaVar, r21 r21Var, b31 b31Var, xs1 xs1Var, xuc xucVar, lvc lvcVar, jpb jpbVar, jr1 jr1Var, ez0 ez0Var, je7 je7Var, gh3 gh3Var) {
        final int i = 2;
        final int i2 = 5;
        this.a = kr1Var;
        this.b = z01Var;
        this.c = jt4Var;
        this.d = oqaVar;
        this.e = r21Var;
        this.f = b31Var;
        this.g = xs1Var;
        this.h = xucVar;
        this.i = lvcVar;
        this.j = jpbVar;
        this.k = jr1Var;
        this.l = ez0Var;
        this.m = je7Var;
        q0e q0eVarA = r0e.a(new to1(false, null, 255));
        this.n = q0eVarA;
        this.o = new w7c(q0eVarA);
        final Object[] objArr = 0 == true ? 1 : 0;
        this.p = new khe(new k56(this) { // from class: zq1
            public final /* synthetic */ ir1 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (objArr) {
                    case 0:
                        return r0e.a(((a11) this.b.b).b());
                    case 1:
                        return (ti9) this.b.p.getValue();
                    case 2:
                        ((si9) this.b.r.getValue()).g(Boolean.TRUE);
                        return e5f.a;
                    case 3:
                        return (si9) this.b.r.getValue();
                    case 4:
                        return new AudioLevelListener((short) 500, new Handler(Looper.getMainLooper()), new b(26, this.b));
                    default:
                        return new dr1(this.b);
                }
            }
        });
        final int i3 = 1;
        this.q = new khe(new k56(this) { // from class: zq1
            public final /* synthetic */ ir1 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return r0e.a(((a11) this.b.b).b());
                    case 1:
                        return (ti9) this.b.p.getValue();
                    case 2:
                        ((si9) this.b.r.getValue()).g(Boolean.TRUE);
                        return e5f.a;
                    case 3:
                        return (si9) this.b.r.getValue();
                    case 4:
                        return new AudioLevelListener((short) 500, new Handler(Looper.getMainLooper()), new b(26, this.b));
                    default:
                        return new dr1(this.b);
                }
            }
        });
        this.r = new khe(new dk1(18));
        int i4 = r44.g;
        int i5 = ft4.o;
        this.s = new r44(new q44(z7.R(10, kt4.SECONDS)), new yh0(i, new k56(this) { // from class: zq1
            public final /* synthetic */ ir1 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return r0e.a(((a11) this.b.b).b());
                    case 1:
                        return (ti9) this.b.p.getValue();
                    case 2:
                        ((si9) this.b.r.getValue()).g(Boolean.TRUE);
                        return e5f.a;
                    case 3:
                        return (si9) this.b.r.getValue();
                    case 4:
                        return new AudioLevelListener((short) 500, new Handler(Looper.getMainLooper()), new b(26, this.b));
                    default:
                        return new dr1(this.b);
                }
            }
        }), null);
        final int i6 = 3;
        this.t = new khe(new k56(this) { // from class: zq1
            public final /* synthetic */ ir1 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return r0e.a(((a11) this.b.b).b());
                    case 1:
                        return (ti9) this.b.p.getValue();
                    case 2:
                        ((si9) this.b.r.getValue()).g(Boolean.TRUE);
                        return e5f.a;
                    case 3:
                        return (si9) this.b.r.getValue();
                    case 4:
                        return new AudioLevelListener((short) 500, new Handler(Looper.getMainLooper()), new b(26, this.b));
                    default:
                        return new dr1(this.b);
                }
            }
        });
        final int i7 = 4;
        this.u = new khe(new k56(this) { // from class: zq1
            public final /* synthetic */ ir1 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return r0e.a(((a11) this.b.b).b());
                    case 1:
                        return (ti9) this.b.p.getValue();
                    case 2:
                        ((si9) this.b.r.getValue()).g(Boolean.TRUE);
                        return e5f.a;
                    case 3:
                        return (si9) this.b.r.getValue();
                    case 4:
                        return new AudioLevelListener((short) 500, new Handler(Looper.getMainLooper()), new b(26, this.b));
                    default:
                        return new dr1(this.b);
                }
            }
        });
        this.v = mqd.D();
        this.w = new zn5(od2.x(od2.g(new gr1(gh3Var, null))), new hr1(this, null), i2);
        this.x = new khe(new k56(this) { // from class: zq1
            public final /* synthetic */ ir1 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return r0e.a(((a11) this.b.b).b());
                    case 1:
                        return (ti9) this.b.p.getValue();
                    case 2:
                        ((si9) this.b.r.getValue()).g(Boolean.TRUE);
                        return e5f.a;
                    case 3:
                        return (si9) this.b.r.getValue();
                    case 4:
                        return new AudioLevelListener((short) 500, new Handler(Looper.getMainLooper()), new b(26, this.b));
                    default:
                        return new dr1(this.b);
                }
            }
        });
        ((wr1) kr1Var).d(new ar1(this));
        od2.L(new zn5(new t03(od2.x(new xk1(e(), 7)), 11), new br1(this, null), i2), jr1Var);
    }

    public final void a(nnf nnfVar) {
        q0e q0eVar;
        Object value;
        do {
            q0eVar = this.n;
            value = q0eVar.getValue();
        } while (!q0eVar.c(value, to1.a((to1) value, null, null, null, nnfVar, false, null, 0L, 239)));
    }

    public final q0e b() {
        return ((wr1) this.a).I;
    }

    public final d04 c() {
        return (d04) ((wr1) this.a).I.getValue();
    }

    public final fqa d() {
        return ((cra) this.d).c();
    }

    public final j0e e() {
        return ((cra) this.d).w0;
    }

    public final q0e f() {
        return ((vvc) this.i).t0;
    }

    public final void g(boolean z) {
        if (this.h.c()) {
            return;
        }
        CameraManager cameraManagerA = this.e.a();
        if (cameraManagerA != null) {
            cameraManagerA.setCameraEnabled(z);
        }
        CallsAudioManager callsAudioManager = (CallsAudioManager) ((a11) this.b).c.get();
        if (callsAudioManager != null) {
            CallsAudioManager.setSpeakerEnabledAsync$default(callsAudioManager, z, false, null, null, 12, null);
        }
    }

    public final void h(long j) {
        q0e q0eVar;
        Object value;
        do {
            q0eVar = this.n;
            value = q0eVar.getValue();
        } while (!q0eVar.c(value, to1.a((to1) value, null, null, null, null, false, null, j, 127)));
    }

    public final void i(gg1 gg1Var, boolean z) {
        q0e q0eVar;
        Object value;
        to1 to1Var;
        gg1 gg1Var2;
        do {
            q0eVar = this.n;
            value = q0eVar.getValue();
            to1Var = (to1) value;
            gg1Var2 = (!z && tpa.f(to1Var.a, gg1Var)) ? null : gg1Var;
        } while (!q0eVar.c(value, to1.a(to1Var, gg1Var2, null, null, gg1Var2 != null ? nnf.a : to1Var.e, false, null, 0L, 238)));
    }

    public final void j(gg1 gg1Var) {
        q0e q0eVar;
        Object value;
        do {
            q0eVar = this.n;
            value = q0eVar.getValue();
        } while (!q0eVar.c(value, to1.a((to1) value, null, gg1Var, null, null, false, null, 0L, 253)));
    }

    public final void k(boolean z) {
        RecordManager.StopParams stopParams = new RecordManager.StopParams(null, z, null, null, 13, null);
        vvc vvcVar = (vvc) this.i;
        vvcVar.getClass();
        hm9.h0("ScreenRecordControllerTag", "stopRecordBroadcast", new Object[0]);
        ReentrantLock reentrantLock = vvcVar.Z;
        reentrantLock.lock();
        try {
            if (((wvc) vvcVar.t0.getValue()).a != xvc.a) {
                hm9.h0("ScreenRecordControllerTag", "startRecordBroadcast already finished", new Object[0]);
                return;
            }
            bt1 bt1Var = (bt1) vvcVar.X.getValue();
            bt1Var.getClass();
            bt1.c(bt1Var, "CALL_RECORDING", null, null, 0L, null, null, true, 54);
            RecordManager recordManagerB = vvcVar.b();
            if (recordManagerB != null) {
                RecordManager.stopRecord$default(recordManagerB, stopParams, new zja(vvcVar, 16, stopParams), null, 4, null);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void l(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        bt1 bt1Var = (bt1) this.m.getValue();
        String str = c().c;
        int i = cr1.$EnumSwitchMapping$0[callsAudioDeviceInfo.getDeviceType().ordinal()];
        String str2 = i != 1 ? i != 2 ? "HEADPHONES" : "DYNAMIC" : "PHONE";
        boolean z = c().h;
        bt1Var.getClass();
        bt1.c(bt1Var, "SPEAKER_MODE_CHANGED", str, str2, null, null, null, z, 56);
        CallsAudioManager callsAudioManager = (CallsAudioManager) ((a11) this.b).c.get();
        if (callsAudioManager != null) {
            CallsAudioManager.setAudioDeviceAsync$default(callsAudioManager, callsAudioDeviceInfo, null, null, 6, null);
        }
    }

    public final void m() {
        Object value;
        a11 a11Var;
        ti9 ti9Var = (ti9) this.p.getValue();
        do {
            value = ti9Var.getValue();
            a11Var = (a11) this.b;
        } while (!ti9Var.c(value, a11Var.b()));
        ync yncVar = new ync(21, this);
        CallsAudioManager callsAudioManager = (CallsAudioManager) a11Var.c.get();
        if (callsAudioManager != null) {
            callsAudioManager.setOnAudioDeviceChangeListener(yncVar);
        }
    }

    public final void n() {
        AudioLevelListener audioLevelListener = (AudioLevelListener) this.u.getValue();
        a11 a11Var = (a11) this.b;
        a11Var.getClass();
        try {
            MicrophoneManager microphoneManagerC = a11Var.c();
            if (microphoneManagerC != null) {
                microphoneManagerC.registerAudioSampleCallback(250L, audioLevelListener);
            }
        } catch (Exception e) {
            hm9.l0("CallAudioController", "CallAudioController can't register mic audio listener due to: " + e.getMessage() + ".", e);
        }
    }

    public final void o(u9f u9fVar) {
        Object value;
        q0e q0eVar = this.n;
        if (((to1) q0eVar.getValue()).g != u9f.c || u9fVar == u9f.o) {
            do {
                value = q0eVar.getValue();
            } while (!q0eVar.c(value, to1.a((to1) value, null, null, null, null, false, u9fVar, 0L, 191)));
        }
    }
}
