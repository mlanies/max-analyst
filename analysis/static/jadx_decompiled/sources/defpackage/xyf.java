package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* loaded from: classes2.dex */
public final class xyf extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ WebAppRootScreen Z;
    public final /* synthetic */ c1g s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xyf(String str, WebAppRootScreen webAppRootScreen, c1g c1gVar, Continuation continuation) {
        super(2, continuation);
        this.Y = str;
        this.Z = webAppRootScreen;
        this.s0 = c1gVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        xyf xyfVar = (xyf) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        xyfVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        xyf xyfVar = new xyf(this.Y, this.Z, this.s0, continuation);
        xyfVar.X = obj;
        return xyfVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object njcVar;
        od2.a0(obj);
        sx3 sx3Var = (sx3) this.X;
        WebAppRootScreen webAppRootScreen = this.Z;
        String str = this.Y;
        if (str == null) {
            Context context = webAppRootScreen.getContext();
            qyc qycVar = (qyc) ((y7d) jwf.a.getAccessor().c(y7d.class));
            String string = qycVar.g.getString("invite-long", null);
            str = string != null ? string : String.format(context.getString(dpc.C), Arrays.copyOf(new Object[]{qycVar.p()}, 1));
        }
        e5f e5fVar = e5f.a;
        c1g c1gVar = this.s0;
        try {
            if (c1gVar == null) {
                String str2 = o37.a;
                o37.d(webAppRootScreen.getContext(), str, null);
            } else {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", (CharSequence) str);
                WebAppRootScreen.x0(webAppRootScreen, intent, c1gVar);
                String str3 = o37.a;
                Intent intentA = o37.a(webAppRootScreen.getContext(), intent);
                if (intentA != null) {
                    intent = intentA;
                }
                webAppRootScreen.getContext().startActivity(intent);
            }
            njcVar = e5fVar;
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        if (!(njcVar instanceof njc)) {
            bc7[] bc7VarArr = WebAppRootScreen.G0;
            webAppRootScreen.A0().evaluateJavascript("window.navigator.__share__receive()", new ila(1));
        }
        Throwable thA = pjc.a(njcVar);
        if (thA != null) {
            sx3Var.getClass();
            thA.toString();
            bc7[] bc7VarArr2 = WebAppRootScreen.G0;
            webAppRootScreen.A0().evaluateJavascript("window.navigator.__share__receive(abort)", new ila(1));
        }
        return e5fVar;
    }
}
