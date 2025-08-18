package defpackage;

import android.app.Application;
import android.content.Intent;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.calls.impl.model.CallCreateException;
import one.me.calls.impl.service.CallServiceImpl;
import org.apache.http.HttpStatus;
import org.apache.http.util.VersionInfo;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;

/* loaded from: classes.dex */
public final class wr1 implements kr1 {
    public static final /* synthetic */ bc7[] K;
    public final je7 A;
    public final je7 B;
    public final je7 C;
    public vxd D;
    public final w4d E;
    public boolean F;
    public final LinkedHashSet G;
    public final q0e H;
    public final q0e I;
    public final or1 J;
    public final jr1 a;
    public final a41 b;
    public final ds1 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final je7 h;
    public final je7 i;
    public final je7 j;
    public final je7 k;
    public final je7 l;
    public final je7 m;
    public final je7 n;
    public final je7 o;
    public final je7 p;
    public final je7 q;
    public final je7 r;
    public final je7 s;
    public final je7 t;
    public final je7 u;
    public final je7 v;
    public final je7 w;
    public final je7 x;
    public final je7 y;
    public final je7 z;

    static {
        oi9 oi9Var = new oi9(wr1.class, "cameraTrackerJob", "getCameraTrackerJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        K = new bc7[]{oi9Var};
    }

    public wr1(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, je7 je7Var7, je7 je7Var8, je7 je7Var9, je7 je7Var10, je7 je7Var11, je7 je7Var12, je7 je7Var13, je7 je7Var14, je7 je7Var15, je7 je7Var16, je7 je7Var17, je7 je7Var18, je7 je7Var19, je7 je7Var20, je7 je7Var21, je7 je7Var22, je7 je7Var23, je7 je7Var24, je7 je7Var25, jr1 jr1Var, a41 a41Var, ds1 ds1Var, je7 je7Var26, je7 je7Var27) {
        this.a = jr1Var;
        this.b = a41Var;
        this.c = ds1Var;
        this.d = je7Var;
        this.e = je7Var3;
        this.f = je7Var4;
        this.g = je7Var5;
        this.h = je7Var6;
        this.i = je7Var8;
        this.j = je7Var10;
        this.k = je7Var12;
        this.l = je7Var7;
        this.m = je7Var9;
        this.n = je7Var11;
        this.o = je7Var15;
        this.p = je7Var13;
        this.q = je7Var16;
        this.r = je7Var17;
        this.s = je7Var2;
        this.t = je7Var19;
        this.u = je7Var22;
        this.v = je7Var20;
        this.w = je7Var21;
        this.x = je7Var23;
        this.y = je7Var24;
        this.z = je7Var26;
        this.A = je7Var27;
        this.B = je7Var14;
        this.C = je7Var25;
        w4d w4dVarD = mqd.D();
        this.E = w4dVarD;
        this.G = new LinkedHashSet();
        q0e q0eVarA = r0e.a(d04.k);
        this.H = q0eVarA;
        this.I = q0eVarA;
        this.J = new or1(this, je7Var7, je7Var6, je7Var2, je7Var);
        ((x6a) je7Var18.getValue()).getClass();
        w4dVarD.o1(this, K[0], j47.T(jr1Var, ((w9a) ((kke) je7Var17.getValue())).b(), null, new nr1(this, null), 2));
        od2.L(new zn5(new xk1(new xk1(((cra) t()).w0, 10), 9), new vr1(this, null), 5), jr1Var);
    }

    public static final void a(wr1 wr1Var, Throwable th) {
        q0e q0eVar;
        Object value;
        d04 d04VarJ;
        int i;
        String message;
        Throwable callCreateException = th;
        wr1Var.getClass();
        hm9.r("CallEngineTag", callCreateException, "can't start call", new Object[0]);
        do {
            q0eVar = wr1Var.H;
            value = q0eVar.getValue();
            d04VarJ = wr1Var.j();
            String str = null;
            if (callCreateException instanceof ApiInvocationException) {
                if (wr1Var.j().a != null && (!(r5 instanceof zm1))) {
                    bt1 bt1VarM = wr1Var.m();
                    String str2 = wr1Var.k().c;
                    int i2 = ((ApiInvocationException) callCreateException).a;
                    bt1VarM.getClass();
                    bt1.c(bt1VarM, "GROUP_CALL_JOIN_FAILED", str2, null, null, null, String.valueOf(i2), true, 28);
                }
                String message2 = ((ApiInvocationException) callCreateException).getMessage();
                i = message2 == null ? 0 : (w9e.p0(message2, "privacy.violation", false) || w9e.p0(message2, "call.blocked", false)) ? 3 : 4;
                os1 os1VarS = wr1Var.s();
                if (i != 0) {
                    switch (i) {
                        case 1:
                            str = VersionInfo.UNAVAILABLE;
                            break;
                        case 2:
                            str = "BUSY";
                            break;
                        case 3:
                            str = "PRIVACY";
                            break;
                        case 4:
                            str = "FAILED";
                            break;
                        case 5:
                            str = "CONNECTION_ERROR";
                            break;
                        case 6:
                            str = "REMOVE_FROM_CALL";
                            break;
                        case 7:
                            str = "REMOVE_FROM_WAITING_ROOM";
                            break;
                        default:
                            throw null;
                    }
                }
                os1VarS.a(str);
            } else {
                if ((callCreateException instanceof IllegalStateException) && (message = th.getMessage()) != null && w9e.p0(message, "endpoint is null", false)) {
                    wr1Var.s().a(null);
                }
                i = 0;
            }
        } while (!q0eVar.c(value, d04.a(d04VarJ, null, 0L, null, null, false, false, false, null, new b95(i != 0 ? i : 4), 511)));
        wr1Var.z();
        if (callCreateException instanceof IOException) {
            callCreateException = new CallCreateException(wg0.i("Can't create a call due to error: ", th.getMessage()), callCreateException);
        }
        ((ty3) wr1Var.t.getValue()).a("ONEME-6833", callCreateException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d6  */
    /* JADX WARN: Type inference failed for: r9v36, types: [nz4] */
    /* JADX WARN: Type inference failed for: r9v37, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v38, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.wr1 r28, ru.ok.android.externcalls.sdk.events.end.ConversationEndReason r29) {
        /*
            Method dump skipped, instructions count: 1170
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wr1.b(wr1, ru.ok.android.externcalls.sdk.events.end.ConversationEndReason):void");
    }

    public static final void c(wr1 wr1Var) {
        Object value;
        d04 d04VarJ;
        q0e q0eVar = wr1Var.H;
        do {
            value = q0eVar.getValue();
            d04VarJ = wr1Var.j();
            if (!d04VarJ.f) {
                wr1Var.B(true);
            }
            Conversation conversationA = wr1Var.n().a();
            Collection participants = conversationA != null ? conversationA.getParticipants() : null;
            if (participants == null) {
                participants = nz4.a;
            }
            boolean z = d04VarJ.h;
            boolean z2 = (z || participants.size() <= 2) ? z : true;
            boolean z3 = d04VarJ.e;
            boolean z4 = (z3 || !wr1Var.x(participants)) ? z3 : true;
            if (z4 != z3 || z2 != z) {
                d04VarJ = d04.a(d04VarJ, null, 0L, null, null, z4, false, z2, null, null, 879);
            }
        } while (!q0eVar.c(value, d04VarJ));
    }

    public final void A(lyd lydVar) {
        z31 z31VarD;
        kyd kydVar = lydVar.a;
        if (!f(kydVar)) {
            hm9.n("CallEngineTag", "outgoing call can't start because call already started.");
            return;
        }
        i(null);
        mec mecVar = new mec();
        lr1 lr1Var = new lr1(lydVar, mecVar, this, 0);
        f fVar = new f(1, this, wr1.class, "handleCallCreateError", "handleCallCreateError(Ljava/lang/Throwable;)V", 0, 5);
        a41 a41Var = this.b;
        a41Var.getClass();
        if (kydVar instanceof iyd) {
            z31VarD = a41Var.a(((iyd) kydVar).a, lydVar, lr1Var, fVar);
        } else if (kydVar instanceof gyd) {
            z31VarD = a41Var.b(((gyd) kydVar).a, lydVar, lr1Var, fVar);
        } else if (kydVar instanceof hyd) {
            hyd hydVar = (hyd) kydVar;
            z31VarD = a41Var.d(hydVar.a, hydVar.b, lydVar, lr1Var, fVar);
        } else {
            if (!(kydVar instanceof jyd)) {
                throw new NoWhenBranchMatchedException();
            }
            j1e j1eVar = ((jyd) kydVar).a;
            if (j1eVar instanceof zm1) {
                z31VarD = a41Var.a((zm1) j1eVar, lydVar, lr1Var, fVar);
            } else if (j1eVar instanceof xm1) {
                z31VarD = a41Var.b((xm1) j1eVar, lydVar, lr1Var, fVar);
            } else {
                if (!(j1eVar instanceof ym1)) {
                    throw new NoWhenBranchMatchedException();
                }
                ym1 ym1Var = (ym1) j1eVar;
                z31VarD = a41Var.d(ym1Var.d, ym1Var.e, lydVar, lr1Var, fVar);
            }
        }
        h(z31VarD);
        mecVar.a = z31VarD;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(boolean r19) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wr1.B(boolean):void");
    }

    public final void d(zl1 zl1Var) {
        this.G.add(zl1Var);
    }

    public final void e() {
        hm9.n("CallEngineTag", "call answer");
        String str = k().c;
        j1e j1eVar = k().a;
        long j = (j1eVar == null || !j1eVar.A()) ? 1L : 2L;
        bt1 bt1VarM = m();
        bt1VarM.getClass();
        bt1.c(bt1VarM, "INCOMING_CALL_RECEIVED", str, "ANSWERED", Long.valueOf(j), null, null, false, 80);
        Conversation conversationO = o();
        if (conversationO == null || !conversationO.isPrepared()) {
            return;
        }
        conversationO.init();
        conversationO.connect();
    }

    public final boolean f(kyd kydVar) {
        boolean z;
        j1e j1eVar = j().a;
        if (j1eVar == null) {
            return true;
        }
        return (((kydVar instanceof gyd) && (j1eVar instanceof xm1) && ((gyd) kydVar).a.d == ((xm1) j1eVar).d) || ((kydVar instanceof iyd) && (j1eVar instanceof zm1) && ((iyd) kydVar).a.d == ((zm1) j1eVar).d) || ((((z = kydVar instanceof hyd)) && (j1eVar instanceof ym1) && tpa.f(c37.C(((hyd) kydVar).a), c37.C(((ym1) j1eVar).d))) || (z && (j1eVar instanceof xm1) && tpa.f(c37.C(((hyd) kydVar).a), c37.C(j().d))))) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.z31 r33) {
        /*
            Method dump skipped, instructions count: 940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wr1.g(z31):void");
    }

    public final void h(z31 z31Var) {
        q0e q0eVar;
        Object value;
        Conversation conversation;
        String conversationId;
        e95 e95Var;
        String joinLink;
        j1e j1eVar;
        boolean z;
        boolean z2;
        do {
            q0eVar = this.H;
            value = q0eVar.getValue();
            conversation = z31Var.a;
            conversationId = conversation.getConversationId();
            e95Var = e95.b;
            joinLink = conversation.getJoinLink();
            j1eVar = z31Var.b;
            z = j1eVar instanceof zm1;
            z2 = !z;
        } while (!q0eVar.c(value, new d04(z31Var.b, conversationId, joinLink, z31Var.d, z2, e95Var, 306)));
        n().a.getAndSet(conversation);
        s().d(this.J);
        s().d((era) this.m.getValue());
        os1 os1VarS = s();
        je7 je7Var = this.C;
        os1VarS.d((ez0) je7Var.getValue());
        this.D = j47.T(this.a, null, null, new qr1(this, null), 3);
        if (!z31Var.d && !z2) {
            lkc lkcVarU = u();
            lkcVarU.getClass();
            lkcVarU.c = kkc.BEEP;
            xh1 xh1VarA = lkcVarU.a();
            xh1VarA.a(xh1VarA.b.c, true);
        }
        if (j1eVar instanceof xm1) {
            b31 b31VarL = l();
            long j = ((xm1) j1eVar).d;
            l31 l31Var = (l31) b31VarL;
            l31Var.n.o1(l31Var, l31.p[1], l31Var.b(((jz2) l31Var.a()).n(j), j));
        } else if (z) {
            l31 l31Var2 = (l31) l();
            j47.T(l31Var2.a, ((w9a) ((kke) l31Var2.f.getValue())).a(), null, new k31(((zm1) j1eVar).d, l31Var2, null), 2);
        } else {
            if (!(j1eVar instanceof ym1)) {
                throw new NoWhenBranchMatchedException();
            }
            ym1 ym1Var = (ym1) j1eVar;
            l31 l31Var3 = (l31) l();
            l31Var3.o = Long.valueOf(((k4a) ((pk) l31Var3.c.getValue())).A(c37.D(ym1Var.d), ym1Var.e));
        }
        cra craVar = (cra) t();
        Conversation conversationA = ((fw3) craVar.o.getValue()).a();
        ParticipantStatesManager participantStatesManager = conversationA != null ? conversationA.getParticipantStatesManager() : null;
        if (participantStatesManager != null) {
            participantStatesManager.addHandListener((ParticipantStatesManager.Listener) craVar.Z.getValue());
        }
        wqa wqaVar = new wqa(craVar, null);
        jr1 jr1Var = craVar.a;
        j47.T(jr1Var, null, null, wqaVar, 3);
        craVar.u0 = od2.L(new zn5(((xuc) craVar.Y.getValue()).b, new xqa(craVar, null), 5), jr1Var);
        m58 m58Var = new m58(new m58(((tm3) craVar.X.getValue()).a(), 19), 18);
        int i = ft4.o;
        kt4 kt4Var = kt4.MILLISECONDS;
        craVar.v0 = od2.L(new zn5(new uqa(nu0.e(m58Var, z7.R(HttpStatus.SC_MULTIPLE_CHOICES, kt4Var), new ai0(20)), craVar, 0), new yqa(craVar, null), 5), jr1Var);
        yz0 yz0Var = (yz0) ((ez0) je7Var.getValue());
        yz0Var.y0 = od2.L(new zn5(new ac(nu0.e(new qw(new qw(((tm3) yz0Var.o.getValue()).a(), 8), 7), z7.R(HttpStatus.SC_MULTIPLE_CHOICES, kt4Var), new ai0(2)), 6, yz0Var), new sz0(yz0Var, null), 5), yz0Var.a);
        AtomicBoolean atomicBoolean = yz0Var.x0;
        ParticipantStatesManager participantStatesManagerF = yz0Var.f();
        atomicBoolean.set(participantStatesManagerF != null ? participantStatesManagerF.isOwnHandRaised() : false);
        ParticipantStatesManager participantStatesManagerF2 = yz0Var.f();
        if (participantStatesManagerF2 != null) {
            participantStatesManagerF2.addHandListener((ParticipantStatesManager.Listener) yz0Var.Y.getValue());
        }
        MediaMuteManager mediaMuteManagerE = yz0Var.e();
        if (mediaMuteManagerE != null) {
            mediaMuteManagerE.addListener((tz0) yz0Var.A0.getValue());
        }
        ConversationFeatureManager conversationFeatureManagerG = yz0Var.g();
        if (conversationFeatureManagerG != null) {
            conversationFeatureManagerG.addFeatureListener(u61.b, (uz0) yz0Var.B0.getValue());
        }
        Conversation conversationO = o();
        if (conversationO != null) {
            ((a11) ((z01) this.h.getValue())).a(conversationO.isCaller() ? CallsAudioManager.State.DIALING : CallsAudioManager.State.RINGING);
            hm9.n("CallEngineTag", this + " conversation is ready " + conversationO.getConversationId());
        }
    }

    public final void i(yg1 yg1Var) {
        Object value;
        String str;
        Long lValueOf;
        long j;
        int i = 1;
        hm9.n("CallEngineTag", this + " doBeforeCreateConversation push=" + yg1Var);
        l31 l31Var = (l31) l();
        Continuation continuation = null;
        if (yg1Var != null) {
            q0e q0eVar = l31Var.j;
            do {
                value = q0eVar.getValue();
                String str2 = yg1Var.d;
                if (str2 == null) {
                    str2 = "";
                }
                str = str2;
                long j2 = yg1Var.a;
                lValueOf = Long.valueOf(j2);
                if (j2 == 0) {
                    lValueOf = null;
                }
                j = yg1Var.b;
            } while (!q0eVar.c(value, new y21(Long.valueOf(j), str, yg1Var.e, Long.valueOf(lValueOf != null ? lValueOf.longValue() : j), 96)));
        }
        l31Var.m.o1(l31Var, l31.p[0], j47.T(l31Var.a, null, vx3.b, new io5(new ac(od2.F(new zn5(new qw(new v7c(((cs1) l31Var.d.getValue()).a), 16), new h31(l31Var, null), 5), (nx3) l31Var.l.getValue()), 18, new f31(l31Var, continuation, i)), null), 1));
        hl1 hl1Var = (hl1) this.s.getValue();
        Application application = (Application) this.d.getValue();
        hl1Var.getClass();
        Intent intent = new Intent(application, (Class<?>) CallServiceImpl.class);
        gl1 gl1Var = gl1.a;
        hl1.b(application, intent.putExtra("ACTION", 0));
        a11 a11Var = (a11) ((z01) this.h.getValue());
        CallsAudioManager callsAudioManager = (CallsAudioManager) a11Var.c.updateAndGet(new iz0(2, a11Var));
        hm9.n("CallAudioController", "CallAudioController prepared: " + (callsAudioManager != null ? callsAudioManager.hashCode() : 0));
    }

    public final d04 j() {
        return (d04) this.H.getValue();
    }

    public final d04 k() {
        return (d04) this.I.getValue();
    }

    public final b31 l() {
        return (b31) this.j.getValue();
    }

    public final bt1 m() {
        return (bt1) this.x.getValue();
    }

    public final fw3 n() {
        return (fw3) this.f.getValue();
    }

    public final Conversation o() {
        return n().a();
    }

    public final boolean p() {
        i95 i95Var = k().j;
        return !((i95Var instanceof c95) || (i95Var instanceof b95) || (i95Var instanceof d95));
    }

    public final boolean q() {
        Conversation conversationA = n().a();
        boolean z = conversationA != null && conversationA.isAnswered();
        Conversation conversationA2 = n().a();
        boolean z2 = conversationA2 != null && conversationA2.isCaller();
        i95 i95Var = k().j;
        if ((i95Var instanceof c95) || (i95Var instanceof b95) || (i95Var instanceof d95)) {
            return false;
        }
        return z || z2 || k().h;
    }

    public final boolean r() {
        Conversation conversationA = n().a();
        boolean z = (conversationA == null || conversationA.isAnswered()) ? false : true;
        Conversation conversationA2 = n().a();
        boolean z2 = (conversationA2 == null || conversationA2.isCaller()) ? false : true;
        i95 i95Var = k().j;
        return ((i95Var instanceof c95) || (i95Var instanceof b95) || (i95Var instanceof d95) || !z || !z2 || k().h) ? false : true;
    }

    public final os1 s() {
        return (os1) this.e.getValue();
    }

    public final oqa t() {
        return (oqa) this.k.getValue();
    }

    public final lkc u() {
        return (lkc) this.l.getValue();
    }

    public final void v() {
        w(j().j instanceof h95 ? ji6.o : null);
    }

    public final void w(ji6 ji6Var) {
        hm9.n("CallEngineTag", "hangup " + ji6Var);
        Conversation conversationO = o();
        if (conversationO != null) {
            if (ji6Var == null) {
                ji6Var = null;
            }
            conversationO.hangup(new ii6(ji6Var));
            z();
        }
    }

    public final boolean x(Collection collection) {
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!tpa.f(((ConversationParticipant) it.next()).getExternalId(), mqa.d(((cra) t()).c().a.getId()))) {
                return true;
            }
        }
        return false;
    }

    public final boolean y() {
        boolean z = k().h;
        boolean z2 = ((pqa) ((cra) t()).w0.a.getValue()).h;
        boolean zIsScreenCaptureEnabled = ((pqa) ((cra) t()).w0.a.getValue()).a.a.isScreenCaptureEnabled();
        if (z) {
            if (zIsScreenCaptureEnabled) {
                return false;
            }
        } else if (!z2 || zIsScreenCaptureEnabled) {
            return false;
        }
        return true;
    }

    public final void z() {
        q0e q0eVar;
        Object value;
        q0e q0eVar2;
        Object value2;
        Object value3;
        q0e q0eVar3;
        Object value4;
        q0e q0eVar4;
        Object value5;
        d04 d04Var;
        b95 b95Var;
        hm9.n("CallEngineTag", "release call data");
        y21 y21Var = (y21) ((l31) l()).k.getValue();
        hl1 hl1Var = (hl1) this.s.getValue();
        Application application = (Application) this.d.getValue();
        hl1Var.getClass();
        Intent intent = new Intent(application, (Class<?>) CallServiceImpl.class);
        gl1 gl1Var = gl1.a;
        intent.putExtra("ACTION", 1);
        hl1.b(application, intent);
        s().c(this.J);
        os1 os1VarS = s();
        je7 je7Var = this.m;
        os1VarS.c((era) je7Var.getValue());
        os1 os1VarS2 = s();
        je7 je7Var2 = this.C;
        os1VarS2.c((ez0) je7Var2.getValue());
        vxd vxdVar = this.D;
        if (vxdVar != null) {
            vxdVar.cancel((CancellationException) null);
        }
        this.D = null;
        bc7[] bc7VarArr = K;
        bc7 bc7Var = bc7VarArr[0];
        w4d w4dVar = this.E;
        x77 x77Var = (x77) w4dVar.T0(this, bc7Var);
        if (x77Var != null) {
            x77Var.cancel(null);
        }
        w4dVar.o1(this, bc7VarArr[0], null);
        u().c();
        yl4 yl4Var = (yl4) this.i.getValue();
        vxd vxdVar2 = yl4Var.d;
        if (vxdVar2 != null) {
            vxdVar2.cancel((CancellationException) null);
        }
        yl4Var.d = null;
        ((fra) ((era) je7Var.getValue())).clear();
        ((vs1) this.n.getValue()).a();
        a11 a11Var = (a11) ((z01) this.h.getValue());
        a11Var.getClass();
        a11Var.a(CallsAudioManager.State.IDLE);
        CallsAudioManager callsAudioManager = (CallsAudioManager) a11Var.c.getAndSet(null);
        hm9.n("CallAudioController", "CallAudioController released: " + (callsAudioManager != null ? Integer.valueOf(callsAudioManager.hashCode()) : null));
        jt4 jt4Var = (jt4) this.g.getValue();
        do {
            q0eVar = jt4Var.d;
            value = q0eVar.getValue();
        } while (!q0eVar.c(value, null));
        vxd vxdVar3 = jt4Var.b;
        if (vxdVar3 != null) {
            vxdVar3.cancel((CancellationException) null);
        }
        jt4Var.b = null;
        l31 l31Var = (l31) l();
        l31Var.o = null;
        bc7[] bc7VarArr2 = l31.p;
        bc7 bc7Var2 = bc7VarArr2[0];
        w4d w4dVar2 = l31Var.m;
        x77 x77Var2 = (x77) w4dVar2.T0(l31Var, bc7Var2);
        if (x77Var2 != null) {
            x77Var2.cancel(null);
        }
        w4dVar2.o1(l31Var, bc7VarArr2[0], null);
        bc7 bc7Var3 = bc7VarArr2[1];
        w4d w4dVar3 = l31Var.n;
        x77 x77Var3 = (x77) w4dVar3.T0(l31Var, bc7Var3);
        if (x77Var3 != null) {
            x77Var3.cancel(null);
        }
        w4dVar3.o1(l31Var, bc7VarArr2[1], null);
        do {
            q0eVar2 = l31Var.j;
            value2 = q0eVar2.getValue();
        } while (!q0eVar2.c(value2, y21.h));
        q0e q0eVar5 = ((xuc) this.B.getValue()).b;
        do {
            value3 = q0eVar5.getValue();
            ((Boolean) value3).getClass();
        } while (!q0eVar5.c(value3, Boolean.FALSE));
        yz0 yz0Var = (yz0) ((ez0) je7Var2.getValue());
        x77 x77Var4 = (x77) yz0Var.z0.T0(yz0Var, yz0.G0[0]);
        if (x77Var4 != null) {
            x77Var4.cancel(null);
        }
        vxd vxdVar4 = yz0Var.y0;
        if (vxdVar4 != null) {
            vxdVar4.cancel((CancellationException) null);
        }
        yz0Var.y0 = null;
        yz0Var.x0.set(false);
        ParticipantStatesManager participantStatesManagerF = yz0Var.f();
        if (participantStatesManagerF != null) {
            participantStatesManagerF.removeHandListener((ParticipantStatesManager.Listener) yz0Var.Y.getValue());
        }
        MediaMuteManager mediaMuteManagerE = yz0Var.e();
        if (mediaMuteManagerE != null) {
            mediaMuteManagerE.removeListener((tz0) yz0Var.A0.getValue());
        }
        ConversationFeatureManager conversationFeatureManagerG = yz0Var.g();
        if (conversationFeatureManagerG != null) {
            conversationFeatureManagerG.removeFeatureListener(u61.b, (uz0) yz0Var.B0.getValue());
        }
        yz0Var.Z.set(new xs(0));
        do {
            q0eVar3 = yz0Var.s0;
            value4 = q0eVar3.getValue();
        } while (!q0eVar3.c(value4, oa.d));
        yz0Var.u0.set(false);
        yz0Var.v0.set(false);
        yz0Var.w0.set(false);
        Conversation conversationA = n().a();
        je7 je7Var3 = this.p;
        if (conversationA != null) {
            conversationA.getMediaConnectionManager().removeListener(s());
            conversationA.getRecordManager().removeRecordListener((lvc) je7Var3.getValue());
            try {
                conversationA.release();
            } catch (Throwable th) {
                hm9.p("CallEngineTag", th.getMessage(), th);
            }
        }
        ((vvc) ((lvc) je7Var3.getValue())).c(xvc.o);
        n().a.set(null);
        do {
            q0eVar4 = this.H;
            value5 = q0eVar4.getValue();
            d04Var = (d04) value5;
            i95 i95Var = d04Var.j;
            b95Var = i95Var instanceof b95 ? (b95) i95Var : null;
        } while (!q0eVar4.c(value5, d04.a(d04.k, null, 0L, null, null, false, false, false, new u8b(d04Var.c, (d04Var.h || ((b95Var != null ? b95Var.b : 0) == 3)) ? null : d04Var.a, d04Var.j, y21Var), null, 767)));
    }
}
