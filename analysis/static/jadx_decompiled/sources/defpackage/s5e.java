package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class s5e extends ViewGroup implements kre {
    public final v5e a;
    public final RecyclerView b;

    public s5e(Context context) {
        super(context, null);
        v5e v5eVar = new v5e(context);
        this.a = v5eVar;
        RecyclerView recyclerView = new RecyclerView(context, null);
        recyclerView.setId(tga.f);
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setOverScrollMode(2);
        int iG = tu0.G(4 * fk4.d().getDisplayMetrics().density);
        tu0.G(12 * fk4.d().getDisplayMetrics().density);
        recyclerView.j(new sc1(iG, iG, 6));
        recyclerView.setHasFixedSize(true);
        this.b = recyclerView;
        setClipChildren(false);
        addView(v5eVar);
        addView(recyclerView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        v5e v5eVar = this.a;
        int measuredWidth = v5eVar.getMeasuredWidth() + paddingStart;
        v5e v5eVar2 = this.a;
        c54.L(paddingStart, paddingTop, measuredWidth, v5eVar2.getMeasuredHeight() + paddingTop, v5eVar, this);
        RecyclerView recyclerView = this.b;
        c54.L(0, v5eVar2.getBottom(), getMeasuredWidth(), recyclerView.getMeasuredHeight() + v5eVar2.getBottom(), recyclerView, this);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        v5e v5eVar = this.a;
        v5eVar.measure(i, i2);
        RecyclerView recyclerView = this.b;
        recyclerView.measure(i, i2);
        setMeasuredDimension(size, recyclerView.getMeasuredHeight() + v5eVar.getMeasuredHeight());
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        this.a.onThemeChanged(fkaVar);
    }

    public final void setHeaderClickAction(k56 k56Var) {
        tu0.K(this.a.getHeaderButton(), 300L, new m6(27, k56Var));
    }
}
