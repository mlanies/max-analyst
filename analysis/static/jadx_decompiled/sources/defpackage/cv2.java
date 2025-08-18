package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.search.ChatsListSearchScreen;

/* loaded from: classes.dex */
public final class cv2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ChatsListSearchScreen Y;
    public final /* synthetic */ mx8 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv2(ChatsListSearchScreen chatsListSearchScreen, mx8 mx8Var, Continuation continuation) {
        super(2, continuation);
        this.Y = chatsListSearchScreen;
        this.Z = mx8Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((cv2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new cv2(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        mx8 mx8Var = this.Z;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7VarArr = ChatsListSearchScreen.J0;
            gw2 gw2VarN0 = this.Y.n0();
            long j = mx8Var.Y.a;
            this.X = 1;
            obj = j47.t0(((w9a) gw2VarN0.Z).b(), new sv2(gw2VarN0, j, mx8Var.X, null), this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        Long l = (Long) obj;
        if (l != null) {
            gy2.b2(gy2.c, mx8Var.Y.a, "local", new Long(l.longValue()), null, mx8Var.b, null, 104);
        }
        return e5f.a;
    }
}
