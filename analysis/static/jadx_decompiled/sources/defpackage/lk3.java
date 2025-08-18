package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes.dex */
public final class lk3 extends ConstraintLayout implements kre {
    public static final /* synthetic */ bc7[] h1 = {new oi9(lk3.class, "isSelectionEnabled", "isSelectionEnabled()Z"), rh4.g(nec.a, lk3.class, "isContactSelected", "isContactSelected()Z"), new oi9(lk3.class, "customTheme", "getCustomTheme()Lone/me/sdk/design/OneMeTheme;"), new oi9(lk3.class, "callButtonMode", "getCallButtonMode()Lone/me/common/contact/ContactCellView$Companion$CallButtonMode;")};
    public final s5a G0;
    public final AppCompatTextView H0;
    public final je7 I0;
    public final je7 J0;
    public final je7 K0;
    public final je7 L0;
    public final je7 M0;
    public final je7 N0;
    public final je7 O0;
    public final je7 P0;
    public final je7 Q0;
    public final kk3 R0;
    public final kk3 S0;
    public final kk3 T0;
    public final kk3 U0;
    public final je7 V0;
    public final je7 W0;
    public final gic X0;
    public final je7 Y0;
    public final je7 Z0;
    public final gic a1;
    public final gic b1;
    public final je7 c1;
    public final je7 d1;
    public final je7 e1;
    public final int f1;
    public int g1;

