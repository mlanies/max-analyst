package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import one.me.keyboardmedia.emoji.KeyboardEmojiWidget;

/* loaded from: classes2.dex */
public final class oc7 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ KeyboardEmojiWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc7(KeyboardEmojiWidget keyboardEmojiWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = keyboardEmojiWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        oc7 oc7Var = (oc7) n((yy4) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        oc7Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        oc7 oc7Var = new oc7(this.Y, continuation);
        oc7Var.X = obj;
        return oc7Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        yy4 yy4Var = (yy4) this.X;
        bc7[] bc7VarArr = KeyboardEmojiWidget.s0;
        KeyboardEmojiWidget keyboardEmojiWidget = this.Y;
        RecyclerView recyclerViewM0 = keyboardEmojiWidget.m0();
        int i = yy4Var.b;
        if (i >= 0) {
            recyclerViewM0.E0();
            GridLayoutManager gridLayoutManagerQ = z7.q(recyclerViewM0);
            if (gridLayoutManagerQ != null) {
                gridLayoutManagerQ.n1(i, 0);
            }
        }
        RecyclerView recyclerViewN0 = keyboardEmojiWidget.n0();
        int i2 = yy4Var.c;
        if (i2 >= 0) {
            recyclerViewN0.E0();
            recyclerViewN0.x0(i2);
        }
        if (yy4Var.b >= 0) {
            keyboardEmojiWidget.m0().Y();
        }
        return e5f.a;
    }
}
