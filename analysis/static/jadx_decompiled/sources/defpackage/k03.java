package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class k03 extends ote {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k03(int i, Object obj) {
        super(18);
        this.o = i;
        this.X = obj;
    }

    private final void c0(int i) {
    }

    @Override // defpackage.ote
    public final void J(int i) {
        switch (this.o) {
            case 0:
                break;
            default:
                dpe dpeVar = (dpe) this.X;
                dpeVar.e = true;
                cpe cpeVar = (cpe) dpeVar.f.get();
                if (cpeVar != null) {
                    cpeVar.a();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ote
    public final void K(Typeface typeface, boolean z) {
        switch (this.o) {
            case 0:
                Chip chip = (Chip) this.X;
                n03 n03Var = chip.s0;
                chip.setText(n03Var.P1 ? n03Var.Q0 : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z) {
                    dpe dpeVar = (dpe) this.X;
                    dpeVar.e = true;
                    cpe cpeVar = (cpe) dpeVar.f.get();
                    if (cpeVar != null) {
                        cpeVar.a();
                        break;
                    }
                }
                break;
        }
    }
}
