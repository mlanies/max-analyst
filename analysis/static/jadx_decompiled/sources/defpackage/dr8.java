package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class dr8 extends FrameLayout implements r53 {
    public final CollapsibleActionView a;

    /* JADX WARN: Multi-variable type inference failed */
    public dr8(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // defpackage.r53
    public final void onActionViewCollapsed() {
        this.a.onActionViewCollapsed();
    }

    @Override // defpackage.r53
    public final void onActionViewExpanded() {
        this.a.onActionViewExpanded();
    }
}
