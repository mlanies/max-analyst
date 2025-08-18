package one.me.sdk.gallery.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import defpackage.ah2;
import defpackage.fk4;
import defpackage.tu0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\bB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lone/me/sdk/gallery/view/ChatMediaRowLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lah2;", "listener", "Le5f;", "setListener", "(Lah2;)V", "media-gallery-widget_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class ChatMediaRowLayout extends FrameLayout {
    public ChatMediaRowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        WindowInsets rootWindowInsets;
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getRootView().getMeasuredWidth();
        View rootView = getRootView();
        Rect rect = null;
        if (rootView != null && (rootWindowInsets = rootView.getRootWindowInsets()) != null) {
            rect = new Rect(rootWindowInsets.getStableInsetLeft(), rootWindowInsets.getStableInsetTop(), rootWindowInsets.getStableInsetRight(), rootWindowInsets.getStableInsetBottom());
        }
        if (rect != null) {
            measuredWidth -= rect.left + rect.right;
        }
        int iG = (measuredWidth - (tu0.G(3 * fk4.d().getDisplayMetrics().density) * 2)) / 3;
        if (iG < size) {
            i = View.MeasureSpec.makeMeasureSpec(iG, 1073741824);
        }
        super.onMeasure(i, i);
    }

    public final void setListener(ah2 listener) {
    }
}
