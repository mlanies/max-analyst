package defpackage;

import android.net.Uri;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class e4d extends hqd {
    public static final /* synthetic */ int J0 = 0;
    public final bqc F0;
    public final OneMeDraweeView G0;
    public final AppCompatTextView H0;
    public c86 I0;

    public e4d(bqc bqcVar, OneMeDraweeView oneMeDraweeView, AppCompatTextView appCompatTextView, LinearLayout linearLayout) {
        super(linearLayout);
        this.F0 = bqcVar;
        this.G0 = oneMeDraweeView;
        this.H0 = appCompatTextView;
        tu0.K(linearLayout, 300L, new elb(2, this));
    }

    @Override // defpackage.hqd
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final void A(c86 c86Var) throws NumberFormatException {
        String string;
        this.I0 = c86Var;
        n3 n3VarC = c86Var.a.a.c();
        boolean z = n3VarC instanceof q76;
        AppCompatTextView appCompatTextView = this.H0;
        if (z) {
            string = appCompatTextView.getContext().getString(((q76) n3VarC).a);
        } else {
            if (!(n3VarC instanceof r76)) {
                throw new NoWhenBranchMatchedException();
            }
            string = ((r76) n3VarC).a;
        }
        appCompatTextView.setText(string);
        v3c.y(new m1d(c86Var, this, (Continuation) null), appCompatTextView);
        OneMeDraweeView oneMeDraweeView = this.G0;
        Uri uri = c86Var.b;
        if (uri == null) {
            int i = OneMeDraweeView.B0;
            oneMeDraweeView.o(null, null);
            return;
        }
        xv6 xv6VarD = xv6.d(uri);
        xv6VarD.i = true;
        wv6 wv6VarA = xv6VarD.a();
        int i2 = OneMeDraweeView.B0;
        oneMeDraweeView.o(wv6VarA, null);
    }
}
