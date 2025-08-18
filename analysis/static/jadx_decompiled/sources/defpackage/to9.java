package defpackage;

import android.net.Uri;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class to9 extends hqd {
    @Override // defpackage.hqd
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final void A(qo9 qo9Var) {
        OneMeDraweeView oneMeDraweeView = (OneMeDraweeView) this.a;
        oneMeDraweeView.setId(Long.hashCode(qo9Var.a));
        xv6 xv6VarD = xv6.d(Uri.parse(qo9Var.b));
        float f = 64;
        xv6VarD.d = new jic(0.0f, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density), 12);
        wv6 wv6VarA = xv6VarD.a();
        int i = OneMeDraweeView.B0;
        oneMeDraweeView.o(wv6VarA, null);
    }
}
