package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* loaded from: classes2.dex */
public final class lf implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lf(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    private final void g(Animator animator) {
    }

    private final void h(Animator animator) {
    }

    private final void i(Animator animator) {
    }

    private final void j(Animator animator) {
    }

    private final void k(Animator animator) {
    }

    private final void l(Animator animator) {
    }

    private final void m(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                nf nfVar = (nf) this.b;
                nfVar.o = null;
                nf.a(nfVar, (OneMeButton) this.c);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                nf nfVar = (nf) obj2;
                nfVar.o = null;
                nf.a(nfVar, (OneMeButton) obj);
                return;
            case 1:
                return;
            case 2:
                bc7[] bc7VarArr = FakeInAppReviewBottomSheet.H0;
                FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = (FakeInAppReviewBottomSheet) obj2;
                fakeInAppReviewBottomSheet.getClass();
                ((ConstraintLayout) fakeInAppReviewBottomSheet.y0.T0(fakeInAppReviewBottomSheet, FakeInAppReviewBottomSheet.H0[0])).setVisibility(8);
                ((FrameLayout) obj).postDelayed(fakeInAppReviewBottomSheet.F0, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
                return;
            case 3:
                ((tz7) obj2).setAlpha(((of) obj).b.floatValue());
                return;
            default:
                eha ehaVar = (eha) obj2;
                ViewGroup.LayoutParams layoutParams = ehaVar.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = -2;
                layoutParams.height = -2;
                ehaVar.setMinimumHeight(0);
                ehaVar.setLayoutParams(layoutParams);
                int iOrdinal = ehaVar.t0.ordinal();
                if (iOrdinal == 0) {
                    ((View) ehaVar.E0.getValue()).setVisibility(ehaVar.getShouldShowSearchIcon() ? 0 : 8);
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((View) ehaVar.D0.getValue()).setVisibility(ehaVar.getShouldShowSearchIcon() ? 0 : 8);
                }
                ((View) ehaVar.B0.getValue()).setVisibility(8);
                ((View) ehaVar.F0.getValue()).setVisibility(8);
                ((View) ehaVar.C0.getValue()).setVisibility(8);
                ((AppCompatEditText) ehaVar.C0.getValue()).setText((CharSequence) null);
                ehaVar.A0 = cha.a;
                bha bhaVar = ehaVar.u0;
                if (bhaVar != null) {
                    bhaVar.U();
                    return;
                }
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                ((p85) this.b).u0 = (Layout) this.c;
                break;
            case 2:
            case 3:
                break;
            default:
                eha ehaVar = (eha) this.b;
                ((AppCompatEditText) ehaVar.C0.getValue()).setHint((CharSequence) null);
                InputMethodManager inputMethodManager = (InputMethodManager) lt3.b((Context) this.c, InputMethodManager.class);
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(((AppCompatEditText) ehaVar.C0.getValue()).getWindowToken(), 0);
                }
                ehaVar.A0 = cha.b;
                break;
        }
    }
}
