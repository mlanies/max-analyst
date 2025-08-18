package defpackage;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.factory.StartCallParams;

/* loaded from: classes.dex */
public final class a41 {
    public final ds1 a;
    public final je7 b;
    public final je7 c;

    public a41(ds1 ds1Var, je7 je7Var, je7 je7Var2) {
        this.a = ds1Var;
        this.b = je7Var;
        this.c = je7Var2;
    }

    public final z31 a(final zm1 zm1Var, final lyd lydVar, final lr1 lr1Var, final f fVar) {
        final long jC = c();
        final JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_video", lydVar.b);
        return new z31(ds1.a(this.a).call(new m56() { // from class: x31
            @Override // defpackage.m56
            public final Object invoke(Object obj) {
                return ((StartCallParams.Builder) obj).setOpponentId(mqa.c(zm1Var.d)).setPayload(jSONObject.toString()).setWatchTogetherEnabledForAll(false).setMyId(mqa.c(jC)).setStartWithVideo(lydVar.b).setEventListener((ConversationEventsListener) this.b.getValue()).setOnPrepared(lr1Var).setOnError(fVar).build();
            }
        }), zm1Var, true, false);
    }

    public final z31 b(xm1 xm1Var, lyd lydVar, lr1 lr1Var, f fVar) {
        long jC = c();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("chat_id", xm1Var.d);
        jSONObject.put("is_video", lydVar.b);
        return new z31(ds1.a(this.a).createConfRoom(new w31(jSONObject, jC, lydVar, this, lr1Var, fVar, 0)), xm1Var, true, false);
    }

    public final long c() {
        return ((hyc) ((q33) ((so1) this.c.getValue()).a.getValue())).t();
    }

    public final z31 d(String str, boolean z, lyd lydVar, lr1 lr1Var, f fVar) {
        return new z31(ds1.a(this.a).joinByLink(new w31(str, c(), lydVar, this, lr1Var, fVar, 1)), new ym1(str, z), !z, false);
    }
}
