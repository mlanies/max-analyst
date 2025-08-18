package defpackage;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.b;
import java.util.List;
import ru.ok.messages.settings.FrgBaseSettings;

/* loaded from: classes2.dex */
public final class eed extends hdc {
    public final LayoutInflater X;
    public final FrgBaseSettings Y;
    public final List o;

    public eed(b bVar, List list, FrgBaseSettings frgBaseSettings) {
        this.o = list;
        this.X = LayoutInflater.from(bVar);
        this.Y = frgBaseSettings;
    }

    @Override // defpackage.hdc
    public final int j() {
        return this.o.size();
    }

    @Override // defpackage.hdc
    public final int l(int i) {
        return ((gcd) this.o.get(i)).Y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hdc
    public final void r(dec decVar, int i) throws Resources.NotFoundException {
        int i2 = decVar.Y;
        List list = this.o;
        if (i2 != 4) {
            if (i2 != 9) {
                ((jcd) decVar).A((gcd) list.get(i), i == list.size() - 1);
                return;
            }
            wr0 wr0Var = (wr0) decVar;
            gcd gcdVar = (gcd) list.get(i);
            wr0Var.G0 = gcdVar;
            if (!wr0Var.H0) {
                wr0Var.F0.setProgress(((Integer) gcdVar.X).intValue());
            }
            gcdVar.getClass();
            return;
        }
        we7 we7Var = (we7) decVar;
        gcd gcdVar2 = (gcd) list.get(i);
        we7Var.L0 = gcdVar2;
        we7Var.K0.setText(gcdVar2.b);
        SwitchCompat switchCompat = we7Var.H0;
        switchCompat.setOnCheckedChangeListener(null);
        switchCompat.setChecked(((Integer) we7Var.L0.X).intValue() != 0);
        switchCompat.setOnCheckedChangeListener(new wz2(2, we7Var));
        we7Var.L0.getClass();
        switchCompat.setEnabled(true);
        int iIntValue = ((Integer) we7Var.L0.X).intValue();
        Object[] objArr = iIntValue != 0;
        we7Var.J0.setVisibility(objArr != false ? 0 : 8);
        if (objArr != false) {
            we7Var.F0.setColor(iIntValue);
        }
        we7Var.L0.getClass();
        View view = we7Var.a;
        view.setEnabled(true);
        we7Var.L0.getClass();
        view.setAlpha(1.0f);
        we7Var.I0.setVisibility(we7Var.L0.Z ? 0 : 8);
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.X;
        if (i == 3) {
            return new jcd(layoutInflater.inflate(yyb.row_setting_header, viewGroup, false), null);
        }
        if (i == 6) {
            return new gnb(layoutInflater.inflate(yyb.row_setting_progress, viewGroup, false), null);
        }
        FrgBaseSettings frgBaseSettings = this.Y;
        if (i == 4) {
            return new we7(layoutInflater.inflate(yyb.row_setting_led, viewGroup, false), frgBaseSettings);
        }
        if (i == 7) {
            return new xz2(layoutInflater.inflate(yyb.row_setting_contact, viewGroup, false), frgBaseSettings, 1);
        }
        if (i == 9) {
            return new wr0(layoutInflater.inflate(yyb.row_setting_brightness, viewGroup, false), frgBaseSettings);
        }
        if (i == 8) {
            return new xz2(layoutInflater.inflate(yyb.row_setting_theme, viewGroup, false), frgBaseSettings, 3);
        }
        View viewInflate = layoutInflater.inflate(yyb.row_setting, viewGroup, false);
        return i == 2 ? new xz2((ViewGroup) viewInflate, layoutInflater, frgBaseSettings, 0) : i == 1 ? new ype((ViewGroup) viewInflate, layoutInflater, frgBaseSettings) : i == 10 ? new xz2((ViewGroup) viewInflate, layoutInflater, frgBaseSettings, 2) : new jcd(viewInflate, frgBaseSettings);
    }
}
