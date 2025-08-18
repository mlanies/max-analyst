package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class w38 extends OneMeDraweeView {
    public static final /* synthetic */ bc7[] K0 = {new oi9(w38.class, "imageInfo", "getImageInfo()Lcom/facebook/imagepipeline/image/ImageInfo;"), rh4.g(nec.a, w38.class, "imageAttach", "getImageAttach()Lone/me/messages/list/loader/model/ImageAttachConfig;"), new oi9(w38.class, "overlayDrawable", "getOverlayDrawable()Landroid/graphics/drawable/Drawable;")};
    public final v38 C0;
    public final je7 D0;
    public int E0;
    public final v38 F0;
    public final v38 G0;
    public k56 H0;
    public boolean I0;
    public boolean J0;

    public w38(Context context) {
        super(context);
        this.C0 = new v38(this, 0);
        this.D0 = tu0.r(3, new hy4(context, 12));
        this.F0 = new v38(yt6.m, this);
        this.G0 = new v38(this, 2);
        this.H0 = new m57(24);
        ya5 ya5Var = ((la6) getHierarchy()).e;
        ya5Var.w0 = 0;
        if (ya5Var.v0 == 1) {
            ya5Var.v0 = 0;
        }
    }

    private final y2b getDownloadDrawable() {
        return (y2b) this.D0.getValue();
    }

    private final ru6 getImageInfo() {
        bc7 bc7Var = K0[0];
        return (ru6) this.C0.b;
    }

    private final void setImageInfo(ru6 ru6Var) {
        this.C0.o1(this, K0[0], ru6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setup(yt6 yt6Var) throws NumberFormatException {
        wv6 wv6VarA;
        la6 la6Var = (la6) getHierarchy();
        la6Var.h(yt6Var.j);
        boolean z = yt6Var.g;
        la6Var.k(z ? getDownloadDrawable() : getOverlayDrawable());
        wv6 wv6VarA2 = null;
        jic jicVar = yt6Var.i;
        if (z) {
            wv6VarA = null;
        } else {
            xv6 xv6VarD = xv6.d(yt6Var.b);
            xv6VarD.d = jicVar;
            wv6VarA = xv6VarD.a();
        }
        Uri uri = yt6Var.h;
        if (uri != null) {
            xv6 xv6VarD2 = xv6.d(uri);
            xv6VarD2.d = jicVar;
            wv6VarA2 = xv6VarD2.a();
        }
        o(wv6VarA, wv6VarA2);
    }

    public final int getBlurOffset() {
        return Math.abs(this.E0);
    }

    public final boolean getIgnoreCropCriteria() {
        return this.J0;
    }

    public final yt6 getImageAttach() {
        bc7 bc7Var = K0[1];
        return (yt6) this.F0.b;
    }

    public final k56 getOnFinalImageSetCallback() {
        return this.H0;
    }

    public final Drawable getOverlayDrawable() {
        bc7 bc7Var = K0[2];
        return (Drawable) this.G0.b;
    }

    public final boolean getUseMaxDimensionsOnMeasure() {
        return this.I0;
    }

    @Override // defpackage.uq4, android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            setMeasuredDimension(size, size2);
            return;
        }
        float f2 = getImageAttach().c / getImageAttach().d;
        this.E0 = 0;
        if (f2 == 1.0f) {
            if (this.I0 || getImageAttach().c > 291) {
                setMeasuredDimension(size, size);
                return;
            } else if (getImageAttach().c > 140) {
                float f3 = 256;
                setMeasuredDimension(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
                return;
            } else {
                float f4 = 140;
                setMeasuredDimension(tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(f4 * fk4.d().getDisplayMetrics().density));
                return;
            }
        }
        if (f2 >= 1.0f) {
            if (f2 <= 1.0f) {
                setMeasuredDimension(size, size2);
                return;
            }
            if (f2 > 2.3333333f) {
                int iG = tu0.G(72 * fk4.d().getDisplayMetrics().density);
                int i3 = (int) (size / f2);
                int i4 = iG - i3;
                if (i4 <= iG * 0.25f) {
                    setMeasuredDimension(size, iG);
                    return;
                } else {
                    this.E0 = (i4 * (-1)) / 2;
                    setMeasuredDimension(size, i3);
                    return;
                }
            }
            if (this.I0 || getImageAttach().c > 291) {
                setMeasuredDimension(size, (int) (size / f2));
                return;
            } else if (getImageAttach().c > 212) {
                setMeasuredDimension(tu0.G(fk4.d().getDisplayMetrics().density * 256), (int) (tu0.G(r8 * fk4.d().getDisplayMetrics().density) / f2));
                return;
            } else {
                setMeasuredDimension(tu0.G(fk4.d().getDisplayMetrics().density * 212), (int) (tu0.G(r8 * fk4.d().getDisplayMetrics().density) / f2));
                return;
            }
        }
        if (f2 < 0.42857143f) {
            int iG2 = tu0.G(165 * fk4.d().getDisplayMetrics().density);
            float f5 = 384;
            int iG3 = (int) (tu0.G(fk4.d().getDisplayMetrics().density * f5) * f2);
            if (!this.J0 && iG2 - iG3 <= iG2 * 0.25f) {
                setMeasuredDimension(iG2, tu0.G(f5 * fk4.d().getDisplayMetrics().density));
                return;
            } else {
                this.E0 = (iG2 - iG3) / 2;
                setMeasuredDimension(iG3, tu0.G(f5 * fk4.d().getDisplayMetrics().density));
                return;
            }
        }
        if (this.I0 || getImageAttach().c > 291) {
            float f6 = 384;
            int iG4 = (int) (tu0.G(fk4.d().getDisplayMetrics().density * f6) * f2);
            f = iG4 > size ? size / iG4 : 1.0f;
            setMeasuredDimension((int) (iG4 * f), (int) (f * tu0.G(f6 * fk4.d().getDisplayMetrics().density)));
            return;
        }
        if (getImageAttach().c <= 120) {
            setMeasuredDimension((int) (tu0.G(fk4.d().getDisplayMetrics().density * r8) * f2), tu0.G(280 * fk4.d().getDisplayMetrics().density));
        } else {
            float f7 = 345;
            int iG5 = (int) (tu0.G(fk4.d().getDisplayMetrics().density * f7) * f2);
            f = iG5 > size ? size / iG5 : 1.0f;
            setMeasuredDimension((int) (iG5 * f), (int) (f * tu0.G(f7 * fk4.d().getDisplayMetrics().density)));
        }
    }

    @Override // one.me.sdk.uikit.common.views.OneMeDraweeView
    public final void p(ru6 ru6Var, Animatable animatable) {
        if (getImageAttach().e && animatable != null) {
            animatable.start();
        }
        setImageInfo(ru6Var);
        this.H0.invoke();
    }

    public final boolean r() {
        return this.E0 < 0;
    }

    public final void setIgnoreCropCriteria(boolean z) {
        this.J0 = z;
    }

    public final void setImageAttach(yt6 yt6Var) {
        this.F0.o1(this, K0[1], yt6Var);
    }

    public final void setOnFinalImageSetCallback(k56 k56Var) {
        this.H0 = k56Var;
    }

    public final void setOverlayDrawable(Drawable drawable) {
        this.G0.o1(this, K0[2], drawable);
    }

    public final void setUseMaxDimensionsOnMeasure(boolean z) {
        this.I0 = z;
    }
}
