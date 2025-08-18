package defpackage;

import android.content.res.ColorStateList;

/* loaded from: classes2.dex */
public final class ofa extends mn implements kre {
    public final void b(boolean z, fka fkaVar) {
        setButtonTintList(ColorStateList.valueOf(z ? fkaVar.getIcon().k : fkaVar.i().b.b));
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        b(isChecked(), fkaVar);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        b(z, qp4.u0.j(this));
    }
}
