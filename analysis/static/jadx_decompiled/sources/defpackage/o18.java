package defpackage;

import android.R;
import android.content.res.ColorStateList;

/* loaded from: classes.dex */
public final class o18 extends mn {
    public static final int u0 = m2c.Widget_MaterialComponents_CompoundButton_RadioButton;
    public static final int[][] v0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList s0;
    public boolean t0;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.s0 == null) {
            int iZ = mr0.z(this, tsb.colorControlActivated);
            int iZ2 = mr0.z(this, tsb.colorOnSurface);
            int iZ3 = mr0.z(this, tsb.colorSurface);
            this.s0 = new ColorStateList(v0, new int[]{mr0.N(iZ3, 1.0f, iZ), mr0.N(iZ3, 0.54f, iZ2), mr0.N(iZ3, 0.38f, iZ2), mr0.N(iZ3, 0.38f, iZ2)});
        }
        return this.s0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.t0 && fd3.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.t0 = z;
        if (z) {
            fd3.c(this, getMaterialThemeColorsTintList());
        } else {
            fd3.c(this, null);
        }
    }
}
