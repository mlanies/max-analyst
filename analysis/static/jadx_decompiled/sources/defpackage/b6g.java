package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b6g extends yof {
    public final /* synthetic */ int a;
    public final /* synthetic */ d6g b;

    public /* synthetic */ b6g(d6g d6gVar, int i) {
        this.a = i;
        this.b = d6gVar;
    }

    @Override // defpackage.xof
    public final void c() {
        View view;
        d6g d6gVar = this.b;
        switch (this.a) {
            case 0:
                if (d6gVar.C0 && (view = d6gVar.u0) != null) {
                    view.setTranslationY(0.0f);
                    d6gVar.Z.setTranslationY(0.0f);
                }
                d6gVar.Z.setVisibility(8);
                d6gVar.Z.setTransitioning(false);
                d6gVar.G0 = null;
                i7 i7Var = d6gVar.y0;
                if (i7Var != null) {
                    i7Var.l(d6gVar.x0);
                    d6gVar.x0 = null;
                    d6gVar.y0 = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = d6gVar.Y;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = zmf.a;
                    mmf.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                d6gVar.G0 = null;
                d6gVar.Z.requestLayout();
                break;
        }
    }
}
