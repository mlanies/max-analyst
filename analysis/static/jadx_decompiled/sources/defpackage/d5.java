package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Collections;
import ru.ok.messages.media.attaches.ActAttachesView;

/* loaded from: classes2.dex */
public final /* synthetic */ class d5 implements qj3, y2a {
    public final /* synthetic */ ActAttachesView a;

    public /* synthetic */ d5(ActAttachesView actAttachesView) {
        this.a = actAttachesView;
    }

    @Override // defpackage.y2a
    public x6g P(View view, x6g x6gVar) {
        ActAttachesView actAttachesView = this.a;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) actAttachesView.X0.getLayoutParams();
        layoutParams.bottomMargin = x6gVar.a();
        actAttachesView.X0.setLayoutParams(layoutParams);
        actAttachesView.X0.setPadding(x6gVar.b(), actAttachesView.X0.getPaddingTop(), x6gVar.c(), actAttachesView.X0.getPaddingBottom());
        FrameLayout frameLayout = actAttachesView.n1;
        int iD = x6gVar.d();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        if (marginLayoutParams.topMargin != iD) {
            marginLayoutParams.topMargin = iD;
            frameLayout.setLayoutParams(marginLayoutParams);
        }
        j47.U(actAttachesView.n1, x6gVar.c());
        return x6gVar;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        ActAttachesView actAttachesView = this.a;
        s20 s20Var = actAttachesView.W0;
        s20Var.k.clear();
        s20Var.j.clear();
        actAttachesView.W0.j(Collections.singletonList((es8) obj), true);
        actAttachesView.q0(0);
    }
}
