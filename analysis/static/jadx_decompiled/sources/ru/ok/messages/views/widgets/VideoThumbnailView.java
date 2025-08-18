package ru.ok.messages.views.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import defpackage.e2b;
import defpackage.hv6;
import defpackage.iv6;
import defpackage.j47;
import defpackage.k20;
import defpackage.ma6;
import defpackage.s36;
import defpackage.ssc;
import defpackage.wjc;
import defpackage.wv6;
import ru.ok.messages.media.mediabar.SimpleTransitionDraweeView;

/* loaded from: classes2.dex */
public class VideoThumbnailView extends SimpleTransitionDraweeView {
    public int A0;
    public k20 x0;
    public final wjc y0;
    public int z0;

    public VideoThumbnailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.y0 = new wjc();
    }

    private void setPlaceHolderDrawable(Drawable drawable) {
        ma6 ma6Var = new ma6(getResources());
        ssc sscVar = ssc.l;
        ma6Var.l = sscVar;
        ma6Var.d = drawable;
        ma6Var.e = sscVar;
        setHierarchy(ma6Var.a());
    }

    private void setPlaceHolderFromVideo(k20 k20Var) {
        Uri uriN = j47.N(k20Var.d);
        if (uriN != null) {
            setPlaceHolderUri(uriN);
        }
    }

    private void setPlaceHolderUri(Uri uri) {
        ma6 ma6Var = new ma6(getResources());
        ma6Var.l = ssc.l;
        ma6Var.b = 0;
        setHierarchy(ma6Var.a());
        e2b e2bVar = s36.a.get();
        e2bVar.g = this.y0;
        e2bVar.l = getController();
        setController(e2bVar.a());
        wv6 wv6VarA = wv6.a(uri);
        wjc wjcVar = this.y0;
        iv6 iv6VarO = s36.o();
        iv6VarO.getClass();
        wjcVar.a(new hv6(iv6VarO, wv6VarA, null));
    }

    public final void n(k20 k20Var, Drawable drawable) {
        this.x0 = k20Var;
        if (k20Var == null && drawable == null) {
            setController(null);
        } else if (drawable == null) {
            setPlaceHolderFromVideo(k20Var);
        } else {
            setPlaceHolderDrawable(drawable);
        }
    }

    public final void o(k20 k20Var, Uri uri) {
        this.x0 = k20Var;
        if (k20Var == null && uri == null) {
            setController(null);
        } else if (uri == null) {
            setPlaceHolderFromVideo(k20Var);
        } else {
            setPlaceHolderUri(uri);
        }
    }

    @Override // defpackage.uq4, android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.x0 == null || View.MeasureSpec.getMode(i2) == 1073741824) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.z0;
        if (i3 <= 0) {
            i3 = this.x0.e;
        }
        int i4 = this.A0;
        if (i4 <= 0) {
            i4 = this.x0.f;
        }
        int[] iArrG = j47.G(size, size2, i3, i4);
        setMeasuredDimension(iArrG[0], iArrG[1]);
    }
}
