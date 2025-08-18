package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class w4c extends LinearLayout {
    public u4c a;
    public int b;
    public List c;

    private final void setDataList(List<v4c> list) {
        int size = list.size();
        int i = this.b;
        if (size <= i) {
            this.c = list;
            a();
            return;
        }
        this.c = x53.y0(list, i);
        a();
        hm9.p(w4c.class.getName(), "Buttons count out of limit. Size -> " + list.size(), null);
    }

    private final void setMaxButtonsCount(int i) {
        if (i < 1) {
            return;
        }
        this.b = i;
        requestLayout();
    }

    public final void a() {
        int iG;
        if (getChildCount() < this.c.size()) {
            int size = this.c.size() - getChildCount();
            for (int i = 0; i < size; i++) {
                t4c t4cVar = new t4c(getContext());
                t4cVar.setId(View.generateViewId());
                addView(t4cVar);
            }
        }
        int i2 = 0;
        while (true) {
            if (!(i2 < getChildCount())) {
                int i3 = 0;
                for (Object obj : this.c) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        y53.R();
                        throw null;
                    }
                    v4c v4cVar = (v4c) obj;
                    t4c t4cVar2 = (t4c) getChildAt(i3);
                    t4cVar2.setId(v4cVar.a);
                    t4cVar2.setVisibility(0);
                    s4c s4cVar = v4cVar.b;
                    t4cVar2.setSize(s4cVar);
                    t4cVar2.setEnabled(v4cVar.d);
                    t4cVar2.setText(v4cVar.c);
                    tu0.K(t4cVar2, 300L, new vu5(this, 24, v4cVar));
                    ViewGroup.LayoutParams layoutParams = t4cVar2.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (i3 != 0) {
                        int iOrdinal = s4cVar.ordinal();
                        if (iOrdinal == 0) {
                            iG = tu0.G(40 * fk4.d().getDisplayMetrics().density);
                        } else {
                            if (iOrdinal != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            iG = tu0.G(24 * fk4.d().getDisplayMetrics().density);
                        }
                        marginLayoutParams.setMarginStart(iG);
                        t4cVar2.setLayoutParams(marginLayoutParams);
                    }
                    i3 = i4;
                }
                return;
            }
            int i5 = i2 + 1;
            View childAt = getChildAt(i2);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            childAt.setVisibility(8);
            i2 = i5;
        }
    }

    public final void setButtonToolDataList(List<v4c> list) {
        setDataList(list);
    }

    public final void setListener(u4c u4cVar) {
        this.a = u4cVar;
    }
}
