package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* loaded from: classes.dex */
public final class bo2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        bo2 bo2Var = (bo2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        bo2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        bo2 bo2Var = new bo2(continuation, this.Y);
        bo2Var.X = obj;
        return bo2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        Drawable drawable = (Drawable) this.X;
        bc7[] bc7VarArr = ChatScreen.k1;
        ChatScreen chatScreen = this.Y;
        chatScreen.getClass();
        ((View) chatScreen.d1.T0(chatScreen, ChatScreen.k1[21])).setBackground(drawable);
        return e5f.a;
    }
}
