package defpackage;

import android.os.Bundle;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import ru.ok.android.externcalls.sdk.video.CameraManager;

/* loaded from: classes.dex */
public final class eo1 {
    public static final /* synthetic */ bc7[] k;
    public final k56 a;
    public final ir1 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final w4d h = mqd.D();
    public final kld i;
    public final v7c j;

    static {
        oi9 oi9Var = new oi9(eo1.class, "actionHandlerJob", "getActionHandlerJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        k = new bc7[]{oi9Var};
    }

    public eo1(k56 k56Var, ir1 ir1Var, je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5) {
        this.a = k56Var;
        this.b = ir1Var;
        this.c = je7Var;
        this.d = je7Var4;
        this.e = je7Var2;
        this.f = je7Var3;
        this.g = je7Var5;
        kld kldVarB = lld.b(0, Integer.MAX_VALUE, 0, 4);
        this.i = kldVarB;
        this.j = new v7c(kldVarB);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0225 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x025f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0287  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.v31 a(defpackage.gg1 r22, android.graphics.Point r23) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eo1.a(gg1, android.graphics.Point):v31");
    }

    public final boolean b(int i, Bundle bundle) {
        gg1 gg1Var;
        gg1 gg1Var2;
        gg1 gg1Var3;
        gg1 gg1Var4;
        final gg1 gg1Var5;
        final yz0 yz0Var;
        MediaMuteManager mediaMuteManagerE;
        final gg1 gg1Var6;
        final yz0 yz0Var2;
        MediaMuteManager mediaMuteManagerE2;
        final gg1 gg1Var7;
        final yz0 yz0Var3;
        MediaMuteManager mediaMuteManagerE3;
        gg1 gg1Var8;
        if (i == y7a.V0) {
            if (bundle == null || (gg1Var8 = (gg1) bundle.getParcelable("call_participant_id")) == null) {
                return true;
            }
            if (!((y21) ((l31) this.b.f).k.getValue()).g) {
                this.i.g(new kj1(gg1Var8));
                return true;
            }
            d(gg1Var8);
            return true;
        }
        int i2 = y7a.W0;
        rd8 rd8Var = rd8.b;
        je7 je7Var = this.d;
        if (i == i2) {
            if (bundle == null || (gg1Var7 = (gg1) bundle.getParcelable("call_participant_id")) == null || (mediaMuteManagerE3 = (yz0Var3 = (yz0) ((ez0) je7Var.getValue())).e()) == null) {
                return true;
            }
            ParticipantId participantIdD = mqa.d(gg1Var7);
            ky7 ky7Var = new ky7();
            ky7Var.put(qd8.b, rd8Var);
            ky7 ky7VarB = ky7Var.b();
            final int i3 = 2;
            MediaMuteManager.updateMediaOptionsForParticipant$default(mediaMuteManagerE3, ky7VarB, participantIdD, null, new k56() { // from class: fz0
                @Override // defpackage.k56
                public final Object invoke() {
                    switch (i3) {
                        case 0:
                            yz0 yz0Var4 = yz0Var3;
                            gg1 gg1Var9 = gg1Var7;
                            ir6 ir6Var = hm9.m;
                            if (ir6Var != null && ir6Var.c()) {
                                ir6Var.d(us7.X, "CallAdminSettingsController", "Disable screen sharing for " + gg1Var9 + " was success", null);
                            }
                            yz0Var4.C0.g(new ib(gg1Var9));
                            break;
                        case 1:
                            yz0 yz0Var5 = yz0Var3;
                            gg1 gg1Var10 = gg1Var7;
                            ir6 ir6Var2 = hm9.m;
                            if (ir6Var2 != null && ir6Var2.c()) {
                                ir6Var2.d(us7.X, "CallAdminSettingsController", "Disable microphone for " + gg1Var10 + " was success", null);
                            }
                            yz0Var5.C0.g(new fb(gg1Var10, true));
                            break;
                        default:
                            yz0 yz0Var6 = yz0Var3;
                            gg1 gg1Var11 = gg1Var7;
                            ir6 ir6Var3 = hm9.m;
                            if (ir6Var3 != null && ir6Var3.c()) {
                                ir6Var3.d(us7.X, "CallAdminSettingsController", "Disable camera for " + gg1Var11 + " was success", null);
                            }
                            yz0Var6.C0.g(new eb(gg1Var11, true));
                            break;
                    }
                    return e5f.a;
                }
            }, new m56() { // from class: mz0
                @Override // defpackage.m56
                public final Object invoke(Object obj) {
                    switch (i3) {
                        case 0:
                            yz0 yz0Var4 = yz0Var3;
                            gg1 gg1Var9 = gg1Var7;
                            Throwable th = (Throwable) obj;
                            ir6 ir6Var = hm9.m;
                            if (ir6Var != null && ir6Var.c()) {
                                ir6Var.d(us7.X, "CallAdminSettingsController", "Disable screen sharing for " + gg1Var9 + " failed due to: " + th.getMessage(), null);
                            }
                            yz0Var4.C0.g(new ib(gg1Var9));
                            break;
                        case 1:
                            yz0 yz0Var5 = yz0Var3;
                            gg1 gg1Var10 = gg1Var7;
                            Throwable th2 = (Throwable) obj;
                            ir6 ir6Var2 = hm9.m;
                            if (ir6Var2 != null && ir6Var2.c()) {
                                ir6Var2.d(us7.X, "CallAdminSettingsController", "Disable microphone for " + gg1Var10 + " failed due to: " + th2.getMessage(), null);
                            }
                            yz0Var5.C0.g(new fb(gg1Var10, false));
                            break;
                        default:
                            yz0 yz0Var6 = yz0Var3;
                            gg1 gg1Var11 = gg1Var7;
                            Throwable th3 = (Throwable) obj;
                            ir6 ir6Var3 = hm9.m;
                            if (ir6Var3 != null && ir6Var3.c()) {
                                ir6Var3.d(us7.X, "CallAdminSettingsController", "Disable camera for " + gg1Var11 + " failed due to: " + th3.getMessage(), null);
                            }
                            yz0Var6.C0.g(new eb(gg1Var11, false));
                            break;
                    }
                    return e5f.a;
                }
            }, 4, null);
            return true;
        }
        if (i == y7a.X0) {
            if (bundle == null || (gg1Var6 = (gg1) bundle.getParcelable("call_participant_id")) == null || (mediaMuteManagerE2 = (yz0Var2 = (yz0) ((ez0) je7Var.getValue())).e()) == null) {
                return true;
            }
            ParticipantId participantIdD2 = mqa.d(gg1Var6);
            ky7 ky7Var2 = new ky7();
            ky7Var2.put(qd8.a, rd8Var);
            ky7 ky7VarB2 = ky7Var2.b();
            final int i4 = 1;
            MediaMuteManager.updateMediaOptionsForParticipant$default(mediaMuteManagerE2, ky7VarB2, participantIdD2, null, new k56() { // from class: fz0
                @Override // defpackage.k56
                public final Object invoke() {
                    switch (i4) {
                        case 0:
                            yz0 yz0Var4 = yz0Var2;
                            gg1 gg1Var9 = gg1Var6;
                            ir6 ir6Var = hm9.m;
                            if (ir6Var != null && ir6Var.c()) {
                                ir6Var.d(us7.X, "CallAdminSettingsController", "Disable screen sharing for " + gg1Var9 + " was success", null);
                            }
                            yz0Var4.C0.g(new ib(gg1Var9));
                            break;
                        case 1:
                            yz0 yz0Var5 = yz0Var2;
                            gg1 gg1Var10 = gg1Var6;
                            ir6 ir6Var2 = hm9.m;
                            if (ir6Var2 != null && ir6Var2.c()) {
                                ir6Var2.d(us7.X, "CallAdminSettingsController", "Disable microphone for " + gg1Var10 + " was success", null);
                            }
                            yz0Var5.C0.g(new fb(gg1Var10, true));
                            break;
                        default:
                            yz0 yz0Var6 = yz0Var2;
                            gg1 gg1Var11 = gg1Var6;
                            ir6 ir6Var3 = hm9.m;
                            if (ir6Var3 != null && ir6Var3.c()) {
                                ir6Var3.d(us7.X, "CallAdminSettingsController", "Disable camera for " + gg1Var11 + " was success", null);
                            }
                            yz0Var6.C0.g(new eb(gg1Var11, true));
                            break;
                    }
                    return e5f.a;
                }
            }, new m56() { // from class: mz0
                @Override // defpackage.m56
                public final Object invoke(Object obj) {
                    switch (i4) {
                        case 0:
                            yz0 yz0Var4 = yz0Var2;
                            gg1 gg1Var9 = gg1Var6;
                            Throwable th = (Throwable) obj;
                            ir6 ir6Var = hm9.m;
                            if (ir6Var != null && ir6Var.c()) {
                                ir6Var.d(us7.X, "CallAdminSettingsController", "Disable screen sharing for " + gg1Var9 + " failed due to: " + th.getMessage(), null);
                            }
                            yz0Var4.C0.g(new ib(gg1Var9));
                            break;
                        case 1:
                            yz0 yz0Var5 = yz0Var2;
                            gg1 gg1Var10 = gg1Var6;
                            Throwable th2 = (Throwable) obj;
                            ir6 ir6Var2 = hm9.m;
                            if (ir6Var2 != null && ir6Var2.c()) {
                                ir6Var2.d(us7.X, "CallAdminSettingsController", "Disable microphone for " + gg1Var10 + " failed due to: " + th2.getMessage(), null);
                            }
                            yz0Var5.C0.g(new fb(gg1Var10, false));
                            break;
                        default:
                            yz0 yz0Var6 = yz0Var2;
                            gg1 gg1Var11 = gg1Var6;
                            Throwable th3 = (Throwable) obj;
                            ir6 ir6Var3 = hm9.m;
                            if (ir6Var3 != null && ir6Var3.c()) {
                                ir6Var3.d(us7.X, "CallAdminSettingsController", "Disable camera for " + gg1Var11 + " failed due to: " + th3.getMessage(), null);
                            }
                            yz0Var6.C0.g(new eb(gg1Var11, false));
                            break;
                    }
                    return e5f.a;
                }
            }, 4, null);
            return true;
        }
        if (i == y7a.Y0) {
            if (bundle == null || (gg1Var5 = (gg1) bundle.getParcelable("call_participant_id")) == null || (mediaMuteManagerE = (yz0Var = (yz0) ((ez0) je7Var.getValue())).e()) == null) {
                return true;
            }
            ParticipantId participantIdD3 = mqa.d(gg1Var5);
            ky7 ky7Var3 = new ky7();
            ky7Var3.put(qd8.c, rd8Var);
            ky7 ky7VarB3 = ky7Var3.b();
            final int i5 = 0;
            MediaMuteManager.updateMediaOptionsForParticipant$default(mediaMuteManagerE, ky7VarB3, participantIdD3, null, new k56() { // from class: fz0
                @Override // defpackage.k56
                public final Object invoke() {
                    switch (i5) {
                        case 0:
                            yz0 yz0Var4 = yz0Var;
                            gg1 gg1Var9 = gg1Var5;
                            ir6 ir6Var = hm9.m;
                            if (ir6Var != null && ir6Var.c()) {
                                ir6Var.d(us7.X, "CallAdminSettingsController", "Disable screen sharing for " + gg1Var9 + " was success", null);
                            }
                            yz0Var4.C0.g(new ib(gg1Var9));
                            break;
                        case 1:
                            yz0 yz0Var5 = yz0Var;
                            gg1 gg1Var10 = gg1Var5;
                            ir6 ir6Var2 = hm9.m;
                            if (ir6Var2 != null && ir6Var2.c()) {
                                ir6Var2.d(us7.X, "CallAdminSettingsController", "Disable microphone for " + gg1Var10 + " was success", null);
                            }
                            yz0Var5.C0.g(new fb(gg1Var10, true));
                            break;
                        default:
                            yz0 yz0Var6 = yz0Var;
                            gg1 gg1Var11 = gg1Var5;
                            ir6 ir6Var3 = hm9.m;
                            if (ir6Var3 != null && ir6Var3.c()) {
                                ir6Var3.d(us7.X, "CallAdminSettingsController", "Disable camera for " + gg1Var11 + " was success", null);
                            }
                            yz0Var6.C0.g(new eb(gg1Var11, true));
                            break;
                    }
                    return e5f.a;
                }
            }, new m56() { // from class: mz0
                @Override // defpackage.m56
                public final Object invoke(Object obj) {
                    switch (i5) {
                        case 0:
                            yz0 yz0Var4 = yz0Var;
                            gg1 gg1Var9 = gg1Var5;
                            Throwable th = (Throwable) obj;
                            ir6 ir6Var = hm9.m;
                            if (ir6Var != null && ir6Var.c()) {
                                ir6Var.d(us7.X, "CallAdminSettingsController", "Disable screen sharing for " + gg1Var9 + " failed due to: " + th.getMessage(), null);
                            }
                            yz0Var4.C0.g(new ib(gg1Var9));
                            break;
                        case 1:
                            yz0 yz0Var5 = yz0Var;
                            gg1 gg1Var10 = gg1Var5;
                            Throwable th2 = (Throwable) obj;
                            ir6 ir6Var2 = hm9.m;
                            if (ir6Var2 != null && ir6Var2.c()) {
                                ir6Var2.d(us7.X, "CallAdminSettingsController", "Disable microphone for " + gg1Var10 + " failed due to: " + th2.getMessage(), null);
                            }
                            yz0Var5.C0.g(new fb(gg1Var10, false));
                            break;
                        default:
                            yz0 yz0Var6 = yz0Var;
                            gg1 gg1Var11 = gg1Var5;
                            Throwable th3 = (Throwable) obj;
                            ir6 ir6Var3 = hm9.m;
                            if (ir6Var3 != null && ir6Var3.c()) {
                                ir6Var3.d(us7.X, "CallAdminSettingsController", "Disable camera for " + gg1Var11 + " failed due to: " + th3.getMessage(), null);
                            }
                            yz0Var6.C0.g(new eb(gg1Var11, false));
                            break;
                    }
                    return e5f.a;
                }
            }, 4, null);
            return true;
        }
        if (i == y7a.D) {
            if (bundle == null || (gg1Var4 = (gg1) bundle.getParcelable("call_participant_id")) == null) {
                return true;
            }
            c(gg1Var4);
            return true;
        }
        if (i == y7a.E) {
            if (bundle == null || (gg1Var3 = (gg1) bundle.getParcelable("call_participant_id")) == null) {
                return true;
            }
            c(gg1Var3);
            return true;
        }
        if (i == y7a.B) {
            e();
            return true;
        }
        if (i == y7a.F) {
            if (bundle == null || (gg1Var2 = (gg1) bundle.getParcelable("call_participant_id")) == null) {
                return true;
            }
            this.h.o1(this, k[0], j47.S((sx3) this.a.invoke(), ((w9a) ((kke) this.c.getValue())).b(), vx3.b, new co1(this, gg1Var2.a, null)));
            return true;
        }
        if (i != y7a.C) {
            return false;
        }
        if (bundle == null || (gg1Var = (gg1) bundle.getParcelable("call_participant_id")) == null) {
            return true;
        }
        yz0 yz0Var4 = (yz0) ((ez0) je7Var.getValue());
        ParticipantStatesManager participantStatesManagerF = yz0Var4.f();
        if (participantStatesManagerF != null) {
            participantStatesManagerF.lowerHandParticipant(mqa.d(gg1Var));
        }
        yz0Var4.C0.g(gb.a);
        return true;
    }

    public final void c(gg1 gg1Var) {
        ir1 ir1Var = this.b;
        boolean z = ((d04) ir1Var.b().getValue()).e;
        if (!gg1Var.equals(gg1.c) && ((d04) ir1Var.b().getValue()).h && z) {
            ir1Var.i(gg1Var, false);
        }
    }

    public final void d(gg1 gg1Var) {
        String name;
        fqa fqaVar = (fqa) ((pqa) ((w7c) this.b.e()).a.getValue()).c.get(gg1Var);
        if (fqaVar == null || (name = fqaVar.b.getName()) == null) {
            return;
        }
        kld kldVar = this.i;
        uj1 uj1Var = wj1.b;
        kldVar.g(new vj1(new gqe(b8a.R0, ys.m0(new Object[]{name})), new a81(this, gg1Var, name, 1)));
    }

    public final void e() {
        ir1 ir1Var = this.b;
        bt1 bt1Var = (bt1) ir1Var.m.getValue();
        String str = ir1Var.c().c;
        r21 r21Var = ir1Var.e;
        long j = r21Var.b() ? 2L : 1L;
        boolean z = ir1Var.c().h;
        bt1Var.getClass();
        bt1.c(bt1Var, "CAMERA_CHANGED", str, null, Long.valueOf(j), null, null, z, 52);
        int i = r21Var.b() ? 2 : 1;
        CameraManager cameraManagerA = r21Var.a();
        if (cameraManagerA != null) {
            cameraManagerA.switchCamera(new jx1(i));
        }
    }
}
