package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class tmd extends kgb {
    public i24 F0;
    public final TextView G0;
    public final AppCompatEditText H0;
    public final AppCompatTextView I0;
    public final OneMeButton J0;
    public final ImageView K0;
    public final ImageView L0;
    public final LinearLayout M0;
    public final TextView N0;
    public final TextView O0;

    public tmd(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        super(linearLayout);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        textView.setGravity(16);
        kqe kqeVar = i4f.l;
        kqeVar.b(textView, du4.b);
        this.G0 = textView;
        final AppCompatEditText appCompatEditText = new AppCompatEditText(context, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.weight = 1.0f;
        float f = 0;
        float f2 = 12;
        appCompatEditText.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f), appCompatEditText.getPaddingTop(), tu0.G(fk4.d().getDisplayMetrics().density * f2), appCompatEditText.getPaddingBottom());
        appCompatEditText.setLayoutParams(layoutParams);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatEditText.setEllipsize(truncateAt);
        appCompatEditText.setInputType(524288);
        kqeVar.b(appCompatEditText, du4.b);
        appCompatEditText.setBackground(null);
        appCompatEditText.setSingleLine(true);
        pq9 pq9Var = qp4.u0;
        appCompatEditText.setHintTextColor(pq9Var.j(appCompatEditText).getText().i);
        appCompatEditText.setHint(appCompatEditText.getResources().getText(vea.C0));
        appCompatEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: rmd
            /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0043  */
            @Override // android.view.View.OnFocusChangeListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onFocusChange(android.view.View r5, boolean r6) {
                /*
                    r4 = this;
                    tmd r5 = r4.a
                    android.widget.ImageView r0 = r5.K0
                    r1 = 1
                    r2 = 0
                    if (r6 == 0) goto L1f
                    androidx.appcompat.widget.AppCompatEditText r4 = r2
                    android.text.Editable r4 = r4.getText()
                    if (r4 == 0) goto L19
                    int r4 = r4.length()
                    if (r4 != 0) goto L17
                    goto L19
                L17:
                    r4 = r2
                    goto L1a
                L19:
                    r4 = r1
                L1a:
                    r4 = r4 ^ r1
                    if (r4 == 0) goto L1f
                    r4 = r1
                    goto L20
                L1f:
                    r4 = r2
                L20:
                    r3 = 8
                    if (r4 == 0) goto L26
                    r4 = r2
                    goto L27
                L26:
                    r4 = r3
                L27:
                    r0.setVisibility(r4)
                    i24 r4 = r5.F0
                    boolean r0 = r4 instanceof defpackage.omd
                    if (r0 == 0) goto L47
                    android.widget.ImageView r5 = r5.L0
                    if (r6 != 0) goto L43
                    boolean r6 = r4 instanceof defpackage.omd
                    if (r6 == 0) goto L3b
                    omd r4 = (defpackage.omd) r4
                    goto L3c
                L3b:
                    r4 = 0
                L3c:
                    if (r4 == 0) goto L43
                    boolean r4 = r4.j
                    if (r4 != r1) goto L43
                    goto L44
                L43:
                    r2 = r3
                L44:
                    r5.setVisibility(r2)
                L47:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.rmd.onFocusChange(android.view.View, boolean):void");
            }
        });
        appCompatEditText.setOnEditorActionListener(new smd());
        this.H0 = appCompatEditText;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.weight = 1.0f;
        int iG = tu0.G(f * fk4.d().getDisplayMetrics().density);
        float f3 = 10;
        appCompatTextView.setPaddingRelative(iG, tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f3));
        appCompatTextView.setLayoutParams(layoutParams2);
        appCompatTextView.setEllipsize(truncateAt);
        appCompatTextView.setGravity(16);
        kqeVar.b(appCompatTextView, du4.b);
        appCompatTextView.setBackground(null);
        appCompatTextView.setSingleLine(true);
        this.I0 = appCompatTextView;
        OneMeButton oneMeButton = new OneMeButton(context, null);
        oneMeButton.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f2), oneMeButton.getPaddingTop(), tu0.G(fk4.d().getDisplayMetrics().density * f2), oneMeButton.getPaddingBottom());
        oneMeButton.setSize(c7a.b);
        oneMeButton.setMode(b7a.b);
        oneMeButton.setAppearance(z6a.a);
        oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.J0 = oneMeButton;
        ImageView imageView = new ImageView(context);
        int i = sea.w0;
        imageView.setId(i);
        imageView.setVisibility(8);
        float f4 = 24;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(fk4.d().getDisplayMetrics().density * f4));
        int iG2 = tu0.G(fk4.d().getDisplayMetrics().density * f2);
        int i2 = ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin;
        int marginEnd = layoutParams3.getMarginEnd();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin;
        layoutParams3.setMarginStart(iG2);
        ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = i2;
        layoutParams3.setMarginEnd(marginEnd);
        ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = i3;
        imageView.setLayoutParams(layoutParams3);
        tu0.K(imageView, 300L, new elb(6, this));
        int i4 = woc.o0;
        bs6 icon = pq9Var.j(imageView).getIcon();
        Drawable drawableB = kt3.b(imageView.getContext(), i4);
        ngg.G(drawableB, icon.j);
        imageView.setImageDrawable(drawableB);
        this.K0 = imageView;
        ImageView imageView2 = new ImageView(context);
        imageView2.setId(i);
        imageView2.setVisibility(8);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(fk4.d().getDisplayMetrics().density * f4));
        int iG3 = tu0.G(fk4.d().getDisplayMetrics().density * f2);
        int i5 = ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin;
        int marginEnd2 = layoutParams4.getMarginEnd();
        int i6 = ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin;
        layoutParams4.setMarginStart(iG3);
        ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = i5;
        layoutParams4.setMarginEnd(marginEnd2);
        ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = i6;
        imageView2.setLayoutParams(layoutParams4);
        int i7 = woc.t0;
        bs6 icon2 = pq9Var.j(imageView2).getIcon();
        Drawable drawableB2 = kt3.b(imageView2.getContext(), i7);
        ngg.G(drawableB2, icon2.f);
        imageView2.setImageDrawable(drawableB2);
        this.L0 = imageView2;
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout2.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f2), linearLayout2.getPaddingTop(), tu0.G(fk4.d().getDisplayMetrics().density * f2), linearLayout2.getPaddingBottom());
        linearLayout2.setGravity(16);
        linearLayout2.setOrientation(0);
        linearLayout2.setClipToOutline(true);
        linearLayout2.setOutlineProvider(new ix3(tu0.G(fk4.d().getDisplayMetrics().density * f2)));
        linearLayout2.setBackgroundColor(pq9Var.j(linearLayout2).b().j);
        linearLayout2.addView(textView);
        linearLayout2.addView(appCompatEditText);
        linearLayout2.addView(appCompatTextView);
        linearLayout2.addView(imageView2);
        linearLayout2.addView(imageView);
        this.M0 = linearLayout2;
        TextView textView2 = new TextView(context);
        textView2.setTextColor(pq9Var.j(textView2).getText().b);
        kqe kqeVar2 = i4f.p;
        kqeVar2.b(textView2, du4.b);
        textView2.setPaddingRelative(tu0.G(f4 * fk4.d().getDisplayMetrics().density), textView2.getPaddingTop(), textView2.getPaddingEnd(), textView2.getPaddingBottom());
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.topMargin = tu0.G(fk4.d().getDisplayMetrics().density * f3);
        textView2.setLayoutParams(layoutParams5);
        this.N0 = textView2;
        TextView textView3 = new TextView(context);
        kqeVar2.b(textView3, du4.b);
        textView3.setText(textView3.getResources().getText(vea.B0));
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.topMargin = tu0.G(fk4.d().getDisplayMetrics().density * f3);
        textView3.setLayoutParams(layoutParams6);
        this.O0 = textView3;
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setGravity(16);
        linearLayout.addView(linearLayout2);
        linearLayout.addView(oneMeButton);
        linearLayout.addView(textView2);
        linearLayout.addView(textView3);
        linearLayout.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f2), linearLayout.getPaddingTop(), tu0.G(f2 * fk4.d().getDisplayMetrics().density), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        v3c.y(new r1b(this, (Continuation) null, 14), linearLayout);
    }

    @Override // defpackage.hqd
    public final void A(ol7 ol7Var) {
        E(((qmd) ol7Var).a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(defpackage.i24 r13) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tmd.E(i24):void");
    }
}
