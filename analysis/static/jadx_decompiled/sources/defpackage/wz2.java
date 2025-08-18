package defpackage;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import ru.ok.messages.settings.FrgBaseSettings;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;

/* loaded from: classes2.dex */
public final /* synthetic */ class wz2 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wz2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.a) {
            case 0:
                xz2 xz2Var = (xz2) this.b;
                FrgBaseSettings frgBaseSettings = xz2Var.N0;
                if (frgBaseSettings != null) {
                    frgBaseSettings.u1(xz2Var.M0.a, Boolean.valueOf(z));
                    break;
                }
                break;
            case 1:
                Chip chip = (Chip) this.b;
                m18 m18Var = chip.x0;
                if (m18Var != null) {
                    ana anaVar = (ana) ((o9g) m18Var).b;
                    if (!z ? anaVar.n(chip, anaVar.b) : anaVar.f(chip)) {
                        anaVar.m();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.w0;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                    break;
                }
                break;
            case 2:
                we7 we7Var = (we7) this.b;
                FrgBaseSettings frgBaseSettings2 = we7Var.G0;
                if (frgBaseSettings2 != null) {
                    frgBaseSettings2.u1(we7Var.L0.a, Integer.valueOf(z ? ((y8a) vl.b()).n().c.v() : 0));
                    break;
                }
                break;
            case 3:
                ScheduledSendPickerViewModel scheduledSendPickerViewModelN1 = ((ScheduledSendPickerDialogFragment) this.b).n1();
                scheduledSendPickerViewModelN1.o.o1(scheduledSendPickerViewModelN1, ScheduledSendPickerViewModel.p[0], Boolean.valueOf(z));
                break;
            default:
                if (z) {
                    ((ufd) this.b).callOnClick();
                    break;
                }
                break;
        }
    }
}
