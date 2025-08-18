package defpackage;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.factory.CreateConfParams;
import ru.ok.android.externcalls.sdk.factory.JoinByLinkParams;

/* loaded from: classes.dex */
public final /* synthetic */ class w31 implements m56 {
    public final /* synthetic */ m56 X;
    public final /* synthetic */ m56 Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ lyd c;
    public final /* synthetic */ a41 o;

    public /* synthetic */ w31(Object obj, long j, lyd lydVar, a41 a41Var, lr1 lr1Var, f fVar, int i) {
        this.a = i;
        this.Z = obj;
        this.b = j;
        this.c = lydVar;
        this.o = a41Var;
        this.X = lr1Var;
        this.Y = fVar;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return ((CreateConfParams.Builder) obj).setPayload(((JSONObject) this.Z).toString()).setMyId(mqa.c(this.b)).setStartWithVideo(this.c.b).setEventListener((ConversationEventsListener) this.o.b.getValue()).setOnPrepared(this.X).setOnError(this.Y).build();
            default:
                return ((JoinByLinkParams.Builder) obj).setLink((String) this.Z).setMyId(mqa.c(this.b)).setStartWithVideo(this.c.b).setEventListener((ConversationEventsListener) this.o.b.getValue()).setOnPrepared(this.X).setOnError(this.Y).build();
        }
    }
}
