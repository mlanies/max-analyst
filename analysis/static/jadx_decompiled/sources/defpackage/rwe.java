package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class rwe implements v54 {
    public final Toolbar a;
    public int b;
    public final View c;
    public Drawable d;
    public Drawable e;
    public final Drawable f;
    public final boolean g;
    public CharSequence h;
    public final CharSequence i;
    public final CharSequence j;
    public Window.Callback k;
    public boolean l;
    public e7 m;
    public final int n;
    public final Drawable o;

    public rwe(Toolbar toolbar, boolean z) {
        int i;
        Drawable drawable;
        int i2 = i2c.abc_action_bar_up_description;
        this.n = 0;
        this.a = toolbar;
        this.h = toolbar.getTitle();
        this.i = toolbar.getSubtitle();
        this.g = this.h != null;
        this.f = toolbar.getNavigationIcon();
        k8g k8gVarX = k8g.x(toolbar.getContext(), null, p3c.ActionBar, vsb.actionBarStyle, 0);
        this.o = k8gVarX.n(p3c.ActionBar_homeAsUpIndicator);
        if (z) {
            int i3 = p3c.ActionBar_title;
            TypedArray typedArray = (TypedArray) k8gVarX.b;
            CharSequence text = typedArray.getText(i3);
            if (!TextUtils.isEmpty(text)) {
                this.g = true;
                this.h = text;
                if ((this.b & 8) != 0) {
                    Toolbar toolbar2 = this.a;
                    toolbar2.setTitle(text);
                    if (this.g) {
                        zmf.k(toolbar2.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(p3c.ActionBar_subtitle);
            if (!TextUtils.isEmpty(text2)) {
                this.i = text2;
                if ((this.b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable drawableN = k8gVarX.n(p3c.ActionBar_logo);
            if (drawableN != null) {
                this.e = drawableN;
                c();
            }
            Drawable drawableN2 = k8gVarX.n(p3c.ActionBar_icon);
            if (drawableN2 != null) {
                this.d = drawableN2;
                c();
            }
            if (this.f == null && (drawable = this.o) != null) {
                this.f = drawable;
                int i4 = this.b & 4;
                Toolbar toolbar3 = this.a;
                if (i4 != 0) {
                    toolbar3.setNavigationIcon(drawable);
                } else {
                    toolbar3.setNavigationIcon((Drawable) null);
                }
            }
            a(typedArray.getInt(p3c.ActionBar_displayOptions, 0));
            int resourceId = typedArray.getResourceId(p3c.ActionBar_customNavigationLayout, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.c;
                if (view != null && (this.b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.c = viewInflate;
                if (viewInflate != null && (this.b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                a(this.b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(p3c.ActionBar_height, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(p3c.ActionBar_contentInsetStart, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(p3c.ActionBar_contentInsetEnd, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                toolbar.u(Math.max(dimensionPixelOffset, 0), Math.max(dimensionPixelOffset2, 0));
            }
            int resourceId2 = typedArray.getResourceId(p3c.ActionBar_titleTextStyle, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.z0 = resourceId2;
                AppCompatTextView appCompatTextView = toolbar.b;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(p3c.ActionBar_subtitleTextStyle, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.A0 = resourceId3;
                AppCompatTextView appCompatTextView2 = toolbar.c;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(p3c.ActionBar_popupTheme, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.o = toolbar.getNavigationIcon();
                i = 15;
            } else {
                i = 11;
            }
            this.b = i;
        }
        k8gVarX.z();
        if (i2 != this.n) {
            this.n = i2;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i5 = this.n;
                this.j = i5 != 0 ? toolbar.getContext().getString(i5) : null;
                b();
            }
        }
        this.j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new hq(this));
    }

    public final void a(int i) {
        View view;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    b();
                }
                int i3 = this.b & 4;
                Toolbar toolbar = this.a;
                if (i3 != 0) {
                    Drawable drawable = this.f;
                    if (drawable == null) {
                        drawable = this.o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                c();
            }
            int i4 = i2 & 8;
            Toolbar toolbar2 = this.a;
            if (i4 != 0) {
                if ((i & 8) != 0) {
                    toolbar2.setTitle(this.h);
                    toolbar2.setSubtitle(this.i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.j);
            Toolbar toolbar = this.a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.n);
            } else {
                toolbar.setNavigationContentDescription(this.j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i = this.b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.e) == null) {
            drawable = this.d;
        }
        this.a.setLogo(drawable);
    }
}
