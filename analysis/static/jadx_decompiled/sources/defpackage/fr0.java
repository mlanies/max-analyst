package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* loaded from: classes.dex */
public final class fr0 extends a4 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fr0(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    @Override // defpackage.a4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
        /*
            r1 = this;
            int r0 = r1.d
            switch(r0) {
                case 1: goto L47;
                case 5: goto L9;
                default: goto L5;
            }
        L5:
            super.c(r2, r3)
            return
        L9:
            super.c(r2, r3)
            java.lang.Class<androidx.viewpager.widget.ViewPager> r2 = androidx.viewpager.widget.ViewPager.class
            java.lang.String r2 = r2.getName()
            r3.setClassName(r2)
            java.lang.Object r1 = r1.e
            androidx.viewpager.widget.ViewPager r1 = (androidx.viewpager.widget.ViewPager) r1
            hpa r2 = r1.s0
            if (r2 == 0) goto L25
            int r2 = r2.b()
            r0 = 1
            if (r2 <= r0) goto L25
            goto L26
        L25:
            r0 = 0
        L26:
            r3.setScrollable(r0)
            int r2 = r3.getEventType()
            r0 = 4096(0x1000, float:5.74E-42)
            if (r2 != r0) goto L46
            hpa r2 = r1.s0
            if (r2 == 0) goto L46
            int r2 = r2.b()
            r3.setItemCount(r2)
            int r2 = r1.t0
            r3.setFromIndex(r2)
            int r1 = r1.t0
            r3.setToIndex(r1)
        L46:
            return
        L47:
            super.c(r2, r3)
            java.lang.Object r1 = r1.e
            com.google.android.material.internal.CheckableImageButton r1 = (com.google.android.material.internal.CheckableImageButton) r1
            boolean r1 = r1.o
            r3.setChecked(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fr0.c(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    @Override // defpackage.a4
    public final void d(View view, l4 l4Var) {
        int i = -1;
        boolean z = false;
        Object obj = this.e;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        switch (this.d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = l4Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                if (!((ir0) obj).v0) {
                    accessibilityNodeInfo.setDismissable(false);
                    break;
                } else {
                    l4Var.a(1048576);
                    accessibilityNodeInfo.setDismissable(true);
                    break;
                }
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = l4Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo2.setCheckable(checkableImageButton.s0);
                accessibilityNodeInfo2.setChecked(checkableImageButton.o);
                break;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, l4Var.a);
                int i2 = MaterialButtonToggleGroup.y0;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                materialButtonToggleGroup.getClass();
                if (view instanceof MaterialButton) {
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        if (i3 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i3) == view) {
                                i = i4;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i3) instanceof MaterialButton) && materialButtonToggleGroup.c(i3)) {
                                    i4++;
                                }
                                i3++;
                            }
                        }
                    }
                }
                l4Var.i(k4.a(((MaterialButton) view).C0, 0, 1, i, 1));
                break;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo3 = l4Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                MaterialCalendar materialCalendar = (MaterialCalendar) obj;
                accessibilityNodeInfo3.setHintText(materialCalendar.w1.getVisibility() == 0 ? materialCalendar.h0(wzb.mtrl_picker_toggle_to_year_selection) : materialCalendar.h0(wzb.mtrl_picker_toggle_to_day_selection));
                break;
            case 4:
                AccessibilityNodeInfo accessibilityNodeInfo4 = l4Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                accessibilityNodeInfo4.setCheckable(((NavigationMenuItemView) obj).w0);
                break;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, l4Var.a);
                l4Var.h(ViewPager.class.getName());
                ViewPager viewPager = (ViewPager) obj;
                hpa hpaVar = viewPager.s0;
                if (hpaVar != null && hpaVar.b() > 1) {
                    z = true;
                }
                l4Var.j(z);
                if (viewPager.canScrollHorizontally(1)) {
                    l4Var.a(4096);
                }
                if (viewPager.canScrollHorizontally(-1)) {
                    l4Var.a(8192);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.a4
    public boolean g(View view, int i, Bundle bundle) {
        switch (this.d) {
            case 0:
                if (i == 1048576) {
                    ir0 ir0Var = (ir0) this.e;
                    if (ir0Var.v0) {
                        ir0Var.cancel();
                        return true;
                    }
                }
                return super.g(view, i, bundle);
            case 5:
                if (super.g(view, i, bundle)) {
                    return true;
                }
                ViewPager viewPager = (ViewPager) this.e;
                if (i != 4096) {
                    if (i == 8192 && viewPager.canScrollHorizontally(-1)) {
                        viewPager.setCurrentItem(viewPager.t0 - 1);
                        return true;
                    }
                } else if (viewPager.canScrollHorizontally(1)) {
                    viewPager.setCurrentItem(viewPager.t0 + 1);
                    return true;
                }
                return false;
            default:
                return super.g(view, i, bundle);
        }
    }
}
