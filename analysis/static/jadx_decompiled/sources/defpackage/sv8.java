package defpackage;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.InputFilter;
import android.view.ActionMode;
import android.view.GestureDetector;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class sv8 extends LinearLayout implements kre, kx5 {
    public static final /* synthetic */ bc7[] Q0;
    public final je7 A0;
    public final je7 B0;
    public final je7 C0;
    public final je7 D0;
    public iv8 E0;
    public boolean F0;
    public final yj G0;
    public boolean H0;
    public ov8 I0;
    public final q0e J0;
    public final w7c K0;
    public final q0e L0;
    public final w7c M0;
    public final je7 N0;
    public final Rect O0;
    public final ArrayList P0;
    public int a;
    public final ImageView b;
    public final qv8 c;
    public final int o;
    public final je7 s0;
    public final je7 t0;
    public final StateListDrawable u0;
    public final ImageView v0;
    public final je7 w0;
    public final je7 x0;
    public final je7 y0;
    public final je7 z0;

    static {
        oi9 oi9Var = new oi9(sv8.class, "isVideoMessageEnabled", "isVideoMessageEnabled()Z");
        nec.a.getClass();
        Q0 = new bc7[]{oi9Var};
    }

    public sv8(Context context) {
        super(context, null, 0, 0);
        float f = 4;
        this.a = tu0.G(fk4.d().getDisplayMetrics().density * f);
        ImageView imageView = new ImageView(context);
        imageView.setId(xoc.S);
        pq9 pq9Var = qp4.u0;
        imageView.setImageTintList(ColorStateList.valueOf(pq9Var.j(imageView).a().h().b.b));
        float f2 = 28;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        layoutParams.gravity = 80;
        layoutParams.setMargins(tu0.G(f * fk4.d().getDisplayMetrics().density), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, this.a);
        imageView.setLayoutParams(layoutParams);
        this.b = imageView;
        qv8 qv8Var = new qv8(context);
        qv8Var.setId(xoc.R);
        qv8Var.setBackground(null);
        qv8Var.setPadding(0, 0, 0, 0);
        qv8Var.setMaxLines(8);
        os2.l.b(qv8Var, du4.b);
        qv8Var.setInputType(qv8Var.getInputType() | 16384);
        qv8Var.setImeOptions(268435456);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setSize(tu0.G(2 * fk4.d().getDisplayMetrics().density), qv8Var.getLineHeight());
        qv8Var.setTextCursorDrawable(gradientDrawable);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams2.gravity = 16;
        float f3 = 6;
        int iG = tu0.G(fk4.d().getDisplayMetrics().density * f3);
        layoutParams2.setMargins(iG, iG, iG, iG);
        qv8Var.setLayoutParams(layoutParams2);
        GestureDetector gestureDetector = new GestureDetector(context, new q00(13, this));
        gestureDetector.setIsLongpressEnabled(true);
        qv8Var.setOnTouchListener(new q46(gestureDetector, 4));
        np8.n(qv8Var);
        this.c = qv8Var;
        this.o = woc.W0;
        this.s0 = tu0.r(3, new yf3(context, 17, this));
        this.t0 = tu0.r(3, new hy4(context, 13));
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[] iArr = {R.attr.state_enabled};
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(100.0f);
        stateListDrawable.addState(iArr, gradientDrawable2);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setCornerRadius(100.0f);
        stateListDrawable.addState(new int[]{-16842910}, gradientDrawable3);
        this.u0 = stateListDrawable;
        ImageView imageView2 = new ImageView(context);
        imageView2.setId(xoc.V);
        float f4 = 36;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(f4 * fk4.d().getDisplayMetrics().density));
        layoutParams3.gravity = 80;
        layoutParams3.setMarginStart(tu0.G(12 * fk4.d().getDisplayMetrics().density));
        imageView2.setLayoutParams(layoutParams3);
        this.v0 = imageView2;
        this.w0 = tu0.r(3, new hy4(context, 14));
        final int i = 2;
        this.x0 = tu0.r(3, new k56(this) { // from class: fv8
            public final /* synthetic */ sv8 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return kt3.b(this.b.getContext(), woc.b0);
                    case 1:
                        return kt3.b(this.b.getContext(), woc.Z);
                    case 2:
                        return kt3.b(this.b.getContext(), woc.U0);
                    case 3:
                        return sv8.c(this.b);
                    case 4:
                        return kt3.b(this.b.getContext(), woc.k0);
                    case 5:
                        return sv8.b(this.b);
                    default:
                        return kt3.b(this.b.getContext(), woc.Y0);
                }
            }
        });
        final int i2 = 3;
        this.y0 = tu0.r(3, new k56(this) { // from class: fv8
            public final /* synthetic */ sv8 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return kt3.b(this.b.getContext(), woc.b0);
                    case 1:
                        return kt3.b(this.b.getContext(), woc.Z);
                    case 2:
                        return kt3.b(this.b.getContext(), woc.U0);
                    case 3:
                        return sv8.c(this.b);
                    case 4:
                        return kt3.b(this.b.getContext(), woc.k0);
                    case 5:
                        return sv8.b(this.b);
                    default:
                        return kt3.b(this.b.getContext(), woc.Y0);
                }
            }
        });
        final int i3 = 4;
        this.z0 = tu0.r(3, new k56(this) { // from class: fv8
            public final /* synthetic */ sv8 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return kt3.b(this.b.getContext(), woc.b0);
                    case 1:
                        return kt3.b(this.b.getContext(), woc.Z);
                    case 2:
                        return kt3.b(this.b.getContext(), woc.U0);
                    case 3:
                        return sv8.c(this.b);
                    case 4:
                        return kt3.b(this.b.getContext(), woc.k0);
                    case 5:
                        return sv8.b(this.b);
                    default:
                        return kt3.b(this.b.getContext(), woc.Y0);
                }
            }
        });
        final int i4 = 5;
        this.A0 = tu0.r(3, new k56(this) { // from class: fv8
            public final /* synthetic */ sv8 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return kt3.b(this.b.getContext(), woc.b0);
                    case 1:
                        return kt3.b(this.b.getContext(), woc.Z);
                    case 2:
                        return kt3.b(this.b.getContext(), woc.U0);
                    case 3:
                        return sv8.c(this.b);
                    case 4:
                        return kt3.b(this.b.getContext(), woc.k0);
                    case 5:
                        return sv8.b(this.b);
                    default:
                        return kt3.b(this.b.getContext(), woc.Y0);
                }
            }
        });
        final int i5 = 6;
        this.B0 = tu0.r(3, new k56(this) { // from class: fv8
            public final /* synthetic */ sv8 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return kt3.b(this.b.getContext(), woc.b0);
                    case 1:
                        return kt3.b(this.b.getContext(), woc.Z);
                    case 2:
                        return kt3.b(this.b.getContext(), woc.U0);
                    case 3:
                        return sv8.c(this.b);
                    case 4:
                        return kt3.b(this.b.getContext(), woc.k0);
                    case 5:
                        return sv8.b(this.b);
                    default:
                        return kt3.b(this.b.getContext(), woc.Y0);
                }
            }
        });
        final int i6 = 0;
        this.C0 = tu0.r(3, new k56(this) { // from class: fv8
            public final /* synthetic */ sv8 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return kt3.b(this.b.getContext(), woc.b0);
                    case 1:
                        return kt3.b(this.b.getContext(), woc.Z);
                    case 2:
                        return kt3.b(this.b.getContext(), woc.U0);
                    case 3:
                        return sv8.c(this.b);
                    case 4:
                        return kt3.b(this.b.getContext(), woc.k0);
                    case 5:
                        return sv8.b(this.b);
                    default:
                        return kt3.b(this.b.getContext(), woc.Y0);
                }
            }
        });
        final int i7 = 1;
        this.D0 = tu0.r(3, new k56(this) { // from class: fv8
            public final /* synthetic */ sv8 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return kt3.b(this.b.getContext(), woc.b0);
                    case 1:
                        return kt3.b(this.b.getContext(), woc.Z);
                    case 2:
                        return kt3.b(this.b.getContext(), woc.U0);
                    case 3:
                        return sv8.c(this.b);
                    case 4:
                        return kt3.b(this.b.getContext(), woc.k0);
                    case 5:
                        return sv8.b(this.b);
                    default:
                        return kt3.b(this.b.getContext(), woc.Y0);
                }
            }
        });
        this.E0 = iv8.a;
        this.G0 = new yj(this);
        this.I0 = new kv8();
        q0e q0eVarA = r0e.a(null);
        this.J0 = q0eVarA;
        this.K0 = new w7c(q0eVarA);
        q0e q0eVarA2 = r0e.a(0);
        this.L0 = q0eVarA2;
        this.M0 = new w7c(q0eVarA2);
        this.N0 = tu0.r(3, new j78(8));
        this.O0 = new Rect();
        this.P0 = new ArrayList();
        setId(xoc.X);
        setClipChildren(false);
        setClipToPadding(false);
        int iG2 = tu0.G(f3 * fk4.d().getDisplayMetrics().density);
        setPadding(iG2, iG2, iG2, iG2);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams4.gravity = 80;
        setLayoutParams(layoutParams4);
        addView(imageView);
        addView(qv8Var);
        addView(imageView2);
        imageView.setImageResource(woc.a1);
        int i8 = 1;
        qv8Var.setAccessibilityDelegate(new a07(i8, this));
        qv8Var.addTextChangedListener(new py4(i8, this));
        onThemeChanged(pq9Var.j(this));
    }

    public static LayerDrawable b(sv8 sv8Var) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{sv8Var.u0, sv8Var.getCheckDrawable()});
        float f = 4;
        layerDrawable.setLayerInset(1, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        return layerDrawable;
    }

    public static LayerDrawable c(sv8 sv8Var) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{sv8Var.u0, sv8Var.getArrowDrawable()});
        float f = 4;
        layerDrawable.setLayerInset(1, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        return layerDrawable;
    }

    private final Drawable getArrowDrawable() {
        return (Drawable) this.x0.getValue();
    }

    private final Drawable getCheckDrawable() {
        return (Drawable) this.z0.getValue();
    }

    private final LayerDrawable getCheckIcon() {
        return (LayerDrawable) this.A0.getValue();
    }

    private final Drawable getEmojiArrowDownDrawable() {
        return (Drawable) this.D0.getValue();
    }

    private final Drawable getEmojiArrowUpDrawable() {
        return (Drawable) this.C0.getValue();
    }

    private final InputFilter getEmptyFilter() {
        return (InputFilter) this.N0.getValue();
    }

    private final Drawable getMicIcon() {
        return (Drawable) this.B0.getValue();
    }

    private final LayerDrawable getSendIcon() {
        return (LayerDrawable) this.y0.getValue();
    }

    private final void setSendActionState(ov8 ov8Var) {
        this.I0 = ov8Var;
        k(qp4.u0.j(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVideoMsgButtonVisible(boolean z) {
        View view = this.v0;
        je7 je7Var = this.w0;
        if (z) {
            ay7.b(this, (View) je7Var.getValue(), Integer.valueOf(indexOfChild(view)));
            ((View) je7Var.getValue()).setVisibility(0);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(tu0.G(6 * fk4.d().getDisplayMetrics().density));
            view.setLayoutParams(marginLayoutParams);
            return;
        }
        if (je7Var.a()) {
            ((ImageView) je7Var.getValue()).setVisibility(8);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.setMarginStart(tu0.G(12 * fk4.d().getDisplayMetrics().density));
            view.setLayoutParams(marginLayoutParams2);
        }
    }

    @Override // defpackage.kx5
    public final void a(du4 du4Var) {
        addOnLayoutChangeListener(new hp1(this, 2, du4Var));
    }

    public final void e(boolean z) {
        this.H0 = z;
        qv8 qv8Var = this.c;
        if (z) {
            mr0.V(qv8Var);
        } else {
            mr0.I(qv8Var);
        }
    }

    public final void f(CharSequence charSequence) {
        qv8 qv8Var = this.c;
        Editable text = qv8Var.getText();
        if (text == null || charSequence == null) {
            setText(charSequence);
            return;
        }
        int selectionStart = qv8Var.getSelectionStart();
        int selectionEnd = qv8Var.getSelectionEnd();
        int iMax = Math.max(selectionStart, 0);
        int iMax2 = Math.max(selectionEnd, 0);
        int iMin = Math.min(iMax, iMax2);
        int iMax3 = Math.max(iMax, iMax2);
        if (selectionStart == -1 && selectionEnd == -1) {
            text.append(charSequence);
        } else {
            text.replace(iMin, iMax3, charSequence, 0, charSequence.length());
        }
    }

    public final boolean g() {
        Editable text = this.c.getText();
        return text == null || w9e.C0(text);
    }

    public final View getAudioRecordAnchor() {
        return this.v0;
    }

    public final int getCursorPosition() {
        return this.c.getSelectionEnd();
    }

    public final iv8 getEmojiExpandableState() {
        return this.E0;
    }

    public final j0e getMessagePosition() {
        return this.M0;
    }

    public final j0e getMessageState() {
        return this.K0;
    }

    public final ov8 getSendActionState() {
        return this.I0;
    }

    public final CharSequence getText() {
        Editable text = this.c.getText();
        if (text != null) {
            return text.subSequence(0, text.length());
        }
        return null;
    }

    public final View getVideoMessageRecordAnchor() {
        je7 je7Var = this.w0;
        if (br7.H(je7Var)) {
            return (View) je7Var.getValue();
        }
        return null;
    }

    public final void h(int i) {
        if (i == -1) {
            return;
        }
        qv8 qv8Var = this.c;
        qv8Var.setSelection(Math.min(i, qv8Var.length()));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            r5 = this;
            je7 r0 = r5.t0
            boolean r1 = r0.a()
            if (r1 != 0) goto L9
            return
        L9:
            qv8 r1 = r5.c
            android.text.Editable r1 = r1.getText()
            r2 = 0
            if (r1 == 0) goto L1c
            java.lang.String r3 = "\n"
            boolean r1 = defpackage.w9e.p0(r1, r3, r2)
            r3 = 1
            if (r1 != r3) goto L1c
            goto L1d
        L1c:
            r3 = r2
        L1d:
            boolean r1 = r5.g()
            szd r4 = defpackage.szd.b
            if (r1 == 0) goto L48
            boolean r1 = r5.F0
            if (r1 != 0) goto L48
            if (r3 == 0) goto L2c
            goto L48
        L2c:
            boolean r1 = r5.H0
            if (r1 == 0) goto L3c
            r5.H0 = r2
            java.lang.Object r5 = r0.getValue()
            uzd r5 = (defpackage.uzd) r5
            r5.setExpandableState(r4)
            goto L51
        L3c:
            java.lang.Object r5 = r0.getValue()
            uzd r5 = (defpackage.uzd) r5
            szd r0 = defpackage.szd.a
            r5.setExpandableState(r0)
            goto L51
        L48:
            java.lang.Object r5 = r0.getValue()
            uzd r5 = (defpackage.uzd) r5
            r5.setExpandableState(r4)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sv8.i():void");
    }

    public final void j() {
        je7 je7Var = this.s0;
        if (je7Var.a()) {
            ImageView imageView = (ImageView) je7Var.getValue();
            imageView.setImageTintList(ColorStateList.valueOf(qp4.u0.j(imageView).a().h().b.b));
        }
    }

    public final void k(fka fkaVar) {
        iv8 iv8Var;
        ov8 ov8Var = this.I0;
        boolean zG = g();
        nv8 nv8Var = nv8.a;
        ImageView imageView = this.v0;
        if (zG && tpa.f(ov8Var, nv8Var)) {
            ngg.G(getCheckDrawable(), fkaVar.d().b.a.b);
            imageView.setPadding(0, 0, 0, 0);
            imageView.setImageDrawable(getCheckIcon());
            imageView.setEnabled(false);
            setVideoMsgButtonVisible(false);
        } else {
            boolean zF = tpa.f(ov8Var, mv8.a);
            StateListDrawable stateListDrawable = this.u0;
            if (zF || tpa.f(ov8Var, nv8Var)) {
                stateListDrawable.setState(new int[]{R.attr.state_enabled});
                imageView.setPadding(0, 0, 0, 0);
                Drawable checkDrawable = getCheckDrawable();
                fkaVar.getIcon();
                ngg.G(checkDrawable, -1);
                imageView.setImageDrawable(getCheckIcon());
                imageView.setEnabled(true);
                setVideoMsgButtonVisible(false);
            } else {
                boolean zG2 = g();
                pq9 pq9Var = qp4.u0;
                if (zG2 && (iv8Var = this.E0) != iv8.a) {
                    Drawable emojiArrowDownDrawable = iv8Var == iv8.b ? getEmojiArrowDownDrawable() : getEmojiArrowUpDrawable();
                    imageView.setImageDrawable(emojiArrowDownDrawable);
                    ngg.G(emojiArrowDownDrawable, pq9Var.j(this).a().h().b.b);
                    setVideoMsgButtonVisible(false);
                } else if (g() && (ov8Var instanceof kv8)) {
                    ((kv8) ov8Var).getClass();
                    if (pv8.$EnumSwitchMapping$0[au1.s(1)] != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ngg.G(getMicIcon(), pq9Var.j(this).a().h().b.b);
                    if (imageView.getDrawable() == getMicIcon()) {
                        return;
                    }
                    imageView.setImageDrawable(getMicIcon());
                    imageView.setEnabled(true);
                    rh4.p(4, fk4.d().getDisplayMetrics().density, imageView);
                    je7 je7Var = this.w0;
                    if (je7Var.a()) {
                        bc7 bc7Var = Q0[0];
                        setVideoMsgButtonVisible(((Boolean) this.G0.b).booleanValue());
                    }
                } else {
                    if (imageView.getDrawable() != getSendIcon()) {
                        stateListDrawable.setState(new int[]{R.attr.state_enabled});
                        imageView.setImageDrawable(getSendIcon());
                        imageView.setPadding(0, 0, 0, 0);
                        imageView.setEnabled(true);
                    }
                    Drawable arrowDrawable = getArrowDrawable();
                    fkaVar.getIcon();
                    ngg.G(arrowDrawable, -1);
                    setVideoMsgButtonVisible(false);
                }
            }
        }
        i();
        imageView.invalidate();
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection == null) {
            return null;
        }
        String[] strArrD = zmf.d(this);
        if (strArrD == null || editorInfo == null) {
            return inputConnectionOnCreateInputConnection;
        }
        editorInfo.contentMimeTypes = strArrD;
        return new k17(inputConnectionOnCreateInputConnection, new z16(8, this));
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            ArrayList arrayList = this.P0;
            arrayList.clear();
            ImageView imageView = this.v0;
            float f = 12;
            int iC = rh4.c(f, fk4.d().getDisplayMetrics().density, imageView.getLeft());
            int iC2 = rh4.c(f, fk4.d().getDisplayMetrics().density, imageView.getTop());
            int iC3 = rh4.c(f, fk4.d().getDisplayMetrics().density, imageView.getRight());
            int iC4 = rh4.c(f, fk4.d().getDisplayMetrics().density, imageView.getBottom());
            Rect rect = this.O0;
            rect.set(iC, iC2, iC3, iC4);
            arrayList.add(rect);
            setSystemGestureExclusionRects(arrayList);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        TouchDelegate touchDelegate = getTouchDelegate();
        tc3 tc3Var = touchDelegate instanceof tc3 ? (tc3) touchDelegate : null;
        if (tc3Var != null) {
            tc3Var.a.clear();
        }
        float f = 10;
        ft.b(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(4 * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f), this, this.b);
        float f2 = 12;
        ft.b(0, tu0.G(fk4.d().getDisplayMetrics().density * f2), 0, tu0.G(f2 * fk4.d().getDisplayMetrics().density), this, this.c);
        float f3 = 6;
        ft.b(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f3), this, this.v0);
        je7 je7Var = this.s0;
        if (je7Var.a()) {
            ft.b(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f * fk4.d().getDisplayMetrics().density), this, (ImageView) je7Var.getValue());
        }
        je7 je7Var2 = this.w0;
        if (je7Var2.a()) {
            ft.b(tu0.G(f3 * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f3), this, (ImageView) je7Var2.getValue());
        }
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        pq9 pq9Var = qp4.u0;
        setBackgroundColor(pq9Var.j(this).a().h().a.d);
        this.b.setImageTintList(ColorStateList.valueOf(pq9Var.j(this).a().h().b.b));
        xoe text = fkaVar.getText();
        qv8 qv8Var = this.c;
        qv8Var.setTextColor(text.e);
        qv8Var.setHintTextColor(ote.b0(fkaVar.getText().i, 0.4f));
        qv8Var.setHighlightColor(fkaVar.getText().j);
        Drawable textCursorDrawable = qv8Var.getTextCursorDrawable();
        GradientDrawable gradientDrawable = textCursorDrawable instanceof GradientDrawable ? (GradientDrawable) textCursorDrawable : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(ColorStateList.valueOf(fkaVar.getText().j));
        }
        Editable text2 = qv8Var.getText();
        if (text2 != null) {
            for (Object obj : text2.getSpans(0, text2.length(), Object.class)) {
                if (obj instanceof qu8) {
                    ((qu8) obj).b = pq9Var.j(qv8Var).a().d(true).d.b;
                } else if (obj instanceof kre) {
                    ((kre) obj).onThemeChanged(fkaVar);
                }
            }
        }
        int[] iArr = {R.attr.state_enabled};
        StateListDrawable stateListDrawable = this.u0;
        ((GradientDrawable) stateListDrawable.getStateDrawable(stateListDrawable.findStateDrawableIndex(iArr))).setColor(fkaVar.b().a.m);
        ((GradientDrawable) stateListDrawable.getStateDrawable(stateListDrawable.findStateDrawableIndex(new int[]{-16842910}))).setColor(fkaVar.d().a.b.l);
        k(fkaVar);
        j();
        invalidate();
    }

    public final void setCustomSelectionActionModeCallback(m56 m56Var) {
        qv8 qv8Var = this.c;
        qv8Var.setCustomSelectionActionModeCallback((ActionMode.Callback) m56Var.invoke(qv8Var));
    }

    public final void setEmojiExpandableState(iv8 iv8Var) {
        this.E0 = iv8Var;
        k(qp4.u0.j(this));
    }

    public final void setInputEnabled(boolean z) {
        qv8 qv8Var = this.c;
        if (z) {
            qv8Var.setFilters(new InputFilter[0]);
        } else {
            qv8Var.setFilters(new InputFilter[]{getEmptyFilter()});
        }
    }

    public final void setInputHint(CharSequence charSequence) {
        this.c.setHint(charSequence);
    }

    public final void setInputKeyListener(View.OnKeyListener onKeyListener) {
        this.c.setOnKeyListener(onKeyListener);
    }

    public final void setKeyboardVisible(boolean z) {
        this.F0 = z;
        i();
    }

    public final void setLeftIcon(int i) {
        this.b.setImageResource(i);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void setLeftInnerIconTouchListener(View.OnTouchListener onTouchListener) {
        this.b.setOnTouchListener(onTouchListener);
    }

    public final void setLeftOuterIconOnClickListener(k56 k56Var) {
        tu0.K((View) this.t0.getValue(), 300L, new m6(15, k56Var));
    }

    public final void setLeftOuterIconText(CharSequence charSequence) {
        je7 je7Var = this.t0;
        ay7.b(this, (View) je7Var.getValue(), 0);
        ((uzd) je7Var.getValue()).setText(charSequence);
    }

    public final void setLeftOuterIconVisible(boolean z) {
        je7 je7Var = this.t0;
        if (z) {
            ay7.b(this, (View) je7Var.getValue(), 0);
        } else if (je7Var.a()) {
            removeView((View) je7Var.getValue());
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void setRightInnerIconTouchListener(View.OnTouchListener onTouchListener) {
        je7 je7Var = this.s0;
        if (onTouchListener != null) {
            ((ImageView) je7Var.getValue()).setOnTouchListener(onTouchListener);
        } else if (je7Var.a()) {
            ((ImageView) je7Var.getValue()).setOnTouchListener(null);
        }
    }

    public final void setRightInnerIconVisible(boolean z) {
        je7 je7Var = this.s0;
        if (z) {
            ay7.b(this, (View) je7Var.getValue(), Integer.valueOf(indexOfChild(this.c) + 1));
            j();
        } else if (je7Var.a()) {
            removeView((View) je7Var.getValue());
        }
    }

    public final void setRightOuterIconActionState(ov8 ov8Var) {
        setSendActionState(ov8Var);
    }

    public final void setRightOuterIconEnabled(boolean z) {
        this.v0.setEnabled(z);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void setRightOuterIconTouchListener(View.OnTouchListener onTouchListener) {
        this.v0.setOnTouchListener(onTouchListener);
    }

    public final void setText(CharSequence charSequence) {
        qv8 qv8Var = this.c;
        if (charSequence != null) {
            qv8Var.setText(charSequence);
            return;
        }
        Editable text = qv8Var.getText();
        if (text != null) {
            text.clear();
        }
    }

    public final void setVideoMessageEnabled(boolean z) {
        this.G0.o1(this, Q0[0], Boolean.valueOf(z));
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void setVideoMessageTouchListener(View.OnTouchListener onTouchListener) {
        je7 je7Var = this.w0;
        if (onTouchListener != null) {
            ((ImageView) je7Var.getValue()).setOnTouchListener(onTouchListener);
        } else if (je7Var.a()) {
            ((ImageView) je7Var.getValue()).setOnTouchListener(null);
        }
    }

    public final void setInputHint(int i) {
        this.c.setHint(i);
    }
}
