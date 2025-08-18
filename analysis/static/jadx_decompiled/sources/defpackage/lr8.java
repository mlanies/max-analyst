package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* loaded from: classes.dex */
public final class lr8 extends es4 {
    public final int A0;
    public final int B0;
    public ar8 C0;
    public br8 D0;

    public lr8(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.A0 = 21;
            this.B0 = 22;
        } else {
            this.A0 = 22;
            this.B0 = 21;
        }
    }

    @Override // defpackage.es4, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        tq8 tq8Var;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.C0 != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                tq8Var = (tq8) headerViewListAdapter.getWrappedAdapter();
            } else {
                tq8Var = (tq8) adapter;
                headersCount = 0;
            }
            br8 br8VarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= tq8Var.getCount()) ? null : tq8Var.getItem(i);
            br8 br8Var = this.D0;
            if (br8Var != br8VarB) {
                wq8 wq8Var = tq8Var.a;
                if (br8Var != null) {
                    this.C0.h(wq8Var, br8Var);
                }
                this.D0 = br8VarB;
                if (br8VarB != null) {
                    this.C0.k(wq8Var, br8VarB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.A0) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.B0) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (tq8) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (tq8) adapter).a.c(false);
        return true;
    }

    public void setHoverListener(ar8 ar8Var) {
        this.C0 = ar8Var;
    }

    @Override // defpackage.es4, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
