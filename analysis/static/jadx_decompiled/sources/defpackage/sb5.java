package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;
import one.me.webview.FaqWebViewWidget;

/* loaded from: classes2.dex */
public final class sb5 extends ffe implements a66 {
    public Uri.Builder X;
    public int Y;
    public final /* synthetic */ FaqWebViewWidget Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb5(FaqWebViewWidget faqWebViewWidget, Continuation continuation) {
        super(2, continuation);
        this.Z = faqWebViewWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((sb5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new sb5(this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Uri.Builder builder;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        FaqWebViewWidget faqWebViewWidget = this.Z;
        if (i == 0) {
            od2.a0(obj);
            Uri.Builder builderBuildUpon = Uri.parse(z7.B(faqWebViewWidget.getContext(), jpc.K1)).buildUpon();
            this.X = builderBuildUpon;
            this.Y = 1;
            Object objAwaitInternal = faqWebViewWidget.Y.awaitInternal(this);
            if (objAwaitInternal == tx3Var) {
                return tx3Var;
            }
            obj = objAwaitInternal;
            builder = builderBuildUpon;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            builder = this.X;
            od2.a0(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            builder.appendQueryParameter("source", "settings");
        } else {
            builder.appendQueryParameter("source", "reg");
        }
        String string = builder.build().toString();
        bc7[] bc7VarArr = FaqWebViewWidget.Z;
        faqWebViewWidget.getClass();
        ((hla) faqWebViewWidget.a.T0(faqWebViewWidget, FaqWebViewWidget.Z[0])).loadUrl(string);
        return e5f.a;
    }
}
