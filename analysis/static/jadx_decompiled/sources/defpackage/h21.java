package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;

/* loaded from: classes.dex */
public final class h21 extends pnf {
    public final je7 X;
    public final je7 Y;
    public final ac Z;
    public final l5g b;
    public final el1 c;
    public final je7 o;
    public final ac s0;
    public final q0e t0;
    public final w7c u0;
    public final w7c v0;
    public final qw w0;
    public final e21 x0;

    public h21(l5g l5gVar, el1 el1Var) {
        khe kheVarD = n31.a.getAccessor().d(eua.class);
        je7 je7Var = yi1.a;
        khe kheVarD2 = zi1.a.getAccessor().d(ir1.class);
        je7 je7VarC = yi1.c();
        je7 je7VarD = yi1.d();
        je7 je7Var2 = yi1.a;
        this.b = l5gVar;
        this.c = el1Var;
        this.o = kheVarD2;
        this.X = kheVarD;
        this.Y = je7VarC;
        mn5 mn5VarX = od2.x(new j31(el1Var.H0, el1Var.I0, new t11(3, null, 0), 4));
        this.Z = od2.t((gld) ((ir1) kheVarD2.getValue()).t.getValue(), mn5VarX, ((yz0) ((ir1) kheVarD2.getValue()).l).F0, new v11(4, null));
        this.s0 = od2.s(new qw(((ir1) kheVarD2.getValue()).e(), 9), mn5VarX, new qw(((ir1) kheVarD2.getValue()).o, 10), new qw(((ir1) kheVarD2.getValue()).b(), 11), new w11(je7VarD, null));
        m38 m38Var = m38.X;
        q0e q0eVarA = r0e.a(new zq0(m38Var, m38Var, m38Var, m38Var, new y41(CallsAudioDeviceInfo.INSTANCE.getNONE())));
        this.t0 = q0eVarA;
        this.u0 = new w7c(q0eVarA);
        t03 t03VarD = od2.D(new qw(((l31) ((ir1) kheVarD2.getValue()).f).k, 15), new u11(je7Var2, null));
        int i = ft4.o;
        this.v0 = od2.X(od2.x(new qw(nu0.Q(t03VarD, z7.R(1, kt4.SECONDS)), 12)), this.a, wld.a, 0);
        w7c w7cVar = el1Var.C0;
        this.w0 = new qw(w7cVar, 13);
        this.x0 = new e21(new mqc(new ho5(TimeUnit.MILLISECONDS, null)), kheVarD2, 0);
        od2.L(od2.t((j0e) ((ir1) kheVarD2.getValue()).q.getValue(), w7cVar, new qw(((ir1) kheVarD2.getValue()).e(), 14), new s11(this, je7VarD, null)), this.a);
    }

    public final ArrayList q() {
        List<CallsAudioDeviceInfo> availableAudioDevices;
        CallsAudioManager callsAudioManager = (CallsAudioManager) ((a11) r().b).c.get();
        Iterable iterableH0 = (callsAudioManager == null || (availableAudioDevices = callsAudioManager.getAvailableAudioDevices()) == null) ? wz4.a : x53.H0(availableAudioDevices);
        ArrayList arrayList = new ArrayList(z53.S(iterableH0, 10));
        Iterator it = iterableH0.iterator();
        while (it.hasNext()) {
            arrayList.add(dz7.b((CallsAudioDeviceInfo) it.next(), this.c.u()));
        }
        return arrayList;
    }

    public final ir1 r() {
        return (ir1) this.o.getValue();
    }

    public final void s(m38 m38Var) {
        if (m38Var == m38.c) {
            if (((aa) ((yz0) r().l).F0.getValue()).c) {
                return;
            }
            pnf.o(this.c.M0, wj1.b);
            return;
        }
        je7 je7Var = this.X;
        eua euaVar = (eua) je7Var.getValue();
        String[] strArr = eua.h;
        if (!euaVar.b(strArr)) {
            eua euaVar2 = (eua) je7Var.getValue();
            int i = b8a.E;
            euaVar2.getClass();
            int i2 = j1c.permissions_audio_title;
            int i3 = oga.g;
            l5g l5gVar = this.b;
            if (eua.i(l5gVar, strArr)) {
                l5gVar.c(strArr, 160, i2, i, i3);
                return;
            } else {
                euaVar2.f(l5gVar, strArr, 160);
                return;
            }
        }
        bt1 bt1Var = (bt1) this.Y.getValue();
        String str = r().c().c;
        m38 m38Var2 = m38.b;
        long j = m38Var == m38Var2 ? 1L : 0L;
        boolean z = r().c().h;
        bt1Var.getClass();
        bt1.c(bt1Var, "AUDIO_ENABLED", str, null, Long.valueOf(j), null, null, z, 52);
        ir1 ir1VarR = r();
        boolean z2 = m38Var == m38Var2;
        MicrophoneManager microphoneManagerC = ((a11) ir1VarR.b).c();
        if (microphoneManagerC != null) {
            microphoneManagerC.setMicEnabled(z2);
        }
        if (z2) {
            ((si9) ir1VarR.r.getValue()).g(Boolean.FALSE);
        }
    }

    public final boolean t() {
        Object next;
        List<CallsAudioDeviceInfo> availableAudioDevices;
        ir1 ir1VarR = r();
        a11 a11Var = (a11) ir1VarR.b;
        CallsAudioManager callsAudioManager = (CallsAudioManager) a11Var.c.get();
        Set setH0 = (callsAudioManager == null || (availableAudioDevices = callsAudioManager.getAvailableAudioDevices()) == null) ? wz4.a : x53.H0(availableAudioDevices);
        if (setH0.isEmpty()) {
            return false;
        }
        if (setH0.size() >= 3) {
            return true;
        }
        CallsAudioDeviceInfo callsAudioDeviceInfoB = a11Var.b();
        Iterator it = setH0.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((CallsAudioDeviceInfo) next).getDeviceType() != callsAudioDeviceInfoB.getDeviceType()) {
                break;
            }
        }
        CallsAudioDeviceInfo callsAudioDeviceInfo = (CallsAudioDeviceInfo) next;
        if (callsAudioDeviceInfo != null) {
            callsAudioDeviceInfoB = callsAudioDeviceInfo;
        }
        ir1VarR.l(callsAudioDeviceInfoB);
        return false;
    }

    public final void u(m38 m38Var) {
        if (m38Var == m38.c) {
            if (((aa) ((yz0) r().l).F0.getValue()).b) {
                return;
            }
            pnf.o(this.c.M0, wj1.c);
            return;
        }
        je7 je7Var = this.X;
        boolean zB = ((eua) je7Var.getValue()).b(eua.l);
        je7 je7Var2 = this.Y;
        if (!zB) {
            bt1 bt1Var = (bt1) je7Var2.getValue();
            String str = r().c().c;
            boolean z = r().c().h;
            bt1Var.getClass();
            bt1.c(bt1Var, "REQUEST_PERMISSION_CAM", str, "DURING_CALL", null, null, null, z, 56);
            ((eua) je7Var.getValue()).h(this.b);
            return;
        }
        if (r().h.c()) {
            return;
        }
        bt1 bt1Var2 = (bt1) je7Var2.getValue();
        String str2 = r().c().c;
        m38 m38Var2 = m38.b;
        long j = m38Var == m38Var2 ? 1L : 0L;
        boolean z2 = r().c().h;
        bt1Var2.getClass();
        bt1.c(bt1Var2, "VIDEO_ENABLED", str2, null, Long.valueOf(j), null, null, z2, 52);
        r().g(m38Var == m38Var2);
    }
}
