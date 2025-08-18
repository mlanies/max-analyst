package com.futuremind.recyclerviewfastscroll;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a3c;
import defpackage.aq4;
import defpackage.gxc;
import defpackage.kt3;
import defpackage.ld4;
import defpackage.qw3;
import defpackage.r15;
import defpackage.ttb;
import defpackage.usb;
import defpackage.wyb;
import defpackage.yb5;
import defpackage.zub;

/* loaded from: classes.dex */
public class FastScroller extends LinearLayout {
    public static final /* synthetic */ int B0 = 0;
    public gxc A0;
    public final r15 a;
    public RecyclerView b;
    public View c;
    public View o;
    public TextView s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public int y0;
    public boolean z0;

    public FastScroller(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = new r15(this);
        setClipChildren(false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a3c.fastscroll__fastScroller, usb.fastscroll__style, 0);
        try {
            this.v0 = typedArrayObtainStyledAttributes.getColor(a3c.fastscroll__fastScroller_fastscroll__bubbleColor, -1);
            this.u0 = typedArrayObtainStyledAttributes.getColor(a3c.fastscroll__fastScroller_fastscroll__handleColor, -1);
            this.w0 = typedArrayObtainStyledAttributes.getResourceId(a3c.fastscroll__fastScroller_fastscroll__bubbleTextAppearance, -1);
            typedArrayObtainStyledAttributes.recycle();
            this.y0 = getVisibility();
            setViewProvider(new ld4());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecyclerViewPosition(float f) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            return;
        }
        int iJ = recyclerView.getAdapter().j();
        this.b.x0((int) Math.min(Math.max(0.0f, (int) (f * iJ)), iJ - 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r3 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            hdc r0 = r0.getAdapter()
            if (r0 == 0) goto L68
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            hdc r0 = r0.getAdapter()
            int r0 = r0.j()
            if (r0 == 0) goto L68
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            r1 = 0
            android.view.View r0 = r0.getChildAt(r1)
            if (r0 == 0) goto L68
            boolean r0 = r3.c()
            if (r0 == 0) goto L41
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            android.view.View r0 = r0.getChildAt(r1)
            int r0 = r0.getHeight()
            androidx.recyclerview.widget.RecyclerView r2 = r3.b
            hdc r2 = r2.getAdapter()
            int r2 = r2.j()
            int r2 = r2 * r0
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            int r0 = r0.getHeight()
            if (r2 > r0) goto L5f
            goto L68
        L41:
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            android.view.View r0 = r0.getChildAt(r1)
            int r0 = r0.getWidth()
            androidx.recyclerview.widget.RecyclerView r2 = r3.b
            hdc r2 = r2.getAdapter()
            int r2 = r2.j()
            int r2 = r2 * r0
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            int r0 = r0.getWidth()
            if (r2 > r0) goto L5f
            goto L68
        L5f:
            int r0 = r3.y0
            if (r0 == 0) goto L64
            goto L68
        L64:
            super.setVisibility(r1)
            goto L6c
        L68:
            r0 = 4
            super.setVisibility(r0)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.futuremind.recyclerviewfastscroll.FastScroller.b():void");
    }

    public final boolean c() {
        return this.x0 == 1;
    }

    public gxc getViewProvider() {
        return this.A0;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float width;
        int width2;
        View view;
        Drawable background;
        TextView textView;
        Drawable background2;
        super.onLayout(z, i, i2, i3, i4);
        this.o.setOnTouchListener(new yb5(0, this));
        ld4 ld4Var = (ld4) this.A0;
        if (ld4Var.a.c()) {
            width = ld4Var.d.getHeight() / 2.0f;
            width2 = ld4Var.c.getHeight();
        } else {
            width = ld4Var.d.getWidth() / 2.0f;
            width2 = ld4Var.c.getWidth();
        }
        this.t0 = (int) (width - width2);
        int i5 = this.v0;
        if (i5 != -1 && (background2 = (textView = this.s0).getBackground()) != null) {
            aq4.g(background2.mutate(), i5);
            textView.setBackground(background2);
        }
        int i6 = this.u0;
        if (i6 != -1 && (background = (view = this.o).getBackground()) != null) {
            aq4.g(background.mutate(), i6);
            view.setBackground(background);
        }
        int i7 = this.w0;
        if (i7 != -1) {
            this.s0.setTextAppearance(i7);
        }
        if (isInEditMode()) {
            return;
        }
        this.a.c(this.b);
    }

    public void setBubbleColor(int i) {
        this.v0 = i;
        invalidate();
    }

    public void setBubbleTextAppearance(int i) {
        this.w0 = i;
        invalidate();
    }

    public void setHandleColor(int i) {
        this.u0 = i;
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        this.x0 = i;
        super.setOrientation(i == 0 ? 1 : 0);
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.b = recyclerView;
        recyclerView.getAdapter();
        recyclerView.m(this.a);
        b();
        recyclerView.setOnHierarchyChangeListener(new qw3(1, this));
    }

    public void setScrollerPosition(float f) {
        if (c()) {
            this.c.setY(Math.min(Math.max(0.0f, ((getHeight() - this.o.getHeight()) * f) + this.t0), getHeight() - this.c.getHeight()));
            this.o.setY(Math.min(Math.max(0.0f, f * (getHeight() - this.o.getHeight())), getHeight() - this.o.getHeight()));
            return;
        }
        this.c.setX(Math.min(Math.max(0.0f, ((getWidth() - this.o.getWidth()) * f) + this.t0), getWidth() - this.c.getWidth()));
        this.o.setX(Math.min(Math.max(0.0f, f * (getWidth() - this.o.getWidth())), getWidth() - this.o.getWidth()));
    }

    public void setViewProvider(gxc gxcVar) {
        removeAllViews();
        this.A0 = gxcVar;
        gxcVar.a = this;
        ld4 ld4Var = (ld4) gxcVar;
        View viewInflate = LayoutInflater.from(ld4Var.a.getContext()).inflate(wyb.fastscroll__default_bubble, (ViewGroup) this, false);
        ld4Var.c = viewInflate;
        this.c = viewInflate;
        ld4Var.d = new View(ld4Var.a.getContext());
        int dimensionPixelSize = ld4Var.a.c() ? 0 : ld4Var.a.getContext().getResources().getDimensionPixelSize(ttb.fastscroll__handle_inset);
        int dimensionPixelSize2 = ld4Var.a.c() ? ld4Var.a.getContext().getResources().getDimensionPixelSize(ttb.fastscroll__handle_inset) : 0;
        ld4Var.d.setBackground(new InsetDrawable(kt3.b(ld4Var.a.getContext(), zub.fastscroll__default_handle), dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize));
        ld4Var.d.setLayoutParams(new ViewGroup.LayoutParams(ld4Var.a.getContext().getResources().getDimensionPixelSize(ld4Var.a.c() ? ttb.fastscroll__handle_clickable_width : ttb.fastscroll__handle_height), ld4Var.a.getContext().getResources().getDimensionPixelSize(ld4Var.a.c() ? ttb.fastscroll__handle_height : ttb.fastscroll__handle_clickable_width)));
        this.o = ld4Var.d;
        this.s0 = (TextView) ld4Var.c;
        addView(this.c);
        addView(this.o);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        this.y0 = i;
        b();
    }
}