    public lk3(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        s5a s5aVar = new s5a(context);
        s5aVar.setId(xoc.A);
        s5aVar.setAvatarShape(j5a.a);
        this.G0 = s5aVar;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setId(xoc.F);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setTextColor(qp4.u0.j(appCompatTextView).getText().e);
        i4f.j.b(appCompatTextView, du4.b);
        appCompatTextView.setSingleLine();
        this.H0 = appCompatTextView;
        final int i = 1;
        this.I0 = tu0.r(3, new k56() { // from class: ik3
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return lk3.w(context, this);
                    case 1:
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                        appCompatTextView2.setId(xoc.E);
                        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        appCompatTextView2.setSingleLine();
                        appCompatTextView2.setTextColor(qp4.u0.j(appCompatTextView2).getText().g);
                        i4f.m.b(appCompatTextView2, du4.b);
                        this.addView(appCompatTextView2, new ti3(0, tu0.G(20 * fk4.d().getDisplayMetrics().density)));
                        return appCompatTextView2;
                    case 2:
                        TextView textView = new TextView(context);
                        textView.setId(xoc.y);
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        textView.setSingleLine();
                        textView.setTextColor(qp4.u0.j(textView).getText().g);
                        i4f.q.b(textView, du4.b);
                        this.addView(textView, new ti3(0, tu0.G(20 * fk4.d().getDisplayMetrics().density)));
                        return textView;
                    case 3:
                        ImageView imageView = new ImageView(context);
                        imageView.setId(xoc.D);
                        qp4.u0.j(imageView).getIcon();
                        imageView.setImageTintList(ColorStateList.valueOf(-1));
                        float f = 40;
                        this.addView(imageView, new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
                        return imageView;
                    case 4:
                        OneMeButton oneMeButton = new OneMeButton(context, null);
                        oneMeButton.setId(xoc.B);
                        oneMeButton.setSize(c7a.b);
                        oneMeButton.setMode(b7a.o);
                        oneMeButton.setAppearance(z6a.a);
                        this.addView(oneMeButton, new ti3(-2, -2));
                        return oneMeButton;
                    case 5:
                        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
                        appCompatImageView.setId(xoc.M);
                        appCompatImageView.setImageResource(pub.videocam_outline_24);
                        lk3 lk3Var = this;
                        fka customTheme = lk3Var.getCustomTheme();
                        if (customTheme == null) {
                            customTheme = qp4.u0.j(appCompatImageView);
                        }
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(customTheme.getIcon().f));
                        int iG = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iG, iG, iG, iG);
                        int i2 = customTheme.d().a.a.c;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i2), null, shapeDrawable));
                        float f2 = 40;
                        lk3Var.addView(appCompatImageView, new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
                        return appCompatImageView;
                    default:
                        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, null);
                        appCompatImageView2.setId(xoc.z);
                        appCompatImageView2.setImageResource(pub.ic_audio_call_type_24);
                        lk3 lk3Var2 = this;
                        fka customTheme2 = lk3Var2.getCustomTheme();
                        if (customTheme2 == null) {
                            customTheme2 = qp4.u0.j(appCompatImageView2);
                        }
                        appCompatImageView2.setImageTintList(ColorStateList.valueOf(customTheme2.getIcon().f));
                        int iG2 = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView2.setPadding(iG2, iG2, iG2, iG2);
                        int i3 = customTheme2.d().a.a.c;
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        shapeDrawable2.getPaint().setColor(-1);
                        appCompatImageView2.setBackground(new RippleDrawable(ColorStateList.valueOf(i3), null, shapeDrawable2));
                        float f3 = 40;
                        lk3Var2.addView(appCompatImageView2, new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density)));
                        return appCompatImageView2;
                }
            }
        });
        final int i2 = 2;
        this.J0 = tu0.r(3, new k56() { // from class: ik3
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return lk3.w(context, this);
                    case 1:
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                        appCompatTextView2.setId(xoc.E);
                        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        appCompatTextView2.setSingleLine();
                        appCompatTextView2.setTextColor(qp4.u0.j(appCompatTextView2).getText().g);
                        i4f.m.b(appCompatTextView2, du4.b);
                        this.addView(appCompatTextView2, new ti3(0, tu0.G(20 * fk4.d().getDisplayMetrics().density)));
                        return appCompatTextView2;
                    case 2:
                        TextView textView = new TextView(context);
                        textView.setId(xoc.y);
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        textView.setSingleLine();
                        textView.setTextColor(qp4.u0.j(textView).getText().g);
                        i4f.q.b(textView, du4.b);
                        this.addView(textView, new ti3(0, tu0.G(20 * fk4.d().getDisplayMetrics().density)));
                        return textView;
                    case 3:
                        ImageView imageView = new ImageView(context);
                        imageView.setId(xoc.D);
                        qp4.u0.j(imageView).getIcon();
                        imageView.setImageTintList(ColorStateList.valueOf(-1));
                        float f = 40;
                        this.addView(imageView, new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
                        return imageView;
                    case 4:
                        OneMeButton oneMeButton = new OneMeButton(context, null);
                        oneMeButton.setId(xoc.B);
                        oneMeButton.setSize(c7a.b);
                        oneMeButton.setMode(b7a.o);
                        oneMeButton.setAppearance(z6a.a);
                        this.addView(oneMeButton, new ti3(-2, -2));
                        return oneMeButton;
                    case 5:
                        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
                        appCompatImageView.setId(xoc.M);
                        appCompatImageView.setImageResource(pub.videocam_outline_24);
                        lk3 lk3Var = this;
                        fka customTheme = lk3Var.getCustomTheme();
                        if (customTheme == null) {
                            customTheme = qp4.u0.j(appCompatImageView);
                        }
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(customTheme.getIcon().f));
                        int iG = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iG, iG, iG, iG);
                        int i22 = customTheme.d().a.a.c;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i22), null, shapeDrawable));
                        float f2 = 40;
                        lk3Var.addView(appCompatImageView, new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
                        return appCompatImageView;
                    default:
                        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, null);
                        appCompatImageView2.setId(xoc.z);
                        appCompatImageView2.setImageResource(pub.ic_audio_call_type_24);
                        lk3 lk3Var2 = this;
                        fka customTheme2 = lk3Var2.getCustomTheme();
                        if (customTheme2 == null) {
                            customTheme2 = qp4.u0.j(appCompatImageView2);
                        }
                        appCompatImageView2.setImageTintList(ColorStateList.valueOf(customTheme2.getIcon().f));
                        int iG2 = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView2.setPadding(iG2, iG2, iG2, iG2);
                        int i3 = customTheme2.d().a.a.c;
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        shapeDrawable2.getPaint().setColor(-1);
                        appCompatImageView2.setBackground(new RippleDrawable(ColorStateList.valueOf(i3), null, shapeDrawable2));
                        float f3 = 40;
                        lk3Var2.addView(appCompatImageView2, new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density)));
                        return appCompatImageView2;
                }
            }
        });
        final int i3 = 3;
        this.K0 = tu0.r(3, new k56() { // from class: ik3
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return lk3.w(context, this);
                    case 1:
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                        appCompatTextView2.setId(xoc.E);
                        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        appCompatTextView2.setSingleLine();
                        appCompatTextView2.setTextColor(qp4.u0.j(appCompatTextView2).getText().g);
                        i4f.m.b(appCompatTextView2, du4.b);
                        this.addView(appCompatTextView2, new ti3(0, tu0.G(20 * fk4.d().getDisplayMetrics().density)));
                        return appCompatTextView2;
                    case 2:
                        TextView textView = new TextView(context);
                        textView.setId(xoc.y);
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        textView.setSingleLine();
                        textView.setTextColor(qp4.u0.j(textView).getText().g);
                        i4f.q.b(textView, du4.b);
                        this.addView(textView, new ti3(0, tu0.G(20 * fk4.d().getDisplayMetrics().density)));
                        return textView;
                    case 3:
                        ImageView imageView = new ImageView(context);
                        imageView.setId(xoc.D);
                        qp4.u0.j(imageView).getIcon();
                        imageView.setImageTintList(ColorStateList.valueOf(-1));
                        float f = 40;
                        this.addView(imageView, new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
                        return imageView;
                    case 4:
                        OneMeButton oneMeButton = new OneMeButton(context, null);
                        oneMeButton.setId(xoc.B);
                        oneMeButton.setSize(c7a.b);
                        oneMeButton.setMode(b7a.o);
                        oneMeButton.setAppearance(z6a.a);
                        this.addView(oneMeButton, new ti3(-2, -2));
                        return oneMeButton;
                    case 5:
                        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
                        appCompatImageView.setId(xoc.M);
                        appCompatImageView.setImageResource(pub.videocam_outline_24);
                        lk3 lk3Var = this;
                        fka customTheme = lk3Var.getCustomTheme();
                        if (customTheme == null) {
                            customTheme = qp4.u0.j(appCompatImageView);
                        }
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(customTheme.getIcon().f));
                        int iG = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iG, iG, iG, iG);
                        int i22 = customTheme.d().a.a.c;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i22), null, shapeDrawable));
                        float f2 = 40;
                        lk3Var.addView(appCompatImageView, new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
                        return appCompatImageView;
                    default:
                        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, null);
                        appCompatImageView2.setId(xoc.z);
                        appCompatImageView2.setImageResource(pub.ic_audio_call_type_24);
                        lk3 lk3Var2 = this;
                        fka customTheme2 = lk3Var2.getCustomTheme();
                        if (customTheme2 == null) {
                            customTheme2 = qp4.u0.j(appCompatImageView2);
                        }
                        appCompatImageView2.setImageTintList(ColorStateList.valueOf(customTheme2.getIcon().f));
                        int iG2 = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView2.setPadding(iG2, iG2, iG2, iG2);
                        int i32 = customTheme2.d().a.a.c;
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        shapeDrawable2.getPaint().setColor(-1);
                        appCompatImageView2.setBackground(new RippleDrawable(ColorStateList.valueOf(i32), null, shapeDrawable2));
                        float f3 = 40;
                        lk3Var2.addView(appCompatImageView2, new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density)));
                        return appCompatImageView2;
                }
            }
        });
        final int i4 = 4;
        this.L0 = tu0.r(3, new k56() { // from class: ik3
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return lk3.w(context, this);
                    case 1:
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                        appCompatTextView2.setId(xoc.E);
                        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        appCompatTextView2.setSingleLine();
                        appCompatTextView2.setTextColor(qp4.u0.j(appCompatTextView2).getText().g);
                        i4f.m.b(appCompatTextView2, du4.b);
                        this.addView(appCompatTextView2, new ti3(0, tu0.G(20 * fk4.d().getDisplayMetrics().density)));
                        return appCompatTextView2;
                    case 2:
                        TextView textView = new TextView(context);
                        textView.setId(xoc.y);
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        textView.setSingleLine();
                        textView.setTextColor(qp4.u0.j(textView).getText().g);
                        i4f.q.b(textView, du4.b);
                        this.addView(textView, new ti3(0, tu0.G(20 * fk4.d().getDisplayMetrics().density)));
                        return textView;
                    case 3:
                        ImageView imageView = new ImageView(context);
                        imageView.setId(xoc.D);
                        qp4.u0.j(imageView).getIcon();
                        imageView.setImageTintList(ColorStateList.valueOf(-1));
                        float f = 40;
                        this.addView(imageView, new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
                        return imageView;
                    case 4:
                        OneMeButton oneMeButton = new OneMeButton(context, null);
                        oneMeButton.setId(xoc.B);
                        oneMeButton.setSize(c7a.b);
                        oneMeButton.setMode(b7a.o);
                        oneMeButton.setAppearance(z6a.a);
                        this.addView(oneMeButton, new ti3(-2, -2));
                        return oneMeButton;
                    case 5:
                        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
                        appCompatImageView.setId(xoc.M);
                        appCompatImageView.setImageResource(pub.videocam_outline_24);
                        lk3 lk3Var = this;
                        fka customTheme = lk3Var.getCustomTheme();
                        if (customTheme == null) {
                            customTheme = qp4.u0.j(appCompatImageView);
                        }
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(customTheme.getIcon().f));
                        int iG = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iG, iG, iG, iG);
                        int i22 = customTheme.d().a.a.c;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i22), null, shapeDrawable));
                        float f2 = 40;
                        lk3Var.addView(appCompatImageView, new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
                        return appCompatImageView;
                    default:
                        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, null);
                        appCompatImageView2.setId(xoc.z);
                        appCompatImageView2.setImageResource(pub.ic_audio_call_type_24);
                        lk3 lk3Var2 = this;
                        fka customTheme2 = lk3Var2.getCustomTheme();
                        if (customTheme2 == null) {
                            customTheme2 = qp4.u0.j(appCompatImageView2);
                        }
                        appCompatImageView2.setImageTintList(ColorStateList.valueOf(customTheme2.getIcon().f));
                        int iG2 = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView2.setPadding(iG2, iG2, iG2, iG2);
                        int i32 = customTheme2.d().a.a.c;
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        shapeDrawable2.getPaint().setColor(-1);
                        appCompatImageView2.setBackground(new RippleDrawable(ColorStateList.valueOf(i32), null, shapeDrawable2));
                        float f3 = 40;
                        lk3Var2.addView(appCompatImageView2, new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density)));
                        return appCompatImageView2;
                }
            }
        });
        final int i5 = 5;
        this.M0 = tu0.r(3, new k56() { // from class: ik3
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return lk3.w(context, this);
                    case 1:
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                        appCompatTextView2.setId(xoc.E);
                        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        appCompatTextView2.setSingleLine();
                        appCompatTextView2.setTextColor(qp4.u0.j(appCompatTextView2).getText().g);
                        i4f.m.b(appCompatTextView2, du4.b);
                        this.addView(appCompatTextView2, new ti3(0, tu0.G(20 * fk4.d().getDisplayMetrics().density)));
                        return appCompatTextView2;
                    case 2:
                        TextView textView = new TextView(context);
                        textView.setId(xoc.y);
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        textView.setSingleLine();
                        textView.setTextColor(qp4.u0.j(textView).getText().g);
                        i4f.q.b(textView, du4.b);
                        this.addView(textView, new ti3(0, tu0.G(20 * fk4.d().getDisplayMetrics().density)));
                        return textView;
                    case 3:
                        ImageView imageView = new ImageView(context);
                        imageView.setId(xoc.D);
                        qp4.u0.j(imageView).getIcon();
                        imageView.setImageTintList(ColorStateList.valueOf(-1));
                        float f = 40;
                        this.addView(imageView, new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
                        return imageView;
                    case 4:
                        OneMeButton oneMeButton = new OneMeButton(context, null);
                        oneMeButton.setId(xoc.B);
                        oneMeButton.setSize(c7a.b);
                        oneMeButton.setMode(b7a.o);
                        oneMeButton.setAppearance(z6a.a);
                        this.addView(oneMeButton, new ti3(-2, -2));
                        return oneMeButton;
                    case 5:
                        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
                        appCompatImageView.setId(xoc.M);
                        appCompatImageView.setImageResource(pub.videocam_outline_24);
                        lk3 lk3Var = this;
                        fka customTheme = lk3Var.getCustomTheme();
                        if (customTheme == null) {
                            customTheme = qp4.u0.j(appCompatImageView);
                        }
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(customTheme.getIcon().f));
                        int iG = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iG, iG, iG, iG);
                        int i22 = customTheme.d().a.a.c;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i22), null, shapeDrawable));
                        float f2 = 40;
                        lk3Var.addView(appCompatImageView, new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
                        return appCompatImageView;
                    default:
                        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, null);
                        appCompatImageView2.setId(xoc.z);
                        appCompatImageView2.setImageResource(pub.ic_audio_call_type_24);
                        lk3 lk3Var2 = this;
                        fka customTheme2 = lk3Var2.getCustomTheme();
                        if (customTheme2 == null) {
                            customTheme2 = qp4.u0.j(appCompatImageView2);
                        }
                        appCompatImageView2.setImageTintList(ColorStateList.valueOf(customTheme2.getIcon().f));
                        int iG2 = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView2.setPadding(iG2, iG2, iG2, iG2);
                        int i32 = customTheme2.d().a.a.c;
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        shapeDrawable2.getPaint().setColor(-1);
                        appCompatImageView2.setBackground(new RippleDrawable(ColorStateList.valueOf(i32), null, shapeDrawable2));
                        float f3 = 40;
                        lk3Var2.addView(appCompatImageView2, new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density)));
                        return appCompatImageView2;
                }
            }
        });
        final int i6 = 6;
        this.N0 = tu0.r(3, new k56() { // from class: ik3
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return lk3.w(context, this);
                    case 1:
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                        appCompatTextView2.setId(xoc.E);
                        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        appCompatTextView2.setSingleLine();
                        appCompatTextView2.setTextColor(qp4.u0.j(appCompatTextView2).getText().g);
                        i4f.m.b(appCompatTextView2, du4.b);
                        this.addView(appCompatTextView2, new ti3(0, tu0.G(20 * fk4.d().getDisplayMetrics().density)));
                        return appCompatTextView2;
                    case 2:
                        TextView textView = new TextView(context);
                        textView.setId(xoc.y);
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        textView.setSingleLine();
                        textView.setTextColor(qp4.u0.j(textView).getText().g);
                        i4f.q.b(textView, du4.b);
                        this.addView(textView, new ti3(0, tu0.G(20 * fk4.d().getDisplayMetrics().density)));
                        return textView;
                    case 3:
                        ImageView imageView = new ImageView(context);
                        imageView.setId(xoc.D);
                        qp4.u0.j(imageView).getIcon();
                        imageView.setImageTintList(ColorStateList.valueOf(-1));
                        float f = 40;
                        this.addView(imageView, new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
                        return imageView;
                    case 4:
                        OneMeButton oneMeButton = new OneMeButton(context, null);
                        oneMeButton.setId(xoc.B);
                        oneMeButton.setSize(c7a.b);
                        oneMeButton.setMode(b7a.o);
                        oneMeButton.setAppearance(z6a.a);
                        this.addView(oneMeButton, new ti3(-2, -2));
                        return oneMeButton;
                    case 5:
                        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
                        appCompatImageView.setId(xoc.M);
                        appCompatImageView.setImageResource(pub.videocam_outline_24);
                        lk3 lk3Var = this;
                        fka customTheme = lk3Var.getCustomTheme();
                        if (customTheme == null) {
                            customTheme = qp4.u0.j(appCompatImageView);
                        }
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(customTheme.getIcon().f));
                        int iG = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iG, iG, iG, iG);
                        int i22 = customTheme.d().a.a.c;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i22), null, shapeDrawable));
                        float f2 = 40;
                        lk3Var.addView(appCompatImageView, new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
                        return appCompatImageView;
                    default:
                        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, null);
                        appCompatImageView2.setId(xoc.z);
                        appCompatImageView2.setImageResource(pub.ic_audio_call_type_24);
                        lk3 lk3Var2 = this;
                        fka customTheme2 = lk3Var2.getCustomTheme();
                        if (customTheme2 == null) {
                            customTheme2 = qp4.u0.j(appCompatImageView2);
                        }
                        appCompatImageView2.setImageTintList(ColorStateList.valueOf(customTheme2.getIcon().f));
                        int iG2 = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView2.setPadding(iG2, iG2, iG2, iG2);
                        int i32 = customTheme2.d().a.a.c;
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        shapeDrawable2.getPaint().setColor(-1);
                        appCompatImageView2.setBackground(new RippleDrawable(ColorStateList.valueOf(i32), null, shapeDrawable2));
                        float f3 = 40;
                        lk3Var2.addView(appCompatImageView2, new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density)));
                        return appCompatImageView2;
                }
            }
        });
        this.O0 = tu0.r(3, new a5(context, 29));
        final int i7 = 0;
        this.P0 = tu0.r(3, new k56() { // from class: ik3
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return lk3.w(context, this);
                    case 1:
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                        appCompatTextView2.setId(xoc.E);
                        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        appCompatTextView2.setSingleLine();
                        appCompatTextView2.setTextColor(qp4.u0.j(appCompatTextView2).getText().g);
                        i4f.m.b(appCompatTextView2, du4.b);
                        this.addView(appCompatTextView2, new ti3(0, tu0.G(20 * fk4.d().getDisplayMetrics().density)));
                        return appCompatTextView2;
                    case 2:
                        TextView textView = new TextView(context);
                        textView.setId(xoc.y);
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        textView.setSingleLine();
                        textView.setTextColor(qp4.u0.j(textView).getText().g);
                        i4f.q.b(textView, du4.b);
                        this.addView(textView, new ti3(0, tu0.G(20 * fk4.d().getDisplayMetrics().density)));
                        return textView;
                    case 3:
                        ImageView imageView = new ImageView(context);
                        imageView.setId(xoc.D);
                        qp4.u0.j(imageView).getIcon();
                        imageView.setImageTintList(ColorStateList.valueOf(-1));
                        float f = 40;
                        this.addView(imageView, new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
                        return imageView;
                    case 4:
                        OneMeButton oneMeButton = new OneMeButton(context, null);
                        oneMeButton.setId(xoc.B);
                        oneMeButton.setSize(c7a.b);
                        oneMeButton.setMode(b7a.o);
                        oneMeButton.setAppearance(z6a.a);
                        this.addView(oneMeButton, new ti3(-2, -2));
                        return oneMeButton;
                    case 5:
                        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
                        appCompatImageView.setId(xoc.M);
                        appCompatImageView.setImageResource(pub.videocam_outline_24);
                        lk3 lk3Var = this;
                        fka customTheme = lk3Var.getCustomTheme();
                        if (customTheme == null) {
                            customTheme = qp4.u0.j(appCompatImageView);
                        }
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(customTheme.getIcon().f));
                        int iG = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iG, iG, iG, iG);
                        int i22 = customTheme.d().a.a.c;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i22), null, shapeDrawable));
                        float f2 = 40;
                        lk3Var.addView(appCompatImageView, new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
                        return appCompatImageView;
                    default:
                        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, null);
                        appCompatImageView2.setId(xoc.z);
                        appCompatImageView2.setImageResource(pub.ic_audio_call_type_24);
                        lk3 lk3Var2 = this;
                        fka customTheme2 = lk3Var2.getCustomTheme();
                        if (customTheme2 == null) {
                            customTheme2 = qp4.u0.j(appCompatImageView2);
                        }
                        appCompatImageView2.setImageTintList(ColorStateList.valueOf(customTheme2.getIcon().f));
                        int iG2 = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView2.setPadding(iG2, iG2, iG2, iG2);
                        int i32 = customTheme2.d().a.a.c;
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        shapeDrawable2.getPaint().setColor(-1);
                        appCompatImageView2.setBackground(new RippleDrawable(ColorStateList.valueOf(i32), null, shapeDrawable2));
                        float f3 = 40;
                        lk3Var2.addView(appCompatImageView2, new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density)));
                        return appCompatImageView2;
                }
            }
        });
        this.Q0 = tu0.r(3, new md1(24, this));
        this.R0 = new kk3(this, 0);
        this.S0 = new kk3(this, 1);
        this.T0 = new kk3(this, 2);
        this.U0 = new kk3(this, 3);
        this.V0 = tu0.r(3, new e11(0, this, lk3.class, "linesWithCallButtons", "linesWithCallButtons()Landroidx/constraintlayout/widget/ConstraintSet;", 0, 13));
        this.W0 = tu0.r(3, new e11(0, this, lk3.class, "lineWithCallButtons", "lineWithCallButtons()Landroidx/constraintlayout/widget/ConstraintSet;", 0, 9));
        this.X0 = nu0.L(new e11(0, this, lk3.class, "singleLineWithoutButton", "singleLineWithoutButton()Landroidx/constraintlayout/widget/ConstraintSet;", 0, 11));
        this.Y0 = tu0.r(3, new e11(0, this, lk3.class, "singleLineWithButton", "singleLineWithButton()Landroidx/constraintlayout/widget/ConstraintSet;", 0, 8));
        this.Z0 = tu0.r(3, new e11(0, this, lk3.class, "singleLineWithoutAvatar", "singleLineWithoutAvatar()Landroidx/constraintlayout/widget/ConstraintSet;", 0, 10));
        this.a1 = nu0.L(new e11(0, this, lk3.class, "twoLineWithoutButton", "twoLineWithoutButton()Landroidx/constraintlayout/widget/ConstraintSet;", 0, 15));
        this.b1 = nu0.L(new e11(0, this, lk3.class, "twoLineWithoutButtonWithBigAvatar", "twoLineWithoutButtonWithBigAvatar()Landroidx/constraintlayout/widget/ConstraintSet;", 0, 16));
        this.c1 = tu0.r(3, new e11(0, this, lk3.class, "twoLineWithButton", "twoLineWithButton()Landroidx/constraintlayout/widget/ConstraintSet;", 0, 12));
        this.d1 = tu0.r(3, new e11(0, this, lk3.class, "twoLineWithoutAvatar", "twoLineWithoutAvatar()Landroidx/constraintlayout/widget/ConstraintSet;", 0, 14));
        this.e1 = tu0.r(3, new e11(0, this, lk3.class, "allWithRadioButton", "allWithRadioButton()Landroidx/constraintlayout/widget/ConstraintSet;", 0, 17));
        int iG = tu0.G(40 * fk4.d().getDisplayMetrics().density);
        this.f1 = iG;
        int iG2 = tu0.G(60 * fk4.d().getDisplayMetrics().density);
        this.g1 = iG;
        float f = 12;
        float f2 = 6;
        setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        addView(s5aVar, new ti3(iG, iG));
        ti3 ti3Var = new ti3(-2, tu0.G(20 * fk4.d().getDisplayMetrics().density));
        ti3Var.E = 0.0f;
        addView(appCompatTextView, ti3Var);
        setLayoutParams(new ti3(-1, iG2));
        J();
    }

    public static final dj3 A(lk3 lk3Var) {
        lk3Var.getClass();
        dj3 dj3Var = new dj3();
        dj3Var.c(lk3Var);
        s5a s5aVar = lk3Var.G0;
        int id = s5aVar.getId();
        dj3Var.d(id, 3, 0, 3);
        dj3Var.d(id, 4, 0, 4);
        dj3Var.d(id, 6, 0, 6);
        AppCompatTextView appCompatTextView = lk3Var.H0;
        int id2 = appCompatTextView.getId();
        dj3Var.d(id2, 3, 0, 3);
        dj3Var.d(id2, 4, lk3Var.getMessageView().getId(), 3);
        dj3Var.d(id2, 6, s5aVar.getId(), 7);
        float f = 12;
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3Var, 6, id2, 4));
        dj3Var.d(id2, 7, lk3Var.getButtonAudioCallView().getId(), 6);
        new l2a(dj3Var, 7, id2, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f));
        dj3Var.g(id2).d.l0 = true;
        int id3 = lk3Var.getMessageView().getId();
        dj3Var.d(id3, 3, appCompatTextView.getId(), 4);
        au1.p(2, fk4.d().getDisplayMetrics().density, new l2a(dj3Var, 3, id3, 4));
        dj3Var.d(id3, 4, 0, 4);
        dj3Var.d(id3, 6, s5aVar.getId(), 7);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3Var, 6, id3, 4));
        dj3Var.d(id3, 7, lk3Var.getButtonAudioCallView().getId(), 6);
        new l2a(dj3Var, 7, id3, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f));
        dj3Var.g(id3).d.l0 = true;
        int id4 = lk3Var.getButtonAudioCallView().getId();
        dj3Var.d(id4, 3, 0, 3);
        dj3Var.d(id4, 4, 0, 4);
        dj3Var.d(id4, 7, lk3Var.getButtonVideoCallView().getId(), 6);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3Var, 7, id4, 4));
        int id5 = lk3Var.getButtonVideoCallView().getId();
        dj3Var.d(id5, 3, 0, 3);
        dj3Var.d(id5, 4, 0, 4);
        dj3Var.d(id5, 7, 0, 7);
        return dj3Var;
    }

    public static final dj3 B(lk3 lk3Var) {
        lk3Var.getClass();
        dj3 dj3Var = new dj3();
        dj3Var.c(lk3Var);
        s5a s5aVar = lk3Var.G0;
        int id = s5aVar.getId();
        dj3Var.d(id, 3, 0, 3);
        dj3Var.d(id, 4, 0, 4);
        dj3Var.d(id, 6, 0, 6);
        int id2 = lk3Var.H0.getId();
        dj3Var.d(id2, 3, 0, 3);
        dj3Var.d(id2, 4, 0, 4);
        dj3Var.d(id2, 6, s5aVar.getId(), 7);
        float f = 12;
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3Var, 6, id2, 4));
        dj3Var.d(id2, 7, lk3Var.getIconInfoView().getId(), 6);
        new l2a(dj3Var, 7, id2, 4).e(tu0.G(f * fk4.d().getDisplayMetrics().density));
        dj3Var.g(id2).d.l0 = true;
        int id3 = lk3Var.getIconInfoView().getId();
        dj3Var.d(id3, 3, 0, 3);
        dj3Var.d(id3, 4, 0, 4);
        dj3Var.d(id3, 7, lk3Var.getButtonView().getId(), 6);
        int id4 = lk3Var.getButtonView().getId();
        dj3Var.d(id4, 3, 0, 3);
        dj3Var.d(id4, 4, 0, 4);
        dj3Var.d(id4, 7, 0, 7);
        return dj3Var;
    }

    public static final dj3 C(lk3 lk3Var) {
        lk3Var.getClass();
        dj3 dj3Var = new dj3();
        dj3Var.c(lk3Var);
        s5a s5aVar = lk3Var.G0;
        int id = s5aVar.getId();
        dj3Var.d(id, 3, 0, 3);
        dj3Var.d(id, 4, 0, 4);
        dj3Var.d(id, 6, 0, 6);
        AppCompatTextView appCompatTextView = lk3Var.H0;
        int id2 = appCompatTextView.getId();
        dj3Var.d(id2, 3, 0, 3);
        dj3Var.d(id2, 4, 0, 4);
        dj3Var.d(id2, 6, s5aVar.getId(), 7);
        float f = 12;
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3Var, 6, id2, 4));
        je7 je7Var = lk3Var.J0;
        if (br7.H(je7Var)) {
            dj3Var.d(id2, 7, lk3Var.getAliasView().getId(), 6);
            au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3Var, 7, id2, 4));
        } else {
            dj3Var.d(id2, 7, 0, 7);
            new l2a(dj3Var, 7, id2, 4).e(0);
        }
        dj3Var.g(id2).d.l0 = true;
        if (br7.H(je7Var)) {
            int id3 = lk3Var.getAliasView().getId();
            dj3Var.d(id3, 3, appCompatTextView.getId(), 3);
            dj3Var.d(id3, 4, appCompatTextView.getId(), 4);
            dj3Var.d(id3, 7, 0, 7);
            new l2a(dj3Var, 7, id3, 4).e(tu0.G(f * fk4.d().getDisplayMetrics().density));
            dj3Var.g(id3).d.l0 = true;
        }
        return dj3Var;
    }

    public static final dj3 E(lk3 lk3Var) {
        lk3Var.getClass();
        dj3 dj3Var = new dj3();
        dj3Var.c(lk3Var);
        s5a s5aVar = lk3Var.G0;
        int id = s5aVar.getId();
        dj3Var.d(id, 3, 0, 3);
        dj3Var.d(id, 4, 0, 4);
        dj3Var.d(id, 6, 0, 6);
        AppCompatTextView appCompatTextView = lk3Var.H0;
        int id2 = appCompatTextView.getId();
        dj3Var.d(id2, 3, 0, 3);
        dj3Var.d(id2, 4, lk3Var.getMessageView().getId(), 3);
        dj3Var.d(id2, 6, s5aVar.getId(), 7);
        float f = 12;
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3Var, 6, id2, 4));
        dj3Var.d(id2, 7, lk3Var.getIconInfoView().getId(), 6);
        new l2a(dj3Var, 7, id2, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f));
        dj3Var.g(id2).d.l0 = true;
        int id3 = lk3Var.getMessageView().getId();
        dj3Var.d(id3, 3, appCompatTextView.getId(), 4);
        au1.p(2, fk4.d().getDisplayMetrics().density, new l2a(dj3Var, 3, id3, 4));
        dj3Var.d(id3, 4, 0, 4);
        dj3Var.d(id3, 6, s5aVar.getId(), 7);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3Var, 6, id3, 4));
        dj3Var.d(id3, 7, lk3Var.getIconInfoView().getId(), 6);
        new l2a(dj3Var, 7, id3, 4).e(tu0.G(f * fk4.d().getDisplayMetrics().density));
        dj3Var.g(id3).d.l0 = true;
        int id4 = lk3Var.getIconInfoView().getId();
        dj3Var.d(id4, 3, 0, 3);
        dj3Var.d(id4, 4, 0, 4);
        dj3Var.d(id4, 7, lk3Var.getButtonView().getId(), 6);
        int id5 = lk3Var.getButtonView().getId();
        dj3Var.d(id5, 3, 0, 3);
        dj3Var.d(id5, 4, 0, 4);
        dj3Var.d(id5, 7, 0, 7);
        return dj3Var;
    }

    public static final dj3 F(lk3 lk3Var) {
        lk3Var.getClass();
        dj3 dj3Var = new dj3();
        dj3Var.c(lk3Var);
        AppCompatTextView appCompatTextView = lk3Var.H0;
        int id = appCompatTextView.getId();
        dj3Var.d(id, 3, 0, 3);
        dj3Var.d(id, 4, lk3Var.getMessageView().getId(), 3);
        dj3Var.d(id, 6, 0, 6);
        new l2a(dj3Var, 6, id, 4).e(0);
        dj3Var.d(id, 7, 0, 7);
        new l2a(dj3Var, 7, id, 4).e(0);
        dj3Var.g(id).d.l0 = true;
        int id2 = lk3Var.getMessageView().getId();
        dj3Var.d(id2, 3, appCompatTextView.getId(), 4);
        au1.p(2, fk4.d().getDisplayMetrics().density, new l2a(dj3Var, 3, id2, 4));
        dj3Var.d(id2, 4, 0, 4);
        dj3Var.d(id2, 6, 0, 6);
        new l2a(dj3Var, 6, id2, 4).e(0);
        dj3Var.d(id2, 7, 0, 7);
        new l2a(dj3Var, 7, id2, 4).e(0);
        dj3Var.g(id2).d.l0 = true;
        return dj3Var;
    }

    public static final dj3 G(lk3 lk3Var) {
        lk3Var.getClass();
        dj3 dj3Var = new dj3();
        dj3Var.c(lk3Var);
        s5a s5aVar = lk3Var.G0;
        int id = s5aVar.getId();
        dj3Var.d(id, 3, 0, 3);
        dj3Var.d(id, 4, 0, 4);
        dj3Var.d(id, 6, 0, 6);
        AppCompatTextView appCompatTextView = lk3Var.H0;
        int id2 = appCompatTextView.getId();
        dj3Var.d(id2, 3, 0, 3);
        dj3Var.d(id2, 4, lk3Var.getMessageView().getId(), 3);
        dj3Var.d(id2, 6, s5aVar.getId(), 7);
        float f = 12;
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3Var, 6, id2, 4));
        je7 je7Var = lk3Var.J0;
        if (br7.H(je7Var)) {
            dj3Var.d(id2, 7, lk3Var.getAliasView().getId(), 6);
            au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3Var, 7, id2, 4));
        } else {
            dj3Var.d(id2, 7, 0, 7);
            new l2a(dj3Var, 7, id2, 4).e(0);
        }
        dj3Var.g(id2).d.l0 = true;
        int id3 = lk3Var.getMessageView().getId();
        dj3Var.d(id3, 3, appCompatTextView.getId(), 4);
        au1.p(2, fk4.d().getDisplayMetrics().density, new l2a(dj3Var, 3, id3, 4));
        dj3Var.d(id3, 4, 0, 4);
        dj3Var.d(id3, 6, s5aVar.getId(), 7);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3Var, 6, id3, 4));
        dj3Var.d(id3, 7, 0, 7);
        new l2a(dj3Var, 7, id3, 4).e(0);
        dj3Var.g(id3).d.l0 = true;
        if (br7.H(je7Var)) {
            int id4 = lk3Var.getAliasView().getId();
            dj3Var.d(id4, 3, appCompatTextView.getId(), 3);
            dj3Var.d(id4, 4, lk3Var.getMessageView().getId(), 4);
            dj3Var.d(id4, 7, 0, 7);
            new l2a(dj3Var, 7, id4, 4).e(tu0.G(f * fk4.d().getDisplayMetrics().density));
            dj3Var.g(id4).d.l0 = true;
        }
        return dj3Var;
    }

    public static final dj3 I(lk3 lk3Var) {
        lk3Var.getClass();
        dj3 dj3Var = new dj3();
        dj3Var.c(lk3Var);
        s5a s5aVar = lk3Var.G0;
        int id = s5aVar.getId();
        dj3Var.d(id, 3, 0, 3);
        dj3Var.d(id, 4, 0, 4);
        dj3Var.d(id, 6, 0, 6);
        dj3Var.g(id).d.b = lk3Var.g1;
        dj3Var.g(id).d.c = lk3Var.g1;
        AppCompatTextView appCompatTextView = lk3Var.H0;
        sh0 sh0Var = new sh0(appCompatTextView.getId(), 4, dj3Var);
        sh0Var.G(0);
        sh0Var.f(lk3Var.getMessageView().getId());
        float f = 12;
        au1.p(f, fk4.d().getDisplayMetrics().density, sh0Var.C(s5aVar.getId()));
        je7 je7Var = lk3Var.J0;
        if (br7.H(je7Var)) {
            au1.p(f, fk4.d().getDisplayMetrics().density, sh0Var.p(lk3Var.getAliasView().getId()));
        } else {
            sh0Var.n(0).e(0);
        }
        sh0Var.h();
        sh0Var.I();
        int id2 = lk3Var.getMessageView().getId();
        dj3Var.d(id2, 3, appCompatTextView.getId(), 4);
        au1.p(2, fk4.d().getDisplayMetrics().density, new l2a(dj3Var, 3, id2, 4));
        dj3Var.d(id2, 4, 0, 4);
        dj3Var.d(id2, 6, s5aVar.getId(), 7);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3Var, 6, id2, 4));
        dj3Var.d(id2, 7, 0, 7);
        new l2a(dj3Var, 7, id2, 4).e(0);
        dj3Var.g(id2).d.l0 = true;
        if (br7.H(je7Var)) {
            int id3 = lk3Var.getAliasView().getId();
            dj3Var.d(id3, 3, appCompatTextView.getId(), 3);
            dj3Var.d(id3, 4, lk3Var.getMessageView().getId(), 4);
            dj3Var.d(id3, 7, 0, 7);
            new l2a(dj3Var, 7, id3, 4).e(tu0.G(f * fk4.d().getDisplayMetrics().density));
            dj3Var.g(id3).d.l0 = true;
        }
        return dj3Var;
    }

    public static /* synthetic */ void S(lk3 lk3Var, Integer num, b7a b7aVar, k56 k56Var, int i) {
        if ((i & 2) != 0) {
            b7aVar = b7a.b;
        }
        lk3Var.R(num, b7aVar, z6a.c, k56Var);
    }

    private final TextView getAliasView() {
        return (TextView) this.J0.getValue();
    }

    private final AppCompatImageView getButtonAudioCallView() {
        return (AppCompatImageView) this.N0.getValue();
    }

    private final AppCompatImageView getButtonVideoCallView() {
        return (AppCompatImageView) this.M0.getValue();
    }

    private final OneMeButton getButtonView() {
        return (OneMeButton) this.L0.getValue();
    }

    private final StateListDrawable getCheckboxDrawable() {
        return (StateListDrawable) this.O0.getValue();
    }

    private final ImageView getIconInfoView() {
        return (ImageView) this.K0.getValue();
    }

    private final TextView getMessageView() {
        return (TextView) this.I0.getValue();
    }

    private final RippleDrawable getRippleDrawable() {
        return (RippleDrawable) this.Q0.getValue();
    }

    private final dj3 getSingleLineWithButtonConstraint() {
        return (dj3) this.Y0.getValue();
    }

    private final dj3 getSingleLineWithCallButtonConstraint() {
        return (dj3) this.W0.getValue();
    }

    private final dj3 getSingleLineWithoutAvatarConstraint() {
        return (dj3) this.Z0.getValue();
    }

    private final dj3 getTwoLineWithButtonConstraint() {
        return (dj3) this.c1.getValue();
    }

    private final dj3 getTwoLineWithCallButtonConstraint() {
        return (dj3) this.V0.getValue();
    }

    private final dj3 getTwoLineWithoutAvatarConstraint() {
        return (dj3) this.d1.getValue();
    }

    private final dj3 getWithRadioButtonConstraint() {
        return (dj3) this.e1.getValue();
    }

    public static AppCompatCheckBox w(Context context, lk3 lk3Var) {
        AppCompatCheckBox appCompatCheckBox = new AppCompatCheckBox(context, null);
        appCompatCheckBox.setId(xoc.C);
        appCompatCheckBox.setPadding(0, 0, 0, 0);
        appCompatCheckBox.setButtonDrawable((Drawable) null);
        appCompatCheckBox.setBackground(lk3Var.getCheckboxDrawable());
        appCompatCheckBox.setClickable(false);
        float f = 24;
        lk3Var.addView(appCompatCheckBox, new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        return appCompatCheckBox;
    }

    public static final void x(lk3 lk3Var) {
        if (br7.H(lk3Var.P0)) {
            lk3Var.getWithRadioButtonConstraint().a(lk3Var);
        } else {
            lk3Var.J();
        }
    }

    public static final dj3 y(lk3 lk3Var) {
        lk3Var.getClass();
        dj3 dj3Var = new dj3();
        dj3Var.c(lk3Var);
        s5a s5aVar = lk3Var.G0;
        int id = s5aVar.getId();
        dj3Var.d(id, 3, 0, 3);
        dj3Var.d(id, 4, 0, 4);
        dj3Var.d(id, 6, 0, 6);
        int id2 = lk3Var.H0.getId();
        dj3Var.d(id2, 3, 0, 3);
        dj3Var.d(id2, 4, 0, 4);
        dj3Var.d(id2, 6, s5aVar.getId(), 7);
        float f = 12;
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3Var, 6, id2, 4));
        dj3Var.d(id2, 7, lk3Var.getButtonAudioCallView().getId(), 6);
        new l2a(dj3Var, 7, id2, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f));
        dj3Var.g(id2).d.l0 = true;
        int id3 = lk3Var.getButtonAudioCallView().getId();
        dj3Var.d(id3, 3, 0, 3);
        dj3Var.d(id3, 4, 0, 4);
        dj3Var.d(id3, 7, lk3Var.getButtonVideoCallView().getId(), 6);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3Var, 7, id3, 4));
        int id4 = lk3Var.getButtonVideoCallView().getId();
        dj3Var.d(id4, 3, 0, 3);
        dj3Var.d(id4, 4, 0, 4);
        dj3Var.d(id4, 7, 0, 7);
        return dj3Var;
    }

    public final void J() {
        CharSequence text;
        boolean z = this.G0.getVisibility() == 0;
        boolean z2 = (!br7.H(this.I0) || (text = getMessageView().getText()) == null || w9e.C0(text)) ? false : true;
        boolean zH = br7.H(this.L0);
        boolean z3 = br7.H(this.M0) || br7.H(this.N0);
        ((z2 || !z3) ? z3 ? getTwoLineWithCallButtonConstraint() : (z || z2) ? !z ? getTwoLineWithoutAvatarConstraint() : (z2 || zH) ? (z2 || !zH) ? (!z2 || zH || this.g1 == this.f1) ? (!z2 || zH) ? getTwoLineWithButtonConstraint() : (dj3) this.a1.getValue() : (dj3) this.b1.getValue() : getSingleLineWithButtonConstraint() : (dj3) this.X0.getValue() : getSingleLineWithoutAvatarConstraint() : getSingleLineWithCallButtonConstraint()).a(this);
    }

    public final boolean K(String str) {
        return (str == null || str.length() == 0 || getMessageView().getPaint().measureText(str) <= ((float) getMessageView().getMeasuredWidth())) ? false : true;
    }

    public final boolean M(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        AppCompatTextView appCompatTextView = this.H0;
        return appCompatTextView.getPaint().measureText(str) > ((float) appCompatTextView.getMeasuredWidth());
    }

    public final void N() {
        if (br7.H(this.L0)) {
            getButtonView().setOnClickListener(null);
            getButtonView().setVisibility(8);
        }
        if (br7.H(this.N0)) {
            getButtonAudioCallView().setOnClickListener(null);
            getButtonAudioCallView().setVisibility(8);
        }
        if (br7.H(this.M0)) {
            getButtonVideoCallView().setOnClickListener(null);
            getButtonVideoCallView().setVisibility(8);
        }
        J();
    }

    public final void O(long j, CharSequence charSequence, String str) {
        s5a.i(this.G0, str, Long.valueOf(j), charSequence);
    }

    public final void P(CharSequence charSequence, k56 k56Var) {
        OneMeButton buttonView = getButtonView();
        buttonView.setText(charSequence);
        tu0.K(buttonView, 300L, new m6(6, k56Var));
        buttonView.setVisibility(0);
        buttonView.setMode(b7a.o);
        buttonView.setAppearance(z6a.a);
        buttonView.setSize(c7a.b);
        J();
    }

    public final void Q(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, m56 m56Var) {
        AppCompatImageView buttonAudioCallView = getButtonAudioCallView();
        tu0.K(buttonAudioCallView, 300L, new hk3(2, m56Var));
        buttonAudioCallView.setImageDrawable(layerDrawable);
        float f = 0;
        int iG = tu0.G(fk4.d().getDisplayMetrics().density * f);
        buttonAudioCallView.setPadding(iG, iG, iG, iG);
        buttonAudioCallView.setVisibility(0);
        AppCompatImageView buttonVideoCallView = getButtonVideoCallView();
        tu0.K(buttonVideoCallView, 300L, new hk3(3, m56Var));
        buttonVideoCallView.setImageDrawable(layerDrawable2);
        int iG2 = tu0.G(f * fk4.d().getDisplayMetrics().density);
        buttonVideoCallView.setPadding(iG2, iG2, iG2, iG2);
        buttonVideoCallView.setVisibility(0);
        T();
        J();
    }

    public final void R(Integer num, b7a b7aVar, z6a z6aVar, k56 k56Var) {
        if (num == null) {
            je7 je7Var = this.L0;
            if (je7Var.a()) {
                ((OneMeButton) je7Var.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        OneMeButton buttonView = getButtonView();
        bc7[] bc7VarArr = OneMeButton.B0;
        buttonView.d(num, true);
        tu0.K(buttonView, 300L, new m6(5, k56Var));
        buttonView.setVisibility(0);
        buttonView.setMode(b7aVar);
        buttonView.setAppearance(z6aVar);
        buttonView.setSize(c7a.b);
        J();
    }

    public final void T() {
        int i;
        int i2;
        fka customTheme = getCustomTheme();
        if (customTheme == null) {
            customTheme = qp4.u0.j(this);
        }
        je7 je7Var = this.N0;
        if (je7Var.a()) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) je7Var.getValue();
            int iOrdinal = getCallButtonMode().ordinal();
            if (iOrdinal == 0) {
                i2 = customTheme.getIcon().f;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = customTheme.getIcon().e;
            }
            appCompatImageView.setImageTintList(ColorStateList.valueOf(i2));
        }
        je7 je7Var2 = this.M0;
        if (je7Var2.a()) {
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) je7Var2.getValue();
            int iOrdinal2 = getCallButtonMode().ordinal();
            if (iOrdinal2 == 0) {
                i = customTheme.getIcon().f;
            } else {
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i = customTheme.getIcon().c;
            }
            appCompatImageView2.setImageTintList(ColorStateList.valueOf(i));
        }
    }

    public final View getAnchorButton() {
        return getButtonView();
    }

    public final jk3 getCallButtonMode() {
        bc7 bc7Var = h1[3];
        return (jk3) this.U0.b;
    }

    public final fka getCustomTheme() {
        bc7 bc7Var = h1[2];
        return (fka) this.T0.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        onThemeChanged(qp4.u0.j(this));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) throws Resources.NotFoundException, NumberFormatException {
        if (qqe.c(this.H0)) {
            setVerified(true);
        }
        super.onMeasure(i, i2);
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        fka customTheme = getCustomTheme();
        if (customTheme == null) {
            customTheme = fkaVar;
        }
        this.G0.onThemeChanged(customTheme);
        getIconInfoView().setImageTintList(ColorStateList.valueOf(-1));
        this.H0.setTextColor(customTheme.getText().e);
        je7 je7Var = this.I0;
        if (je7Var.a()) {
            ((TextView) je7Var.getValue()).setTextColor(customTheme.getText().g);
        }
        je7 je7Var2 = this.J0;
        if (je7Var2.a()) {
            ((TextView) je7Var2.getValue()).setTextColor(customTheme.getText().g);
        }
        getRippleDrawable().setColor(ColorStateList.valueOf(customTheme.d().a.a.h));
        T();
        je7 je7Var3 = this.P0;
        if (je7Var3.a()) {
            a14.g(getCheckboxDrawable(), fkaVar);
        }
    }

    public final void setAlias(CharSequence charSequence) {
        CharSequence text;
        if ((charSequence == null || w9e.C0(charSequence)) && getAliasView().getVisibility() != 0) {
            return;
        }
        boolean zH = br7.H(this.I0);
        c32 c32Var = c32.Y;
        if (!zH || (text = getMessageView().getText()) == null || w9e.C0(text)) {
            this.X0.b = c32Var;
        } else {
            this.a1.b = c32Var;
        }
        getAliasView().setText(charSequence);
        getAliasView().setVisibility((charSequence == null || w9e.C0(charSequence)) ^ true ? 0 : 8);
        J();
    }

    public final void setCallButtonMode(jk3 jk3Var) {
        this.U0.o1(this, h1[3], jk3Var);
    }

    public final void setCallButtons(m56 m56Var) {
        tu0.K(getButtonAudioCallView(), 300L, new hk3(0, m56Var));
        tu0.K(getButtonVideoCallView(), 300L, new hk3(1, m56Var));
        getButtonAudioCallView().setVisibility(0);
        getButtonAudioCallView().setVisibility(0);
        J();
    }

    public final void setContactSelected(boolean z) {
        this.S0.o1(this, h1[1], Boolean.valueOf(z));
    }

    public final void setCustomTheme(fka fkaVar) {
        this.T0.o1(this, h1[2], fkaVar);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(z ? 1.0f : 0.4f);
    }

    public final void setIconInfo(Integer num) {
        if (num == null) {
            je7 je7Var = this.K0;
            if (je7Var.a()) {
                ((ImageView) je7Var.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        ImageView iconInfoView = getIconInfoView();
        iconInfoView.setImageResource(num.intValue());
        iconInfoView.setVisibility(0);
        J();
    }

    public final void setMessage(CharSequence charSequence) {
        if ((charSequence == null || w9e.C0(charSequence)) && !br7.H(this.I0)) {
            return;
        }
        getMessageView().setText(charSequence);
        getMessageView().setVisibility((charSequence == null || w9e.C0(charSequence)) ^ true ? 0 : 8);
        J();
    }

    public final void setName(CharSequence charSequence) {
        this.H0.setText(charSequence);
        J();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        setBackground(onClickListener != null ? getRippleDrawable() : null);
    }

    public final void setOnline(boolean z) {
        this.G0.setOnlineBadgeVisibility(z);
    }

    public final void setSelectionEnabled(boolean z) {
        this.R0.o1(this, h1[0], Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setVerified(boolean r5) {
        /*
            r4 = this;
            androidx.appcompat.widget.AppCompatTextView r0 = r4.H0
            float r1 = defpackage.qqe.e(r0)
            int r1 = defpackage.i24.I(r1)
            r2 = 0
            if (r5 == 0) goto L1a
            ecf r3 = defpackage.qqe.a(r0)
            if (r3 == 0) goto L16
            int r3 = r3.a
            goto L17
        L16:
            r3 = r2
        L17:
            if (r3 != r1) goto L1a
            return
        L1a:
            if (r5 == 0) goto L36
            ecf r5 = defpackage.qqe.a(r0)
            if (r5 == 0) goto L24
            int r2 = r5.a
        L24:
            if (r2 == r1) goto L36
            ecf r5 = new ecf
            android.content.Context r4 = r4.getContext()
            pz2 r2 = new pz2
            r3 = 6
            r2.<init>(r3)
            r5.<init>(r4, r1, r2)
            goto L37
        L36:
            r5 = 0
        L37:
            defpackage.qqe.d(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lk3.setVerified(boolean):void");
    }

    public final void setName(int i) {
        this.H0.setText(i);
        J();
    }
}
