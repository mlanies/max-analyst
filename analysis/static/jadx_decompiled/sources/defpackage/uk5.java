package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.biometric.FingerprintDialogFragment;
import androidx.fragment.app.DialogFragment;
import java.util.Objects;

/* loaded from: classes.dex */
public final class uk5 implements g2a {
    public final /* synthetic */ int a;
    public final /* synthetic */ DialogFragment b;

    public /* synthetic */ uk5(DialogFragment dialogFragment, int i) {
        this.a = i;
        this.b = dialogFragment;
    }

    @Override // defpackage.g2a
    public final void a(Object obj) {
        int i;
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                FingerprintDialogFragment fingerprintDialogFragment = (FingerprintDialogFragment) this.b;
                Handler handler = fingerprintDialogFragment.B1;
                re reVar = fingerprintDialogFragment.C1;
                handler.removeCallbacks(reVar);
                int iIntValue = num.intValue();
                if (fingerprintDialogFragment.G1 != null) {
                    int i2 = fingerprintDialogFragment.D1.t;
                    Context contextD0 = fingerprintDialogFragment.d0();
                    Drawable drawableB = null;
                    if (contextD0 != null) {
                        if (i2 == 0 && iIntValue == 1) {
                            i = tub.fingerprint_dialog_fp_icon;
                        } else if (i2 == 1 && iIntValue == 2) {
                            i = tub.fingerprint_dialog_error;
                        } else if (i2 == 2 && iIntValue == 1) {
                            i = tub.fingerprint_dialog_fp_icon;
                        } else if (i2 == 1 && iIntValue == 3) {
                            i = tub.fingerprint_dialog_fp_icon;
                        }
                        drawableB = kt3.b(contextD0, i);
                    }
                    if (drawableB != null) {
                        fingerprintDialogFragment.G1.setImageDrawable(drawableB);
                        if ((i2 != 0 || iIntValue != 1) && ((i2 == 1 && iIntValue == 2) || (i2 == 2 && iIntValue == 1))) {
                            vk5.a(drawableB);
                        }
                        fingerprintDialogFragment.D1.t = iIntValue;
                    }
                }
                int iIntValue2 = num.intValue();
                TextView textView = fingerprintDialogFragment.H1;
                if (textView != null) {
                    textView.setTextColor(iIntValue2 == 2 ? fingerprintDialogFragment.E1 : fingerprintDialogFragment.F1);
                }
                fingerprintDialogFragment.B1.postDelayed(reVar, 2000L);
                return;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                FingerprintDialogFragment fingerprintDialogFragment2 = (FingerprintDialogFragment) this.b;
                Handler handler2 = fingerprintDialogFragment2.B1;
                re reVar2 = fingerprintDialogFragment2.C1;
                handler2.removeCallbacks(reVar2);
                TextView textView2 = fingerprintDialogFragment2.H1;
                if (textView2 != null) {
                    textView2.setText(charSequence);
                }
                fingerprintDialogFragment2.B1.postDelayed(reVar2, 2000L);
                return;
            default:
                if (((eh7) obj) != null) {
                    DialogFragment dialogFragment = this.b;
                    if (dialogFragment.s1) {
                        View viewV0 = dialogFragment.V0();
                        if (viewV0.getParent() != null) {
                            throw new IllegalStateException("DialogFragment can not be attached to a container view");
                        }
                        if (dialogFragment.w1 != null) {
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Objects.toString(dialogFragment.w1);
                            }
                            dialogFragment.w1.setContentView(viewV0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
