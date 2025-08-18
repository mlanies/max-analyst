package ru.ok.messages.calls.views;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.htb;
import defpackage.lt3;
import defpackage.nz4;
import defpackage.oe;
import defpackage.y53;
import defpackage.z53;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ok/messages/calls/views/AnimatedCirclesView;", "Landroid/widget/FrameLayout;", "oe", "ui-utils_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class AnimatedCirclesView extends FrameLayout {
    public final List a;

    public AnimatedCirclesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = nz4.a;
        new AnimatorSet();
        List listM = y53.M(Integer.valueOf(htb.calls_circle_1), Integer.valueOf(htb.calls_circle_3), Integer.valueOf(htb.calls_circle_4), Integer.valueOf(htb.calls_circle_2));
        ArrayList arrayList = new ArrayList(z53.S(listM, 10));
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            oe oeVar = new oe(context);
            oeVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            oeVar.a.setColor(lt3.a(oeVar.getContext(), iIntValue));
            addView(oeVar);
            arrayList.add(oeVar);
        }
        this.a = arrayList;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float measuredWidth = getMeasuredWidth() * 0.1f;
        List<oe> list = this.a;
        float size = 360.0f / list.size();
        float measuredWidth2 = getMeasuredWidth() / 2.0f;
        float measuredWidth3 = getMeasuredWidth() / 2.0f;
        float f = 0.0f;
        for (oe oeVar : list) {
            f += size;
            double d = f * 0.017453292519943295d;
            PointF pointF = new PointF((((float) Math.cos(d)) * measuredWidth3 * 0.1f) + measuredWidth2, measuredWidth2 - ((((float) Math.sin(d)) * measuredWidth3) * 0.1f));
            PointF pointF2 = new PointF(((float) Math.sin(d)) * measuredWidth, ((float) Math.cos(d)) * measuredWidth);
            oeVar.setPivotX(pointF.x);
            oeVar.setPivotY(pointF.y);
            oeVar.setTranslationX(pointF2.x);
            oeVar.setTranslationY(pointF2.y);
        }
    }
}
