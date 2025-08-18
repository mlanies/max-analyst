package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class gra extends n15 {
    public final int e;
    public EditText f;
    public final xx5 g;

    public gra(m15 m15Var, int i) {
        super(m15Var);
        this.e = yub.design_password_eye;
        this.g = new xx5(24, this);
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // defpackage.n15
    public final void b() {
        q();
    }

    @Override // defpackage.n15
    public final int c() {
        return wzb.password_toggle_content_description;
    }

    @Override // defpackage.n15
    public final int d() {
        return this.e;
    }

    @Override // defpackage.n15
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // defpackage.n15
    public final boolean k() {
        return true;
    }

    @Override // defpackage.n15
    public final boolean l() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // defpackage.n15
    public final void m(EditText editText) {
        this.f = editText;
        q();
    }

    @Override // defpackage.n15
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // defpackage.n15
    public final void s() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
