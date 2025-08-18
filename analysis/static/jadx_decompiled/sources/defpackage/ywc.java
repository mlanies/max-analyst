package defpackage;

import android.graphics.Rect;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

/* loaded from: classes2.dex */
public final class ywc extends v3c {
    public final RecyclerView d;

    public ywc(RecyclerView recyclerView) {
        this.d = recyclerView;
    }

    @Override // defpackage.v3c
    public final void l(Rect rect, Rect rect2) {
        if (rect.height() > rect2.height()) {
            return;
        }
        int i = rect.top;
        int i2 = rect2.top;
        boolean z = false;
        RecyclerView recyclerView = this.d;
        if (i < i2) {
            int i3 = i - i2;
            int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int i4 = iComputeVerticalScrollOffset + i3;
            if (iComputeVerticalScrollOffset > 0) {
                recyclerView.scrollBy(0, i3);
            }
            if (i4 < 0) {
                recyclerView.c0(Math.abs(i4));
                recyclerView.Y();
            }
            rect.offset(0, -i3);
            return;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 > i6) {
            int i7 = i5 - i6;
            int iComputeVerticalScrollRange = recyclerView.computeVerticalScrollRange() - (recyclerView.computeVerticalScrollExtent() + recyclerView.computeVerticalScrollOffset());
            if (iComputeVerticalScrollRange < 0) {
                iComputeVerticalScrollRange = 0;
            }
            if (iComputeVerticalScrollRange > 0) {
                recyclerView.scrollBy(0, i7);
            }
            int i8 = iComputeVerticalScrollRange - i7;
            a layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            hdc adapter = recyclerView.getAdapter();
            int iJ = (adapter != null ? adapter.j() : 1) - 1;
            boolean z2 = linearLayoutManager != null && linearLayoutManager.T0() == 0;
            if (linearLayoutManager != null && linearLayoutManager.X0() == iJ) {
                z = true;
            }
            if (z2 && z) {
                recyclerView.c0(-i7);
            } else if (i8 < 0) {
                recyclerView.c0(i8);
            }
        }
    }
}
