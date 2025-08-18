package defpackage;

import android.content.Intent;
import kotlin.coroutines.Continuation;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import org.apache.http.protocol.HTTP;

/* loaded from: classes.dex */
public final class wc1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallLinkInfoScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc1(Continuation continuation, CallLinkInfoScreen callLinkInfoScreen) {
        super(2, continuation);
        this.Y = callLinkInfoScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        wc1 wc1Var = (wc1) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        wc1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        wc1 wc1Var = new wc1(continuation, this.Y);
        wc1Var.X = obj;
        return wc1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wm9 wm9Var = (wm9) this.X;
        if (wm9Var instanceof c64) {
            z71.c.R1((c64) wm9Var);
        } else {
            boolean z = wm9Var instanceof ga1;
            CallLinkInfoScreen callLinkInfoScreen = this.Y;
            if (z) {
                b46 b46Var = CallLinkInfoScreen.B0;
                callLinkInfoScreen.m0().d(2, 1);
                z71 z71Var = z71.c;
                String string = callLinkInfoScreen.getContext().getString(t7a.q);
                String string2 = ((ga1) wm9Var).b.toString();
                String name = CallLinkInfoScreen.class.getName();
                z71Var.getClass();
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", string2);
                intent.setType(HTTP.PLAIN_TEXT_TYPE);
                z71Var.P1().b(":chats/share", dy7.g(new kpa("oneme:share:data", intent), new kpa("oneme:share:title", string), new kpa("tag", name)));
            } else if (wm9Var instanceof ha1) {
                b46 b46Var2 = CallLinkInfoScreen.B0;
                callLinkInfoScreen.m0().d(3, 1);
                String str = o37.a;
                o37.d(callLinkInfoScreen.getContext(), ((ha1) wm9Var).b, null);
            } else if (wm9Var instanceof fa1) {
                b46 b46Var3 = CallLinkInfoScreen.B0;
                callLinkInfoScreen.m0().d(1, 1);
                tpa.o(callLinkInfoScreen.getContext(), ((fa1) wm9Var).b.toString());
                if (tpa.s()) {
                    eqe eqeVar = new eqe(t7a.p);
                    int i = q7a.e;
                    wha whaVar = new wha(callLinkInfoScreen);
                    whaVar.g(eqeVar);
                    whaVar.e(new kia(i));
                    whaVar.i();
                }
            } else if (wm9Var instanceof ia1) {
                jqe jqeVar = ((ia1) wm9Var).b;
                b46 b46Var4 = CallLinkInfoScreen.B0;
                callLinkInfoScreen.getClass();
                wha whaVar2 = new wha(callLinkInfoScreen);
                whaVar2.g(jqeVar);
                whaVar2.e(lia.a);
                whaVar2.i();
            } else if (wm9Var instanceof ja1) {
                callLinkInfoScreen.getRouter().B(callLinkInfoScreen);
                z71.c.P1().b(":call-join-link?link=".concat(((ja1) wm9Var).b), null);
            }
        }
        return e5f.a;
    }
}
