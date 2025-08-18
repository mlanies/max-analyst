package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.record.RecordDescription;
import ru.ok.android.externcalls.sdk.record.RecordManager;

/* loaded from: classes.dex */
public final class vvc implements lvc {
    public static final /* synthetic */ bc7[] A0;
    public final je7 X;
    public final je7 Y;
    public final ReentrantLock Z = new ReentrantLock(true);
    public final so1 a;
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final q0e s0;
    public final q0e t0;
    public vxd u0;
    public final khe v0;
    public final w4d w0;
    public vxd x0;
    public final q0e y0;
    public final q0e z0;

    static {
        oi9 oi9Var = new oi9(vvc.class, "loadUserRecordInfoJob", "getLoadUserRecordInfoJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        A0 = new bc7[]{oi9Var};
    }

    public vvc(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, so1 so1Var, je7 je7Var5) {
        this.a = so1Var;
        this.b = je7Var;
        this.c = je7Var2;
        this.o = je7Var3;
        this.X = je7Var4;
        this.Y = je7Var5;
        q0e q0eVarA = r0e.a(wvc.e);
        this.s0 = q0eVarA;
        this.t0 = q0eVarA;
        this.v0 = new khe(new hbc(11));
        this.w0 = mqd.D();
        q0e q0eVarA2 = r0e.a(null);
        this.y0 = q0eVarA2;
        this.z0 = q0eVarA2;
    }

    public final RecordManager b() {
        Conversation conversationA = ((fw3) this.b.getValue()).a();
        if (conversationA != null) {
            return conversationA.getRecordManager();
        }
        return null;
    }

    public final void c(xvc xvcVar) {
        q0e q0eVar;
        Object value;
        hm9.h0("ScreenRecordControllerTag", "release record state with " + xvcVar, new Object[0]);
        do {
            q0eVar = this.s0;
            value = q0eVar.getValue();
        } while (!q0eVar.c(value, wvc.a(wvc.e, xvcVar, null, false, null, 14)));
        vxd vxdVar = this.u0;
        if (vxdVar != null) {
            vxdVar.cancel((CancellationException) null);
        }
        this.u0 = null;
        bc7[] bc7VarArr = A0;
        bc7 bc7Var = bc7VarArr[0];
        w4d w4dVar = this.w0;
        x77 x77Var = (x77) w4dVar.T0(this, bc7Var);
        if (x77Var != null) {
            x77Var.cancel(null);
        }
        w4dVar.o1(this, bc7VarArr[0], null);
        vxd vxdVar2 = this.x0;
        if (vxdVar2 != null) {
            vxdVar2.cancel((CancellationException) null);
        }
        this.x0 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.xvc r19) {
        /*
            r18 = this;
            r0 = r18
        L2:
            q0e r1 = r0.s0
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            wvc r3 = (defpackage.wvc) r3
            ru.ok.android.externcalls.sdk.record.RecordManager r4 = r18.b()
            r5 = 0
            if (r4 == 0) goto L6c
            ru.ok.android.externcalls.sdk.record.RecordDescription r4 = r4.getRecordDescription()
            if (r4 == 0) goto L6c
            pcc r6 = r4.getType()
            int r6 = r6.ordinal()
            r7 = 3
            r8 = 1
            if (r6 == 0) goto L29
            if (r6 == r8) goto L2b
            r9 = 2
            if (r6 == r9) goto L2c
        L29:
            r9 = r8
            goto L2c
        L2b:
            r9 = r7
        L2c:
            if (r9 != r8) goto L2f
            goto L6c
        L2f:
            ru.ok.android.externcalls.sdk.id.ParticipantId r6 = r4.getInitiator()
            gg1 r14 = defpackage.mqa.b(r6)
            je7 r6 = r0.c
            java.lang.Object r6 = r6.getValue()
            jr1 r6 = (defpackage.jr1) r6
            mvc r8 = new mvc
            long r10 = r14.a
            r8.<init>(r10, r0, r5)
            vxd r5 = defpackage.j47.T(r6, r5, r5, r8, r7)
            bc7[] r6 = defpackage.vvc.A0
            r7 = 0
            r6 = r6[r7]
            w4d r7 = r0.w0
            r7.o1(r0, r6, r5)
            kvc r5 = new kvc
            long r11 = r4.getMovieId()
            long r6 = r4.getMovieId()
            java.lang.String r13 = java.lang.String.valueOf(r6)
            long r15 = r4.getStart()
            r10 = r5
            r17 = r9
            r10.<init>(r11, r13, r14, r15, r17)
        L6c:
            r6 = 0
            r7 = 0
            r8 = 12
            r4 = r19
            wvc r3 = defpackage.wvc.a(r3, r4, r5, r6, r7, r8)
            boolean r1 = r1.c(r2, r3)
            if (r1 == 0) goto L2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vvc.d(xvc):void");
    }

    @Override // ru.ok.android.externcalls.sdk.events.RecordEventListener
    public final void onRecordDataChanged() {
        hm9.h0("ScreenRecordControllerTag", "onRecordDataChanged", new Object[0]);
        d(xvc.c);
    }

    @Override // ru.ok.android.externcalls.sdk.events.RecordEventListener
    public final void onRecordError(String str) {
        hm9.h0("ScreenRecordControllerTag", "onRecordError: " + str, new Object[0]);
        c(xvc.b);
        c(xvc.c);
    }

    @Override // ru.ok.android.externcalls.sdk.events.RecordEventListener
    public final void onRecordStarted() {
        RecordDescription recordDescription;
        RecordManager recordManagerB = b();
        if (recordManagerB == null || (recordDescription = recordManagerB.getRecordDescription()) == null) {
            return;
        }
        hm9.h0("ScreenRecordControllerTag", "onRecordStarted: data = " + recordDescription, new Object[0]);
        long start = recordDescription.getStart();
        if (this.u0 == null) {
            this.u0 = j47.T((jr1) this.c.getValue(), null, null, new uvc(start, this, null), 3);
        }
        d(xvc.a);
    }

    @Override // ru.ok.android.externcalls.sdk.events.RecordEventListener
    public final void onRecordStopped(ConversationParticipant conversationParticipant) {
        ParticipantId externalId;
        ConversationParticipant me2;
        ParticipantId externalId2;
        hm9.h0("ScreenRecordControllerTag", "onRecordStopped: stoppedBy = " + conversationParticipant, new Object[0]);
        kvc kvcVar = ((wvc) this.t0.getValue()).b;
        gg1 gg1VarB = null;
        gg1 gg1Var = kvcVar != null ? kvcVar.c : null;
        if (gg1Var != null) {
            Conversation conversationA = ((fw3) this.b.getValue()).a();
            if (gg1Var.equals((conversationA == null || (me2 = conversationA.getMe()) == null || (externalId2 = me2.getExternalId()) == null) ? null : mqa.b(externalId2))) {
                if (conversationParticipant != null && (externalId = conversationParticipant.getExternalId()) != null) {
                    gg1VarB = mqa.b(externalId);
                }
                if (!gg1Var.equals(gg1VarB)) {
                    ((yz0) ((ez0) this.o.getValue())).C0.g(ua.a);
                }
            }
        }
        c(xvc.c);
    }
}
