package defpackage;

import android.view.View;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.list.ChatsListWidget;

/* loaded from: classes.dex */
public final class cy2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ChatsListWidget Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ View s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy2(ChatsListWidget chatsListWidget, long j, View view, Continuation continuation) {
        super(2, continuation);
        this.Y = chatsListWidget;
        this.Z = j;
        this.s0 = view;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((cy2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new cy2(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        long j = this.Z;
        ChatsListWidget chatsListWidget = this.Y;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7VarArr = ChatsListWidget.M0;
            nx2 nx2VarP0 = chatsListWidget.p0();
            this.X = 1;
            obj = j47.t0(((w9a) nx2VarP0.Y).a(), new jw2(nx2VarP0, j, null), this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        List list = (List) (((List) obj).isEmpty() ? null : obj);
        if (list != null) {
            Long l = new Long(j);
            bc7[] bc7VarArr2 = ChatsListWidget.M0;
            chatsListWidget.getClass();
            bc7 bc7Var = ChatsListWidget.M0[0];
            chatsListWidget.c.b(chatsListWidget, l);
            qt3 qt3VarY = dy7.c(2).I(list).Y(this.s0);
            ChatsListWidget.m0(chatsListWidget, qt3VarY);
            qt3VarY.build().q(chatsListWidget);
        }
        return e5f.a;
    }
}
