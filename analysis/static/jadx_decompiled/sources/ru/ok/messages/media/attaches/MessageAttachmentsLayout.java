package ru.ok.messages.media.attaches;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import defpackage.bk4;
import defpackage.cqc;
import defpackage.ed3;
import defpackage.jtb;
import defpackage.la6;
import defpackage.rz;
import defpackage.ssc;
import defpackage.ts8;
import defpackage.tu0;
import defpackage.vl;
import defpackage.xx5;
import defpackage.xxb;
import defpackage.y8a;
import defpackage.zl0;

/* loaded from: classes2.dex */
public class MessageAttachmentsLayout extends ViewGroup {
    public final ts8 a;
    public final SimpleDraweeView b;
    public final rz c;
    public final ed3 o;

    static {
        vl.o.getResources().getDimension(jtb.message_max_attach_width);
        vl.o.getResources().getDimension(jtb.message_min_attach_height);
    }

    public MessageAttachmentsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = vl.b();
        getContext();
        bk4.b();
        ((y8a) this.o).d();
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(getContext());
        this.b = simpleDraweeView;
        ((la6) simpleDraweeView.getHierarchy()).h(ssc.l);
        this.c = new rz(this.b, null);
        this.o.a(10, 2);
        tu0.K(this.b, 1000L, new xx5(15, this));
        this.b.setOnLongClickListener(new zl0(4, this));
        addView(this.b, new FrameLayout.LayoutParams(-1, -1));
        ts8 ts8Var = new ts8(getContext());
        this.a = ts8Var;
        ts8Var.setId(xxb.view_message__view_attaches);
        addView(this.a);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public ts8 getView() {
        return this.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rz rzVar = this.c;
        if (rzVar != null) {
            rzVar.i();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        rz rzVar = this.c;
        if (rzVar != null) {
            cqc.b(rzVar.t);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.a.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        this.a.measure(i, i2);
        setMeasuredDimension(this.a.getMeasuredWidth(), this.a.getMeasuredHeight());
    }
}
