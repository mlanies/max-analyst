package defpackage;

import android.view.View;
import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* loaded from: classes.dex */
public final class mi2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMediaViewerScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.Y = chatMediaViewerScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        mi2 mi2Var = (mi2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        mi2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        mi2 mi2Var = new mi2(continuation, this.Y);
        mi2Var.X = obj;
        return mi2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        aj2 aj2Var = (aj2) this.X;
        bc7[] bc7VarArr = ChatMediaViewerScreen.K0;
        g07 g07VarA0 = this.Y.A0();
        g07VarA0.u0.setText(aj2Var.a);
        g07VarA0.v0.setText(aj2Var.b);
        CharSequence charSequence = aj2Var.c;
        int length = charSequence.length();
        je7 je7Var = g07VarA0.A0;
        je7 je7Var2 = g07VarA0.z0;
        if (length > 0) {
            br7.b(g07VarA0, (View) je7Var2.getValue(), -1);
            br7.b(g07VarA0, (View) je7Var.getValue(), -1);
            ((View) je7Var2.getValue()).setVisibility(0);
            ((View) je7Var.getValue()).setVisibility(0);
            ((TextView) je7Var2.getValue()).setText(charSequence);
        } else if (br7.H(je7Var2)) {
            ((View) je7Var2.getValue()).setVisibility(8);
            ((View) je7Var.getValue()).setVisibility(8);
            ((TextView) je7Var2.getValue()).setText((CharSequence) null);
        }
        je7 je7Var3 = g07VarA0.w0;
        if (je7Var3.a()) {
            ((w3b) je7Var3.getValue()).a(aj2Var.d);
        }
        return e5f.a;
    }
}
