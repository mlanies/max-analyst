package defpackage;

import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
public final class m04 extends n15 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m04(m15 m15Var, int i) {
        super(m15Var);
        this.e = i;
    }

    @Override // defpackage.n15
    public void r() {
        switch (this.e) {
            case 0:
                m15 m15Var = this.b;
                m15Var.C0 = null;
                CheckableImageButton checkableImageButton = m15Var.u0;
                checkableImageButton.setOnLongClickListener(null);
                a14.J(checkableImageButton, null);
                break;
        }
    }
}
