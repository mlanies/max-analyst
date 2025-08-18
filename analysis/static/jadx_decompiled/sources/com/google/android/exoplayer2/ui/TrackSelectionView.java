package com.google.android.exoplayer2.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import defpackage.e0d;
import defpackage.f2c;
import defpackage.qe4;
import defpackage.sze;
import defpackage.uyb;
import defpackage.uze;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {
    public final CheckedTextView a;
    public final CheckedTextView b;
    public final SparseArray c;
    public boolean o;
    public boolean s0;
    public boolean t0;

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        this.c = new SparseArray();
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        e0d e0dVar = new e0d(14, this);
        getResources().getClass();
        sze szeVar = sze.o;
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.a = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(f2c.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(e0dVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(uyb.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.b = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(f2c.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(e0dVar);
        addView(checkedTextView2);
    }

    public final void a() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 3) {
                this.a.setEnabled(false);
                this.b.setEnabled(false);
                return;
            }
            removeViewAt(childCount);
        }
    }

    public boolean getIsDisabled() {
        return this.t0;
    }

    public List<qe4> getOverrides() {
        SparseArray sparseArray = this.c;
        ArrayList arrayList = new ArrayList(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            arrayList.add((qe4) sparseArray.valueAt(i));
        }
        return arrayList;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.o != z) {
            this.o = z;
            a();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.s0 != z) {
            this.s0 = z;
            if (!z) {
                SparseArray sparseArray = this.c;
                if (sparseArray.size() > 1) {
                    for (int size = sparseArray.size() - 1; size > 0; size--) {
                        sparseArray.remove(size);
                    }
                }
            }
            a();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.a.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(uze uzeVar) {
        uzeVar.getClass();
        a();
    }
}
