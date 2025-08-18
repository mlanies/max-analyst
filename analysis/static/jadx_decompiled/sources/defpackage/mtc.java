package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.appbar.MaterialToolbar;
import ru.ok.tamtam.messages.scheduled.DateTimePicker;
import ru.ok.utils.widgets.LongRoundedTitleSubtitleButton;

/* loaded from: classes2.dex */
public final class mtc extends ia5 {
    public static final /* synthetic */ bc7[] t0;
    public final k8g c = a(byb.toolbar);
    public final k8g o = a(byb.date_time_picker);
    public final k8g X = a(byb.date_picker_divider);
    public final k8g Y = a(byb.send_with_notification_checkbox);
    public final k8g Z = a(byb.send_button);
    public final k8g s0 = a(byb.set_correct_time);

    static {
        hob hobVar = new hob(mtc.class, "toolbar", "getToolbar()Lcom/google/android/material/appbar/MaterialToolbar;", 0);
        oec oecVar = nec.a;
        t0 = new bc7[]{hobVar, zr6.e(oecVar, mtc.class, "dateTimePicker", "getDateTimePicker()Lru/ok/tamtam/messages/scheduled/DateTimePicker;", 0), zr6.f(mtc.class, "datePickerDivider", "getDatePickerDivider()Landroid/view/View;", 0, oecVar), zr6.f(mtc.class, "notificationCheckbox", "getNotificationCheckbox()Landroidx/appcompat/widget/AppCompatCheckBox;", 0, oecVar), zr6.f(mtc.class, "sendButton", "getSendButton()Lru/ok/utils/widgets/LongRoundedTitleSubtitleButton;", 0, oecVar), zr6.f(mtc.class, "setCorrectTimeTextView", "getSetCorrectTimeTextView()Landroidx/appcompat/widget/AppCompatTextView;", 0, oecVar)};
    }

    public final DateTimePicker b() {
        return (DateTimePicker) this.o.T0(this, t0[1]);
    }

    public final LongRoundedTitleSubtitleButton c() {
        return (LongRoundedTitleSubtitleButton) this.Z.T0(this, t0[4]);
    }

    @Override // defpackage.wme
    public final void z(sme smeVar) {
        bc7[] bc7VarArr = t0;
        ((View) this.X.T0(this, bc7VarArr[2])).setBackgroundColor(smeVar.K);
        MaterialToolbar materialToolbar = (MaterialToolbar) this.c.T0(this, bc7VarArr[0]);
        int i = smeVar.w;
        materialToolbar.setTitleTextColor(i);
        materialToolbar.setNavigationIconTint(i);
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) this.Y.T0(this, bc7VarArr[3]);
        int i2 = smeVar.k;
        appCompatCheckBox.setHighlightColor(i2);
        appCompatCheckBox.setButtonTintList(ColorStateList.valueOf(i2));
        appCompatCheckBox.setTextColor(i);
        ngg.f(smeVar, c(), tu0.G(42 * fk4.d().getDisplayMetrics().density));
        ((AppCompatTextView) this.s0.T0(this, bc7VarArr[5])).setTextColor(smeVar.y);
    }
}
