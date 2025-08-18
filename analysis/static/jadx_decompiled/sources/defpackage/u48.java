package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.drawee.view.SimpleDraweeView;

/* loaded from: classes2.dex */
public final class u48 extends dec implements qq7 {
    public final tg F0;
    public final t48 G0;
    public final o20 H0;
    public final boolean I0;
    public final jic J0;
    public final cq7 K0;
    public r4d L0;
    public final SimpleDraweeView M0;
    public final ProgressBar N0;
    public final View O0;
    public boolean P0;
    public dq7 Q0;

    public u48(View view, tg tgVar, t48 t48Var, o20 o20Var, boolean z, jic jicVar, cq7 cq7Var) {
        sme smeVarR;
        super(view);
        this.F0 = tgVar;
        this.G0 = t48Var;
        this.H0 = o20Var;
        this.I0 = z;
        this.J0 = jicVar;
        this.K0 = cq7Var;
        this.M0 = (SimpleDraweeView) view.findViewById(xxb.row_media_bar_selected__drawee);
        ProgressBar progressBar = (ProgressBar) view.findViewById(xxb.row_media_bar_selected__progress_bar);
        this.N0 = progressBar;
        this.O0 = view.findViewById(xxb.row_media_bar_selected__progress_background);
        tu0.K(view, 300L, new xx5(11, this));
        if (view.isInEditMode()) {
            smeVarR = ee4.e0;
        } else {
            Context context = view.getContext();
            khe kheVar = sme.a0;
            smeVarR = fm9.R(context);
        }
        view.setBackgroundColor(smeVarR.m);
        ngg.H(progressBar, lt3.a(view.getContext(), epc.f));
    }

    @Override // defpackage.qq7
    public final void C(boolean z) {
        this.N0.setVisibility(z ? 0 : 8);
        this.O0.setVisibility(z ? 0 : 8);
    }

    @Override // defpackage.qq7
    public final void N(up7 up7Var, Uri uri, int i, Uri uri2) {
        up7 up7Var2;
        r4d r4dVar = this.L0;
        if (r4dVar == null || (up7Var2 = r4dVar.a) == null || up7Var.b != up7Var2.b) {
            return;
        }
        SimpleDraweeView simpleDraweeView = this.M0;
        if (uri == null) {
            simpleDraweeView.setController(null);
            return;
        }
        xv6 xv6VarD = xv6.d(uri);
        if (uri2 != null) {
            xv6VarD.l = new doa(uri2);
        }
        xv6VarD.d = this.J0;
        if (i != 0) {
            xv6VarD.l = new bwa(i, 0);
        }
        e2b e2bVar = s36.a.get();
        e2bVar.e = xv6VarD.a();
        e2bVar.l = simpleDraweeView.getController();
        simpleDraweeView.setController(e2bVar.a());
    }
}
