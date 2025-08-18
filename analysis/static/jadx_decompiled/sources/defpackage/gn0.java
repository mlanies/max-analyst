package defpackage;

import android.content.DialogInterface;
import androidx.biometric.BiometricViewModel;
import androidx.biometric.FingerprintDialogFragment;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class gn0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public gn0(BiometricViewModel biometricViewModel) {
        this.b = new WeakReference(biometricViewModel);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                WeakReference weakReference = (WeakReference) this.b;
                if (weakReference.get() != null) {
                    ((BiometricViewModel) weakReference.get()).i(true);
                    break;
                }
                break;
            default:
                ((FingerprintDialogFragment) this.b).D1.i(true);
                break;
        }
    }

    public gn0(FingerprintDialogFragment fingerprintDialogFragment) {
        this.b = fingerprintDialogFragment;
    }
}
