package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.uikit.common.views.OneMeDraweeView;
import ru.ok.messages.views.widgets.SquareFrameLayout;
import ru.ok.messages.views.widgets.VideoInfoTextView;

/* loaded from: classes2.dex */
public final class sg2 extends SquareFrameLayout implements kre {
    public final ColorDrawable a;
    public final OneMeDraweeView b;
    public final je7 c;

    public sg2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ColorDrawable colorDrawable = new ColorDrawable(qp4.u0.j(this).b().j);
        this.a = colorDrawable;
        OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
        oneMeDraweeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        oneMeDraweeView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ma6 ma6Var = new ma6(oneMeDraweeView.getResources());
        ma6Var.d = colorDrawable;
        oneMeDraweeView.setHierarchy(ma6Var.a());
        this.b = oneMeDraweeView;
        this.c = tu0.r(3, new x2(context, 22, this));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(oneMeDraweeView);
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        this.a.setColor(fkaVar.b().j);
    }

    public final void setItem(wm8 wm8Var) throws NumberFormatException {
        Uri uri;
        wv6 wv6VarA;
        sme smeVarR;
        if (wm8Var.u0 || (uri = wm8Var.o) == null) {
            wv6VarA = null;
        } else {
            xv6 xv6VarD = xv6.d(uri);
            xv6VarD.i = true;
            wv6VarA = xv6VarD.a();
        }
        Uri uri2 = wm8Var.t0;
        wv6 wv6VarA2 = uri2 != null ? xv6.d(uri2).a() : null;
        OneMeDraweeView oneMeDraweeView = this.b;
        oneMeDraweeView.setBackground(null);
        oneMeDraweeView.o(wv6VarA, wv6VarA2);
        int iS = au1.s(wm8Var.X);
        je7 je7Var = this.c;
        if (iS == 0) {
            if (je7Var.a()) {
                ((VideoInfoTextView) je7Var.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        if (iS != 1) {
            if (iS != 2) {
                throw new NoWhenBranchMatchedException();
            }
            VideoInfoTextView videoInfoTextView = (VideoInfoTextView) je7Var.getValue();
            videoInfoTextView.setText(videoInfoTextView.getContext().getString(jpc.m1));
            videoInfoTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            videoInfoTextView.setVisibility(0);
            videoInfoTextView.setVisibility(0);
            return;
        }
        VideoInfoTextView videoInfoTextView2 = (VideoInfoTextView) je7Var.getValue();
        Long l = wm8Var.Y;
        long jLongValue = l != null ? l.longValue() : 0L;
        Context context = videoInfoTextView2.getContext();
        int i = gpc.u0;
        if (videoInfoTextView2.isInEditMode()) {
            smeVarR = ee4.e0;
        } else {
            Context context2 = videoInfoTextView2.getContext();
            khe kheVar = sme.a0;
            smeVarR = fm9.R(context2);
        }
        pag.I(ngg.u(i, smeVarR.t, context), null, null, null, videoInfoTextView2);
        String[] strArr = are.b;
        videoInfoTextView2.setText(tfg.c(jLongValue));
        videoInfoTextView2.setVisibility(0);
        videoInfoTextView2.setVisibility(0);
    }
}
