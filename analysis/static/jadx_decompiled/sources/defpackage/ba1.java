package defpackage;

import android.content.Context;
import android.graphics.PointF;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;

/* loaded from: classes.dex */
public final class ba1 implements aa1, um1 {
    public final je7 a;
    public final PointF b;
    public final je7 c;

    public ba1(je7 je7Var, je7 je7Var2) {
        this.a = je7Var;
        this.c = tu0.r(3, new z30(2, je7Var));
        ((os1) je7Var2.getValue()).d(this);
        this.b = dy7.y((Context) je7Var.getValue());
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        super.onDestroyed(conversationDestroyedInfo);
        PointF pointFY = dy7.y((Context) this.a.getValue());
        PointF pointF = this.b;
        pointF.x = pointFY.x;
        pointF.y = pointFY.y;
    }
}
