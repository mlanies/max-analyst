package one.me.sdk.lists.widgets;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.a;
import defpackage.hdc;
import defpackage.hm9;
import defpackage.hy4;
import defpackage.je7;
import defpackage.pec;
import defpackage.t15;
import defpackage.tdc;
import defpackage.tu0;
import defpackage.u15;
import defpackage.v15;
import defpackage.x15;
import defpackage.y15;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u00070J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010 \u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\u0011R\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010*R\u0011\u0010/\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", "Lone/me/sdk/lists/widgets/EmptyRecyclerView;", "Lpec;", "delegate", "Le5f;", "setRefreshingNextDelegate", "(Lpec;)V", "Lv15;", "setDelegate", "(Lv15;)V", "Landroidx/recyclerview/widget/a;", "layout", "setLayoutManager", "(Landroidx/recyclerview/widget/a;)V", "", "value", "setRefreshingNext", "(Z)V", "setRefreshingPrev", "Lt15;", "pager", "setPager", "(Lt15;)V", "", "threshold", "setThreshold", "(I)V", "d2", "Z", "getIgnoreRefreshingFlagsForScrollEvent", "()Z", "setIgnoreRefreshingFlagsForScrollEvent", "ignoreRefreshingFlagsForScrollEvent", "", "g2", "Lje7;", "getFrameIntervalNanos", "()J", "frameIntervalNanos", "", "h2", "getTag", "()Ljava/lang/String;", "tag", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLinearLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "linearLayoutManager", "x15", "lists_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class EndlessRecyclerView2 extends EmptyRecyclerView {
    public static final /* synthetic */ int i2 = 0;
    public x15 Z1;
    public int a2;
    public boolean b2;
    public boolean c2;

    /* renamed from: d2, reason: from kotlin metadata */
    public boolean ignoreRefreshingFlagsForScrollEvent;
    public v15 e2;
    public final y15 f2;

    /* renamed from: g2, reason: from kotlin metadata */
    public final je7 frameIntervalNanos;

    /* renamed from: h2, reason: from kotlin metadata */
    public final je7 tag;

    public EndlessRecyclerView2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final long getFrameIntervalNanos() {
        return ((Number) this.frameIntervalNanos.getValue()).longValue();
    }

    private final String getTag() {
        return (String) this.tag.getValue();
    }

    @Override // one.me.sdk.lists.widgets.EmptyRecyclerView
    public final void G0(hdc hdcVar) {
        if (hdcVar != null) {
            EmptyRecyclerView.K0(hdcVar, this.f2);
        }
    }

    @Override // one.me.sdk.lists.widgets.EmptyRecyclerView
    public final void H0(hdc hdcVar) {
        if (hdcVar != null) {
            EmptyRecyclerView.K0(hdcVar, this.f2);
        }
    }

    @Override // one.me.sdk.lists.widgets.EmptyRecyclerView
    public final void I0() {
        hdc adapter = getAdapter();
        if (adapter != null) {
            EmptyRecyclerView.L0(adapter, this.f2);
        }
    }

    @Override // one.me.sdk.lists.widgets.EmptyRecyclerView
    public final void J0() {
        hdc adapter = getAdapter();
        if (adapter != null) {
            EmptyRecyclerView.L0(adapter, this.f2);
        }
    }

    public final boolean O0() {
        return getChildCount() != 0 && getChildAt(0).getTop() <= getTop() && getChildAt(getChildCount() - 1).getBottom() >= getBottom();
    }

    public final boolean getIgnoreRefreshingFlagsForScrollEvent() {
        return this.ignoreRefreshingFlagsForScrollEvent;
    }

    public final LinearLayoutManager getLinearLayoutManager() {
        return (LinearLayoutManager) getLayoutManager();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i3, int i4, int i5) {
        try {
            super.onLayout(z, i, i3, i4, i5);
        } catch (Exception e) {
            hm9.p("EndlessRecyclerView2", "onLayout", e);
        }
        x15 x15Var = this.Z1;
        if (x15Var != null) {
            x15Var.b(this, 0, 0);
        }
    }

    public final void setDelegate(v15 delegate) {
        this.e2 = delegate;
    }

    public final void setIgnoreRefreshingFlagsForScrollEvent(boolean z) {
        this.ignoreRefreshingFlagsForScrollEvent = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(a layout) {
        if (!(layout instanceof LinearLayoutManager)) {
            throw new IllegalArgumentException("layout manager must be an instance of LinearLayoutManager or StaggeredGridLayoutManager");
        }
        super.setLayoutManager(layout);
    }

    public final void setPager(t15 pager) {
        if (pager == null) {
            tdc tdcVar = this.Z1;
            if (tdcVar != null) {
                s0(tdcVar);
                this.Z1 = null;
                return;
            }
            return;
        }
        x15 x15Var = new x15(this, pager);
        int i = this.a2;
        if (i > 0) {
            x15Var.b = i;
        }
        m(x15Var);
        this.Z1 = x15Var;
    }

    public final void setRefreshingNext(boolean value) {
        if (this.b2 == value) {
            return;
        }
        if (value) {
            v15 v15Var = this.e2;
            if (v15Var != null) {
                v15Var.e();
            }
        } else {
            v15 v15Var2 = this.e2;
            if (v15Var2 != null) {
                v15Var2.g();
            }
        }
        this.b2 = value;
    }

    public final void setRefreshingNextDelegate(pec delegate) {
    }

    public final void setRefreshingPrev(boolean value) {
        if (this.c2 == value) {
            return;
        }
        this.c2 = value;
    }

    public final void setThreshold(int threshold) {
        this.a2 = threshold;
        x15 x15Var = this.Z1;
        if (x15Var == null || threshold <= 0) {
            return;
        }
        x15Var.b = threshold;
    }

    public EndlessRecyclerView2(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.a2 = 1;
        this.f2 = new y15(this);
        this.frameIntervalNanos = tu0.r(3, new hy4(context, 2));
        this.tag = tu0.r(3, new u15(this, 0));
    }
}
