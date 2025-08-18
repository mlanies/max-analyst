package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.widget.a;
import defpackage.a4f;
import defpackage.au1;
import defpackage.c54;
import defpackage.gse;
import defpackage.in;
import defpackage.io;
import defpackage.jo;
import defpackage.kj6;
import defpackage.ko;
import defpackage.lo;
import defpackage.nqe;
import defpackage.oqe;
import defpackage.pqe;
import defpackage.s36;
import defpackage.vue;
import defpackage.ww4;
import defpackage.x8;
import defpackage.y6b;
import defpackage.z6b;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class AppCompatTextView extends TextView implements ww4 {
    public final x8 a;
    public final io b;
    public in c;
    public boolean o;
    public ko s0;
    public Future t0;

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private in getEmojiTextViewHelper() {
        if (this.c == null) {
            this.c = new in(this);
        }
        return this.c;
    }

    @Override // defpackage.ww4
    public final boolean a() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        x8 x8Var = this.a;
        if (x8Var != null) {
            x8Var.i();
        }
        io ioVar = this.b;
        if (ioVar != null) {
            ioVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return a.b(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public jo getSuperCaller() {
        if (this.s0 == null) {
            if (Build.VERSION.SDK_INT >= 34) {
                this.s0 = new lo(this);
            } else {
                this.s0 = new ko(this);
            }
        }
        return this.s0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        x8 x8Var = this.a;
        if (x8Var != null) {
            return x8Var.B();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        x8 x8Var = this.a;
        if (x8Var != null) {
            return x8Var.C();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        i();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    public y6b getTextMetricsParamsCompat() {
        return new y6b(oqe.c(this));
    }

    public final void i() {
        Future future = this.t0;
        if (future == null) {
            return;
        }
        try {
            this.t0 = null;
            au1.r(future.get());
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        io.h(this, inputConnectionOnCreateInputConnection, editorInfo);
        c54.V(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        io ioVar = this.b;
        if (ioVar != null) {
            ioVar.getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        i();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        super.setAutoSizeTextTypeWithDefaults(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        x8 x8Var = this.a;
        if (x8Var != null) {
            x8Var.H();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        x8 x8Var = this.a;
        if (x8Var != null) {
            x8Var.I(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        io ioVar = this.b;
        if (ioVar != null) {
            ioVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        io ioVar = this.b;
        if (ioVar != null) {
            ioVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        io ioVar = this.b;
        if (ioVar != null) {
            ioVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        io ioVar = this.b;
        if (ioVar != null) {
            ioVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // defpackage.ww4
    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        getSuperCaller().C1(i);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        getSuperCaller().q1(i);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        a.a(this, i);
    }

    public void setPrecomputedText(z6b z6bVar) {
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        x8 x8Var = this.a;
        if (x8Var != null) {
            x8Var.O(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        x8 x8Var = this.a;
        if (x8Var != null) {
            x8Var.P(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        io ioVar = this.b;
        ioVar.i(colorStateList);
        ioVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        io ioVar = this.b;
        ioVar.j(mode);
        ioVar.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        io ioVar = this.b;
        if (ioVar != null) {
            ioVar.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    public void setTextFuture(Future<z6b> future) {
        this.t0 = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(y6b y6bVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = y6bVar.b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(y6bVar.a);
        nqe.e(this, y6bVar.c);
        nqe.h(this, y6bVar.d);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.o) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            kj6 kj6Var = a4f.a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.o = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.o = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        vue.a(context);
        this.o = false;
        this.s0 = null;
        gse.a(getContext(), this);
        x8 x8Var = new x8(this);
        this.a = x8Var;
        x8Var.E(attributeSet, i);
        io ioVar = new io(this);
        this.b = ioVar;
        ioVar.f(attributeSet, i);
        ioVar.b();
        getEmojiTextViewHelper().c(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().G1(i, f);
        } else if (i2 >= 34) {
            pqe.a(this, i, f);
        } else {
            a.a(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? s36.n(context, i) : null, i2 != 0 ? s36.n(context, i2) : null, i3 != 0 ? s36.n(context, i3) : null, i4 != 0 ? s36.n(context, i4) : null);
        io ioVar = this.b;
        if (ioVar != null) {
            ioVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? s36.n(context, i) : null, i2 != 0 ? s36.n(context, i2) : null, i3 != 0 ? s36.n(context, i3) : null, i4 != 0 ? s36.n(context, i4) : null);
        io ioVar = this.b;
        if (ioVar != null) {
            ioVar.b();
        }
    }
}
