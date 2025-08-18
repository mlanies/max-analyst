package defpackage;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class tv5 implements sdc {
    @Override // defpackage.sdc
    public final void a(MotionEvent motionEvent) {
    }

    @Override // defpackage.sdc
    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 2) {
            return false;
        }
        recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }

    @Override // defpackage.sdc
    public final void e(boolean z) {
    }
}
