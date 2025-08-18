package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class bu6 extends OneMeDraweeView {
    public static final /* synthetic */ bc7[] J0 = {new oi9(bu6.class, "overlayDrawable", "getOverlayDrawable()Landroid/graphics/drawable/Drawable;"), rh4.g(nec.a, bu6.class, "imageAttach", "getImageAttach()Lone/me/messages/list/loader/model/ImageAttachConfig;"), new oi9(bu6.class, "imageInfo", "getImageInfo()Lcom/facebook/imagepipeline/image/ImageInfo;")};
    public static final ty4 K0 = new ty4();
    public final au6 C0;
    public final au6 D0;
    public k56 E0;
    public final au6 F0;
    public int G0;
    public int H0;
    public final je7 I0;

    public bu6(Context context) {
        super(context);
        this.C0 = new au6(this, 1);
        this.D0 = new au6(yt6.m, this);
        this.E0 = new fh5(16);
        this.F0 = new au6(this, 0);
        this.I0 = tu0.r(3, new hy4(context, 7));
        setId(mda.M);
        ya5 ya5Var = ((la6) getHierarchy()).e;
        ya5Var.w0 = 0;
        if (ya5Var.v0 == 1) {
            ya5Var.v0 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setup(yt6 yt6Var) throws NumberFormatException {
        wv6 wv6VarA;
        la6 la6Var = (la6) getHierarchy();
        la6Var.h(yt6Var.j);
        boolean z = yt6Var.g;
        la6Var.k(z ? (Drawable) this.I0.getValue() : getOverlayDrawable());
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

    public final yt6 getImageAttach() {
        bc7 bc7Var = J0[1];
        return (yt6) this.D0.b;
    }

    public final ru6 getImageInfo() {
        bc7 bc7Var = J0[2];
        return (ru6) this.F0.b;
    }

    public final int getMeasuredLayoutHeight() {
        return this.G0;
    }

    public final int getMeasuredLayoutWidth() {
        return this.H0;
    }

    public final k56 getOnFinalImageSetCallback() {
        return this.E0;
    }

    public final Drawable getOverlayDrawable() {
        bc7 bc7Var = J0[0];
        return (Drawable) this.C0.b;
    }

    @Override // defpackage.uq4, android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            setMeasuredDimension(size, size2);
            return;
        }
        int i3 = getImageAttach().c;
        int i4 = getImageAttach().d;
        if (i3 <= 0 || i4 <= 0) {
            i4 = size / 2;
            i3 = size;
        }
        int i5 = getImageAttach().f;
        int iG = tu0.G(120 * fk4.d().getDisplayMetrics().density);
        int iMin = Math.min(size, size);
        int i6 = iMin / 2;
        float f = i4;
        float f2 = i3;
        int i7 = (int) ((f / f2) * iMin);
        ty4 ty4Var = K0;
        if (iMin >= i6 && i7 >= iG && i7 <= i5) {
            v3c.B(iMin, i7, i3, i4, ty4Var);
        } else if (i7 < iG) {
            v3c.B(iMin, iG, i3, i4, ty4Var);
        } else {
            int i8 = (int) ((f2 / f) * i5);
            if (i8 < i6 || i5 < iG) {
                v3c.B(i6, i5, i3, i4, ty4Var);
            } else {
                v3c.B(i8, i5, i3, i4, ty4Var);
            }
        }
        this.G0 = ty4Var.c;
        this.H0 = ty4Var.b;
        setMeasuredDimension(ty4Var.d, ty4Var.e);
    }

    @Override // one.me.sdk.uikit.common.views.OneMeDraweeView
    public final void p(ru6 ru6Var, Animatable animatable) {
        if (getImageAttach().e && animatable != null) {
            animatable.start();
        }
        setImageInfo(ru6Var);
        this.E0.invoke();
    }

    public final void setImageAttach(yt6 yt6Var) {
        this.D0.o1(this, J0[1], yt6Var);
    }

    public final void setImageInfo(ru6 ru6Var) {
        this.F0.o1(this, J0[2], ru6Var);
    }

    public final void setOnFinalImageSetCallback(k56 k56Var) {
        this.E0 = k56Var;
    }

    public final void setOverlayDrawable(Drawable drawable) {
        this.C0.o1(this, J0[0], drawable);
    }
}
