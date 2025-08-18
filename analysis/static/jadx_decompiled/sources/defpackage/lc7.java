package defpackage;

import kotlin.coroutines.Continuation;
import one.me.keyboardmedia.emoji.KeyboardEmojiWidget;

/* loaded from: classes2.dex */
public final class lc7 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ KeyboardEmojiWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc7(KeyboardEmojiWidget keyboardEmojiWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = keyboardEmojiWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        lc7 lc7Var = (lc7) n((xy4) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        lc7Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        lc7 lc7Var = new lc7(this.Y, continuation);
        lc7Var.X = obj;
        return lc7Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        xy4 xy4Var = (xy4) this.X;
        KeyboardEmojiWidget keyboardEmojiWidget = this.Y;
        keyboardEmojiWidget.Y.E(xy4Var.a);
        keyboardEmojiWidget.X.E(xy4Var.b);
        return e5f.a;
    }
}
