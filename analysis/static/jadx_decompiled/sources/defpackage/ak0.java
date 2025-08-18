package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class ak0 extends r85 {
    public final ck0 q;
    public final Rect r;

    public ak0(usd usdVar) {
        super(usdVar);
        this.r = new Rect();
        this.q = usdVar;
    }

    @Override // defpackage.r85
    public final int n(float f, float f2) {
        int i = 0;
        while (true) {
            ck0 ck0Var = this.q;
            if (i >= ck0Var.getValues().size()) {
                return -1;
            }
            Rect rect = this.r;
            ck0Var.u(i, rect);
            if (rect.contains((int) f, (int) f2)) {
                return i;
            }
            i++;
        }
    }

    @Override // defpackage.r85
    public final void o(ArrayList arrayList) {
        for (int i = 0; i < this.q.getValues().size(); i++) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    @Override // defpackage.r85
    public final boolean s(int i, int i2, Bundle bundle) {
        ck0 ck0Var = this.q;
        if (!ck0Var.isEnabled()) {
            return false;
        }
        if (i2 != 4096 && i2 != 8192) {
            if (i2 != 16908349 || bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") || !ck0Var.s(i, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                return false;
            }
            ck0Var.v();
            ck0Var.postInvalidate();
            p(i);
            return true;
        }
        float fRound = ck0Var.j1;
        if (fRound == 0.0f) {
            fRound = 1.0f;
        }
        if ((ck0Var.f1 - ck0Var.e1) / fRound > 20) {
            fRound *= Math.round(r1 / r5);
        }
        if (i2 == 8192) {
            fRound = -fRound;
        }
        if (ck0Var.k()) {
            fRound = -fRound;
        }
        if (!ck0Var.s(i, z04.o(ck0Var.getValues().get(i).floatValue() + fRound, ck0Var.getValueFrom(), ck0Var.getValueTo()))) {
            return false;
        }
        ck0Var.v();
        ck0Var.postInvalidate();
        p(i);
        return true;
    }

    @Override // defpackage.r85
    public final void u(int i, l4 l4Var) {
        l4Var.b(f4.m);
        ck0 ck0Var = this.q;
        List<Float> values = ck0Var.getValues();
        Float f = values.get(i);
        float fFloatValue = f.floatValue();
        float valueFrom = ck0Var.getValueFrom();
        float valueTo = ck0Var.getValueTo();
        if (ck0Var.isEnabled()) {
            if (fFloatValue > valueFrom) {
                l4Var.a(8192);
            }
            if (fFloatValue < valueTo) {
                l4Var.a(4096);
            }
        }
        AccessibilityNodeInfo.RangeInfo rangeInfoObtain = AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, fFloatValue);
        AccessibilityNodeInfo accessibilityNodeInfo = l4Var.a;
        accessibilityNodeInfo.setRangeInfo(rangeInfoObtain);
        l4Var.h(SeekBar.class.getName());
        StringBuilder sb = new StringBuilder();
        if (ck0Var.getContentDescription() != null) {
            sb.append(ck0Var.getContentDescription());
            sb.append(",");
        }
        String str = String.format(((float) ((int) fFloatValue)) == fFloatValue ? "%.0f" : "%.2f", f);
        String string = ck0Var.getContext().getString(wzb.material_slider_value);
        if (values.size() > 1) {
            string = i == ck0Var.getValues().size() - 1 ? ck0Var.getContext().getString(wzb.material_slider_range_end) : i == 0 ? ck0Var.getContext().getString(wzb.material_slider_range_start) : "";
        }
        Locale locale = Locale.US;
        sb.append(string + ", " + str);
        accessibilityNodeInfo.setContentDescription(sb.toString());
        Rect rect = this.r;
        ck0Var.u(i, rect);
        accessibilityNodeInfo.setBoundsInParent(rect);
    }
}
