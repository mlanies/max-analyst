package defpackage;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class ny4 extends z04 {
    public final my4 e;

    public ny4(TextView textView) {
        this.e = new my4(textView);
    }

    @Override // defpackage.z04
    public final InputFilter[] B(InputFilter[] inputFilterArr) {
        return (vw4.p != null) ^ true ? inputFilterArr : this.e.B(inputFilterArr);
    }

    @Override // defpackage.z04
    public final boolean K() {
        return this.e.g;
    }

    @Override // defpackage.z04
    public final void V(boolean z) {
        if (!(vw4.p != null)) {
            return;
        }
        this.e.V(z);
    }

    @Override // defpackage.z04
    public final void W(boolean z) {
        boolean z2 = !(vw4.p != null);
        my4 my4Var = this.e;
        if (z2) {
            my4Var.g = z;
        } else {
            my4Var.W(z);
        }
    }

    @Override // defpackage.z04
    public final TransformationMethod f0(TransformationMethod transformationMethod) {
        return (vw4.p != null) ^ true ? transformationMethod : this.e.f0(transformationMethod);
    }
}
