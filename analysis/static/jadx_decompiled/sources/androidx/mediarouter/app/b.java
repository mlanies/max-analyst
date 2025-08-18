package androidx.mediarouter.app;

import android.view.animation.Animation;
import defpackage.coa;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b implements Animation.AnimationListener {
    public final /* synthetic */ d a;

    public b(d dVar) {
        this.a = dVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        d dVar = this.a;
        OverlayListView overlayListView = dVar.O0;
        Iterator it = overlayListView.a.iterator();
        while (it.hasNext()) {
            coa coaVar = (coa) it.next();
            if (!coaVar.k) {
                coaVar.j = overlayListView.getDrawingTime();
                coaVar.k = true;
            }
        }
        dVar.O0.postDelayed(dVar.y1, dVar.r1);
    }
}
