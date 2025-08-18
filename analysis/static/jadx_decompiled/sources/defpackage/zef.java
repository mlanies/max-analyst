package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zef extends dle implements cmf, bmf {
    public a66 X;
    public o00 Y;
    public Long Z;
    public a66 o;
    public ObjectAnimator s0;
    public final AccelerateDecelerateInterpolator t0;

    public zef() {
        super(new w8c(26));
        this.t0 = new AccelerateDecelerateInterpolator();
    }

    @Override // defpackage.cmf
    public final boolean m() {
        return br7.H((je7) this.c);
    }

    @Override // defpackage.cmf
    public final void o(tlf tlfVar, o00 o00Var, long j, boolean z, boolean z2) {
        ObjectAnimator objectAnimator;
        this.Z = Long.valueOf(j);
        this.Y = o00Var;
        ((amf) Q()).a(tlfVar);
        amf amfVar = (amf) Q();
        ViewGroup viewGroup = (ViewGroup) this.b;
        if (viewGroup == null) {
            viewGroup = null;
        }
        bmf bmfVar = viewGroup instanceof bmf ? (bmf) viewGroup : null;
        amfVar.setVideoShape(bmfVar != null ? bmfVar.r(z) : r(z));
        ((amf) Q()).setVideoContentMode(o00Var instanceof wgf ? ulf.b : ulf.a);
        tu0.K(Q(), 300L, new elb(13, this));
        ((amf) Q()).setOnLongClickListener(new zl0(11, this));
        t();
        if (z2 && ((amf) Q()).getAlpha() < 1.0f && ((objectAnimator = this.s0) == null || !objectAnimator.isRunning())) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(Q(), (Property<View, Float>) View.ALPHA, ((amf) Q()).getAlpha(), 1.0f);
            objectAnimatorOfFloat.setDuration(500L);
            objectAnimatorOfFloat.setInterpolator(this.t0);
            objectAnimatorOfFloat.start();
            this.s0 = objectAnimatorOfFloat;
        }
        View viewQ = Q();
        if (viewQ.isAttachedToWindow()) {
            viewQ.addOnAttachStateChangeListener(new o50(viewQ, 12, this));
            return;
        }
        amf amfVar2 = (amf) Q();
        if (amfVar2.b == null || amfVar2.getChildCount() <= 0) {
            return;
        }
        u();
    }

    @Override // defpackage.bmf
    public final xlf r(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.b;
        if (viewGroup == null) {
            viewGroup = null;
        }
        float[] fArr = ((vs8) viewGroup.getBackground()).p;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        if (z) {
            fArrCopyOf[0] = 0.0f;
            fArrCopyOf[1] = 0.0f;
            fArrCopyOf[2] = 0.0f;
            fArrCopyOf[3] = 0.0f;
        }
        return new wlf(fArrCopyOf);
    }

    @Override // defpackage.cmf
    public final boolean s() {
        je7 je7Var = (je7) this.c;
        if (je7Var.a()) {
            amf amfVar = (amf) je7Var.getValue();
            if (amfVar.b != null && amfVar.getChildCount() > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cmf
    public final void setVideoClickListener(a66 a66Var) {
        this.o = a66Var;
    }

    @Override // defpackage.cmf
    public final void setVideoLongClickListener(a66 a66Var) {
        this.X = a66Var;
    }

    @Override // defpackage.cmf
    public final void u() {
        je7 je7Var = (je7) this.c;
        if (je7Var.a()) {
            amf amfVar = (amf) je7Var.getValue();
            ObjectAnimator objectAnimator = this.s0;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            amfVar.setAlpha(0.0f);
            amfVar.setVisibility(8);
            amfVar.b();
        }
    }
}
