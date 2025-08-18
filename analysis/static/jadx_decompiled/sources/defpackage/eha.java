package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class eha extends FrameLayout implements kre {
    public static final /* synthetic */ int I0 = 0;
    public cha A0;
    public final je7 B0;
    public final je7 C0;
    public final je7 D0;
    public final je7 E0;
    public final je7 F0;
    public final ValueAnimator G0;
    public final ValueAnimator H0;
    public final int a;
    public final int b;
    public final int c;
    public CharSequence o;
    public String s0;
    public aha t0;
    public bha u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eha(final Context context) {
        super(context, null);
        final AttributeSet attributeSet = null;
        this.a = getResources().getDimensionPixelSize(utb.spacing_size_s);
        this.b = getResources().getDimensionPixelSize(utb.spacing_size_l);
        this.c = getResources().getDimensionPixelSize(utb.spacing_size_xl);
        this.s0 = getResources().getString(a2c.oneme_search_view_default_hint);
        this.t0 = aha.a;
        this.v0 = true;
        this.w0 = true;
        this.x0 = true;
        this.y0 = true;
        this.z0 = true;
        this.A0 = cha.a;
        final int i = 0;
        this.B0 = tu0.r(3, new k56() { // from class: wga
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        AppCompatImageView appCompatImageView = new AppCompatImageView(context, attributeSet);
                        appCompatImageView.setId(xoc.u0);
                        int iG = tu0.G(30 * fk4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iG, iG);
                        layoutParams.gravity = 8388627;
                        final eha ehaVar = this;
                        layoutParams.leftMargin = ehaVar.c;
                        appCompatImageView.setLayoutParams(layoutParams);
                        int iG2 = tu0.G(1 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iG2, iG2, iG2, iG2);
                        appCompatImageView.setImageResource(woc.d0);
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(qp4.u0.j(appCompatImageView).getIcon().f));
                        final int i2 = 1;
                        tu0.K(appCompatImageView, 300L, new View.OnClickListener() { // from class: xga
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i2) {
                                    case 0:
                                        ehaVar.d();
                                        break;
                                    case 1:
                                        eha ehaVar2 = ehaVar;
                                        ehaVar2.b();
                                        bha bhaVar = ehaVar2.u0;
                                        if (bhaVar != null) {
                                            bhaVar.p();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        ehaVar.d();
                                        break;
                                    default:
                                        ((AppCompatEditText) ehaVar.C0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        ehaVar.addView(appCompatImageView);
                        return appCompatImageView;
                    case 1:
                        final AppCompatEditText appCompatEditText = new AppCompatEditText(context, attributeSet);
                        appCompatEditText.setId(xoc.v0);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(0, -2);
                        layoutParams2.gravity = 8388629;
                        int iG3 = tu0.G(30 * fk4.d().getDisplayMetrics().density);
                        eha ehaVar2 = this;
                        int i3 = ehaVar2.c;
                        layoutParams2.leftMargin = iG3 + i3 + i3;
                        int i4 = ehaVar2.a;
                        layoutParams2.topMargin = i4;
                        layoutParams2.bottomMargin = i4;
                        appCompatEditText.setLayoutParams(layoutParams2);
                        appCompatEditText.setClipToOutline(true);
                        appCompatEditText.setOutlineProvider(new ix3(tu0.G(10 * fk4.d().getDisplayMetrics().density)));
                        appCompatEditText.setImeOptions(3);
                        appCompatEditText.setText(ehaVar2.o);
                        int iG4 = tu0.G(40 * fk4.d().getDisplayMetrics().density);
                        int i5 = ehaVar2.b;
                        appCompatEditText.setPadding(i3, i5, iG4, i5);
                        pq9 pq9Var = qp4.u0;
                        appCompatEditText.setBackgroundColor(pq9Var.j(appCompatEditText).b().a.g);
                        i4f.l.b(appCompatEditText, du4.b);
                        Drawable textCursorDrawable = appCompatEditText.getTextCursorDrawable();
                        if (textCursorDrawable != null) {
                            ngg.G(textCursorDrawable, pq9Var.j(appCompatEditText).getText().j);
                        }
                        appCompatEditText.setHintTextColor(pq9Var.j(appCompatEditText).getText().g);
                        appCompatEditText.setTextColor(pq9Var.j(appCompatEditText).getText().e);
                        appCompatEditText.setSingleLine();
                        appCompatEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: zga
                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView, int i6, KeyEvent keyEvent) {
                                if (i6 != 3) {
                                    return false;
                                }
                                mr0.I(appCompatEditText);
                                return true;
                            }
                        });
                        pla.a(appCompatEditText, new q57(17, appCompatEditText, appCompatEditText));
                        appCompatEditText.addTextChangedListener(new z2(5, ehaVar2));
                        ehaVar2.addView(appCompatEditText);
                        return appCompatEditText;
                    case 2:
                        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, attributeSet);
                        appCompatImageView2.setId(xoc.x0);
                        int iG5 = tu0.G(24 * fk4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iG5, iG5);
                        layoutParams3.gravity = 8388629;
                        appCompatImageView2.setLayoutParams(layoutParams3);
                        int iG6 = tu0.G(2 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView2.setPadding(iG6, iG6, iG6, iG6);
                        appCompatImageView2.setImageResource(woc.O0);
                        appCompatImageView2.setImageTintList(ColorStateList.valueOf(qp4.u0.j(appCompatImageView2).getIcon().f));
                        final eha ehaVar3 = this;
                        final int i6 = 0;
                        tu0.K(appCompatImageView2, 300L, new View.OnClickListener() { // from class: xga
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i6) {
                                    case 0:
                                        ehaVar3.d();
                                        break;
                                    case 1:
                                        eha ehaVar22 = ehaVar3;
                                        ehaVar22.b();
                                        bha bhaVar = ehaVar22.u0;
                                        if (bhaVar != null) {
                                            bhaVar.p();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        ehaVar3.d();
                                        break;
                                    default:
                                        ((AppCompatEditText) ehaVar3.C0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        ehaVar3.addView(appCompatImageView2);
                        return appCompatImageView2;
                    case 3:
                        ImageView imageView = new ImageView(context, attributeSet);
                        imageView.setId(xoc.y0);
                        float f = 32;
                        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                        layoutParams4.gravity = 8388629;
                        imageView.setLayoutParams(layoutParams4);
                        int iG7 = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                        imageView.setPadding(iG7, iG7, iG7, iG7);
                        imageView.setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 12.0f));
                        imageView.setImageResource(woc.O0);
                        final eha ehaVar4 = this;
                        final int i7 = 2;
                        tu0.K(imageView, 300L, new View.OnClickListener() { // from class: xga
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i7) {
                                    case 0:
                                        ehaVar4.d();
                                        break;
                                    case 1:
                                        eha ehaVar22 = ehaVar4;
                                        ehaVar22.b();
                                        bha bhaVar = ehaVar22.u0;
                                        if (bhaVar != null) {
                                            bhaVar.p();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        ehaVar4.d();
                                        break;
                                    default:
                                        ((AppCompatEditText) ehaVar4.C0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        v3c.y(new br(3, (Continuation) null, 11), imageView);
                        ehaVar4.addView(imageView);
                        return imageView;
                    default:
                        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context, attributeSet);
                        appCompatImageView3.setId(xoc.w0);
                        int iG8 = tu0.G(40 * fk4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(iG8, iG8);
                        layoutParams5.gravity = 8388629;
                        appCompatImageView3.setLayoutParams(layoutParams5);
                        final eha ehaVar5 = this;
                        Editable text = ((AppCompatEditText) ehaVar5.C0.getValue()).getText();
                        appCompatImageView3.setVisibility((text == null || text.length() == 0) ^ true ? 0 : 8);
                        int iG9 = tu0.G(12 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView3.setPadding(iG9, iG9, iG9, iG9);
                        appCompatImageView3.setImageResource(woc.n0);
                        appCompatImageView3.setImageTintList(ColorStateList.valueOf(qp4.u0.j(appCompatImageView3).getIcon().j));
                        final int i8 = 3;
                        tu0.K(appCompatImageView3, 300L, new View.OnClickListener() { // from class: xga
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i8) {
                                    case 0:
                                        ehaVar5.d();
                                        break;
                                    case 1:
                                        eha ehaVar22 = ehaVar5;
                                        ehaVar22.b();
                                        bha bhaVar = ehaVar22.u0;
                                        if (bhaVar != null) {
                                            bhaVar.p();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        ehaVar5.d();
                                        break;
                                    default:
                                        ((AppCompatEditText) ehaVar5.C0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        ehaVar5.addView(appCompatImageView3);
                        return appCompatImageView3;
                }
            }
        });
        final int i2 = 1;
        this.C0 = tu0.r(3, new k56() { // from class: wga
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        AppCompatImageView appCompatImageView = new AppCompatImageView(context, attributeSet);
                        appCompatImageView.setId(xoc.u0);
                        int iG = tu0.G(30 * fk4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iG, iG);
                        layoutParams.gravity = 8388627;
                        final eha ehaVar = this;
                        layoutParams.leftMargin = ehaVar.c;
                        appCompatImageView.setLayoutParams(layoutParams);
                        int iG2 = tu0.G(1 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iG2, iG2, iG2, iG2);
                        appCompatImageView.setImageResource(woc.d0);
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(qp4.u0.j(appCompatImageView).getIcon().f));
                        final int i22 = 1;
                        tu0.K(appCompatImageView, 300L, new View.OnClickListener() { // from class: xga
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i22) {
                                    case 0:
                                        ehaVar.d();
                                        break;
                                    case 1:
                                        eha ehaVar22 = ehaVar;
                                        ehaVar22.b();
                                        bha bhaVar = ehaVar22.u0;
                                        if (bhaVar != null) {
                                            bhaVar.p();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        ehaVar.d();
                                        break;
                                    default:
                                        ((AppCompatEditText) ehaVar.C0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        ehaVar.addView(appCompatImageView);
                        return appCompatImageView;
                    case 1:
                        final AppCompatEditText appCompatEditText = new AppCompatEditText(context, attributeSet);
                        appCompatEditText.setId(xoc.v0);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(0, -2);
                        layoutParams2.gravity = 8388629;
                        int iG3 = tu0.G(30 * fk4.d().getDisplayMetrics().density);
                        eha ehaVar2 = this;
                        int i3 = ehaVar2.c;
                        layoutParams2.leftMargin = iG3 + i3 + i3;
                        int i4 = ehaVar2.a;
                        layoutParams2.topMargin = i4;
                        layoutParams2.bottomMargin = i4;
                        appCompatEditText.setLayoutParams(layoutParams2);
                        appCompatEditText.setClipToOutline(true);
                        appCompatEditText.setOutlineProvider(new ix3(tu0.G(10 * fk4.d().getDisplayMetrics().density)));
                        appCompatEditText.setImeOptions(3);
                        appCompatEditText.setText(ehaVar2.o);
                        int iG4 = tu0.G(40 * fk4.d().getDisplayMetrics().density);
                        int i5 = ehaVar2.b;
                        appCompatEditText.setPadding(i3, i5, iG4, i5);
                        pq9 pq9Var = qp4.u0;
                        appCompatEditText.setBackgroundColor(pq9Var.j(appCompatEditText).b().a.g);
                        i4f.l.b(appCompatEditText, du4.b);
                        Drawable textCursorDrawable = appCompatEditText.getTextCursorDrawable();
                        if (textCursorDrawable != null) {
                            ngg.G(textCursorDrawable, pq9Var.j(appCompatEditText).getText().j);
                        }
                        appCompatEditText.setHintTextColor(pq9Var.j(appCompatEditText).getText().g);
                        appCompatEditText.setTextColor(pq9Var.j(appCompatEditText).getText().e);
                        appCompatEditText.setSingleLine();
                        appCompatEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: zga
                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView, int i6, KeyEvent keyEvent) {
                                if (i6 != 3) {
                                    return false;
                                }
                                mr0.I(appCompatEditText);
                                return true;
                            }
                        });
                        pla.a(appCompatEditText, new q57(17, appCompatEditText, appCompatEditText));
                        appCompatEditText.addTextChangedListener(new z2(5, ehaVar2));
                        ehaVar2.addView(appCompatEditText);
                        return appCompatEditText;
                    case 2:
                        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, attributeSet);
                        appCompatImageView2.setId(xoc.x0);
                        int iG5 = tu0.G(24 * fk4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iG5, iG5);
                        layoutParams3.gravity = 8388629;
                        appCompatImageView2.setLayoutParams(layoutParams3);
                        int iG6 = tu0.G(2 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView2.setPadding(iG6, iG6, iG6, iG6);
                        appCompatImageView2.setImageResource(woc.O0);
                        appCompatImageView2.setImageTintList(ColorStateList.valueOf(qp4.u0.j(appCompatImageView2).getIcon().f));
                        final eha ehaVar3 = this;
                        final int i6 = 0;
                        tu0.K(appCompatImageView2, 300L, new View.OnClickListener() { // from class: xga
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i6) {
                                    case 0:
                                        ehaVar3.d();
                                        break;
                                    case 1:
                                        eha ehaVar22 = ehaVar3;
                                        ehaVar22.b();
                                        bha bhaVar = ehaVar22.u0;
                                        if (bhaVar != null) {
                                            bhaVar.p();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        ehaVar3.d();
                                        break;
                                    default:
                                        ((AppCompatEditText) ehaVar3.C0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        ehaVar3.addView(appCompatImageView2);
                        return appCompatImageView2;
                    case 3:
                        ImageView imageView = new ImageView(context, attributeSet);
                        imageView.setId(xoc.y0);
                        float f = 32;
                        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                        layoutParams4.gravity = 8388629;
                        imageView.setLayoutParams(layoutParams4);
                        int iG7 = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                        imageView.setPadding(iG7, iG7, iG7, iG7);
                        imageView.setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 12.0f));
                        imageView.setImageResource(woc.O0);
                        final eha ehaVar4 = this;
                        final int i7 = 2;
                        tu0.K(imageView, 300L, new View.OnClickListener() { // from class: xga
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i7) {
                                    case 0:
                                        ehaVar4.d();
                                        break;
                                    case 1:
                                        eha ehaVar22 = ehaVar4;
                                        ehaVar22.b();
                                        bha bhaVar = ehaVar22.u0;
                                        if (bhaVar != null) {
                                            bhaVar.p();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        ehaVar4.d();
                                        break;
                                    default:
                                        ((AppCompatEditText) ehaVar4.C0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        v3c.y(new br(3, (Continuation) null, 11), imageView);
                        ehaVar4.addView(imageView);
                        return imageView;
                    default:
                        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context, attributeSet);
                        appCompatImageView3.setId(xoc.w0);
                        int iG8 = tu0.G(40 * fk4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(iG8, iG8);
                        layoutParams5.gravity = 8388629;
                        appCompatImageView3.setLayoutParams(layoutParams5);
                        final eha ehaVar5 = this;
                        Editable text = ((AppCompatEditText) ehaVar5.C0.getValue()).getText();
                        appCompatImageView3.setVisibility((text == null || text.length() == 0) ^ true ? 0 : 8);
                        int iG9 = tu0.G(12 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView3.setPadding(iG9, iG9, iG9, iG9);
                        appCompatImageView3.setImageResource(woc.n0);
                        appCompatImageView3.setImageTintList(ColorStateList.valueOf(qp4.u0.j(appCompatImageView3).getIcon().j));
                        final int i8 = 3;
                        tu0.K(appCompatImageView3, 300L, new View.OnClickListener() { // from class: xga
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i8) {
                                    case 0:
                                        ehaVar5.d();
                                        break;
                                    case 1:
                                        eha ehaVar22 = ehaVar5;
                                        ehaVar22.b();
                                        bha bhaVar = ehaVar22.u0;
                                        if (bhaVar != null) {
                                            bhaVar.p();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        ehaVar5.d();
                                        break;
                                    default:
                                        ((AppCompatEditText) ehaVar5.C0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        ehaVar5.addView(appCompatImageView3);
                        return appCompatImageView3;
                }
            }
        });
        final int i3 = 2;
        this.D0 = tu0.r(3, new k56() { // from class: wga
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        AppCompatImageView appCompatImageView = new AppCompatImageView(context, attributeSet);
                        appCompatImageView.setId(xoc.u0);
                        int iG = tu0.G(30 * fk4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iG, iG);
                        layoutParams.gravity = 8388627;
                        final eha ehaVar = this;
                        layoutParams.leftMargin = ehaVar.c;
                        appCompatImageView.setLayoutParams(layoutParams);
                        int iG2 = tu0.G(1 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iG2, iG2, iG2, iG2);
                        appCompatImageView.setImageResource(woc.d0);
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(qp4.u0.j(appCompatImageView).getIcon().f));
                        final int i22 = 1;
                        tu0.K(appCompatImageView, 300L, new View.OnClickListener() { // from class: xga
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i22) {
                                    case 0:
                                        ehaVar.d();
                                        break;
                                    case 1:
                                        eha ehaVar22 = ehaVar;
                                        ehaVar22.b();
                                        bha bhaVar = ehaVar22.u0;
                                        if (bhaVar != null) {
                                            bhaVar.p();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        ehaVar.d();
                                        break;
                                    default:
                                        ((AppCompatEditText) ehaVar.C0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        ehaVar.addView(appCompatImageView);
                        return appCompatImageView;
                    case 1:
                        final AppCompatEditText appCompatEditText = new AppCompatEditText(context, attributeSet);
                        appCompatEditText.setId(xoc.v0);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(0, -2);
                        layoutParams2.gravity = 8388629;
                        int iG3 = tu0.G(30 * fk4.d().getDisplayMetrics().density);
                        eha ehaVar2 = this;
                        int i32 = ehaVar2.c;
                        layoutParams2.leftMargin = iG3 + i32 + i32;
                        int i4 = ehaVar2.a;
                        layoutParams2.topMargin = i4;
                        layoutParams2.bottomMargin = i4;
                        appCompatEditText.setLayoutParams(layoutParams2);
                        appCompatEditText.setClipToOutline(true);
                        appCompatEditText.setOutlineProvider(new ix3(tu0.G(10 * fk4.d().getDisplayMetrics().density)));
                        appCompatEditText.setImeOptions(3);
                        appCompatEditText.setText(ehaVar2.o);
                        int iG4 = tu0.G(40 * fk4.d().getDisplayMetrics().density);
                        int i5 = ehaVar2.b;
                        appCompatEditText.setPadding(i32, i5, iG4, i5);
                        pq9 pq9Var = qp4.u0;
                        appCompatEditText.setBackgroundColor(pq9Var.j(appCompatEditText).b().a.g);
                        i4f.l.b(appCompatEditText, du4.b);
                        Drawable textCursorDrawable = appCompatEditText.getTextCursorDrawable();
                        if (textCursorDrawable != null) {
                            ngg.G(textCursorDrawable, pq9Var.j(appCompatEditText).getText().j);
                        }
                        appCompatEditText.setHintTextColor(pq9Var.j(appCompatEditText).getText().g);
                        appCompatEditText.setTextColor(pq9Var.j(appCompatEditText).getText().e);
                        appCompatEditText.setSingleLine();
                        appCompatEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: zga
                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView, int i6, KeyEvent keyEvent) {
                                if (i6 != 3) {
                                    return false;
                                }
                                mr0.I(appCompatEditText);
                                return true;
                            }
                        });
                        pla.a(appCompatEditText, new q57(17, appCompatEditText, appCompatEditText));
                        appCompatEditText.addTextChangedListener(new z2(5, ehaVar2));
                        ehaVar2.addView(appCompatEditText);
                        return appCompatEditText;
                    case 2:
                        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, attributeSet);
                        appCompatImageView2.setId(xoc.x0);
                        int iG5 = tu0.G(24 * fk4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iG5, iG5);
                        layoutParams3.gravity = 8388629;
                        appCompatImageView2.setLayoutParams(layoutParams3);
                        int iG6 = tu0.G(2 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView2.setPadding(iG6, iG6, iG6, iG6);
                        appCompatImageView2.setImageResource(woc.O0);
                        appCompatImageView2.setImageTintList(ColorStateList.valueOf(qp4.u0.j(appCompatImageView2).getIcon().f));
                        final eha ehaVar3 = this;
                        final int i6 = 0;
                        tu0.K(appCompatImageView2, 300L, new View.OnClickListener() { // from class: xga
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i6) {
                                    case 0:
                                        ehaVar3.d();
                                        break;
                                    case 1:
                                        eha ehaVar22 = ehaVar3;
                                        ehaVar22.b();
                                        bha bhaVar = ehaVar22.u0;
                                        if (bhaVar != null) {
                                            bhaVar.p();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        ehaVar3.d();
                                        break;
                                    default:
                                        ((AppCompatEditText) ehaVar3.C0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        ehaVar3.addView(appCompatImageView2);
                        return appCompatImageView2;
                    case 3:
                        ImageView imageView = new ImageView(context, attributeSet);
                        imageView.setId(xoc.y0);
                        float f = 32;
                        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                        layoutParams4.gravity = 8388629;
                        imageView.setLayoutParams(layoutParams4);
                        int iG7 = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                        imageView.setPadding(iG7, iG7, iG7, iG7);
                        imageView.setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 12.0f));
                        imageView.setImageResource(woc.O0);
                        final eha ehaVar4 = this;
                        final int i7 = 2;
                        tu0.K(imageView, 300L, new View.OnClickListener() { // from class: xga
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i7) {
                                    case 0:
                                        ehaVar4.d();
                                        break;
                                    case 1:
                                        eha ehaVar22 = ehaVar4;
                                        ehaVar22.b();
                                        bha bhaVar = ehaVar22.u0;
                                        if (bhaVar != null) {
                                            bhaVar.p();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        ehaVar4.d();
                                        break;
                                    default:
                                        ((AppCompatEditText) ehaVar4.C0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        v3c.y(new br(3, (Continuation) null, 11), imageView);
                        ehaVar4.addView(imageView);
                        return imageView;
                    default:
                        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context, attributeSet);
                        appCompatImageView3.setId(xoc.w0);
                        int iG8 = tu0.G(40 * fk4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(iG8, iG8);
                        layoutParams5.gravity = 8388629;
                        appCompatImageView3.setLayoutParams(layoutParams5);
                        final eha ehaVar5 = this;
                        Editable text = ((AppCompatEditText) ehaVar5.C0.getValue()).getText();
                        appCompatImageView3.setVisibility((text == null || text.length() == 0) ^ true ? 0 : 8);
                        int iG9 = tu0.G(12 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView3.setPadding(iG9, iG9, iG9, iG9);
                        appCompatImageView3.setImageResource(woc.n0);
                        appCompatImageView3.setImageTintList(ColorStateList.valueOf(qp4.u0.j(appCompatImageView3).getIcon().j));
                        final int i8 = 3;
                        tu0.K(appCompatImageView3, 300L, new View.OnClickListener() { // from class: xga
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i8) {
                                    case 0:
                                        ehaVar5.d();
                                        break;
                                    case 1:
                                        eha ehaVar22 = ehaVar5;
                                        ehaVar22.b();
                                        bha bhaVar = ehaVar22.u0;
                                        if (bhaVar != null) {
                                            bhaVar.p();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        ehaVar5.d();
                                        break;
                                    default:
                                        ((AppCompatEditText) ehaVar5.C0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        ehaVar5.addView(appCompatImageView3);
                        return appCompatImageView3;
                }
            }
        });
        final int i4 = 3;
        this.E0 = tu0.r(3, new k56() { // from class: wga
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        AppCompatImageView appCompatImageView = new AppCompatImageView(context, attributeSet);
                        appCompatImageView.setId(xoc.u0);
                        int iG = tu0.G(30 * fk4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iG, iG);
                        layoutParams.gravity = 8388627;
                        final eha ehaVar = this;
                        layoutParams.leftMargin = ehaVar.c;
                        appCompatImageView.setLayoutParams(layoutParams);
                        int iG2 = tu0.G(1 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iG2, iG2, iG2, iG2);
                        appCompatImageView.setImageResource(woc.d0);
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(qp4.u0.j(appCompatImageView).getIcon().f));
                        final int i22 = 1;
                        tu0.K(appCompatImageView, 300L, new View.OnClickListener() { // from class: xga
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i22) {
                                    case 0:
                                        ehaVar.d();
                                        break;
                                    case 1:
                                        eha ehaVar22 = ehaVar;
                                        ehaVar22.b();
                                        bha bhaVar = ehaVar22.u0;
                                        if (bhaVar != null) {
                                            bhaVar.p();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        ehaVar.d();
                                        break;
                                    default:
                                        ((AppCompatEditText) ehaVar.C0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        ehaVar.addView(appCompatImageView);
                        return appCompatImageView;
                    case 1:
                        final AppCompatEditText appCompatEditText = new AppCompatEditText(context, attributeSet);
                        appCompatEditText.setId(xoc.v0);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(0, -2);
                        layoutParams2.gravity = 8388629;
                        int iG3 = tu0.G(30 * fk4.d().getDisplayMetrics().density);
                        eha ehaVar2 = this;
                        int i32 = ehaVar2.c;
                        layoutParams2.leftMargin = iG3 + i32 + i32;
                        int i42 = ehaVar2.a;
                        layoutParams2.topMargin = i42;
                        layoutParams2.bottomMargin = i42;
                        appCompatEditText.setLayoutParams(layoutParams2);
                        appCompatEditText.setClipToOutline(true);
                        appCompatEditText.setOutlineProvider(new ix3(tu0.G(10 * fk4.d().getDisplayMetrics().density)));
                        appCompatEditText.setImeOptions(3);
                        appCompatEditText.setText(ehaVar2.o);
                        int iG4 = tu0.G(40 * fk4.d().getDisplayMetrics().density);
                        int i5 = ehaVar2.b;
                        appCompatEditText.setPadding(i32, i5, iG4, i5);
                        pq9 pq9Var = qp4.u0;
                        appCompatEditText.setBackgroundColor(pq9Var.j(appCompatEditText).b().a.g);
                        i4f.l.b(appCompatEditText, du4.b);
                        Drawable textCursorDrawable = appCompatEditText.getTextCursorDrawable();
                        if (textCursorDrawable != null) {
                            ngg.G(textCursorDrawable, pq9Var.j(appCompatEditText).getText().j);
                        }
                        appCompatEditText.setHintTextColor(pq9Var.j(appCompatEditText).getText().g);
                        appCompatEditText.setTextColor(pq9Var.j(appCompatEditText).getText().e);
                        appCompatEditText.setSingleLine();
                        appCompatEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: zga
                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView, int i6, KeyEvent keyEvent) {
                                if (i6 != 3) {
                                    return false;
                                }
                                mr0.I(appCompatEditText);
                                return true;
                            }
                        });
                        pla.a(appCompatEditText, new q57(17, appCompatEditText, appCompatEditText));
                        appCompatEditText.addTextChangedListener(new z2(5, ehaVar2));
                        ehaVar2.addView(appCompatEditText);
                        return appCompatEditText;
                    case 2:
                        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, attributeSet);
                        appCompatImageView2.setId(xoc.x0);
                        int iG5 = tu0.G(24 * fk4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iG5, iG5);
                        layoutParams3.gravity = 8388629;
                        appCompatImageView2.setLayoutParams(layoutParams3);
                        int iG6 = tu0.G(2 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView2.setPadding(iG6, iG6, iG6, iG6);
                        appCompatImageView2.setImageResource(woc.O0);
                        appCompatImageView2.setImageTintList(ColorStateList.valueOf(qp4.u0.j(appCompatImageView2).getIcon().f));
                        final eha ehaVar3 = this;
                        final int i6 = 0;
                        tu0.K(appCompatImageView2, 300L, new View.OnClickListener() { // from class: xga
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i6) {
                                    case 0:
                                        ehaVar3.d();
                                        break;
                                    case 1:
                                        eha ehaVar22 = ehaVar3;
                                        ehaVar22.b();
                                        bha bhaVar = ehaVar22.u0;
                                        if (bhaVar != null) {
                                            bhaVar.p();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        ehaVar3.d();
                                        break;
                                    default:
                                        ((AppCompatEditText) ehaVar3.C0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        ehaVar3.addView(appCompatImageView2);
                        return appCompatImageView2;
                    case 3:
                        ImageView imageView = new ImageView(context, attributeSet);
                        imageView.setId(xoc.y0);
                        float f = 32;
                        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                        layoutParams4.gravity = 8388629;
                        imageView.setLayoutParams(layoutParams4);
                        int iG7 = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                        imageView.setPadding(iG7, iG7, iG7, iG7);
                        imageView.setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 12.0f));
                        imageView.setImageResource(woc.O0);
                        final eha ehaVar4 = this;
                        final int i7 = 2;
                        tu0.K(imageView, 300L, new View.OnClickListener() { // from class: xga
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i7) {
                                    case 0:
                                        ehaVar4.d();
                                        break;
                                    case 1:
                                        eha ehaVar22 = ehaVar4;
                                        ehaVar22.b();
                                        bha bhaVar = ehaVar22.u0;
                                        if (bhaVar != null) {
                                            bhaVar.p();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        ehaVar4.d();
                                        break;
                                    default:
                                        ((AppCompatEditText) ehaVar4.C0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        v3c.y(new br(3, (Continuation) null, 11), imageView);
                        ehaVar4.addView(imageView);
                        return imageView;
                    default:
                        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context, attributeSet);
                        appCompatImageView3.setId(xoc.w0);
                        int iG8 = tu0.G(40 * fk4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(iG8, iG8);
                        layoutParams5.gravity = 8388629;
                        appCompatImageView3.setLayoutParams(layoutParams5);
                        final eha ehaVar5 = this;
                        Editable text = ((AppCompatEditText) ehaVar5.C0.getValue()).getText();
                        appCompatImageView3.setVisibility((text == null || text.length() == 0) ^ true ? 0 : 8);
                        int iG9 = tu0.G(12 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView3.setPadding(iG9, iG9, iG9, iG9);
                        appCompatImageView3.setImageResource(woc.n0);
                        appCompatImageView3.setImageTintList(ColorStateList.valueOf(qp4.u0.j(appCompatImageView3).getIcon().j));
                        final int i8 = 3;
                        tu0.K(appCompatImageView3, 300L, new View.OnClickListener() { // from class: xga
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i8) {
                                    case 0:
                                        ehaVar5.d();
                                        break;
                                    case 1:
                                        eha ehaVar22 = ehaVar5;
                                        ehaVar22.b();
                                        bha bhaVar = ehaVar22.u0;
                                        if (bhaVar != null) {
                                            bhaVar.p();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        ehaVar5.d();
                                        break;
                                    default:
                                        ((AppCompatEditText) ehaVar5.C0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        ehaVar5.addView(appCompatImageView3);
                        return appCompatImageView3;
                }
            }
        });
        final int i5 = 4;
        this.F0 = tu0.r(3, new k56() { // from class: wga
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        AppCompatImageView appCompatImageView = new AppCompatImageView(context, attributeSet);
                        appCompatImageView.setId(xoc.u0);
                        int iG = tu0.G(30 * fk4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iG, iG);
                        layoutParams.gravity = 8388627;
                        final eha ehaVar = this;
                        layoutParams.leftMargin = ehaVar.c;
                        appCompatImageView.setLayoutParams(layoutParams);
                        int iG2 = tu0.G(1 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iG2, iG2, iG2, iG2);
                        appCompatImageView.setImageResource(woc.d0);
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(qp4.u0.j(appCompatImageView).getIcon().f));
                        final int i22 = 1;
                        tu0.K(appCompatImageView, 300L, new View.OnClickListener() { // from class: xga
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i22) {
                                    case 0:
                                        ehaVar.d();
                                        break;
                                    case 1:
                                        eha ehaVar22 = ehaVar;
                                        ehaVar22.b();
                                        bha bhaVar = ehaVar22.u0;
                                        if (bhaVar != null) {
                                            bhaVar.p();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        ehaVar.d();
                                        break;
                                    default:
                                        ((AppCompatEditText) ehaVar.C0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        ehaVar.addView(appCompatImageView);
                        return appCompatImageView;
                    case 1:
                        final AppCompatEditText appCompatEditText = new AppCompatEditText(context, attributeSet);
                        appCompatEditText.setId(xoc.v0);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(0, -2);
                        layoutParams2.gravity = 8388629;
                        int iG3 = tu0.G(30 * fk4.d().getDisplayMetrics().density);
                        eha ehaVar2 = this;
                        int i32 = ehaVar2.c;
                        layoutParams2.leftMargin = iG3 + i32 + i32;
                        int i42 = ehaVar2.a;
                        layoutParams2.topMargin = i42;
                        layoutParams2.bottomMargin = i42;
                        appCompatEditText.setLayoutParams(layoutParams2);
                        appCompatEditText.setClipToOutline(true);
                        appCompatEditText.setOutlineProvider(new ix3(tu0.G(10 * fk4.d().getDisplayMetrics().density)));
                        appCompatEditText.setImeOptions(3);
                        appCompatEditText.setText(ehaVar2.o);
                        int iG4 = tu0.G(40 * fk4.d().getDisplayMetrics().density);
                        int i52 = ehaVar2.b;
                        appCompatEditText.setPadding(i32, i52, iG4, i52);
                        pq9 pq9Var = qp4.u0;
                        appCompatEditText.setBackgroundColor(pq9Var.j(appCompatEditText).b().a.g);
                        i4f.l.b(appCompatEditText, du4.b);
                        Drawable textCursorDrawable = appCompatEditText.getTextCursorDrawable();
                        if (textCursorDrawable != null) {
                            ngg.G(textCursorDrawable, pq9Var.j(appCompatEditText).getText().j);
                        }
                        appCompatEditText.setHintTextColor(pq9Var.j(appCompatEditText).getText().g);
                        appCompatEditText.setTextColor(pq9Var.j(appCompatEditText).getText().e);
                        appCompatEditText.setSingleLine();
                        appCompatEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: zga
                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView, int i6, KeyEvent keyEvent) {
                                if (i6 != 3) {
                                    return false;
                                }
                                mr0.I(appCompatEditText);
                                return true;
                            }
                        });
                        pla.a(appCompatEditText, new q57(17, appCompatEditText, appCompatEditText));
                        appCompatEditText.addTextChangedListener(new z2(5, ehaVar2));
                        ehaVar2.addView(appCompatEditText);
                        return appCompatEditText;
                    case 2:
                        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, attributeSet);
                        appCompatImageView2.setId(xoc.x0);
                        int iG5 = tu0.G(24 * fk4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iG5, iG5);
                        layoutParams3.gravity = 8388629;
                        appCompatImageView2.setLayoutParams(layoutParams3);
                        int iG6 = tu0.G(2 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView2.setPadding(iG6, iG6, iG6, iG6);
                        appCompatImageView2.setImageResource(woc.O0);
                        appCompatImageView2.setImageTintList(ColorStateList.valueOf(qp4.u0.j(appCompatImageView2).getIcon().f));
                        final eha ehaVar3 = this;
                        final int i6 = 0;
                        tu0.K(appCompatImageView2, 300L, new View.OnClickListener() { // from class: xga
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i6) {
                                    case 0:
                                        ehaVar3.d();
                                        break;
                                    case 1:
                                        eha ehaVar22 = ehaVar3;
                                        ehaVar22.b();
                                        bha bhaVar = ehaVar22.u0;
                                        if (bhaVar != null) {
                                            bhaVar.p();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        ehaVar3.d();
                                        break;
                                    default:
                                        ((AppCompatEditText) ehaVar3.C0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        ehaVar3.addView(appCompatImageView2);
                        return appCompatImageView2;
                    case 3:
                        ImageView imageView = new ImageView(context, attributeSet);
                        imageView.setId(xoc.y0);
                        float f = 32;
                        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                        layoutParams4.gravity = 8388629;
                        imageView.setLayoutParams(layoutParams4);
                        int iG7 = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                        imageView.setPadding(iG7, iG7, iG7, iG7);
                        imageView.setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 12.0f));
                        imageView.setImageResource(woc.O0);
                        final eha ehaVar4 = this;
                        final int i7 = 2;
                        tu0.K(imageView, 300L, new View.OnClickListener() { // from class: xga
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i7) {
                                    case 0:
                                        ehaVar4.d();
                                        break;
                                    case 1:
                                        eha ehaVar22 = ehaVar4;
                                        ehaVar22.b();
                                        bha bhaVar = ehaVar22.u0;
                                        if (bhaVar != null) {
                                            bhaVar.p();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        ehaVar4.d();
                                        break;
                                    default:
                                        ((AppCompatEditText) ehaVar4.C0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        v3c.y(new br(3, (Continuation) null, 11), imageView);
                        ehaVar4.addView(imageView);
                        return imageView;
                    default:
                        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context, attributeSet);
                        appCompatImageView3.setId(xoc.w0);
                        int iG8 = tu0.G(40 * fk4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(iG8, iG8);
                        layoutParams5.gravity = 8388629;
                        appCompatImageView3.setLayoutParams(layoutParams5);
                        final eha ehaVar5 = this;
                        Editable text = ((AppCompatEditText) ehaVar5.C0.getValue()).getText();
                        appCompatImageView3.setVisibility((text == null || text.length() == 0) ^ true ? 0 : 8);
                        int iG9 = tu0.G(12 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView3.setPadding(iG9, iG9, iG9, iG9);
                        appCompatImageView3.setImageResource(woc.n0);
                        appCompatImageView3.setImageTintList(ColorStateList.valueOf(qp4.u0.j(appCompatImageView3).getIcon().j));
                        final int i8 = 3;
                        tu0.K(appCompatImageView3, 300L, new View.OnClickListener() { // from class: xga
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i8) {
                                    case 0:
                                        ehaVar5.d();
                                        break;
                                    case 1:
                                        eha ehaVar22 = ehaVar5;
                                        ehaVar22.b();
                                        bha bhaVar = ehaVar22.u0;
                                        if (bhaVar != null) {
                                            bhaVar.p();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        ehaVar5.d();
                                        break;
                                    default:
                                        ((AppCompatEditText) ehaVar5.C0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        ehaVar5.addView(appCompatImageView3);
                        return appCompatImageView3;
                }
            }
        });
        ValueAnimator duration = ValueAnimator.ofInt(120).setDuration(120L);
        duration.addListener(new dha(this, 1));
        final int i6 = 0;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: yga
            public final /* synthetic */ eha b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i6) {
                    case 0:
                        eha ehaVar = this.b;
                        int width = ehaVar.getWidth();
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        ((AppCompatImageView) ehaVar.B0.getValue()).setAlpha(animatedFraction);
                        ((AppCompatImageView) ehaVar.F0.getValue()).setAlpha(animatedFraction);
                        je7 je7Var = ehaVar.C0;
                        View view = (View) je7Var.getValue();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                        ViewGroup.LayoutParams layoutParams2 = ((View) je7Var.getValue()).getLayoutParams();
                        layoutParams.width = (int) ((width - ((layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null) != null ? r4.leftMargin : 0)) * animatedFraction);
                        view.setLayoutParams(layoutParams);
                        return;
                    default:
                        float animatedFraction2 = 1 - valueAnimator.getAnimatedFraction();
                        eha ehaVar2 = this.b;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ehaVar2.B0.getValue();
                        appCompatImageView.setAlpha(appCompatImageView.getAlpha() * animatedFraction2);
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ehaVar2.F0.getValue();
                        appCompatImageView2.setAlpha(appCompatImageView2.getAlpha() * animatedFraction2);
                        View view2 = (View) ehaVar2.C0.getValue();
                        ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                        if (layoutParams3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                        layoutParams3.width = (int) (((AppCompatEditText) r4.getValue()).getWidth() * animatedFraction2);
                        view2.setLayoutParams(layoutParams3);
                        return;
                }
            }
        });
        this.G0 = duration;
        ValueAnimator duration2 = ValueAnimator.ofInt(120).setDuration(120L);
        duration2.addListener(new lf(this, 4, context));
        final int i7 = 1;
        duration2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: yga
            public final /* synthetic */ eha b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i7) {
                    case 0:
                        eha ehaVar = this.b;
                        int width = ehaVar.getWidth();
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        ((AppCompatImageView) ehaVar.B0.getValue()).setAlpha(animatedFraction);
                        ((AppCompatImageView) ehaVar.F0.getValue()).setAlpha(animatedFraction);
                        je7 je7Var = ehaVar.C0;
                        View view = (View) je7Var.getValue();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                        ViewGroup.LayoutParams layoutParams2 = ((View) je7Var.getValue()).getLayoutParams();
                        layoutParams.width = (int) ((width - ((layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null) != null ? r4.leftMargin : 0)) * animatedFraction);
                        view.setLayoutParams(layoutParams);
                        return;
                    default:
                        float animatedFraction2 = 1 - valueAnimator.getAnimatedFraction();
                        eha ehaVar2 = this.b;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ehaVar2.B0.getValue();
                        appCompatImageView.setAlpha(appCompatImageView.getAlpha() * animatedFraction2);
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ehaVar2.F0.getValue();
                        appCompatImageView2.setAlpha(appCompatImageView2.getAlpha() * animatedFraction2);
                        View view2 = (View) ehaVar2.C0.getValue();
                        ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                        if (layoutParams3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                        layoutParams3.width = (int) (((AppCompatEditText) r4.getValue()).getWidth() * animatedFraction2);
                        view2.setLayoutParams(layoutParams3);
                        return;
                }
            }
        });
        this.H0 = duration2;
    }

    public static void a(Animator animator) {
        ArrayList arrayList = new ArrayList(animator.getListeners());
        animator.removeAllListeners();
        animator.cancel();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            animator.addListener((Animator.AnimatorListener) it.next());
        }
    }

    public final void b() {
        if (this.x0) {
            a(this.G0);
            float f = this.z0 ? 0.0f : 1.0f;
            ValueAnimator valueAnimator = this.H0;
            valueAnimator.setCurrentFraction(f);
            valueAnimator.start();
        }
    }

    public final void c(boolean z) {
        if (this.w0) {
            a(this.H0);
            float f = this.y0 ? 0.0f : 1.0f;
            ValueAnimator valueAnimator = this.G0;
            valueAnimator.setCurrentFraction(f);
            if (z) {
                valueAnimator.addListener(new dha(this, 0));
            }
            addOnLayoutChangeListener(new qq0(8, this));
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = -1;
            layoutParams.height = -2;
            setMinimumHeight(tu0.G(52 * fk4.d().getDisplayMetrics().density));
            setLayoutParams(layoutParams);
        }
    }

    public final void d() {
        c(true);
        bha bhaVar = this.u0;
        if (bhaVar != null) {
            bhaVar.g();
        }
    }

    public final boolean getCollapseWithAnimation() {
        return this.z0;
    }

    public final boolean getExpandWithAnimation() {
        return this.y0;
    }

    public final boolean getShouldShowSearchIcon() {
        return this.v0;
    }

    public final cha getState() {
        return this.A0;
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        je7 je7Var = this.D0;
        if (je7Var.a()) {
            ((AppCompatImageView) je7Var.getValue()).setImageTintList(ColorStateList.valueOf(fkaVar.getIcon().f));
        }
        je7 je7Var2 = this.B0;
        if (je7Var2.a()) {
            ((AppCompatImageView) je7Var2.getValue()).setImageTintList(ColorStateList.valueOf(fkaVar.getIcon().f));
        }
        je7 je7Var3 = this.F0;
        if (je7Var3.a()) {
            ((AppCompatImageView) je7Var3.getValue()).setImageTintList(ColorStateList.valueOf(fkaVar.getIcon().j));
        }
        je7 je7Var4 = this.C0;
        if (je7Var4.a()) {
            AppCompatEditText appCompatEditText = (AppCompatEditText) je7Var4.getValue();
            Drawable textCursorDrawable = appCompatEditText.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                ngg.G(textCursorDrawable, fkaVar.getText().j);
            }
            appCompatEditText.setBackgroundColor(fkaVar.b().a.g);
            appCompatEditText.setHintTextColor(fkaVar.getText().g);
            appCompatEditText.setTextColor(fkaVar.getText().e);
        }
    }

    public final void setCollapseWithAnimation(boolean z) {
        this.z0 = z;
    }

    public final void setCollapsedStyle(aha ahaVar) {
        this.t0 = ahaVar;
        int iOrdinal = ahaVar.ordinal();
        je7 je7Var = this.D0;
        cha chaVar = cha.a;
        je7 je7Var2 = this.E0;
        if (iOrdinal == 0) {
            if (je7Var.a()) {
                ((AppCompatImageView) je7Var.getValue()).setVisibility(8);
            }
            if (this.A0 == chaVar) {
                ((View) je7Var2.getValue()).setVisibility(this.v0 ? 0 : 8);
                return;
            }
            return;
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        if (je7Var2.a()) {
            ((ImageView) je7Var2.getValue()).setVisibility(8);
        }
        if (this.A0 == chaVar) {
            ((View) je7Var.getValue()).setVisibility(this.v0 ? 0 : 8);
        }
    }

    public final void setCollapsible(boolean z) {
        this.x0 = z;
    }

    public final void setExpandWithAnimation(boolean z) {
        this.y0 = z;
    }

    public final void setExpandable(boolean z) {
        this.w0 = z;
    }

    public final void setListener(bha bhaVar) {
        this.u0 = bhaVar;
    }

    public final void setSearchHint(String str) {
        this.s0 = str;
        je7 je7Var = this.C0;
        if (je7Var.a()) {
            ((AppCompatEditText) je7Var.getValue()).setHint(str);
        }
    }

    public final void setSearchText(CharSequence charSequence) {
        this.o = charSequence;
        je7 je7Var = this.C0;
        if (je7Var.a()) {
            AppCompatEditText appCompatEditText = (AppCompatEditText) je7Var.getValue();
            appCompatEditText.setText(charSequence);
            appCompatEditText.setSelection(appCompatEditText.length());
        }
    }

    public final void setShouldShowSearchIcon(boolean z) {
        this.v0 = z;
    }
}
