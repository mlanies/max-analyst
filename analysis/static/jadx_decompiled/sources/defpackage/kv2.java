package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.search.ChatsListSearchScreen;

/* loaded from: classes.dex */
public final class kv2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ChatsListSearchScreen Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ View s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv2(ChatsListSearchScreen chatsListSearchScreen, long j, View view, Continuation continuation) {
        super(2, continuation);
        this.Y = chatsListSearchScreen;
        this.Z = j;
        this.s0 = view;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((kv2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new kv2(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        long j = this.Z;
        ChatsListSearchScreen chatsListSearchScreen = this.Y;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7VarArr = ChatsListSearchScreen.J0;
            gw2 gw2VarN0 = chatsListSearchScreen.n0();
            this.X = 1;
            obj = j47.t0(((w9a) gw2VarN0.Z).a(), new qv2(gw2VarN0, j, null), this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        Long l = new Long(j);
        bc7[] bc7VarArr2 = ChatsListSearchScreen.J0;
        chatsListSearchScreen.getClass();
        bc7 bc7Var = ChatsListSearchScreen.J0[0];
        chatsListSearchScreen.o.b(chatsListSearchScreen, l);
        float f = 6;
        dy7.c(2).I((List) obj).Y(this.s0).w(new Rect(tu0.G(fk4.d().getDisplayMetrics().density * f), 0, tu0.G(f * fk4.d().getDisplayMetrics().density), 0), fk4.d().getDisplayMetrics().density * 12.0f).build().q(chatsListSearchScreen);
        return e5f.a;
    }
}
