package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipantsUpdate;

/* loaded from: classes.dex */
public final class yz0 implements ez0 {
    public static final /* synthetic */ bc7[] G0;
    public final khe A0;
    public final khe B0;
    public final kld C0;
    public final kld D0;
    public final q0e E0;
    public final q0e F0;
    public final je7 X;
    public final khe Y = new khe(new kz0(this, 2));
    public final AtomicReference Z = new AtomicReference(new xs(0));
    public final jr1 a;
    public final so1 b;
    public final je7 c;
    public final je7 o;
    public final q0e s0;
    public final q0e t0;
    public final AtomicBoolean u0;
    public final AtomicBoolean v0;
    public final AtomicBoolean w0;
    public final AtomicBoolean x0;
    public vxd y0;
    public final w4d z0;

    static {
        oi9 oi9Var = new oi9(yz0.class, "usersUpdateJob", "getUsersUpdateJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        G0 = new bc7[]{oi9Var};
    }

    public yz0(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, jr1 jr1Var, je7 je7Var5, so1 so1Var, je7 je7Var6) {
        this.a = jr1Var;
        this.b = so1Var;
        this.c = je7Var;
        this.o = je7Var5;
        this.X = je7Var6;
        q0e q0eVarA = r0e.a(oa.d);
        this.s0 = q0eVarA;
        this.t0 = q0eVarA;
        this.u0 = new AtomicBoolean(false);
        this.v0 = new AtomicBoolean(false);
        this.w0 = new AtomicBoolean(false);
        this.x0 = new AtomicBoolean(false);
        this.z0 = mqd.D();
        this.A0 = new khe(new bp(this, je7Var2, je7Var3, je7Var4));
        this.B0 = new khe(new kz0(this, 3));
        kld kldVarA = lld.a(1, 1, 2);
        this.C0 = kldVarA;
        this.D0 = kldVarA;
        q0e q0eVarA2 = r0e.a(aa.h);
        this.E0 = q0eVarA2;
        this.F0 = q0eVarA2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01a5 -> B:50:0x01b0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.yz0 r26, defpackage.xs r27, kotlin.coroutines.Continuation r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yz0.b(yz0, xs, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static boolean h(rd8 rd8Var) {
        return rd8Var != rd8.c;
    }

    public final void c(gg1 gg1Var, boolean z) {
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "CallAdminSettingsController", "Update user from waiting room " + gg1Var + " with apply state=" + z, null);
        }
        if (z) {
            bt1 bt1Var = (bt1) this.X.getValue();
            Long lValueOf = Long.valueOf(gg1Var.a);
            bt1Var.getClass();
            bt1.c(bt1Var, "PROMOTE_JOIN_WAITING_ROOM", null, null, lValueOf, null, null, true, 54);
        } else {
            bt1 bt1Var2 = (bt1) this.X.getValue();
            Long lValueOf2 = Long.valueOf(gg1Var.a);
            bt1Var2.getClass();
            bt1.c(bt1Var2, "REJECT_JOIN_WAITING_ROOM", null, null, lValueOf2, null, null, true, 54);
        }
        ParticipantId participantIdD = mqa.d(gg1Var);
        if (z) {
            Conversation conversationA = d().a();
            if (conversationA != null) {
                conversationA.promoteParticipant(participantIdD, true);
            }
        } else {
            Conversation conversationA2 = d().a();
            if (conversationA2 != null) {
                conversationA2.removeParticipant(participantIdD);
            }
        }
        if (z) {
            return;
        }
        this.Z.getAndUpdate(new iz0(1, gg1Var));
        l();
    }

    public final fw3 d() {
        return (fw3) this.c.getValue();
    }

    public final MediaMuteManager e() {
        Conversation conversationA = d().a();
        if (conversationA != null) {
            return conversationA.getMediaMuteManager();
        }
        return null;
    }

    public final ParticipantStatesManager f() {
        Conversation conversationA = d().a();
        if (conversationA != null) {
            return conversationA.getParticipantStatesManager();
        }
        return null;
    }

    public final ConversationFeatureManager g() {
        Conversation conversationA = d().a();
        if (conversationA != null) {
            return conversationA.getFeatureManager();
        }
        return null;
    }

    public final void i(boolean z) {
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "CallAdminSettingsController", ey8.j("Screen record change state to ", z), null);
        }
        u61 u61Var = u61.b;
        if (z) {
            ConversationFeatureManager conversationFeatureManagerG = g();
            if (conversationFeatureManagerG != null) {
                ConversationFeatureManager.enableFeatureForAll$default(conversationFeatureManagerG, u61Var, null, null, 6, null);
                return;
            }
            return;
        }
        ConversationFeatureManager conversationFeatureManagerG2 = g();
        if (conversationFeatureManagerG2 != null) {
            ConversationFeatureManager.enableFeatureForRoles$default(conversationFeatureManagerG2, u61Var, bcd.a0(eg1.b, eg1.a), null, null, 12, null);
        }
    }

    public final void j() {
        AtomicBoolean atomicBoolean = this.w0;
        if (!atomicBoolean.get() && this.v0.get() && this.u0.get()) {
            q0e q0eVar = this.E0;
            if (!((aa) q0eVar.getValue()).a) {
                boolean z = ((aa) q0eVar.getValue()).b;
                boolean z2 = ((aa) q0eVar.getValue()).c;
                kld kldVar = this.C0;
                if (!z && !z2) {
                    kldVar.g(new wa());
                } else if (!z && z2) {
                    kldVar.g(new xa(true, false));
                } else if (z && !z2) {
                    kldVar.g(new za(true, false));
                }
            }
            atomicBoolean.set(true);
        }
    }

    public final void k(boolean z, boolean z2, boolean z3) {
        q0e q0eVar;
        Object value;
        boolean z4;
        boolean zIsMeCreatorOrAdmin;
        boolean zIsWaitingRoomEnabled;
        do {
            q0eVar = this.E0;
            value = q0eVar.getValue();
            aa aaVar = (aa) value;
            ConversationFeatureManager conversationFeatureManagerG = g();
            z4 = (conversationFeatureManagerG != null ? conversationFeatureManagerG.getFeatureRoles(u61.b) : null) instanceof FeatureRoles.EnabledForAll;
            Conversation conversationA = d().a();
            zIsMeCreatorOrAdmin = conversationA != null ? conversationA.isMeCreatorOrAdmin() : false;
            Conversation conversationA2 = d().a();
            zIsWaitingRoomEnabled = conversationA2 != null ? conversationA2.isWaitingRoomEnabled() : false;
            aaVar.getClass();
        } while (!q0eVar.c(value, new aa(zIsMeCreatorOrAdmin, z, z2, z3, z4, false, zIsWaitingRoomEnabled)));
    }

    public final void l() {
        vxd vxdVarT = j47.T(this.a, null, null, new vz0(this, null), 3);
        this.z0.o1(this, G0[0], vxdVarT);
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsAdded(List list) {
        this.Z.getAndUpdate(new iz0(0, list));
        l();
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onRolesChanged(ConversationParticipant conversationParticipant) {
        q0e q0eVar;
        Object value;
        boolean zH;
        sd8 mediaOptionsForCall$default;
        rd8 rd8Var;
        sd8 mediaOptionsForCall$default2;
        rd8 rd8Var2;
        sd8 mediaOptionsForCall$default3;
        rd8 rd8Var3;
        ConversationParticipant me2;
        super.onRolesChanged(conversationParticipant);
        ParticipantId externalId = conversationParticipant != null ? conversationParticipant.getExternalId() : null;
        Conversation conversationA = d().a();
        if (tpa.f(externalId, (conversationA == null || (me2 = conversationA.getMe()) == null) ? null : me2.getExternalId())) {
            do {
                q0eVar = this.E0;
                value = q0eVar.getValue();
                zH = false;
            } while (!q0eVar.c(value, aa.a((aa) value, (conversationParticipant != null ? conversationParticipant.isAdmin() : false) || (conversationParticipant != null ? conversationParticipant.isCreator() : false), false, false, false, false, false, 126)));
            MediaMuteManager mediaMuteManagerE = e();
            boolean zH2 = (mediaMuteManagerE == null || (mediaOptionsForCall$default3 = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerE, null, 1, null)) == null || (rd8Var3 = mediaOptionsForCall$default3.b) == null) ? false : h(rd8Var3);
            MediaMuteManager mediaMuteManagerE2 = e();
            boolean zH3 = (mediaMuteManagerE2 == null || (mediaOptionsForCall$default2 = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerE2, null, 1, null)) == null || (rd8Var2 = mediaOptionsForCall$default2.a) == null) ? false : h(rd8Var2);
            MediaMuteManager mediaMuteManagerE3 = e();
            if (mediaMuteManagerE3 != null && (mediaOptionsForCall$default = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerE3, null, 1, null)) != null && (rd8Var = mediaOptionsForCall$default.c) != null) {
                zH = h(rd8Var);
            }
            k(zH2, zH3, zH);
            this.v0.set(true);
            j();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onWaitingRoomEnabledChanged(boolean z) {
        Object value;
        super.onWaitingRoomEnabledChanged(z);
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "CallAdminSettingsController", ey8.j("Waiting room change state updating ", z), null);
        }
        q0e q0eVar = this.E0;
        do {
            value = q0eVar.getValue();
        } while (!q0eVar.c(value, aa.a((aa) value, false, false, false, false, false, z, 63)));
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onWaitingRoomParticipantsChanged(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
        super.onWaitingRoomParticipantsChanged(waitingRoomParticipantsUpdate);
        this.Z.getAndUpdate(new oz0(waitingRoomParticipantsUpdate, 0, this));
        l();
    }
}
