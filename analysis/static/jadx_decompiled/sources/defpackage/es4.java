package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class es4 extends ListView {
    public final Rect a;
    public int b;
    public int c;
    public int o;
    public int s0;
    public int t0;
    public cs4 u0;
    public boolean v0;
    public final boolean w0;
    public boolean x0;
    public yl7 y0;
    public re z0;

    public es4(Context context, boolean z) {
        super(context, null, vsb.dropDownListViewStyle);
        this.a = new Rect();
        this.b = 0;
        this.c = 0;
        this.o = 0;
        this.s0 = 0;
        this.w0 = z;
        setCacheColorHint(0);
    }

    public final int a(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = adapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i5 = layoutParams.height;
            view.measure(i, i5 > 0 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i4 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                return i2;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.view.MotionEvent r17, int r18) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.es4.b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.z0 != null) {
            return;
        }
        super.drawableStateChanged();
        cs4 cs4Var = this.u0;
        if (cs4Var != null) {
            cs4Var.b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.x0 && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.w0 || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.w0 || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.w0 || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.w0 && this.v0) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.z0 = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.z0 == null) {
            re reVar = new re(17, this);
            this.z0 = reVar;
            post(reVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i < 30 || !as4.d) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            as4.a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                            as4.b.invoke(this, Integer.valueOf(iPointToPosition));
                            as4.c.invoke(this, Integer.valueOf(iPointToPosition));
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.x0 && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.t0 = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        re reVar = this.z0;
        if (reVar != null) {
            es4 es4Var = (es4) reVar.b;
            es4Var.z0 = null;
            es4Var.removeCallbacks(reVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.v0 = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        cs4 cs4Var;
        if (drawable != null) {
            cs4Var = new cs4(drawable);
            cs4Var.b = true;
        } else {
            cs4Var = null;
        }
        this.u0 = cs4Var;
        super.setSelector(cs4Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.b = rect.left;
        this.c = rect.top;
        this.o = rect.right;
        this.s0 = rect.bottom;
    }
}
