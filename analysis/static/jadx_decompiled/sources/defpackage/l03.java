package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l03 extends r85 {
    public final /* synthetic */ Chip q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l03(Chip chip, Chip chip2) {
        super(chip2);
        this.q = chip;
    }

    @Override // defpackage.r85
    public final int n(float f, float f2) {
        int i = Chip.L0;
        Chip chip = this.q;
        return (chip.e() && chip.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
    }

    @Override // defpackage.r85
    public final void o(ArrayList arrayList) {
        boolean z = false;
        arrayList.add(0);
        int i = Chip.L0;
        Chip chip = this.q;
        if (chip.e()) {
            n03 n03Var = chip.s0;
            if (n03Var != null && n03Var.W0) {
                z = true;
            }
            if (!z || chip.v0 == null) {
                return;
            }
            arrayList.add(1);
        }
    }

    @Override // defpackage.r85
    public final boolean s(int i, int i2, Bundle bundle) {
        boolean z = false;
        if (i2 == 16) {
            Chip chip = this.q;
            if (i == 0) {
                return chip.performClick();
            }
            if (i == 1) {
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.v0;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z = true;
                }
                if (chip.H0) {
                    chip.G0.x(1, 1);
                }
            }
        }
        return z;
    }

    @Override // defpackage.r85
    public final void t(l4 l4Var) {
        Chip chip = this.q;
        boolean zF = chip.f();
        AccessibilityNodeInfo accessibilityNodeInfo = l4Var.a;
        accessibilityNodeInfo.setCheckable(zF);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        l4Var.h(chip.getAccessibilityClassName());
        accessibilityNodeInfo.setText(chip.getText());
    }

    @Override // defpackage.r85
    public final void u(int i, l4 l4Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = l4Var.a;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.M0);
            return;
        }
        Chip chip = this.q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(wzb.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        l4Var.b(f4.e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }

    @Override // defpackage.r85
    public final void v(int i, boolean z) {
        if (i == 1) {
            Chip chip = this.q;
            chip.B0 = z;
            chip.refreshDrawableState();
        }
    }
}
