package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.factory.AnswerCallParams;

/* loaded from: classes.dex */
public final class sr1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ yg1 Y;
    public final /* synthetic */ wr1 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr1(yg1 yg1Var, wr1 wr1Var, Continuation continuation) {
        super(2, continuation);
        this.Y = yg1Var;
        this.Z = wr1Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((sr1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        sr1 sr1Var = new sr1(this.Y, this.Z, continuation);
        sr1Var.X = obj;
        return sr1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        boolean z;
        Long l;
        Conversation conversationA;
        od2.a0(obj);
        sx3 sx3Var = (sx3) this.X;
        yg1 yg1Var = this.Y;
        long j = yg1Var.b;
        e5f e5fVar = e5f.a;
        wr1 wr1Var = this.Z;
        if (j != 0 && !((se5) ((qe5) wr1Var.u.getValue())).r()) {
            hm9.n("CallEngineTag", "ignore group call push=" + yg1Var);
            return e5fVar;
        }
        hm9.n("CallEngineTag", sx3Var + " showIncomingCall " + yg1Var);
        el3 el3Var = (el3) wr1Var.A.getValue();
        long j2 = yg1Var.a;
        if (el3Var.m(j2)) {
            j47.T(sx3Var, ((w9a) ((kke) wr1Var.r.getValue())).a(), null, new rr1(wr1Var, j2, null), 2);
        }
        Conversation conversationA2 = wr1Var.n().a();
        boolean z2 = conversationA2 == null || !conversationA2.isDestroyed();
        Conversation conversationA3 = wr1Var.n().a();
        boolean zIsAnswered = conversationA3 != null ? conversationA3.isAnswered() : false;
        d04 d04VarJ = wr1Var.j();
        String str = d04VarJ.c;
        j1e j1eVar = d04VarJ.a;
        zm1 zm1Var = j1eVar instanceof zm1 ? (zm1) j1eVar : null;
        if (zm1Var != null) {
            z = zIsAnswered;
            l = new Long(zm1Var.d);
        } else {
            z = zIsAnswered;
            l = null;
        }
        String str2 = yg1Var.c;
        String str3 = d04VarJ.c;
        if (str3 != null && !w9e.C0(str3)) {
            if (tpa.f(str, str2) && z2) {
                hm9.n("CallEngineTag", sx3Var + " ignore repetitive push " + str2 + " current id " + str);
                return e5fVar;
            }
            if (z2 && l != null && j2 == l.longValue() && (conversationA = wr1Var.n().a()) != null && conversationA.isCaller()) {
                StringBuilder sb = new StringBuilder();
                sb.append(sx3Var);
                sb.append(" same incoming call userId=");
                sb.append(j2);
                sb.append(" answered=");
                boolean z3 = z;
                sb.append(z3);
                hm9.n("CallEngineTag", sb.toString());
                if (!z3) {
                    wr1Var.e();
                }
                return e5fVar;
            }
            if (!tpa.f(str, str2)) {
                hm9.n("CallEngineTag", sx3Var + " ignore incoming conversation " + str2 + " we have an active one=" + str + " " + yg1Var);
                ds1.a(wr1Var.c).hangup(ji6.b, str2);
                return e5fVar;
            }
        }
        hm9.n("CallEngineTag", sx3Var + " create conversation for answer " + yg1Var);
        wr1Var.i(yg1Var);
        mec mecVar = new mec();
        if (str2 == null) {
            str2 = null;
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        long j3 = yg1Var.a;
        boolean z4 = yg1Var.f;
        String str4 = yg1Var.g;
        final lk lkVar = new lk();
        lkVar.a = j3;
        lkVar.b = str2;
        lkVar.c = str4;
        final lr1 lr1Var = new lr1(sx3Var, mecVar, wr1Var, 1);
        final f fVar = new f(1, this.Z, wr1.class, "handleCallCreateError", "handleCallCreateError(Ljava/lang/Throwable;)V", 0, 4);
        final a41 a41Var = wr1Var.b;
        final long jC = a41Var.c();
        z31 z31Var = new z31(ds1.a(a41Var.a).answer(new m56() { // from class: y31
            @Override // defpackage.m56
            public final Object invoke(Object obj2) {
                lk lkVar2 = lkVar;
                AnswerCallParams.Builder opponentId = ((AnswerCallParams.Builder) obj2).setOpponentId(mqa.c(lkVar2.a));
                String str5 = lkVar2.c;
                if (str5 != null) {
                    opponentId.setConversationParams(str5);
                }
                return opponentId.setConversationId(lkVar2.b).setMyId(mqa.c(jC)).setEventListener((ConversationEventsListener) a41Var.b.getValue()).setOnPrepared(lr1Var).setOnError(fVar).build();
            }
        }), new zm1(j3, z4), true, true);
        wr1Var.h(z31Var);
        mecVar.a = z31Var;
        return e5fVar;
    }
}
