package com.facebook.drawee.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import defpackage.e2b;
import defpackage.e9f;
import defpackage.f46;
import defpackage.ide;
import defpackage.n0;
import defpackage.na6;
import defpackage.od2;
import defpackage.w2c;
import defpackage.wv6;

@Deprecated
/* loaded from: classes.dex */
public class SimpleDraweeView extends na6 {
    public static ide w0;
    public n0 v0;

    public SimpleDraweeView(Context context) {
        super(context);
        l(context, null);
    }

    public n0 getControllerBuilder() {
        return this.v0;
    }

    public final void l(Context context, AttributeSet attributeSet) {
        int resourceId;
        try {
            f46.I();
            if (isInEditMode()) {
                getTopLevelDrawable().setVisible(true, false);
                getTopLevelDrawable().invalidateSelf();
            } else {
                od2.o(w0, "SimpleDraweeView was not initialized!");
                this.v0 = (n0) w0.get();
            }
            if (attributeSet != null) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w2c.SimpleDraweeView);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(w2c.SimpleDraweeView_actualImageUri)) {
                        m(Uri.parse(typedArrayObtainStyledAttributes.getString(w2c.SimpleDraweeView_actualImageUri)));
                    } else if (typedArrayObtainStyledAttributes.hasValue(w2c.SimpleDraweeView_actualImageResource) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(w2c.SimpleDraweeView_actualImageResource, -1)) != -1) {
                        if (isInEditMode()) {
                            setImageResource(resourceId);
                        } else {
                            setActualImageResource(resourceId);
                        }
                    }
                    typedArrayObtainStyledAttributes.recycle();
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
            }
            f46.I();
        } catch (Throwable th2) {
            f46.I();
            throw th2;
        }
    }

    public final void m(Uri uri) {
        n0 n0Var = this.v0;
        n0Var.d = null;
        e2b e2bVar = (e2b) n0Var;
        e2bVar.c(uri);
        e2bVar.l = getController();
        setController(e2bVar.a());
    }

    public void setActualImageResource(int i) {
        m(e9f.c(i));
    }

    public void setImageRequest(wv6 wv6Var) {
        n0 n0Var = this.v0;
        n0Var.e = wv6Var;
        n0Var.l = getController();
        setController(n0Var.a());
    }

    @Override // defpackage.uq4, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
    }

    @Override // defpackage.uq4, android.widget.ImageView
    public void setImageURI(Uri uri) {
        m(uri);
    }

    public void setImageURI(String str) {
        m(str != null ? Uri.parse(str) : null);
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l(context, attributeSet);
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l(context, attributeSet);
    }
}
